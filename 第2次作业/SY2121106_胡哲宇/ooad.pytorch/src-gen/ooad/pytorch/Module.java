/**
 */
package ooad.pytorch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ooad.pytorch.Module#getName <em>Name</em>}</li>
 *   <li>{@link ooad.pytorch.Module#getNext <em>Next</em>}</li>
 *   <li>{@link ooad.pytorch.Module#getPrev <em>Prev</em>}</li>
 * </ul>
 *
 * @see ooad.pytorch.PytorchPackage#getModule()
 * @model abstract="true"
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ooad.pytorch.PytorchPackage#getModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ooad.pytorch.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link ooad.pytorch.Module}.
	 * It is bidirectional and its opposite is '{@link ooad.pytorch.Module#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see ooad.pytorch.PytorchPackage#getModule_Next()
	 * @see ooad.pytorch.Module#getPrev
	 * @model opposite="prev"
	 * @generated
	 */
	EList<Module> getNext();

	/**
	 * Returns the value of the '<em><b>Prev</b></em>' reference list.
	 * The list contents are of type {@link ooad.pytorch.Module}.
	 * It is bidirectional and its opposite is '{@link ooad.pytorch.Module#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev</em>' reference list.
	 * @see ooad.pytorch.PytorchPackage#getModule_Prev()
	 * @see ooad.pytorch.Module#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<Module> getPrev();

} // Module
