/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.evesim.EvesimPackage;
import org.evesim.impl.EvesimPackageImpl;
import org.evesim.monitor.EveMonitorNode;
import org.evesim.monitor.EveMonitorPeerGroup;
import org.evesim.monitor.MonitorFactory;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.NodeStatus;
import org.evesim.msg.MsgPackage;
import org.evesim.msg.impl.MsgPackageImpl;
import org.evesim.timer.TimerPackage;
import org.evesim.timer.impl.TimerPackageImpl;
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
public class MonitorPackageImpl extends EPackageImpl implements MonitorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveMonitorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveMonitorPeerGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeStatusEEnum = null;

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
	 * @see org.evesim.monitor.MonitorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MonitorPackageImpl() {
		super(eNS_URI, MonitorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MonitorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MonitorPackage init() {
		if (isInited) return (MonitorPackage)EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI);

		// Obtain or create and register package
		MonitorPackageImpl theMonitorPackage = (MonitorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MonitorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MonitorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EvesimPackageImpl theEvesimPackage = (EvesimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) instanceof EvesimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) : EvesimPackage.eINSTANCE);
		TimerPackageImpl theTimerPackage = (TimerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) instanceof TimerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) : TimerPackage.eINSTANCE);
		SemanticSearchPackageImpl theSemanticSearchPackage = (SemanticSearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) instanceof SemanticSearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) : SemanticSearchPackage.eINSTANCE);
		SocialNetworkAnalysisPackageImpl theSocialNetworkAnalysisPackage = (SocialNetworkAnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) instanceof SocialNetworkAnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) : SocialNetworkAnalysisPackage.eINSTANCE);
		MsgPackageImpl theMsgPackage = (MsgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) instanceof MsgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) : MsgPackage.eINSTANCE);

		// Create package meta-data objects
		theMonitorPackage.createPackageContents();
		theEvesimPackage.createPackageContents();
		theTimerPackage.createPackageContents();
		theSemanticSearchPackage.createPackageContents();
		theSocialNetworkAnalysisPackage.createPackageContents();
		theMsgPackage.createPackageContents();

		// Initialize created meta-data
		theMonitorPackage.initializePackageContents();
		theEvesimPackage.initializePackageContents();
		theTimerPackage.initializePackageContents();
		theSemanticSearchPackage.initializePackageContents();
		theSocialNetworkAnalysisPackage.initializePackageContents();
		theMsgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMonitorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MonitorPackage.eNS_URI, theMonitorPackage);
		return theMonitorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveMonitorNode() {
		return eveMonitorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveMonitorNode_NodeStatus() {
		return (EAttribute)eveMonitorNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveMonitorPeerGroup() {
		return eveMonitorPeerGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeStatus() {
		return nodeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorFactory getMonitorFactory() {
		return (MonitorFactory)getEFactoryInstance();
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
		eveMonitorNodeEClass = createEClass(EVE_MONITOR_NODE);
		createEAttribute(eveMonitorNodeEClass, EVE_MONITOR_NODE__NODE_STATUS);

		eveMonitorPeerGroupEClass = createEClass(EVE_MONITOR_PEER_GROUP);

		// Create enums
		nodeStatusEEnum = createEEnum(NODE_STATUS);
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
		eveMonitorNodeEClass.getESuperTypes().add(theEvesimPackage.getEveComponent());
		eveMonitorPeerGroupEClass.getESuperTypes().add(theEvesimPackage.getEveComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(eveMonitorNodeEClass, EveMonitorNode.class, "EveMonitorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveMonitorNode_NodeStatus(), this.getNodeStatus(), "nodeStatus", null, 0, 1, EveMonitorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveMonitorPeerGroupEClass, EveMonitorPeerGroup.class, "EveMonitorPeerGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(nodeStatusEEnum, NodeStatus.class, "NodeStatus");
		addEEnumLiteral(nodeStatusEEnum, NodeStatus.OK);
		addEEnumLiteral(nodeStatusEEnum, NodeStatus.FAIL);
		addEEnumLiteral(nodeStatusEEnum, NodeStatus.RECOVERING);
	}

} //MonitorPackageImpl
