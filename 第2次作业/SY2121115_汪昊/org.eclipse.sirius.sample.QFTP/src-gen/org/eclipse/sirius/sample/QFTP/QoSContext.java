/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SContext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSContext#isIsOoSObeservation <em>Is Oo SObeservation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSContext#getOppositeAssociation <em>Opposite Association</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSContext#getSupport <em>Support</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSContext#getBasedOn <em>Based On</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContext()
 * @model
 * @generated
 */
public interface QoSContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Oo SObeservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Oo SObeservation</em>' attribute.
	 * @see #setIsOoSObeservation(boolean)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContext_IsOoSObeservation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsOoSObeservation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSContext#isIsOoSObeservation <em>Is Oo SObeservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Oo SObeservation</em>' attribute.
	 * @see #isIsOoSObeservation()
	 * @generated
	 */
	void setIsOoSObeservation(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite Association</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Association</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContext_OppositeAssociation()
	 * @model
	 * @generated
	 */
	EList<QoSContext> getOppositeAssociation();

	/**
	 * Returns the value of the '<em><b>Support</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSConstraint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContext_Support()
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getContext
	 * @model opposite="context"
	 * @generated
	 */
	EList<QoSConstraint> getSupport();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSContext_BasedOn()
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getContext
	 * @model opposite="context"
	 * @generated
	 */
	EList<QoSCharacteristics> getBasedOn();

} // QoSContext
