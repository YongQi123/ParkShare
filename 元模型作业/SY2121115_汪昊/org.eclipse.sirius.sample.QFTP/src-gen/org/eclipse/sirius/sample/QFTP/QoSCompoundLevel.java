/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SCompound Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getAllowedSpace <em>Allowed Space</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getGroupOfLevel <em>Group Of Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCompoundLevel()
 * @model
 * @generated
 */
public interface QoSCompoundLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Space</em>' reference.
	 * @see #setAllowedSpace(QoSCompoundConstraint)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCompoundLevel_AllowedSpace()
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getLevel
	 * @model opposite="level"
	 * @generated
	 */
	QoSCompoundConstraint getAllowedSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getAllowedSpace <em>Allowed Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Space</em>' reference.
	 * @see #getAllowedSpace()
	 * @generated
	 */
	void setAllowedSpace(QoSCompoundConstraint value);

	/**
	 * Returns the value of the '<em><b>Group Of Level</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Of Level</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCompoundLevel_GroupOfLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<QoSLevel> getGroupOfLevel();

} // QoSCompoundLevel
