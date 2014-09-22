/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch;

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
 * @see org.evesim.usecase.semanticSearch.SemanticSearchFactory
 * @model kind="package"
 * @generated
 */
public interface SemanticSearchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semanticSearch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.evesim.org/evesim/usecase/semanticSearch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "semanticSearch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticSearchPackage eINSTANCE = org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.evesim.usecase.semanticSearch.impl.EveAgentSemanticSearchImpl <em>Eve Agent Semantic Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.usecase.semanticSearch.impl.EveAgentSemanticSearchImpl
	 * @see org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl#getEveAgentSemanticSearch()
	 * @generated
	 */
	int EVE_AGENT_SEMANTIC_SEARCH = 0;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__ATTACHED_CONNECTIONS = EvesimPackage.EVE_AGENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__UUID = EvesimPackage.EVE_AGENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__URI = EvesimPackage.EVE_AGENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__PARENT = EvesimPackage.EVE_AGENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__SESSION_ID = EvesimPackage.EVE_AGENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__NAME = EvesimPackage.EVE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__DESCRIPTION = EvesimPackage.EVE_AGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__CHILDREN = EvesimPackage.EVE_AGENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOC_LONGITUDE = EvesimPackage.EVE_AGENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOC_LATITUDE = EvesimPackage.EVE_AGENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOC_COUNTRY = EvesimPackage.EVE_AGENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOC_CITY = EvesimPackage.EVE_AGENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOC_PO_NR = EvesimPackage.EVE_AGENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOC_ADDRESS = EvesimPackage.EVE_AGENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOC_LOCATION = EvesimPackage.EVE_AGENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__NET_IP = EvesimPackage.EVE_AGENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__NET_URL = EvesimPackage.EVE_AGENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOCATION = EvesimPackage.EVE_AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__TIME_STAMP = EvesimPackage.EVE_AGENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Prototype UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__PROTOTYPE_UUID = EvesimPackage.EVE_AGENT__PROTOTYPE_UUID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__PROTOTYPE = EvesimPackage.EVE_AGENT__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Agent Pool UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__AGENT_POOL_UUID = EvesimPackage.EVE_AGENT__AGENT_POOL_UUID;

	/**
	 * The feature id for the '<em><b>Agent Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__AGENT_POOL = EvesimPackage.EVE_AGENT__AGENT_POOL;

	/**
	 * The feature id for the '<em><b>Demanded Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__DEMANDED_SERVICES = EvesimPackage.EVE_AGENT__DEMANDED_SERVICES;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__OFFERED_SERVICES = EvesimPackage.EVE_AGENT__OFFERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Local Service Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__LOCAL_SERVICE_POOL = EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL;

	/**
	 * The feature id for the '<em><b>Betweeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__BETWEENESS = EvesimPackage.EVE_AGENT__BETWEENESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH__TYPE = EvesimPackage.EVE_AGENT__TYPE;

	/**
	 * The number of structural features of the '<em>Eve Agent Semantic Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_AGENT_SEMANTIC_SEARCH_FEATURE_COUNT = EvesimPackage.EVE_AGENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.evesim.usecase.semanticSearch.impl.EveServiceSemanticSearchImpl <em>Eve Service Semantic Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.usecase.semanticSearch.impl.EveServiceSemanticSearchImpl
	 * @see org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl#getEveServiceSemanticSearch()
	 * @generated
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH = 1;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__ATTACHED_CONNECTIONS = EvesimPackage.EVE_SERVICE__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__UUID = EvesimPackage.EVE_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__URI = EvesimPackage.EVE_SERVICE__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__PARENT = EvesimPackage.EVE_SERVICE__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__SESSION_ID = EvesimPackage.EVE_SERVICE__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__NAME = EvesimPackage.EVE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__DESCRIPTION = EvesimPackage.EVE_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__CHILDREN = EvesimPackage.EVE_SERVICE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOC_LONGITUDE = EvesimPackage.EVE_SERVICE__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOC_LATITUDE = EvesimPackage.EVE_SERVICE__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOC_COUNTRY = EvesimPackage.EVE_SERVICE__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOC_CITY = EvesimPackage.EVE_SERVICE__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOC_PO_NR = EvesimPackage.EVE_SERVICE__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOC_ADDRESS = EvesimPackage.EVE_SERVICE__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOC_LOCATION = EvesimPackage.EVE_SERVICE__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__NET_IP = EvesimPackage.EVE_SERVICE__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__NET_URL = EvesimPackage.EVE_SERVICE__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__LOCATION = EvesimPackage.EVE_SERVICE__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH__TIME_STAMP = EvesimPackage.EVE_SERVICE__TIME_STAMP;

	/**
	 * The number of structural features of the '<em>Eve Service Semantic Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERVICE_SEMANTIC_SEARCH_FEATURE_COUNT = EvesimPackage.EVE_SERVICE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.evesim.usecase.semanticSearch.EveAgentSemanticSearch <em>Eve Agent Semantic Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Agent Semantic Search</em>'.
	 * @see org.evesim.usecase.semanticSearch.EveAgentSemanticSearch
	 * @generated
	 */
	EClass getEveAgentSemanticSearch();

	/**
	 * Returns the meta object for class '{@link org.evesim.usecase.semanticSearch.EveServiceSemanticSearch <em>Eve Service Semantic Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Service Semantic Search</em>'.
	 * @see org.evesim.usecase.semanticSearch.EveServiceSemanticSearch
	 * @generated
	 */
	EClass getEveServiceSemanticSearch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemanticSearchFactory getSemanticSearchFactory();

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
		 * The meta object literal for the '{@link org.evesim.usecase.semanticSearch.impl.EveAgentSemanticSearchImpl <em>Eve Agent Semantic Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.usecase.semanticSearch.impl.EveAgentSemanticSearchImpl
		 * @see org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl#getEveAgentSemanticSearch()
		 * @generated
		 */
		EClass EVE_AGENT_SEMANTIC_SEARCH = eINSTANCE.getEveAgentSemanticSearch();
		/**
		 * The meta object literal for the '{@link org.evesim.usecase.semanticSearch.impl.EveServiceSemanticSearchImpl <em>Eve Service Semantic Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.usecase.semanticSearch.impl.EveServiceSemanticSearchImpl
		 * @see org.evesim.usecase.semanticSearch.impl.SemanticSearchPackageImpl#getEveServiceSemanticSearch()
		 * @generated
		 */
		EClass EVE_SERVICE_SEMANTIC_SEARCH = eINSTANCE.getEveServiceSemanticSearch();

	}

} //SemanticSearchPackage
