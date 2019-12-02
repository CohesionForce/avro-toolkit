/**
 * Copyright (c) 2015 CohesionForce, Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     CohesionForce, Inc - initial API and implementation
 */
package com.cohesionforce.avro.gen;

import com.cohesionforce.avro.gen.Utility;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * The AvroSchemaGenerator generates Avro Schemas for classes defined in
 *  an EPackage.  It also adds reception and source timestamp information
 *  for logging.
 */
@SuppressWarnings("all")
public class AvroSchemaGenerator {
  private IFileSystemAccess fileAccess;
  
  private List<EClass> classes = new ArrayList<EClass>();
  
  private List<EEnum> enums = new ArrayList<EEnum>();
  
  /**
   * Adds a class to the list of visited classes and returns
   * true if the class did NOT exist in the list.
   */
  public boolean addClass(final EClass eclass) {
    boolean _contains = this.classes.contains(eclass);
    if (_contains) {
      return false;
    }
    this.classes.add(eclass);
    return true;
  }
  
  /**
   * Adds an enumeration to the list of visited enumerations and returns
   * true if the class did NOT exist in the list.
   */
  public boolean addEnum(final EEnum eenum) {
    boolean _contains = this.enums.contains(eenum);
    if (_contains) {
      return false;
    }
    this.enums.add(eenum);
    return true;
  }
  
  public void generateAvroSchema(final GenModel genModel, final IFileSystemAccess fileAccess) {
    if ((genModel == null)) {
      System.err.println("Cannot generate from a null model");
      return;
    }
    if ((fileAccess == null)) {
      System.err.println("Cannot generate null fileAccess");
      return;
    }
    EList<GenPackage> _genPackages = genModel.getGenPackages();
    for (final GenPackage genPackage : _genPackages) {
      {
        String basePackage = genPackage.getBasePackage();
        if ((basePackage == null)) {
          basePackage = "";
          Utility.setBasePackage("");
        } else {
          Utility.setBasePackage(basePackage);
        }
        String _prefix = genPackage.getPrefix();
        boolean _tripleEquals = (_prefix == null);
        if (_tripleEquals) {
          System.err.println("Cannot generate null prefix");
          return;
        }
        String _prefix_1 = genPackage.getPrefix();
        String _plus = (_prefix_1 + "Factory");
        Utility.setFactory(_plus);
        String _prefix_2 = genPackage.getPrefix();
        String _plus_1 = (_prefix_2 + "Package");
        Utility.setPackage(_plus_1);
        this.generateAvroSchema(genPackage.getEcorePackage(), basePackage, fileAccess);
      }
    }
  }
  
  public void generateAvroSchema(final Resource resource, final String basePath, final IFileSystemAccess fileAccess) {
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(resource.getContents(), EPackage.class);
    for (final EPackage epackage : _filter) {
      this.generateAvroSchema(epackage, basePath, fileAccess);
    }
  }
  
  /**
   * Generates an Avro Schema file for each class in a package.
   */
  public void generateAvroSchema(final EPackage anEPackage, final String basePath, final IFileSystemAccess fsa) {
    Iterable<EClass> _filter = Iterables.<EClass>filter(anEPackage.getEClassifiers(), EClass.class);
    for (final EClass eclass : _filter) {
      this.generateSchema(eclass, basePath.concat(".").concat(anEPackage.getName()), fsa);
    }
    EList<EPackage> _eSubpackages = anEPackage.getESubpackages();
    for (final EPackage subPackage : _eSubpackages) {
      this.generateAvroSchema(subPackage, basePath.concat(StringExtensions.toFirstLower(subPackage.getName())), fsa);
    }
  }
  
