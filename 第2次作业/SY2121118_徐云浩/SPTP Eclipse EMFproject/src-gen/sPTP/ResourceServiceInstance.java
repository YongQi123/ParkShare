/**
 */
package sPTP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.ResourceServiceInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getResourceServiceInstance()
 * @model
 * @generated
 */
public interface ResourceServiceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sPTP.ResourceService#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ResourceService)
	 * @see sPTP.SPTPPackage#getResourceServiceInstance_Type()
	 * @see sPTP.ResourceService#getInstance
	 * @model opposite="instance" required="true"
	 * @generated
	 */
	ResourceService getType();

	/**
	 * Sets the value of the '{@link sPTP.ResourceServiceInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceService value);

} // ResourceServiceInstance
