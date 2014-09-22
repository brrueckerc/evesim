/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Update Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.msg.EveUpdateMessage#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.evesim.msg.EveUpdateMessage#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link org.evesim.msg.EveUpdateMessage#getNewValue <em>New Value</em>}</li>
 *   <li>{@link org.evesim.msg.EveUpdateMessage#getFeatureID <em>Feature ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.msg.MsgPackage#getEveUpdateMessage()
 * @model
 * @generated
 */
public interface EveUpdateMessage extends EveMessage {

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.evesim.msg.MsgPackage#getEveUpdateMessage_AttributeName()
	 * @model
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveUpdateMessage#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(Object)
	 * @see org.evesim.msg.MsgPackage#getEveUpdateMessage_OldValue()
	 * @model
	 * @generated
	 */
	Object getOldValue();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveUpdateMessage#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Object value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Object)
	 * @see org.evesim.msg.MsgPackage#getEveUpdateMessage_NewValue()
	 * @model
	 * @generated
	 */
	Object getNewValue();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveUpdateMessage#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Object value);

	/**
	 * Returns the value of the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature ID</em>' attribute.
	 * @see #setFeatureID(int)
	 * @see org.evesim.msg.MsgPackage#getEveUpdateMessage_FeatureID()
	 * @model
	 * @generated
	 */
	int getFeatureID();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveUpdateMessage#getFeatureID <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature ID</em>' attribute.
	 * @see #getFeatureID()
	 * @generated
	 */
	void setFeatureID(int value);
} // EveUpdateMessage
