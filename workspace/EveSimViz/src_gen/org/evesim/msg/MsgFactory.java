/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.msg.MsgPackage
 * @generated
 */
public interface MsgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsgFactory eINSTANCE = org.evesim.msg.impl.MsgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eve Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Message</em>'.
	 * @generated
	 */
	EveMessage createEveMessage();

	/**
	 * Returns a new object of class '<em>Eve Log Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Log Message</em>'.
	 * @generated
	 */
	EveLogMessage createEveLogMessage();

	/**
	 * Returns a new object of class '<em>Eve Update Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Update Message</em>'.
	 * @generated
	 */
	EveUpdateMessage createEveUpdateMessage();

	/**
	 * Returns a new object of class '<em>Eve Serialized Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Serialized Message</em>'.
	 * @generated
	 */
	EveSerializedMessage createEveSerializedMessage();

	/**
	 * Returns a new object of class '<em>Eve Message Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Message Bundle</em>'.
	 * @generated
	 */
	EveMessageBundle createEveMessageBundle();

	/**
	 * Returns a new object of class '<em>Eve Data Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Data Message</em>'.
	 * @generated
	 */
	EveDataMessage createEveDataMessage();

	/**
	 * Returns a new object of class '<em>Eve File Message Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve File Message Sink</em>'.
	 * @generated
	 */
	EveFileMessageSink createEveFileMessageSink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MsgPackage getMsgPackage();

} //MsgFactory
