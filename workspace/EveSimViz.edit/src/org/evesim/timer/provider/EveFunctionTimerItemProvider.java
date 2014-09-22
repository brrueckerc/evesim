/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer.provider;


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
import org.evesim.timer.EveFunctionTimer;
import org.evesim.timer.TimerPackage;

/**
 * This is the item provider adapter for a {@link org.evesim.timer.EveFunctionTimer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EveFunctionTimerItemProvider
	extends EveTimerItemProvider
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
	public EveFunctionTimerItemProvider(AdapterFactory adapterFactory) {
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

			addCounterPropertyDescriptor(object);
			addMaxRepeatPropertyDescriptor(object);
			addIsExponentialPropertyDescriptor(object);
			addIsLogarithmicPropertyDescriptor(object);
			addGradientPropertyDescriptor(object);
			addConstantPropertyDescriptor(object);
			addSleepPropertyDescriptor(object);
			addPowerPropertyDescriptor(object);
			addIsPowerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_counter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_counter_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Repeat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxRepeatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_maxRepeat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_maxRepeat_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__MAX_REPEAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Exponential feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExponentialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_isExponential_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_isExponential_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__IS_EXPONENTIAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Logarithmic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLogarithmicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_isLogarithmic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_isLogarithmic_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__IS_LOGARITHMIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gradient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGradientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_gradient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_gradient_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__GRADIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_constant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_constant_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__CONSTANT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sleep feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSleepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_sleep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_sleep_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__SLEEP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_power_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__POWER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EveFunctionTimer_isPower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EveFunctionTimer_isPower_feature", "_UI_EveFunctionTimer_type"),
				 TimerPackage.Literals.EVE_FUNCTION_TIMER__IS_POWER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EveFunctionTimer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EveFunctionTimer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EveFunctionTimer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EveFunctionTimer_type") :
			getString("_UI_EveFunctionTimer_type") + " " + label;
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

		switch (notification.getFeatureID(EveFunctionTimer.class)) {
			case TimerPackage.EVE_FUNCTION_TIMER__COUNTER:
			case TimerPackage.EVE_FUNCTION_TIMER__MAX_REPEAT:
			case TimerPackage.EVE_FUNCTION_TIMER__IS_EXPONENTIAL:
			case TimerPackage.EVE_FUNCTION_TIMER__IS_LOGARITHMIC:
			case TimerPackage.EVE_FUNCTION_TIMER__GRADIENT:
			case TimerPackage.EVE_FUNCTION_TIMER__CONSTANT:
			case TimerPackage.EVE_FUNCTION_TIMER__SLEEP:
			case TimerPackage.EVE_FUNCTION_TIMER__POWER:
			case TimerPackage.EVE_FUNCTION_TIMER__IS_POWER:
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

}
