/*******************************************************************************
 * Copyright (c) 2015 CohesionForce, Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     CohesionForce, Inc - initial API and implementation
 *******************************************************************************/
package com.cohesionforce.avro.gen

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage

/**
 * The AvroSchemaGenerator generates Avro Schemas for classes defined in
 *  an EPackage.  It also adds reception and source timestamp information
 *  for logging.
 */
class AvroSchemaGenerator {

	// List of Classes already visited for a given parent Class.
	var List<EClass> classes = new ArrayList<EClass>();

	// List of Enumerations already visited for a given parent Class.
	var List<EEnum> enums = new ArrayList<EEnum>();

	/**
	 * Adds a class to the list of visited classes and returns
	 * true if the class did NOT exist in the list.
	 */
	def boolean addClass(EClass eclass) {
		if (classes.contains(eclass)) {
			return false
		}
		classes.add(eclass)
		return true
	}

	/**
	 * Adds an enumeration to the list of visited enumerations and returns
	 * true if the class did NOT exist in the list.
	 */
	def boolean addEnum(EEnum eenum) {
		if (enums.contains(eenum)) {
			return false
		}
		enums.add(eenum)
		return true
	}

	def void generateAvroSchema(GenModel genModel, FileGenerator fileAccess) {
		if(genModel === null)
		{
			System.err.println('Cannot generate from a null model');
			return;
		}
		if(fileAccess === null)
		{
			System.err.println('Cannot generate null fileAccess');
			return;
		}
		for (GenPackage genPackage : genModel.getGenPackages()) {
			var basePackage = genPackage.basePackage;
			if(basePackage === null)
			{
				basePackage = '';
				Utility.setBasePackage('');
			}
			else
			{
				Utility.setBasePackage(basePackage);
			}
			if(genPackage.prefix === null)
			{
				System.err.println('Cannot generate null prefix');
				return;
			}
			Utility.setFactory(genPackage.getPrefix() + "Factory");
			Utility.setPackage(genPackage.getPrefix() + "Package");
			generateAvroSchema(genPackage.getEcorePackage(), basePackage, fileAccess);
		}
	}

	def void generateAvroSchema(Resource resource, String basePath, FileGenerator fileAccess) {
		// The rest of the generators need to run against each package in the resource
		for (EPackage epackage : resource.contents.filter(typeof(EPackage))) {
			generateAvroSchema(epackage, basePath, fileAccess)
		}
	}

	/**
	 * Generates an Avro Schema file for each class in a package.
	 */
	def void generateAvroSchema(EPackage anEPackage, String basePath, FileGenerator fsa) {
		for (eclass : anEPackage.EClassifiers.filter(typeof(EClass))) {
			generateSchema(eclass, basePath.concat('.').concat(anEPackage.name), fsa)
		}
		for (subPackage : anEPackage.ESubpackages) {
			generateAvroSchema(subPackage, basePath.concat(subPackage.name.toFirstLower), fsa);
		}
	}

	/**
	 * Generates an Avro Schema file for an EClass.
	 */
	def generateSchema(EClass anEClass, String basePackage, FileGenerator fsa) {

		classes.clear;
		enums.clear;
		classes.add(anEClass)
		
		var contents = '''
			
			{"type":"record","name":"«anEClass.name»","namespace":"«basePackage.concat('.avro')»","fields":[
				«IF anEClass.name.endsWith("Pdu")»
					{"name":"reception_timestamp","type":["null",
						{"type":"record","name":"Time_t","fields":[
							{"name":"sec","type":"int"},
							{"name":"nanosec","type":"int"}
						]}]},
					{"name":"source_timestamp","type":["null","Time_t"]},
				«ENDIF»
				«FOR aFeature : anEClass.getEAllStructuralFeatures.filter(feature | feature.EType.name != 'EFeatureMapEntry') SEPARATOR ","»
					«aFeature.generateFeature()»
				«ENDFOR»
			]}
		'''
		
		fsa.generateFile(anEClass.name + ".avsc", contents)
	}

