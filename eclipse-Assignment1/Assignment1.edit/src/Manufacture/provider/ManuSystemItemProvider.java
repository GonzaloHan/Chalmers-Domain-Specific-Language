/**
 */
package Manufacture.provider;


import Manufacture.ManuSystem;
import Manufacture.ManufactureFactory;
import Manufacture.ManufacturePackage;

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

/**
 * This is the item provider adapter for a {@link Manufacture.ManuSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManuSystemItemProvider 
	extends ItemProviderAdapter
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
	public ManuSystemItemProvider(AdapterFactory adapterFactory) {
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

			addResponsiblePropertyDescriptor(object);
			addStartsPropertyDescriptor(object);
			addEndsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Responsible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManuSystem_responsible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManuSystem_responsible_feature", "_UI_ManuSystem_type"),
				 ManufacturePackage.Literals.MANU_SYSTEM__RESPONSIBLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Starts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManuSystem_starts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManuSystem_starts_feature", "_UI_ManuSystem_type"),
				 ManufacturePackage.Literals.MANU_SYSTEM__STARTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManuSystem_ends_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManuSystem_ends_feature", "_UI_ManuSystem_type"),
				 ManufacturePackage.Literals.MANU_SYSTEM__ENDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManuSystem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManuSystem_name_feature", "_UI_ManuSystem_type"),
				 ManufacturePackage.Literals.MANU_SYSTEM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__TRANSFORMS);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__MANAGES);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__OWNS);
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
	 * This returns ManuSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ManuSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ManuSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ManuSystem_type") :
			getString("_UI_ManuSystem_type") + " " + label;
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

		switch (notification.getFeatureID(ManuSystem.class)) {
			case ManufacturePackage.MANU_SYSTEM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ManufacturePackage.MANU_SYSTEM__TRANSFORMS:
			case ManufacturePackage.MANU_SYSTEM__CONSISTS_OF:
			case ManufacturePackage.MANU_SYSTEM__MANAGES:
			case ManufacturePackage.MANU_SYSTEM__OWNS:
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
				(ManufacturePackage.Literals.MANU_SYSTEM__TRANSFORMS,
				 ManufactureFactory.eINSTANCE.createWorkPiece()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF,
				 ManufactureFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF,
				 ManufactureFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF,
				 ManufactureFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF,
				 ManufactureFactory.eINSTANCE.createHierarchyStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF,
				 ManufactureFactory.eINSTANCE.createManuStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF,
				 ManufactureFactory.eINSTANCE.createTransStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__CONSISTS_OF,
				 ManufactureFactory.eINSTANCE.createQAStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__MANAGES,
				 ManufactureFactory.eINSTANCE.createResponsible()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__OWNS,
				 ManufactureFactory.eINSTANCE.createWorkPieceType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Assignment1EditPlugin.INSTANCE;
	}

}
