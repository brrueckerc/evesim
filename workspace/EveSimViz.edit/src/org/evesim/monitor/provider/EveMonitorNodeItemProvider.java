/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.evesim.monitor.EveMonitorNode;
import org.evesim.monitor.MonitorPackage;
import org.evesim.monitor.NodeStatus;
import org.evesim.provider.EveComponentItemProvider;
import org.evesim.provider.EvesimEditPlugin;

/**
 * This is the item provider adapter for a {@link org.evesim.monitor.EveMonitorNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EveMonitorNodeItemProvider extends EveComponentItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EveMonitorNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNodeStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Node Status feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNodeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveMonitorNode_nodeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveMonitorNode_nodeStatus_feature", "_UI_EveMonitorNode_type"),
				 MonitorPackage.Literals.EVE_MONITOR_NODE__NODE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EveMonitorNode.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override 
	public Object getImage(Object object) {
		if (object instanceof EveMonitorNode) {
			EveMonitorNode mon = (EveMonitorNode) object;
			switch (mon.getNodeStatus().getValue()) {
			case NodeStatus.OK_VALUE:
				return overlayImage(object, getResourceLocator().getImage("full/obj16/Circle_Green"));
			case NodeStatus.FAIL_VALUE:
				return overlayImage(object, getResourceLocator().getImage("full/obj16/Circle_Red"));
			case NodeStatus.RECOVERING_VALUE:
				return overlayImage(object, getResourceLocator().getImage("full/obj16/Circle_Yellow"));

			}
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EveMonitorNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EveMonitorNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EveMonitorNode_type") :
			getString("_UI_EveMonitorNode_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EveMonitorNode.class)) {
			case MonitorPackage.EVE_MONITOR_NODE__NODE_STATUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EvesimEditPlugin.INSTANCE;
	}

}
