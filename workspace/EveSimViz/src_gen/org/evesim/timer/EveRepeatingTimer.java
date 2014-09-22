/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Repeating Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.timer.EveRepeatingTimer#getMaxRepeat <em>Max Repeat</em>}</li>
 *   <li>{@link org.evesim.timer.EveRepeatingTimer#getSleep <em>Sleep</em>}</li>
 *   <li>{@link org.evesim.timer.EveRepeatingTimer#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.timer.TimerPackage#getEveRepeatingTimer()
 * @model
 * @generated
 */
public interface EveRepeatingTimer extends EveTimer {
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
	 * @see org.evesim.timer.TimerPackage#getEveRepeatingTimer_MaxRepeat()
	 * @model
	 * @generated
	 */
	int getMaxRepeat();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveRepeatingTimer#getMaxRepeat <em>Max Repeat</em>}' attribute.
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
	 * @see org.evesim.timer.TimerPackage#getEveRepeatingTimer_Sleep()
	 * @model
	 * @generated
	 */
	long getSleep();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveRepeatingTimer#getSleep <em>Sleep</em>}' attribute.
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
	 * @see org.evesim.timer.TimerPackage#getEveRepeatingTimer_Counter()
	 * @model
	 * @generated
	 */
	long getCounter();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveRepeatingTimer#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

} // EveRepeatingTimer
