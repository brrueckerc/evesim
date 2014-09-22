/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EvesimPackage;
import org.evesim.earth.GEarthUtil;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eve Connection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveConnectionImpl#getConnectedComponent <em>Connected Component</em>}</li>
 *   <li>{@link org.evesim.impl.EveConnectionImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.evesim.impl.EveConnectionImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link org.evesim.impl.EveConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.evesim.impl.EveConnectionImpl#isDirectional <em>Directional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveConnectionImpl extends EveComponentImpl implements EveConnection {
	/**
	 * The cached value of the '{@link #getConnectedComponent() <em>Connected Component</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getConnectedComponent()
	 * @generated
	 * @ordered
	 */
	protected EveComponent connectedComponent;

	/**
	 * 
	 */
	private static final long serialVersionUID = 4851999175844943764L;

	/**
	 * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected static final float STRENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected float strength = STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDirectional() <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectional() <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean directional = DIRECTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EveConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String kmlGetStyle() {
		String result = GEarthUtil.getKMLStyleBase(GEarthUtil.KML_STYLE_EVECONNECTION);
		if (getStrength() < 1.0f) {
			result += "_strength_1";
		} else if (getStrength() < 2.0f) {
			result += "_strength_2";
		} else if (getStrength() < 3.0f) {
			result += "_strength_3";
		} else if (getStrength() < 4.0f) {
			result += "_strength_4";
		} else {
			result += "_strength_5";
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Document kmlGetVisualisation(Document kmlDocument) {

		// if this is not a valid connection: do nothing
		if (!isValid())
			return kmlDocument;

		// Create Description
		StringBuffer description = new StringBuffer();
		description = description.append("<table width='400px'>");
		if (isDirectional())
			description = description.append("<tr><td colspan='2'>Directed Connection</td></tr>");
		else
			description = description.append("<tr><td colspan='2'>Undirected Connection</td></tr>");

		if (getName() != null && getName().length() > 0)
			description = description.append("<tr><td>Name:</td><td>").append(getName()).append("</td></tr>");
		if (getType() != null && getType().length() > 0)
			description = description.append("<tr><td>Type:</td><td>").append(getType()).append("</td></tr>");

		description = description.append("<tr><td>Strength:</td><td>").append(getStrength()).append("</td></tr>");
		description = description.append("</table>");

		String text = "Connection from <b>" + getParent().getName() + "</b> to <b>" + getConnectedComponent().getName() + "</b>";

		if (getParent().isLocationValid() && getConnectedComponent().isLocationValid()) {
			Placemark p = kmlDocument.createAndAddPlacemark();
			p.setName((getName() != null && getName().length() > 0) ? getName() : text);
			p.setDescription(description.toString());
			p.setStyleUrl(kmlGetStyle());
			p.createAndSetLineString().withId(getUuid().toString()).withExtrude(false).withTessellate(true).addToCoordinates(getParent().getLocLongitude(),
					getParent().getLocLatitude(), 0).addToCoordinates(this.getConnectedComponent().getLocLongitude(),
					this.getConnectedComponent().getLocLatitude(), 0);
			// logger.info("CREATE LINE");
		}

		return kmlDocument;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EveComponent getConnectedComponent() {
		if (connectedComponent != null && connectedComponent.eIsProxy()) {
			InternalEObject oldConnectedComponent = (InternalEObject)connectedComponent;
			connectedComponent = (EveComponent)eResolveProxy(oldConnectedComponent);
			if (connectedComponent != oldConnectedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT, oldConnectedComponent, connectedComponent));
			}
		}
		return connectedComponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EveComponent basicGetConnectedComponent() {
		return connectedComponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectedComponent(EveComponent newConnectedComponent, NotificationChain msgs) {
		EveComponent oldConnectedComponent = connectedComponent;
		connectedComponent = newConnectedComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT, oldConnectedComponent, newConnectedComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedComponent(EveComponent newConnectedComponent) {
		if (newConnectedComponent != connectedComponent) {
			NotificationChain msgs = null;
			if (connectedComponent != null)
				msgs = ((InternalEObject)connectedComponent).eInverseRemove(this, EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS, EveComponent.class, msgs);
			if (newConnectedComponent != null)
				msgs = ((InternalEObject)newConnectedComponent).eInverseAdd(this, EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS, EveComponent.class, msgs);
			msgs = basicSetConnectedComponent(newConnectedComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT, newConnectedComponent, newConnectedComponent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public float getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(float newStrength) {
		float oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_CONNECTION__STRENGTH, oldStrength, strength));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_CONNECTION__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_CONNECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectional() {
		return directional;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setDirectional(boolean newDirectional) {
		boolean oldDirectional = directional;
		directional = newDirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_CONNECTION__DIRECTIONAL, oldDirectional, directional));
		
		/* Following code is conceptual and should add undirected connections to the children of both components
		 * does not work and may never work 
		 *  
		if (newDirectional) {
			if (!getConnectedComponent().getChildren().contains(getParent())) {
				getConnectedComponent().getChildren().add(this);
			}
		} else {
			if (getConnectedComponent().getChildren().contains(getParent())) {
				getConnectedComponent().getChildren().remove(this);
			}
		}
		*/
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isValid() {
		if (getConnectedComponent() != null && getParent() != null && isConnected()) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EveComponent getOpposite(EveComponent component) {
		if (component == getConnectedComponent()) {
			return getParent();
		} else if (component == getParent()) {
			return getConnectedComponent();
		} else {
			throw new RuntimeException("Component " + component.getName() + " is not related to Connection " + getName() + ".");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT:
				if (connectedComponent != null)
					msgs = ((InternalEObject)connectedComponent).eInverseRemove(this, EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS, EveComponent.class, msgs);
				return basicSetConnectedComponent((EveComponent)otherEnd, msgs);
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
			case EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT:
				return basicSetConnectedComponent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT:
				if (resolve) return getConnectedComponent();
				return basicGetConnectedComponent();
			case EvesimPackage.EVE_CONNECTION__STRENGTH:
				return getStrength();
			case EvesimPackage.EVE_CONNECTION__CONNECTED:
				return isConnected();
			case EvesimPackage.EVE_CONNECTION__TYPE:
				return getType();
			case EvesimPackage.EVE_CONNECTION__DIRECTIONAL:
				return isDirectional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT:
				setConnectedComponent((EveComponent)newValue);
				return;
			case EvesimPackage.EVE_CONNECTION__STRENGTH:
				setStrength((Float)newValue);
				return;
			case EvesimPackage.EVE_CONNECTION__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case EvesimPackage.EVE_CONNECTION__TYPE:
				setType((String)newValue);
				return;
			case EvesimPackage.EVE_CONNECTION__DIRECTIONAL:
				setDirectional((Boolean)newValue);
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
			case EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT:
				setConnectedComponent((EveComponent)null);
				return;
			case EvesimPackage.EVE_CONNECTION__STRENGTH:
				setStrength(STRENGTH_EDEFAULT);
				return;
			case EvesimPackage.EVE_CONNECTION__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case EvesimPackage.EVE_CONNECTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EvesimPackage.EVE_CONNECTION__DIRECTIONAL:
				setDirectional(DIRECTIONAL_EDEFAULT);
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
			case EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT:
				return connectedComponent != null;
			case EvesimPackage.EVE_CONNECTION__STRENGTH:
				return strength != STRENGTH_EDEFAULT;
			case EvesimPackage.EVE_CONNECTION__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case EvesimPackage.EVE_CONNECTION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EvesimPackage.EVE_CONNECTION__DIRECTIONAL:
				return directional != DIRECTIONAL_EDEFAULT;
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
		result.append(" (strength: ");
		result.append(strength);
		result.append(", connected: ");
		result.append(connected);
		result.append(", type: ");
		result.append(type);
		result.append(", directional: ");
		result.append(directional);
		result.append(')');
		return result.toString();
	}

} // EveConnectionImpl
