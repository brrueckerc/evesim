/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.evesim.monitor.*;
import org.evesim.monitor.EveMonitorNode;
import org.evesim.monitor.EveMonitorPeerGroup;
import org.evesim.monitor.MonitorFactory;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.NodeStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitorFactoryImpl extends EFactoryImpl implements MonitorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MonitorFactory init() {
		try {
			MonitorFactory theMonitorFactory = (MonitorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.evesim.org/evesim/monitor"); 
			if (theMonitorFactory != null) {
				return theMonitorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MonitorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorFactoryImpl() {
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
			case MonitorPackage.EVE_MONITOR_NODE: return createEveMonitorNode();
			case MonitorPackage.EVE_MONITOR_PEER_GROUP: return createEveMonitorPeerGroup();
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
			case MonitorPackage.NODE_STATUS:
				return createNodeStatusFromString(eDataType, initialValue);
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
			case MonitorPackage.NODE_STATUS:
				return convertNodeStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveMonitorNode createEveMonitorNode() {
		EveMonitorNodeImpl eveMonitorNode = new EveMonitorNodeImpl();
		return eveMonitorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveMonitorPeerGroup createEveMonitorPeerGroup() {
		EveMonitorPeerGroupImpl eveMonitorPeerGroup = new EveMonitorPeerGroupImpl();
		return eveMonitorPeerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeStatus createNodeStatusFromString(EDataType eDataType, String initialValue) {
		NodeStatus result = NodeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPackage getMonitorPackage() {
		return (MonitorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MonitorPackage getPackage() {
		return MonitorPackage.eINSTANCE;
	}

} //MonitorFactoryImpl
