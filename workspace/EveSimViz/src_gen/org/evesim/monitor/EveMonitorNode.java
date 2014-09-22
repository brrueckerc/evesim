/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor;

import org.evesim.EveComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Monitor Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.monitor.EveMonitorNode#getNodeStatus <em>Node Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.monitor.MonitorPackage#getEveMonitorNode()
 * @model
 * @generated
 */
public interface EveMonitorNode extends EveComponent {
	/**
	 * Returns the value of the '<em><b>Node Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.evesim.monitor.NodeStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Status</em>' attribute.
	 * @see org.evesim.monitor.NodeStatus
	 * @see #setNodeStatus(NodeStatus)
	 * @see org.evesim.monitor.MonitorPackage#getEveMonitorNode_NodeStatus()
	 * @model
	 * @generated
	 */
	NodeStatus getNodeStatus();

	/**
	 * Sets the value of the '{@link org.evesim.monitor.EveMonitorNode#getNodeStatus <em>Node Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Status</em>' attribute.
	 * @see org.evesim.monitor.NodeStatus
	 * @see #getNodeStatus()
	 * @generated
	 */
	void setNodeStatus(NodeStatus value);

} // EveMonitorNode
