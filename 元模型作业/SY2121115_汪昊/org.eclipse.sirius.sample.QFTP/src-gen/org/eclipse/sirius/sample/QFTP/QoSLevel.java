/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SLevel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getAllowedSpace <em>Allowed Space</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSLevel()
 * @model
 * @generated
 */
public interface QoSLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Space</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSConstraint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getCurrentLevel <em>Current Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Space</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSLevel_AllowedSpace()
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getCurrentLevel
	 * @model opposite="currentLevel"
	 * @generated
	 */
	EList<QoSConstraint> getAllowedSpace();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSTransition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSLevel_From()
	 * @see org.eclipse.sirius.sample.QFTP.QoSTransition#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<QoSTransition> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSTransition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSLevel_To()
	 * @see org.eclipse.sirius.sample.QFTP.QoSTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<QoSTransition> getTo();

} // QoSLevel
