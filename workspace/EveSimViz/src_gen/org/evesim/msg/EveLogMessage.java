/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Log Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.msg.EveLogMessage#getMessage <em>Message</em>}</li>
 *   <li>{@link org.evesim.msg.EveLogMessage#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.msg.MsgPackage#getEveLogMessage()
 * @model
 * @generated
 */
public interface EveLogMessage extends EveMessage {

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.evesim.msg.MsgPackage#getEveLogMessage_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveLogMessage#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' attribute.
	 * @see #setDetail(String)
	 * @see org.evesim.msg.MsgPackage#getEveLogMessage_Detail()
	 * @model
	 * @generated
	 */
	String getDetail();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveLogMessage#getDetail <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' attribute.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(String value);
} // EveLogMessage
