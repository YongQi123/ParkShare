/**
 */
package ooad.pytorch.impl;

import ooad.pytorch.AvgPool1d;
import ooad.pytorch.AvgPool2d;
import ooad.pytorch.AvgPool3d;
import ooad.pytorch.Bilinear;
import ooad.pytorch.Conv1d;
import ooad.pytorch.Conv2d;
import ooad.pytorch.Conv3d;
import ooad.pytorch.Identity;
import ooad.pytorch.LeakyReLU;
import ooad.pytorch.Linear;
import ooad.pytorch.MaxPool1d;
import ooad.pytorch.MaxPool2d;
import ooad.pytorch.MaxPool3d;
import ooad.pytorch.NeuralNetwork;
import ooad.pytorch.PytorchFactory;
import ooad.pytorch.PytorchPackage;
import ooad.pytorch.ReLU;
import ooad.pytorch.Sigmoid;
import ooad.pytorch.Softmax;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PytorchFactoryImpl extends EFactoryImpl implements PytorchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PytorchFactory init() {
		try {
			PytorchFactory thePytorchFactory = (PytorchFactory) EPackage.Registry.INSTANCE
					.getEFactory(PytorchPackage.eNS_URI);
			if (thePytorchFactory != null) {
				return thePytorchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PytorchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PytorchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PytorchPackage.NEURAL_NETWORK:
			return createNeuralNetwork();
		case PytorchPackage.IDENTITY:
			return createIdentity();
		case PytorchPackage.LINEAR:
			return createLinear();
		case PytorchPackage.BILINEAR:
			return createBilinear();
		case PytorchPackage.CONV1D:
			return createConv1d();
		case PytorchPackage.CONV2D:
			return createConv2d();
		case PytorchPackage.CONV3D:
			return createConv3d();
		case PytorchPackage.MAX_POOL1D:
			return createMaxPool1d();
		case PytorchPackage.MAX_POOL2D:
			return createMaxPool2d();
		case PytorchPackage.MAX_POOL3D:
			return createMaxPool3d();
		case PytorchPackage.AVG_POOL1D:
			return createAvgPool1d();
		case PytorchPackage.AVG_POOL2D:
			return createAvgPool2d();
		case PytorchPackage.AVG_POOL3D:
			return createAvgPool3d();
		case PytorchPackage.SIGMOID:
			return createSigmoid();
		case PytorchPackage.RE_LU:
			return createReLU();
		case PytorchPackage.LEAKY_RE_LU:
			return createLeakyReLU();
		case PytorchPackage.SOFTMAX:
			return createSoftmax();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeuralNetwork createNeuralNetwork() {
		NeuralNetworkImpl neuralNetwork = new NeuralNetworkImpl();
		return neuralNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity createIdentity() {
		IdentityImpl identity = new IdentityImpl();
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linear createLinear() {
		LinearImpl linear = new LinearImpl();
		return linear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bilinear createBilinear() {
		BilinearImpl bilinear = new BilinearImpl();
		return bilinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conv1d createConv1d() {
		Conv1dImpl conv1d = new Conv1dImpl();
		return conv1d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conv2d createConv2d() {
		Conv2dImpl conv2d = new Conv2dImpl();
		return conv2d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conv3d createConv3d() {
		Conv3dImpl conv3d = new Conv3dImpl();
		return conv3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxPool1d createMaxPool1d() {
		MaxPool1dImpl maxPool1d = new MaxPool1dImpl();
		return maxPool1d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxPool2d createMaxPool2d() {
		MaxPool2dImpl maxPool2d = new MaxPool2dImpl();
		return maxPool2d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxPool3d createMaxPool3d() {
		MaxPool3dImpl maxPool3d = new MaxPool3dImpl();
		return maxPool3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvgPool1d createAvgPool1d() {
		AvgPool1dImpl avgPool1d = new AvgPool1dImpl();
		return avgPool1d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvgPool2d createAvgPool2d() {
		AvgPool2dImpl avgPool2d = new AvgPool2dImpl();
		return avgPool2d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvgPool3d createAvgPool3d() {
		AvgPool3dImpl avgPool3d = new AvgPool3dImpl();
		return avgPool3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sigmoid createSigmoid() {
		SigmoidImpl sigmoid = new SigmoidImpl();
		return sigmoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReLU createReLU() {
		ReLUImpl reLU = new ReLUImpl();
		return reLU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeakyReLU createLeakyReLU() {
		LeakyReLUImpl leakyReLU = new LeakyReLUImpl();
		return leakyReLU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softmax createSoftmax() {
		SoftmaxImpl softmax = new SoftmaxImpl();
		return softmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PytorchPackage getPytorchPackage() {
		return (PytorchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PytorchPackage getPackage() {
		return PytorchPackage.eINSTANCE;
	}

} //PytorchFactoryImpl
