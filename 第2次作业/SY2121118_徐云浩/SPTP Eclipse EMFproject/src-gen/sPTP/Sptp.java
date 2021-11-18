/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sptp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.Sptp#getEventoccurence <em>Eventoccurence</em>}</li>
 *   <li>{@link sPTP.Sptp#getInstance <em>Instance</em>}</li>
 *   <li>{@link sPTP.Sptp#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getSptp()
 * @model
 * @generated
 */
public interface Sptp extends EObject {
	/**
	 * Returns the value of the '<em><b>Eventoccurence</b></em>' containment reference list.
	 * The list contents are of type {@link sPTP.EventOccurence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventoccurence</em>' containment reference list.
	 * @see sPTP.SPTPPackage#getSptp_Eventoccurence()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventOccurence> getEventoccurence();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link sPTP.Instance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see sPTP.SPTPPackage#getSptp_Instance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstance();

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' containment reference list.
	 * The list contents are of type {@link sPTP.Descriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' containment reference list.
	 * @see sPTP.SPTPPackage#getSptp_Descriptor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Descriptor> getDescriptor();

} // Sptp
