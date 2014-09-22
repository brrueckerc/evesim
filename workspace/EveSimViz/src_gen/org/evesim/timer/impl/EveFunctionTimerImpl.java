/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.impl;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.EveComponentRegistry;
import org.evesim.EveSimServerSession;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveSerializedMessage;
import org.evesim.msg.MsgFactory;
import org.evesim.timer.EveFunctionTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.timer.TimerPackage;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Function Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#getMaxRepeat <em>Max Repeat</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#isIsExponential <em>Is Exponential</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#isIsLogarithmic <em>Is Logarithmic</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#getSleep <em>Sleep</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.evesim.timer.impl.EveFunctionTimerImpl#isIsPower <em>Is Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveFunctionTimerImpl extends EveTimerImpl implements EveFunctionTimer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 85351319204646808L;
	private ArrayList<Long> timer_periods = new ArrayList<Long>();

	/**
	 * @generated NOT
	 */
	public static void main(String[] args){
		//		EveAgentSNA sna = SocialNetworkAnalysisFactory.eINSTANCE.createEveAgentSNA();
		TimerFactory factory = TimerFactory.eINSTANCE;
		EveFunctionTimer timer = factory.createEveFunctionTimer();
		timer.setCounter(0);
		timer.setConstant((float) 500);
		timer.setGradient((float)500);
		timer.setMaxRepeat(200);
		timer.setPower((float)1.0);

		timer.setIsLogarithmic(true);
		//		timer.setParent(sna);
		//		sna.addChild(timer);

		ArrayList<Long> list = timer.getTimes(20);
		for(int i = 0; i < list.size();i++){
			System.out.print(list.get(i).toString() + ";");
		}
		//System.out.println(timer.getCounter());
		timer.setConstant((float) 500);
		timer.setGradient((float) 800);

		ArrayList<Long> list1 = timer.getTimes(10);
		for(int i = 0; i < list1.size();i++){
			System.out.print(list1.get(i).toString() + ";");
		}

		//System.out.println(timer.getCounter());
		timer.setConstant((float) 500);
		timer.setGradient((float) 500);

		ArrayList<Long> list2 = timer.getTimes(10);
		for(int i = 0; i < list2.size();i++){
			System.out.print(list2.get(i).toString() + ";");
		}

		//System.out.println(timer.getCounter());
		timer.setConstant((float) 500);
		timer.setGradient((float) 700);

		ArrayList<Long> list3 = timer.getTimes(10);
		for(int i = 0; i < list3.size();i++){
			System.out.print(list3.get(i).toString() + ";");

		}
	}

	/**
	 * @generated NOT
	 */
	public void run() {
		if(this.getParent() instanceof EveAgentSNA){
			EveAgentSNA agent = (EveAgentSNA)this.getParent();
			while(agent.isStarted() == false){
				try {
					Thread.sleep(500);
					getParent().execute();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		while (getCounter() < getMaxRepeat()) {
			setCounter(getCounter() + 1);
			getParent().execute();
			Long count_long = new Long(getCounter());

			if(isIsExponential()){
				//time function looks like k*e^x + d
				setSleep((long) ((getGradient())*Math.exp(count_long) + getConstant()));
				//System.out.println(getSleep());
			}
			else if(isIsLogarithmic()){
				//time function looks like k*log(x) + d
				setSleep((long) (getGradient()*Math.log(count_long) + getConstant()));
				//System.out.println(getSleep());
			}
			else if(isIsPower()){
				//time function looks like k*x^power + d
				setSleep((long) (getGradient()*Math.pow(count_long, getPower())+ getConstant()));
				//System.out.println(getSleep());
			}
			else{
				//time function looks like k*x + d
				setSleep((long) ((getGradient()*count_long) + getConstant()));
				//System.out.println(getSleep());
			}


			try {
				this.timer_periods.add(getSleep());
				sendMessage("serial", this.timer_periods.toString());
				Thread.sleep(getSleep());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	/**
	 * @generated NOT
	 */
	public ArrayList<Long> getTimes(int count){
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i = 1; i < count; i++){
			setCounter(getCounter() + 1);
			Long count_long = getCounter();

			if(isIsExponential()){
				//time function looks like k*e^x + d
				list.add((long) ((getGradient())*Math.exp(count_long) + getConstant()));
				//System.out.println(getSleep());
			}
			else if(isIsLogarithmic()){
				//time function looks like k*log(x) + d
				list.add((long) (getGradient()*Math.log(count_long) + getConstant()));
				//System.out.println(getSleep());
			}
			else if(isIsPower()){
				//time function looks like k*x^power + d
				list.add((long) (getGradient()*Math.pow(count_long, getPower())+ getConstant()));
				//System.out.println(getSleep());
			}
			else{
				//time function looks like k*x + d
				list.add((long) ((getGradient()*count_long) + getConstant()));
				//System.out.println(getSleep());
			}
		}

		return list;
	}



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
	 * The default value of the '{@link #isIsExponential() <em>Is Exponential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExponential()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXPONENTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExponential() <em>Is Exponential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExponential()
	 * @generated
	 * @ordered
	 */
	protected boolean isExponential = IS_EXPONENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLogarithmic() <em>Is Logarithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLogarithmic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOGARITHMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLogarithmic() <em>Is Logarithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLogarithmic()
	 * @generated
	 * @ordered
	 */
	protected boolean isLogarithmic = IS_LOGARITHMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected static final float GRADIENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected float gradient = GRADIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected static final float CONSTANT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected float constant = CONSTANT_EDEFAULT;

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
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected float power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPower() <em>Is Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_POWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPower() <em>Is Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPower()
	 * @generated
	 * @ordered
	 */
	protected boolean isPower = IS_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveFunctionTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimerPackage.Literals.EVE_FUNCTION_TIMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__COUNTER, oldCounter, counter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__MAX_REPEAT, oldMaxRepeat, maxRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExponential() {
		return isExponential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsExponential(boolean newIsExponential) {
		if(newIsExponential == true){
			setIsLogarithmic(false);
			setIsPower(false);
		}
		boolean oldIsExponential = isExponential;
		isExponential = newIsExponential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__IS_EXPONENTIAL, oldIsExponential, isExponential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLogarithmic() {
		return isLogarithmic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsLogarithmic(boolean newIsLogarithmic) {
		if(newIsLogarithmic == true){
			setIsExponential(false);
			setIsPower(false);
		}
		boolean oldIsLogarithmic = isLogarithmic;
		isLogarithmic = newIsLogarithmic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__IS_LOGARITHMIC, oldIsLogarithmic, isLogarithmic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGradient() {
		return gradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(float newGradient) {
		float oldGradient = gradient;
		gradient = newGradient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__GRADIENT, oldGradient, gradient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(float newConstant) {
		float oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__CONSTANT, oldConstant, constant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__SLEEP, oldSleep, sleep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(float newPower) {
		float oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPower() {
		return isPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsPower(boolean newIsPower) {
		if(newIsPower == true){
			setIsExponential(false);
			setIsLogarithmic(false);
		}
		boolean oldIsPower = isPower;
		isPower = newIsPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimerPackage.EVE_FUNCTION_TIMER__IS_POWER, oldIsPower, isPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean setExponetial() {

		setIsExponential(true);
		setIsLogarithmic(false);
		setIsPower(false);

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean setLogarithmic() {

		setIsExponential(false);
		setIsLogarithmic(true);
		setIsPower(false);

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean setPower() {
		setIsExponential(false);
		setIsLogarithmic(false);
		setIsPower(true);

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimerPackage.EVE_FUNCTION_TIMER__COUNTER:
				return getCounter();
			case TimerPackage.EVE_FUNCTION_TIMER__MAX_REPEAT:
				return getMaxRepeat();
			case TimerPackage.EVE_FUNCTION_TIMER__IS_EXPONENTIAL:
				return isIsExponential();
			case TimerPackage.EVE_FUNCTION_TIMER__IS_LOGARITHMIC:
				return isIsLogarithmic();
			case TimerPackage.EVE_FUNCTION_TIMER__GRADIENT:
				return getGradient();
			case TimerPackage.EVE_FUNCTION_TIMER__CONSTANT:
				return getConstant();
			case TimerPackage.EVE_FUNCTION_TIMER__SLEEP:
				return getSleep();
			case TimerPackage.EVE_FUNCTION_TIMER__POWER:
				return getPower();
			case TimerPackage.EVE_FUNCTION_TIMER__IS_POWER:
				return isIsPower();
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
			case TimerPackage.EVE_FUNCTION_TIMER__COUNTER:
				setCounter((Long)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__MAX_REPEAT:
				setMaxRepeat((Integer)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_EXPONENTIAL:
				setIsExponential((Boolean)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_LOGARITHMIC:
				setIsLogarithmic((Boolean)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__GRADIENT:
				setGradient((Float)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__CONSTANT:
				setConstant((Float)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__SLEEP:
				setSleep((Long)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__POWER:
				setPower((Float)newValue);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_POWER:
				setIsPower((Boolean)newValue);
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
			case TimerPackage.EVE_FUNCTION_TIMER__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__MAX_REPEAT:
				setMaxRepeat(MAX_REPEAT_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_EXPONENTIAL:
				setIsExponential(IS_EXPONENTIAL_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_LOGARITHMIC:
				setIsLogarithmic(IS_LOGARITHMIC_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__GRADIENT:
				setGradient(GRADIENT_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__SLEEP:
				setSleep(SLEEP_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_POWER:
				setIsPower(IS_POWER_EDEFAULT);
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
			case TimerPackage.EVE_FUNCTION_TIMER__COUNTER:
				return counter != COUNTER_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__MAX_REPEAT:
				return maxRepeat != MAX_REPEAT_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_EXPONENTIAL:
				return isExponential != IS_EXPONENTIAL_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_LOGARITHMIC:
				return isLogarithmic != IS_LOGARITHMIC_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__GRADIENT:
				return gradient != GRADIENT_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__SLEEP:
				return sleep != SLEEP_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__POWER:
				return power != POWER_EDEFAULT;
			case TimerPackage.EVE_FUNCTION_TIMER__IS_POWER:
				return isPower != IS_POWER_EDEFAULT;
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
		result.append(" (counter: ");
		result.append(counter);
		result.append(", maxRepeat: ");
		result.append(maxRepeat);
		result.append(", isExponential: ");
		result.append(isExponential);
		result.append(", isLogarithmic: ");
		result.append(isLogarithmic);
		result.append(", gradient: ");
		result.append(gradient);
		result.append(", constant: ");
		result.append(constant);
		result.append(", sleep: ");
		result.append(sleep);
		result.append(", power: ");
		result.append(power);
		result.append(", isPower: ");
		result.append(isPower);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void sendMessage(String type, String message) {
		EveSimServerSession session = EveComponentRegistry.getInstance().getSession(this.getSessionID());
		//send as an EveLogMessage
		if(type.equals("log")){
			EveLogMessage msg = MsgFactory.eINSTANCE.createEveLogMessage();
			msg.setSenderUUID(this.getUuid());
			msg.setMessage(message);
			msg.setTimestamp(System.currentTimeMillis());
			session.putMessage(msg);
		}
		//send as EveSerializedMessage
		else if(type.equals("serial")){
			EveSerializedMessage msg = MsgFactory.eINSTANCE.createEveSerializedMessage();
			msg.setSenderUUID(this.getUuid());
			msg.setPayload(message);
			msg.setTimestamp(System.currentTimeMillis());
			session.putMessage(msg);
		}
		else{
			//for other messages
		}
	}

} //EveFunctionTimerImpl
