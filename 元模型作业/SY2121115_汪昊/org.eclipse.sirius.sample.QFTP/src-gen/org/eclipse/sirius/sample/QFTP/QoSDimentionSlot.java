/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SDimention Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSDimentionSlot#getReferencedValue <em>Referenced Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimentionSlot()
 * @model
 * @generated
 */
public interface QoSDimentionSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Value</em>' reference.
	 * @see #setReferencedValue(QoSValue)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimentionSlot_ReferencedValue()
	 * @model
	 * @generated
	 */
	QoSValue getReferencedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSDimentionSlot#getReferencedValue <em>Referenced Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Value</em>' reference.
	 * @see #getReferencedValue()
	 * @generated
	 */
	void setReferencedValue(QoSValue value);

} // QoSDimentionSlot
