/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.util;

import java.io.Serializable;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.msg.MsgPackage
 * @generated
 */
public class MsgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MsgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MsgPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgSwitch<Adapter> modelSwitch =
		new MsgSwitch<Adapter>() {
			@Override
			public Adapter caseEveMessage(EveMessage object) {
				return createEveMessageAdapter();
			}
			@Override
			public Adapter caseEveLogMessage(EveLogMessage object) {
				return createEveLogMessageAdapter();
			}
			@Override
			public Adapter caseEveUpdateMessage(EveUpdateMessage object) {
				return createEveUpdateMessageAdapter();
			}
			@Override
			public Adapter caseEveSerializedMessage(EveSerializedMessage object) {
				return createEveSerializedMessageAdapter();
			}
			@Override
			public Adapter caseEveMessageBundle(EveMessageBundle object) {
				return createEveMessageBundleAdapter();
			}
			@Override
			public Adapter caseEveDataMessage(EveDataMessage object) {
				return createEveDataMessageAdapter();
			}
			@Override
			public Adapter caseEveFileMessageSink(EveFileMessageSink object) {
				return createEveFileMessageSinkAdapter();
			}
			@Override
			public Adapter caseSerializable(Serializable object) {
				return createSerializableAdapter();
			}
			@Override
			public Adapter caseIAdaptable(IAdaptable object) {
				return createIAdaptableAdapter();
			}
			@Override
			public Adapter caseIKmlProvider(IKmlProvider object) {
				return createIKmlProviderAdapter();
			}
			@Override
			public Adapter caseEveComponent(EveComponent object) {
				return createEveComponentAdapter();
			}
			@Override
			public Adapter caseEveMessageSink(EveMessageSink object) {
				return createEveMessageSinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.msg.EveMessage <em>Eve Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.msg.EveMessage
	 * @generated
	 */
	public Adapter createEveMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.msg.EveLogMessage <em>Eve Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.msg.EveLogMessage
	 * @generated
	 */
	public Adapter createEveLogMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.msg.EveUpdateMessage <em>Eve Update Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.msg.EveUpdateMessage
	 * @generated
	 */
	public Adapter createEveUpdateMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.msg.EveSerializedMessage <em>Eve Serialized Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.msg.EveSerializedMessage
	 * @generated
	 */
	public Adapter createEveSerializedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.msg.EveMessageBundle <em>Eve Message Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.msg.EveMessageBundle
	 * @generated
	 */
	public Adapter createEveMessageBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.msg.EveDataMessage <em>Eve Data Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.msg.EveDataMessage
	 * @generated
	 */
	public Adapter createEveDataMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.msg.EveFileMessageSink <em>Eve File Message Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.msg.EveFileMessageSink
	 * @generated
	 */
	public Adapter createEveFileMessageSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveMessageSink <em>Eve Message Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveMessageSink
	 * @generated
	 */
	public Adapter createEveMessageSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.io.Serializable
	 * @generated
	 */
	public Adapter createSerializableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @generated
	 */
	public Adapter createIAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.IKmlProvider <em>IKml Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.IKmlProvider
	 * @generated
	 */
	public Adapter createIKmlProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveComponent <em>Eve Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveComponent
	 * @generated
	 */
	public Adapter createEveComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MsgAdapterFactory
