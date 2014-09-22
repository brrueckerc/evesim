/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.evesim.msg.MsgFactory
 * @model kind="package"
 * @generated
 */
public interface MsgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "msg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.evesim.org/evesim/msg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsgPackage eINSTANCE = org.evesim.msg.impl.MsgPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.evesim.msg.impl.EveMessageImpl <em>Eve Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.impl.EveMessageImpl
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveMessage()
	 * @generated
	 */
	int EVE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Message UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE__MESSAGE_UUID = 0;

	/**
	 * The feature id for the '<em><b>Session UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE__SESSION_UUID = 1;

	/**
	 * The feature id for the '<em><b>Sender UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE__SENDER_UUID = 2;

	/**
	 * The feature id for the '<em><b>Reciever UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE__RECIEVER_UUID = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE__TIMESTAMP = 4;

	/**
	 * The number of structural features of the '<em>Eve Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.evesim.msg.impl.EveLogMessageImpl <em>Eve Log Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.impl.EveLogMessageImpl
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveLogMessage()
	 * @generated
	 */
	int EVE_LOG_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Message UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE__MESSAGE_UUID = EVE_MESSAGE__MESSAGE_UUID;

	/**
	 * The feature id for the '<em><b>Session UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE__SESSION_UUID = EVE_MESSAGE__SESSION_UUID;

	/**
	 * The feature id for the '<em><b>Sender UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE__SENDER_UUID = EVE_MESSAGE__SENDER_UUID;

	/**
	 * The feature id for the '<em><b>Reciever UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE__RECIEVER_UUID = EVE_MESSAGE__RECIEVER_UUID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE__TIMESTAMP = EVE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE__MESSAGE = EVE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE__DETAIL = EVE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eve Log Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_LOG_MESSAGE_FEATURE_COUNT = EVE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.evesim.msg.impl.EveUpdateMessageImpl <em>Eve Update Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.impl.EveUpdateMessageImpl
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveUpdateMessage()
	 * @generated
	 */
	int EVE_UPDATE_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Message UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__MESSAGE_UUID = EVE_MESSAGE__MESSAGE_UUID;

	/**
	 * The feature id for the '<em><b>Session UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__SESSION_UUID = EVE_MESSAGE__SESSION_UUID;

	/**
	 * The feature id for the '<em><b>Sender UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__SENDER_UUID = EVE_MESSAGE__SENDER_UUID;

	/**
	 * The feature id for the '<em><b>Reciever UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__RECIEVER_UUID = EVE_MESSAGE__RECIEVER_UUID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__TIMESTAMP = EVE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME = EVE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__OLD_VALUE = EVE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__NEW_VALUE = EVE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE__FEATURE_ID = EVE_MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eve Update Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_UPDATE_MESSAGE_FEATURE_COUNT = EVE_MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.evesim.msg.impl.EveSerializedMessageImpl <em>Eve Serialized Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.impl.EveSerializedMessageImpl
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveSerializedMessage()
	 * @generated
	 */
	int EVE_SERIALIZED_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Message UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERIALIZED_MESSAGE__MESSAGE_UUID = EVE_MESSAGE__MESSAGE_UUID;

	/**
	 * The feature id for the '<em><b>Session UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERIALIZED_MESSAGE__SESSION_UUID = EVE_MESSAGE__SESSION_UUID;

	/**
	 * The feature id for the '<em><b>Sender UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERIALIZED_MESSAGE__SENDER_UUID = EVE_MESSAGE__SENDER_UUID;

	/**
	 * The feature id for the '<em><b>Reciever UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERIALIZED_MESSAGE__RECIEVER_UUID = EVE_MESSAGE__RECIEVER_UUID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERIALIZED_MESSAGE__TIMESTAMP = EVE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERIALIZED_MESSAGE__PAYLOAD = EVE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eve Serialized Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_SERIALIZED_MESSAGE_FEATURE_COUNT = EVE_MESSAGE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.evesim.msg.impl.EveMessageBundleImpl <em>Eve Message Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.impl.EveMessageBundleImpl
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveMessageBundle()
	 * @generated
	 */
	int EVE_MESSAGE_BUNDLE = 4;

	/**
	 * The feature id for the '<em><b>Message UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_BUNDLE__MESSAGE_UUID = EVE_MESSAGE__MESSAGE_UUID;

	/**
	 * The feature id for the '<em><b>Session UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_BUNDLE__SESSION_UUID = EVE_MESSAGE__SESSION_UUID;

	/**
	 * The feature id for the '<em><b>Sender UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_BUNDLE__SENDER_UUID = EVE_MESSAGE__SENDER_UUID;

	/**
	 * The feature id for the '<em><b>Reciever UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_BUNDLE__RECIEVER_UUID = EVE_MESSAGE__RECIEVER_UUID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_BUNDLE__TIMESTAMP = EVE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_BUNDLE__MESSAGES = EVE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eve Message Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_MESSAGE_BUNDLE_FEATURE_COUNT = EVE_MESSAGE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.evesim.msg.impl.EveDataMessageImpl <em>Eve Data Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.impl.EveDataMessageImpl
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveDataMessage()
	 * @generated
	 */
	int EVE_DATA_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Message UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_DATA_MESSAGE__MESSAGE_UUID = EVE_MESSAGE__MESSAGE_UUID;

	/**
	 * The feature id for the '<em><b>Session UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_DATA_MESSAGE__SESSION_UUID = EVE_MESSAGE__SESSION_UUID;

	/**
	 * The feature id for the '<em><b>Sender UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_DATA_MESSAGE__SENDER_UUID = EVE_MESSAGE__SENDER_UUID;

	/**
	 * The feature id for the '<em><b>Reciever UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_DATA_MESSAGE__RECIEVER_UUID = EVE_MESSAGE__RECIEVER_UUID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_DATA_MESSAGE__TIMESTAMP = EVE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Hashtable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_DATA_MESSAGE__HASHTABLE = EVE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eve Data Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_DATA_MESSAGE_FEATURE_COUNT = EVE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.evesim.msg.impl.EveFileMessageSinkImpl <em>Eve File Message Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.impl.EveFileMessageSinkImpl
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveFileMessageSink()
	 * @generated
	 */
	int EVE_FILE_MESSAGE_SINK = 6;

	/**
	 * The feature id for the '<em><b>Attached Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__ATTACHED_CONNECTIONS = EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__UUID = EvesimPackage.EVE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__URI = EvesimPackage.EVE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__PARENT = EvesimPackage.EVE_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__SESSION_ID = EvesimPackage.EVE_COMPONENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__NAME = EvesimPackage.EVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__DESCRIPTION = EvesimPackage.EVE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__CHILDREN = EvesimPackage.EVE_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOC_LONGITUDE = EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE;

	/**
	 * The feature id for the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOC_LATITUDE = EvesimPackage.EVE_COMPONENT__LOC_LATITUDE;

	/**
	 * The feature id for the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOC_COUNTRY = EvesimPackage.EVE_COMPONENT__LOC_COUNTRY;

	/**
	 * The feature id for the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOC_CITY = EvesimPackage.EVE_COMPONENT__LOC_CITY;

	/**
	 * The feature id for the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOC_PO_NR = EvesimPackage.EVE_COMPONENT__LOC_PO_NR;

	/**
	 * The feature id for the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOC_ADDRESS = EvesimPackage.EVE_COMPONENT__LOC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOC_LOCATION = EvesimPackage.EVE_COMPONENT__LOC_LOCATION;

	/**
	 * The feature id for the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__NET_IP = EvesimPackage.EVE_COMPONENT__NET_IP;

	/**
	 * The feature id for the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__NET_URL = EvesimPackage.EVE_COMPONENT__NET_URL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__LOCATION = EvesimPackage.EVE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__TIME_STAMP = EvesimPackage.EVE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__FILENAME = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__FILETYPE = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Append</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__APPEND = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delimeter Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eve File Message Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVE_FILE_MESSAGE_SINK_FEATURE_COUNT = EvesimPackage.EVE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.evesim.msg.EveFileMessageSinkType <em>Eve File Message Sink Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.evesim.msg.EveFileMessageSinkType
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveFileMessageSinkType()
	 * @generated
	 */
	int EVE_FILE_MESSAGE_SINK_TYPE = 7;

	/**
	 * The meta object id for the '<em>Eve Message Hashtable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Hashtable
	 * @see org.evesim.msg.impl.MsgPackageImpl#getEveMessageHashtable()
	 * @generated
	 */
	int EVE_MESSAGE_HASHTABLE = 8;


	/**
	 * Returns the meta object for class '{@link org.evesim.msg.EveMessage <em>Eve Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Message</em>'.
	 * @see org.evesim.msg.EveMessage
	 * @generated
	 */
	EClass getEveMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveMessage#getMessageUUID <em>Message UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message UUID</em>'.
	 * @see org.evesim.msg.EveMessage#getMessageUUID()
	 * @see #getEveMessage()
	 * @generated
	 */
	EAttribute getEveMessage_MessageUUID();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveMessage#getSessionUUID <em>Session UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session UUID</em>'.
	 * @see org.evesim.msg.EveMessage#getSessionUUID()
	 * @see #getEveMessage()
	 * @generated
	 */
	EAttribute getEveMessage_SessionUUID();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveMessage#getSenderUUID <em>Sender UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender UUID</em>'.
	 * @see org.evesim.msg.EveMessage#getSenderUUID()
	 * @see #getEveMessage()
	 * @generated
	 */
	EAttribute getEveMessage_SenderUUID();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveMessage#getRecieverUUID <em>Reciever UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reciever UUID</em>'.
	 * @see org.evesim.msg.EveMessage#getRecieverUUID()
	 * @see #getEveMessage()
	 * @generated
	 */
	EAttribute getEveMessage_RecieverUUID();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveMessage#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.evesim.msg.EveMessage#getTimestamp()
	 * @see #getEveMessage()
	 * @generated
	 */
	EAttribute getEveMessage_Timestamp();

	/**
	 * Returns the meta object for class '{@link org.evesim.msg.EveLogMessage <em>Eve Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Log Message</em>'.
	 * @see org.evesim.msg.EveLogMessage
	 * @generated
	 */
	EClass getEveLogMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveLogMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.evesim.msg.EveLogMessage#getMessage()
	 * @see #getEveLogMessage()
	 * @generated
	 */
	EAttribute getEveLogMessage_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveLogMessage#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see org.evesim.msg.EveLogMessage#getDetail()
	 * @see #getEveLogMessage()
	 * @generated
	 */
	EAttribute getEveLogMessage_Detail();

	/**
	 * Returns the meta object for class '{@link org.evesim.msg.EveUpdateMessage <em>Eve Update Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Update Message</em>'.
	 * @see org.evesim.msg.EveUpdateMessage
	 * @generated
	 */
	EClass getEveUpdateMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveUpdateMessage#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.evesim.msg.EveUpdateMessage#getAttributeName()
	 * @see #getEveUpdateMessage()
	 * @generated
	 */
	EAttribute getEveUpdateMessage_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveUpdateMessage#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see org.evesim.msg.EveUpdateMessage#getOldValue()
	 * @see #getEveUpdateMessage()
	 * @generated
	 */
	EAttribute getEveUpdateMessage_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveUpdateMessage#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see org.evesim.msg.EveUpdateMessage#getNewValue()
	 * @see #getEveUpdateMessage()
	 * @generated
	 */
	EAttribute getEveUpdateMessage_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveUpdateMessage#getFeatureID <em>Feature ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature ID</em>'.
	 * @see org.evesim.msg.EveUpdateMessage#getFeatureID()
	 * @see #getEveUpdateMessage()
	 * @generated
	 */
	EAttribute getEveUpdateMessage_FeatureID();

	/**
	 * Returns the meta object for class '{@link org.evesim.msg.EveSerializedMessage <em>Eve Serialized Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Serialized Message</em>'.
	 * @see org.evesim.msg.EveSerializedMessage
	 * @generated
	 */
	EClass getEveSerializedMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveSerializedMessage#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload</em>'.
	 * @see org.evesim.msg.EveSerializedMessage#getPayload()
	 * @see #getEveSerializedMessage()
	 * @generated
	 */
	EAttribute getEveSerializedMessage_Payload();

	/**
	 * Returns the meta object for class '{@link org.evesim.msg.EveMessageBundle <em>Eve Message Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Message Bundle</em>'.
	 * @see org.evesim.msg.EveMessageBundle
	 * @generated
	 */
	EClass getEveMessageBundle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.evesim.msg.EveMessageBundle#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.evesim.msg.EveMessageBundle#getMessages()
	 * @see #getEveMessageBundle()
	 * @generated
	 */
	EReference getEveMessageBundle_Messages();

	/**
	 * Returns the meta object for class '{@link org.evesim.msg.EveDataMessage <em>Eve Data Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve Data Message</em>'.
	 * @see org.evesim.msg.EveDataMessage
	 * @generated
	 */
	EClass getEveDataMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveDataMessage#getHashtable <em>Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hashtable</em>'.
	 * @see org.evesim.msg.EveDataMessage#getHashtable()
	 * @see #getEveDataMessage()
	 * @generated
	 */
	EAttribute getEveDataMessage_Hashtable();

	/**
	 * Returns the meta object for class '{@link org.evesim.msg.EveFileMessageSink <em>Eve File Message Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eve File Message Sink</em>'.
	 * @see org.evesim.msg.EveFileMessageSink
	 * @generated
	 */
	EClass getEveFileMessageSink();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveFileMessageSink#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.evesim.msg.EveFileMessageSink#getFilename()
	 * @see #getEveFileMessageSink()
	 * @generated
	 */
	EAttribute getEveFileMessageSink_Filename();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveFileMessageSink#getFiletype <em>Filetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filetype</em>'.
	 * @see org.evesim.msg.EveFileMessageSink#getFiletype()
	 * @see #getEveFileMessageSink()
	 * @generated
	 */
	EAttribute getEveFileMessageSink_Filetype();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveFileMessageSink#isAppend <em>Append</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Append</em>'.
	 * @see org.evesim.msg.EveFileMessageSink#isAppend()
	 * @see #getEveFileMessageSink()
	 * @generated
	 */
	EAttribute getEveFileMessageSink_Append();

	/**
	 * Returns the meta object for the attribute '{@link org.evesim.msg.EveFileMessageSink#getDelimeterField <em>Delimeter Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimeter Field</em>'.
	 * @see org.evesim.msg.EveFileMessageSink#getDelimeterField()
	 * @see #getEveFileMessageSink()
	 * @generated
	 */
	EAttribute getEveFileMessageSink_DelimeterField();

	/**
	 * Returns the meta object for enum '{@link org.evesim.msg.EveFileMessageSinkType <em>Eve File Message Sink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eve File Message Sink Type</em>'.
	 * @see org.evesim.msg.EveFileMessageSinkType
	 * @generated
	 */
	EEnum getEveFileMessageSinkType();

	/**
	 * Returns the meta object for data type '{@link java.util.Hashtable <em>Eve Message Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Eve Message Hashtable</em>'.
	 * @see java.util.Hashtable
	 * @model instanceClass="java.util.Hashtable<java.lang.String, java.io.Serializable>"
	 * @generated
	 */
	EDataType getEveMessageHashtable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MsgFactory getMsgFactory();

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
		 * The meta object literal for the '{@link org.evesim.msg.impl.EveMessageImpl <em>Eve Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.impl.EveMessageImpl
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveMessage()
		 * @generated
		 */
		EClass EVE_MESSAGE = eINSTANCE.getEveMessage();

		/**
		 * The meta object literal for the '<em><b>Message UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_MESSAGE__MESSAGE_UUID = eINSTANCE.getEveMessage_MessageUUID();

		/**
		 * The meta object literal for the '<em><b>Session UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_MESSAGE__SESSION_UUID = eINSTANCE.getEveMessage_SessionUUID();

		/**
		 * The meta object literal for the '<em><b>Sender UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_MESSAGE__SENDER_UUID = eINSTANCE.getEveMessage_SenderUUID();

		/**
		 * The meta object literal for the '<em><b>Reciever UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_MESSAGE__RECIEVER_UUID = eINSTANCE.getEveMessage_RecieverUUID();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_MESSAGE__TIMESTAMP = eINSTANCE.getEveMessage_Timestamp();

		/**
		 * The meta object literal for the '{@link org.evesim.msg.impl.EveLogMessageImpl <em>Eve Log Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.impl.EveLogMessageImpl
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveLogMessage()
		 * @generated
		 */
		EClass EVE_LOG_MESSAGE = eINSTANCE.getEveLogMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOG_MESSAGE__MESSAGE = eINSTANCE.getEveLogMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_LOG_MESSAGE__DETAIL = eINSTANCE.getEveLogMessage_Detail();

		/**
		 * The meta object literal for the '{@link org.evesim.msg.impl.EveUpdateMessageImpl <em>Eve Update Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.impl.EveUpdateMessageImpl
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveUpdateMessage()
		 * @generated
		 */
		EClass EVE_UPDATE_MESSAGE = eINSTANCE.getEveUpdateMessage();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME = eINSTANCE.getEveUpdateMessage_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_UPDATE_MESSAGE__OLD_VALUE = eINSTANCE.getEveUpdateMessage_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_UPDATE_MESSAGE__NEW_VALUE = eINSTANCE.getEveUpdateMessage_NewValue();

		/**
		 * The meta object literal for the '<em><b>Feature ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_UPDATE_MESSAGE__FEATURE_ID = eINSTANCE.getEveUpdateMessage_FeatureID();

		/**
		 * The meta object literal for the '{@link org.evesim.msg.impl.EveSerializedMessageImpl <em>Eve Serialized Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.impl.EveSerializedMessageImpl
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveSerializedMessage()
		 * @generated
		 */
		EClass EVE_SERIALIZED_MESSAGE = eINSTANCE.getEveSerializedMessage();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_SERIALIZED_MESSAGE__PAYLOAD = eINSTANCE.getEveSerializedMessage_Payload();

		/**
		 * The meta object literal for the '{@link org.evesim.msg.impl.EveMessageBundleImpl <em>Eve Message Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.impl.EveMessageBundleImpl
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveMessageBundle()
		 * @generated
		 */
		EClass EVE_MESSAGE_BUNDLE = eINSTANCE.getEveMessageBundle();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVE_MESSAGE_BUNDLE__MESSAGES = eINSTANCE.getEveMessageBundle_Messages();

		/**
		 * The meta object literal for the '{@link org.evesim.msg.impl.EveDataMessageImpl <em>Eve Data Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.impl.EveDataMessageImpl
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveDataMessage()
		 * @generated
		 */
		EClass EVE_DATA_MESSAGE = eINSTANCE.getEveDataMessage();

		/**
		 * The meta object literal for the '<em><b>Hashtable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_DATA_MESSAGE__HASHTABLE = eINSTANCE.getEveDataMessage_Hashtable();

		/**
		 * The meta object literal for the '{@link org.evesim.msg.impl.EveFileMessageSinkImpl <em>Eve File Message Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.impl.EveFileMessageSinkImpl
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveFileMessageSink()
		 * @generated
		 */
		EClass EVE_FILE_MESSAGE_SINK = eINSTANCE.getEveFileMessageSink();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FILE_MESSAGE_SINK__FILENAME = eINSTANCE.getEveFileMessageSink_Filename();

		/**
		 * The meta object literal for the '<em><b>Filetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FILE_MESSAGE_SINK__FILETYPE = eINSTANCE.getEveFileMessageSink_Filetype();

		/**
		 * The meta object literal for the '<em><b>Append</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FILE_MESSAGE_SINK__APPEND = eINSTANCE.getEveFileMessageSink_Append();

		/**
		 * The meta object literal for the '<em><b>Delimeter Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD = eINSTANCE.getEveFileMessageSink_DelimeterField();

		/**
		 * The meta object literal for the '{@link org.evesim.msg.EveFileMessageSinkType <em>Eve File Message Sink Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.evesim.msg.EveFileMessageSinkType
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveFileMessageSinkType()
		 * @generated
		 */
		EEnum EVE_FILE_MESSAGE_SINK_TYPE = eINSTANCE.getEveFileMessageSinkType();

		/**
		 * The meta object literal for the '<em>Eve Message Hashtable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Hashtable
		 * @see org.evesim.msg.impl.MsgPackageImpl#getEveMessageHashtable()
		 * @generated
		 */
		EDataType EVE_MESSAGE_HASHTABLE = eINSTANCE.getEveMessageHashtable();

	}

} //MsgPackage
