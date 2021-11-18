/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SContract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSContract#getRequireAccorded <em>Require Accorded</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSContract#getOfferAccorded <em>Offer Accorded</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContract()
 * @model
 * @generated
 */
public interface QoSContract extends QoSConstraint {
	/**
	 * Returns the value of the '<em><b>Require Accorded</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSRequired}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSRequired#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Accorded</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContract_RequireAccorded()
	 * @see org.eclipse.sirius.sample.QFTP.QoSRequired#getContract
	 * @model opposite="contract"
	 * @generated
	 */
	EList<QoSRequired> getRequireAccorded();

	/**
	 * Returns the value of the '<em><b>Offer Accorded</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSOffered}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSOffered#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer Accorded</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContract_OfferAccorded()
	 * @see org.eclipse.sirius.sample.QFTP.QoSOffered#getContract
	 * @model opposite="contract"
	 * @generated
	 */
	EList<QoSOffered> getOfferAccorded();

} // QoSContract
