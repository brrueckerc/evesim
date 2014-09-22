/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.evesim.timer.*;
import org.evesim.timer.EveFunctionTimer;
import org.evesim.timer.EveHistoryTimer;
import org.evesim.timer.EveRepeatingTimer;
import org.evesim.timer.EveStartingTimer;
import org.evesim.timer.EveTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.timer.TimerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimerFactoryImpl extends EFactoryImpl implements TimerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimerFactory init() {
		try {
			TimerFactory theTimerFactory = (TimerFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.evesim.org/evesim/timer"); 
			if (theTimerFactory != null) {
				return theTimerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimerPackage.EVE_TIMER: return createEveTimer();
			case TimerPackage.EVE_REPEATING_TIMER: return createEveRepeatingTimer();
			case TimerPackage.EVE_STARTING_TIMER: return createEveStartingTimer();
			case TimerPackage.EVE_FUNCTION_TIMER: return createEveFunctionTimer();
			case TimerPackage.EVE_HISTORY_TIMER: return createEveHistoryTimer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveTimer createEveTimer() {
		EveTimerImpl eveTimer = new EveTimerImpl();
		return eveTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveRepeatingTimer createEveRepeatingTimer() {
		EveRepeatingTimerImpl eveRepeatingTimer = new EveRepeatingTimerImpl();
		return eveRepeatingTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveStartingTimer createEveStartingTimer() {
		EveStartingTimerImpl eveStartingTimer = new EveStartingTimerImpl();
		return eveStartingTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveFunctionTimer createEveFunctionTimer() {
		EveFunctionTimerImpl eveFunctionTimer = new EveFunctionTimerImpl();
		return eveFunctionTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveHistoryTimer createEveHistoryTimer() {
		EveHistoryTimerImpl eveHistoryTimer = new EveHistoryTimerImpl();
		return eveHistoryTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerPackage getTimerPackage() {
		return (TimerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimerPackage getPackage() {
		return TimerPackage.eINSTANCE;
	}

} //TimerFactoryImpl
