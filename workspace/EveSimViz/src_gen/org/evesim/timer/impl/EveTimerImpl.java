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
import org.evesim.EveComponentRegistry;
import org.evesim.EveSimServerSession;
import org.evesim.impl.EveComponentImpl;
import org.evesim.timer.EveTimer;
import org.evesim.timer.TimerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.timer.impl.EveTimerImpl#getTimerThread <em>Timer Thread</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveTimerImpl#getRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveTimerImpl extends EveComponentImpl implements EveTimer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4554479891864449822L;
	/**
	 * The default value of the '{@link #getTimerThread() <em>Timer Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerThread()
	 * @generated
	 * @ordered
	 */
	protected static final Thread TIMER_THREAD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTimerThread() <em>Timer Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerThread()
	 * @generated
	 * @ordered
	 */
	protected Thread timerThread = TIMER_THREAD_EDEFAULT;

	/**
	 * This is true if the Timer Thread attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timerThreadESet;

	/**
	 * The default value of the '{@link #getRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUNNING_EDEFAULT = Boolean.FALSE;
	/**
	 * The cached value of the '{@link #getRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning()
	 * @generated
	 * @ordered
	 */
	protected Boolean running = RUNNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimerPackage.Literals.EVE_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thread getTimerThread() {
		return timerThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerThread(Thread newTimerThread) {
		Thread oldTimerThread = timerThread;
		timerThread = newTimerThread;
		boolean oldTimerThreadESet = timerThreadESet;
		timerThreadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_TIMER__TIMER_THREAD, oldTimerThread, timerThread, !oldTimerThreadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimerThread() {
		Thread oldTimerThread = timerThread;
		boolean oldTimerThreadESet = timerThreadESet;
		timerThread = TIMER_THREAD_EDEFAULT;
		timerThreadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TimerPackage.EVE_TIMER__TIMER_THREAD, oldTimerThread, TIMER_THREAD_EDEFAULT, oldTimerThreadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimerThread() {
		return timerThreadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(Boolean newRunning) {
		Boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_TIMER__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void start() {
		
		synchronized (getRunning()) {
			setRunning(true);
		}
		
		EveSimServerSession session = EveComponentRegistry.getInstance().getSession(getSessionID());
		timerThread = new Thread(session.getThreadGroup(), this, "EveTimer ["+getUuid()+"]");
		timerThread.start();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
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
			case TimerPackage.EVE_TIMER__TIMER_THREAD:
				return getTimerThread();
			case TimerPackage.EVE_TIMER__RUNNING:
				return getRunning();
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
			case TimerPackage.EVE_TIMER__TIMER_THREAD:
				setTimerThread((Thread)newValue);
				return;
			case TimerPackage.EVE_TIMER__RUNNING:
				setRunning((Boolean)newValue);
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
			case TimerPackage.EVE_TIMER__TIMER_THREAD:
				unsetTimerThread();
				return;
			case TimerPackage.EVE_TIMER__RUNNING:
				setRunning(RUNNING_EDEFAULT);
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
			case TimerPackage.EVE_TIMER__TIMER_THREAD:
				return isSetTimerThread();
			case TimerPackage.EVE_TIMER__RUNNING:
				return RUNNING_EDEFAULT == null ? running != null : !RUNNING_EDEFAULT.equals(running);
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
		result.append(" (timerThread: ");
		if (timerThreadESet) result.append(timerThread); else result.append("<unset>");
		result.append(", running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

} //EveTimerImpl
