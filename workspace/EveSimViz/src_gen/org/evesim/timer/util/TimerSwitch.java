/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.util;

import java.io.Serializable;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.evesim.EveComponent;
import org.evesim.IControllable;
import org.evesim.IKmlProvider;
import org.evesim.timer.*;
import org.evesim.timer.EveFunctionTimer;
import org.evesim.timer.EveHistoryTimer;
import org.evesim.timer.EveRepeatingTimer;
import org.evesim.timer.EveStartingTimer;
import org.evesim.timer.EveTimer;
import org.evesim.timer.TimerPackage;

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
 * @see org.evesim.timer.TimerPackage
 * @generated
 */
public class TimerSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerSwitch() {
		if (modelPackage == null) {
			modelPackage = TimerPackage.eINSTANCE;
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
			case TimerPackage.EVE_TIMER: {
				EveTimer eveTimer = (EveTimer)theEObject;
				T result = caseEveTimer(eveTimer);
				if (result == null) result = caseEveComponent(eveTimer);
				if (result == null) result = caseRunnable(eveTimer);
				if (result == null) result = caseIControllable(eveTimer);
				if (result == null) result = caseSerializable(eveTimer);
				if (result == null) result = caseIAdaptable(eveTimer);
				if (result == null) result = caseIKmlProvider(eveTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimerPackage.EVE_REPEATING_TIMER: {
				EveRepeatingTimer eveRepeatingTimer = (EveRepeatingTimer)theEObject;
				T result = caseEveRepeatingTimer(eveRepeatingTimer);
				if (result == null) result = caseEveTimer(eveRepeatingTimer);
				if (result == null) result = caseEveComponent(eveRepeatingTimer);
				if (result == null) result = caseRunnable(eveRepeatingTimer);
				if (result == null) result = caseIControllable(eveRepeatingTimer);
				if (result == null) result = caseSerializable(eveRepeatingTimer);
				if (result == null) result = caseIAdaptable(eveRepeatingTimer);
				if (result == null) result = caseIKmlProvider(eveRepeatingTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimerPackage.EVE_STARTING_TIMER: {
				EveStartingTimer eveStartingTimer = (EveStartingTimer)theEObject;
				T result = caseEveStartingTimer(eveStartingTimer);
				if (result == null) result = caseEveTimer(eveStartingTimer);
				if (result == null) result = caseEveComponent(eveStartingTimer);
				if (result == null) result = caseRunnable(eveStartingTimer);
				if (result == null) result = caseIControllable(eveStartingTimer);
				if (result == null) result = caseSerializable(eveStartingTimer);
				if (result == null) result = caseIAdaptable(eveStartingTimer);
				if (result == null) result = caseIKmlProvider(eveStartingTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimerPackage.EVE_FUNCTION_TIMER: {
				EveFunctionTimer eveFunctionTimer = (EveFunctionTimer)theEObject;
				T result = caseEveFunctionTimer(eveFunctionTimer);
				if (result == null) result = caseEveTimer(eveFunctionTimer);
				if (result == null) result = caseEveComponent(eveFunctionTimer);
				if (result == null) result = caseRunnable(eveFunctionTimer);
				if (result == null) result = caseIControllable(eveFunctionTimer);
				if (result == null) result = caseSerializable(eveFunctionTimer);
				if (result == null) result = caseIAdaptable(eveFunctionTimer);
				if (result == null) result = caseIKmlProvider(eveFunctionTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimerPackage.EVE_HISTORY_TIMER: {
				EveHistoryTimer eveHistoryTimer = (EveHistoryTimer)theEObject;
				T result = caseEveHistoryTimer(eveHistoryTimer);
				if (result == null) result = caseEveTimer(eveHistoryTimer);
				if (result == null) result = caseEveComponent(eveHistoryTimer);
				if (result == null) result = caseRunnable(eveHistoryTimer);
				if (result == null) result = caseIControllable(eveHistoryTimer);
				if (result == null) result = caseSerializable(eveHistoryTimer);
				if (result == null) result = caseIAdaptable(eveHistoryTimer);
				if (result == null) result = caseIKmlProvider(eveHistoryTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveTimer(EveTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Repeating Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Repeating Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveRepeatingTimer(EveRepeatingTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Starting Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Starting Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveStartingTimer(EveStartingTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Function Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Function Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveFunctionTimer(EveFunctionTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve History Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve History Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveHistoryTimer(EveHistoryTimer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnable(Runnable object) {
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

} //TimerSwitch
