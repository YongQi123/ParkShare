/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.Scenario#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends DynamicUsage {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link sPTP.ActionExecution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see sPTP.SPTPPackage#getScenario_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionExecution> getStep();

} // Scenario
