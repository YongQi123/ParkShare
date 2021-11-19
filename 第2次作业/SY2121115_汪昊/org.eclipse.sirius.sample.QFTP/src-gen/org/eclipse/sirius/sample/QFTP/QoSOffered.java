/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SOffered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSOffered#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSOffered#getQRequired <em>QRequired</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSOffered()
 * @model
 * @generated
 */
public interface QoSOffered extends QoSConstraint {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSContract}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSContract#getOfferAccorded <em>Offer Accorded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSOffered_Contract()
	 * @see org.eclipse.sirius.sample.QFTP.QoSContract#getOfferAccorded
	 * @model opposite="offerAccorded"
	 * @generated
	 */
	EList<QoSContract> getContract();

	/**
	 * Returns the value of the '<em><b>QRequired</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSRequired}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSRequired#getQOffered <em>QOffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRequired</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSOffered_QRequired()
	 * @see org.eclipse.sirius.sample.QFTP.QoSRequired#getQOffered
	 * @model opposite="qOffered"
	 * @generated
	 */
	EList<QoSRequired> getQRequired();

} // QoSOffered
