/**
 * generated by Xtext 2.19.0
 */
package com.cohesionforce.avro.avroSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.avro.avroSchema.JsonType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.avro.avroSchema.AvroSchemaPackage#getJsonType()
 * @model
 * @generated
 */
public interface JsonType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Primitive)
   * @see com.cohesionforce.avro.avroSchema.AvroSchemaPackage#getJsonType_Type()
   * @model containment="true"
   * @generated
   */
  Primitive getType();

  /**
   * Sets the value of the '{@link com.cohesionforce.avro.avroSchema.JsonType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Primitive value);

} // JsonType
