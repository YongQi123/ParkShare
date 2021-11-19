/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.ActionExecution#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link sPTP.ActionExecution#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getActionExecution()
 * @model
 * @generated
 */
public interface ActionExecution extends Scenario {
	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference list.
	 * The list contents are of type {@link sPTP.ActionExecution}.
	 * It is bidirectional and its opposite is '{@link sPTP.ActionExecution#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference list.
	 * @see sPTP.SPTPPackage#getActionExecution_Predecessor()
	 * @see sPTP.ActionExecution#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<ActionExecution> getPredecessor();

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference list.
	 * The list contents are of type {@link sPTP.ActionExecution}.
	 * It is bidirectional and its opposite is '{@link sPTP.ActionExecution#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference list.
	 * @see sPTP.SPTPPackage#getActionExecution_Successor()
	 * @see sPTP.ActionExecution#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<ActionExecution> getSuccessor();

} // ActionExecution
