/*
 * generated by Xtext 2.19.0
 */
package com.cohesionforce.avro.serializer;

import com.cohesionforce.avro.avroSchema.ArrayType;
import com.cohesionforce.avro.avroSchema.AvroSchema;
import com.cohesionforce.avro.avroSchema.AvroSchemaPackage;
import com.cohesionforce.avro.avroSchema.EnumType;
import com.cohesionforce.avro.avroSchema.Field;
import com.cohesionforce.avro.avroSchema.FieldList;
import com.cohesionforce.avro.avroSchema.FixedType;
import com.cohesionforce.avro.avroSchema.JsonType;
import com.cohesionforce.avro.avroSchema.MapType;
import com.cohesionforce.avro.avroSchema.Primitive;
import com.cohesionforce.avro.avroSchema.Record;
import com.cohesionforce.avro.avroSchema.UnionMember;
import com.cohesionforce.avro.avroSchema.UnionType;
import com.cohesionforce.avro.services.AvroSchemaGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AvroSchemaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AvroSchemaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AvroSchemaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AvroSchemaPackage.ARRAY_TYPE:
				sequence_ArrayType(context, (ArrayType) semanticObject); 
				return; 
			case AvroSchemaPackage.AVRO_SCHEMA:
				sequence_AvroSchema(context, (AvroSchema) semanticObject); 
				return; 
			case AvroSchemaPackage.ENUM_TYPE:
				sequence_EnumType(context, (EnumType) semanticObject); 
				return; 
			case AvroSchemaPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case AvroSchemaPackage.FIELD_LIST:
				sequence_FieldList(context, (FieldList) semanticObject); 
				return; 
			case AvroSchemaPackage.FIXED_TYPE:
				sequence_FixedType(context, (FixedType) semanticObject); 
				return; 
			case AvroSchemaPackage.JSON_TYPE:
				sequence_JsonType(context, (JsonType) semanticObject); 
				return; 
			case AvroSchemaPackage.MAP_TYPE:
				sequence_MapType(context, (MapType) semanticObject); 
				return; 
			case AvroSchemaPackage.PRIMITIVE:
				sequence_Primitive(context, (Primitive) semanticObject); 
				return; 
			case AvroSchemaPackage.RECORD:
				sequence_RecordType(context, (Record) semanticObject); 
				return; 
			case AvroSchemaPackage.UNION_MEMBER:
				sequence_UnionMember(context, (UnionMember) semanticObject); 
				return; 
			case AvroSchemaPackage.UNION_TYPE:
				sequence_UnionType(context, (UnionType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     UnionMember returns ArrayType
	 *     ArrayType returns ArrayType
	 *
	 * Constraint:
	 *     (primitive=Primitive | record=RecordType | recordRef=[Record|ID] | etype=EnumType)
	 */
	protected void sequence_ArrayType(ISerializationContext context, ArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AvroSchema returns AvroSchema
	 *
	 * Constraint:
	 *     (types+=JsonType | types+=RecordType | types+=UnionType)
	 */
	protected void sequence_AvroSchema(ISerializationContext context, AvroSchema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnionMember returns EnumType
	 *     EnumType returns EnumType
	 *
	 * Constraint:
	 *     (name=ID symbols+=ID symbols+=ID*)
	 */
	protected void sequence_EnumType(ISerializationContext context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FieldList returns FieldList
	 *
	 * Constraint:
	 *     (fields+=Field fields+=Field*)
	 */
	protected void sequence_FieldList(ISerializationContext context, FieldList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (
	 *         (name='name' | name=ID) 
	 *         (
	 *             primitive=Primitive | 
	 *             record=RecordType | 
	 *             recordRef=[Record|ID] | 
	 *             etype=EnumType | 
	 *             array=ArrayType | 
	 *             map=MapType | 
	 *             fixed=FixedType | 
	 *             union=UnionType
	 *         )
	 *     )
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnionMember returns FixedType
	 *     FixedType returns FixedType
	 *
	 * Constraint:
	 *     (name=ID size=INT)
	 */
	protected void sequence_FixedType(ISerializationContext context, FixedType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonType returns JsonType
	 *
	 * Constraint:
	 *     type=Primitive
	 */
	protected void sequence_JsonType(ISerializationContext context, JsonType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AvroSchemaPackage.Literals.JSON_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AvroSchemaPackage.Literals.JSON_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UnionMember returns MapType
	 *     MapType returns MapType
	 *
	 * Constraint:
	 *     (primitive=Primitive | record=RecordType | recordRef=[Record|ID] | etype=EnumType | atype=ArrayType)
	 */
	protected void sequence_MapType(ISerializationContext context, MapType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnionMember returns Primitive
	 *     Primitive returns Primitive
	 *
	 * Constraint:
	 *     (
	 *         type='null' | 
	 *         type='boolean' | 
	 *         type='int' | 
	 *         type='long' | 
	 *         type='float' | 
	 *         type='double' | 
	 *         type='bytes' | 
	 *         type='string'
	 *     )
	 */
	protected void sequence_Primitive(ISerializationContext context, Primitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnionMember returns Record
	 *     RecordType returns Record
	 *
	 * Constraint:
	 *     (name=ID namespace=Namespace? fieldList=FieldList)
	 */
	protected void sequence_RecordType(ISerializationContext context, Record semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnionMember returns UnionMember
	 *
	 * Constraint:
	 *     recordRef=[Record|ID]
	 */
	protected void sequence_UnionMember(ISerializationContext context, UnionMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AvroSchemaPackage.Literals.UNION_MEMBER__RECORD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AvroSchemaPackage.Literals.UNION_MEMBER__RECORD_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnionMemberAccess().getRecordRefRecordIDTerminalRuleCall_6_1_0_1(), semanticObject.eGet(AvroSchemaPackage.Literals.UNION_MEMBER__RECORD_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UnionType returns UnionType
	 *
	 * Constraint:
	 *     (types+=UnionMember types+=UnionMember*)
	 */
	protected void sequence_UnionType(ISerializationContext context, UnionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
