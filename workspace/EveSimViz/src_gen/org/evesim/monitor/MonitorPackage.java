/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.evesim.EvesimPackage;

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
 * @see org.evesim.monitor.MonitorFactory
 * @model kind="package"
 * @generated
 */
public interface MonitorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "monitor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.evesim.org/evesim/monitor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "monitor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitorPackage eINSTANCE = org.evesim.monitor.impl.MonitorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.evesim.monitor.impl.EveMonitorNodeImpl <em>Eve Monitor Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.monitor.impl.EveMonitorNodeImpl
	 * @see org.evesim.monitor.impl.MonitorPackageImpl#getEveMonitorNode()
	 * @generated
	 */
	int EVE_MONITOR_NODE = 0;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__ATTACHED_CONNECTIONS = EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__UUID = EvesimPackage.EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__URI = EvesimPackage.EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__PARENT = EvesimPackage.EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__SESSION_ID = EvesimPackage.EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__NAME = EvesimPackage.EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__DESCRIPTION = EvesimPackage.EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__CHILDREN = EvesimPackage.EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOC_LONGITUDE = EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOC_LATITUDE = EvesimPackage.EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOC_COUNTRY = EvesimPackage.EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOC_CITY = EvesimPackage.EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOC_PO_NR = EvesimPackage.EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOC_ADDRESS = EvesimPackage.EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOC_LOCATION = EvesimPackage.EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__NET_IP = EvesimPackage.EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__NET_URL = EvesimPackage.EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__LOCATION = EvesimPackage.EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__TIME_STAMP = EvesimPackage.EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE__NODE_STATUS = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eve Monitor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_NODE_FEATURE_COUNT = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.evesim.monitor.impl.EveMonitorPeerGroupImpl <em>Eve Monitor Peer Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.monitor.impl.EveMonitorPeerGroupImpl
	 * @see org.evesim.monitor.impl.MonitorPackageImpl#getEveMonitorPeerGroup()
	 * @generated
	 */
	int EVE_MONITOR_PEER_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__ATTACHED_CONNECTIONS = EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__UUID = EvesimPackage.EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__URI = EvesimPackage.EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__PARENT = EvesimPackage.EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__SESSION_ID = EvesimPackage.EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__NAME = EvesimPackage.EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__DESCRIPTION = EvesimPackage.EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__CHILDREN = EvesimPackage.EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOC_LONGITUDE = EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOC_LATITUDE = EvesimPackage.EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOC_COUNTRY = EvesimPackage.EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOC_CITY = EvesimPackage.EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOC_PO_NR = EvesimPackage.EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOC_ADDRESS = EvesimPackage.EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOC_LOCATION = EvesimPackage.EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__NET_IP = EvesimPackage.EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__NET_URL = EvesimPackage.EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__LOCATION = EvesimPackage.EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP__TIME_STAMP = EvesimPackage.EVE_COMPONENT__TIME_STAMP;

	/**
	 * The number of structural features of the '<em>Eve Monitor Peer Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MONITOR_PEER_GROUP_FEATURE_COUNT = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.evesim.monitor.NodeStatus <em>Node Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.monitor.NodeStatus
	 * @see org.evesim.monitor.impl.MonitorPackageImpl#getNodeStatus()
	 * @generated
	 */
	int NODE_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link org.evesim.monitor.EveMonitorNode <em>Eve Monitor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Monitor Node</em>'.
	 * @see org.evesim.monitor.EveMonitorNode
	 * @generated
	 */
	EClass getEveMonitorNode();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.monitor.EveMonitorNode#getNodeStatus <em>Node Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Status</em>'.
	 * @see org.evesim.monitor.EveMonitorNode#getNodeStatus()
	 * @see #getEveMonitorNode()
	 * @generated
	 */
	EAttribute getEveMonitorNode_NodeStatus();

	/**
	 * Returns the meta object for class '{@link org.evesim.monitor.EveMonitorPeerGroup <em>Eve Monitor Peer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Monitor Peer Group</em>'.
	 * @see org.evesim.monitor.EveMonitorPeerGroup
	 * @generated
	 */
	EClass getEveMonitorPeerGroup();

	/**
	 * Returns the meta object for enum '{@link org.evesim.monitor.NodeStatus <em>Node Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Status</em>'.
	 * @see org.evesim.monitor.NodeStatus
	 * @generated
	 */
	EEnum getNodeStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MonitorFactory getMonitorFactory();

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
		 * The meta object literal for the '{@link org.evesim.monitor.impl.EveMonitorNodeImpl <em>Eve Monitor Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.monitor.impl.EveMonitorNodeImpl
		 * @see org.evesim.monitor.impl.MonitorPackageImpl#getEveMonitorNode()
		 * @generated
		 */
		EClass EVE_MONITOR_NODE = eINSTANCE.getEveMonitorNode();

		/**
		 * The meta object literal for the '<em><b>Node Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_MONITOR_NODE__NODE_STATUS = eINSTANCE.getEveMonitorNode_NodeStatus();

		/**
		 * The meta object literal for the '{@link org.evesim.monitor.impl.EveMonitorPeerGroupImpl <em>Eve Monitor Peer Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.monitor.impl.EveMonitorPeerGroupImpl
		 * @see org.evesim.monitor.impl.MonitorPackageImpl#getEveMonitorPeerGroup()
		 * @generated
		 */
		EClass EVE_MONITOR_PEER_GROUP = eINSTANCE.getEveMonitorPeerGroup();

		/**
		 * The meta object literal for the '{@link org.evesim.monitor.NodeStatus <em>Node Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.monitor.NodeStatus
		 * @see org.evesim.monitor.impl.MonitorPackageImpl#getNodeStatus()
		 * @generated
		 */
		EEnum NODE_STATUS = eINSTANCE.getNodeStatus();

	}

} //MonitorPackage
