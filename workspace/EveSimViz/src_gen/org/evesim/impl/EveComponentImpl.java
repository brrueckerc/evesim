/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ui.views.properties.IPropertySource;
import org.evesim.EveComponent;
import org.evesim.EveComponentRegistry;
import org.evesim.EveConnection;
import org.evesim.EveLocation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.earth.GEarthUtil;
import org.evesim.gui.properties.EveComponentPropertySource;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eve Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getAttachedConnections <em>Attached Connections</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocLongitude <em>Loc Longitude</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocLatitude <em>Loc Latitude</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocCountry <em>Loc Country</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocCity <em>Loc City</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocPONr <em>Loc PO Nr</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocAddress <em>Loc Address</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocLocation <em>Loc Location</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getNetIP <em>Net IP</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getNetUrl <em>Net Url</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.evesim.impl.EveComponentImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveComponentImpl extends EObjectImpl implements EveComponent {

	public static String PROP_UUID = "uuid";
	public static String PROP_URI = "uri";
	public static String PROP_CHILDREN = "children";
	public static String PROP_NAME = "name";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_LOCATION = "location";
	public static String PROP_PARENT = "parent";

	private EveComponentPropertySource compPS;
	/**
	 * 
	 */
	private static final long serialVersionUID = 2987389919983710097L;

	/**
	 * The cached value of the '{@link #getAttachedConnections() <em>Attached Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<EveConnection> attachedConnections;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final UUID UUID_EDEFAULT = (UUID)EvesimFactory.eINSTANCE.createFromString(EvesimPackage.eINSTANCE.getUUID(), "default");

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected UUID uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final URI URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected URI uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionID() <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSessionID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID SESSION_ID_EDEFAULT = (UUID)EvesimFactory.eINSTANCE.createFromString(EvesimPackage.eINSTANCE.getSessionID(), "");

	/**
	 * The cached value of the '{@link #getSessionID() <em>Session ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSessionID()
	 * @generated NOT
	 * @ordered
	 */
	protected UUID sessionID = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<EveComponent> children;

	/**
	 * The default value of the '{@link #getLocLongitude() <em>Loc Longitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLocLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LOC_LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLocLongitude() <em>Loc Longitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLocLongitude()
	 * @generated
	 * @ordered
	 */
	protected float locLongitude = LOC_LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocLatitude() <em>Loc Latitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LOC_LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLocLatitude() <em>Loc Latitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocLatitude()
	 * @generated
	 * @ordered
	 */
	protected float locLatitude = LOC_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocCountry() <em>Loc Country</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocCountry() <em>Loc Country</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocCountry()
	 * @generated
	 * @ordered
	 */
	protected String locCountry = LOC_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocCity() <em>Loc City</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocCity()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocCity() <em>Loc City</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocCity()
	 * @generated
	 * @ordered
	 */
	protected String locCity = LOC_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocPONr() <em>Loc PO Nr</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocPONr()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_PO_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocPONr() <em>Loc PO Nr</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocPONr()
	 * @generated
	 * @ordered
	 */
	protected String locPONr = LOC_PO_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocAddress() <em>Loc Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocAddress() <em>Loc Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocAddress()
	 * @generated
	 * @ordered
	 */
	protected String locAddress = LOC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocLocation() <em>Loc Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocLocation() <em>Loc Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocLocation()
	 * @generated
	 * @ordered
	 */
	protected String locLocation = LOC_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetIP() <em>Net IP</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNetIP()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetIP() <em>Net IP</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNetIP()
	 * @generated
	 * @ordered
	 */
	protected String netIP = NET_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetUrl() <em>Net Url</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNetUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetUrl() <em>Net Url</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNetUrl()
	 * @generated
	 * @ordered
	 */
	protected String netUrl = NET_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EveLocation location;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_STAMP_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected long timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected EveComponentImpl() {
		super();
		uuid = UUID.randomUUID();

		// TODO: resolve Problem
		// this.eAdapters().add(EveComponentRegistry.getDefaultInstance());
		// EveComponentRegistry.registerAdapter(this);
		// EveComponentRegistry.getDefaultInstance().add(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setUuid(UUID newUuid) {
		UUID oldUuid = uuid;
		uuid = newUuid;

		// TODO: resolve Problem
		// EveComponentRegistry.getInstance().remove(oldUuid);
		// EveComponentRegistry.getInstance().add(this);

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EveComponent> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<EveComponent>(EveComponent.class, this, EvesimPackage.EVE_COMPONENT__CHILDREN, EvesimPackage.EVE_COMPONENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public float getLocLongitude() {
		return locLongitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocLongitude(float newLocLongitude) {
		float oldLocLongitude = locLongitude;
		locLongitude = newLocLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE, oldLocLongitude, locLongitude));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public float getLocLatitude() {
		return locLatitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocLatitude(float newLocLatitude) {
		float oldLocLatitude = locLatitude;
		locLatitude = newLocLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOC_LATITUDE, oldLocLatitude, locLatitude));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocCountry() {
		return locCountry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocCountry(String newLocCountry) {
		String oldLocCountry = locCountry;
		locCountry = newLocCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOC_COUNTRY, oldLocCountry, locCountry));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocCity() {
		return locCity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocCity(String newLocCity) {
		String oldLocCity = locCity;
		locCity = newLocCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOC_CITY, oldLocCity, locCity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocPONr() {
		return locPONr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocPONr(String newLocPONr) {
		String oldLocPONr = locPONr;
		locPONr = newLocPONr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOC_PO_NR, oldLocPONr, locPONr));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocAddress() {
		return locAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocAddress(String newLocAddress) {
		String oldLocAddress = locAddress;
		locAddress = newLocAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOC_ADDRESS, oldLocAddress, locAddress));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocLocation() {
		return locLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocLocation(String newLocLocation) {
		String oldLocLocation = locLocation;
		locLocation = newLocLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOC_LOCATION, oldLocLocation, locLocation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetIP() {
		return netIP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetIP(String newNetIP) {
		String oldNetIP = netIP;
		netIP = newNetIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__NET_IP, oldNetIP, netIP));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetUrl() {
		return netUrl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetUrl(String newNetUrl) {
		String oldNetUrl = netUrl;
		netUrl = newNetUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__NET_URL, oldNetUrl, netUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(EveLocation newLocation, NotificationChain msgs) {
		EveLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(EveLocation newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvesimPackage.EVE_COMPONENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvesimPackage.EVE_COMPONENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(long newTimeStamp) {
		long oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EveConnection> getAttachedConnections() {
		if (attachedConnections == null) {
			attachedConnections = new EObjectWithInverseResolvingEList<EveConnection>(EveConnection.class, this, EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS, EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT);
		}
		return attachedConnections;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getName() {

		if (this.name == null)
			setName("");

		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URI getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(URI newUri) {
		URI oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public UUID getSessionID() {
		if (getParent() != null) {
			return getParent().getSessionID();
		}

		if (sessionID == null) {
			setSessionID(UUID.randomUUID());
			// throw new RuntimeException("Unknown Session");
		}
		return sessionID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionID(UUID newSessionID) {
		UUID oldSessionID = sessionID;
		sessionID = newSessionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__SESSION_ID, oldSessionID, sessionID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EveComponent getParent() {
		if (eContainerFeatureID() != EvesimPackage.EVE_COMPONENT__PARENT) return null;
		return (EveComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(EveComponent newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, EvesimPackage.EVE_COMPONENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(EveComponent newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EvesimPackage.EVE_COMPONENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EvesimPackage.EVE_COMPONENT__CHILDREN, EveComponent.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_COMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addChild(EveComponent child) {
		getChildren().add(child);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void removeChild(EveComponent child) {
		this.getChildren().remove(child);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void removeChild(UUID uuid) {
		EveComponent cmp = getChildByUUID(uuid);
		if (cmp != null) {
			this.removeChild(cmp);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EveComponent lookupComponent(UUID uuid) {
		return EveComponentRegistry.getInstance().lookupNode(this, uuid);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EveComponent getChildByUUID(UUID uuid) {
		Iterator<EveComponent> iter = this.getChildren().iterator();

		while (iter.hasNext()) {
			EveComponent eveComponent = (EveComponent) iter.next();
			if (eveComponent.getUuid().equals(uuid)) {
				return eveComponent;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isLocationValid() {
		
		if (Math.abs(this.getLocLatitude()) > 0.000001f && Math.abs(this.getLocLongitude()) > 0.000001f)
			return true;
		return false;
		

	}

	/**
	 * <!-- begin-user-doc --> instanceOf Implementation for use in velocity
	 * templates <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean instanceOf(Class c, String className) {
		if (c.getName().equals(className))
			return true;
		Class[] ifcs = c.getInterfaces();
		for (int i = 0; i < ifcs.length; i++)
			if (instanceOf(ifcs[i], className))
				return true;
		c = c.getSuperclass();
		if (c != null)
			return instanceOf(c, className);
		return false;

	}

	/**
	 * 
	 * <!-- begin-user-doc --> instanceOf Implementation for use in velocity
	 * templates <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean instanceOf(String className) {
		return instanceOf(this.getClass(), className);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void reset() {
		Iterator<EveComponent> iter = getChildren().iterator();
		while (iter.hasNext()) {
			EveComponent eveComponent = (EveComponent) iter.next();
			eveComponent.reset();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EveComponent getRootComponent() {
		if (this.getParent() != null) {
			return this.getParent().getRootComponent();
		} else {
			return this;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EveConnection> getConnections() {
		BasicEList<EveConnection> connections = new BasicEList<EveConnection>();

		// Get the connections from the children list and add them to the result
		// list if the connected flag is true
		for (EveComponent eveComponent : getChildren()) {
			if ((eveComponent instanceof EveConnection) && (((EveConnection) eveComponent).isValid())) {
				connections.add((EveConnection) eveComponent);
			}
		}

		// Now also add all undirected links from the attachedConnections
		// array
		for (EveConnection eveConnection : getAttachedConnections()) {
			if (eveConnection.isValid() && !eveConnection.isDirectional()) {
				connections.add(eveConnection);
			}
		}

		return connections;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	/*
	 * public String getKML() { // Kml kml = KmlFactory.createKml(); //
	 * Placemark p = new Placemark();
	 * 
	 * if (getLocLatitude() == 0.0F && getLocLongitude() == 0.0F) return "";
	 * 
	 * StringBuffer buf = new StringBuffer();
	 * 
	 * buf =
	 * buf.append("<Placemark id=\"").append(getUuid().toString()).append("\">"
	 * ); buf = buf.append("<name>").append(getName()).append("</name>"); buf =
	 * buf.append("<description><![CDATA[").append(getDescription()).append(
	 * "]]></description>"); buf = buf.append("<Point>"); buf =
	 * buf.append("<coordinates>"
	 * ).append(getLocLongitude()).append(",").append(getLocLatitude
	 * ()).append(",0</coordinates>"); buf = buf.append("</Point>"); buf =
	 * buf.append("</Placemark>");
	 * 
	 * return buf.toString(); }
	 */

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Document kmlGetVisualisation(Document kmlContainer) {
		StringBuffer description = new StringBuffer();
		description = description.append("<table width='400px'>");
		if (getDescription() != null)
			description = description.append("<tr><td colspan='5'>").append(getDescription()).append("</td></tr>");
		// description = description.append("<tr><td colspan='4'>Type: " +
		// this.getClass().getSimpleName() + "</td></tr>");
		
		EList<EveConnection> connections = getConnections();
		if (!connections.isEmpty()) {
			description = description.append("<tr><td colspan='5'>Connections</td></tr>");
			description = description.append("<tr><td>Name</td><td>To</td><td>Strength</td><td>Type</td><td>&nbsp;</td></tr>");
			for (EveConnection connection : connections) {
				description = description.append("<tr>");
				description = description.append("<td>").append(connection.getName()).append("</td>");
				description = description.append("<td>").append(connection.getOpposite(this).getName()).append("</td>");
				description = description.append("<td>").append(connection.getStrength()).append("</td>");
				description = description.append("<td>").append((connection.getType()!= null ? connection.getType():"")).append("</td>");
				description = description.append("<td>").append((connection.isDirectional()?"directed":"undirected")).append("</td>");
				description = description.append("</tr>");
			}
		} else {
			description = description.append("<tr><td colspan='5'>No connections.</td></tr>");
		}

		description = description.append("</table>");

		if (isLocationValid()) {
			Placemark p = kmlContainer.createAndAddPlacemark().withStyleUrl(kmlGetStyle()).withId(getUuid().toString()).withName(getName()).withDescription(
					description.toString());
			p.createAndSetPoint().addToCoordinates(getLocLongitude(), getLocLatitude());
		}
		return kmlContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String kmlGetStyle() {
		return GEarthUtil.getKMLStyleBase(GEarthUtil.KML_STYLE_EVECOMPONENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttachedConnections()).basicAdd(otherEnd, msgs);
			case EvesimPackage.EVE_COMPONENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((EveComponent)otherEnd, msgs);
			case EvesimPackage.EVE_COMPONENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS:
				return ((InternalEList<?>)getAttachedConnections()).basicRemove(otherEnd, msgs);
			case EvesimPackage.EVE_COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case EvesimPackage.EVE_COMPONENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case EvesimPackage.EVE_COMPONENT__LOCATION:
				return basicSetLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EvesimPackage.EVE_COMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, EvesimPackage.EVE_COMPONENT__CHILDREN, EveComponent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS:
				return getAttachedConnections();
			case EvesimPackage.EVE_COMPONENT__UUID:
				return getUuid();
			case EvesimPackage.EVE_COMPONENT__URI:
				return getUri();
			case EvesimPackage.EVE_COMPONENT__PARENT:
				return getParent();
			case EvesimPackage.EVE_COMPONENT__SESSION_ID:
				return getSessionID();
			case EvesimPackage.EVE_COMPONENT__NAME:
				return getName();
			case EvesimPackage.EVE_COMPONENT__DESCRIPTION:
				return getDescription();
			case EvesimPackage.EVE_COMPONENT__CHILDREN:
				return getChildren();
			case EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE:
				return getLocLongitude();
			case EvesimPackage.EVE_COMPONENT__LOC_LATITUDE:
				return getLocLatitude();
			case EvesimPackage.EVE_COMPONENT__LOC_COUNTRY:
				return getLocCountry();
			case EvesimPackage.EVE_COMPONENT__LOC_CITY:
				return getLocCity();
			case EvesimPackage.EVE_COMPONENT__LOC_PO_NR:
				return getLocPONr();
			case EvesimPackage.EVE_COMPONENT__LOC_ADDRESS:
				return getLocAddress();
			case EvesimPackage.EVE_COMPONENT__LOC_LOCATION:
				return getLocLocation();
			case EvesimPackage.EVE_COMPONENT__NET_IP:
				return getNetIP();
			case EvesimPackage.EVE_COMPONENT__NET_URL:
				return getNetUrl();
			case EvesimPackage.EVE_COMPONENT__LOCATION:
				return getLocation();
			case EvesimPackage.EVE_COMPONENT__TIME_STAMP:
				return getTimeStamp();
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
			case EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS:
				getAttachedConnections().clear();
				getAttachedConnections().addAll((Collection<? extends EveConnection>)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__UUID:
				setUuid((UUID)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__URI:
				setUri((URI)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__PARENT:
				setParent((EveComponent)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__SESSION_ID:
				setSessionID((UUID)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends EveComponent>)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE:
				setLocLongitude((Float)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_LATITUDE:
				setLocLatitude((Float)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_COUNTRY:
				setLocCountry((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_CITY:
				setLocCity((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_PO_NR:
				setLocPONr((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_ADDRESS:
				setLocAddress((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_LOCATION:
				setLocLocation((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__NET_IP:
				setNetIP((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__NET_URL:
				setNetUrl((String)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__LOCATION:
				setLocation((EveLocation)newValue);
				return;
			case EvesimPackage.EVE_COMPONENT__TIME_STAMP:
				setTimeStamp((Long)newValue);
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
			case EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS:
				getAttachedConnections().clear();
				return;
			case EvesimPackage.EVE_COMPONENT__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__URI:
				setUri(URI_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__PARENT:
				setParent((EveComponent)null);
				return;
			case EvesimPackage.EVE_COMPONENT__SESSION_ID:
				setSessionID(SESSION_ID_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__CHILDREN:
				getChildren().clear();
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE:
				setLocLongitude(LOC_LONGITUDE_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_LATITUDE:
				setLocLatitude(LOC_LATITUDE_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_COUNTRY:
				setLocCountry(LOC_COUNTRY_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_CITY:
				setLocCity(LOC_CITY_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_PO_NR:
				setLocPONr(LOC_PO_NR_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_ADDRESS:
				setLocAddress(LOC_ADDRESS_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__LOC_LOCATION:
				setLocLocation(LOC_LOCATION_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__NET_IP:
				setNetIP(NET_IP_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__NET_URL:
				setNetUrl(NET_URL_EDEFAULT);
				return;
			case EvesimPackage.EVE_COMPONENT__LOCATION:
				setLocation((EveLocation)null);
				return;
			case EvesimPackage.EVE_COMPONENT__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
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
			case EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS:
				return attachedConnections != null && !attachedConnections.isEmpty();
			case EvesimPackage.EVE_COMPONENT__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case EvesimPackage.EVE_COMPONENT__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case EvesimPackage.EVE_COMPONENT__PARENT:
				return getParent() != null;
			case EvesimPackage.EVE_COMPONENT__SESSION_ID:
				return SESSION_ID_EDEFAULT == null ? sessionID != null : !SESSION_ID_EDEFAULT.equals(sessionID);
			case EvesimPackage.EVE_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvesimPackage.EVE_COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EvesimPackage.EVE_COMPONENT__CHILDREN:
				return children != null && !children.isEmpty();
			case EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE:
				return locLongitude != LOC_LONGITUDE_EDEFAULT;
			case EvesimPackage.EVE_COMPONENT__LOC_LATITUDE:
				return locLatitude != LOC_LATITUDE_EDEFAULT;
			case EvesimPackage.EVE_COMPONENT__LOC_COUNTRY:
				return LOC_COUNTRY_EDEFAULT == null ? locCountry != null : !LOC_COUNTRY_EDEFAULT.equals(locCountry);
			case EvesimPackage.EVE_COMPONENT__LOC_CITY:
				return LOC_CITY_EDEFAULT == null ? locCity != null : !LOC_CITY_EDEFAULT.equals(locCity);
			case EvesimPackage.EVE_COMPONENT__LOC_PO_NR:
				return LOC_PO_NR_EDEFAULT == null ? locPONr != null : !LOC_PO_NR_EDEFAULT.equals(locPONr);
			case EvesimPackage.EVE_COMPONENT__LOC_ADDRESS:
				return LOC_ADDRESS_EDEFAULT == null ? locAddress != null : !LOC_ADDRESS_EDEFAULT.equals(locAddress);
			case EvesimPackage.EVE_COMPONENT__LOC_LOCATION:
				return LOC_LOCATION_EDEFAULT == null ? locLocation != null : !LOC_LOCATION_EDEFAULT.equals(locLocation);
			case EvesimPackage.EVE_COMPONENT__NET_IP:
				return NET_IP_EDEFAULT == null ? netIP != null : !NET_IP_EDEFAULT.equals(netIP);
			case EvesimPackage.EVE_COMPONENT__NET_URL:
				return NET_URL_EDEFAULT == null ? netUrl != null : !NET_URL_EDEFAULT.equals(netUrl);
			case EvesimPackage.EVE_COMPONENT__LOCATION:
				return location != null;
			case EvesimPackage.EVE_COMPONENT__TIME_STAMP:
				return timeStamp != TIME_STAMP_EDEFAULT;
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", uri: ");
		result.append(uri);
		result.append(", sessionID: ");
		result.append(sessionID);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", locLongitude: ");
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
		result.append(", netIP: ");
		result.append(netIP);
		result.append(", netUrl: ");
		result.append(netUrl);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class adapter) {

		if (adapter == IPropertySource.class) {
			if (compPS == null) {
				compPS = new EveComponentPropertySource(this);
			}
			return compPS;
		}
		return null;

	}

} // EveComponentImpl
