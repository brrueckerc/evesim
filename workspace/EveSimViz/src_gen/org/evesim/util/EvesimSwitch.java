/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.util;

import java.io.Serializable;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EveLocation;
import org.evesim.EveMessageSink;
import org.evesim.EveMonitor;
import org.evesim.EveNode;
import org.evesim.EveNodeServer;
import org.evesim.EvePrototype;
import org.evesim.EveService;
import org.evesim.EveSimulation;
import org.evesim.EvesimPackage;
import org.evesim.IControllable;
import org.evesim.IKmlProvider;

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
 * @see org.evesim.EvesimPackage
 * @generated
 */
public class EvesimSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvesimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvesimSwitch() {
		if (modelPackage == null) {
			modelPackage = EvesimPackage.eINSTANCE;
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
			case EvesimPackage.EVE_COMPONENT: {
				EveComponent eveComponent = (EveComponent)theEObject;
				T result = caseEveComponent(eveComponent);
				if (result == null) result = caseSerializable(eveComponent);
				if (result == null) result = caseIAdaptable(eveComponent);
				if (result == null) result = caseIKmlProvider(eveComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_SIMULATION: {
				EveSimulation eveSimulation = (EveSimulation)theEObject;
				T result = caseEveSimulation(eveSimulation);
				if (result == null) result = caseEveComponent(eveSimulation);
				if (result == null) result = caseSerializable(eveSimulation);
				if (result == null) result = caseIAdaptable(eveSimulation);
				if (result == null) result = caseIKmlProvider(eveSimulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_MONITOR: {
				EveMonitor eveMonitor = (EveMonitor)theEObject;
				T result = caseEveMonitor(eveMonitor);
				if (result == null) result = caseEveComponent(eveMonitor);
				if (result == null) result = caseSerializable(eveMonitor);
				if (result == null) result = caseIAdaptable(eveMonitor);
				if (result == null) result = caseIKmlProvider(eveMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_NODE: {
				EveNode eveNode = (EveNode)theEObject;
				T result = caseEveNode(eveNode);
				if (result == null) result = caseEveComponent(eveNode);
				if (result == null) result = caseEveMessageSink(eveNode);
				if (result == null) result = caseSerializable(eveNode);
				if (result == null) result = caseIAdaptable(eveNode);
				if (result == null) result = caseIKmlProvider(eveNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_NODE_SERVER: {
				EveNodeServer eveNodeServer = (EveNodeServer)theEObject;
				T result = caseEveNodeServer(eveNodeServer);
				if (result == null) result = caseRunnable(eveNodeServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_PROTOTYPE: {
				EvePrototype evePrototype = (EvePrototype)theEObject;
				T result = caseEvePrototype(evePrototype);
				if (result == null) result = caseEveAgent(evePrototype);
				if (result == null) result = caseEveComponent(evePrototype);
				if (result == null) result = caseIControllable(evePrototype);
				if (result == null) result = caseSerializable(evePrototype);
				if (result == null) result = caseIAdaptable(evePrototype);
				if (result == null) result = caseIKmlProvider(evePrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_AGENT: {
				EveAgent eveAgent = (EveAgent)theEObject;
				T result = caseEveAgent(eveAgent);
				if (result == null) result = caseEveComponent(eveAgent);
				if (result == null) result = caseIControllable(eveAgent);
				if (result == null) result = caseSerializable(eveAgent);
				if (result == null) result = caseIAdaptable(eveAgent);
				if (result == null) result = caseIKmlProvider(eveAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_SERVICE: {
				EveService eveService = (EveService)theEObject;
				T result = caseEveService(eveService);
				if (result == null) result = caseEveComponent(eveService);
				if (result == null) result = caseSerializable(eveService);
				if (result == null) result = caseIAdaptable(eveService);
				if (result == null) result = caseIKmlProvider(eveService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_CONNECTION: {
				EveConnection eveConnection = (EveConnection)theEObject;
				T result = caseEveConnection(eveConnection);
				if (result == null) result = caseEveComponent(eveConnection);
				if (result == null) result = caseSerializable(eveConnection);
				if (result == null) result = caseIAdaptable(eveConnection);
				if (result == null) result = caseIKmlProvider(eveConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_LOCATION: {
				EveLocation eveLocation = (EveLocation)theEObject;
				T result = caseEveLocation(eveLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.EVE_MESSAGE_SINK: {
				EveMessageSink eveMessageSink = (EveMessageSink)theEObject;
				T result = caseEveMessageSink(eveMessageSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.ICONTROLLABLE: {
				IControllable iControllable = (IControllable)theEObject;
				T result = caseIControllable(iControllable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvesimPackage.IKML_PROVIDER: {
				IKmlProvider iKmlProvider = (IKmlProvider)theEObject;
				T result = caseIKmlProvider(iKmlProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Eve Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveService(EveService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveConnection(EveConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Message Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Message Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveMessageSink(EveMessageSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Simulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveSimulation(EveSimulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveMonitor(EveMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvePrototype(EvePrototype object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Throwable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throwable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowable(Throwable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Eve Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveLocation(EveLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveNode(EveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Node Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Node Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveNodeServer(EveNodeServer object) {
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

} //EvesimSwitch
