/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.UIPlugin;
import org.evesim.timer.EveHistoryTimer;
import org.evesim.timer.TimerPackage;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve History Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.timer.impl.EveHistoryTimerImpl#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveHistoryTimerImpl#getMaxRepeat <em>Max Repeat</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveHistoryTimerImpl#getSleep <em>Sleep</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveHistoryTimerImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveHistoryTimerImpl#getSimInterval <em>Sim Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveHistoryTimerImpl extends EveTimerImpl implements EveHistoryTimer {
	/**
	 * @generated NOT
	 */
	private static final long serialVersionUID = -4052527863572472098L;

	/**
	 * The default value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected long currentTime = CURRENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRepeat() <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REPEAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRepeat() <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRepeat()
	 * @generated
	 * @ordered
	 */
	protected int maxRepeat = MAX_REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected static final long SLEEP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected long sleep = SLEEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected long counter = COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimInterval() <em>Sim Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int SIM_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSimInterval() <em>Sim Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimInterval()
	 * @generated
	 * @ordered
	 */
	protected int simInterval = SIM_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveHistoryTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimerPackage.Literals.EVE_HISTORY_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentTime() {
		return currentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTime(long newCurrentTime) {
		long oldCurrentTime = currentTime;
		currentTime = newCurrentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_HISTORY_TIMER__CURRENT_TIME, oldCurrentTime, currentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRepeat() {
		return maxRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRepeat(int newMaxRepeat) {
		int oldMaxRepeat = maxRepeat;
		maxRepeat = newMaxRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_HISTORY_TIMER__MAX_REPEAT, oldMaxRepeat, maxRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSleep() {
		return sleep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSleep(long newSleep) {
		long oldSleep = sleep;
		sleep = newSleep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_HISTORY_TIMER__SLEEP, oldSleep, sleep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(long newCounter) {
		long oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_HISTORY_TIMER__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSimInterval() {
		return simInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimInterval(int newSimInterval) {
		int oldSimInterval = simInterval;
		simInterval = newSimInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_HISTORY_TIMER__SIM_INTERVAL, oldSimInterval, simInterval));
	}

	/**
	 * @generated NOT
	 */
	public void run() {
		//IStatusLineManager statusLine = bars.getStatusLineManager();
		//IProgressMonitor pm = statusLine.getProgressMonitor();
		while (getCounter() < getMaxRepeat() && getRunning()) {
			if(getCounter() == 0){
				//pm.beginTask("Started Simulation", IProgressMonitor.UNKNOWN);
			}

			if(getCounter() < getMaxRepeat()){				
				if(getParent() instanceof EveHistoryAgent){
					EveHistoryAgent ag = (EveHistoryAgent) getParent();
					ag.execute(currentTime);
					setCurrentTime(getCurrentTime() + getSimInterval());
					setCounter(getCounter() + 1);
					//pm.worked(1);
				}
			}
			if(getCounter() == getMaxRepeat()){
				//pm.done();
			}


			try {
				Thread.sleep(getSleep());
			} catch (InterruptedException e) {
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimerPackage.EVE_HISTORY_TIMER__CURRENT_TIME:
			return getCurrentTime();
		case TimerPackage.EVE_HISTORY_TIMER__MAX_REPEAT:
			return getMaxRepeat();
		case TimerPackage.EVE_HISTORY_TIMER__SLEEP:
			return getSleep();
		case TimerPackage.EVE_HISTORY_TIMER__COUNTER:
			return getCounter();
		case TimerPackage.EVE_HISTORY_TIMER__SIM_INTERVAL:
			return getSimInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimerPackage.EVE_HISTORY_TIMER__CURRENT_TIME:
			setCurrentTime((Long)newValue);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__MAX_REPEAT:
			setMaxRepeat((Integer)newValue);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__SLEEP:
			setSleep((Long)newValue);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__COUNTER:
			setCounter((Long)newValue);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__SIM_INTERVAL:
			setSimInterval((Integer)newValue);
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
		case TimerPackage.EVE_HISTORY_TIMER__CURRENT_TIME:
			setCurrentTime(CURRENT_TIME_EDEFAULT);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__MAX_REPEAT:
			setMaxRepeat(MAX_REPEAT_EDEFAULT);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__SLEEP:
			setSleep(SLEEP_EDEFAULT);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__COUNTER:
			setCounter(COUNTER_EDEFAULT);
			return;
		case TimerPackage.EVE_HISTORY_TIMER__SIM_INTERVAL:
			setSimInterval(SIM_INTERVAL_EDEFAULT);
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
		case TimerPackage.EVE_HISTORY_TIMER__CURRENT_TIME:
			return currentTime != CURRENT_TIME_EDEFAULT;
		case TimerPackage.EVE_HISTORY_TIMER__MAX_REPEAT:
			return maxRepeat != MAX_REPEAT_EDEFAULT;
		case TimerPackage.EVE_HISTORY_TIMER__SLEEP:
			return sleep != SLEEP_EDEFAULT;
		case TimerPackage.EVE_HISTORY_TIMER__COUNTER:
			return counter != COUNTER_EDEFAULT;
		case TimerPackage.EVE_HISTORY_TIMER__SIM_INTERVAL:
			return simInterval != SIM_INTERVAL_EDEFAULT;
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
		result.append(" (currentTime: ");
		result.append(currentTime);
		result.append(", maxRepeat: ");
		result.append(maxRepeat);
		result.append(", sleep: ");
		result.append(sleep);
		result.append(", counter: ");
		result.append(counter);
		result.append(", simInterval: ");
		result.append(simInterval);
		result.append(')');
		return result.toString();
	}

} //EveHistoryTimerImpl
