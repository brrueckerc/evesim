/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.impl;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.evesim.msg.*;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsgFactoryImpl extends EFactoryImpl implements MsgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MsgFactory init() {
		try {
			MsgFactory theMsgFactory = (MsgFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.evesim.org/evesim/msg"); 
			if (theMsgFactory != null) {
				return theMsgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MsgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MsgPackage.EVE_MESSAGE: return createEveMessage();
			case MsgPackage.EVE_LOG_MESSAGE: return createEveLogMessage();
			case MsgPackage.EVE_UPDATE_MESSAGE: return createEveUpdateMessage();
			case MsgPackage.EVE_SERIALIZED_MESSAGE: return createEveSerializedMessage();
			case MsgPackage.EVE_MESSAGE_BUNDLE: return createEveMessageBundle();
			case MsgPackage.EVE_DATA_MESSAGE: return createEveDataMessage();
			case MsgPackage.EVE_FILE_MESSAGE_SINK: return createEveFileMessageSink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MsgPackage.EVE_FILE_MESSAGE_SINK_TYPE:
				return createEveFileMessageSinkTypeFromString(eDataType, initialValue);
			case MsgPackage.EVE_MESSAGE_HASHTABLE:
				return createEveMessageHashtableFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MsgPackage.EVE_FILE_MESSAGE_SINK_TYPE:
				return convertEveFileMessageSinkTypeToString(eDataType, instanceValue);
			case MsgPackage.EVE_MESSAGE_HASHTABLE:
				return convertEveMessageHashtableToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveMessage createEveMessage() {
		EveMessageImpl eveMessage = new EveMessageImpl();
		return eveMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveLogMessage createEveLogMessage() {
		EveLogMessageImpl eveLogMessage = new EveLogMessageImpl();
		return eveLogMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveUpdateMessage createEveUpdateMessage() {
		EveUpdateMessageImpl eveUpdateMessage = new EveUpdateMessageImpl();
		return eveUpdateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveSerializedMessage createEveSerializedMessage() {
		EveSerializedMessageImpl eveSerializedMessage = new EveSerializedMessageImpl();
		return eveSerializedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveMessageBundle createEveMessageBundle() {
		EveMessageBundleImpl eveMessageBundle = new EveMessageBundleImpl();
		return eveMessageBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveDataMessage createEveDataMessage() {
		EveDataMessageImpl eveDataMessage = new EveDataMessageImpl();
		return eveDataMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveFileMessageSink createEveFileMessageSink() {
		EveFileMessageSinkImpl eveFileMessageSink = new EveFileMessageSinkImpl();
		return eveFileMessageSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveFileMessageSinkType createEveFileMessageSinkTypeFromString(EDataType eDataType, String initialValue) {
		EveFileMessageSinkType result = EveFileMessageSinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEveFileMessageSinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Hashtable createEveMessageHashtableFromString(EDataType eDataType, String initialValue) {
		return (Hashtable)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEveMessageHashtableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgPackage getMsgPackage() {
		return (MsgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MsgPackage getPackage() {
		return MsgPackage.eINSTANCE;
	}

} //MsgFactoryImpl
