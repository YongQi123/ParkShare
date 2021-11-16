/**
 */
package ooad.pytorch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ooad.pytorch.PytorchFactory
 * @model kind="package"
 * @generated
 */
public interface PytorchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pytorch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pytorch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pytorch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PytorchPackage eINSTANCE = ooad.pytorch.impl.PytorchPackageImpl.init();

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.NeuralNetworkImpl <em>Neural Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.NeuralNetworkImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getNeuralNetwork()
	 * @generated
	 */
	int NEURAL_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK__MODULES = 1;

	/**
	 * The number of structural features of the '<em>Neural Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Neural Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.ModuleImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PREV = 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.ConvLayerImpl <em>Conv Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.ConvLayerImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getConvLayer()
	 * @generated
	 */
	int CONV_LAYER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV_LAYER__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV_LAYER__NEXT = MODULE__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV_LAYER__PREV = MODULE__PREV;

	/**
	 * The number of structural features of the '<em>Conv Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV_LAYER_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conv Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV_LAYER_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.MaxPoolLayerImpl <em>Max Pool Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.MaxPoolLayerImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPoolLayer()
	 * @generated
	 */
	int MAX_POOL_LAYER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL_LAYER__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL_LAYER__NEXT = MODULE__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL_LAYER__PREV = MODULE__PREV;

	/**
	 * The number of structural features of the '<em>Max Pool Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL_LAYER_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max Pool Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL_LAYER_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.AvgPoolLayerImpl <em>Avg Pool Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.AvgPoolLayerImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPoolLayer()
	 * @generated
	 */
	int AVG_POOL_LAYER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL_LAYER__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL_LAYER__NEXT = MODULE__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL_LAYER__PREV = MODULE__PREV;

	/**
	 * The number of structural features of the '<em>Avg Pool Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL_LAYER_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avg Pool Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL_LAYER_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.ActivationLayerImpl <em>Activation Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.ActivationLayerImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getActivationLayer()
	 * @generated
	 */
	int ACTIVATION_LAYER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_LAYER__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_LAYER__NEXT = MODULE__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_LAYER__PREV = MODULE__PREV;

	/**
	 * The number of structural features of the '<em>Activation Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_LAYER_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activation Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_LAYER_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.LinearLayerImpl <em>Linear Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.LinearLayerImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getLinearLayer()
	 * @generated
	 */
	int LINEAR_LAYER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYER__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYER__NEXT = MODULE__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYER__PREV = MODULE__PREV;

	/**
	 * The number of structural features of the '<em>Linear Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYER_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linear Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYER_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.IdentityImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NAME = LINEAR_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NEXT = LINEAR_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__PREV = LINEAR_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = LINEAR_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_OPERATION_COUNT = LINEAR_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.LinearImpl <em>Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.LinearImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getLinear()
	 * @generated
	 */
	int LINEAR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__NAME = LINEAR_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__NEXT = LINEAR_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__PREV = LINEAR_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_FEATURE_COUNT = LINEAR_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_OPERATION_COUNT = LINEAR_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.BilinearImpl <em>Bilinear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.BilinearImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getBilinear()
	 * @generated
	 */
	int BILINEAR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILINEAR__NAME = LINEAR_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILINEAR__NEXT = LINEAR_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILINEAR__PREV = LINEAR_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Bilinear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILINEAR_FEATURE_COUNT = LINEAR_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bilinear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILINEAR_OPERATION_COUNT = LINEAR_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.Conv1dImpl <em>Conv1d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.Conv1dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getConv1d()
	 * @generated
	 */
	int CONV1D = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1D__NAME = CONV_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1D__NEXT = CONV_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1D__PREV = CONV_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Conv1d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1D_FEATURE_COUNT = CONV_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conv1d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1D_OPERATION_COUNT = CONV_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.Conv2dImpl <em>Conv2d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.Conv2dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getConv2d()
	 * @generated
	 */
	int CONV2D = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV2D__NAME = CONV_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV2D__NEXT = CONV_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV2D__PREV = CONV_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Conv2d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV2D_FEATURE_COUNT = CONV_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conv2d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV2D_OPERATION_COUNT = CONV_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.Conv3dImpl <em>Conv3d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.Conv3dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getConv3d()
	 * @generated
	 */
	int CONV3D = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV3D__NAME = CONV_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV3D__NEXT = CONV_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV3D__PREV = CONV_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Conv3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV3D_FEATURE_COUNT = CONV_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conv3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV3D_OPERATION_COUNT = CONV_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.MaxPool1dImpl <em>Max Pool1d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.MaxPool1dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPool1d()
	 * @generated
	 */
	int MAX_POOL1D = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL1D__NAME = MAX_POOL_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL1D__NEXT = MAX_POOL_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL1D__PREV = MAX_POOL_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Max Pool1d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL1D_FEATURE_COUNT = MAX_POOL_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max Pool1d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL1D_OPERATION_COUNT = MAX_POOL_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.MaxPool2dImpl <em>Max Pool2d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.MaxPool2dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPool2d()
	 * @generated
	 */
	int MAX_POOL2D = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL2D__NAME = MAX_POOL_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL2D__NEXT = MAX_POOL_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL2D__PREV = MAX_POOL_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Max Pool2d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL2D_FEATURE_COUNT = MAX_POOL_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max Pool2d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL2D_OPERATION_COUNT = MAX_POOL_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.MaxPool3dImpl <em>Max Pool3d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.MaxPool3dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPool3d()
	 * @generated
	 */
	int MAX_POOL3D = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL3D__NAME = MAX_POOL_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL3D__NEXT = MAX_POOL_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL3D__PREV = MAX_POOL_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Max Pool3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL3D_FEATURE_COUNT = MAX_POOL_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max Pool3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_POOL3D_OPERATION_COUNT = MAX_POOL_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.AvgPool1dImpl <em>Avg Pool1d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.AvgPool1dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPool1d()
	 * @generated
	 */
	int AVG_POOL1D = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL1D__NAME = AVG_POOL_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL1D__NEXT = AVG_POOL_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL1D__PREV = AVG_POOL_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Avg Pool1d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL1D_FEATURE_COUNT = AVG_POOL_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avg Pool1d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL1D_OPERATION_COUNT = AVG_POOL_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.AvgPool2dImpl <em>Avg Pool2d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.AvgPool2dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPool2d()
	 * @generated
	 */
	int AVG_POOL2D = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL2D__NAME = AVG_POOL_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL2D__NEXT = AVG_POOL_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL2D__PREV = AVG_POOL_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Avg Pool2d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL2D_FEATURE_COUNT = AVG_POOL_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avg Pool2d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL2D_OPERATION_COUNT = AVG_POOL_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.AvgPool3dImpl <em>Avg Pool3d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.AvgPool3dImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPool3d()
	 * @generated
	 */
	int AVG_POOL3D = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL3D__NAME = AVG_POOL_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL3D__NEXT = AVG_POOL_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL3D__PREV = AVG_POOL_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Avg Pool3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL3D_FEATURE_COUNT = AVG_POOL_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avg Pool3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_POOL3D_OPERATION_COUNT = AVG_POOL_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.SigmoidImpl <em>Sigmoid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.SigmoidImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getSigmoid()
	 * @generated
	 */
	int SIGMOID = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMOID__NAME = ACTIVATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMOID__NEXT = ACTIVATION_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMOID__PREV = ACTIVATION_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Sigmoid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMOID_FEATURE_COUNT = ACTIVATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sigmoid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMOID_OPERATION_COUNT = ACTIVATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.ReLUImpl <em>Re LU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.ReLUImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getReLU()
	 * @generated
	 */
	int RE_LU = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_LU__NAME = ACTIVATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_LU__NEXT = ACTIVATION_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_LU__PREV = ACTIVATION_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Re LU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_LU_FEATURE_COUNT = ACTIVATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Re LU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_LU_OPERATION_COUNT = ACTIVATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.LeakyReLUImpl <em>Leaky Re LU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.LeakyReLUImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getLeakyReLU()
	 * @generated
	 */
	int LEAKY_RE_LU = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAKY_RE_LU__NAME = ACTIVATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAKY_RE_LU__NEXT = ACTIVATION_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAKY_RE_LU__PREV = ACTIVATION_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Leaky Re LU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAKY_RE_LU_FEATURE_COUNT = ACTIVATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaky Re LU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAKY_RE_LU_OPERATION_COUNT = ACTIVATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ooad.pytorch.impl.SoftmaxImpl <em>Softmax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ooad.pytorch.impl.SoftmaxImpl
	 * @see ooad.pytorch.impl.PytorchPackageImpl#getSoftmax()
	 * @generated
	 */
	int SOFTMAX = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTMAX__NAME = ACTIVATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTMAX__NEXT = ACTIVATION_LAYER__NEXT;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTMAX__PREV = ACTIVATION_LAYER__PREV;

	/**
	 * The number of structural features of the '<em>Softmax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTMAX_FEATURE_COUNT = ACTIVATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Softmax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTMAX_OPERATION_COUNT = ACTIVATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.NeuralNetwork <em>Neural Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neural Network</em>'.
	 * @see ooad.pytorch.NeuralNetwork
	 * @generated
	 */
	EClass getNeuralNetwork();

	/**
	 * Returns the meta object for the attribute '{@link ooad.pytorch.NeuralNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ooad.pytorch.NeuralNetwork#getName()
	 * @see #getNeuralNetwork()
	 * @generated
	 */
	EAttribute getNeuralNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ooad.pytorch.NeuralNetwork#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see ooad.pytorch.NeuralNetwork#getModules()
	 * @see #getNeuralNetwork()
	 * @generated
	 */
	EReference getNeuralNetwork_Modules();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see ooad.pytorch.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link ooad.pytorch.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ooad.pytorch.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the reference list '{@link ooad.pytorch.Module#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see ooad.pytorch.Module#getNext()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Next();

	/**
	 * Returns the meta object for the reference list '{@link ooad.pytorch.Module#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prev</em>'.
	 * @see ooad.pytorch.Module#getPrev()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Prev();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.ConvLayer <em>Conv Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conv Layer</em>'.
	 * @see ooad.pytorch.ConvLayer
	 * @generated
	 */
	EClass getConvLayer();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.MaxPoolLayer <em>Max Pool Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Pool Layer</em>'.
	 * @see ooad.pytorch.MaxPoolLayer
	 * @generated
	 */
	EClass getMaxPoolLayer();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.AvgPoolLayer <em>Avg Pool Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avg Pool Layer</em>'.
	 * @see ooad.pytorch.AvgPoolLayer
	 * @generated
	 */
	EClass getAvgPoolLayer();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.ActivationLayer <em>Activation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Layer</em>'.
	 * @see ooad.pytorch.ActivationLayer
	 * @generated
	 */
	EClass getActivationLayer();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.LinearLayer <em>Linear Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Layer</em>'.
	 * @see ooad.pytorch.LinearLayer
	 * @generated
	 */
	EClass getLinearLayer();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see ooad.pytorch.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Linear <em>Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear</em>'.
	 * @see ooad.pytorch.Linear
	 * @generated
	 */
	EClass getLinear();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Bilinear <em>Bilinear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bilinear</em>'.
	 * @see ooad.pytorch.Bilinear
	 * @generated
	 */
	EClass getBilinear();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Conv1d <em>Conv1d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conv1d</em>'.
	 * @see ooad.pytorch.Conv1d
	 * @generated
	 */
	EClass getConv1d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Conv2d <em>Conv2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conv2d</em>'.
	 * @see ooad.pytorch.Conv2d
	 * @generated
	 */
	EClass getConv2d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Conv3d <em>Conv3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conv3d</em>'.
	 * @see ooad.pytorch.Conv3d
	 * @generated
	 */
	EClass getConv3d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.MaxPool1d <em>Max Pool1d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Pool1d</em>'.
	 * @see ooad.pytorch.MaxPool1d
	 * @generated
	 */
	EClass getMaxPool1d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.MaxPool2d <em>Max Pool2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Pool2d</em>'.
	 * @see ooad.pytorch.MaxPool2d
	 * @generated
	 */
	EClass getMaxPool2d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.MaxPool3d <em>Max Pool3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Pool3d</em>'.
	 * @see ooad.pytorch.MaxPool3d
	 * @generated
	 */
	EClass getMaxPool3d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.AvgPool1d <em>Avg Pool1d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avg Pool1d</em>'.
	 * @see ooad.pytorch.AvgPool1d
	 * @generated
	 */
	EClass getAvgPool1d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.AvgPool2d <em>Avg Pool2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avg Pool2d</em>'.
	 * @see ooad.pytorch.AvgPool2d
	 * @generated
	 */
	EClass getAvgPool2d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.AvgPool3d <em>Avg Pool3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avg Pool3d</em>'.
	 * @see ooad.pytorch.AvgPool3d
	 * @generated
	 */
	EClass getAvgPool3d();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Sigmoid <em>Sigmoid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sigmoid</em>'.
	 * @see ooad.pytorch.Sigmoid
	 * @generated
	 */
	EClass getSigmoid();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.ReLU <em>Re LU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re LU</em>'.
	 * @see ooad.pytorch.ReLU
	 * @generated
	 */
	EClass getReLU();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.LeakyReLU <em>Leaky Re LU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaky Re LU</em>'.
	 * @see ooad.pytorch.LeakyReLU
	 * @generated
	 */
	EClass getLeakyReLU();

	/**
	 * Returns the meta object for class '{@link ooad.pytorch.Softmax <em>Softmax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softmax</em>'.
	 * @see ooad.pytorch.Softmax
	 * @generated
	 */
	EClass getSoftmax();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PytorchFactory getPytorchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.NeuralNetworkImpl <em>Neural Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.NeuralNetworkImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getNeuralNetwork()
		 * @generated
		 */
		EClass NEURAL_NETWORK = eINSTANCE.getNeuralNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEURAL_NETWORK__NAME = eINSTANCE.getNeuralNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEURAL_NETWORK__MODULES = eINSTANCE.getNeuralNetwork_Modules();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.ModuleImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__NEXT = eINSTANCE.getModule_Next();

		/**
		 * The meta object literal for the '<em><b>Prev</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PREV = eINSTANCE.getModule_Prev();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.ConvLayerImpl <em>Conv Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.ConvLayerImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getConvLayer()
		 * @generated
		 */
		EClass CONV_LAYER = eINSTANCE.getConvLayer();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.MaxPoolLayerImpl <em>Max Pool Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.MaxPoolLayerImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPoolLayer()
		 * @generated
		 */
		EClass MAX_POOL_LAYER = eINSTANCE.getMaxPoolLayer();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.AvgPoolLayerImpl <em>Avg Pool Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.AvgPoolLayerImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPoolLayer()
		 * @generated
		 */
		EClass AVG_POOL_LAYER = eINSTANCE.getAvgPoolLayer();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.ActivationLayerImpl <em>Activation Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.ActivationLayerImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getActivationLayer()
		 * @generated
		 */
		EClass ACTIVATION_LAYER = eINSTANCE.getActivationLayer();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.LinearLayerImpl <em>Linear Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.LinearLayerImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getLinearLayer()
		 * @generated
		 */
		EClass LINEAR_LAYER = eINSTANCE.getLinearLayer();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.IdentityImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.LinearImpl <em>Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.LinearImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getLinear()
		 * @generated
		 */
		EClass LINEAR = eINSTANCE.getLinear();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.BilinearImpl <em>Bilinear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.BilinearImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getBilinear()
		 * @generated
		 */
		EClass BILINEAR = eINSTANCE.getBilinear();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.Conv1dImpl <em>Conv1d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.Conv1dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getConv1d()
		 * @generated
		 */
		EClass CONV1D = eINSTANCE.getConv1d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.Conv2dImpl <em>Conv2d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.Conv2dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getConv2d()
		 * @generated
		 */
		EClass CONV2D = eINSTANCE.getConv2d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.Conv3dImpl <em>Conv3d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.Conv3dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getConv3d()
		 * @generated
		 */
		EClass CONV3D = eINSTANCE.getConv3d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.MaxPool1dImpl <em>Max Pool1d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.MaxPool1dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPool1d()
		 * @generated
		 */
		EClass MAX_POOL1D = eINSTANCE.getMaxPool1d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.MaxPool2dImpl <em>Max Pool2d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.MaxPool2dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPool2d()
		 * @generated
		 */
		EClass MAX_POOL2D = eINSTANCE.getMaxPool2d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.MaxPool3dImpl <em>Max Pool3d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.MaxPool3dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getMaxPool3d()
		 * @generated
		 */
		EClass MAX_POOL3D = eINSTANCE.getMaxPool3d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.AvgPool1dImpl <em>Avg Pool1d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.AvgPool1dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPool1d()
		 * @generated
		 */
		EClass AVG_POOL1D = eINSTANCE.getAvgPool1d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.AvgPool2dImpl <em>Avg Pool2d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.AvgPool2dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPool2d()
		 * @generated
		 */
		EClass AVG_POOL2D = eINSTANCE.getAvgPool2d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.AvgPool3dImpl <em>Avg Pool3d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.AvgPool3dImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getAvgPool3d()
		 * @generated
		 */
		EClass AVG_POOL3D = eINSTANCE.getAvgPool3d();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.SigmoidImpl <em>Sigmoid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.SigmoidImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getSigmoid()
		 * @generated
		 */
		EClass SIGMOID = eINSTANCE.getSigmoid();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.ReLUImpl <em>Re LU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.ReLUImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getReLU()
		 * @generated
		 */
		EClass RE_LU = eINSTANCE.getReLU();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.LeakyReLUImpl <em>Leaky Re LU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.LeakyReLUImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getLeakyReLU()
		 * @generated
		 */
		EClass LEAKY_RE_LU = eINSTANCE.getLeakyReLU();

		/**
		 * The meta object literal for the '{@link ooad.pytorch.impl.SoftmaxImpl <em>Softmax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ooad.pytorch.impl.SoftmaxImpl
		 * @see ooad.pytorch.impl.PytorchPackageImpl#getSoftmax()
		 * @generated
		 */
		EClass SOFTMAX = eINSTANCE.getSoftmax();

	}

} //PytorchPackage
