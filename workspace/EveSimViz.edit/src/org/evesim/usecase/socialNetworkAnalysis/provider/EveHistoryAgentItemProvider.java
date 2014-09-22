/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis.provider;


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
import org.evesim.provider.EveAgentItemProvider;
import org.evesim.provider.EvesimEditPlugin;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;

/**
 * This is the item provider adapter for a {@link org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EveHistoryAgentItemProvider
	extends EveAgentItemProvider
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
	public EveHistoryAgentItemProvider(AdapterFactory adapterFactory) {
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

			addIsRootPropertyDescriptor(object);
			addBirthdatePropertyDescriptor(object);
			addHistDataPropertyDescriptor(object);
			addSimIntervalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveHistoryAgent_isRoot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveHistoryAgent_isRoot_feature", "_UI_EveHistoryAgent_type"),
				 SocialNetworkAnalysisPackage.Literals.EVE_HISTORY_AGENT__IS_ROOT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Birthdate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBirthdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveHistoryAgent_Birthdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveHistoryAgent_Birthdate_feature", "_UI_EveHistoryAgent_type"),
				 SocialNetworkAnalysisPackage.Literals.EVE_HISTORY_AGENT__BIRTHDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hist Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveHistoryAgent_histData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveHistoryAgent_histData_feature", "_UI_EveHistoryAgent_type"),
				 SocialNetworkAnalysisPackage.Literals.EVE_HISTORY_AGENT__HIST_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sim Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveHistoryAgent_simInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveHistoryAgent_simInterval_feature", "_UI_EveHistoryAgent_type"),
				 SocialNetworkAnalysisPackage.Literals.EVE_HISTORY_AGENT__SIM_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EveHistoryAgent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EveHistoryAgent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EveHistoryAgent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EveHistoryAgent_type") :
			getString("_UI_EveHistoryAgent_type") + " " + label;
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

		switch (notification.getFeatureID(EveHistoryAgent.class)) {
			case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__IS_ROOT:
			case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__BIRTHDATE:
			case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__HIST_DATA:
			case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__SIM_INTERVAL:
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
