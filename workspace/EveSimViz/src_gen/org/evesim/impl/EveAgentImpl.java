/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EvePrototype;
import org.evesim.EveService;
import org.evesim.EvesimPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eve Agent</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getPrototypeUUID <em>Prototype UUID</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getAgentPoolUUID <em>Agent Pool UUID</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getAgentPool <em>Agent Pool</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getDemandedServices <em>Demanded Services</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getOfferedServices <em>Offered Services</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getLocalServicePool <em>Local Service Pool</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getBetweeness <em>Betweeness</em>}</li>
 *   <li>{@link org.evesim.impl.EveAgentImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveAgentImpl extends EveComponentImpl implements EveAgent {
	/**
	 *  
	 */
	private static final long serialVersionUID = -1637060840822568701L;

	@Override
	public void execute() {
		logger.info("Executed Agent: " + getName());
	}

	/**
	 * The default value of the '{@link #getPrototypeUUID() <em>Prototype UUID</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPrototypeUUID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID PROTOTYPE_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrototypeUUID() <em>Prototype UUID</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPrototypeUUID()
	 * @generated
	 * @ordered
	 */
	protected UUID prototypeUUID = PROTOTYPE_UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected EvePrototype prototype;

	/**
	 * The default value of the '{@link #getAgentPoolUUID() <em>Agent Pool UUID</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAgentPoolUUID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID AGENT_POOL_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentPoolUUID() <em>Agent Pool UUID</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAgentPoolUUID()
	 * @generated
	 * @ordered
	 */
	protected UUID agentPoolUUID = AGENT_POOL_UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAgentPool() <em>Agent Pool</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAgentPool()
	 * @generated
	 * @ordered
	 */
	protected EvePrototype agentPool;

	/**
	 * The cached value of the '{@link #getDemandedServices()
	 * <em>Demanded Services</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDemandedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<EveService> demandedServices;

	/**
	 * The cached value of the '{@link #getOfferedServices() <em>Offered Services</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOfferedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<EveService> offeredServices;

	/**
	 * The cached value of the '{@link #getLocalServicePool() <em>Local Service Pool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalServicePool()
	 * @generated
	 * @ordered
	 */
	protected EList<EveService> localServicePool;

	/**
	 * The default value of the '{@link #getBetweeness() <em>Betweeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetweeness()
	 * @generated
	 * @ordered
	 */
	protected static final float BETWEENESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBetweeness() <em>Betweeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetweeness()
	 * @generated
	 * @ordered
	 */
	protected float betweeness = BETWEENESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EveAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_AGENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getPrototypeUUID() {
		return prototypeUUID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototypeUUID(UUID newPrototypeUUID) {
		UUID oldPrototypeUUID = prototypeUUID;
		prototypeUUID = newPrototypeUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_AGENT__PROTOTYPE_UUID, oldPrototypeUUID, prototypeUUID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EvePrototype getPrototype() {
		if (prototype != null && prototype.eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (EvePrototype)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvesimPackage.EVE_AGENT__PROTOTYPE, oldPrototype, prototype));
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EvePrototype basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototype(EvePrototype newPrototype) {
		EvePrototype oldPrototype = prototype;
		prototype = newPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_AGENT__PROTOTYPE, oldPrototype, prototype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getAgentPoolUUID() {
		return agentPoolUUID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentPoolUUID(UUID newAgentPoolUUID) {
		UUID oldAgentPoolUUID = agentPoolUUID;
		agentPoolUUID = newAgentPoolUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_AGENT__AGENT_POOL_UUID, oldAgentPoolUUID, agentPoolUUID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EvePrototype getAgentPool() {
		if (agentPool != null && agentPool.eIsProxy()) {
			InternalEObject oldAgentPool = (InternalEObject)agentPool;
			agentPool = (EvePrototype)eResolveProxy(oldAgentPool);
			if (agentPool != oldAgentPool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvesimPackage.EVE_AGENT__AGENT_POOL, oldAgentPool, agentPool));
			}
		}
		return agentPool;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EvePrototype basicGetAgentPool() {
		return agentPool;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentPool(EvePrototype newAgentPool) {
		EvePrototype oldAgentPool = agentPool;
		agentPool = newAgentPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_AGENT__AGENT_POOL, oldAgentPool, agentPool));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EveService> getDemandedServices() {
		if (demandedServices == null) {
			demandedServices = new EObjectResolvingEList<EveService>(EveService.class, this, EvesimPackage.EVE_AGENT__DEMANDED_SERVICES);
		}
		return demandedServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EveService> getOfferedServices() {
		if (offeredServices == null) {
			offeredServices = new EObjectResolvingEList<EveService>(EveService.class, this, EvesimPackage.EVE_AGENT__OFFERED_SERVICES);
		}
		return offeredServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EveService> getLocalServicePool() {
		if (localServicePool == null) {
			localServicePool = new EObjectResolvingEList<EveService>(EveService.class, this, EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL);
		}
		return localServicePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBetweeness() {
		return betweeness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBetweeness(float newBetweeness) {
		float oldBetweeness = betweeness;
		betweeness = newBetweeness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_AGENT__BETWEENESS, oldBetweeness, betweeness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_AGENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void start() {
		/*
		 * if (getTimer() != null) getTimer().start();
		 */
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvesimPackage.EVE_AGENT__PROTOTYPE_UUID:
				return getPrototypeUUID();
			case EvesimPackage.EVE_AGENT__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case EvesimPackage.EVE_AGENT__AGENT_POOL_UUID:
				return getAgentPoolUUID();
			case EvesimPackage.EVE_AGENT__AGENT_POOL:
				if (resolve) return getAgentPool();
				return basicGetAgentPool();
			case EvesimPackage.EVE_AGENT__DEMANDED_SERVICES:
				return getDemandedServices();
			case EvesimPackage.EVE_AGENT__OFFERED_SERVICES:
				return getOfferedServices();
			case EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL:
				return getLocalServicePool();
			case EvesimPackage.EVE_AGENT__BETWEENESS:
				return getBetweeness();
			case EvesimPackage.EVE_AGENT__TYPE:
				return getType();
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
			case EvesimPackage.EVE_AGENT__PROTOTYPE_UUID:
				setPrototypeUUID((UUID)newValue);
				return;
			case EvesimPackage.EVE_AGENT__PROTOTYPE:
				setPrototype((EvePrototype)newValue);
				return;
			case EvesimPackage.EVE_AGENT__AGENT_POOL_UUID:
				setAgentPoolUUID((UUID)newValue);
				return;
			case EvesimPackage.EVE_AGENT__AGENT_POOL:
				setAgentPool((EvePrototype)newValue);
				return;
			case EvesimPackage.EVE_AGENT__DEMANDED_SERVICES:
				getDemandedServices().clear();
				getDemandedServices().addAll((Collection<? extends EveService>)newValue);
				return;
			case EvesimPackage.EVE_AGENT__OFFERED_SERVICES:
				getOfferedServices().clear();
				getOfferedServices().addAll((Collection<? extends EveService>)newValue);
				return;
			case EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL:
				getLocalServicePool().clear();
				getLocalServicePool().addAll((Collection<? extends EveService>)newValue);
				return;
			case EvesimPackage.EVE_AGENT__BETWEENESS:
				setBetweeness((Float)newValue);
				return;
			case EvesimPackage.EVE_AGENT__TYPE:
				setType((String)newValue);
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
			case EvesimPackage.EVE_AGENT__PROTOTYPE_UUID:
				setPrototypeUUID(PROTOTYPE_UUID_EDEFAULT);
				return;
			case EvesimPackage.EVE_AGENT__PROTOTYPE:
				setPrototype((EvePrototype)null);
				return;
			case EvesimPackage.EVE_AGENT__AGENT_POOL_UUID:
				setAgentPoolUUID(AGENT_POOL_UUID_EDEFAULT);
				return;
			case EvesimPackage.EVE_AGENT__AGENT_POOL:
				setAgentPool((EvePrototype)null);
				return;
			case EvesimPackage.EVE_AGENT__DEMANDED_SERVICES:
				getDemandedServices().clear();
				return;
			case EvesimPackage.EVE_AGENT__OFFERED_SERVICES:
				getOfferedServices().clear();
				return;
			case EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL:
				getLocalServicePool().clear();
				return;
			case EvesimPackage.EVE_AGENT__BETWEENESS:
				setBetweeness(BETWEENESS_EDEFAULT);
				return;
			case EvesimPackage.EVE_AGENT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case EvesimPackage.EVE_AGENT__PROTOTYPE_UUID:
				return PROTOTYPE_UUID_EDEFAULT == null ? prototypeUUID != null : !PROTOTYPE_UUID_EDEFAULT.equals(prototypeUUID);
			case EvesimPackage.EVE_AGENT__PROTOTYPE:
				return prototype != null;
			case EvesimPackage.EVE_AGENT__AGENT_POOL_UUID:
				return AGENT_POOL_UUID_EDEFAULT == null ? agentPoolUUID != null : !AGENT_POOL_UUID_EDEFAULT.equals(agentPoolUUID);
			case EvesimPackage.EVE_AGENT__AGENT_POOL:
				return agentPool != null;
			case EvesimPackage.EVE_AGENT__DEMANDED_SERVICES:
				return demandedServices != null && !demandedServices.isEmpty();
			case EvesimPackage.EVE_AGENT__OFFERED_SERVICES:
				return offeredServices != null && !offeredServices.isEmpty();
			case EvesimPackage.EVE_AGENT__LOCAL_SERVICE_POOL:
				return localServicePool != null && !localServicePool.isEmpty();
			case EvesimPackage.EVE_AGENT__BETWEENESS:
				return betweeness != BETWEENESS_EDEFAULT;
			case EvesimPackage.EVE_AGENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (prototypeUUID: ");
		result.append(prototypeUUID);
		result.append(", agentPoolUUID: ");
		result.append(agentPoolUUID);
		result.append(", betweeness: ");
		result.append(betweeness);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addChild(EveComponent child) {
		super.addChild(child);
		if (child instanceof EveConnection) {
			this.getConnections().add((EveConnection) child);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void removeChild(EveComponent child) {
		if (child instanceof EveConnection) {
			getConnections().remove(child);
		}

		super.removeChild(child);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void removeChild(UUID uuid) {
		EveComponent cmp = getChildByUUID(uuid);
		this.removeChild(cmp);
	}

} // EveAgentImpl
