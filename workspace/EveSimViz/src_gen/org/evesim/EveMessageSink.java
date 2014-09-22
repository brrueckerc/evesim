/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import org.eclipse.emf.ecore.EObject;
import org.evesim.msg.EveMessage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Message Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.evesim.EvesimPackage#getEveMessageSink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EveMessageSink extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void submitMessage(EveMessage message);

} // EveMessageSink
