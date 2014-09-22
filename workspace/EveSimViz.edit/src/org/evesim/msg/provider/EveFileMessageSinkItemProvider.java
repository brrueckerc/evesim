/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.provider;


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
import org.evesim.msg.EveFileMessageSink;
import org.evesim.msg.MsgPackage;
import org.evesim.provider.EveComponentItemProvider;
import org.evesim.provider.EvesimEditPlugin;

/**
 * This is the item provider adapter for a {@link org.evesim.msg.EveFileMessageSink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EveFileMessageSinkItemProvider
	extends EveComponentItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveFileMessageSinkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFilenamePropertyDescriptor(object);
			addFiletypePropertyDescriptor(object);
			addAppendPropertyDescriptor(object);
			addDelimeterFieldPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Filename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFileMessageSink_filename_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFileMessageSink_filename_feature", "_UI_EveFileMessageSink_type"),
				 MsgPackage.Literals.EVE_FILE_MESSAGE_SINK__FILENAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FilePropertyCategory"),
				 new String[] {
					"file"
				 }));
	}

	/**
	 * This adds a property descriptor for the Filetype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiletypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFileMessageSink_filetype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFileMessageSink_filetype_feature", "_UI_EveFileMessageSink_type"),
				 MsgPackage.Literals.EVE_FILE_MESSAGE_SINK__FILETYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FilePropertyCategory"),
				 new String[] {
					"file"
				 }));
	}

	/**
	 * This adds a property descriptor for the Append feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFileMessageSink_append_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFileMessageSink_append_feature", "_UI_EveFileMessageSink_type"),
				 MsgPackage.Literals.EVE_FILE_MESSAGE_SINK__APPEND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_FilePropertyCategory"),
				 new String[] {
					"file"
				 }));
	}

	/**
	 * This adds a property descriptor for the Delimeter Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelimeterFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFileMessageSink_delimeterField_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFileMessageSink_delimeterField_feature", "_UI_EveFileMessageSink_type"),
				 MsgPackage.Literals.EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FilePropertyCategory"),
				 new String[] {
					"file"
				 }));
	}

	/**
	 * This returns EveFileMessageSink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EveFileMessageSink"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EveFileMessageSink)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EveFileMessageSink_type") :
			getString("_UI_EveFileMessageSink_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EveFileMessageSink.class)) {
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILENAME:
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILETYPE:
			case MsgPackage.EVE_FILE_MESSAGE_SINK__APPEND:
			case MsgPackage.EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EvesimEditPlugin.INSTANCE;
	}

}
