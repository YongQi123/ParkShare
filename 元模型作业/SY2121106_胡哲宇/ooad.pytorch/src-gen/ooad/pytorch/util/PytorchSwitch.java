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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ooad.pytorch.PytorchPackage
 * @generated
 */
public class PytorchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PytorchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PytorchSwitch() {
		if (modelPackage == null) {
			modelPackage = PytorchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PytorchPackage.NEURAL_NETWORK: {
			NeuralNetwork neuralNetwork = (NeuralNetwork) theEObject;
			T result = caseNeuralNetwork(neuralNetwork);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.MODULE: {
			ooad.pytorch.Module module = (ooad.pytorch.Module) theEObject;
			T result = caseModule(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.CONV_LAYER: {
			ConvLayer convLayer = (ConvLayer) theEObject;
			T result = caseConvLayer(convLayer);
			if (result == null)
				result = caseModule(convLayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.MAX_POOL_LAYER: {
			MaxPoolLayer maxPoolLayer = (MaxPoolLayer) theEObject;
			T result = caseMaxPoolLayer(maxPoolLayer);
			if (result == null)
				result = caseModule(maxPoolLayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.AVG_POOL_LAYER: {
			AvgPoolLayer avgPoolLayer = (AvgPoolLayer) theEObject;
			T result = caseAvgPoolLayer(avgPoolLayer);
			if (result == null)
				result = caseModule(avgPoolLayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.ACTIVATION_LAYER: {
			ActivationLayer activationLayer = (ActivationLayer) theEObject;
			T result = caseActivationLayer(activationLayer);
			if (result == null)
				result = caseModule(activationLayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.LINEAR_LAYER: {
			LinearLayer linearLayer = (LinearLayer) theEObject;
			T result = caseLinearLayer(linearLayer);
			if (result == null)
				result = caseModule(linearLayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.IDENTITY: {
			Identity identity = (Identity) theEObject;
			T result = caseIdentity(identity);
			if (result == null)
				result = caseLinearLayer(identity);
			if (result == null)
				result = caseModule(identity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.LINEAR: {
			Linear linear = (Linear) theEObject;
			T result = caseLinear(linear);
			if (result == null)
				result = caseLinearLayer(linear);
			if (result == null)
				result = caseModule(linear);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.BILINEAR: {
			Bilinear bilinear = (Bilinear) theEObject;
			T result = caseBilinear(bilinear);
			if (result == null)
				result = caseLinearLayer(bilinear);
			if (result == null)
				result = caseModule(bilinear);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.CONV1D: {
			Conv1d conv1d = (Conv1d) theEObject;
			T result = caseConv1d(conv1d);
			if (result == null)
				result = caseConvLayer(conv1d);
			if (result == null)
				result = caseModule(conv1d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.CONV2D: {
			Conv2d conv2d = (Conv2d) theEObject;
			T result = caseConv2d(conv2d);
			if (result == null)
				result = caseConvLayer(conv2d);
			if (result == null)
				result = caseModule(conv2d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.CONV3D: {
			Conv3d conv3d = (Conv3d) theEObject;
			T result = caseConv3d(conv3d);
			if (result == null)
				result = caseConvLayer(conv3d);
			if (result == null)
				result = caseModule(conv3d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.MAX_POOL1D: {
			MaxPool1d maxPool1d = (MaxPool1d) theEObject;
			T result = caseMaxPool1d(maxPool1d);
			if (result == null)
				result = caseMaxPoolLayer(maxPool1d);
			if (result == null)
				result = caseModule(maxPool1d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.MAX_POOL2D: {
			MaxPool2d maxPool2d = (MaxPool2d) theEObject;
			T result = caseMaxPool2d(maxPool2d);
			if (result == null)
				result = caseMaxPoolLayer(maxPool2d);
			if (result == null)
				result = caseModule(maxPool2d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.MAX_POOL3D: {
			MaxPool3d maxPool3d = (MaxPool3d) theEObject;
			T result = caseMaxPool3d(maxPool3d);
			if (result == null)
				result = caseMaxPoolLayer(maxPool3d);
			if (result == null)
				result = caseModule(maxPool3d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.AVG_POOL1D: {
			AvgPool1d avgPool1d = (AvgPool1d) theEObject;
			T result = caseAvgPool1d(avgPool1d);
			if (result == null)
				result = caseAvgPoolLayer(avgPool1d);
			if (result == null)
				result = caseModule(avgPool1d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.AVG_POOL2D: {
			AvgPool2d avgPool2d = (AvgPool2d) theEObject;
			T result = caseAvgPool2d(avgPool2d);
			if (result == null)
				result = caseAvgPoolLayer(avgPool2d);
			if (result == null)
				result = caseModule(avgPool2d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.AVG_POOL3D: {
			AvgPool3d avgPool3d = (AvgPool3d) theEObject;
			T result = caseAvgPool3d(avgPool3d);
			if (result == null)
				result = caseAvgPoolLayer(avgPool3d);
			if (result == null)
				result = caseModule(avgPool3d);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.SIGMOID: {
			Sigmoid sigmoid = (Sigmoid) theEObject;
			T result = caseSigmoid(sigmoid);
			if (result == null)
				result = caseActivationLayer(sigmoid);
			if (result == null)
				result = caseModule(sigmoid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.RE_LU: {
			ReLU reLU = (ReLU) theEObject;
			T result = caseReLU(reLU);
			if (result == null)
				result = caseActivationLayer(reLU);
			if (result == null)
				result = caseModule(reLU);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.LEAKY_RE_LU: {
			LeakyReLU leakyReLU = (LeakyReLU) theEObject;
			T result = caseLeakyReLU(leakyReLU);
			if (result == null)
				result = caseActivationLayer(leakyReLU);
			if (result == null)
				result = caseModule(leakyReLU);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PytorchPackage.SOFTMAX: {
			Softmax softmax = (Softmax) theEObject;
			T result = caseSoftmax(softmax);
			if (result == null)
				result = caseActivationLayer(softmax);
			if (result == null)
				result = caseModule(softmax);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neural Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neural Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeuralNetwork(NeuralNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(ooad.pytorch.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conv Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conv Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvLayer(ConvLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Pool Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Pool Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxPoolLayer(MaxPoolLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avg Pool Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avg Pool Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvgPoolLayer(AvgPoolLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationLayer(ActivationLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearLayer(LinearLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentity(Identity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinear(Linear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bilinear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bilinear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBilinear(Bilinear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conv1d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conv1d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConv1d(Conv1d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conv2d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conv2d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConv2d(Conv2d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conv3d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conv3d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConv3d(Conv3d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Pool1d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Pool1d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxPool1d(MaxPool1d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Pool2d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Pool2d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxPool2d(MaxPool2d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Pool3d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Pool3d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxPool3d(MaxPool3d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avg Pool1d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avg Pool1d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvgPool1d(AvgPool1d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avg Pool2d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avg Pool2d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvgPool2d(AvgPool2d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avg Pool3d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avg Pool3d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvgPool3d(AvgPool3d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sigmoid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sigmoid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSigmoid(Sigmoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Re LU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Re LU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReLU(ReLU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaky Re LU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaky Re LU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeakyReLU(LeakyReLU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Softmax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Softmax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftmax(Softmax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PytorchSwitch
