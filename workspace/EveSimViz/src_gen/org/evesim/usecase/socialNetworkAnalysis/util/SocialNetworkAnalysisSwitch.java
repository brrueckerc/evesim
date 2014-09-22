/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis.util;

import java.io.Serializable;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.IControllable;
import org.evesim.IKmlProvider;
import org.evesim.usecase.socialNetworkAnalysis.*;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;
import org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent;
import org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage
 * @generated
 */
public class SocialNetworkAnalysisSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SocialNetworkAnalysisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkAnalysisSwitch() {
		if (modelPackage == null) {
			modelPackage = SocialNetworkAnalysisPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SocialNetworkAnalysisPackage.EVE_AGENT_SNA: {
				EveAgentSNA eveAgentSNA = (EveAgentSNA)theEObject;
				T result = caseEveAgentSNA(eveAgentSNA);
				if (result == null) result = caseEveAgent(eveAgentSNA);
				if (result == null) result = caseEveComponent(eveAgentSNA);
				if (result == null) result = caseIControllable(eveAgentSNA);
				if (result == null) result = caseSerializable(eveAgentSNA);
				if (result == null) result = caseIAdaptable(eveAgentSNA);
				if (result == null) result = caseIKmlProvider(eveAgentSNA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SocialNetworkAnalysisPackage.EVE_GATEWAY_SNA: {
				EveGatewaySNA eveGatewaySNA = (EveGatewaySNA)theEObject;
				T result = caseEveGatewaySNA(eveGatewaySNA);
				if (result == null) result = caseEveComponent(eveGatewaySNA);
				if (result == null) result = caseSerializable(eveGatewaySNA);
				if (result == null) result = caseIAdaptable(eveGatewaySNA);
				if (result == null) result = caseIKmlProvider(eveGatewaySNA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SocialNetworkAnalysisPackage.EVE_EVOLUTIONARY_AGENT: {
				EveEvolutionaryAgent eveEvolutionaryAgent = (EveEvolutionaryAgent)theEObject;
				T result = caseEveEvolutionaryAgent(eveEvolutionaryAgent);
				if (result == null) result = caseEveAgent(eveEvolutionaryAgent);
				if (result == null) result = caseEveComponent(eveEvolutionaryAgent);
				if (result == null) result = caseIControllable(eveEvolutionaryAgent);
				if (result == null) result = caseSerializable(eveEvolutionaryAgent);
				if (result == null) result = caseIAdaptable(eveEvolutionaryAgent);
				if (result == null) result = caseIKmlProvider(eveEvolutionaryAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT: {
				EveHistoryAgent eveHistoryAgent = (EveHistoryAgent)theEObject;
				T result = caseEveHistoryAgent(eveHistoryAgent);
				if (result == null) result = caseEveAgent(eveHistoryAgent);
				if (result == null) result = caseEveComponent(eveHistoryAgent);
				if (result == null) result = caseIControllable(eveHistoryAgent);
				if (result == null) result = caseSerializable(eveHistoryAgent);
				if (result == null) result = caseIAdaptable(eveHistoryAgent);
				if (result == null) result = caseIKmlProvider(eveHistoryAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Agent SNA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Agent SNA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveAgentSNA(EveAgentSNA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Gateway SNA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Gateway SNA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveGatewaySNA(EveGatewaySNA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Evolutionary Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Evolutionary Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveEvolutionaryAgent(EveEvolutionaryAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve History Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve History Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveHistoryAgent(EveHistoryAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serializable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serializable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializable(Serializable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAdaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAdaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAdaptable(IAdaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IKml Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IKml Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIKmlProvider(IKmlProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveComponent(EveComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IControllable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IControllable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIControllable(IControllable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveAgent(EveAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SocialNetworkAnalysisSwitch
