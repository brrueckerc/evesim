/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis;

import java.util.Date;

import org.evesim.EveAgent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve History Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getHistData <em>Hist Data</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getSimInterval <em>Sim Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveHistoryAgent()
 * @model
 * @generated
 */
public interface EveHistoryAgent extends EveAgent {

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
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveHistoryAgent_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveHistoryAgent_Birthdate()
	 * @model
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>Hist Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hist Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hist Data</em>' attribute.
	 * @see #setHistData(String)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveHistoryAgent_HistData()
	 * @model
	 * @generated
	 */
	String getHistData();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getHistData <em>Hist Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hist Data</em>' attribute.
	 * @see #getHistData()
	 * @generated
	 */
	void setHistData(String value);

	/**
	 * Returns the value of the '<em><b>Sim Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Interval</em>' attribute.
	 * @see #setSimInterval(int)
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#getEveHistoryAgent_SimInterval()
	 * @model
	 * @generated
	 */
	int getSimInterval();

	/**
	 * Sets the value of the '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getSimInterval <em>Sim Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Interval</em>' attribute.
	 * @see #getSimInterval()
	 * @generated
	 */
	void setSimInterval(int value);

	void execute(Long time);
} // EveHistoryAgent
