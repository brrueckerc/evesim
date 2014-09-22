/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import java.net.URI;
import java.util.Hashtable;
import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EveLocation;
import org.evesim.EveMonitor;
import org.evesim.EveNode;
import org.evesim.EveNodeServer;
import org.evesim.EveNodeType;
import org.evesim.EvePrototype;
import org.evesim.EveService;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.mortbay.jetty.Server;

import de.micromata.opengis.kml.v_2_2_0.Document;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvesimFactoryImpl extends EFactoryImpl implements EvesimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvesimFactory init() {
		try {
			EvesimFactory theEvesimFactory = (EvesimFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.evesim.org/evesim"); 
			if (theEvesimFactory != null) {
				return theEvesimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvesimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvesimFactoryImpl() {
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
			case EvesimPackage.EVE_COMPONENT: return createEveComponent();
			case EvesimPackage.EVE_SIMULATION: return createEveSimulation();
			case EvesimPackage.EVE_MONITOR: return createEveMonitor();
			case EvesimPackage.EVE_NODE: return createEveNode();
			case EvesimPackage.EVE_NODE_SERVER: return createEveNodeServer();
			case EvesimPackage.EVE_PROTOTYPE: return createEvePrototype();
			case EvesimPackage.EVE_AGENT: return createEveAgent();
			case EvesimPackage.EVE_SERVICE: return createEveService();
			case EvesimPackage.EVE_CONNECTION: return createEveConnection();
			case EvesimPackage.EVE_LOCATION: return createEveLocation();
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
			case EvesimPackage.EVE_NODE_TYPE:
				return createEveNodeTypeFromString(eDataType, initialValue);
			case EvesimPackage.SESSION_ID:
				return createSessionIDFromString(eDataType, initialValue);
			case EvesimPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case EvesimPackage.THREAD:
				return createThreadFromString(eDataType, initialValue);
			case EvesimPackage.UUID:
				return createUUIDFromString(eDataType, initialValue);
			case EvesimPackage.EVE_COMPONENT_HASHTABLE:
				return createEveComponentHashtableFromString(eDataType, initialValue);
			case EvesimPackage.JETTY_SERVER:
				return createJettyServerFromString(eDataType, initialValue);
			case EvesimPackage.KML_CONTAINER:
				return createKmlContainerFromString(eDataType, initialValue);
			case EvesimPackage.CLASS:
				return createClassFromString(eDataType, initialValue);
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
			case EvesimPackage.EVE_NODE_TYPE:
				return convertEveNodeTypeToString(eDataType, instanceValue);
			case EvesimPackage.SESSION_ID:
				return convertSessionIDToString(eDataType, instanceValue);
			case EvesimPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case EvesimPackage.THREAD:
				return convertThreadToString(eDataType, instanceValue);
			case EvesimPackage.UUID:
				return convertUUIDToString(eDataType, instanceValue);
			case EvesimPackage.EVE_COMPONENT_HASHTABLE:
				return convertEveComponentHashtableToString(eDataType, instanceValue);
			case EvesimPackage.JETTY_SERVER:
				return convertJettyServerToString(eDataType, instanceValue);
			case EvesimPackage.KML_CONTAINER:
				return convertKmlContainerToString(eDataType, instanceValue);
			case EvesimPackage.CLASS:
				return convertClassToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveAgent createEveAgent() {
		EveAgentImpl eveAgent = new EveAgentImpl();
		return eveAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveComponent createEveComponent() {
		EveComponentImpl eveComponent = new EveComponentImpl();
		return eveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveService createEveService() {
		EveServiceImpl eveService = new EveServiceImpl();
		return eveService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveConnection createEveConnection() {
		EveConnectionImpl eveConnection = new EveConnectionImpl();
		return eveConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveLocation createEveLocation() {
		EveLocationImpl eveLocation = new EveLocationImpl();
		return eveLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveSimulation createEveSimulation() {
		EveSimulationImpl eveSimulation = new EveSimulationImpl();
		return eveSimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveMonitor createEveMonitor() {
		EveMonitorImpl eveMonitor = new EveMonitorImpl();
		return eveMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvePrototype createEvePrototype() {
		EvePrototypeImpl evePrototype = new EvePrototypeImpl();
		return evePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNodeType createEveNodeTypeFromString(EDataType eDataType, String initialValue) {
		EveNodeType result = EveNodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEveNodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNode createEveNode() {
		EveNodeImpl eveNode = new EveNodeImpl();
		return eveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNodeServer createEveNodeServer() {
		EveNodeServerImpl eveNodeServer = new EveNodeServerImpl();
		return eveNodeServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UUID createUUIDFromString(EDataType eDataType, String initialValue) {
		try {
			return UUID.fromString(initialValue);
		} catch (Exception e) {
			return UUID.randomUUID();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Hashtable createEveComponentHashtableFromString(EDataType eDataType, String initialValue) {
		return (Hashtable)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEveComponentHashtableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createJettyServerFromString(EDataType eDataType, String initialValue) {
		return (Server)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJettyServerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createKmlContainerFromString(EDataType eDataType, String initialValue) {
		return (Document)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKmlContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class createClassFromString(EDataType eDataType, String initialValue) {
		return (Class)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UUID createSessionIDFromString(EDataType eDataType, String initialValue) {
		try {
			return UUID.fromString(initialValue);
		} catch (Exception e) {
			return UUID.randomUUID();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSessionIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thread createThreadFromString(EDataType eDataType, String initialValue) {
		return (Thread)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreadToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvesimPackage getEvesimPackage() {
		return (EvesimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvesimPackage getPackage() {
		return EvesimPackage.eINSTANCE;
	}

} //EvesimFactoryImpl
