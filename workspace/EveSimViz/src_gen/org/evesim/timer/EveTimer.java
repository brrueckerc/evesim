/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer;

import org.evesim.EveComponent;
import org.evesim.IControllable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.timer.EveTimer#getTimerThread <em>Timer Thread</em>}</li>
 *   <li>{@link org.evesim.timer.EveTimer#getRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.timer.TimerPackage#getEveTimer()
 * @model superTypes="org.evesim.EveComponent org.evesim.Runnable org.evesim.IControllable"
 * @generated
 */
public interface EveTimer extends EveComponent, Runnable, IControllable {
	/**
	 * Returns the value of the '<em><b>Timer Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Thread</em>' attribute.
	 * @see #isSetTimerThread()
	 * @see #unsetTimerThread()
	 * @see #setTimerThread(Thread)
	 * @see org.evesim.timer.TimerPackage#getEveTimer_TimerThread()
	 * @model unsettable="true" dataType="org.evesim.Thread"
	 * @generated
	 */
	Thread getTimerThread();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveTimer#getTimerThread <em>Timer Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Thread</em>' attribute.
	 * @see #isSetTimerThread()
	 * @see #unsetTimerThread()
	 * @see #getTimerThread()
	 * @generated
	 */
	void setTimerThread(Thread value);

	/**
	 * Unsets the value of the '{@link org.evesim.timer.EveTimer#getTimerThread <em>Timer Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimerThread()
	 * @see #getTimerThread()
	 * @see #setTimerThread(Thread)
	 * @generated
	 */
	void unsetTimerThread();

	/**
	 * Returns whether the value of the '{@link org.evesim.timer.EveTimer#getTimerThread <em>Timer Thread</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timer Thread</em>' attribute is set.
	 * @see #unsetTimerThread()
	 * @see #getTimerThread()
	 * @see #setTimerThread(Thread)
	 * @generated
	 */
	boolean isSetTimerThread();

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(Boolean)
	 * @see org.evesim.timer.TimerPackage#getEveTimer_Running()
	 * @model default="false"
	 * @generated
	 */
	Boolean getRunning();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveTimer#getRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #getRunning()
	 * @generated
	 */
	void setRunning(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

} // EveTimer
