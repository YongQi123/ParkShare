/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.Resource#getResourceservice <em>Resourceservice</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Descriptor {
	/**
	 * Returns the value of the '<em><b>Resourceservice</b></em>' containment reference list.
	 * The list contents are of type {@link sPTP.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceservice</em>' containment reference list.
	 * @see sPTP.SPTPPackage#getResource_Resourceservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceService> getResourceservice();

} // Resource
