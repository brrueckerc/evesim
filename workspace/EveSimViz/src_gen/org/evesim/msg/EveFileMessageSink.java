/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;

import org.evesim.EveComponent;
import org.evesim.EveMessageSink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve File Message Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.msg.EveFileMessageSink#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.evesim.msg.EveFileMessageSink#getFiletype <em>Filetype</em>}</li>
 *   <li>{@link org.evesim.msg.EveFileMessageSink#isAppend <em>Append</em>}</li>
 *   <li>{@link org.evesim.msg.EveFileMessageSink#getDelimeterField <em>Delimeter Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.msg.MsgPackage#getEveFileMessageSink()
 * @model
 * @generated
 */
public interface EveFileMessageSink extends EveComponent, EveMessageSink {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.evesim.msg.MsgPackage#getEveFileMessageSink_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveFileMessageSink#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Filetype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.evesim.msg.EveFileMessageSinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filetype</em>' attribute.
	 * @see org.evesim.msg.EveFileMessageSinkType
	 * @see #setFiletype(EveFileMessageSinkType)
	 * @see org.evesim.msg.MsgPackage#getEveFileMessageSink_Filetype()
	 * @model
	 * @generated
	 */
	EveFileMessageSinkType getFiletype();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveFileMessageSink#getFiletype <em>Filetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filetype</em>' attribute.
	 * @see org.evesim.msg.EveFileMessageSinkType
	 * @see #getFiletype()
	 * @generated
	 */
	void setFiletype(EveFileMessageSinkType value);

	/**
	 * Returns the value of the '<em><b>Append</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Append</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Append</em>' attribute.
	 * @see #setAppend(boolean)
	 * @see org.evesim.msg.MsgPackage#getEveFileMessageSink_Append()
	 * @model default="false"
	 * @generated
	 */
	boolean isAppend();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveFileMessageSink#isAppend <em>Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append</em>' attribute.
	 * @see #isAppend()
	 * @generated
	 */
	void setAppend(boolean value);

	/**
	 * Returns the value of the '<em><b>Delimeter Field</b></em>' attribute.
	 * The default value is <code>";"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimeter Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimeter Field</em>' attribute.
	 * @see #setDelimeterField(String)
	 * @see org.evesim.msg.MsgPackage#getEveFileMessageSink_DelimeterField()
	 * @model default=";"
	 * @generated
	 */
	String getDelimeterField();

	/**
	 * Sets the value of the '{@link org.evesim.msg.EveFileMessageSink#getDelimeterField <em>Delimeter Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimeter Field</em>' attribute.
	 * @see #getDelimeterField()
	 * @generated
	 */
	void setDelimeterField(String value);

} // EveFileMessageSink
