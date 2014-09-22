/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveLocation#getLocLongitude <em>Loc Longitude</em>}</li>
 *   <li>{@link org.evesim.EveLocation#getLocLatitude <em>Loc Latitude</em>}</li>
 *   <li>{@link org.evesim.EveLocation#getLocCountry <em>Loc Country</em>}</li>
 *   <li>{@link org.evesim.EveLocation#getLocCity <em>Loc City</em>}</li>
 *   <li>{@link org.evesim.EveLocation#getLocPONr <em>Loc PO Nr</em>}</li>
 *   <li>{@link org.evesim.EveLocation#getLocAddress <em>Loc Address</em>}</li>
 *   <li>{@link org.evesim.EveLocation#getLocLocation <em>Loc Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveLocation()
 * @model
 * @generated
 */
public interface EveLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Loc Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Longitude</em>' attribute.
	 * @see #setLocLongitude(float)
	 * @see org.evesim.EvesimPackage#getEveLocation_LocLongitude()
	 * @model
	 * @generated
	 */
	float getLocLongitude();

	/**
	 * Sets the value of the '{@link org.evesim.EveLocation#getLocLongitude <em>Loc Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Longitude</em>' attribute.
	 * @see #getLocLongitude()
	 * @generated
	 */
	void setLocLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Loc Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Latitude</em>' attribute.
	 * @see #setLocLatitude(float)
	 * @see org.evesim.EvesimPackage#getEveLocation_LocLatitude()
	 * @model
	 * @generated
	 */
	float getLocLatitude();

	/**
	 * Sets the value of the '{@link org.evesim.EveLocation#getLocLatitude <em>Loc Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Latitude</em>' attribute.
	 * @see #getLocLatitude()
	 * @generated
	 */
	void setLocLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Loc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Country</em>' attribute.
	 * @see #setLocCountry(String)
	 * @see org.evesim.EvesimPackage#getEveLocation_LocCountry()
	 * @model
	 * @generated
	 */
	String getLocCountry();

	/**
	 * Sets the value of the '{@link org.evesim.EveLocation#getLocCountry <em>Loc Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Country</em>' attribute.
	 * @see #getLocCountry()
	 * @generated
	 */
	void setLocCountry(String value);

	/**
	 * Returns the value of the '<em><b>Loc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc City</em>' attribute.
	 * @see #setLocCity(String)
	 * @see org.evesim.EvesimPackage#getEveLocation_LocCity()
	 * @model
	 * @generated
	 */
	String getLocCity();

	/**
	 * Sets the value of the '{@link org.evesim.EveLocation#getLocCity <em>Loc City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc City</em>' attribute.
	 * @see #getLocCity()
	 * @generated
	 */
	void setLocCity(String value);

	/**
	 * Returns the value of the '<em><b>Loc PO Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc PO Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc PO Nr</em>' attribute.
	 * @see #setLocPONr(String)
	 * @see org.evesim.EvesimPackage#getEveLocation_LocPONr()
	 * @model
	 * @generated
	 */
	String getLocPONr();

	/**
	 * Sets the value of the '{@link org.evesim.EveLocation#getLocPONr <em>Loc PO Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc PO Nr</em>' attribute.
	 * @see #getLocPONr()
	 * @generated
	 */
	void setLocPONr(String value);

	/**
	 * Returns the value of the '<em><b>Loc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Address</em>' attribute.
	 * @see #setLocAddress(String)
	 * @see org.evesim.EvesimPackage#getEveLocation_LocAddress()
	 * @model
	 * @generated
	 */
	String getLocAddress();

	/**
	 * Sets the value of the '{@link org.evesim.EveLocation#getLocAddress <em>Loc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Address</em>' attribute.
	 * @see #getLocAddress()
	 * @generated
	 */
	void setLocAddress(String value);

	/**
	 * Returns the value of the '<em><b>Loc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Location</em>' attribute.
	 * @see #setLocLocation(String)
	 * @see org.evesim.EvesimPackage#getEveLocation_LocLocation()
	 * @model derived="true"
	 * @generated
	 */
	String getLocLocation();

	/**
	 * Sets the value of the '{@link org.evesim.EveLocation#getLocLocation <em>Loc Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Location</em>' attribute.
	 * @see #getLocLocation()
	 * @generated
	 */
	void setLocLocation(String value);

} // EveLocation
