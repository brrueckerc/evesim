/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.evesim.EvesimFactory
 * @model kind="package"
 * @generated
 */
public interface EvesimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evesim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.evesim.org/evesim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evesim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvesimPackage eINSTANCE = org.evesim.impl.EvesimPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.io.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see org.evesim.impl.EvesimPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 15;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveComponentImpl <em>Eve Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveComponentImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveComponent()
	 * @generated
	 */
	int EVE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__ATTACHED_CONNECTIONS = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__UUID = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__URI = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__PARENT = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__SESSION_ID = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__NAME = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__CHILDREN = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOC_LONGITUDE = SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOC_LATITUDE = SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOC_COUNTRY = SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOC_CITY = SERIALIZABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOC_PO_NR = SERIALIZABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOC_ADDRESS = SERIALIZABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOC_LOCATION = SERIALIZABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__NET_IP = SERIALIZABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__NET_URL = SERIALIZABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__LOCATION = SERIALIZABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT__TIME_STAMP = SERIALIZABLE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Eve Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_COMPONENT_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveAgentImpl <em>Eve Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveAgentImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveAgent()
	 * @generated
	 */
	int EVE_AGENT = 6;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveServiceImpl <em>Eve Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveServiceImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveService()
	 * @generated
	 */
	int EVE_SERVICE = 7;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveConnectionImpl <em>Eve Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveConnectionImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveConnection()
	 * @generated
	 */
	int EVE_CONNECTION = 8;

	/**
	 * The meta object id for the '{@link org.evesim.EveMessageSink <em>Eve Message Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.EveMessageSink
	 * @see org.evesim.impl.EvesimPackageImpl#getEveMessageSink()
	 * @generated
	 */
	int EVE_MESSAGE_SINK = 10;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveSimulationImpl <em>Eve Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveSimulationImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveSimulation()
	 * @generated
	 */
	int EVE_SIMULATION = 1;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__ATTACHED_CONNECTIONS = EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__UUID = EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__URI = EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__PARENT = EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__SESSION_ID = EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__NAME = EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__DESCRIPTION = EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__CHILDREN = EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOC_LONGITUDE = EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOC_LATITUDE = EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOC_COUNTRY = EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOC_CITY = EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOC_PO_NR = EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOC_ADDRESS = EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOC_LOCATION = EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__NET_IP = EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__NET_URL = EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__LOCATION = EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__TIME_STAMP = EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Step Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__STEP_DURATION = EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION__STEP_COUNT = EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eve Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SIMULATION_FEATURE_COUNT = EVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveMonitorImpl <em>Eve Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveMonitorImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveMonitor()
	 * @generated
	 */
	int EVE_MONITOR = 2;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__ATTACHED_CONNECTIONS = EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__UUID = EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__URI = EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__PARENT = EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__SESSION_ID = EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__NAME = EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__DESCRIPTION = EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__CHILDREN = EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOC_LONGITUDE = EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOC_LATITUDE = EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOC_COUNTRY = EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOC_CITY = EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOC_PO_NR = EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOC_ADDRESS = EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOC_LOCATION = EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__NET_IP = EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__NET_URL = EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__LOCATION = EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__TIME_STAMP = EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sleep Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR__SLEEP_TIME = EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eve Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_FEATURE_COUNT = EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EvePrototypeImpl <em>Eve Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EvePrototypeImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEvePrototype()
	 * @generated
	 */
	int EVE_PROTOTYPE = 5;

	/**
	 * The meta object id for the '{@link java.lang.Runnable <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Runnable
	 * @see org.evesim.impl.EvesimPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 11;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveNodeImpl <em>Eve Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveNodeImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveNode()
	 * @generated
	 */
	int EVE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__ATTACHED_CONNECTIONS = EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__UUID = EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__URI = EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__PARENT = EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__SESSION_ID = EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__NAME = EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__DESCRIPTION = EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__CHILDREN = EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOC_LONGITUDE = EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOC_LATITUDE = EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOC_COUNTRY = EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOC_CITY = EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOC_PO_NR = EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOC_ADDRESS = EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOC_LOCATION = EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__NET_IP = EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__NET_URL = EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__LOCATION = EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__TIME_STAMP = EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Message Queue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__MESSAGE_QUEUE = EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__SERVER = EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__NODE_TYPE = EVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE__SERVER_URL = EVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eve Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE_FEATURE_COUNT = EVE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveNodeServerImpl <em>Eve Node Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveNodeServerImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveNodeServer()
	 * @generated
	 */
	int EVE_NODE_SERVER = 4;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE_SERVER__NODE = RUNNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jetty Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE_SERVER__JETTY_SERVER = RUNNABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE_SERVER__SERVER_HOST = RUNNABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE_SERVER__SERVER_PORT = RUNNABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE_SERVER__THREAD = RUNNABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Eve Node Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_NODE_SERVER_FEATURE_COUNT = RUNNABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__ATTACHED_CONNECTIONS = EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__UUID = EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__URI = EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__PARENT = EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__SESSION_ID = EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__NAME = EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__DESCRIPTION = EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__CHILDREN = EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOC_LONGITUDE = EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOC_LATITUDE = EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOC_COUNTRY = EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOC_CITY = EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOC_PO_NR = EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOC_ADDRESS = EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOC_LOCATION = EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__NET_IP = EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__NET_URL = EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOCATION = EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__TIME_STAMP = EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Prototype UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__PROTOTYPE_UUID = EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__PROTOTYPE = EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agent Pool UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__AGENT_POOL_UUID = EVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Agent Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__AGENT_POOL = EVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Demanded Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__DEMANDED_SERVICES = EVE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__OFFERED_SERVICES = EVE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Local Service Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__LOCAL_SERVICE_POOL = EVE_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Betweeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__BETWEENESS = EVE_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT__TYPE = EVE_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Eve Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_FEATURE_COUNT = EVE_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__ATTACHED_CONNECTIONS = EVE_AGENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__UUID = EVE_AGENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__URI = EVE_AGENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__PARENT = EVE_AGENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__SESSION_ID = EVE_AGENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__NAME = EVE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__DESCRIPTION = EVE_AGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__CHILDREN = EVE_AGENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOC_LONGITUDE = EVE_AGENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOC_LATITUDE = EVE_AGENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOC_COUNTRY = EVE_AGENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOC_CITY = EVE_AGENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOC_PO_NR = EVE_AGENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOC_ADDRESS = EVE_AGENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOC_LOCATION = EVE_AGENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__NET_IP = EVE_AGENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__NET_URL = EVE_AGENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOCATION = EVE_AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__TIME_STAMP = EVE_AGENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Prototype UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__PROTOTYPE_UUID = EVE_AGENT__PROTOTYPE_UUID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__PROTOTYPE = EVE_AGENT__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Agent Pool UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__AGENT_POOL_UUID = EVE_AGENT__AGENT_POOL_UUID;

	/**
	 * The feature id for the '<em><b>Agent Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__AGENT_POOL = EVE_AGENT__AGENT_POOL;

	/**
	 * The feature id for the '<em><b>Demanded Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__DEMANDED_SERVICES = EVE_AGENT__DEMANDED_SERVICES;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__OFFERED_SERVICES = EVE_AGENT__OFFERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Local Service Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__LOCAL_SERVICE_POOL = EVE_AGENT__LOCAL_SERVICE_POOL;

	/**
	 * The feature id for the '<em><b>Betweeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__BETWEENESS = EVE_AGENT__BETWEENESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE__TYPE = EVE_AGENT__TYPE;

	/**
	 * The number of structural features of the '<em>Eve Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_PROTOTYPE_FEATURE_COUNT = EVE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__ATTACHED_CONNECTIONS = EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__UUID = EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__URI = EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__PARENT = EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__SESSION_ID = EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__NAME = EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__DESCRIPTION = EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__CHILDREN = EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOC_LONGITUDE = EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOC_LATITUDE = EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOC_COUNTRY = EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOC_CITY = EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOC_PO_NR = EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOC_ADDRESS = EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOC_LOCATION = EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__NET_IP = EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__NET_URL = EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__LOCATION = EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE__TIME_STAMP = EVE_COMPONENT__TIME_STAMP;

	/**
	 * The number of structural features of the '<em>Eve Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_FEATURE_COUNT = EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__ATTACHED_CONNECTIONS = EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__UUID = EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__URI = EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__PARENT = EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__SESSION_ID = EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__NAME = EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__DESCRIPTION = EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__CHILDREN = EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOC_LONGITUDE = EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOC_LATITUDE = EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOC_COUNTRY = EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOC_CITY = EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOC_PO_NR = EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOC_ADDRESS = EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOC_LOCATION = EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__NET_IP = EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__NET_URL = EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__LOCATION = EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__TIME_STAMP = EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Connected Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__CONNECTED_COMPONENT = EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__STRENGTH = EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__CONNECTED = EVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__TYPE = EVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Directional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION__DIRECTIONAL = EVE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Eve Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_CONNECTION_FEATURE_COUNT = EVE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link java.lang.Throwable <em>Throwable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.evesim.impl.EvesimPackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 16;

	/**
	 * The meta object id for the '{@link org.evesim.IControllable <em>IControllable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.IControllable
	 * @see org.evesim.impl.EvesimPackageImpl#getIControllable()
	 * @generated
	 */
	int ICONTROLLABLE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @see org.evesim.impl.EvesimPackageImpl#getIAdaptable()
	 * @generated
	 */
	int IADAPTABLE = 13;

	/**
	 * The meta object id for the '{@link org.evesim.IKmlProvider <em>IKml Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.IKmlProvider
	 * @see org.evesim.impl.EvesimPackageImpl#getIKmlProvider()
	 * @generated
	 */
	int IKML_PROVIDER = 14;

	/**
	 * The meta object id for the '{@link org.evesim.impl.EveLocationImpl <em>Eve Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.impl.EveLocationImpl
	 * @see org.evesim.impl.EvesimPackageImpl#getEveLocation()
	 * @generated
	 */
	int EVE_LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION__LOC_LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION__LOC_LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION__LOC_COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION__LOC_CITY = 3;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION__LOC_PO_NR = 4;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION__LOC_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION__LOC_LOCATION = 6;

	/**
	 * The number of structural features of the '<em>Eve Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOCATION_FEATURE_COUNT = 7;

	/**
	 * The number of structural features of the '<em>Eve Message Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_SINK_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>IControllable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROLLABLE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>IAdaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADAPTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>IKml Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKML_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Throwable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.evesim.EveNodeType <em>Eve Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.EveNodeType
	 * @see org.evesim.impl.EvesimPackageImpl#getEveNodeType()
	 * @generated
	 */
	int EVE_NODE_TYPE = 17;

	/**
	 * The meta object id for the '<em>UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.UUID
	 * @see org.evesim.impl.EvesimPackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 21;


	/**
	 * The meta object id for the '<em>Eve Component Hashtable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Hashtable
	 * @see org.evesim.impl.EvesimPackageImpl#getEveComponentHashtable()
	 * @generated
	 */
	int EVE_COMPONENT_HASHTABLE = 22;

	/**
	 * The meta object id for the '<em>Jetty Server</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mortbay.jetty.Server
	 * @see org.evesim.impl.EvesimPackageImpl#getJettyServer()
	 * @generated
	 */
	int JETTY_SERVER = 23;

	/**
	 * The meta object id for the '<em>Kml Container</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.micromata.opengis.kml.v_2_2_0.Document
	 * @see org.evesim.impl.EvesimPackageImpl#getKmlContainer()
	 * @generated
	 */
	int KML_CONTAINER = 24;

	/**
	 * The meta object id for the '<em>Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see org.evesim.impl.EvesimPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 25;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.evesim.impl.EvesimPackageImpl#getURI()
	 * @generated
	 */
	int URI = 19;


	/**
	 * The meta object id for the '<em>Session ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.UUID
	 * @see org.evesim.impl.EvesimPackageImpl#getSessionID()
	 * @generated
	 */
	int SESSION_ID = 18;


	/**
	 * The meta object id for the '<em>Thread</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Thread
	 * @see org.evesim.impl.EvesimPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 20;


	/**
	 * Returns the meta object for class '{@link org.evesim.EveAgent <em>Eve Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Agent</em>'.
	 * @see org.evesim.EveAgent
	 * @generated
	 */
	EClass getEveAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveAgent#getPrototypeUUID <em>Prototype UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prototype UUID</em>'.
	 * @see org.evesim.EveAgent#getPrototypeUUID()
	 * @see #getEveAgent()
	 * @generated
	 */
	EAttribute getEveAgent_PrototypeUUID();

	/**
	 * Returns the meta object for the reference '{@link org.evesim.EveAgent#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see org.evesim.EveAgent#getPrototype()
	 * @see #getEveAgent()
	 * @generated
	 */
	EReference getEveAgent_Prototype();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveAgent#getAgentPoolUUID <em>Agent Pool UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Pool UUID</em>'.
	 * @see org.evesim.EveAgent#getAgentPoolUUID()
	 * @see #getEveAgent()
	 * @generated
	 */
	EAttribute getEveAgent_AgentPoolUUID();

	/**
	 * Returns the meta object for the reference '{@link org.evesim.EveAgent#getAgentPool <em>Agent Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent Pool</em>'.
	 * @see org.evesim.EveAgent#getAgentPool()
	 * @see #getEveAgent()
	 * @generated
	 */
	EReference getEveAgent_AgentPool();

	/**
	 * Returns the meta object for the reference list '{@link org.evesim.EveAgent#getDemandedServices <em>Demanded Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Demanded Services</em>'.
	 * @see org.evesim.EveAgent#getDemandedServices()
	 * @see #getEveAgent()
	 * @generated
	 */
	EReference getEveAgent_DemandedServices();

	/**
	 * Returns the meta object for the reference list '{@link org.evesim.EveAgent#getOfferedServices <em>Offered Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Services</em>'.
	 * @see org.evesim.EveAgent#getOfferedServices()
	 * @see #getEveAgent()
	 * @generated
	 */
	EReference getEveAgent_OfferedServices();

	/**
	 * Returns the meta object for the reference list '{@link org.evesim.EveAgent#getLocalServicePool <em>Local Service Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Local Service Pool</em>'.
	 * @see org.evesim.EveAgent#getLocalServicePool()
	 * @see #getEveAgent()
	 * @generated
	 */
	EReference getEveAgent_LocalServicePool();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveAgent#getBetweeness <em>Betweeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betweeness</em>'.
	 * @see org.evesim.EveAgent#getBetweeness()
	 * @see #getEveAgent()
	 * @generated
	 */
	EAttribute getEveAgent_Betweeness();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveAgent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.evesim.EveAgent#getType()
	 * @see #getEveAgent()
	 * @generated
	 */
	EAttribute getEveAgent_Type();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveComponent <em>Eve Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Component</em>'.
	 * @see org.evesim.EveComponent
	 * @generated
	 */
	EClass getEveComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.evesim.EveComponent#getUuid()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_Uuid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.evesim.EveComponent#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.evesim.EveComponent#getChildren()
	 * @see #getEveComponent()
	 * @generated
	 */
	EReference getEveComponent_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getLocLongitude <em>Loc Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Longitude</em>'.
	 * @see org.evesim.EveComponent#getLocLongitude()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_LocLongitude();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getLocLatitude <em>Loc Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Latitude</em>'.
	 * @see org.evesim.EveComponent#getLocLatitude()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_LocLatitude();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getLocCountry <em>Loc Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Country</em>'.
	 * @see org.evesim.EveComponent#getLocCountry()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_LocCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getLocCity <em>Loc City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc City</em>'.
	 * @see org.evesim.EveComponent#getLocCity()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_LocCity();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getLocPONr <em>Loc PO Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc PO Nr</em>'.
	 * @see org.evesim.EveComponent#getLocPONr()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_LocPONr();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getLocAddress <em>Loc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Address</em>'.
	 * @see org.evesim.EveComponent#getLocAddress()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_LocAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getLocLocation <em>Loc Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Location</em>'.
	 * @see org.evesim.EveComponent#getLocLocation()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_LocLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getNetIP <em>Net IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net IP</em>'.
	 * @see org.evesim.EveComponent#getNetIP()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_NetIP();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getNetUrl <em>Net Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Url</em>'.
	 * @see org.evesim.EveComponent#getNetUrl()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_NetUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.evesim.EveComponent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.evesim.EveComponent#getLocation()
	 * @see #getEveComponent()
	 * @generated
	 */
	EReference getEveComponent_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.evesim.EveComponent#getTimeStamp()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_TimeStamp();

	/**
	 * Returns the meta object for the reference list '{@link org.evesim.EveComponent#getAttachedConnections <em>Attached Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attached Connections</em>'.
	 * @see org.evesim.EveComponent#getAttachedConnections()
	 * @see #getEveComponent()
	 * @generated
	 */
	EReference getEveComponent_AttachedConnections();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.evesim.EveComponent#getName()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.evesim.EveComponent#getDescription()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.evesim.EveComponent#getUri()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveComponent#getSessionID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session ID</em>'.
	 * @see org.evesim.EveComponent#getSessionID()
	 * @see #getEveComponent()
	 * @generated
	 */
	EAttribute getEveComponent_SessionID();

	/**
	 * Returns the meta object for the container reference '{@link org.evesim.EveComponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.evesim.EveComponent#getParent()
	 * @see #getEveComponent()
	 * @generated
	 */
	EReference getEveComponent_Parent();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveService <em>Eve Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Service</em>'.
	 * @see org.evesim.EveService
	 * @generated
	 */
	EClass getEveService();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveConnection <em>Eve Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Connection</em>'.
	 * @see org.evesim.EveConnection
	 * @generated
	 */
	EClass getEveConnection();

	/**
	 * Returns the meta object for the reference '{@link org.evesim.EveConnection#getConnectedComponent <em>Connected Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Component</em>'.
	 * @see org.evesim.EveConnection#getConnectedComponent()
	 * @see #getEveConnection()
	 * @generated
	 */
	EReference getEveConnection_ConnectedComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveConnection#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see org.evesim.EveConnection#getStrength()
	 * @see #getEveConnection()
	 * @generated
	 */
	EAttribute getEveConnection_Strength();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveConnection#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see org.evesim.EveConnection#isConnected()
	 * @see #getEveConnection()
	 * @generated
	 */
	EAttribute getEveConnection_Connected();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.evesim.EveConnection#getType()
	 * @see #getEveConnection()
	 * @generated
	 */
	EAttribute getEveConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveConnection#isDirectional <em>Directional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directional</em>'.
	 * @see org.evesim.EveConnection#isDirectional()
	 * @see #getEveConnection()
	 * @generated
	 */
	EAttribute getEveConnection_Directional();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveMessageSink <em>Eve Message Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Message Sink</em>'.
	 * @see org.evesim.EveMessageSink
	 * @generated
	 */
	EClass getEveMessageSink();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveSimulation <em>Eve Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Simulation</em>'.
	 * @see org.evesim.EveSimulation
	 * @generated
	 */
	EClass getEveSimulation();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveSimulation#getStepDuration <em>Step Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Duration</em>'.
	 * @see org.evesim.EveSimulation#getStepDuration()
	 * @see #getEveSimulation()
	 * @generated
	 */
	EAttribute getEveSimulation_StepDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveSimulation#getStepCount <em>Step Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Count</em>'.
	 * @see org.evesim.EveSimulation#getStepCount()
	 * @see #getEveSimulation()
	 * @generated
	 */
	EAttribute getEveSimulation_StepCount();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveMonitor <em>Eve Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Monitor</em>'.
	 * @see org.evesim.EveMonitor
	 * @generated
	 */
	EClass getEveMonitor();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveMonitor#getSleepTime <em>Sleep Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleep Time</em>'.
	 * @see org.evesim.EveMonitor#getSleepTime()
	 * @see #getEveMonitor()
	 * @generated
	 */
	EAttribute getEveMonitor_SleepTime();

	/**
	 * Returns the meta object for class '{@link org.evesim.EvePrototype <em>Eve Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Prototype</em>'.
	 * @see org.evesim.EvePrototype
	 * @generated
	 */
	EClass getEvePrototype();

	/**
	 * Returns the meta object for class '{@link java.lang.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see java.lang.Runnable
	 * @model instanceClass="java.lang.Runnable"
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for class '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the meta object for class '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EClass getThrowable();

	/**
	 * Returns the meta object for class '{@link org.evesim.IControllable <em>IControllable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IControllable</em>'.
	 * @see org.evesim.IControllable
	 * @generated
	 */
	EClass getIControllable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAdaptable</em>'.
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @model instanceClass="org.eclipse.core.runtime.IAdaptable"
	 * @generated
	 */
	EClass getIAdaptable();

	/**
	 * Returns the meta object for class '{@link org.evesim.IKmlProvider <em>IKml Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IKml Provider</em>'.
	 * @see org.evesim.IKmlProvider
	 * @generated
	 */
	EClass getIKmlProvider();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveLocation <em>Eve Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Location</em>'.
	 * @see org.evesim.EveLocation
	 * @generated
	 */
	EClass getEveLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveLocation#getLocLongitude <em>Loc Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Longitude</em>'.
	 * @see org.evesim.EveLocation#getLocLongitude()
	 * @see #getEveLocation()
	 * @generated
	 */
	EAttribute getEveLocation_LocLongitude();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveLocation#getLocLatitude <em>Loc Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Latitude</em>'.
	 * @see org.evesim.EveLocation#getLocLatitude()
	 * @see #getEveLocation()
	 * @generated
	 */
	EAttribute getEveLocation_LocLatitude();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveLocation#getLocCountry <em>Loc Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Country</em>'.
	 * @see org.evesim.EveLocation#getLocCountry()
	 * @see #getEveLocation()
	 * @generated
	 */
	EAttribute getEveLocation_LocCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveLocation#getLocCity <em>Loc City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc City</em>'.
	 * @see org.evesim.EveLocation#getLocCity()
	 * @see #getEveLocation()
	 * @generated
	 */
	EAttribute getEveLocation_LocCity();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveLocation#getLocPONr <em>Loc PO Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc PO Nr</em>'.
	 * @see org.evesim.EveLocation#getLocPONr()
	 * @see #getEveLocation()
	 * @generated
	 */
	EAttribute getEveLocation_LocPONr();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveLocation#getLocAddress <em>Loc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Address</em>'.
	 * @see org.evesim.EveLocation#getLocAddress()
	 * @see #getEveLocation()
	 * @generated
	 */
	EAttribute getEveLocation_LocAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveLocation#getLocLocation <em>Loc Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Location</em>'.
	 * @see org.evesim.EveLocation#getLocLocation()
	 * @see #getEveLocation()
	 * @generated
	 */
	EAttribute getEveLocation_LocLocation();

	/**
	 * Returns the meta object for enum '{@link org.evesim.EveNodeType <em>Eve Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eve Node Type</em>'.
	 * @see org.evesim.EveNodeType
	 * @generated
	 */
	EEnum getEveNodeType();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveNode <em>Eve Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Node</em>'.
	 * @see org.evesim.EveNode
	 * @generated
	 */
	EClass getEveNode();

	/**
	 * Returns the meta object for the reference list '{@link org.evesim.EveNode#getMessageQueue <em>Message Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Queue</em>'.
	 * @see org.evesim.EveNode#getMessageQueue()
	 * @see #getEveNode()
	 * @generated
	 */
	EReference getEveNode_MessageQueue();

	/**
	 * Returns the meta object for the reference '{@link org.evesim.EveNode#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.evesim.EveNode#getServer()
	 * @see #getEveNode()
	 * @generated
	 */
	EReference getEveNode_Server();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveNode#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.evesim.EveNode#getNodeType()
	 * @see #getEveNode()
	 * @generated
	 */
	EAttribute getEveNode_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveNode#getServerUrl <em>Server Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Url</em>'.
	 * @see org.evesim.EveNode#getServerUrl()
	 * @see #getEveNode()
	 * @generated
	 */
	EAttribute getEveNode_ServerUrl();

	/**
	 * Returns the meta object for class '{@link org.evesim.EveNodeServer <em>Eve Node Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Node Server</em>'.
	 * @see org.evesim.EveNodeServer
	 * @generated
	 */
	EClass getEveNodeServer();

	/**
	 * Returns the meta object for the reference '{@link org.evesim.EveNodeServer#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.evesim.EveNodeServer#getNode()
	 * @see #getEveNodeServer()
	 * @generated
	 */
	EReference getEveNodeServer_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveNodeServer#getJettyServer <em>Jetty Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jetty Server</em>'.
	 * @see org.evesim.EveNodeServer#getJettyServer()
	 * @see #getEveNodeServer()
	 * @generated
	 */
	EAttribute getEveNodeServer_JettyServer();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveNodeServer#getServerHost <em>Server Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Host</em>'.
	 * @see org.evesim.EveNodeServer#getServerHost()
	 * @see #getEveNodeServer()
	 * @generated
	 */
	EAttribute getEveNodeServer_ServerHost();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveNodeServer#getServerPort <em>Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Port</em>'.
	 * @see org.evesim.EveNodeServer#getServerPort()
	 * @see #getEveNodeServer()
	 * @generated
	 */
	EAttribute getEveNodeServer_ServerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.EveNodeServer#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread</em>'.
	 * @see org.evesim.EveNodeServer#getThread()
	 * @see #getEveNodeServer()
	 * @generated
	 */
	EAttribute getEveNodeServer_Thread();

	/**
	 * Returns the meta object for data type '{@link java.util.UUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UUID</em>'.
	 * @see java.util.UUID
	 * @model instanceClass="java.util.UUID"
	 * @generated
	 */
	EDataType getUUID();

	/**
	 * Returns the meta object for data type '{@link java.util.Hashtable <em>Eve Component Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Eve Component Hashtable</em>'.
	 * @see java.util.Hashtable
	 * @model instanceClass="java.util.Hashtable<java.util.UUID, org.evesim.EveComponent>"
	 * @generated
	 */
	EDataType getEveComponentHashtable();

	/**
	 * Returns the meta object for data type '{@link org.mortbay.jetty.Server <em>Jetty Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Jetty Server</em>'.
	 * @see org.mortbay.jetty.Server
	 * @model instanceClass="org.mortbay.jetty.Server"
	 * @generated
	 */
	EDataType getJettyServer();

	/**
	 * Returns the meta object for data type '{@link de.micromata.opengis.kml.v_2_2_0.Document <em>Kml Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kml Container</em>'.
	 * @see de.micromata.opengis.kml.v_2_2_0.Document
	 * @model instanceClass="de.micromata.opengis.kml.v_2_2_0.Document"
	 * @generated
	 */
	EDataType getKmlContainer();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class"
	 * @generated
	 */
	EDataType getClass_();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.util.UUID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Session ID</em>'.
	 * @see java.util.UUID
	 * @model instanceClass="java.util.UUID"
	 * @generated
	 */
	EDataType getSessionID();

	/**
	 * Returns the meta object for data type '{@link java.lang.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Thread</em>'.
	 * @see java.lang.Thread
	 * @model instanceClass="java.lang.Thread"
	 * @generated
	 */
	EDataType getThread();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvesimFactory getEvesimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveAgentImpl <em>Eve Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveAgentImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveAgent()
		 * @generated
		 */
		EClass EVE_AGENT = eINSTANCE.getEveAgent();

		/**
		 * The meta object literal for the '<em><b>Prototype UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT__PROTOTYPE_UUID = eINSTANCE.getEveAgent_PrototypeUUID();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_AGENT__PROTOTYPE = eINSTANCE.getEveAgent_Prototype();

		/**
		 * The meta object literal for the '<em><b>Agent Pool UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT__AGENT_POOL_UUID = eINSTANCE.getEveAgent_AgentPoolUUID();

		/**
		 * The meta object literal for the '<em><b>Agent Pool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_AGENT__AGENT_POOL = eINSTANCE.getEveAgent_AgentPool();

		/**
		 * The meta object literal for the '<em><b>Demanded Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_AGENT__DEMANDED_SERVICES = eINSTANCE.getEveAgent_DemandedServices();

		/**
		 * The meta object literal for the '<em><b>Offered Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_AGENT__OFFERED_SERVICES = eINSTANCE.getEveAgent_OfferedServices();

		/**
		 * The meta object literal for the '<em><b>Local Service Pool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_AGENT__LOCAL_SERVICE_POOL = eINSTANCE.getEveAgent_LocalServicePool();

		/**
		 * The meta object literal for the '<em><b>Betweeness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT__BETWEENESS = eINSTANCE.getEveAgent_Betweeness();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT__TYPE = eINSTANCE.getEveAgent_Type();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveComponentImpl <em>Eve Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveComponentImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveComponent()
		 * @generated
		 */
		EClass EVE_COMPONENT = eINSTANCE.getEveComponent();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__UUID = eINSTANCE.getEveComponent_Uuid();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_COMPONENT__CHILDREN = eINSTANCE.getEveComponent_Children();

		/**
		 * The meta object literal for the '<em><b>Loc Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__LOC_LONGITUDE = eINSTANCE.getEveComponent_LocLongitude();

		/**
		 * The meta object literal for the '<em><b>Loc Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__LOC_LATITUDE = eINSTANCE.getEveComponent_LocLatitude();

		/**
		 * The meta object literal for the '<em><b>Loc Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__LOC_COUNTRY = eINSTANCE.getEveComponent_LocCountry();

		/**
		 * The meta object literal for the '<em><b>Loc City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__LOC_CITY = eINSTANCE.getEveComponent_LocCity();

		/**
		 * The meta object literal for the '<em><b>Loc PO Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__LOC_PO_NR = eINSTANCE.getEveComponent_LocPONr();

		/**
		 * The meta object literal for the '<em><b>Loc Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__LOC_ADDRESS = eINSTANCE.getEveComponent_LocAddress();

		/**
		 * The meta object literal for the '<em><b>Loc Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__LOC_LOCATION = eINSTANCE.getEveComponent_LocLocation();

		/**
		 * The meta object literal for the '<em><b>Net IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__NET_IP = eINSTANCE.getEveComponent_NetIP();

		/**
		 * The meta object literal for the '<em><b>Net Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__NET_URL = eINSTANCE.getEveComponent_NetUrl();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_COMPONENT__LOCATION = eINSTANCE.getEveComponent_Location();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__TIME_STAMP = eINSTANCE.getEveComponent_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Attached Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_COMPONENT__ATTACHED_CONNECTIONS = eINSTANCE.getEveComponent_AttachedConnections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__NAME = eINSTANCE.getEveComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__DESCRIPTION = eINSTANCE.getEveComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__URI = eINSTANCE.getEveComponent_Uri();

		/**
		 * The meta object literal for the '<em><b>Session ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_COMPONENT__SESSION_ID = eINSTANCE.getEveComponent_SessionID();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_COMPONENT__PARENT = eINSTANCE.getEveComponent_Parent();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveServiceImpl <em>Eve Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveServiceImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveService()
		 * @generated
		 */
		EClass EVE_SERVICE = eINSTANCE.getEveService();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveConnectionImpl <em>Eve Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveConnectionImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveConnection()
		 * @generated
		 */
		EClass EVE_CONNECTION = eINSTANCE.getEveConnection();

		/**
		 * The meta object literal for the '<em><b>Connected Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_CONNECTION__CONNECTED_COMPONENT = eINSTANCE.getEveConnection_ConnectedComponent();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_CONNECTION__STRENGTH = eINSTANCE.getEveConnection_Strength();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_CONNECTION__CONNECTED = eINSTANCE.getEveConnection_Connected();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_CONNECTION__TYPE = eINSTANCE.getEveConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Directional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_CONNECTION__DIRECTIONAL = eINSTANCE.getEveConnection_Directional();

		/**
		 * The meta object literal for the '{@link org.evesim.EveMessageSink <em>Eve Message Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.EveMessageSink
		 * @see org.evesim.impl.EvesimPackageImpl#getEveMessageSink()
		 * @generated
		 */
		EClass EVE_MESSAGE_SINK = eINSTANCE.getEveMessageSink();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveSimulationImpl <em>Eve Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveSimulationImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveSimulation()
		 * @generated
		 */
		EClass EVE_SIMULATION = eINSTANCE.getEveSimulation();

		/**
		 * The meta object literal for the '<em><b>Step Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_SIMULATION__STEP_DURATION = eINSTANCE.getEveSimulation_StepDuration();

		/**
		 * The meta object literal for the '<em><b>Step Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_SIMULATION__STEP_COUNT = eINSTANCE.getEveSimulation_StepCount();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveMonitorImpl <em>Eve Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveMonitorImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveMonitor()
		 * @generated
		 */
		EClass EVE_MONITOR = eINSTANCE.getEveMonitor();

		/**
		 * The meta object literal for the '<em><b>Sleep Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_MONITOR__SLEEP_TIME = eINSTANCE.getEveMonitor_SleepTime();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EvePrototypeImpl <em>Eve Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EvePrototypeImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEvePrototype()
		 * @generated
		 */
		EClass EVE_PROTOTYPE = eINSTANCE.getEvePrototype();

		/**
		 * The meta object literal for the '{@link java.lang.Runnable <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Runnable
		 * @see org.evesim.impl.EvesimPackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '{@link java.io.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see org.evesim.impl.EvesimPackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '{@link java.lang.Throwable <em>Throwable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.evesim.impl.EvesimPackageImpl#getThrowable()
		 * @generated
		 */
		EClass THROWABLE = eINSTANCE.getThrowable();

		/**
		 * The meta object literal for the '{@link org.evesim.IControllable <em>IControllable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.IControllable
		 * @see org.evesim.impl.EvesimPackageImpl#getIControllable()
		 * @generated
		 */
		EClass ICONTROLLABLE = eINSTANCE.getIControllable();

		/**
		 * The meta object literal for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IAdaptable
		 * @see org.evesim.impl.EvesimPackageImpl#getIAdaptable()
		 * @generated
		 */
		EClass IADAPTABLE = eINSTANCE.getIAdaptable();

		/**
		 * The meta object literal for the '{@link org.evesim.IKmlProvider <em>IKml Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.IKmlProvider
		 * @see org.evesim.impl.EvesimPackageImpl#getIKmlProvider()
		 * @generated
		 */
		EClass IKML_PROVIDER = eINSTANCE.getIKmlProvider();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveLocationImpl <em>Eve Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveLocationImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveLocation()
		 * @generated
		 */
		EClass EVE_LOCATION = eINSTANCE.getEveLocation();

		/**
		 * The meta object literal for the '<em><b>Loc Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOCATION__LOC_LONGITUDE = eINSTANCE.getEveLocation_LocLongitude();

		/**
		 * The meta object literal for the '<em><b>Loc Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOCATION__LOC_LATITUDE = eINSTANCE.getEveLocation_LocLatitude();

		/**
		 * The meta object literal for the '<em><b>Loc Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOCATION__LOC_COUNTRY = eINSTANCE.getEveLocation_LocCountry();

		/**
		 * The meta object literal for the '<em><b>Loc City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOCATION__LOC_CITY = eINSTANCE.getEveLocation_LocCity();

		/**
		 * The meta object literal for the '<em><b>Loc PO Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOCATION__LOC_PO_NR = eINSTANCE.getEveLocation_LocPONr();

		/**
		 * The meta object literal for the '<em><b>Loc Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOCATION__LOC_ADDRESS = eINSTANCE.getEveLocation_LocAddress();

		/**
		 * The meta object literal for the '<em><b>Loc Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOCATION__LOC_LOCATION = eINSTANCE.getEveLocation_LocLocation();

		/**
		 * The meta object literal for the '{@link org.evesim.EveNodeType <em>Eve Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.EveNodeType
		 * @see org.evesim.impl.EvesimPackageImpl#getEveNodeType()
		 * @generated
		 */
		EEnum EVE_NODE_TYPE = eINSTANCE.getEveNodeType();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveNodeImpl <em>Eve Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveNodeImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveNode()
		 * @generated
		 */
		EClass EVE_NODE = eINSTANCE.getEveNode();

		/**
		 * The meta object literal for the '<em><b>Message Queue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_NODE__MESSAGE_QUEUE = eINSTANCE.getEveNode_MessageQueue();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_NODE__SERVER = eINSTANCE.getEveNode_Server();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_NODE__NODE_TYPE = eINSTANCE.getEveNode_NodeType();

		/**
		 * The meta object literal for the '<em><b>Server Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_NODE__SERVER_URL = eINSTANCE.getEveNode_ServerUrl();

		/**
		 * The meta object literal for the '{@link org.evesim.impl.EveNodeServerImpl <em>Eve Node Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.impl.EveNodeServerImpl
		 * @see org.evesim.impl.EvesimPackageImpl#getEveNodeServer()
		 * @generated
		 */
		EClass EVE_NODE_SERVER = eINSTANCE.getEveNodeServer();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_NODE_SERVER__NODE = eINSTANCE.getEveNodeServer_Node();

		/**
		 * The meta object literal for the '<em><b>Jetty Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_NODE_SERVER__JETTY_SERVER = eINSTANCE.getEveNodeServer_JettyServer();

		/**
		 * The meta object literal for the '<em><b>Server Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_NODE_SERVER__SERVER_HOST = eINSTANCE.getEveNodeServer_ServerHost();

		/**
		 * The meta object literal for the '<em><b>Server Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_NODE_SERVER__SERVER_PORT = eINSTANCE.getEveNodeServer_ServerPort();

		/**
		 * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_NODE_SERVER__THREAD = eINSTANCE.getEveNodeServer_Thread();

		/**
		 * The meta object literal for the '<em>UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.UUID
		 * @see org.evesim.impl.EvesimPackageImpl#getUUID()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUUID();

		/**
		 * The meta object literal for the '<em>Eve Component Hashtable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Hashtable
		 * @see org.evesim.impl.EvesimPackageImpl#getEveComponentHashtable()
		 * @generated
		 */
		EDataType EVE_COMPONENT_HASHTABLE = eINSTANCE.getEveComponentHashtable();

		/**
		 * The meta object literal for the '<em>Jetty Server</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mortbay.jetty.Server
		 * @see org.evesim.impl.EvesimPackageImpl#getJettyServer()
		 * @generated
		 */
		EDataType JETTY_SERVER = eINSTANCE.getJettyServer();

		/**
		 * The meta object literal for the '<em>Kml Container</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.micromata.opengis.kml.v_2_2_0.Document
		 * @see org.evesim.impl.EvesimPackageImpl#getKmlContainer()
		 * @generated
		 */
		EDataType KML_CONTAINER = eINSTANCE.getKmlContainer();

		/**
		 * The meta object literal for the '<em>Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see org.evesim.impl.EvesimPackageImpl#getClass_()
		 * @generated
		 */
		EDataType CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.evesim.impl.EvesimPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Session ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.UUID
		 * @see org.evesim.impl.EvesimPackageImpl#getSessionID()
		 * @generated
		 */
		EDataType SESSION_ID = eINSTANCE.getSessionID();

		/**
		 * The meta object literal for the '<em>Thread</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Thread
		 * @see org.evesim.impl.EvesimPackageImpl#getThread()
		 * @generated
		 */
		EDataType THREAD = eINSTANCE.getThread();

	}

} //EvesimPackage