  /**
   * Generates an Avro Schema file for an EClass.
   */
  public void generateSchema(final EClass anEClass, final String basePackage, final IFileSystemAccess fsa) {
    this.classes.clear();
    this.enums.clear();
    this.classes.add(anEClass);
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("{\"type\":\"record\",\"name\":\"");
    String _name = anEClass.getName();
    _builder.append(_name);
    _builder.append("\",\"namespace\":\"");
    String _concat = basePackage.concat(".avro");
    _builder.append(_concat);
    _builder.append("\",\"fields\":[");
    _builder.newLineIfNotEmpty();
    {
      boolean _endsWith = anEClass.getName().endsWith("Pdu");
      if (_endsWith) {
        _builder.append("\t");
        _builder.append("{\"name\":\"reception_timestamp\",\"type\":[\"null\",");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("{\"type\":\"record\",\"name\":\"Time_t\",\"fields\":[");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("{\"name\":\"sec\",\"type\":\"int\"},");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("{\"name\":\"nanosec\",\"type\":\"int\"}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("]}]},");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("{\"name\":\"source_timestamp\",\"type\":[\"null\",\"Time_t\"]},");
        _builder.newLine();
      }
    }
    {
      final Function1<EStructuralFeature, Boolean> _function = (EStructuralFeature feature) -> {
        String _name_1 = feature.getEType().getName();
        return Boolean.valueOf((!Objects.equal(_name_1, "EFeatureMapEntry")));
      };
      Iterable<EStructuralFeature> _filter = IterableExtensions.<EStructuralFeature>filter(anEClass.getEAllStructuralFeatures(), _function);
      boolean _hasElements = false;
      for(final EStructuralFeature aFeature : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        CharSequence _generateFeature = this.generateFeature(aFeature);
        _builder.append(_generateFeature, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("]}");
    _builder.newLine();
    String contents = _builder.toString();
    String _name_1 = anEClass.getName();
    String _plus = (_name_1 + ".avsc");
    fsa.generateFile(_plus, contents);
  }
  
  /**
   * Generates a property in the schema for a feature.
   */
  public CharSequence generateFeature(final EStructuralFeature aFeature) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _upperBound = aFeature.getUpperBound();
      boolean _notEquals = (_upperBound != 1);
      if (_notEquals) {
        _builder.append("{\"name\":\"");
        String _name = aFeature.getName();
        _builder.append(_name);
        _builder.append("\",\"type\":[\"null\",");
        CharSequence _generateArray = this.generateArray(aFeature);
        _builder.append(_generateArray);
        _builder.append("]}");
        _builder.newLineIfNotEmpty();
      } else {
        if ((aFeature instanceof EAttribute)) {
          CharSequence _generateAttribute = this.generateAttribute(((EAttribute) aFeature));
          _builder.append(_generateAttribute);
          _builder.newLineIfNotEmpty();
        } else {
          CharSequence _generateReference = this.generateReference(((EReference) aFeature));
          _builder.append(_generateReference);
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  /**
   * Generates an array property in a schema based on a feature with upperBound > 1.
   */
  public CharSequence generateArray(final EStructuralFeature aFeature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{\"type\":\"array\",\"items\":");
    _builder.newLine();
    {
      if ((aFeature instanceof EAttribute)) {
        _builder.append("\"");
        String _printAvroType = this.printAvroType(((EAttribute)aFeature).getEType());
        _builder.append(_printAvroType);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      } else {
        if (((aFeature instanceof EReference) && (!((EReference) aFeature).isContainment()))) {
          _builder.append("\"string\"");
          _builder.newLine();
        } else {
          {
            if (((aFeature instanceof EReference) && this.addClass(((EReference) aFeature).getEReferenceType()))) {
              CharSequence _generateRecord = this.generateRecord(((EReference) aFeature).getEReferenceType());
              _builder.append(_generateRecord);
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\"");
              String _name = aFeature.getEType().getName();
              _builder.append(_name);
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Returns the avro type for a given EClassifier.
   */
  public String printAvroType(final EClassifier eClass) {
    String _name = eClass.getName();
    if (_name != null) {
      switch (_name) {
        case "EInt":
          return "int";
        case "EShort":
          return "int";
        case "ELong":
          return "long";
        case "EDouble":
          return "double";
        case "EFloat":
          return "float";
        case "EString":
          return "string";
        case "EBoolean":
          return "boolean";
        case "EDate":
          return "string";
        case "EChar":
          return "int";
        case "EByte":
          return "int";
        case "UShort":
          return "int";
        case "UByte":
          return "int";
        case "UInt":
          return "long";
        case "ULong":
          return "long";
        case "String":
          return "string";
        case "EJavaClass":
          return "string";
        case "EJavaObject":
          return "string";
        case "EEnumerator":
          return "string";
        default:
          return eClass.getName();
      }
    } else {
      return eClass.getName();
    }
  }
  
  /**
   * Generates a schema property based on an EAttribute
   */
  public CharSequence generateAttribute(final EAttribute anAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EClassifier _eType = anAttribute.getEType();
      if ((_eType instanceof EEnum)) {
        _builder.append("{\"name\":\"");
        String _name = anAttribute.getName();
        _builder.append(_name);
        _builder.append("\",\"type\":");
        EClassifier _eType_1 = anAttribute.getEType();
        CharSequence _generateEnum = this.generateEnum(((EEnum) _eType_1));
        _builder.append(_generateEnum);
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      } else {
        {
          if ((Objects.equal(anAttribute.getEType().getName(), "EString") || Objects.equal(anAttribute.getEType().getName(), "EDate"))) {
            _builder.append("{\"name\":\"");
            String _name_1 = anAttribute.getName();
            _builder.append(_name_1);
            _builder.append("\",\"type\":[\"null\",\"");
            String _printAvroType = this.printAvroType(anAttribute.getEType());
            _builder.append(_printAvroType);
            _builder.append("\"]}");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("{\"name\":\"");
            String _name_2 = anAttribute.getName();
            _builder.append(_name_2);
            _builder.append("\",\"type\":\"");
            String _printAvroType_1 = this.printAvroType(anAttribute.getEType());
            _builder.append(_printAvroType_1);
            _builder.append("\"}");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Generates a schema property based on an EReference.  Either creates a new
   * record type, or references an existing record type.
   */
  public CharSequence generateReference(final EReference aReference) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isContainment = aReference.isContainment();
      boolean _not = (!_isContainment);
      if (_not) {
        _builder.append("{\"name\":\"");
        String _name = aReference.getName();
        _builder.append(_name);
        _builder.append("\",\"type\":[\"null\",\"string\"]}");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _addClass = this.addClass(aReference.getEReferenceType());
        if (_addClass) {
          _builder.append("{\"name\":\"");
          String _name_1 = aReference.getName();
          _builder.append(_name_1);
          _builder.append("\",\"type\":[\"null\",");
          CharSequence _generateRecord = this.generateRecord(aReference.getEReferenceType());
          _builder.append(_generateRecord);
          _builder.append("]}");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("{\"name\":\"");
          String _name_2 = aReference.getName();
          _builder.append(_name_2);
          _builder.append("\",\"type\":[\"null\",\"");
          String _name_3 = aReference.getEType().getName();
          _builder.append(_name_3);
          _builder.append("\"]}");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  /**
   * Generates a new record type based on an EClass
   */
  public CharSequence generateRecord(final EClass anEClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{\"type\":\"record\",\"name\":\"");
    String _name = anEClass.getName();
    _builder.append(_name);
    _builder.append("\",\"fields\":[");
    _builder.newLineIfNotEmpty();
    {
      boolean _endsWith = anEClass.getName().endsWith("Topic");
      if (_endsWith) {
        _builder.append("{\"name\":\"reception_timestamp\",\"type\":[\"null\",\"Time_t\"]},");
        _builder.newLine();
        _builder.append("{\"name\":\"source_timestamp\",\"type\":[\"null\",\"Time_t\"]},");
        _builder.newLine();
      }
    }
    {
      EList<EStructuralFeature> _eAllStructuralFeatures = anEClass.getEAllStructuralFeatures();
      boolean _hasElements = false;
      for(final EStructuralFeature aFeature : _eAllStructuralFeatures) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _generateFeature = this.generateFeature(aFeature);
        _builder.append(_generateFeature);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
      }
    }
    _builder.append("]}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates a schema property based on an EEnum.  Either creates a new
   * enumeration type, or references an existing enumeration type.
   */
  public CharSequence generateEnum(final EEnum eEnum) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _addEnum = this.addEnum(eEnum);
      if (_addEnum) {
        _builder.append("{\"type\":\"enum\",\"name\":\"");
        String _name = eEnum.getName();
        _builder.append(_name);
        _builder.append("\",\"symbols\":[");
        {
          EList<EEnumLiteral> _eLiterals = eEnum.getELiterals();
          boolean _hasElements = false;
          for(final EEnumLiteral eLiteral : _eLiterals) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("\"");
            String _name_1 = eLiteral.getName();
            _builder.append(_name_1);
            _builder.append("\"");
          }
        }
        _builder.append("]}");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\"");
        String _name_2 = eEnum.getName();
        _builder.append(_name_2);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
