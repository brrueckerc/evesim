/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import java.util.logging.Level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.evesim.EveComponent;
import org.evesim.EveMonitor;
import org.evesim.EvesimPackage;
import org.evesim.monitor.MonitorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eve Monitor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveMonitorImpl#getSleepTime <em>Sleep Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveMonitorImpl extends EveComponentImpl implements EveMonitor {
	/**
	 * The default value of the '{@link #getSleepTime() <em>Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSleepTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SLEEP_TIME_EDEFAULT = new Integer(5);
	/**
	 * The cached value of the '{@link #getSleepTime() <em>Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSleepTime()
	 * @generated
	 * @ordered
	 */
	protected Integer sleepTime = SLEEP_TIME_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2072170558664361044L;

	/**
	 * @generated NOT
	 * @ordered
	 */
	protected class EveMonitorRunnable extends  Thread {
		
		private boolean run = true;

		public void setRun(boolean run) {
			this.run = run;
		}
		
		public boolean getRun() {
			return run;
		}
		
		public void run() {
			while (run) {
				try {
					execute();
				} catch (Exception e) {
					logger.log(Level.SEVERE, "Error occured while running monitor execution: ", e);
				}
				try {
					Thread.sleep(getSleepTime() * 1000);
				} catch (InterruptedException e) {
				}
			}
		}

	};

	EveMonitorRunnable er = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EveMonitorImpl() {
		super();

		eAdapters().add(new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				addChange(notification);
			}

		});
		
		startMonitoring();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */	
	protected void addChange(Notification notification) {
		if (notification.getFeature() instanceof EAttribute && notification.getEventType() == Notification.SET) {

			EAttribute attr = (EAttribute) notification.getFeature();
			if (MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS == attr.getFeatureID()) {
				if (!notification.getOldValue().equals(notification.getNewValue()))
					logger.info(notification.getNotifier().toString() + " - Status updatet to: " + notification.getNewValue());
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_MONITOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSleepTime() {
		return sleepTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSleepTime(Integer newSleepTime) {
		Integer oldSleepTime = sleepTime;
		sleepTime = newSleepTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_MONITOR__SLEEP_TIME, oldSleepTime, sleepTime));
		
		er.interrupt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void startMonitoring() {
		er = new EveMonitorRunnable();
		er.start();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void stopMonitoring() {
		er.setRun(false);
		er.interrupt();
		er = null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvesimPackage.EVE_MONITOR__SLEEP_TIME:
				return getSleepTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvesimPackage.EVE_MONITOR__SLEEP_TIME:
				setSleepTime((Integer)newValue);
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
			case EvesimPackage.EVE_MONITOR__SLEEP_TIME:
				setSleepTime(SLEEP_TIME_EDEFAULT);
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
			case EvesimPackage.EVE_MONITOR__SLEEP_TIME:
				return SLEEP_TIME_EDEFAULT == null ? sleepTime != null : !SLEEP_TIME_EDEFAULT.equals(sleepTime);
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
		result.append(" (sleepTime: ");
		result.append(sleepTime);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 * @ordered
	 */
	@Override
	public void execute() {
		EveComponent.logger.info("Executing EveMonitorImpl.execute()");
		for (EveComponent cmp : getChildren()) {
			cmp.execute();
		}
	}

} // EveMonitorImpl
