/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.timer.EveRepeatingTimer;
import org.evesim.timer.TimerPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eve Repeating Timer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.timer.impl.EveRepeatingTimerImpl#getMaxRepeat <em>Max Repeat</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveRepeatingTimerImpl#getSleep <em>Sleep</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveRepeatingTimerImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveRepeatingTimerImpl extends EveTimerImpl implements EveRepeatingTimer {

	/**
	 * @generated NOT
	 */
	@Override
	public void reset() {		
		super.reset();
		setCounter(COUNTER_EDEFAULT);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2949051358005691371L;

	/**
	 * @generated NOT
	 */
	public void run() {
		while (getCounter() < getMaxRepeat() && getRunning()) {
			setCounter(getCounter() + 1);

			getParent().execute();
				
			try {
				Thread.sleep(getSleep());
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * The default value of the '{@link #getMaxRepeat() <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REPEAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRepeat() <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxRepeat()
	 * @generated
	 * @ordered
	 */
	protected int maxRepeat = MAX_REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected static final long SLEEP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected long sleep = SLEEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected long counter = COUNTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EveRepeatingTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimerPackage.Literals.EVE_REPEATING_TIMER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRepeat() {
		return maxRepeat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRepeat(int newMaxRepeat) {
		int oldMaxRepeat = maxRepeat;
		maxRepeat = newMaxRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_REPEATING_TIMER__MAX_REPEAT, oldMaxRepeat, maxRepeat));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getSleep() {
		return sleep;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSleep(long newSleep) {
		long oldSleep = sleep;
		sleep = newSleep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_REPEATING_TIMER__SLEEP, oldSleep, sleep));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(long newCounter) {
		long oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_REPEATING_TIMER__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimerPackage.EVE_REPEATING_TIMER__MAX_REPEAT:
				return getMaxRepeat();
			case TimerPackage.EVE_REPEATING_TIMER__SLEEP:
				return getSleep();
			case TimerPackage.EVE_REPEATING_TIMER__COUNTER:
				return getCounter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimerPackage.EVE_REPEATING_TIMER__MAX_REPEAT:
				setMaxRepeat((Integer)newValue);
				return;
			case TimerPackage.EVE_REPEATING_TIMER__SLEEP:
				setSleep((Long)newValue);
				return;
			case TimerPackage.EVE_REPEATING_TIMER__COUNTER:
				setCounter((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimerPackage.EVE_REPEATING_TIMER__MAX_REPEAT:
				setMaxRepeat(MAX_REPEAT_EDEFAULT);
				return;
			case TimerPackage.EVE_REPEATING_TIMER__SLEEP:
				setSleep(SLEEP_EDEFAULT);
				return;
			case TimerPackage.EVE_REPEATING_TIMER__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimerPackage.EVE_REPEATING_TIMER__MAX_REPEAT:
				return maxRepeat != MAX_REPEAT_EDEFAULT;
			case TimerPackage.EVE_REPEATING_TIMER__SLEEP:
				return sleep != SLEEP_EDEFAULT;
			case TimerPackage.EVE_REPEATING_TIMER__COUNTER:
				return counter != COUNTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxRepeat: ");
		result.append(maxRepeat);
		result.append(", sleep: ");
		result.append(sleep);
		result.append(", counter: ");
		result.append(counter);
		result.append(')');
		return result.toString();
	}

} // EveRepeatingTimerImpl
