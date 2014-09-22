/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.util;

import java.io.Serializable;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.EvesimPackage
 * @generated
 */
public class EvesimAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvesimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvesimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EvesimPackage.eINSTANCE;
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
	protected EvesimSwitch<Adapter> modelSwitch =
		new EvesimSwitch<Adapter>() {
			@Override
			public Adapter caseEveComponent(EveComponent object) {
				return createEveComponentAdapter();
			}
			@Override
			public Adapter caseEveSimulation(EveSimulation object) {
				return createEveSimulationAdapter();
			}
			@Override
			public Adapter caseEveMonitor(EveMonitor object) {
				return createEveMonitorAdapter();
			}
			@Override
			public Adapter caseEveNode(EveNode object) {
				return createEveNodeAdapter();
			}
			@Override
			public Adapter caseEveNodeServer(EveNodeServer object) {
				return createEveNodeServerAdapter();
			}
			@Override
			public Adapter caseEvePrototype(EvePrototype object) {
				return createEvePrototypeAdapter();
			}
			@Override
			public Adapter caseEveAgent(EveAgent object) {
				return createEveAgentAdapter();
			}
			@Override
			public Adapter caseEveService(EveService object) {
				return createEveServiceAdapter();
			}
			@Override
			public Adapter caseEveConnection(EveConnection object) {
				return createEveConnectionAdapter();
			}
			@Override
			public Adapter caseEveLocation(EveLocation object) {
				return createEveLocationAdapter();
			}
			@Override
			public Adapter caseEveMessageSink(EveMessageSink object) {
				return createEveMessageSinkAdapter();
			}
			@Override
			public Adapter caseRunnable(Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseIControllable(IControllable object) {
				return createIControllableAdapter();
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
			public Adapter caseSerializable(Serializable object) {
				return createSerializableAdapter();
			}
			@Override
			public Adapter caseThrowable(Throwable object) {
				return createThrowableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.evesim.EveAgent <em>Eve Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveAgent
	 * @generated
	 */
	public Adapter createEveAgentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.evesim.EveService <em>Eve Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveService
	 * @generated
	 */
	public Adapter createEveServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveConnection <em>Eve Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveConnection
	 * @generated
	 */
	public Adapter createEveConnectionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.evesim.EveSimulation <em>Eve Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveSimulation
	 * @generated
	 */
	public Adapter createEveSimulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveMonitor <em>Eve Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveMonitor
	 * @generated
	 */
	public Adapter createEveMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EvePrototype <em>Eve Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EvePrototype
	 * @generated
	 */
	public Adapter createEvePrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Throwable
	 * @generated
	 */
	public Adapter createThrowableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.IControllable <em>IControllable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.IControllable
	 * @generated
	 */
	public Adapter createIControllableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.evesim.EveLocation <em>Eve Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveLocation
	 * @generated
	 */
	public Adapter createEveLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveNode <em>Eve Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveNode
	 * @generated
	 */
	public Adapter createEveNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveNodeServer <em>Eve Node Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveNodeServer
	 * @generated
	 */
	public Adapter createEveNodeServerAdapter() {
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

} //EvesimAdapterFactory
