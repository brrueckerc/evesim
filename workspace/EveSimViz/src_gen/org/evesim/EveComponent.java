/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import java.io.Serializable;
import java.net.URI;
import java.util.UUID;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveComponent#getAttachedConnections <em>Attached Connections</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getUri <em>Uri</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getParent <em>Parent</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getDescription <em>Description</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getChildren <em>Children</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocLongitude <em>Loc Longitude</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocLatitude <em>Loc Latitude</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocCountry <em>Loc Country</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocCity <em>Loc City</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocPONr <em>Loc PO Nr</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocAddress <em>Loc Address</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocLocation <em>Loc Location</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getNetIP <em>Net IP</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getNetUrl <em>Net Url</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.evesim.EveComponent#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveComponent()
 * @model superTypes="org.evesim.Serializable org.evesim.IAdaptable org.evesim.IKmlProvider"
 * @generated
 */
public interface EveComponent extends Serializable, IAdaptable, IKmlProvider {
	
	public final static Logger logger = Logger.getLogger(EveComponent.class.getName());
	
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(UUID)
	 * @see org.evesim.EvesimPackage#getEveComponent_Uuid()
	 * @model default="default" id="true" dataType="org.evesim.UUID"
	 * @generated
	 */
	UUID getUuid();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(UUID value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.evesim.EveComponent}.
	 * It is bidirectional and its opposite is '{@link org.evesim.EveComponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.evesim.EvesimPackage#getEveComponent_Children()
	 * @see org.evesim.EveComponent#getParent
	 * @model opposite="parent" containment="true" keys="uuid" ordered="false"
	 * @generated
	 */
	EList<EveComponent> getChildren();

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
	 * @see org.evesim.EvesimPackage#getEveComponent_LocLongitude()
	 * @model
	 * @generated
	 */
	float getLocLongitude();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocLongitude <em>Loc Longitude</em>}' attribute.
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
	 * @see org.evesim.EvesimPackage#getEveComponent_LocLatitude()
	 * @model
	 * @generated
	 */
	float getLocLatitude();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocLatitude <em>Loc Latitude</em>}' attribute.
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
	 * @see org.evesim.EvesimPackage#getEveComponent_LocCountry()
	 * @model
	 * @generated
	 */
	String getLocCountry();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocCountry <em>Loc Country</em>}' attribute.
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
	 * @see org.evesim.EvesimPackage#getEveComponent_LocCity()
	 * @model
	 * @generated
	 */
	String getLocCity();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocCity <em>Loc City</em>}' attribute.
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
	 * @see org.evesim.EvesimPackage#getEveComponent_LocPONr()
	 * @model
	 * @generated
	 */
	String getLocPONr();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocPONr <em>Loc PO Nr</em>}' attribute.
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
	 * @see org.evesim.EvesimPackage#getEveComponent_LocAddress()
	 * @model
	 * @generated
	 */
	String getLocAddress();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocAddress <em>Loc Address</em>}' attribute.
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
	 * @see org.evesim.EvesimPackage#getEveComponent_LocLocation()
	 * @model derived="true"
	 * @generated
	 */
	String getLocLocation();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocLocation <em>Loc Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Location</em>' attribute.
	 * @see #getLocLocation()
	 * @generated
	 */
	void setLocLocation(String value);

	/**
	 * Returns the value of the '<em><b>Net IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net IP</em>' attribute.
	 * @see #setNetIP(String)
	 * @see org.evesim.EvesimPackage#getEveComponent_NetIP()
	 * @model
	 * @generated
	 */
	String getNetIP();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getNetIP <em>Net IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net IP</em>' attribute.
	 * @see #getNetIP()
	 * @generated
	 */
	void setNetIP(String value);

	/**
	 * Returns the value of the '<em><b>Net Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Url</em>' attribute.
	 * @see #setNetUrl(String)
	 * @see org.evesim.EvesimPackage#getEveComponent_NetUrl()
	 * @model
	 * @generated
	 */
	String getNetUrl();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getNetUrl <em>Net Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Url</em>' attribute.
	 * @see #getNetUrl()
	 * @generated
	 */
	void setNetUrl(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(EveLocation)
	 * @see org.evesim.EvesimPackage#getEveComponent_Location()
	 * @model containment="true"
	 * @generated
	 */
	EveLocation getLocation();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(EveLocation value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(long)
	 * @see org.evesim.EvesimPackage#getEveComponent_TimeStamp()
	 * @model default="0"
	 * @generated
	 */
	long getTimeStamp();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(long value);

	/**
	 * Returns the value of the '<em><b>Attached Connections</b></em>' reference list.
	 * The list contents are of type {@link org.evesim.EveConnection}.
	 * It is bidirectional and its opposite is '{@link org.evesim.EveConnection#getConnectedComponent <em>Connected Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Connections</em>' reference list.
	 * @see org.evesim.EvesimPackage#getEveComponent_AttachedConnections()
	 * @see org.evesim.EveConnection#getConnectedComponent
	 * @model opposite="connectedComponent"
	 * @generated
	 */
	EList<EveConnection> getAttachedConnections();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.evesim.EvesimPackage#getEveComponent_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.evesim.EvesimPackage#getEveComponent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(URI)
	 * @see org.evesim.EvesimPackage#getEveComponent_Uri()
	 * @model dataType="org.evesim.URI"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URI value);

	/**
	 * Returns the value of the '<em><b>Session ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session ID</em>' attribute.
	 * @see #setSessionID(UUID)
	 * @see org.evesim.EvesimPackage#getEveComponent_SessionID()
	 * @model default="" dataType="org.evesim.SessionID"
	 * @generated
	 */
	UUID getSessionID();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getSessionID <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session ID</em>' attribute.
	 * @see #getSessionID()
	 * @generated
	 */
	void setSessionID(UUID value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.evesim.EveComponent#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(EveComponent)
	 * @see org.evesim.EvesimPackage#getEveComponent_Parent()
	 * @see org.evesim.EveComponent#getChildren
	 * @model opposite="children" keys="uuid" transient="false"
	 * @generated
	 */
	EveComponent getParent();

	/**
	 * Sets the value of the '{@link org.evesim.EveComponent#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EveComponent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addChild(EveComponent child);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeChild(EveComponent child);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uuidDataType="org.evesim.UUID"
	 * @generated
	 */
	void removeChild(UUID uuid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uuidDataType="org.evesim.UUID"
	 * @generated
	 */
	EveComponent lookupComponent(UUID uuid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isLocationValid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="org.evesim.Class"
	 * @generated
	 */
	boolean instanceOf(Class c, String className);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean instanceOf(String className);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EveComponent getRootComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EveConnection> getConnections();

} // EveComponent
