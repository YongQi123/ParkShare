/**
 */
package ooad.pytorch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ooad.pytorch.PytorchPackage
 * @generated
 */
public interface PytorchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PytorchFactory eINSTANCE = ooad.pytorch.impl.PytorchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Neural Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neural Network</em>'.
	 * @generated
	 */
	NeuralNetwork createNeuralNetwork();

	/**
	 * Returns a new object of class '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity</em>'.
	 * @generated
	 */
	Identity createIdentity();

	/**
	 * Returns a new object of class '<em>Linear</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear</em>'.
	 * @generated
	 */
	Linear createLinear();

	/**
	 * Returns a new object of class '<em>Bilinear</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bilinear</em>'.
	 * @generated
	 */
	Bilinear createBilinear();

	/**
	 * Returns a new object of class '<em>Conv1d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conv1d</em>'.
	 * @generated
	 */
	Conv1d createConv1d();

	/**
	 * Returns a new object of class '<em>Conv2d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conv2d</em>'.
	 * @generated
	 */
	Conv2d createConv2d();

	/**
	 * Returns a new object of class '<em>Conv3d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conv3d</em>'.
	 * @generated
	 */
	Conv3d createConv3d();

	/**
	 * Returns a new object of class '<em>Max Pool1d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Pool1d</em>'.
	 * @generated
	 */
	MaxPool1d createMaxPool1d();

	/**
	 * Returns a new object of class '<em>Max Pool2d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Pool2d</em>'.
	 * @generated
	 */
	MaxPool2d createMaxPool2d();

	/**
	 * Returns a new object of class '<em>Max Pool3d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Pool3d</em>'.
	 * @generated
	 */
	MaxPool3d createMaxPool3d();

	/**
	 * Returns a new object of class '<em>Avg Pool1d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avg Pool1d</em>'.
	 * @generated
	 */
	AvgPool1d createAvgPool1d();

	/**
	 * Returns a new object of class '<em>Avg Pool2d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avg Pool2d</em>'.
	 * @generated
	 */
	AvgPool2d createAvgPool2d();

	/**
	 * Returns a new object of class '<em>Avg Pool3d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avg Pool3d</em>'.
	 * @generated
	 */
	AvgPool3d createAvgPool3d();

	/**
	 * Returns a new object of class '<em>Sigmoid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sigmoid</em>'.
	 * @generated
	 */
	Sigmoid createSigmoid();

	/**
	 * Returns a new object of class '<em>Re LU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Re LU</em>'.
	 * @generated
	 */
	ReLU createReLU();

	/**
	 * Returns a new object of class '<em>Leaky Re LU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaky Re LU</em>'.
	 * @generated
	 */
	LeakyReLU createLeakyReLU();

	/**
	 * Returns a new object of class '<em>Softmax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Softmax</em>'.
	 * @generated
	 */
	Softmax createSoftmax();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PytorchPackage getPytorchPackage();

} //PytorchFactory
