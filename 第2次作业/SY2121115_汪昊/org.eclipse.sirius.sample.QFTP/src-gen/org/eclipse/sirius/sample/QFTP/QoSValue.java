/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SValue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSValue#getOwnerValue <em>Owner Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSValue()
 * @model
 * @generated
 */
public interface QoSValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSDimentionSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Value</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSValue_OwnerValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QoSDimentionSlot> getOwnerValue();

} // QoSValue
