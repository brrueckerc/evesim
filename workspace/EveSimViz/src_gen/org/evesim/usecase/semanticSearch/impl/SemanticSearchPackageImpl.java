/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch.impl;

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
import org.evesim.usecase.semanticSearch.EveAgentSemanticSearch;
import org.evesim.usecase.semanticSearch.EveServiceSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchFactory;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;
import org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticSearchPackageImpl extends EPackageImpl implements SemanticSearchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveAgentSemanticSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveServiceSemanticSearchEClass = null;

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
	 * @see org.evesim.usecase.semanticSearch.SemanticSearchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemanticSearchPackageImpl() {
		super(eNS_URI, SemanticSearchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SemanticSearchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemanticSearchPackage init() {
		if (isInited) return (SemanticSearchPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI);

		// Obtain or create and register package
		SemanticSearchPackageImpl theSemanticSearchPackage = (SemanticSearchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SemanticSearchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SemanticSearchPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EvesimPackageImpl theEvesimPackage = (EvesimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) instanceof EvesimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) : EvesimPackage.eINSTANCE);
		TimerPackageImpl theTimerPackage = (TimerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) instanceof TimerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) : TimerPackage.eINSTANCE);
		SocialNetworkAnalysisPackageImpl theSocialNetworkAnalysisPackage = (SocialNetworkAnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) instanceof SocialNetworkAnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) : SocialNetworkAnalysisPackage.eINSTANCE);
		MsgPackageImpl theMsgPackage = (MsgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) instanceof MsgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) : MsgPackage.eINSTANCE);
		MonitorPackageImpl theMonitorPackage = (MonitorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) instanceof MonitorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) : MonitorPackage.eINSTANCE);

		// Create package meta-data objects
		theSemanticSearchPackage.createPackageContents();
		theEvesimPackage.createPackageContents();
		theTimerPackage.createPackageContents();
		theSocialNetworkAnalysisPackage.createPackageContents();
		theMsgPackage.createPackageContents();
		theMonitorPackage.createPackageContents();

		// Initialize created meta-data
		theSemanticSearchPackage.initializePackageContents();
		theEvesimPackage.initializePackageContents();
		theTimerPackage.initializePackageContents();
		theSocialNetworkAnalysisPackage.initializePackageContents();
		theMsgPackage.initializePackageContents();
		theMonitorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemanticSearchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemanticSearchPackage.eNS_URI, theSemanticSearchPackage);
		return theSemanticSearchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveAgentSemanticSearch() {
		return eveAgentSemanticSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveServiceSemanticSearch() {
		return eveServiceSemanticSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticSearchFactory getSemanticSearchFactory() {
		return (SemanticSearchFactory)getEFactoryInstance();
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
		eveAgentSemanticSearchEClass = createEClass(EVE_AGENT_SEMANTIC_SEARCH);

		eveServiceSemanticSearchEClass = createEClass(EVE_SERVICE_SEMANTIC_SEARCH);
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
		eveAgentSemanticSearchEClass.getESuperTypes().add(theEvesimPackage.getEveAgent());
		eveServiceSemanticSearchEClass.getESuperTypes().add(theEvesimPackage.getEveService());

		// Initialize classes and features; add operations and parameters
		initEClass(eveAgentSemanticSearchEClass, EveAgentSemanticSearch.class, "EveAgentSemanticSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eveServiceSemanticSearchEClass, EveServiceSemanticSearch.class, "EveServiceSemanticSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SemanticSearchPackageImpl
