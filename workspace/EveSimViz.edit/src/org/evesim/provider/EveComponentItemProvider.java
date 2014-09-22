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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveMessageSink;
import org.evesim.EveMonitor;
import org.evesim.EveNode;
import org.evesim.EvePrototype;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.monitor.EveMonitorNode;
import org.evesim.monitor.EveMonitorPeerGroup;
import org.evesim.monitor.MonitorFactory;
import org.evesim.msg.MsgFactory;
import org.evesim.timer.TimerFactory;
import org.evesim.usecase.semanticSearch.EveAgentSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchFactory;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;
import org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent;
import org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;

/**
 * This is the item provider adapter for a {@link org.evesim.EveComponent} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EveComponentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EveComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			if (!(object instanceof EveMessageSink)) {
				addAttachedConnectionsPropertyDescriptor(object);
				addUriPropertyDescriptor(object);
				addNamePropertyDescriptor(object);
				addDescriptionPropertyDescriptor(object);
				addLocLongitudePropertyDescriptor(object);
				addLocLatitudePropertyDescriptor(object);
				addLocCountryPropertyDescriptor(object);
				addLocCityPropertyDescriptor(object);
				addLocPONrPropertyDescriptor(object);
				addLocAddressPropertyDescriptor(object);
				addLocLocationPropertyDescriptor(object);
				addNetIPPropertyDescriptor(object);
				addNetUrlPropertyDescriptor(object);
				addLocationPropertyDescriptor(object);
				addTimeStampPropertyDescriptor(object);
			}
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_uri_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_name_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_description_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Loc Longitude feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocLongitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_locLongitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_locLongitude_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOC_LONGITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_LocationCoordinatesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Loc Latitude feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocLatitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_locLatitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_locLatitude_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOC_LATITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_LocationCoordinatesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Loc Country feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_locCountry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_locCountry_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOC_COUNTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Loc City feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocCityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_locCity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_locCity_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOC_CITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Loc PO Nr feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocPONrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_locPONr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_locPONr_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOC_PO_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Loc Address feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_locAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_locAddress_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOC_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Loc Location feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_locLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_locLocation_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOC_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Net IP feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNetIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_netIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_netIP_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__NET_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NetworkPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Net Url feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNetUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_netUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_netUrl_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__NET_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NetworkPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_location_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__LOCATION,
				 true,
				 true,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeStampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_timeStamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_timeStamp_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__TIME_STAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attached Connections feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttachedConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveComponent_attachedConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveComponent_attachedConnections_feature", "_UI_EveComponent_type"),
				 EvesimPackage.Literals.EVE_COMPONENT__ATTACHED_CONNECTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN);
			childrenFeatures.add(EvesimPackage.Literals.EVE_COMPONENT__LOCATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EveComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EveComponent_type") :
			getString("_UI_EveComponent_type") + " " + label;
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

		switch (notification.getFeatureID(EveComponent.class)) {
			case EvesimPackage.EVE_COMPONENT__UUID:
			case EvesimPackage.EVE_COMPONENT__URI:
			case EvesimPackage.EVE_COMPONENT__SESSION_ID:
			case EvesimPackage.EVE_COMPONENT__NAME:
			case EvesimPackage.EVE_COMPONENT__DESCRIPTION:
			case EvesimPackage.EVE_COMPONENT__LOC_LONGITUDE:
			case EvesimPackage.EVE_COMPONENT__LOC_LATITUDE:
			case EvesimPackage.EVE_COMPONENT__LOC_COUNTRY:
			case EvesimPackage.EVE_COMPONENT__LOC_CITY:
			case EvesimPackage.EVE_COMPONENT__LOC_PO_NR:
			case EvesimPackage.EVE_COMPONENT__LOC_ADDRESS:
			case EvesimPackage.EVE_COMPONENT__LOC_LOCATION:
			case EvesimPackage.EVE_COMPONENT__NET_IP:
			case EvesimPackage.EVE_COMPONENT__NET_URL:
			case EvesimPackage.EVE_COMPONENT__TIME_STAMP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EvesimPackage.EVE_COMPONENT__CHILDREN:
			case EvesimPackage.EVE_COMPONENT__LOCATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		/*
		 * EveComponents cannot be created directly
		 * 
		 * newChildDescriptors.add(createChildParameter(
		 * EvesimPackage.Literals.EVE_COMPONENT__CHILDREN,
		 * EvesimFactory.eINSTANCE.createEveComponent()));
		 */

		/*
		 * newChildDescriptors.add(createChildParameter(
		 * EvesimPackage.Literals.EVE_COMPONENT__CHILDREN,
		 * EvesimFactory.eINSTANCE.createEveSimulation()));
		 */

		if (object instanceof EveSimulation) {
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, EvesimFactory.eINSTANCE.createEveNode()));
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, MsgFactory.eINSTANCE.createEveFileMessageSink()));
		}

		if (object instanceof EveMonitor || object instanceof EveMonitorPeerGroup) {
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, MonitorFactory.eINSTANCE.createEveMonitorPeerGroup()));
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, MonitorFactory.eINSTANCE.createEveMonitorNode()));
		}

		if (object instanceof EveMonitorNode) {
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, EvesimFactory.eINSTANCE.createEveConnection()));
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, TimerFactory.eINSTANCE.createEveRepeatingTimer()));

		}

		if (object instanceof EveNode)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, EvesimFactory.eINSTANCE.createEveAgent()));

		if (object instanceof EveSimulation)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, EvesimFactory.eINSTANCE.createEvePrototype()));

		if (object instanceof EveAgent || object instanceof EvePrototype)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, EvesimFactory.eINSTANCE.createEveService()));

		if (object instanceof EveAgent)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, EvesimFactory.eINSTANCE.createEveConnection()));

		/*
		 * if (object instanceof EveAgent)
		 * newChildDescriptors.add(createChildParameter(
		 * EvesimPackage.Literals.EVE_COMPONENT__CHILDREN,
		 * TimerFactory.eINSTANCE.createEveTimer()));
		 */

		if (object instanceof EveAgent)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, TimerFactory.eINSTANCE.createEveRepeatingTimer()));

		if (object instanceof EveNode)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SemanticSearchFactory.eINSTANCE
					.createEveAgentSemanticSearch()));

		if (object instanceof EveAgentSemanticSearch)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SemanticSearchFactory.eINSTANCE
					.createEveServiceSemanticSearch()));

		if (object instanceof EveNode)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SocialNetworkAnalysisFactory.eINSTANCE
					.createEveGatewaySNA()));
		
		if (object instanceof EveNode)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SocialNetworkAnalysisFactory.eINSTANCE
					.createEveEvolutionaryAgent()));
		
		if (object instanceof EveNode)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SocialNetworkAnalysisFactory.eINSTANCE
					.createEveHistoryAgent()));

		if (object instanceof EveGatewaySNA)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SocialNetworkAnalysisFactory.eINSTANCE
					.createEveAgentSNA()));
		
		if (object instanceof EveEvolutionaryAgent)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SocialNetworkAnalysisFactory.eINSTANCE.createEveEvolutionaryAgent()));

		if (object instanceof EveHistoryAgent)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, SocialNetworkAnalysisFactory.eINSTANCE.createEveHistoryAgent()));
		
		if (object instanceof EveHistoryAgent)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, TimerFactory.eINSTANCE.createEveHistoryTimer()));
		
		if (object instanceof EveGatewaySNA)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, TimerFactory.eINSTANCE.createEveStartingTimer()));

		if (object instanceof EveAgentSNA)
			newChildDescriptors.add(createChildParameter(EvesimPackage.Literals.EVE_COMPONENT__CHILDREN, TimerFactory.eINSTANCE.createEveFunctionTimer()));
		

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
