/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.provider;


import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.evesim.msg.EveMessageBundle;
import org.evesim.msg.MsgFactory;
import org.evesim.msg.MsgPackage;

/**
 * This is the item provider adapter for a {@link org.evesim.msg.EveMessageBundle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EveMessageBundleItemProvider
	extends EveMessageItemProvider
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
	public EveMessageBundleItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MsgPackage.Literals.EVE_MESSAGE_BUNDLE__MESSAGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EveMessageBundle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EveMessageBundle"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UUID labelValue = ((EveMessageBundle)object).getMessageUUID();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EveMessageBundle_type") :
			getString("_UI_EveMessageBundle_type") + " " + label;
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

		switch (notification.getFeatureID(EveMessageBundle.class)) {
			case MsgPackage.EVE_MESSAGE_BUNDLE__MESSAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(MsgPackage.Literals.EVE_MESSAGE_BUNDLE__MESSAGES,
				 MsgFactory.eINSTANCE.createEveMessage()));

		newChildDescriptors.add
			(createChildParameter
				(MsgPackage.Literals.EVE_MESSAGE_BUNDLE__MESSAGES,
				 MsgFactory.eINSTANCE.createEveLogMessage()));

		newChildDescriptors.add
			(createChildParameter
				(MsgPackage.Literals.EVE_MESSAGE_BUNDLE__MESSAGES,
				 MsgFactory.eINSTANCE.createEveUpdateMessage()));

		newChildDescriptors.add
			(createChildParameter
				(MsgPackage.Literals.EVE_MESSAGE_BUNDLE__MESSAGES,
				 MsgFactory.eINSTANCE.createEveSerializedMessage()));

		newChildDescriptors.add
			(createChildParameter
				(MsgPackage.Literals.EVE_MESSAGE_BUNDLE__MESSAGES,
				 MsgFactory.eINSTANCE.createEveMessageBundle()));

		newChildDescriptors.add
			(createChildParameter
				(MsgPackage.Literals.EVE_MESSAGE_BUNDLE__MESSAGES,
				 MsgFactory.eINSTANCE.createEveDataMessage()));
	}

}
