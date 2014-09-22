/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Changing Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.timer.EveChangingTimer#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#getMaxRepeat <em>Max Repeat</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#isIsExponential <em>Is Exponential</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#isIsLogarithmic <em>Is Logarithmic</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#getSleep <em>Sleep</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#getPower <em>Power</em>}</li>
 *   <li>{@link org.evesim.timer.EveChangingTimer#isIsPower <em>Is Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.timer.TimerPackage#getEveChangingTimer()
 * @model
 * @generated
 */
public interface EveChangingTimer extends EveTimer {
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
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_Counter()
	 * @model
	 * @generated
	 */
	long getCounter();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(long value);

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
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_MaxRepeat()
	 * @model
	 * @generated
	 */
	int getMaxRepeat();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#getMaxRepeat <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Repeat</em>' attribute.
	 * @see #getMaxRepeat()
	 * @generated
	 */
	void setMaxRepeat(int value);

	/**
	 * Returns the value of the '<em><b>Is Exponential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exponential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exponential</em>' attribute.
	 * @see #setIsExponential(boolean)
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_IsExponential()
	 * @model
	 * @generated
	 */
	boolean isIsExponential();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#isIsExponential <em>Is Exponential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exponential</em>' attribute.
	 * @see #isIsExponential()
	 * @generated
	 */
	void setIsExponential(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Logarithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Logarithmic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Logarithmic</em>' attribute.
	 * @see #setIsLogarithmic(boolean)
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_IsLogarithmic()
	 * @model
	 * @generated
	 */
	boolean isIsLogarithmic();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#isIsLogarithmic <em>Is Logarithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Logarithmic</em>' attribute.
	 * @see #isIsLogarithmic()
	 * @generated
	 */
	void setIsLogarithmic(boolean value);

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient</em>' attribute.
	 * @see #setGradient(float)
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_Gradient()
	 * @model
	 * @generated
	 */
	float getGradient();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#getGradient <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient</em>' attribute.
	 * @see #getGradient()
	 * @generated
	 */
	void setGradient(float value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(float)
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_Constant()
	 * @model
	 * @generated
	 */
	float getConstant();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#getConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(float value);

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
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_Sleep()
	 * @model
	 * @generated
	 */
	long getSleep();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#getSleep <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sleep</em>' attribute.
	 * @see #getSleep()
	 * @generated
	 */
	void setSleep(long value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(float)
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_Power()
	 * @model
	 * @generated
	 */
	float getPower();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(float value);

	/**
	 * Returns the value of the '<em><b>Is Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Power</em>' attribute.
	 * @see #setIsPower(boolean)
	 * @see org.evesim.timer.TimerPackage#getEveChangingTimer_IsPower()
	 * @model
	 * @generated
	 */
	boolean isIsPower();

	/**
	 * Sets the value of the '{@link org.evesim.timer.EveChangingTimer#isIsPower <em>Is Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Power</em>' attribute.
	 * @see #isIsPower()
	 * @generated
	 */
	void setIsPower(boolean value);

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
	boolean setExponetial();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean setLogarithmic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean setPower();

} // EveChangingTimer
