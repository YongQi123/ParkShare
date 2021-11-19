/**
 */
package ooad.pytorch.util;

import ooad.pytorch.ActivationLayer;
import ooad.pytorch.AvgPool1d;
import ooad.pytorch.AvgPool2d;
import ooad.pytorch.AvgPool3d;
import ooad.pytorch.AvgPoolLayer;
import ooad.pytorch.Bilinear;
import ooad.pytorch.Conv1d;
import ooad.pytorch.Conv2d;
import ooad.pytorch.Conv3d;
import ooad.pytorch.ConvLayer;
import ooad.pytorch.Identity;
import ooad.pytorch.LeakyReLU;
import ooad.pytorch.Linear;
import ooad.pytorch.LinearLayer;
import ooad.pytorch.MaxPool1d;
import ooad.pytorch.MaxPool2d;
import ooad.pytorch.MaxPool3d;
import ooad.pytorch.MaxPoolLayer;
import ooad.pytorch.NeuralNetwork;
import ooad.pytorch.PytorchPackage;
import ooad.pytorch.ReLU;
import ooad.pytorch.Sigmoid;
import ooad.pytorch.Softmax;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ooad.pytorch.PytorchPackage
 * @generated
 */
public class PytorchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PytorchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PytorchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PytorchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PytorchSwitch<Adapter> modelSwitch = new PytorchSwitch<Adapter>() {
		@Override
		public Adapter caseNeuralNetwork(NeuralNetwork object) {
			return createNeuralNetworkAdapter();
		}

		@Override
		public Adapter caseModule(ooad.pytorch.Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter caseConvLayer(ConvLayer object) {
			return createConvLayerAdapter();
		}

		@Override
		public Adapter caseMaxPoolLayer(MaxPoolLayer object) {
			return createMaxPoolLayerAdapter();
		}

		@Override
		public Adapter caseAvgPoolLayer(AvgPoolLayer object) {
			return createAvgPoolLayerAdapter();
		}

		@Override
		public Adapter caseActivationLayer(ActivationLayer object) {
			return createActivationLayerAdapter();
		}

		@Override
		public Adapter caseLinearLayer(LinearLayer object) {
			return createLinearLayerAdapter();
		}

		@Override
		public Adapter caseIdentity(Identity object) {
			return createIdentityAdapter();
		}

		@Override
		public Adapter caseLinear(Linear object) {
			return createLinearAdapter();
		}

		@Override
		public Adapter caseBilinear(Bilinear object) {
			return createBilinearAdapter();
		}

		@Override
		public Adapter caseConv1d(Conv1d object) {
			return createConv1dAdapter();
		}

		@Override
		public Adapter caseConv2d(Conv2d object) {
			return createConv2dAdapter();
		}

		@Override
		public Adapter caseConv3d(Conv3d object) {
			return createConv3dAdapter();
		}

		@Override
		public Adapter caseMaxPool1d(MaxPool1d object) {
			return createMaxPool1dAdapter();
		}

		@Override
		public Adapter caseMaxPool2d(MaxPool2d object) {
			return createMaxPool2dAdapter();
		}

		@Override
		public Adapter caseMaxPool3d(MaxPool3d object) {
			return createMaxPool3dAdapter();
		}

		@Override
		public Adapter caseAvgPool1d(AvgPool1d object) {
			return createAvgPool1dAdapter();
		}

		@Override
		public Adapter caseAvgPool2d(AvgPool2d object) {
			return createAvgPool2dAdapter();
		}

		@Override
		public Adapter caseAvgPool3d(AvgPool3d object) {
			return createAvgPool3dAdapter();
		}

		@Override
		public Adapter caseSigmoid(Sigmoid object) {
			return createSigmoidAdapter();
		}

		@Override
		public Adapter caseReLU(ReLU object) {
			return createReLUAdapter();
		}

		@Override
		public Adapter caseLeakyReLU(LeakyReLU object) {
			return createLeakyReLUAdapter();
		}

		@Override
		public Adapter caseSoftmax(Softmax object) {
			return createSoftmaxAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.NeuralNetwork <em>Neural Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.NeuralNetwork
	 * @generated
	 */
	public Adapter createNeuralNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.ConvLayer <em>Conv Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.ConvLayer
	 * @generated
	 */
	public Adapter createConvLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.MaxPoolLayer <em>Max Pool Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.MaxPoolLayer
	 * @generated
	 */
	public Adapter createMaxPoolLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.AvgPoolLayer <em>Avg Pool Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.AvgPoolLayer
	 * @generated
	 */
	public Adapter createAvgPoolLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.ActivationLayer <em>Activation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.ActivationLayer
	 * @generated
	 */
	public Adapter createActivationLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.LinearLayer <em>Linear Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.LinearLayer
	 * @generated
	 */
	public Adapter createLinearLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Linear <em>Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Linear
	 * @generated
	 */
	public Adapter createLinearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Bilinear <em>Bilinear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Bilinear
	 * @generated
	 */
	public Adapter createBilinearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Conv1d <em>Conv1d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Conv1d
	 * @generated
	 */
	public Adapter createConv1dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Conv2d <em>Conv2d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Conv2d
	 * @generated
	 */
	public Adapter createConv2dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Conv3d <em>Conv3d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Conv3d
	 * @generated
	 */
	public Adapter createConv3dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.MaxPool1d <em>Max Pool1d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.MaxPool1d
	 * @generated
	 */
	public Adapter createMaxPool1dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.MaxPool2d <em>Max Pool2d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.MaxPool2d
	 * @generated
	 */
	public Adapter createMaxPool2dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.MaxPool3d <em>Max Pool3d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.MaxPool3d
	 * @generated
	 */
	public Adapter createMaxPool3dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.AvgPool1d <em>Avg Pool1d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.AvgPool1d
	 * @generated
	 */
	public Adapter createAvgPool1dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.AvgPool2d <em>Avg Pool2d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.AvgPool2d
	 * @generated
	 */
	public Adapter createAvgPool2dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.AvgPool3d <em>Avg Pool3d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.AvgPool3d
	 * @generated
	 */
	public Adapter createAvgPool3dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Sigmoid <em>Sigmoid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Sigmoid
	 * @generated
	 */
	public Adapter createSigmoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.ReLU <em>Re LU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.ReLU
	 * @generated
	 */
	public Adapter createReLUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.LeakyReLU <em>Leaky Re LU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.LeakyReLU
	 * @generated
	 */
	public Adapter createLeakyReLUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ooad.pytorch.Softmax <em>Softmax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ooad.pytorch.Softmax
	 * @generated
	 */
	public Adapter createSoftmaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PytorchAdapterFactory
