/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SRequired</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSRequired#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSRequired#getQOffered <em>QOffered</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSRequired()
 * @model
 * @generated
 */
public interface QoSRequired extends QoSConstraint {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSContract}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSContract#getRequireAccorded <em>Require Accorded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSRequired_Contract()
	 * @see org.eclipse.sirius.sample.QFTP.QoSContract#getRequireAccorded
	 * @model opposite="requireAccorded"
	 * @generated
	 */
	EList<QoSContract> getContract();

	/**
	 * Returns the value of the '<em><b>QOffered</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSOffered}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSOffered#getQRequired <em>QRequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QOffered</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSRequired_QOffered()
	 * @see org.eclipse.sirius.sample.QFTP.QoSOffered#getQRequired
	 * @model opposite="qRequired"
	 * @generated
	 */
	EList<QoSOffered> getQOffered();

} // QoSRequired
