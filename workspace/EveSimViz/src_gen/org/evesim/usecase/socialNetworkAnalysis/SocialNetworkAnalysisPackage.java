/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface SocialNetworkAnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "socialNetworkAnalysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.evesim.org/evesim/usecase/socialNetworkAnalysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "socialNetworkAnalysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SocialNetworkAnalysisPackage eINSTANCE = org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl <em>Eve Agent SNA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveAgentSNA()
	 * @generated
	 */
	int EVE_AGENT_SNA = 0;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__ATTACHED_CONNECTIONS = EvesimPackage.EVE_AGENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__UUID = EvesimPackage.EVE_AGENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__URI = EvesimPackage.EVE_AGENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__PARENT = EvesimPackage.EVE_AGENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__SESSION_ID = EvesimPackage.EVE_AGENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__NAME = EvesimPackage.EVE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__DESCRIPTION = EvesimPackage.EVE_AGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__CHILDREN = EvesimPackage.EVE_AGENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOC_LONGITUDE = EvesimPackage.EVE_AGENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOC_LATITUDE = EvesimPackage.EVE_AGENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOC_COUNTRY = EvesimPackage.EVE_AGENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOC_CITY = EvesimPackage.EVE_AGENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOC_PO_NR = EvesimPackage.EVE_AGENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOC_ADDRESS = EvesimPackage.EVE_AGENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOC_LOCATION = EvesimPackage.EVE_AGENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__NET_IP = EvesimPackage.EVE_AGENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__NET_URL = EvesimPackage.EVE_AGENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOCATION = EvesimPackage.EVE_AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__TIME_STAMP = EvesimPackage.EVE_AGENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Prototype UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__PROTOTYPE_UUID = EvesimPackage.EVE_AGENT__PROTOTYPE_UUID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__PROTOTYPE = EvesimPackage.EVE_AGENT__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Agent Pool UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__AGENT_POOL_UUID = EvesimPackage.EVE_AGENT__AGENT_POOL_UUID;

	/**
	 * The feature id for the '<em><b>Agent Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__AGENT_POOL = EvesimPackage.EVE_AGENT__AGENT_POOL;

	/**
	 * The feature id for the '<em><b>Demanded Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__DEMANDED_SERVICES = EvesimPackage.EVE_AGENT__DEMANDED_SERVICES;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__OFFERED_SERVICES = EvesimPackage.EVE_AGENT__OFFERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Local Service Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__LOCAL_SERVICE_POOL = EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL;

	/**
	 * The feature id for the '<em><b>Betweeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__BETWEENESS = EvesimPackage.EVE_AGENT__BETWEENESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__TYPE = EvesimPackage.EVE_AGENT__TYPE;

	/**
	 * The feature id for the '<em><b>Editing Propability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__EDITING_PROPABILITY = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deleting Propability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__DELETING_PROPABILITY = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creating Propability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__CREATING_PROPABILITY = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA__STARTED = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eve Agent SNA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SNA_FEATURE_COUNT = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveGatewaySNAImpl <em>Eve Gateway SNA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveGatewaySNAImpl
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveGatewaySNA()
	 * @generated
	 */
	int EVE_GATEWAY_SNA = 1;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__ATTACHED_CONNECTIONS = EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__UUID = EvesimPackage.EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__URI = EvesimPackage.EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__PARENT = EvesimPackage.EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__SESSION_ID = EvesimPackage.EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__NAME = EvesimPackage.EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__DESCRIPTION = EvesimPackage.EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__CHILDREN = EvesimPackage.EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOC_LONGITUDE = EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOC_LATITUDE = EvesimPackage.EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOC_COUNTRY = EvesimPackage.EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOC_CITY = EvesimPackage.EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOC_PO_NR = EvesimPackage.EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOC_ADDRESS = EvesimPackage.EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOC_LOCATION = EvesimPackage.EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__NET_IP = EvesimPackage.EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__NET_URL = EvesimPackage.EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__LOCATION = EvesimPackage.EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA__TIME_STAMP = EvesimPackage.EVE_COMPONENT__TIME_STAMP;

	/**
	 * The number of structural features of the '<em>Eve Gateway SNA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_GATEWAY_SNA_FEATURE_COUNT = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveEvolutionaryAgentImpl <em>Eve Evolutionary Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveEvolutionaryAgentImpl
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveEvolutionaryAgent()
	 * @generated
	 */
	int EVE_EVOLUTIONARY_AGENT = 2;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__ATTACHED_CONNECTIONS = EvesimPackage.EVE_AGENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__UUID = EvesimPackage.EVE_AGENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__URI = EvesimPackage.EVE_AGENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__PARENT = EvesimPackage.EVE_AGENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__SESSION_ID = EvesimPackage.EVE_AGENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__NAME = EvesimPackage.EVE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__DESCRIPTION = EvesimPackage.EVE_AGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__CHILDREN = EvesimPackage.EVE_AGENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOC_LONGITUDE = EvesimPackage.EVE_AGENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOC_LATITUDE = EvesimPackage.EVE_AGENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOC_COUNTRY = EvesimPackage.EVE_AGENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOC_CITY = EvesimPackage.EVE_AGENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOC_PO_NR = EvesimPackage.EVE_AGENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOC_ADDRESS = EvesimPackage.EVE_AGENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOC_LOCATION = EvesimPackage.EVE_AGENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__NET_IP = EvesimPackage.EVE_AGENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__NET_URL = EvesimPackage.EVE_AGENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOCATION = EvesimPackage.EVE_AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__TIME_STAMP = EvesimPackage.EVE_AGENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Prototype UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__PROTOTYPE_UUID = EvesimPackage.EVE_AGENT__PROTOTYPE_UUID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__PROTOTYPE = EvesimPackage.EVE_AGENT__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Agent Pool UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__AGENT_POOL_UUID = EvesimPackage.EVE_AGENT__AGENT_POOL_UUID;

	/**
	 * The feature id for the '<em><b>Agent Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__AGENT_POOL = EvesimPackage.EVE_AGENT__AGENT_POOL;

	/**
	 * The feature id for the '<em><b>Demanded Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__DEMANDED_SERVICES = EvesimPackage.EVE_AGENT__DEMANDED_SERVICES;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__OFFERED_SERVICES = EvesimPackage.EVE_AGENT__OFFERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Local Service Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__LOCAL_SERVICE_POOL = EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL;

	/**
	 * The feature id for the '<em><b>Betweeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__BETWEENESS = EvesimPackage.EVE_AGENT__BETWEENESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__TYPE = EvesimPackage.EVE_AGENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT__IS_ROOT = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eve Evolutionary Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_EVOLUTIONARY_AGENT_FEATURE_COUNT = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl <em>Eve History Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl
	 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveHistoryAgent()
	 * @generated
	 */
	int EVE_HISTORY_AGENT = 3;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__ATTACHED_CONNECTIONS = EvesimPackage.EVE_AGENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__UUID = EvesimPackage.EVE_AGENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__URI = EvesimPackage.EVE_AGENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__PARENT = EvesimPackage.EVE_AGENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__SESSION_ID = EvesimPackage.EVE_AGENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__NAME = EvesimPackage.EVE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__DESCRIPTION = EvesimPackage.EVE_AGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__CHILDREN = EvesimPackage.EVE_AGENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOC_LONGITUDE = EvesimPackage.EVE_AGENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOC_LATITUDE = EvesimPackage.EVE_AGENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOC_COUNTRY = EvesimPackage.EVE_AGENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOC_CITY = EvesimPackage.EVE_AGENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOC_PO_NR = EvesimPackage.EVE_AGENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOC_ADDRESS = EvesimPackage.EVE_AGENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOC_LOCATION = EvesimPackage.EVE_AGENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__NET_IP = EvesimPackage.EVE_AGENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__NET_URL = EvesimPackage.EVE_AGENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOCATION = EvesimPackage.EVE_AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__TIME_STAMP = EvesimPackage.EVE_AGENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Prototype UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__PROTOTYPE_UUID = EvesimPackage.EVE_AGENT__PROTOTYPE_UUID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__PROTOTYPE = EvesimPackage.EVE_AGENT__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Agent Pool UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__AGENT_POOL_UUID = EvesimPackage.EVE_AGENT__AGENT_POOL_UUID;

	/**
	 * The feature id for the '<em><b>Agent Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__AGENT_POOL = EvesimPackage.EVE_AGENT__AGENT_POOL;

	/**
	 * The feature id for the '<em><b>Demanded Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__DEMANDED_SERVICES = EvesimPackage.EVE_AGENT__DEMANDED_SERVICES;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__OFFERED_SERVICES = EvesimPackage.EVE_AGENT__OFFERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Local Service Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__LOCAL_SERVICE_POOL = EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL;

	/**
	 * The feature id for the '<em><b>Betweeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__BETWEENESS = EvesimPackage.EVE_AGENT__BETWEENESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__TYPE = EvesimPackage.EVE_AGENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__IS_ROOT = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__BIRTHDATE = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hist Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__HIST_DATA = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sim Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT__SIM_INTERVAL = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eve History Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_AGENT_FEATURE_COUNT = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA <em>Eve Agent SNA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Agent SNA</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA
	 * @generated
	 */
	EClass getEveAgentSNA();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getEditingPropability <em>Editing Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editing Propability</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getEditingPropability()
	 * @see #getEveAgentSNA()
	 * @generated
	 */
	EAttribute getEveAgentSNA_EditingPropability();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getDeletingPropability <em>Deleting Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleting Propability</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getDeletingPropability()
	 * @see #getEveAgentSNA()
	 * @generated
	 */
	EAttribute getEveAgentSNA_DeletingPropability();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getCreatingPropability <em>Creating Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creating Propability</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#getCreatingPropability()
	 * @see #getEveAgentSNA()
	 * @generated
	 */
	EAttribute getEveAgentSNA_CreatingPropability();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA#isStarted()
	 * @see #getEveAgentSNA()
	 * @generated
	 */
	EAttribute getEveAgentSNA_Started();

	/**
	 * Returns the meta object for class '{@link org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA <em>Eve Gateway SNA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Gateway SNA</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA
	 * @generated
	 */
	EClass getEveGatewaySNA();

	/**
	 * Returns the meta object for class '{@link org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent <em>Eve Evolutionary Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Evolutionary Agent</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent
	 * @generated
	 */
	EClass getEveEvolutionaryAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent#isIsRoot()
	 * @see #getEveEvolutionaryAgent()
	 * @generated
	 */
	EAttribute getEveEvolutionaryAgent_IsRoot();

	/**
	 * Returns the meta object for class '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent <em>Eve History Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve History Agent</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent
	 * @generated
	 */
	EClass getEveHistoryAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#isIsRoot()
	 * @see #getEveHistoryAgent()
	 * @generated
	 */
	EAttribute getEveHistoryAgent_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getBirthdate()
	 * @see #getEveHistoryAgent()
	 * @generated
	 */
	EAttribute getEveHistoryAgent_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getHistData <em>Hist Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hist Data</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getHistData()
	 * @see #getEveHistoryAgent()
	 * @generated
	 */
	EAttribute getEveHistoryAgent_HistData();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getSimInterval <em>Sim Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Interval</em>'.
	 * @see org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent#getSimInterval()
	 * @see #getEveHistoryAgent()
	 * @generated
	 */
	EAttribute getEveHistoryAgent_SimInterval();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SocialNetworkAnalysisFactory getSocialNetworkAnalysisFactory();

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
		 * The meta object literal for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl <em>Eve Agent SNA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveAgentSNA()
		 * @generated
		 */
		EClass EVE_AGENT_SNA = eINSTANCE.getEveAgentSNA();

		/**
		 * The meta object literal for the '<em><b>Editing Propability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT_SNA__EDITING_PROPABILITY = eINSTANCE.getEveAgentSNA_EditingPropability();

		/**
		 * The meta object literal for the '<em><b>Deleting Propability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT_SNA__DELETING_PROPABILITY = eINSTANCE.getEveAgentSNA_DeletingPropability();

		/**
		 * The meta object literal for the '<em><b>Creating Propability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT_SNA__CREATING_PROPABILITY = eINSTANCE.getEveAgentSNA_CreatingPropability();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_AGENT_SNA__STARTED = eINSTANCE.getEveAgentSNA_Started();

		/**
		 * The meta object literal for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveGatewaySNAImpl <em>Eve Gateway SNA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveGatewaySNAImpl
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveGatewaySNA()
		 * @generated
		 */
		EClass EVE_GATEWAY_SNA = eINSTANCE.getEveGatewaySNA();

		/**
		 * The meta object literal for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveEvolutionaryAgentImpl <em>Eve Evolutionary Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveEvolutionaryAgentImpl
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveEvolutionaryAgent()
		 * @generated
		 */
		EClass EVE_EVOLUTIONARY_AGENT = eINSTANCE.getEveEvolutionaryAgent();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_EVOLUTIONARY_AGENT__IS_ROOT = eINSTANCE.getEveEvolutionaryAgent_IsRoot();

		/**
		 * The meta object literal for the '{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl <em>Eve History Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl
		 * @see org.evesim.usecase.socialNetworkAnalysis.impl.SocialNetworkAnalysisPackageImpl#getEveHistoryAgent()
		 * @generated
		 */
		EClass EVE_HISTORY_AGENT = eINSTANCE.getEveHistoryAgent();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_AGENT__IS_ROOT = eINSTANCE.getEveHistoryAgent_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_AGENT__BIRTHDATE = eINSTANCE.getEveHistoryAgent_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Hist Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_AGENT__HIST_DATA = eINSTANCE.getEveHistoryAgent_HistData();

		/**
		 * The meta object literal for the '<em><b>Sim Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_AGENT__SIM_INTERVAL = eINSTANCE.getEveHistoryAgent_SimInterval();

	}

} //SocialNetworkAnalysisPackage
