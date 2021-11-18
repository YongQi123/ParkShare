/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.ResourceService#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getResourceService()
 * @model
 * @generated
 */
public interface ResourceService extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link sPTP.ResourceServiceInstance}.
	 * It is bidirectional and its opposite is '{@link sPTP.ResourceServiceInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see sPTP.SPTPPackage#getResourceService_Instance()
	 * @see sPTP.ResourceServiceInstance#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<ResourceServiceInstance> getInstance();

} // ResourceService
