/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Serialized Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.msg.EveSerializedMessage#getPayload <em>Payload</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.msg.MsgPackage#getEveSerializedMessage()
 * @model
 * @generated
 */
public interface EveSerializedMessage extends EveMessage {

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' attribute.
	 * @see #setPayload(String)
	 * @see org.evesim.msg.MsgPackage#getEveSerializedMessage_Payload()
	 * @model
	 * @generated
	 */
	String getPayload();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveSerializedMessage#getPayload <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' attribute.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(String value);
} // EveSerializedMessage
