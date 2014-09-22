/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.evesim.EvesimPackage;
import org.evesim.impl.EvesimPackageImpl;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.impl.MonitorPackageImpl;
import org.evesim.msg.MsgPackage;
import org.evesim.msg.impl.MsgPackageImpl;
import org.evesim.timer.EveFunctionTimer;
import org.evesim.timer.EveHistoryTimer;
import org.evesim.timer.EveRepeatingTimer;
import org.evesim.timer.EveStartingTimer;
import org.evesim.timer.EveTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.timer.TimerPackage;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;
import org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;
import org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimerPackageImpl extends EPackageImpl implements TimerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveRepeatingTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveStartingTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveFunctionTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveHistoryTimerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.evesim.timer.TimerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimerPackageImpl() {
		super(eNS_URI, TimerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TimerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimerPackage init() {
		if (isInited) return (TimerPackage)EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI);

		// Obtain or create and register package
		TimerPackageImpl theTimerPackage = (TimerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EvesimPackageImpl theEvesimPackage = (EvesimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) instanceof EvesimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) : EvesimPackage.eINSTANCE);
		SemanticSearchPackageImpl theSemanticSearchPackage = (SemanticSearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) instanceof SemanticSearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) : SemanticSearchPackage.eINSTANCE);
		SocialNetworkAnalysisPackageImpl theSocialNetworkAnalysisPackage = (SocialNetworkAnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) instanceof SocialNetworkAnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) : SocialNetworkAnalysisPackage.eINSTANCE);
		MsgPackageImpl theMsgPackage = (MsgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) instanceof MsgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) : MsgPackage.eINSTANCE);
		MonitorPackageImpl theMonitorPackage = (MonitorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) instanceof MonitorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) : MonitorPackage.eINSTANCE);

		// Create package meta-data objects
		theTimerPackage.createPackageContents();
		theEvesimPackage.createPackageContents();
		theSemanticSearchPackage.createPackageContents();
		theSocialNetworkAnalysisPackage.createPackageContents();
		theMsgPackage.createPackageContents();
		theMonitorPackage.createPackageContents();

		// Initialize created meta-data
		theTimerPackage.initializePackageContents();
		theEvesimPackage.initializePackageContents();
		theSemanticSearchPackage.initializePackageContents();
		theSocialNetworkAnalysisPackage.initializePackageContents();
		theMsgPackage.initializePackageContents();
		theMonitorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimerPackage.eNS_URI, theTimerPackage);
		return theTimerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveTimer() {
		return eveTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveTimer_TimerThread() {
		return (EAttribute)eveTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveTimer_Running() {
		return (EAttribute)eveTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveRepeatingTimer() {
		return eveRepeatingTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveRepeatingTimer_MaxRepeat() {
		return (EAttribute)eveRepeatingTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveRepeatingTimer_Sleep() {
		return (EAttribute)eveRepeatingTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveRepeatingTimer_Counter() {
		return (EAttribute)eveRepeatingTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveStartingTimer() {
		return eveStartingTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveFunctionTimer() {
		return eveFunctionTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_Counter() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_MaxRepeat() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_IsExponential() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_IsLogarithmic() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_Gradient() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_Constant() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_Sleep() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_Power() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFunctionTimer_IsPower() {
		return (EAttribute)eveFunctionTimerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveHistoryTimer() {
		return eveHistoryTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryTimer_CurrentTime() {
		return (EAttribute)eveHistoryTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryTimer_MaxRepeat() {
		return (EAttribute)eveHistoryTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryTimer_Sleep() {
		return (EAttribute)eveHistoryTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryTimer_Counter() {
		return (EAttribute)eveHistoryTimerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryTimer_SimInterval() {
		return (EAttribute)eveHistoryTimerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerFactory getTimerFactory() {
		return (TimerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eveTimerEClass = createEClass(EVE_TIMER);
		createEAttribute(eveTimerEClass, EVE_TIMER__TIMER_THREAD);
		createEAttribute(eveTimerEClass, EVE_TIMER__RUNNING);

		eveRepeatingTimerEClass = createEClass(EVE_REPEATING_TIMER);
		createEAttribute(eveRepeatingTimerEClass, EVE_REPEATING_TIMER__MAX_REPEAT);
		createEAttribute(eveRepeatingTimerEClass, EVE_REPEATING_TIMER__SLEEP);
		createEAttribute(eveRepeatingTimerEClass, EVE_REPEATING_TIMER__COUNTER);

		eveStartingTimerEClass = createEClass(EVE_STARTING_TIMER);

		eveFunctionTimerEClass = createEClass(EVE_FUNCTION_TIMER);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__COUNTER);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__MAX_REPEAT);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__IS_EXPONENTIAL);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__IS_LOGARITHMIC);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__GRADIENT);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__CONSTANT);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__SLEEP);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__POWER);
		createEAttribute(eveFunctionTimerEClass, EVE_FUNCTION_TIMER__IS_POWER);

		eveHistoryTimerEClass = createEClass(EVE_HISTORY_TIMER);
		createEAttribute(eveHistoryTimerEClass, EVE_HISTORY_TIMER__CURRENT_TIME);
		createEAttribute(eveHistoryTimerEClass, EVE_HISTORY_TIMER__MAX_REPEAT);
		createEAttribute(eveHistoryTimerEClass, EVE_HISTORY_TIMER__SLEEP);
		createEAttribute(eveHistoryTimerEClass, EVE_HISTORY_TIMER__COUNTER);
		createEAttribute(eveHistoryTimerEClass, EVE_HISTORY_TIMER__SIM_INTERVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EvesimPackage theEvesimPackage = (EvesimPackage)EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eveTimerEClass.getESuperTypes().add(theEvesimPackage.getEveComponent());
		eveTimerEClass.getESuperTypes().add(theEvesimPackage.getRunnable());
		eveTimerEClass.getESuperTypes().add(theEvesimPackage.getIControllable());
		eveRepeatingTimerEClass.getESuperTypes().add(this.getEveTimer());
		eveStartingTimerEClass.getESuperTypes().add(this.getEveTimer());
		eveFunctionTimerEClass.getESuperTypes().add(this.getEveTimer());
		eveHistoryTimerEClass.getESuperTypes().add(this.getEveTimer());

		// Initialize classes and features; add operations and parameters
		initEClass(eveTimerEClass, EveTimer.class, "EveTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveTimer_TimerThread(), theEvesimPackage.getThread(), "timerThread", null, 0, 1, EveTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveTimer_Running(), ecorePackage.getEBooleanObject(), "running", "false", 0, 1, EveTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveTimerEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveTimerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveTimerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveRepeatingTimerEClass, EveRepeatingTimer.class, "EveRepeatingTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveRepeatingTimer_MaxRepeat(), ecorePackage.getEInt(), "maxRepeat", null, 0, 1, EveRepeatingTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveRepeatingTimer_Sleep(), ecorePackage.getELong(), "sleep", null, 0, 1, EveRepeatingTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveRepeatingTimer_Counter(), ecorePackage.getELong(), "counter", null, 0, 1, EveRepeatingTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveRepeatingTimerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveStartingTimerEClass, EveStartingTimer.class, "EveStartingTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eveStartingTimerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveFunctionTimerEClass, EveFunctionTimer.class, "EveFunctionTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveFunctionTimer_Counter(), ecorePackage.getELong(), "counter", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_MaxRepeat(), ecorePackage.getEInt(), "maxRepeat", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_IsExponential(), ecorePackage.getEBoolean(), "isExponential", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_IsLogarithmic(), ecorePackage.getEBoolean(), "isLogarithmic", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_Gradient(), ecorePackage.getEFloat(), "gradient", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_Constant(), ecorePackage.getEFloat(), "constant", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_Sleep(), ecorePackage.getELong(), "sleep", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_Power(), ecorePackage.getEFloat(), "power", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFunctionTimer_IsPower(), ecorePackage.getEBoolean(), "isPower", null, 0, 1, EveFunctionTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveFunctionTimerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveFunctionTimerEClass, ecorePackage.getEBoolean(), "setExponetial", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveFunctionTimerEClass, ecorePackage.getEBoolean(), "setLogarithmic", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveFunctionTimerEClass, ecorePackage.getEBoolean(), "setPower", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveHistoryTimerEClass, EveHistoryTimer.class, "EveHistoryTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveHistoryTimer_CurrentTime(), ecorePackage.getELong(), "currentTime", null, 0, 1, EveHistoryTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveHistoryTimer_MaxRepeat(), ecorePackage.getEInt(), "maxRepeat", null, 0, 1, EveHistoryTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveHistoryTimer_Sleep(), ecorePackage.getELong(), "sleep", null, 0, 1, EveHistoryTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveHistoryTimer_Counter(), ecorePackage.getELong(), "counter", null, 0, 1, EveHistoryTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveHistoryTimer_SimInterval(), ecorePackage.getEInt(), "simInterval", null, 0, 1, EveHistoryTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveHistoryTimerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //TimerPackageImpl
