/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve History Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.timer.EveHistoryTimer#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link org.evesim.timer.EveHistoryTimer#getMaxRepeat <em>Max Repeat</em>}</li>
 *   <li>{@link org.evesim.timer.EveHistoryTimer#getSleep <em>Sleep</em>}</li>
 *   <li>{@link org.evesim.timer.EveHistoryTimer#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.evesim.timer.EveHistoryTimer#getSimInterval <em>Sim Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.timer.TimerPackage#getEveHistoryTimer()
 * @model
 * @generated
 */
public interface EveHistoryTimer extends EveTimer {
	/**
	 * Returns the value of the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time</em>' attribute.
	 * @see #setCurrentTime(long)
	 * @see org.evesim.timer.TimerPackage#getEveHistoryTimer_CurrentTime()
	 * @model
	 * @generated
	 */
	long getCurrentTime();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveHistoryTimer#getCurrentTime <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time</em>' attribute.
	 * @see #getCurrentTime()
	 * @generated
	 */
	void setCurrentTime(long value);

	/**
	 * Returns the value of the '<em><b>Max Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Repeat</em>' attribute.
	 * @see #setMaxRepeat(int)
	 * @see org.evesim.timer.TimerPackage#getEveHistoryTimer_MaxRepeat()
	 * @model
	 * @generated
	 */
	int getMaxRepeat();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveHistoryTimer#getMaxRepeat <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Repeat</em>' attribute.
	 * @see #getMaxRepeat()
	 * @generated
	 */
	void setMaxRepeat(int value);

	/**
	 * Returns the value of the '<em><b>Sleep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sleep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sleep</em>' attribute.
	 * @see #setSleep(long)
	 * @see org.evesim.timer.TimerPackage#getEveHistoryTimer_Sleep()
	 * @model
	 * @generated
	 */
	long getSleep();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveHistoryTimer#getSleep <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sleep</em>' attribute.
	 * @see #getSleep()
	 * @generated
	 */
	void setSleep(long value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(long)
	 * @see org.evesim.timer.TimerPackage#getEveHistoryTimer_Counter()
	 * @model
	 * @generated
	 */
	long getCounter();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveHistoryTimer#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(long value);

	/**
	 * Returns the value of the '<em><b>Sim Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Interval</em>' attribute.
	 * @see #setSimInterval(int)
	 * @see org.evesim.timer.TimerPackage#getEveHistoryTimer_SimInterval()
	 * @model
	 * @generated
	 */
	int getSimInterval();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveHistoryTimer#getSimInterval <em>Sim Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Interval</em>' attribute.
	 * @see #getSimInterval()
	 * @generated
	 */
	void setSimInterval(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

} // EveHistoryTimer
