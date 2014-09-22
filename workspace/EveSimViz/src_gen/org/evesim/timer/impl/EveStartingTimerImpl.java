/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.impl;

import org.eclipse.emf.ecore.EClass;
import org.evesim.timer.EveStartingTimer;
import org.evesim.timer.TimerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Starting Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EveStartingTimerImpl extends EveTimerImpl implements EveStartingTimer {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5757557312730781950L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveStartingTimerImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void run() {
		getParent().execute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimerPackage.Literals.EVE_STARTING_TIMER;
	}

} //EveStartingTimerImpl
