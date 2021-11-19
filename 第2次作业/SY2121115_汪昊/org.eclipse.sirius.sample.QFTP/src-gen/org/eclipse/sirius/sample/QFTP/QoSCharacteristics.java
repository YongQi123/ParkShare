/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SCharacteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#isIsInvariant <em>Is Invariant</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQSub <em>QSub</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQParent <em>QParent</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQTemplate <em>QTemplate</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQDerivation <em>QDerivation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics()
 * @model
 * @generated
 */
public interface QoSCharacteristics extends QoSContext {
	/**
	 * Returns the value of the '<em><b>Is Invariant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Invariant</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_IsInvariant()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" changeable="false" ordered="false"
	 * @generated
	 */
	boolean isIsInvariant();

	/**
	 * Returns the value of the '<em><b>QSub</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQParent <em>QParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QSub</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_QSub()
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQParent
	 * @model opposite="qParent"
	 * @generated
	 */
	EList<QoSCharacteristics> getQSub();

	/**
	 * Returns the value of the '<em><b>QParent</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQSub <em>QSub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QParent</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_QParent()
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQSub
	 * @model opposite="qSub"
	 * @generated
	 */
	EList<QoSCharacteristics> getQParent();

	/**
	 * Returns the value of the '<em><b>QTemplate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQDerivation <em>QDerivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QTemplate</em>' reference.
	 * @see #setQTemplate(QoSCharacteristics)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_QTemplate()
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQDerivation
	 * @model opposite="qDerivation"
	 * @generated
	 */
	QoSCharacteristics getQTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQTemplate <em>QTemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QTemplate</em>' reference.
	 * @see #getQTemplate()
	 * @generated
	 */
	void setQTemplate(QoSCharacteristics value);

	/**
	 * Returns the value of the '<em><b>QDerivation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQTemplate <em>QTemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QDerivation</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_QDerivation()
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQTemplate
	 * @model opposite="qTemplate"
	 * @generated
	 */
	EList<QoSCharacteristics> getQDerivation();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(QoSDimension)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	QoSDimension getDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(QoSDimension value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QoSParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSContext}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSContext#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCharacteristics_Context()
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext#getBasedOn
	 * @model opposite="basedOn"
	 * @generated
	 */
	EList<QoSContext> getContext();

} // QoSCharacteristics