	/**
	 * Generates a property in the schema for a feature.
	 */
	def CharSequence generateFeature(EStructuralFeature aFeature) {
		'''
			«IF aFeature.upperBound != 1»
				{"name":"«aFeature.name»","type":["null",«aFeature.generateArray()»]}
			«ELSEIF aFeature instanceof EAttribute»
				«(aFeature as EAttribute).generateAttribute()»
			«ELSE»
				«(aFeature as EReference).generateReference()»
			«ENDIF»
		'''
	}

	/**
	 * Generates an array property in a schema based on a feature with upperBound > 1.
	 */
	def generateArray(EStructuralFeature aFeature) {
		'''
			{"type":"array","items":
			«IF aFeature instanceof EAttribute»
				"«aFeature.getEType.printAvroType()»"
			«ELSEIF aFeature instanceof EReference && !(aFeature as EReference).containment»
				"string"
			«ELSE»			
				«IF aFeature instanceof EReference && addClass((aFeature as EReference).getEReferenceType) »
					«(aFeature as EReference).getEReferenceType.generateRecord()»
				«ELSE»
					"«aFeature.getEType.name»"
				«ENDIF»
			«ENDIF»
			}
		'''
	}

	/**
	 * Returns the avro type for a given EClassifier.
	 */
	def printAvroType(EClassifier eClass) {
		switch eClass.name {
			case "EInt": return "int"
			case "EShort": return "int"
			case "ELong": return "long"
			case "EDouble": return "double"
			case "EFloat": return "float"
			case "EString": return "string"
			case "EBoolean": return "boolean"
			case "EDate": return "string"
			case "EChar": return "int"
			case "EByte": return "int"
			case "UShort": return "int"
			case "UByte": return "int"
			case "UInt": return "long"
			case "ULong": return "long"
			case "String": return "string"
			case "EJavaClass": return "string"
			case "EJavaObject": return "string"
			case "EEnumerator": return "string"
			default: return eClass.name
		}
	}

	/**
	 * Generates a schema property based on an EAttribute
	 */
	def generateAttribute(EAttribute anAttribute) {
		'''
			«IF anAttribute.getEType instanceof EEnum»
				{"name":"«anAttribute.name»","type":«(anAttribute.getEType as EEnum).generateEnum»}
			«ELSE»
				«IF anAttribute.getEType.name == "EString" || anAttribute.getEType.name == "EDate"»
					{"name":"«anAttribute.name»","type":["null","«anAttribute.getEType.printAvroType»"]}
				«ELSE»
					{"name":"«anAttribute.name»","type":"«anAttribute.getEType.printAvroType»"}
				«ENDIF»
			«ENDIF»
		'''
	}

	/**
	 * Generates a schema property based on an EReference.  Either creates a new
	 * record type, or references an existing record type.
	 */
	def generateReference(EReference aReference) {
		'''
			«IF !aReference.containment»
				{"name":"«aReference.name»","type":["null","string"]}
			«ELSEIF addClass(aReference.getEReferenceType)»
				{"name":"«aReference.name»","type":["null",«aReference.getEReferenceType.generateRecord»]}
			«ELSE»
				{"name":"«aReference.name»","type":["null","«aReference.getEType.name»"]}
			«ENDIF»
		'''
	}

	/**
	 * Generates a new record type based on an EClass
	 */
	def generateRecord(EClass anEClass) {
		'''
			{"type":"record","name":"«anEClass.name»","fields":[
			«IF anEClass.name.endsWith("Topic")»
				{"name":"reception_timestamp","type":["null","Time_t"]},
				{"name":"source_timestamp","type":["null","Time_t"]},
			«ENDIF»
			«FOR aFeature : anEClass.getEAllStructuralFeatures SEPARATOR ","»
				«aFeature.generateFeature»
			«ENDFOR»]}
		'''
	}

	/**
	 * Generates a schema property based on an EEnum.  Either creates a new
	 * enumeration type, or references an existing enumeration type.
	 */
	def generateEnum(EEnum eEnum) {
		'''
			«IF addEnum(eEnum)»
				{"type":"enum","name":"«eEnum.name»","symbols":[«FOR eLiteral: eEnum.getELiterals SEPARATOR ","»"«eLiteral.name»"«ENDFOR»]}
			«ELSE»
				"«eEnum.name»"
			«ENDIF»
		'''
	}

}
