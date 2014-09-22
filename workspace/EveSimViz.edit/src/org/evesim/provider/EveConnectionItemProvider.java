/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.evesim.EveConnection;
import org.evesim.EvesimPackage;

/**
 * This is the item provider adapter for a {@link org.evesim.EveConnection} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EveConnectionItemProvider extends EveComponentItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EveConnectionItemProvider(AdapterFactory adapterFactory) {
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

			addConnectedComponentPropertyDescriptor(object);
			addStrengthPropertyDescriptor(object);
			addConnectedPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addDirectionalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connected Component feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addConnectedComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveConnection_connectedComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveConnection_connectedComponent_feature", "_UI_EveConnection_type"),
				 EvesimPackage.Literals.EVE_CONNECTION__CONNECTED_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strength feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStrengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveConnection_strength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveConnection_strength_feature", "_UI_EveConnection_type"),
				 EvesimPackage.Literals.EVE_CONNECTION__STRENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addConnectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveConnection_connected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveConnection_connected_feature", "_UI_EveConnection_type"),
				 EvesimPackage.Literals.EVE_CONNECTION__CONNECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveConnection_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveConnection_type_feature", "_UI_EveConnection_type"),
				 EvesimPackage.Literals.EVE_CONNECTION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveConnection_directional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveConnection_directional_feature", "_UI_EveConnection_type"),
				 EvesimPackage.Literals.EVE_CONNECTION__DIRECTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EveConnection.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EveConnection"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT 
	 */
	@Override
	public String getText(Object object) {
		// String label = ((EveConnection) object).getName();
		String from = ((EveConnection) object).getParent().getName();
		String to = (((EveConnection) object).getConnectedComponent() != null ? ((EveConnection) object).getConnectedComponent().getName() : "unconnected");
		String label = " [" + from + (((EveConnection) object).isDirectional() ? " --> " : " <-> ") + to + "]";

		return label == null || label.length() == 0 ? getString("_UI_EveConnection_type") : getString("_UI_EveConnection_type") + " " + label;
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

		switch (notification.getFeatureID(EveConnection.class)) {
			case EvesimPackage.EVE_CONNECTION__CONNECTED_COMPONENT:
			case EvesimPackage.EVE_CONNECTION__STRENGTH:
			case EvesimPackage.EVE_CONNECTION__CONNECTED:
			case EvesimPackage.EVE_CONNECTION__TYPE:
			case EvesimPackage.EVE_CONNECTION__DIRECTIONAL:
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

}
