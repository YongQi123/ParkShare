/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SCategory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getOwn <em>Own</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCategory()
 * @model
 * @generated
 */
public interface QoSCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced</em>' reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCategory_Referenced()
	 * @model
	 * @generated
	 */
	EList<QoSCategory> getReferenced();

	/**
	 * Returns the value of the '<em><b>Own</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own</em>' containment reference.
	 * @see #setOwn(QoSCategory)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCategory_Own()
	 * @model containment="true"
	 * @generated
	 */
	QoSCategory getOwn();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getOwn <em>Own</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Own</em>' containment reference.
	 * @see #getOwn()
	 * @generated
	 */
	void setOwn(QoSCategory value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(QoSCharacteristics)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSCategory_Group()
	 * @model containment="true"
	 * @generated
	 */
	QoSCharacteristics getGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(QoSCharacteristics value);

} // QoSCategory
