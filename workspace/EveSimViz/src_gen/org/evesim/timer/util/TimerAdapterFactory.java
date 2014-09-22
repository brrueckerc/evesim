/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.util;

import java.io.Serializable;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.timer.TimerPackage
 * @generated
 */
public class TimerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimerPackage.eINSTANCE;
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
	protected TimerSwitch<Adapter> modelSwitch =
		new TimerSwitch<Adapter>() {
			@Override
			public Adapter caseEveTimer(EveTimer object) {
				return createEveTimerAdapter();
			}
			@Override
			public Adapter caseEveRepeatingTimer(EveRepeatingTimer object) {
				return createEveRepeatingTimerAdapter();
			}
			@Override
			public Adapter caseEveStartingTimer(EveStartingTimer object) {
				return createEveStartingTimerAdapter();
			}
			@Override
			public Adapter caseEveFunctionTimer(EveFunctionTimer object) {
				return createEveFunctionTimerAdapter();
			}
			@Override
			public Adapter caseEveHistoryTimer(EveHistoryTimer object) {
				return createEveHistoryTimerAdapter();
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
			public Adapter caseRunnable(Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseIControllable(IControllable object) {
				return createIControllableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.evesim.timer.EveTimer <em>Eve Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.timer.EveTimer
	 * @generated
	 */
	public Adapter createEveTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.timer.EveRepeatingTimer <em>Eve Repeating Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.timer.EveRepeatingTimer
	 * @generated
	 */
	public Adapter createEveRepeatingTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.timer.EveStartingTimer <em>Eve Starting Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.timer.EveStartingTimer
	 * @generated
	 */
	public Adapter createEveStartingTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.timer.EveFunctionTimer <em>Eve Function Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.timer.EveFunctionTimer
	 * @generated
	 */
	public Adapter createEveFunctionTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.timer.EveHistoryTimer <em>Eve History Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.timer.EveHistoryTimer
	 * @generated
	 */
	public Adapter createEveHistoryTimerAdapter() {
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

} //TimerAdapterFactory
