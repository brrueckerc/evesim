/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis;

import org.evesim.EveComponent;

import br.org.ipti.flypeer.trans.TransactionInitiator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Gateway SNA</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveGatewaySNA()
 * @model
 * @generated NOT
 */
public interface EveGatewaySNA extends EveComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	boolean isReady();
	TransactionInitiator getTransactionInitiator();
} // EveGatewaySNA
