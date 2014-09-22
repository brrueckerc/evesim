/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.msg.EveMessage#getMessageUUID <em>Message UUID</em>}</li>
 *   <li>{@link org.evesim.msg.EveMessage#getSessionUUID <em>Session UUID</em>}</li>
 *   <li>{@link org.evesim.msg.EveMessage#getSenderUUID <em>Sender UUID</em>}</li>
 *   <li>{@link org.evesim.msg.EveMessage#getRecieverUUID <em>Reciever UUID</em>}</li>
 *   <li>{@link org.evesim.msg.EveMessage#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.msg.MsgPackage#getEveMessage()
 * @model
 * @generated
 */
public interface EveMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Message UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message UUID</em>' attribute.
	 * @see #setMessageUUID(UUID)
	 * @see org.evesim.msg.MsgPackage#getEveMessage_MessageUUID()
	 * @model id="true" dataType="org.evesim.UUID"
	 * @generated
	 */
	UUID getMessageUUID();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveMessage#getMessageUUID <em>Message UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message UUID</em>' attribute.
	 * @see #getMessageUUID()
	 * @generated
	 */
	void setMessageUUID(UUID value);

	/**
	 * Returns the value of the '<em><b>Session UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session UUID</em>' attribute.
	 * @see #setSessionUUID(UUID)
	 * @see org.evesim.msg.MsgPackage#getEveMessage_SessionUUID()
	 * @model dataType="org.evesim.UUID"
	 * @generated
	 */
	UUID getSessionUUID();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveMessage#getSessionUUID <em>Session UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session UUID</em>' attribute.
	 * @see #getSessionUUID()
	 * @generated
	 */
	void setSessionUUID(UUID value);

	/**
	 * Returns the value of the '<em><b>Sender UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender UUID</em>' attribute.
	 * @see #setSenderUUID(UUID)
	 * @see org.evesim.msg.MsgPackage#getEveMessage_SenderUUID()
	 * @model dataType="org.evesim.UUID"
	 * @generated
	 */
	UUID getSenderUUID();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveMessage#getSenderUUID <em>Sender UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender UUID</em>' attribute.
	 * @see #getSenderUUID()
	 * @generated
	 */
	void setSenderUUID(UUID value);

	/**
	 * Returns the value of the '<em><b>Reciever UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reciever UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciever UUID</em>' attribute.
	 * @see #setRecieverUUID(UUID)
	 * @see org.evesim.msg.MsgPackage#getEveMessage_RecieverUUID()
	 * @model dataType="org.evesim.UUID"
	 * @generated
	 */
	UUID getRecieverUUID();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveMessage#getRecieverUUID <em>Reciever UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reciever UUID</em>' attribute.
	 * @see #getRecieverUUID()
	 * @generated
	 */
	void setRecieverUUID(UUID value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see org.evesim.msg.MsgPackage#getEveMessage_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveMessage#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

} // EveMessage
