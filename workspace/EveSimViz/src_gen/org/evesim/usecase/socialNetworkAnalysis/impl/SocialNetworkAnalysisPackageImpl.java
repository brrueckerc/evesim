/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis.impl;

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
import org.evesim.timer.TimerPackage;
import org.evesim.timer.impl.TimerPackageImpl;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;
import org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;
import org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent;
import org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialNetworkAnalysisPackageImpl extends EPackageImpl implements SocialNetworkAnalysisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveAgentSNAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveGatewaySNAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveEvolutionaryAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveHistoryAgentEClass = null;

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
	 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SocialNetworkAnalysisPackageImpl() {
		super(eNS_URI, SocialNetworkAnalysisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SocialNetworkAnalysisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SocialNetworkAnalysisPackage init() {
		if (isInited) return (SocialNetworkAnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI);

		// Obtain or create and register package
		SocialNetworkAnalysisPackageImpl theSocialNetworkAnalysisPackage = (SocialNetworkAnalysisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SocialNetworkAnalysisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SocialNetworkAnalysisPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EvesimPackageImpl theEvesimPackage = (EvesimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) instanceof EvesimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) : EvesimPackage.eINSTANCE);
		TimerPackageImpl theTimerPackage = (TimerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) instanceof TimerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) : TimerPackage.eINSTANCE);
		SemanticSearchPackageImpl theSemanticSearchPackage = (SemanticSearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) instanceof SemanticSearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) : SemanticSearchPackage.eINSTANCE);
		MsgPackageImpl theMsgPackage = (MsgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) instanceof MsgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) : MsgPackage.eINSTANCE);
		MonitorPackageImpl theMonitorPackage = (MonitorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) instanceof MonitorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) : MonitorPackage.eINSTANCE);

		// Create package meta-data objects
		theSocialNetworkAnalysisPackage.createPackageContents();
		theEvesimPackage.createPackageContents();
		theTimerPackage.createPackageContents();
		theSemanticSearchPackage.createPackageContents();
		theMsgPackage.createPackageContents();
		theMonitorPackage.createPackageContents();

		// Initialize created meta-data
		theSocialNetworkAnalysisPackage.initializePackageContents();
		theEvesimPackage.initializePackageContents();
		theTimerPackage.initializePackageContents();
		theSemanticSearchPackage.initializePackageContents();
		theMsgPackage.initializePackageContents();
		theMonitorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSocialNetworkAnalysisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SocialNetworkAnalysisPackage.eNS_URI, theSocialNetworkAnalysisPackage);
		return theSocialNetworkAnalysisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveAgentSNA() {
		return eveAgentSNAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgentSNA_EditingPropability() {
		return (EAttribute)eveAgentSNAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgentSNA_DeletingPropability() {
		return (EAttribute)eveAgentSNAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgentSNA_CreatingPropability() {
		return (EAttribute)eveAgentSNAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgentSNA_Started() {
		return (EAttribute)eveAgentSNAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveGatewaySNA() {
		return eveGatewaySNAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveEvolutionaryAgent() {
		return eveEvolutionaryAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveEvolutionaryAgent_IsRoot() {
		return (EAttribute)eveEvolutionaryAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveHistoryAgent() {
		return eveHistoryAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryAgent_IsRoot() {
		return (EAttribute)eveHistoryAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryAgent_Birthdate() {
		return (EAttribute)eveHistoryAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryAgent_HistData() {
		return (EAttribute)eveHistoryAgentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveHistoryAgent_SimInterval() {
		return (EAttribute)eveHistoryAgentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkAnalysisFactory getSocialNetworkAnalysisFactory() {
		return (SocialNetworkAnalysisFactory)getEFactoryInstance();
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
		eveAgentSNAEClass = createEClass(EVE_AGENT_SNA);
		createEAttribute(eveAgentSNAEClass, EVE_AGENT_SNA__EDITING_PROPABILITY);
		createEAttribute(eveAgentSNAEClass, EVE_AGENT_SNA__DELETING_PROPABILITY);
		createEAttribute(eveAgentSNAEClass, EVE_AGENT_SNA__CREATING_PROPABILITY);
		createEAttribute(eveAgentSNAEClass, EVE_AGENT_SNA__STARTED);

		eveGatewaySNAEClass = createEClass(EVE_GATEWAY_SNA);

		eveEvolutionaryAgentEClass = createEClass(EVE_EVOLUTIONARY_AGENT);
		createEAttribute(eveEvolutionaryAgentEClass, EVE_EVOLUTIONARY_AGENT__IS_ROOT);

		eveHistoryAgentEClass = createEClass(EVE_HISTORY_AGENT);
		createEAttribute(eveHistoryAgentEClass, EVE_HISTORY_AGENT__IS_ROOT);
		createEAttribute(eveHistoryAgentEClass, EVE_HISTORY_AGENT__BIRTHDATE);
		createEAttribute(eveHistoryAgentEClass, EVE_HISTORY_AGENT__HIST_DATA);
		createEAttribute(eveHistoryAgentEClass, EVE_HISTORY_AGENT__SIM_INTERVAL);
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
		eveAgentSNAEClass.getESuperTypes().add(theEvesimPackage.getEveAgent());
		eveGatewaySNAEClass.getESuperTypes().add(theEvesimPackage.getEveComponent());
		eveEvolutionaryAgentEClass.getESuperTypes().add(theEvesimPackage.getEveAgent());
		eveHistoryAgentEClass.getESuperTypes().add(theEvesimPackage.getEveAgent());

		// Initialize classes and features; add operations and parameters
		initEClass(eveAgentSNAEClass, EveAgentSNA.class, "EveAgentSNA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveAgentSNA_EditingPropability(), ecorePackage.getEInt(), "editingPropability", null, 0, 1, EveAgentSNA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveAgentSNA_DeletingPropability(), ecorePackage.getEInt(), "deletingPropability", null, 0, 1, EveAgentSNA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveAgentSNA_CreatingPropability(), ecorePackage.getEInt(), "creatingPropability", null, 0, 1, EveAgentSNA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveAgentSNA_Started(), ecorePackage.getEBoolean(), "started", null, 0, 1, EveAgentSNA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveGatewaySNAEClass, EveGatewaySNA.class, "EveGatewaySNA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eveEvolutionaryAgentEClass, EveEvolutionaryAgent.class, "EveEvolutionaryAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveEvolutionaryAgent_IsRoot(), ecorePackage.getEBoolean(), "isRoot", null, 0, 1, EveEvolutionaryAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveHistoryAgentEClass, EveHistoryAgent.class, "EveHistoryAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveHistoryAgent_IsRoot(), ecorePackage.getEBoolean(), "isRoot", null, 0, 1, EveHistoryAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveHistoryAgent_Birthdate(), ecorePackage.getEDate(), "Birthdate", null, 0, 1, EveHistoryAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveHistoryAgent_HistData(), ecorePackage.getEString(), "histData", null, 0, 1, EveHistoryAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveHistoryAgent_SimInterval(), ecorePackage.getEInt(), "simInterval", null, 0, 1, EveHistoryAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SocialNetworkAnalysisPackageImpl
