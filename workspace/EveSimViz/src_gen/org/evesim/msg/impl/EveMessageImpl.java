/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.evesim.msg.EveMessage;
import org.evesim.msg.MsgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.msg.impl.EveMessageImpl#getMessageUUID <em>Message UUID</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveMessageImpl#getSessionUUID <em>Session UUID</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveMessageImpl#getSenderUUID <em>Sender UUID</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveMessageImpl#getRecieverUUID <em>Reciever UUID</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveMessageImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveMessageImpl extends EObjectImpl implements EveMessage {
	/**
	 * The default value of the '{@link #getMessageUUID() <em>Message UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageUUID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID MESSAGE_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageUUID() <em>Message UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageUUID()
	 * @generated
	 * @ordered
	 */
	protected UUID messageUUID = MESSAGE_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionUUID() <em>Session UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionUUID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID SESSION_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionUUID() <em>Session UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionUUID()
	 * @generated
	 * @ordered
	 */
	protected UUID sessionUUID = SESSION_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSenderUUID() <em>Sender UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderUUID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID SENDER_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSenderUUID() <em>Sender UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderUUID()
	 * @generated
	 * @ordered
	 */
	protected UUID senderUUID = SENDER_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecieverUUID() <em>Reciever UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecieverUUID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID RECIEVER_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecieverUUID() <em>Reciever UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecieverUUID()
	 * @generated
	 * @ordered
	 */
	protected UUID recieverUUID = RECIEVER_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgPackage.Literals.EVE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getMessageUUID() {
		return messageUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageUUID(UUID newMessageUUID) {
		UUID oldMessageUUID = messageUUID;
		messageUUID = newMessageUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_MESSAGE__MESSAGE_UUID, oldMessageUUID, messageUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getSessionUUID() {
		return sessionUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionUUID(UUID newSessionUUID) {
		UUID oldSessionUUID = sessionUUID;
		sessionUUID = newSessionUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_MESSAGE__SESSION_UUID, oldSessionUUID, sessionUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getSenderUUID() {
		return senderUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderUUID(UUID newSenderUUID) {
		UUID oldSenderUUID = senderUUID;
		senderUUID = newSenderUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_MESSAGE__SENDER_UUID, oldSenderUUID, senderUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getRecieverUUID() {
		return recieverUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecieverUUID(UUID newRecieverUUID) {
		UUID oldRecieverUUID = recieverUUID;
		recieverUUID = newRecieverUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_MESSAGE__RECIEVER_UUID, oldRecieverUUID, recieverUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_MESSAGE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MsgPackage.EVE_MESSAGE__MESSAGE_UUID:
				return getMessageUUID();
			case MsgPackage.EVE_MESSAGE__SESSION_UUID:
				return getSessionUUID();
			case MsgPackage.EVE_MESSAGE__SENDER_UUID:
				return getSenderUUID();
			case MsgPackage.EVE_MESSAGE__RECIEVER_UUID:
				return getRecieverUUID();
			case MsgPackage.EVE_MESSAGE__TIMESTAMP:
				return getTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MsgPackage.EVE_MESSAGE__MESSAGE_UUID:
				setMessageUUID((UUID)newValue);
				return;
			case MsgPackage.EVE_MESSAGE__SESSION_UUID:
				setSessionUUID((UUID)newValue);
				return;
			case MsgPackage.EVE_MESSAGE__SENDER_UUID:
				setSenderUUID((UUID)newValue);
				return;
			case MsgPackage.EVE_MESSAGE__RECIEVER_UUID:
				setRecieverUUID((UUID)newValue);
				return;
			case MsgPackage.EVE_MESSAGE__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MsgPackage.EVE_MESSAGE__MESSAGE_UUID:
				setMessageUUID(MESSAGE_UUID_EDEFAULT);
				return;
			case MsgPackage.EVE_MESSAGE__SESSION_UUID:
				setSessionUUID(SESSION_UUID_EDEFAULT);
				return;
			case MsgPackage.EVE_MESSAGE__SENDER_UUID:
				setSenderUUID(SENDER_UUID_EDEFAULT);
				return;
			case MsgPackage.EVE_MESSAGE__RECIEVER_UUID:
				setRecieverUUID(RECIEVER_UUID_EDEFAULT);
				return;
			case MsgPackage.EVE_MESSAGE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MsgPackage.EVE_MESSAGE__MESSAGE_UUID:
				return MESSAGE_UUID_EDEFAULT == null ? messageUUID != null : !MESSAGE_UUID_EDEFAULT.equals(messageUUID);
			case MsgPackage.EVE_MESSAGE__SESSION_UUID:
				return SESSION_UUID_EDEFAULT == null ? sessionUUID != null : !SESSION_UUID_EDEFAULT.equals(sessionUUID);
			case MsgPackage.EVE_MESSAGE__SENDER_UUID:
				return SENDER_UUID_EDEFAULT == null ? senderUUID != null : !SENDER_UUID_EDEFAULT.equals(senderUUID);
			case MsgPackage.EVE_MESSAGE__RECIEVER_UUID:
				return RECIEVER_UUID_EDEFAULT == null ? recieverUUID != null : !RECIEVER_UUID_EDEFAULT.equals(recieverUUID);
			case MsgPackage.EVE_MESSAGE__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageUUID: ");
		result.append(messageUUID);
		result.append(", sessionUUID: ");
		result.append(sessionUUID);
		result.append(", senderUUID: ");
		result.append(senderUUID);
		result.append(", recieverUUID: ");
		result.append(recieverUUID);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //EveMessageImpl
