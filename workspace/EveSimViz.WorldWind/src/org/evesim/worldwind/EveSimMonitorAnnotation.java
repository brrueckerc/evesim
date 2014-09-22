package org.evesim.worldwind;

import gov.nasa.worldwind.render.AnnotationAttributes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.evesim.monitor.EveMonitorNode;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.NodeStatus;

public class EveSimMonitorAnnotation extends EveSimGlobeAnnotation {

	public EveSimMonitorAnnotation(EveMonitorNode cmp) {
		super(cmp);
	}

	@Override
	protected AnnotationAttributes getComponentStyle() {
		if (!(getComponent() instanceof EveMonitorNode)) 
			return super.getComponentStyle();

		if (getMonitorNode().getNodeStatus().equals(NodeStatus.OK)) {
			return (getSelected() ? WorldWindConstants.ATTRIBUTES_MON_OK_SELECTED : WorldWindConstants.ATTRIBUTES_MON_OK_DEFAULT);
		} else if (getMonitorNode().getNodeStatus().equals(NodeStatus.FAIL)) {
			return (getSelected() ? WorldWindConstants.ATTRIBUTES_MON_NOK_SELECTED : WorldWindConstants.ATTRIBUTES_MON_NOK_DEFAULT);
		} else if (getMonitorNode().getNodeStatus().equals(NodeStatus.RECOVERING)) {
			return (getSelected() ? WorldWindConstants.ATTRIBUTES_MON_RECOVER_SELECTED : WorldWindConstants.ATTRIBUTES_MON_RECOVER_DEFAULT);
		} else
			return super.getComponentStyle();
	}

	public EveMonitorNode getMonitorNode() {
		return (EveMonitorNode) getComponent();
	}

	protected void addChange(Notification notification) {
		super.addChange(notification);
		if (notification.getFeature() instanceof EAttribute) {

			EAttribute attr = (EAttribute) notification.getFeature();
			if (MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS == attr.getFeatureID()) {
				setAttributes(getComponentStyle());
			}
		}
	}
	
}
