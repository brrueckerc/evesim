/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.impl;

import java.io.Serializable;
import java.util.Hashtable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.msg.EveDataMessage;
import org.evesim.msg.MsgPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eve Data Message</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.msg.impl.EveDataMessageImpl#getHashtable <em>Hashtable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveDataMessageImpl extends EveMessageImpl implements EveDataMessage {
	/**
	 * The cached value of the '{@link #getHashtable() <em>Hashtable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHashtable()
	 * @generated
	 * @ordered
	 */
	protected Hashtable<String, Serializable> hashtable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EveDataMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgPackage.Literals.EVE_DATA_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Hashtable<String, Serializable> getHashtable() {
		if (hashtable == null)
			hashtable = new Hashtable<String, Serializable>();
		return hashtable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashtable(Hashtable<String, Serializable> newHashtable) {
		Hashtable<String, Serializable> oldHashtable = hashtable;
		hashtable = newHashtable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_DATA_MESSAGE__HASHTABLE, oldHashtable, hashtable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MsgPackage.EVE_DATA_MESSAGE__HASHTABLE:
				return getHashtable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MsgPackage.EVE_DATA_MESSAGE__HASHTABLE:
				setHashtable((Hashtable<String, Serializable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MsgPackage.EVE_DATA_MESSAGE__HASHTABLE:
				setHashtable((Hashtable<String, Serializable>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MsgPackage.EVE_DATA_MESSAGE__HASHTABLE:
				return hashtable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hashtable: ");
		result.append(hashtable);
		result.append(')');
		return result.toString();
	}

} // EveDataMessageImpl
