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
 * A representation of the model object '<em><b>Eve Agent SNA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getEditingPropability <em>Editing Propability</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getDeletingPropability <em>Deleting Propability</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getCreatingPropability <em>Creating Propability</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#isStarted <em>Started</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveAgentSNA()
 * @model
 * @generated
 */
public interface EveAgentSNA extends EveAgent {

	/**
	 * Returns the value of the '<em><b>Editing Propability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Propability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Propability</em>' attribute.
	 * @see #setEditingPropability(int)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveAgentSNA_EditingPropability()
	 * @model
	 * @generated
	 */
	int getEditingPropability();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getEditingPropability <em>Editing Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Propability</em>' attribute.
	 * @see #getEditingPropability()
	 * @generated
	 */
	void setEditingPropability(int value);

	/**
	 * Returns the value of the '<em><b>Deleting Propability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleting Propability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleting Propability</em>' attribute.
	 * @see #setDeletingPropability(int)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveAgentSNA_DeletingPropability()
	 * @model
	 * @generated
	 */
	int getDeletingPropability();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getDeletingPropability <em>Deleting Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleting Propability</em>' attribute.
	 * @see #getDeletingPropability()
	 * @generated
	 */
	void setDeletingPropability(int value);

	/**
	 * Returns the value of the '<em><b>Creating Propability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creating Propability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creating Propability</em>' attribute.
	 * @see #setCreatingPropability(int)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveAgentSNA_CreatingPropability()
	 * @model
	 * @generated
	 */
	int getCreatingPropability();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getCreatingPropability <em>Creating Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creating Propability</em>' attribute.
	 * @see #getCreatingPropability()
	 * @generated
	 */
	void setCreatingPropability(int value);

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(boolean)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveAgentSNA_Started()
	 * @model
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
} // EveAgentSNA
