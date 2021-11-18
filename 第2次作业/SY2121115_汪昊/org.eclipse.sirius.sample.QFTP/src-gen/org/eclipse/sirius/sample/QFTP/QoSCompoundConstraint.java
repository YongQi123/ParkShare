/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SCompound Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCompoundConstraint()
 * @model
 * @generated
 */
public interface QoSCompoundConstraint extends QoSConstraint {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCompoundConstraint_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<QoSConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getAllowedSpace <em>Allowed Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(QoSCompoundLevel)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCompoundConstraint_Level()
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getAllowedSpace
	 * @model opposite="allowedSpace"
	 * @generated
	 */
	QoSCompoundLevel getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(QoSCompoundLevel value);

} // QoSCompoundConstraint
