/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer;

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
 * @see org.evesim.timer.TimerFactory
 * @model kind="package"
 * @generated
 */
public interface TimerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.evesim.org/evesim/timer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimerPackage eINSTANCE = org.evesim.timer.impl.TimerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.evesim.timer.impl.EveTimerImpl <em>Eve Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.timer.impl.EveTimerImpl
	 * @see org.evesim.timer.impl.TimerPackageImpl#getEveTimer()
	 * @generated
	 */
	int EVE_TIMER = 0;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__ATTACHED_CONNECTIONS = EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__UUID = EvesimPackage.EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__URI = EvesimPackage.EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__PARENT = EvesimPackage.EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__SESSION_ID = EvesimPackage.EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__NAME = EvesimPackage.EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__DESCRIPTION = EvesimPackage.EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__CHILDREN = EvesimPackage.EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOC_LONGITUDE = EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOC_LATITUDE = EvesimPackage.EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOC_COUNTRY = EvesimPackage.EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOC_CITY = EvesimPackage.EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOC_PO_NR = EvesimPackage.EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOC_ADDRESS = EvesimPackage.EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOC_LOCATION = EvesimPackage.EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__NET_IP = EvesimPackage.EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__NET_URL = EvesimPackage.EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__LOCATION = EvesimPackage.EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__TIME_STAMP = EvesimPackage.EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Timer Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__TIMER_THREAD = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER__RUNNING = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eve Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_TIMER_FEATURE_COUNT = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.evesim.timer.impl.EveRepeatingTimerImpl <em>Eve Repeating Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.timer.impl.EveRepeatingTimerImpl
	 * @see org.evesim.timer.impl.TimerPackageImpl#getEveRepeatingTimer()
	 * @generated
	 */
	int EVE_REPEATING_TIMER = 1;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__ATTACHED_CONNECTIONS = EVE_TIMER__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__UUID = EVE_TIMER__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__URI = EVE_TIMER__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__PARENT = EVE_TIMER__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__SESSION_ID = EVE_TIMER__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__NAME = EVE_TIMER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__DESCRIPTION = EVE_TIMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__CHILDREN = EVE_TIMER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOC_LONGITUDE = EVE_TIMER__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOC_LATITUDE = EVE_TIMER__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOC_COUNTRY = EVE_TIMER__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOC_CITY = EVE_TIMER__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOC_PO_NR = EVE_TIMER__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOC_ADDRESS = EVE_TIMER__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOC_LOCATION = EVE_TIMER__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__NET_IP = EVE_TIMER__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__NET_URL = EVE_TIMER__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__LOCATION = EVE_TIMER__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__TIME_STAMP = EVE_TIMER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Timer Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__TIMER_THREAD = EVE_TIMER__TIMER_THREAD;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__RUNNING = EVE_TIMER__RUNNING;

	/**
	 * The feature id for the '<em><b>Max Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__MAX_REPEAT = EVE_TIMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sleep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__SLEEP = EVE_TIMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER__COUNTER = EVE_TIMER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Eve Repeating Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_REPEATING_TIMER_FEATURE_COUNT = EVE_TIMER_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.evesim.timer.impl.EveStartingTimerImpl <em>Eve Starting Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.timer.impl.EveStartingTimerImpl
	 * @see org.evesim.timer.impl.TimerPackageImpl#getEveStartingTimer()
	 * @generated
	 */
	int EVE_STARTING_TIMER = 2;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__ATTACHED_CONNECTIONS = EVE_TIMER__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__UUID = EVE_TIMER__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__URI = EVE_TIMER__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__PARENT = EVE_TIMER__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__SESSION_ID = EVE_TIMER__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__NAME = EVE_TIMER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__DESCRIPTION = EVE_TIMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__CHILDREN = EVE_TIMER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOC_LONGITUDE = EVE_TIMER__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOC_LATITUDE = EVE_TIMER__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOC_COUNTRY = EVE_TIMER__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOC_CITY = EVE_TIMER__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOC_PO_NR = EVE_TIMER__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOC_ADDRESS = EVE_TIMER__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOC_LOCATION = EVE_TIMER__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__NET_IP = EVE_TIMER__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__NET_URL = EVE_TIMER__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__LOCATION = EVE_TIMER__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__TIME_STAMP = EVE_TIMER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Timer Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__TIMER_THREAD = EVE_TIMER__TIMER_THREAD;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER__RUNNING = EVE_TIMER__RUNNING;

	/**
	 * The number of structural features of the '<em>Eve Starting Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_STARTING_TIMER_FEATURE_COUNT = EVE_TIMER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.evesim.timer.impl.EveFunctionTimerImpl <em>Eve Function Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.timer.impl.EveFunctionTimerImpl
	 * @see org.evesim.timer.impl.TimerPackageImpl#getEveFunctionTimer()
	 * @generated
	 */
	int EVE_FUNCTION_TIMER = 3;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__ATTACHED_CONNECTIONS = EVE_TIMER__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__UUID = EVE_TIMER__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__URI = EVE_TIMER__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__PARENT = EVE_TIMER__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__SESSION_ID = EVE_TIMER__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__NAME = EVE_TIMER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__DESCRIPTION = EVE_TIMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__CHILDREN = EVE_TIMER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOC_LONGITUDE = EVE_TIMER__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOC_LATITUDE = EVE_TIMER__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOC_COUNTRY = EVE_TIMER__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOC_CITY = EVE_TIMER__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOC_PO_NR = EVE_TIMER__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOC_ADDRESS = EVE_TIMER__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOC_LOCATION = EVE_TIMER__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__NET_IP = EVE_TIMER__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__NET_URL = EVE_TIMER__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__LOCATION = EVE_TIMER__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__TIME_STAMP = EVE_TIMER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Timer Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__TIMER_THREAD = EVE_TIMER__TIMER_THREAD;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__RUNNING = EVE_TIMER__RUNNING;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__COUNTER = EVE_TIMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__MAX_REPEAT = EVE_TIMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Exponential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__IS_EXPONENTIAL = EVE_TIMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Logarithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__IS_LOGARITHMIC = EVE_TIMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__GRADIENT = EVE_TIMER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__CONSTANT = EVE_TIMER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sleep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__SLEEP = EVE_TIMER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__POWER = EVE_TIMER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER__IS_POWER = EVE_TIMER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Eve Function Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FUNCTION_TIMER_FEATURE_COUNT = EVE_TIMER_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.evesim.timer.impl.EveHistoryTimerImpl <em>Eve History Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.timer.impl.EveHistoryTimerImpl
	 * @see org.evesim.timer.impl.TimerPackageImpl#getEveHistoryTimer()
	 * @generated
	 */
	int EVE_HISTORY_TIMER = 4;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__ATTACHED_CONNECTIONS = EVE_TIMER__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__UUID = EVE_TIMER__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__URI = EVE_TIMER__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__PARENT = EVE_TIMER__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__SESSION_ID = EVE_TIMER__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__NAME = EVE_TIMER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__DESCRIPTION = EVE_TIMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__CHILDREN = EVE_TIMER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOC_LONGITUDE = EVE_TIMER__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOC_LATITUDE = EVE_TIMER__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOC_COUNTRY = EVE_TIMER__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOC_CITY = EVE_TIMER__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOC_PO_NR = EVE_TIMER__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOC_ADDRESS = EVE_TIMER__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOC_LOCATION = EVE_TIMER__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__NET_IP = EVE_TIMER__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__NET_URL = EVE_TIMER__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__LOCATION = EVE_TIMER__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__TIME_STAMP = EVE_TIMER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Timer Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__TIMER_THREAD = EVE_TIMER__TIMER_THREAD;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__RUNNING = EVE_TIMER__RUNNING;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__CURRENT_TIME = EVE_TIMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__MAX_REPEAT = EVE_TIMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sleep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__SLEEP = EVE_TIMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__COUNTER = EVE_TIMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sim Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER__SIM_INTERVAL = EVE_TIMER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Eve History Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_HISTORY_TIMER_FEATURE_COUNT = EVE_TIMER_FEATURE_COUNT + 5;

	/**
	 * Returns the meta object for class '{@link org.evesim.timer.EveTimer <em>Eve Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Timer</em>'.
	 * @see org.evesim.timer.EveTimer
	 * @generated
	 */
	EClass getEveTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveTimer#getTimerThread <em>Timer Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer Thread</em>'.
	 * @see org.evesim.timer.EveTimer#getTimerThread()
	 * @see #getEveTimer()
	 * @generated
	 */
	EAttribute getEveTimer_TimerThread();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveTimer#getRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see org.evesim.timer.EveTimer#getRunning()
	 * @see #getEveTimer()
	 * @generated
	 */
	EAttribute getEveTimer_Running();

	/**
	 * Returns the meta object for class '{@link org.evesim.timer.EveRepeatingTimer <em>Eve Repeating Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Repeating Timer</em>'.
	 * @see org.evesim.timer.EveRepeatingTimer
	 * @generated
	 */
	EClass getEveRepeatingTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveRepeatingTimer#getMaxRepeat <em>Max Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Repeat</em>'.
	 * @see org.evesim.timer.EveRepeatingTimer#getMaxRepeat()
	 * @see #getEveRepeatingTimer()
	 * @generated
	 */
	EAttribute getEveRepeatingTimer_MaxRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveRepeatingTimer#getSleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleep</em>'.
	 * @see org.evesim.timer.EveRepeatingTimer#getSleep()
	 * @see #getEveRepeatingTimer()
	 * @generated
	 */
	EAttribute getEveRepeatingTimer_Sleep();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveRepeatingTimer#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see org.evesim.timer.EveRepeatingTimer#getCounter()
	 * @see #getEveRepeatingTimer()
	 * @generated
	 */
	EAttribute getEveRepeatingTimer_Counter();

	/**
	 * Returns the meta object for class '{@link org.evesim.timer.EveStartingTimer <em>Eve Starting Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Starting Timer</em>'.
	 * @see org.evesim.timer.EveStartingTimer
	 * @generated
	 */
	EClass getEveStartingTimer();

	/**
	 * Returns the meta object for class '{@link org.evesim.timer.EveFunctionTimer <em>Eve Function Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Function Timer</em>'.
	 * @see org.evesim.timer.EveFunctionTimer
	 * @generated
	 */
	EClass getEveFunctionTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#getCounter()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_Counter();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#getMaxRepeat <em>Max Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Repeat</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#getMaxRepeat()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_MaxRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#isIsExponential <em>Is Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exponential</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#isIsExponential()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_IsExponential();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#isIsLogarithmic <em>Is Logarithmic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Logarithmic</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#isIsLogarithmic()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_IsLogarithmic();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#getGradient()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_Gradient();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#getConstant()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#getSleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleep</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#getSleep()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_Sleep();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#getPower()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_Power();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveFunctionTimer#isIsPower <em>Is Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Power</em>'.
	 * @see org.evesim.timer.EveFunctionTimer#isIsPower()
	 * @see #getEveFunctionTimer()
	 * @generated
	 */
	EAttribute getEveFunctionTimer_IsPower();

	/**
	 * Returns the meta object for class '{@link org.evesim.timer.EveHistoryTimer <em>Eve History Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve History Timer</em>'.
	 * @see org.evesim.timer.EveHistoryTimer
	 * @generated
	 */
	EClass getEveHistoryTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveHistoryTimer#getCurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Time</em>'.
	 * @see org.evesim.timer.EveHistoryTimer#getCurrentTime()
	 * @see #getEveHistoryTimer()
	 * @generated
	 */
	EAttribute getEveHistoryTimer_CurrentTime();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveHistoryTimer#getMaxRepeat <em>Max Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Repeat</em>'.
	 * @see org.evesim.timer.EveHistoryTimer#getMaxRepeat()
	 * @see #getEveHistoryTimer()
	 * @generated
	 */
	EAttribute getEveHistoryTimer_MaxRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveHistoryTimer#getSleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleep</em>'.
	 * @see org.evesim.timer.EveHistoryTimer#getSleep()
	 * @see #getEveHistoryTimer()
	 * @generated
	 */
	EAttribute getEveHistoryTimer_Sleep();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveHistoryTimer#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see org.evesim.timer.EveHistoryTimer#getCounter()
	 * @see #getEveHistoryTimer()
	 * @generated
	 */
	EAttribute getEveHistoryTimer_Counter();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.timer.EveHistoryTimer#getSimInterval <em>Sim Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Interval</em>'.
	 * @see org.evesim.timer.EveHistoryTimer#getSimInterval()
	 * @see #getEveHistoryTimer()
	 * @generated
	 */
	EAttribute getEveHistoryTimer_SimInterval();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimerFactory getTimerFactory();

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
		 * The meta object literal for the '{@link org.evesim.timer.impl.EveTimerImpl <em>Eve Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.timer.impl.EveTimerImpl
		 * @see org.evesim.timer.impl.TimerPackageImpl#getEveTimer()
		 * @generated
		 */
		EClass EVE_TIMER = eINSTANCE.getEveTimer();

		/**
		 * The meta object literal for the '<em><b>Timer Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_TIMER__TIMER_THREAD = eINSTANCE.getEveTimer_TimerThread();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_TIMER__RUNNING = eINSTANCE.getEveTimer_Running();

		/**
		 * The meta object literal for the '{@link org.evesim.timer.impl.EveRepeatingTimerImpl <em>Eve Repeating Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.timer.impl.EveRepeatingTimerImpl
		 * @see org.evesim.timer.impl.TimerPackageImpl#getEveRepeatingTimer()
		 * @generated
		 */
		EClass EVE_REPEATING_TIMER = eINSTANCE.getEveRepeatingTimer();

		/**
		 * The meta object literal for the '<em><b>Max Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_REPEATING_TIMER__MAX_REPEAT = eINSTANCE.getEveRepeatingTimer_MaxRepeat();

		/**
		 * The meta object literal for the '<em><b>Sleep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_REPEATING_TIMER__SLEEP = eINSTANCE.getEveRepeatingTimer_Sleep();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_REPEATING_TIMER__COUNTER = eINSTANCE.getEveRepeatingTimer_Counter();

		/**
		 * The meta object literal for the '{@link org.evesim.timer.impl.EveStartingTimerImpl <em>Eve Starting Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.timer.impl.EveStartingTimerImpl
		 * @see org.evesim.timer.impl.TimerPackageImpl#getEveStartingTimer()
		 * @generated
		 */
		EClass EVE_STARTING_TIMER = eINSTANCE.getEveStartingTimer();

		/**
		 * The meta object literal for the '{@link org.evesim.timer.impl.EveFunctionTimerImpl <em>Eve Function Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.timer.impl.EveFunctionTimerImpl
		 * @see org.evesim.timer.impl.TimerPackageImpl#getEveFunctionTimer()
		 * @generated
		 */
		EClass EVE_FUNCTION_TIMER = eINSTANCE.getEveFunctionTimer();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__COUNTER = eINSTANCE.getEveFunctionTimer_Counter();

		/**
		 * The meta object literal for the '<em><b>Max Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__MAX_REPEAT = eINSTANCE.getEveFunctionTimer_MaxRepeat();

		/**
		 * The meta object literal for the '<em><b>Is Exponential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__IS_EXPONENTIAL = eINSTANCE.getEveFunctionTimer_IsExponential();

		/**
		 * The meta object literal for the '<em><b>Is Logarithmic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__IS_LOGARITHMIC = eINSTANCE.getEveFunctionTimer_IsLogarithmic();

		/**
		 * The meta object literal for the '<em><b>Gradient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__GRADIENT = eINSTANCE.getEveFunctionTimer_Gradient();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__CONSTANT = eINSTANCE.getEveFunctionTimer_Constant();

		/**
		 * The meta object literal for the '<em><b>Sleep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__SLEEP = eINSTANCE.getEveFunctionTimer_Sleep();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__POWER = eINSTANCE.getEveFunctionTimer_Power();

		/**
		 * The meta object literal for the '<em><b>Is Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FUNCTION_TIMER__IS_POWER = eINSTANCE.getEveFunctionTimer_IsPower();

		/**
		 * The meta object literal for the '{@link org.evesim.timer.impl.EveHistoryTimerImpl <em>Eve History Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.timer.impl.EveHistoryTimerImpl
		 * @see org.evesim.timer.impl.TimerPackageImpl#getEveHistoryTimer()
		 * @generated
		 */
		EClass EVE_HISTORY_TIMER = eINSTANCE.getEveHistoryTimer();

		/**
		 * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_TIMER__CURRENT_TIME = eINSTANCE.getEveHistoryTimer_CurrentTime();

		/**
		 * The meta object literal for the '<em><b>Max Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_TIMER__MAX_REPEAT = eINSTANCE.getEveHistoryTimer_MaxRepeat();

		/**
		 * The meta object literal for the '<em><b>Sleep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_TIMER__SLEEP = eINSTANCE.getEveHistoryTimer_Sleep();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_TIMER__COUNTER = eINSTANCE.getEveHistoryTimer_Counter();

		/**
		 * The meta object literal for the '<em><b>Sim Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_HISTORY_TIMER__SIM_INTERVAL = eINSTANCE.getEveHistoryTimer_SimInterval();

	}

} //TimerPackage
