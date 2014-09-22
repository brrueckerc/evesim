/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.impl.EveComponentImpl;
import org.evesim.monitor.EveMonitorNode;
import org.evesim.monitor.MonitorFactory;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.NodeStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Monitor Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.monitor.impl.EveMonitorNodeImpl#getNodeStatus <em>Node Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveMonitorNodeImpl extends EveComponentImpl implements EveMonitorNode {
	
	/**
	 * @generated NOT
	 * @ordered
	 */
	@Override
	public void execute() {
		
		if (getNetUrl() == null || getNetUrl().length() == 0) {
			setNodeStatus(NodeStatus.FAIL);
			return;
		}
	
		try {
			URL n = new URL(getNetUrl());
			URLConnection con = n.openConnection();
			setDescription(con.getContent().toString());

			if (getNodeStatus() == NodeStatus.FAIL) {
				setNodeStatus(NodeStatus.RECOVERING);
			} else {
				setNodeStatus(NodeStatus.OK);
			}

		} catch (Exception e) {
			//logger.log(Level.SEVERE,"Error occured while checking node: "+toString()+".",e);
			setDescription(e.toString());
			setNodeStatus(NodeStatus.FAIL);
		}		
	}
	
	public static void main(String[] args) {
		// Initialize the model
		EvesimPackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		EvesimFactory factory = EvesimFactory.eINSTANCE;
		
		try {
			URL u = new URL("http://localhost:8080/monitor");
			EveMonitorNode mn = MonitorFactory.eINSTANCE.createEveMonitorNode();
			mn.setNetUrl(u.toString());
			mn.execute();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	/**
	 * The default value of the '{@link #getNodeStatus() <em>Node Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final NodeStatus NODE_STATUS_EDEFAULT = NodeStatus.OK;

	/**
	 * The cached value of the '{@link #getNodeStatus() <em>Node Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeStatus()
	 * @generated
	 * @ordered
	 */
	protected NodeStatus nodeStatus = NODE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveMonitorNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitorPackage.Literals.EVE_MONITOR_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeStatus getNodeStatus() {
		return nodeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeStatus(NodeStatus newNodeStatus) {
		NodeStatus oldNodeStatus = nodeStatus;
		nodeStatus = newNodeStatus == null ? NODE_STATUS_EDEFAULT : newNodeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS, oldNodeStatus, nodeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS:
				return getNodeStatus();
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
			case MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS:
				setNodeStatus((NodeStatus)newValue);
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
			case MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS:
				setNodeStatus(NODE_STATUS_EDEFAULT);
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
			case MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS:
				return nodeStatus != NODE_STATUS_EDEFAULT;
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
		result.append(" (nodeStatus: ");
		result.append(nodeStatus);
		result.append(')');
		return result.toString();
	}

} //EveMonitorNodeImpl
