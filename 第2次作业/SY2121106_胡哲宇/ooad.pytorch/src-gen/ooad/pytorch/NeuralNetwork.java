/**
 */
package ooad.pytorch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neural Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ooad.pytorch.NeuralNetwork#getName <em>Name</em>}</li>
 *   <li>{@link ooad.pytorch.NeuralNetwork#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see ooad.pytorch.PytorchPackage#getNeuralNetwork()
 * @model
 * @generated
 */
public interface NeuralNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ooad.pytorch.PytorchPackage#getNeuralNetwork_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ooad.pytorch.NeuralNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link ooad.pytorch.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see ooad.pytorch.PytorchPackage#getNeuralNetwork_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ooad.pytorch.Module> getModules();

} // NeuralNetwork
