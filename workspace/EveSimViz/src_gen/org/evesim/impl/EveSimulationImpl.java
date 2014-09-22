/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.EveSimulation;
import org.evesim.EvesimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveSimulationImpl#getStepDuration <em>Step Duration</em>}</li>
 *   <li>{@link org.evesim.impl.EveSimulationImpl#getStepCount <em>Step Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveSimulationImpl extends EveComponentImpl implements EveSimulation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3378655155620783953L;

	/**
	 * The default value of the '{@link #getStepDuration() <em>Step Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long STEP_DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStepDuration() <em>Step Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDuration()
	 * @generated
	 * @ordered
	 */
	protected long stepDuration = STEP_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepCount() <em>Step Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepCount()
	 * @generated
	 * @ordered
	 */
	protected static final long STEP_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStepCount() <em>Step Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepCount()
	 * @generated
	 * @ordered
	 */
	protected long stepCount = STEP_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveSimulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_SIMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStepDuration() {
		return stepDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepDuration(long newStepDuration) {
		long oldStepDuration = stepDuration;
		stepDuration = newStepDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_SIMULATION__STEP_DURATION, oldStepDuration, stepDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStepCount() {
		return stepCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepCount(long newStepCount) {
		long oldStepCount = stepCount;
		stepCount = newStepCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_SIMULATION__STEP_COUNT, oldStepCount, stepCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void simStart() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvesimPackage.EVE_SIMULATION__STEP_DURATION:
				return getStepDuration();
			case EvesimPackage.EVE_SIMULATION__STEP_COUNT:
				return getStepCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvesimPackage.EVE_SIMULATION__STEP_DURATION:
				setStepDuration((Long)newValue);
				return;
			case EvesimPackage.EVE_SIMULATION__STEP_COUNT:
				setStepCount((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvesimPackage.EVE_SIMULATION__STEP_DURATION:
				setStepDuration(STEP_DURATION_EDEFAULT);
				return;
			case EvesimPackage.EVE_SIMULATION__STEP_COUNT:
				setStepCount(STEP_COUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvesimPackage.EVE_SIMULATION__STEP_DURATION:
				return stepDuration != STEP_DURATION_EDEFAULT;
			case EvesimPackage.EVE_SIMULATION__STEP_COUNT:
				return stepCount != STEP_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stepDuration: ");
		result.append(stepDuration);
		result.append(", stepCount: ");
		result.append(stepCount);
		result.append(')');
		return result.toString();
	}

} //EveSimulationImpl
