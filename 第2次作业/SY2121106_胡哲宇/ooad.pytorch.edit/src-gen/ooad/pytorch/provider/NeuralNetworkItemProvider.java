/**
 */
package ooad.pytorch.provider;

import java.util.Collection;
import java.util.List;

import ooad.pytorch.NeuralNetwork;
import ooad.pytorch.PytorchFactory;
import ooad.pytorch.PytorchPackage;

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
 * This is the item provider adapter for a {@link ooad.pytorch.NeuralNetwork} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NeuralNetworkItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeuralNetworkItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NeuralNetwork_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NeuralNetwork_name_feature",
								"_UI_NeuralNetwork_type"),
						PytorchPackage.Literals.NEURAL_NETWORK__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(PytorchPackage.Literals.NEURAL_NETWORK__MODULES);
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
	 * This returns NeuralNetwork.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NeuralNetwork"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NeuralNetwork) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NeuralNetwork_type")
				: getString("_UI_NeuralNetwork_type") + " " + label;
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

		switch (notification.getFeatureID(NeuralNetwork.class)) {
		case PytorchPackage.NEURAL_NETWORK__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case PytorchPackage.NEURAL_NETWORK__MODULES:
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

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createIdentity()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createLinear()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createBilinear()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createConv1d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createConv2d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createConv3d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createMaxPool1d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createMaxPool2d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createMaxPool3d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createAvgPool1d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createAvgPool2d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createAvgPool3d()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createSigmoid()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createReLU()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createLeakyReLU()));

		newChildDescriptors.add(createChildParameter(PytorchPackage.Literals.NEURAL_NETWORK__MODULES,
				PytorchFactory.eINSTANCE.createSoftmax()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PytorchEditPlugin.INSTANCE;
	}

}
