/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage
 * @generated
 */
public interface SocialNetworkAnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SocialNetworkAnalysisFactory eINSTANCE = org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eve Agent SNA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Agent SNA</em>'.
	 * @generated
	 */
	EveAgentSNA createEveAgentSNA();

	/**
	 * Returns a new object of class '<em>Eve Gateway SNA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Gateway SNA</em>'.
	 * @generated
	 */
	EveGatewaySNA createEveGatewaySNA();

	/**
	 * Returns a new object of class '<em>Eve Evolutionary Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Evolutionary Agent</em>'.
	 * @generated
	 */
	EveEvolutionaryAgent createEveEvolutionaryAgent();

	/**
	 * Returns a new object of class '<em>Eve History Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve History Agent</em>'.
	 * @generated
	 */
	EveHistoryAgent createEveHistoryAgent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SocialNetworkAnalysisPackage getSocialNetworkAnalysisPackage();

} //SocialNetworkAnalysisFactory
