/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.impl;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.evesim.EvesimPackage;
import org.evesim.impl.EvesimPackageImpl;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.impl.MonitorPackageImpl;
import org.evesim.msg.EveDataMessage;
import org.evesim.msg.EveFileMessageSink;
import org.evesim.msg.EveFileMessageSinkType;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveMessage;
import org.evesim.msg.EveMessageBundle;
import org.evesim.msg.EveSerializedMessage;
import org.evesim.msg.EveUpdateMessage;
import org.evesim.msg.MsgFactory;
import org.evesim.msg.MsgPackage;
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
public class MsgPackageImpl extends EPackageImpl implements MsgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveLogMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveUpdateMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveSerializedMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveMessageBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveDataMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eveFileMessageSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eveFileMessageSinkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eveMessageHashtableEDataType = null;

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
	 * @see org.evesim.msg.MsgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MsgPackageImpl() {
		super(eNS_URI, MsgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MsgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MsgPackage init() {
		if (isInited) return (MsgPackage)EPackage.Registry.INSTANCE.getEPackage(MsgPackage.eNS_URI);

		// Obtain or create and register package
		MsgPackageImpl theMsgPackage = (MsgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MsgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MsgPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EvesimPackageImpl theEvesimPackage = (EvesimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) instanceof EvesimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvesimPackage.eNS_URI) : EvesimPackage.eINSTANCE);
		TimerPackageImpl theTimerPackage = (TimerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) instanceof TimerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimerPackage.eNS_URI) : TimerPackage.eINSTANCE);
		SemanticSearchPackageImpl theSemanticSearchPackage = (SemanticSearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) instanceof SemanticSearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticSearchPackage.eNS_URI) : SemanticSearchPackage.eINSTANCE);
		SocialNetworkAnalysisPackageImpl theSocialNetworkAnalysisPackage = (SocialNetworkAnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) instanceof SocialNetworkAnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SocialNetworkAnalysisPackage.eNS_URI) : SocialNetworkAnalysisPackage.eINSTANCE);
		MonitorPackageImpl theMonitorPackage = (MonitorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) instanceof MonitorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MonitorPackage.eNS_URI) : MonitorPackage.eINSTANCE);

		// Create package meta-data objects
		theMsgPackage.createPackageContents();
		theEvesimPackage.createPackageContents();
		theTimerPackage.createPackageContents();
		theSemanticSearchPackage.createPackageContents();
		theSocialNetworkAnalysisPackage.createPackageContents();
		theMonitorPackage.createPackageContents();

		// Initialize created meta-data
		theMsgPackage.initializePackageContents();
		theEvesimPackage.initializePackageContents();
		theTimerPackage.initializePackageContents();
		theSemanticSearchPackage.initializePackageContents();
		theSocialNetworkAnalysisPackage.initializePackageContents();
		theMonitorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMsgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MsgPackage.eNS_URI, theMsgPackage);
		return theMsgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveMessage() {
		return eveMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveMessage_MessageUUID() {
		return (EAttribute)eveMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveMessage_SessionUUID() {
		return (EAttribute)eveMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveMessage_SenderUUID() {
		return (EAttribute)eveMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveMessage_RecieverUUID() {
		return (EAttribute)eveMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveMessage_Timestamp() {
		return (EAttribute)eveMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveLogMessage() {
		return eveLogMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLogMessage_Message() {
		return (EAttribute)eveLogMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveLogMessage_Detail() {
		return (EAttribute)eveLogMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveUpdateMessage() {
		return eveUpdateMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveUpdateMessage_AttributeName() {
		return (EAttribute)eveUpdateMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveUpdateMessage_OldValue() {
		return (EAttribute)eveUpdateMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveUpdateMessage_NewValue() {
		return (EAttribute)eveUpdateMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveUpdateMessage_FeatureID() {
		return (EAttribute)eveUpdateMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveSerializedMessage() {
		return eveSerializedMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveSerializedMessage_Payload() {
		return (EAttribute)eveSerializedMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveMessageBundle() {
		return eveMessageBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEveMessageBundle_Messages() {
		return (EReference)eveMessageBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveDataMessage() {
		return eveDataMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveDataMessage_Hashtable() {
		return (EAttribute)eveDataMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEveFileMessageSink() {
		return eveFileMessageSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFileMessageSink_Filename() {
		return (EAttribute)eveFileMessageSinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFileMessageSink_Filetype() {
		return (EAttribute)eveFileMessageSinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFileMessageSink_Append() {
		return (EAttribute)eveFileMessageSinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEveFileMessageSink_DelimeterField() {
		return (EAttribute)eveFileMessageSinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEveFileMessageSinkType() {
		return eveFileMessageSinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEveMessageHashtable() {
		return eveMessageHashtableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgFactory getMsgFactory() {
		return (MsgFactory)getEFactoryInstance();
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
		eveMessageEClass = createEClass(EVE_MESSAGE);
		createEAttribute(eveMessageEClass, EVE_MESSAGE__MESSAGE_UUID);
		createEAttribute(eveMessageEClass, EVE_MESSAGE__SESSION_UUID);
		createEAttribute(eveMessageEClass, EVE_MESSAGE__SENDER_UUID);
		createEAttribute(eveMessageEClass, EVE_MESSAGE__RECIEVER_UUID);
		createEAttribute(eveMessageEClass, EVE_MESSAGE__TIMESTAMP);

		eveLogMessageEClass = createEClass(EVE_LOG_MESSAGE);
		createEAttribute(eveLogMessageEClass, EVE_LOG_MESSAGE__MESSAGE);
		createEAttribute(eveLogMessageEClass, EVE_LOG_MESSAGE__DETAIL);

		eveUpdateMessageEClass = createEClass(EVE_UPDATE_MESSAGE);
		createEAttribute(eveUpdateMessageEClass, EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME);
		createEAttribute(eveUpdateMessageEClass, EVE_UPDATE_MESSAGE__OLD_VALUE);
		createEAttribute(eveUpdateMessageEClass, EVE_UPDATE_MESSAGE__NEW_VALUE);
		createEAttribute(eveUpdateMessageEClass, EVE_UPDATE_MESSAGE__FEATURE_ID);

		eveSerializedMessageEClass = createEClass(EVE_SERIALIZED_MESSAGE);
		createEAttribute(eveSerializedMessageEClass, EVE_SERIALIZED_MESSAGE__PAYLOAD);

		eveMessageBundleEClass = createEClass(EVE_MESSAGE_BUNDLE);
		createEReference(eveMessageBundleEClass, EVE_MESSAGE_BUNDLE__MESSAGES);

		eveDataMessageEClass = createEClass(EVE_DATA_MESSAGE);
		createEAttribute(eveDataMessageEClass, EVE_DATA_MESSAGE__HASHTABLE);

		eveFileMessageSinkEClass = createEClass(EVE_FILE_MESSAGE_SINK);
		createEAttribute(eveFileMessageSinkEClass, EVE_FILE_MESSAGE_SINK__FILENAME);
		createEAttribute(eveFileMessageSinkEClass, EVE_FILE_MESSAGE_SINK__FILETYPE);
		createEAttribute(eveFileMessageSinkEClass, EVE_FILE_MESSAGE_SINK__APPEND);
		createEAttribute(eveFileMessageSinkEClass, EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD);

		// Create enums
		eveFileMessageSinkTypeEEnum = createEEnum(EVE_FILE_MESSAGE_SINK_TYPE);

		// Create data types
		eveMessageHashtableEDataType = createEDataType(EVE_MESSAGE_HASHTABLE);
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
		eveLogMessageEClass.getESuperTypes().add(this.getEveMessage());
		eveUpdateMessageEClass.getESuperTypes().add(this.getEveMessage());
		eveSerializedMessageEClass.getESuperTypes().add(this.getEveMessage());
		eveMessageBundleEClass.getESuperTypes().add(this.getEveMessage());
		eveDataMessageEClass.getESuperTypes().add(this.getEveMessage());
		eveFileMessageSinkEClass.getESuperTypes().add(theEvesimPackage.getEveComponent());
		eveFileMessageSinkEClass.getESuperTypes().add(theEvesimPackage.getEveMessageSink());

		// Initialize classes and features; add operations and parameters
		initEClass(eveMessageEClass, EveMessage.class, "EveMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveMessage_MessageUUID(), theEvesimPackage.getUUID(), "messageUUID", null, 0, 1, EveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveMessage_SessionUUID(), theEvesimPackage.getUUID(), "sessionUUID", null, 0, 1, EveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveMessage_SenderUUID(), theEvesimPackage.getUUID(), "senderUUID", null, 0, 1, EveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveMessage_RecieverUUID(), theEvesimPackage.getUUID(), "recieverUUID", null, 0, 1, EveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveMessage_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, EveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveLogMessageEClass, EveLogMessage.class, "EveLogMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveLogMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, EveLogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveLogMessage_Detail(), ecorePackage.getEString(), "detail", null, 0, 1, EveLogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveUpdateMessageEClass, EveUpdateMessage.class, "EveUpdateMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveUpdateMessage_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, EveUpdateMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveUpdateMessage_OldValue(), ecorePackage.getEJavaObject(), "oldValue", null, 0, 1, EveUpdateMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveUpdateMessage_NewValue(), ecorePackage.getEJavaObject(), "newValue", null, 0, 1, EveUpdateMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveUpdateMessage_FeatureID(), ecorePackage.getEInt(), "featureID", null, 0, 1, EveUpdateMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveSerializedMessageEClass, EveSerializedMessage.class, "EveSerializedMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveSerializedMessage_Payload(), ecorePackage.getEString(), "payload", null, 0, 1, EveSerializedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveMessageBundleEClass, EveMessageBundle.class, "EveMessageBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEveMessageBundle_Messages(), this.getEveMessage(), null, "messages", null, 0, -1, EveMessageBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEveMessageBundle_Messages().getEKeys().add(this.getEveMessage_MessageUUID());

		initEClass(eveDataMessageEClass, EveDataMessage.class, "EveDataMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveDataMessage_Hashtable(), this.getEveMessageHashtable(), "hashtable", null, 0, 1, EveDataMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eveFileMessageSinkEClass, EveFileMessageSink.class, "EveFileMessageSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEveFileMessageSink_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, EveFileMessageSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFileMessageSink_Filetype(), this.getEveFileMessageSinkType(), "filetype", null, 0, 1, EveFileMessageSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFileMessageSink_Append(), ecorePackage.getEBoolean(), "append", "false", 0, 1, EveFileMessageSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEveFileMessageSink_DelimeterField(), ecorePackage.getEString(), "delimeterField", ";", 0, 1, EveFileMessageSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eveFileMessageSinkTypeEEnum, EveFileMessageSinkType.class, "EveFileMessageSinkType");
		addEEnumLiteral(eveFileMessageSinkTypeEEnum, EveFileMessageSinkType.TEXT);

		// Initialize data types
		initEDataType(eveMessageHashtableEDataType, Hashtable.class, "EveMessageHashtable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Hashtable<java.lang.String, java.io.Serializable>");
	}

} //MsgPackageImpl
