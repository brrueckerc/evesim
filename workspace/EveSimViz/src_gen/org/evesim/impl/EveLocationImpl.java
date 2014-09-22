/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.evesim.EveLocation;
import org.evesim.EvesimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveLocationImpl#getLocLongitude <em>Loc Longitude</em>}</li>
 *   <li>{@link org.evesim.impl.EveLocationImpl#getLocLatitude <em>Loc Latitude</em>}</li>
 *   <li>{@link org.evesim.impl.EveLocationImpl#getLocCountry <em>Loc Country</em>}</li>
 *   <li>{@link org.evesim.impl.EveLocationImpl#getLocCity <em>Loc City</em>}</li>
 *   <li>{@link org.evesim.impl.EveLocationImpl#getLocPONr <em>Loc PO Nr</em>}</li>
 *   <li>{@link org.evesim.impl.EveLocationImpl#getLocAddress <em>Loc Address</em>}</li>
 *   <li>{@link org.evesim.impl.EveLocationImpl#getLocLocation <em>Loc Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveLocationImpl extends EObjectImpl implements EveLocation {
	/**
	 * The default value of the '{@link #getLocLongitude() <em>Loc Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LOC_LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLocLongitude() <em>Loc Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocLongitude()
	 * @generated
	 * @ordered
	 */
	protected float locLongitude = LOC_LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocLatitude() <em>Loc Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LOC_LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLocLatitude() <em>Loc Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocLatitude()
	 * @generated
	 * @ordered
	 */
	protected float locLatitude = LOC_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocCountry() <em>Loc Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocCountry() <em>Loc Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocCountry()
	 * @generated
	 * @ordered
	 */
	protected String locCountry = LOC_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocCity() <em>Loc City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocCity()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocCity() <em>Loc City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocCity()
	 * @generated
	 * @ordered
	 */
	protected String locCity = LOC_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocPONr() <em>Loc PO Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPONr()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_PO_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocPONr() <em>Loc PO Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPONr()
	 * @generated
	 * @ordered
	 */
	protected String locPONr = LOC_PO_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocAddress() <em>Loc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocAddress() <em>Loc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocAddress()
	 * @generated
	 * @ordered
	 */
	protected String locAddress = LOC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocLocation() <em>Loc Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocLocation() <em>Loc Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocLocation()
	 * @generated
	 * @ordered
	 */
	protected String locLocation = LOC_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLocLongitude() {
		return locLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocLongitude(float newLocLongitude) {
		float oldLocLongitude = locLongitude;
		locLongitude = newLocLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_LOCATION__LOC_LONGITUDE, oldLocLongitude, locLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLocLatitude() {
		return locLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocLatitude(float newLocLatitude) {
		float oldLocLatitude = locLatitude;
		locLatitude = newLocLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_LOCATION__LOC_LATITUDE, oldLocLatitude, locLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocCountry() {
		return locCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocCountry(String newLocCountry) {
		String oldLocCountry = locCountry;
		locCountry = newLocCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_LOCATION__LOC_COUNTRY, oldLocCountry, locCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocCity() {
		return locCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocCity(String newLocCity) {
		String oldLocCity = locCity;
		locCity = newLocCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_LOCATION__LOC_CITY, oldLocCity, locCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocPONr() {
		return locPONr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocPONr(String newLocPONr) {
		String oldLocPONr = locPONr;
		locPONr = newLocPONr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_LOCATION__LOC_PO_NR, oldLocPONr, locPONr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocAddress() {
		return locAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocAddress(String newLocAddress) {
		String oldLocAddress = locAddress;
		locAddress = newLocAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_LOCATION__LOC_ADDRESS, oldLocAddress, locAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocLocation() {
		return locLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocLocation(String newLocLocation) {
		String oldLocLocation = locLocation;
		locLocation = newLocLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_LOCATION__LOC_LOCATION, oldLocLocation, locLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvesimPackage.EVE_LOCATION__LOC_LONGITUDE:
				return getLocLongitude();
			case EvesimPackage.EVE_LOCATION__LOC_LATITUDE:
				return getLocLatitude();
			case EvesimPackage.EVE_LOCATION__LOC_COUNTRY:
				return getLocCountry();
			case EvesimPackage.EVE_LOCATION__LOC_CITY:
				return getLocCity();
			case EvesimPackage.EVE_LOCATION__LOC_PO_NR:
				return getLocPONr();
			case EvesimPackage.EVE_LOCATION__LOC_ADDRESS:
				return getLocAddress();
			case EvesimPackage.EVE_LOCATION__LOC_LOCATION:
				return getLocLocation();
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
			case EvesimPackage.EVE_LOCATION__LOC_LONGITUDE:
				setLocLongitude((Float)newValue);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_LATITUDE:
				setLocLatitude((Float)newValue);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_COUNTRY:
				setLocCountry((String)newValue);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_CITY:
				setLocCity((String)newValue);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_PO_NR:
				setLocPONr((String)newValue);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_ADDRESS:
				setLocAddress((String)newValue);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_LOCATION:
				setLocLocation((String)newValue);
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
			case EvesimPackage.EVE_LOCATION__LOC_LONGITUDE:
				setLocLongitude(LOC_LONGITUDE_EDEFAULT);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_LATITUDE:
				setLocLatitude(LOC_LATITUDE_EDEFAULT);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_COUNTRY:
				setLocCountry(LOC_COUNTRY_EDEFAULT);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_CITY:
				setLocCity(LOC_CITY_EDEFAULT);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_PO_NR:
				setLocPONr(LOC_PO_NR_EDEFAULT);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_ADDRESS:
				setLocAddress(LOC_ADDRESS_EDEFAULT);
				return;
			case EvesimPackage.EVE_LOCATION__LOC_LOCATION:
				setLocLocation(LOC_LOCATION_EDEFAULT);
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
			case EvesimPackage.EVE_LOCATION__LOC_LONGITUDE:
				return locLongitude != LOC_LONGITUDE_EDEFAULT;
			case EvesimPackage.EVE_LOCATION__LOC_LATITUDE:
				return locLatitude != LOC_LATITUDE_EDEFAULT;
			case EvesimPackage.EVE_LOCATION__LOC_COUNTRY:
				return LOC_COUNTRY_EDEFAULT == null ? locCountry != null : !LOC_COUNTRY_EDEFAULT.equals(locCountry);
			case EvesimPackage.EVE_LOCATION__LOC_CITY:
				return LOC_CITY_EDEFAULT == null ? locCity != null : !LOC_CITY_EDEFAULT.equals(locCity);
			case EvesimPackage.EVE_LOCATION__LOC_PO_NR:
				return LOC_PO_NR_EDEFAULT == null ? locPONr != null : !LOC_PO_NR_EDEFAULT.equals(locPONr);
			case EvesimPackage.EVE_LOCATION__LOC_ADDRESS:
				return LOC_ADDRESS_EDEFAULT == null ? locAddress != null : !LOC_ADDRESS_EDEFAULT.equals(locAddress);
			case EvesimPackage.EVE_LOCATION__LOC_LOCATION:
				return LOC_LOCATION_EDEFAULT == null ? locLocation != null : !LOC_LOCATION_EDEFAULT.equals(locLocation);
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
		result.append(" (locLongitude: ");
		result.append(locLongitude);
		result.append(", locLatitude: ");
		result.append(locLatitude);
		result.append(", locCountry: ");
		result.append(locCountry);
		result.append(", locCity: ");
		result.append(locCity);
		result.append(", locPONr: ");
		result.append(locPONr);
		result.append(", locAddress: ");
		result.append(locAddress);
		result.append(", locLocation: ");
		result.append(locLocation);
		result.append(')');
		return result.toString();
	}

} //EveLocationImpl
