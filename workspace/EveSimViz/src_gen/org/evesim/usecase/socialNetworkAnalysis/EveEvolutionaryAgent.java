/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis;

import org.evesim.EveAgent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Evolutionary Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveEvolutionaryAgent()
 * @model
 * @generated
 */
public interface EveEvolutionaryAgent extends EveAgent {
	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(boolean)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveEvolutionaryAgent_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

} // EveEvolutionaryAgent
