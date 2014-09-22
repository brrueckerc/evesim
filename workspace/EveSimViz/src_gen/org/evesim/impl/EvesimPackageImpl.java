/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import static org.evesim.EvesimPackage.CLASS;

import java.io.Serializable;
import java.lang.Runnable;
import java.lang.Throwable;
import java.util.Hashtable;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EveLocation;
import org.evesim.EveMessageSink;
import org.evesim.EveMonitor;
import org.evesim.EveNode;
import org.evesim.EveNodeServer;
import org.evesim.EveNodeType;
import org.evesim.EvePrototype;
import org.evesim.EveService;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.IControllable;
import org.evesim.IKmlProvider;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.impl.MonitorPackageImpl;
import org.evesim.msg.MsgPackage;
import org.evesim.msg.impl.MsgPackageImpl;
import org.evesim.timer.TimerPackage;
import org.evesim.timer.impl.TimerPackageImpl;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;
import org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;
import org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl;
import org.mortbay.jetty.Server;

import de.micromata.opengis.kml.v_2_2_0.Document;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvesimPackageImpl extends EPackageImpl implements EvesimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveSimulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveNodeServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evePrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveMessageSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iControllableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAdaptableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iKmlProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eveNodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sessionIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType threadEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eveComponentHashtableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jettyServerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kmlContainerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classEDataType = null;

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
	 * @see org.evesim.EvesimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvesimPackageImpl() {
		super(eNS_URI, EvesimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvesimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvesimPackage init() {
		if (isInited) return (EvesimPackage)EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI);

		// Obtain or create and register package
		EvesimPackageImpl theEvesimPackage = (EvesimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvesimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvesimPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TimerPackageImpl theTimerPackage = (TimerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) instanceof TimerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) : TimerPackage.eINSTANCE);
		SemanticSearchPackageImpl theSemanticSearchPackage = (SemanticSearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) instanceof SemanticSearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) : SemanticSearchPackage.eINSTANCE);
		SocialNetworkAnalysisPackageImpl theSocialNetworkAnalysisPackage = (SocialNetworkAnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) instanceof SocialNetworkAnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) : SocialNetworkAnalysisPackage.eINSTANCE);
		MsgPackageImpl theMsgPackage = (MsgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) instanceof MsgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI) : MsgPackage.eINSTANCE);
		MonitorPackageImpl theMonitorPackage = (MonitorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) instanceof MonitorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) : MonitorPackage.eINSTANCE);

		// Create package meta-data objects
		theEvesimPackage.createPackageContents();
		theTimerPackage.createPackageContents();
		theSemanticSearchPackage.createPackageContents();
		theSocialNetworkAnalysisPackage.createPackageContents();
		theMsgPackage.createPackageContents();
		theMonitorPackage.createPackageContents();

		// Initialize created meta-data
		theEvesimPackage.initializePackageContents();
		theTimerPackage.initializePackageContents();
		theSemanticSearchPackage.initializePackageContents();
		theSocialNetworkAnalysisPackage.initializePackageContents();
		theMsgPackage.initializePackageContents();
		theMonitorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvesimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvesimPackage.eNS_URI, theEvesimPackage);
		return theEvesimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveComponent() {
		return eveComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_Uuid() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_Uri() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveComponent_Parent() {
		return (EReference)eveComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_SessionID() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_Name() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_Description() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveComponent_Children() {
		return (EReference)eveComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_LocLongitude() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_LocLatitude() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_LocCountry() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_LocCity() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_LocPONr() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_LocAddress() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_LocLocation() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_NetIP() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_NetUrl() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveComponent_Location() {
		return (EReference)eveComponentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveComponent_TimeStamp() {
		return (EAttribute)eveComponentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveComponent_AttachedConnections() {
		return (EReference)eveComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveSimulation() {
		return eveSimulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveSimulation_StepDuration() {
		return (EAttribute)eveSimulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveSimulation_StepCount() {
		return (EAttribute)eveSimulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveMonitor() {
		return eveMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveMonitor_SleepTime() {
		return (EAttribute)eveMonitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveNode() {
		return eveNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveNode_MessageQueue() {
		return (EReference)eveNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveNode_Server() {
		return (EReference)eveNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveNode_NodeType() {
		return (EAttribute)eveNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveNode_ServerUrl() {
		return (EAttribute)eveNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveNodeServer() {
		return eveNodeServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveNodeServer_Node() {
		return (EReference)eveNodeServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveNodeServer_JettyServer() {
		return (EAttribute)eveNodeServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveNodeServer_ServerHost() {
		return (EAttribute)eveNodeServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveNodeServer_ServerPort() {
		return (EAttribute)eveNodeServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveNodeServer_Thread() {
		return (EAttribute)eveNodeServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvePrototype() {
		return evePrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveAgent() {
		return eveAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgent_PrototypeUUID() {
		return (EAttribute)eveAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveAgent_Prototype() {
		return (EReference)eveAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgent_AgentPoolUUID() {
		return (EAttribute)eveAgentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveAgent_AgentPool() {
		return (EReference)eveAgentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveAgent_DemandedServices() {
		return (EReference)eveAgentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveAgent_OfferedServices() {
		return (EReference)eveAgentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveAgent_LocalServicePool() {
		return (EReference)eveAgentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgent_Betweeness() {
		return (EAttribute)eveAgentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveAgent_Type() {
		return (EAttribute)eveAgentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveService() {
		return eveServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveConnection() {
		return eveConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveConnection_ConnectedComponent() {
		return (EReference)eveConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveConnection_Strength() {
		return (EAttribute)eveConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveConnection_Connected() {
		return (EAttribute)eveConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveConnection_Type() {
		return (EAttribute)eveConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveConnection_Directional() {
		return (EAttribute)eveConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveMessageSink() {
		return eveMessageSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnable() {
		return runnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializable() {
		return serializableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowable() {
		return throwableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIControllable() {
		return iControllableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAdaptable() {
		return iAdaptableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIKmlProvider() {
		return iKmlProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveLocation() {
		return eveLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLocation_LocLongitude() {
		return (EAttribute)eveLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLocation_LocLatitude() {
		return (EAttribute)eveLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLocation_LocCountry() {
		return (EAttribute)eveLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLocation_LocCity() {
		return (EAttribute)eveLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLocation_LocPONr() {
		return (EAttribute)eveLocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLocation_LocAddress() {
		return (EAttribute)eveLocationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLocation_LocLocation() {
		return (EAttribute)eveLocationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEveNodeType() {
		return eveNodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSessionID() {
		return sessionIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThread() {
		return threadEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUUID() {
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEveComponentHashtable() {
		return eveComponentHashtableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJettyServer() {
		return jettyServerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKmlContainer() {
		return kmlContainerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClass_() {
		return classEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvesimFactory getEvesimFactory() {
		return (EvesimFactory)getEFactoryInstance();
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
		eveComponentEClass = createEClass(EVE_COMPONENT);
		createEReference(eveComponentEClass, EVE_COMPONENT__ATTACHED_CONNECTIONS);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__UUID);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__URI);
		createEReference(eveComponentEClass, EVE_COMPONENT__PARENT);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__SESSION_ID);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__NAME);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__DESCRIPTION);
		createEReference(eveComponentEClass, EVE_COMPONENT__CHILDREN);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__LOC_LONGITUDE);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__LOC_LATITUDE);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__LOC_COUNTRY);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__LOC_CITY);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__LOC_PO_NR);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__LOC_ADDRESS);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__LOC_LOCATION);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__NET_IP);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__NET_URL);
		createEReference(eveComponentEClass, EVE_COMPONENT__LOCATION);
		createEAttribute(eveComponentEClass, EVE_COMPONENT__TIME_STAMP);

		eveSimulationEClass = createEClass(EVE_SIMULATION);
		createEAttribute(eveSimulationEClass, EVE_SIMULATION__STEP_DURATION);
		createEAttribute(eveSimulationEClass, EVE_SIMULATION__STEP_COUNT);

		eveMonitorEClass = createEClass(EVE_MONITOR);
		createEAttribute(eveMonitorEClass, EVE_MONITOR__SLEEP_TIME);

		eveNodeEClass = createEClass(EVE_NODE);
		createEReference(eveNodeEClass, EVE_NODE__MESSAGE_QUEUE);
		createEReference(eveNodeEClass, EVE_NODE__SERVER);
		createEAttribute(eveNodeEClass, EVE_NODE__NODE_TYPE);
		createEAttribute(eveNodeEClass, EVE_NODE__SERVER_URL);

		eveNodeServerEClass = createEClass(EVE_NODE_SERVER);
		createEReference(eveNodeServerEClass, EVE_NODE_SERVER__NODE);
		createEAttribute(eveNodeServerEClass, EVE_NODE_SERVER__JETTY_SERVER);
		createEAttribute(eveNodeServerEClass, EVE_NODE_SERVER__SERVER_HOST);
		createEAttribute(eveNodeServerEClass, EVE_NODE_SERVER__SERVER_PORT);
		createEAttribute(eveNodeServerEClass, EVE_NODE_SERVER__THREAD);

		evePrototypeEClass = createEClass(EVE_PROTOTYPE);

		eveAgentEClass = createEClass(EVE_AGENT);
		createEAttribute(eveAgentEClass, EVE_AGENT__PROTOTYPE_UUID);
		createEReference(eveAgentEClass, EVE_AGENT__PROTOTYPE);
		createEAttribute(eveAgentEClass, EVE_AGENT__AGENT_POOL_UUID);
		createEReference(eveAgentEClass, EVE_AGENT__AGENT_POOL);
		createEReference(eveAgentEClass, EVE_AGENT__DEMANDED_SERVICES);
		createEReference(eveAgentEClass, EVE_AGENT__OFFERED_SERVICES);
		createEReference(eveAgentEClass, EVE_AGENT__LOCAL_SERVICE_POOL);
		createEAttribute(eveAgentEClass, EVE_AGENT__BETWEENESS);
		createEAttribute(eveAgentEClass, EVE_AGENT__TYPE);

		eveServiceEClass = createEClass(EVE_SERVICE);

		eveConnectionEClass = createEClass(EVE_CONNECTION);
		createEReference(eveConnectionEClass, EVE_CONNECTION__CONNECTED_COMPONENT);
		createEAttribute(eveConnectionEClass, EVE_CONNECTION__STRENGTH);
		createEAttribute(eveConnectionEClass, EVE_CONNECTION__CONNECTED);
		createEAttribute(eveConnectionEClass, EVE_CONNECTION__TYPE);
		createEAttribute(eveConnectionEClass, EVE_CONNECTION__DIRECTIONAL);

		eveLocationEClass = createEClass(EVE_LOCATION);
		createEAttribute(eveLocationEClass, EVE_LOCATION__LOC_LONGITUDE);
		createEAttribute(eveLocationEClass, EVE_LOCATION__LOC_LATITUDE);
		createEAttribute(eveLocationEClass, EVE_LOCATION__LOC_COUNTRY);
		createEAttribute(eveLocationEClass, EVE_LOCATION__LOC_CITY);
		createEAttribute(eveLocationEClass, EVE_LOCATION__LOC_PO_NR);
		createEAttribute(eveLocationEClass, EVE_LOCATION__LOC_ADDRESS);
		createEAttribute(eveLocationEClass, EVE_LOCATION__LOC_LOCATION);

		eveMessageSinkEClass = createEClass(EVE_MESSAGE_SINK);

		runnableEClass = createEClass(RUNNABLE);

		iControllableEClass = createEClass(ICONTROLLABLE);

		iAdaptableEClass = createEClass(IADAPTABLE);

		iKmlProviderEClass = createEClass(IKML_PROVIDER);

		serializableEClass = createEClass(SERIALIZABLE);

		throwableEClass = createEClass(THROWABLE);

		// Create enums
		eveNodeTypeEEnum = createEEnum(EVE_NODE_TYPE);

		// Create data types
		sessionIDEDataType = createEDataType(SESSION_ID);
		uriEDataType = createEDataType(URI);
		threadEDataType = createEDataType(THREAD);
		uuidEDataType = createEDataType(UUID);
		eveComponentHashtableEDataType = createEDataType(EVE_COMPONENT_HASHTABLE);
		jettyServerEDataType = createEDataType(JETTY_SERVER);
		kmlContainerEDataType = createEDataType(KML_CONTAINER);
		classEDataType = createEDataType(CLASS);
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
		TimerPackage theTimerPackage = (TimerPackage)EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI);
		SemanticSearchPackage theSemanticSearchPackage = (SemanticSearchPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI);
		SocialNetworkAnalysisPackage theSocialNetworkAnalysisPackage = (SocialNetworkAnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI);
		MsgPackage theMsgPackage = (MsgPackage)EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI);
		MonitorPackage theMonitorPackage = (MonitorPackage)EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTimerPackage);
		getESubpackages().add(theSemanticSearchPackage);
		getESubpackages().add(theSocialNetworkAnalysisPackage);
		getESubpackages().add(theMsgPackage);
		getESubpackages().add(theMonitorPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eveComponentEClass.getESuperTypes().add(this.getSerializable());
		eveComponentEClass.getESuperTypes().add(this.getIAdaptable());
		eveComponentEClass.getESuperTypes().add(this.getIKmlProvider());
		eveSimulationEClass.getESuperTypes().add(this.getEveComponent());
		eveMonitorEClass.getESuperTypes().add(this.getEveComponent());
		eveNodeEClass.getESuperTypes().add(this.getEveComponent());
		eveNodeEClass.getESuperTypes().add(this.getEveMessageSink());
		eveNodeServerEClass.getESuperTypes().add(this.getRunnable());
		evePrototypeEClass.getESuperTypes().add(this.getEveAgent());
		eveAgentEClass.getESuperTypes().add(this.getEveComponent());
		eveAgentEClass.getESuperTypes().add(this.getIControllable());
		eveServiceEClass.getESuperTypes().add(this.getEveComponent());
		eveConnectionEClass.getESuperTypes().add(this.getEveComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(eveComponentEClass, EveComponent.class, "EveComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEveComponent_AttachedConnections(), this.getEveConnection(), this.getEveConnection_ConnectedComponent(), "attachedConnections", null, 0, -1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_Uuid(), this.getUUID(), "uuid", "default", 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_Uri(), this.getURI(), "uri", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveComponent_Parent(), this.getEveComponent(), this.getEveComponent_Children(), "parent", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEveComponent_Parent().getEKeys().add(this.getEveComponent_Uuid());
		initEAttribute(getEveComponent_SessionID(), this.getSessionID(), "sessionID", "", 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_Name(), ecorePackage.getEString(), "name", "", 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveComponent_Children(), this.getEveComponent(), this.getEveComponent_Parent(), "children", null, 0, -1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getEveComponent_Children().getEKeys().add(this.getEveComponent_Uuid());
		initEAttribute(getEveComponent_LocLongitude(), ecorePackage.getEFloat(), "locLongitude", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_LocLatitude(), ecorePackage.getEFloat(), "locLatitude", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_LocCountry(), ecorePackage.getEString(), "locCountry", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_LocCity(), ecorePackage.getEString(), "locCity", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_LocPONr(), ecorePackage.getEString(), "locPONr", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_LocAddress(), ecorePackage.getEString(), "locAddress", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_LocLocation(), ecorePackage.getEString(), "locLocation", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_NetIP(), ecorePackage.getEString(), "netIP", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_NetUrl(), ecorePackage.getEString(), "netUrl", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveComponent_Location(), this.getEveLocation(), null, "location", null, 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveComponent_TimeStamp(), ecorePackage.getELong(), "timeStamp", "0", 0, 1, EveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(eveComponentEClass, null, "addChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEveComponent(), "child", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveComponentEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eveComponentEClass, null, "removeChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEveComponent(), "child", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eveComponentEClass, null, "removeChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUUID(), "uuid", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eveComponentEClass, this.getEveComponent(), "lookupComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUUID(), "uuid", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveComponentEClass, ecorePackage.getEBoolean(), "isLocationValid", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eveComponentEClass, ecorePackage.getEBoolean(), "instanceOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClass_(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "className", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eveComponentEClass, ecorePackage.getEBoolean(), "instanceOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "className", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveComponentEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveComponentEClass, this.getEveComponent(), "getRootComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveComponentEClass, this.getEveConnection(), "getConnections", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveSimulationEClass, EveSimulation.class, "EveSimulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveSimulation_StepDuration(), ecorePackage.getELong(), "stepDuration", null, 0, 1, EveSimulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveSimulation_StepCount(), ecorePackage.getELong(), "stepCount", null, 0, 1, EveSimulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveSimulationEClass, null, "simStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveMonitorEClass, EveMonitor.class, "EveMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveMonitor_SleepTime(), ecorePackage.getEIntegerObject(), "sleepTime", "5", 1, 1, EveMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveMonitorEClass, null, "startMonitoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveMonitorEClass, null, "stopMonitoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveNodeEClass, EveNode.class, "EveNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEveNode_MessageQueue(), theMsgPackage.getEveMessage(), null, "messageQueue", null, 0, -1, EveNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveNode_Server(), this.getEveNodeServer(), this.getEveNodeServer_Node(), "server", null, 0, 1, EveNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveNode_NodeType(), this.getEveNodeType(), "nodeType", null, 0, 1, EveNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveNode_ServerUrl(), ecorePackage.getEString(), "serverUrl", null, 0, 1, EveNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eveNodeEClass, null, "submitMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMsgPackage.getEveMessage(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveNodeServerEClass, EveNodeServer.class, "EveNodeServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEveNodeServer_Node(), this.getEveNode(), this.getEveNode_Server(), "node", null, 0, 1, EveNodeServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveNodeServer_JettyServer(), this.getJettyServer(), "jettyServer", null, 0, 1, EveNodeServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveNodeServer_ServerHost(), ecorePackage.getEString(), "serverHost", "127.0.0.1", 0, 1, EveNodeServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveNodeServer_ServerPort(), ecorePackage.getEInt(), "serverPort", "8080", 0, 1, EveNodeServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveNodeServer_Thread(), this.getThread(), "thread", null, 0, 1, EveNodeServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveNodeServerEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveNodeServerEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveNodeServerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eveNodeServerEClass, ecorePackage.getEString(), "getServerBase", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(evePrototypeEClass, EvePrototype.class, "EvePrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(evePrototypeEClass, this.getEveAgent(), "createAgentFromPrototype", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveAgentEClass, EveAgent.class, "EveAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveAgent_PrototypeUUID(), this.getUUID(), "prototypeUUID", null, 0, 1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveAgent_Prototype(), this.getEvePrototype(), null, "prototype", null, 0, 1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveAgent_AgentPoolUUID(), this.getUUID(), "agentPoolUUID", null, 0, 1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveAgent_AgentPool(), this.getEvePrototype(), null, "agentPool", null, 0, 1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveAgent_DemandedServices(), this.getEveService(), null, "demandedServices", null, 0, -1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveAgent_OfferedServices(), this.getEveService(), null, "offeredServices", null, 0, -1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEveAgent_LocalServicePool(), this.getEveService(), null, "localServicePool", null, 0, -1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveAgent_Betweeness(), ecorePackage.getEFloat(), "betweeness", null, 0, 1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveAgent_Type(), ecorePackage.getEString(), "type", null, 0, 1, EveAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveAgentEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveServiceEClass, EveService.class, "EveService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eveConnectionEClass, EveConnection.class, "EveConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEveConnection_ConnectedComponent(), this.getEveComponent(), this.getEveComponent_AttachedConnections(), "connectedComponent", null, 0, 1, EveConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEveConnection_ConnectedComponent().getEKeys().add(this.getEveComponent_Uuid());
		initEAttribute(getEveConnection_Strength(), ecorePackage.getEFloat(), "strength", null, 0, 1, EveConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveConnection_Connected(), ecorePackage.getEBoolean(), "connected", "true", 0, 1, EveConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveConnection_Type(), ecorePackage.getEString(), "type", null, 0, 1, EveConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveConnection_Directional(), ecorePackage.getEBoolean(), "directional", null, 0, 1, EveConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eveConnectionEClass, ecorePackage.getEBoolean(), "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eveConnectionEClass, this.getEveComponent(), "getOpposite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEveComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eveLocationEClass, EveLocation.class, "EveLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveLocation_LocLongitude(), ecorePackage.getEFloat(), "locLongitude", null, 0, 1, EveLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveLocation_LocLatitude(), ecorePackage.getEFloat(), "locLatitude", null, 0, 1, EveLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveLocation_LocCountry(), ecorePackage.getEString(), "locCountry", null, 0, 1, EveLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveLocation_LocCity(), ecorePackage.getEString(), "locCity", null, 0, 1, EveLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveLocation_LocPONr(), ecorePackage.getEString(), "locPONr", null, 0, 1, EveLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveLocation_LocAddress(), ecorePackage.getEString(), "locAddress", null, 0, 1, EveLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveLocation_LocLocation(), ecorePackage.getEString(), "locLocation", null, 0, 1, EveLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eveMessageSinkEClass, EveMessageSink.class, "EveMessageSink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eveMessageSinkEClass, null, "submitMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMsgPackage.getEveMessage(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(runnableEClass, Runnable.class, "Runnable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		addEOperation(runnableEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iControllableEClass, IControllable.class, "IControllable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iControllableEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iControllableEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iAdaptableEClass, IAdaptable.class, "IAdaptable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iKmlProviderEClass, IKmlProvider.class, "IKmlProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iKmlProviderEClass, ecorePackage.getEString(), "kmlGetStyle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iKmlProviderEClass, this.getKmlContainer(), "kmlGetVisualisation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKmlContainer(), "kmlContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serializableEClass, Serializable.class, "Serializable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(throwableEClass, Throwable.class, "Throwable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eveNodeTypeEEnum, EveNodeType.class, "EveNodeType");
		addEEnumLiteral(eveNodeTypeEEnum, EveNodeType.SERVER);
		addEEnumLiteral(eveNodeTypeEEnum, EveNodeType.CLIENT);

		// Initialize data types
		initEDataType(sessionIDEDataType, java.util.UUID.class, "SessionID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, java.net.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(threadEDataType, Thread.class, "Thread", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uuidEDataType, java.util.UUID.class, "UUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eveComponentHashtableEDataType, Hashtable.class, "EveComponentHashtable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Hashtable<java.util.UUID, org.evesim.EveComponent>");
		initEDataType(jettyServerEDataType, Server.class, "JettyServer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kmlContainerEDataType, Document.class, "KmlContainer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classEDataType, Class.class, "Class", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EvesimPackageImpl
