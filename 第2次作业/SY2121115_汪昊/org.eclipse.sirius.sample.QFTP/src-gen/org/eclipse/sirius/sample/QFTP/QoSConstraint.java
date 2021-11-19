/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SConstraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getEvaluate <em>Evaluate</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getNext <em>Next</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getCurrentLevel <em>Current Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint()
 * @model
 * @generated
 */
public interface QoSConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluate</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluate</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint_Evaluate()
	 * @model
	 * @generated
	 */
	EList<QoSValue> getEvaluate();

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.QFTP.QualificationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.QualificationKind
	 * @see #setQualification(QualificationKind)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint_Qualification()
	 * @model
	 * @generated
	 */
	QualificationKind getQualification();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.QualificationKind
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(QualificationKind value);

	/**
	 * Returns the value of the '<em><b>Logical Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.QFTP.LogicalOperators}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operator</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.LogicalOperators
	 * @see #setLogicalOperator(LogicalOperators)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint_LogicalOperator()
	 * @model
	 * @generated
	 */
	LogicalOperators getLogicalOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getLogicalOperator <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operator</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.LogicalOperators
	 * @see #getLogicalOperator()
	 * @generated
	 */
	void setLogicalOperator(LogicalOperators value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(QoSConstraint)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint_Next()
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	QoSConstraint getNext();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(QoSConstraint value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(QoSConstraint)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint_Previous()
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getNext
	 * @model opposite="next"
	 * @generated
	 */
	QoSConstraint getPrevious();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(QoSConstraint value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSContext#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(QoSContext)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint_Context()
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext#getSupport
	 * @model opposite="support"
	 * @generated
	 */
	QoSContext getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(QoSContext value);

	/**
	 * Returns the value of the '<em><b>Current Level</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSLevel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getAllowedSpace <em>Allowed Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Level</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSConstraint_CurrentLevel()
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel#getAllowedSpace
	 * @model opposite="allowedSpace"
	 * @generated
	 */
	EList<QoSLevel> getCurrentLevel();

} // QoSConstraint
