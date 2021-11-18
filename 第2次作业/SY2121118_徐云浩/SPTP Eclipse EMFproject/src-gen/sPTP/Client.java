/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.Client#getUsedResources <em>Used Resources</em>}</li>
 *   <li>{@link sPTP.Client#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends StaticUsage, Instance {
	/**
	 * Returns the value of the '<em><b>Used Resources</b></em>' reference list.
	 * The list contents are of type {@link sPTP.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Resources</em>' reference list.
	 * @see sPTP.SPTPPackage#getClient_UsedResources()
	 * @model required="true"
	 * @generated
	 */
	EList<ResourceInstance> getUsedResources();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sPTP.SPTPPackage#getClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sPTP.Client#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Client
