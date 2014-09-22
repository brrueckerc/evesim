/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.msg.EveUpdateMessage;
import org.evesim.msg.MsgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Update Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.msg.impl.EveUpdateMessageImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveUpdateMessageImpl#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveUpdateMessageImpl#getNewValue <em>New Value</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveUpdateMessageImpl#getFeatureID <em>Feature ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveUpdateMessageImpl extends EveMessageImpl implements EveUpdateMessage {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getOldValue() <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object OLD_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOldValue() <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected Object oldValue = OLD_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object NEW_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected Object newValue = NEW_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureID() <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureID()
	 * @generated
	 * @ordered
	 */
	protected static final int FEATURE_ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getFeatureID() <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureID()
	 * @generated
	 * @ordered
	 */
	protected int featureID = FEATURE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveUpdateMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgPackage.Literals.EVE_UPDATE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOldValue() {
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldValue(Object newOldValue) {
		Object oldOldValue = oldValue;
		oldValue = newOldValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_UPDATE_MESSAGE__OLD_VALUE, oldOldValue, oldValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValue(Object newNewValue) {
		Object oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_UPDATE_MESSAGE__NEW_VALUE, oldNewValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureID() {
		return featureID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureID(int newFeatureID) {
		int oldFeatureID = featureID;
		featureID = newFeatureID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_UPDATE_MESSAGE__FEATURE_ID, oldFeatureID, featureID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MsgPackage.EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME:
				return getAttributeName();
			case MsgPackage.EVE_UPDATE_MESSAGE__OLD_VALUE:
				return getOldValue();
			case MsgPackage.EVE_UPDATE_MESSAGE__NEW_VALUE:
				return getNewValue();
			case MsgPackage.EVE_UPDATE_MESSAGE__FEATURE_ID:
				return getFeatureID();
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
			case MsgPackage.EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case MsgPackage.EVE_UPDATE_MESSAGE__OLD_VALUE:
				setOldValue(newValue);
				return;
			case MsgPackage.EVE_UPDATE_MESSAGE__NEW_VALUE:
				setNewValue(newValue);
				return;
			case MsgPackage.EVE_UPDATE_MESSAGE__FEATURE_ID:
				setFeatureID((Integer)newValue);
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
			case MsgPackage.EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case MsgPackage.EVE_UPDATE_MESSAGE__OLD_VALUE:
				setOldValue(OLD_VALUE_EDEFAULT);
				return;
			case MsgPackage.EVE_UPDATE_MESSAGE__NEW_VALUE:
				setNewValue(NEW_VALUE_EDEFAULT);
				return;
			case MsgPackage.EVE_UPDATE_MESSAGE__FEATURE_ID:
				setFeatureID(FEATURE_ID_EDEFAULT);
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
			case MsgPackage.EVE_UPDATE_MESSAGE__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case MsgPackage.EVE_UPDATE_MESSAGE__OLD_VALUE:
				return OLD_VALUE_EDEFAULT == null ? oldValue != null : !OLD_VALUE_EDEFAULT.equals(oldValue);
			case MsgPackage.EVE_UPDATE_MESSAGE__NEW_VALUE:
				return NEW_VALUE_EDEFAULT == null ? newValue != null : !NEW_VALUE_EDEFAULT.equals(newValue);
			case MsgPackage.EVE_UPDATE_MESSAGE__FEATURE_ID:
				return this.featureID != FEATURE_ID_EDEFAULT;
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
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", oldValue: ");
		result.append(oldValue);
		result.append(", newValue: ");
		result.append(newValue);
		result.append(", featureID: ");
		result.append(featureID);
		result.append(')');
		return result.toString();
	}

} //EveUpdateMessageImpl
