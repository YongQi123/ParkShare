/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.ResourceInstance#getResourceserviceinstance <em>Resourceserviceinstance</em>}</li>
 *   <li>{@link sPTP.ResourceInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getResourceInstance()
 * @model
 * @generated
 */
public interface ResourceInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Resourceserviceinstance</b></em>' containment reference list.
	 * The list contents are of type {@link sPTP.ResourceServiceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceserviceinstance</em>' containment reference list.
	 * @see sPTP.SPTPPackage#getResourceInstance_Resourceserviceinstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceServiceInstance> getResourceserviceinstance();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sPTP.SPTPPackage#getResourceInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sPTP.ResourceInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResourceInstance
