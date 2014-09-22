/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Data Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.msg.EveDataMessage#getHashtable <em>Hashtable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.msg.MsgPackage#getEveDataMessage()
 * @model
 * @generated
 */
public interface EveDataMessage extends EveMessage {
	/**
	 * Returns the value of the '<em><b>Hashtable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashtable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashtable</em>' attribute.
	 * @see #setHashtable(Hashtable)
	 * @see org.evesim.msg.MsgPackage#getEveDataMessage_Hashtable()
	 * @model dataType="org.evesim.msg.EveMessageHashtable"
	 * @generated
	 */
	Hashtable<String, Serializable> getHashtable();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveDataMessage#getHashtable <em>Hashtable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashtable</em>' attribute.
	 * @see #getHashtable()
	 * @generated
	 */
	void setHashtable(Hashtable<String, Serializable> value);

} // EveDataMessage
