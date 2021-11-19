/**
 */
package torch.nn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import torch.nn.ModuleDict;
import torch.nn.NewPackage1Factory;
import torch.nn.NewPackage1Package;

/**
 * This is the item provider adapter for a {@link torch.nn.ModuleDict} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleDictItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDictItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(NewPackage1Package.Literals.MODULE_DICT__MODULE);
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
	 * This returns ModuleDict.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleDict"));
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
		return getString("_UI_ModuleDict_type");
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

		switch (notification.getFeatureID(ModuleDict.class)) {
		case NewPackage1Package.MODULE_DICT__MODULE:
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

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createModule()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_ConvNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConv1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConv2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConv3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_MaxPoolNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_AvgPoolNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSequential()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createModuleList()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createModuleDict()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createParameterList()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createParameterDIct()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_ConvTransposeNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConvTranspose1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConvTranspose2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConvTranspose3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyConv1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyConv2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyConv3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyConvTranspose1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyConvTranspose2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyConvTranspose3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMaxPool1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMaxPool2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMaxPool3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_MaxUnpoolNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMaxUnpool1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMaxUnpool2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMaxUnpool3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAvgPool1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAvgPool2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAvgPool3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createFractionalMaxPool2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createFractionalMaxPool3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_LPPoolNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLPPool1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLPPool2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_AdaptiveMaxPoolNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAdaptiveMaxPool1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAdaptiveMaxPool2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAdaptiveMaxPool3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_AdaptiveAvgPoolNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAdaptiveAvgPool1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAdaptiveAvgPool2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createAdaptiveAvgPool3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_ConstantPadNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConstantPad1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConstantPad2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createConstantPad3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_ReflectionPadNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReflectionPad1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReflectionPad2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReflectionPad3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_ReplicationPadNd()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReplicationPad1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReplicationPad2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReplicationPad3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createZeroPad2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReLU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createRReLU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createHardtanh()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createReLU6()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSigmoid()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createHardsigmoid()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createTanh()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSiLU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMish()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createHardswish()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createELU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createCELU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSELU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createGLU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createGELU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createHardshrink()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLeakyReLU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLogSigmoid()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSoftplus()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSoftshrink()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createMultiheadAttention()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createPReLU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSoftsign()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createTanhshrink()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSoftmin()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSoftmax()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSoftmax2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLogSoftmax()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_NormBase()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_BatchNorm()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.create_LazyNormBase()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createBatchNorm1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyBatchNorm1d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createBatchNorm2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyBatchNorm2d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createBatchNorm3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLazyBatchNorm3d()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createSyncBatchNorm()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createRNNBase()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createRNN()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLSTM()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createGRU()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createRNNCellBase()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createRNNCell()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createLSTMCell()));

		newChildDescriptors.add(createChildParameter(NewPackage1Package.Literals.MODULE_DICT__MODULE,
				NewPackage1Factory.eINSTANCE.createGRUCell()));
	}

}
