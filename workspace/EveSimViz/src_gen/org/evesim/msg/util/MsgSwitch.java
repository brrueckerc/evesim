/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.util;

import java.io.Serializable;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.evesim.EveComponent;
import org.evesim.EveMessageSink;
import org.evesim.IKmlProvider;
import org.evesim.msg.*;
import org.evesim.msg.EveDataMessage;
import org.evesim.msg.EveFileMessageSink;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveMessage;
import org.evesim.msg.EveMessageBundle;
import org.evesim.msg.EveSerializedMessage;
import org.evesim.msg.EveUpdateMessage;
import org.evesim.msg.MsgPackage;

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
 * @see org.evesim.msg.MsgPackage
 * @generated
 */
public class MsgSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MsgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgSwitch() {
		if (modelPackage == null) {
			modelPackage = MsgPackage.eINSTANCE;
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
			case MsgPackage.EVE_MESSAGE: {
				EveMessage eveMessage = (EveMessage)theEObject;
				T result = caseEveMessage(eveMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MsgPackage.EVE_LOG_MESSAGE: {
				EveLogMessage eveLogMessage = (EveLogMessage)theEObject;
				T result = caseEveLogMessage(eveLogMessage);
				if (result == null) result = caseEveMessage(eveLogMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MsgPackage.EVE_UPDATE_MESSAGE: {
				EveUpdateMessage eveUpdateMessage = (EveUpdateMessage)theEObject;
				T result = caseEveUpdateMessage(eveUpdateMessage);
				if (result == null) result = caseEveMessage(eveUpdateMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MsgPackage.EVE_SERIALIZED_MESSAGE: {
				EveSerializedMessage eveSerializedMessage = (EveSerializedMessage)theEObject;
				T result = caseEveSerializedMessage(eveSerializedMessage);
				if (result == null) result = caseEveMessage(eveSerializedMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MsgPackage.EVE_MESSAGE_BUNDLE: {
				EveMessageBundle eveMessageBundle = (EveMessageBundle)theEObject;
				T result = caseEveMessageBundle(eveMessageBundle);
				if (result == null) result = caseEveMessage(eveMessageBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MsgPackage.EVE_DATA_MESSAGE: {
				EveDataMessage eveDataMessage = (EveDataMessage)theEObject;
				T result = caseEveDataMessage(eveDataMessage);
				if (result == null) result = caseEveMessage(eveDataMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MsgPackage.EVE_FILE_MESSAGE_SINK: {
				EveFileMessageSink eveFileMessageSink = (EveFileMessageSink)theEObject;
				T result = caseEveFileMessageSink(eveFileMessageSink);
				if (result == null) result = caseEveComponent(eveFileMessageSink);
				if (result == null) result = caseEveMessageSink(eveFileMessageSink);
				if (result == null) result = caseSerializable(eveFileMessageSink);
				if (result == null) result = caseIAdaptable(eveFileMessageSink);
				if (result == null) result = caseIKmlProvider(eveFileMessageSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveMessage(EveMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Log Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Log Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveLogMessage(EveLogMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Update Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Update Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveUpdateMessage(EveUpdateMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Serialized Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Serialized Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveSerializedMessage(EveSerializedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Message Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Message Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveMessageBundle(EveMessageBundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve Data Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve Data Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveDataMessage(EveDataMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eve File Message Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eve File Message Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveFileMessageSink(EveFileMessageSink object) {
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

} //MsgSwitch
