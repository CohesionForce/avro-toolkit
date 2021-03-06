/**
 * generated by Xtext 2.19.0
 */
package com.cohesionforce.avro.avroSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.avro.avroSchema.FieldList#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.avro.avroSchema.AvroSchemaPackage#getFieldList()
 * @model
 * @generated
 */
public interface FieldList extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.cohesionforce.avro.avroSchema.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.cohesionforce.avro.avroSchema.AvroSchemaPackage#getFieldList_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // FieldList
