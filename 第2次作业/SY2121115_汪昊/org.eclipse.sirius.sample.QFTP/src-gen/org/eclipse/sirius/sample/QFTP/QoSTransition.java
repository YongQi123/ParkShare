/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo STransition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSTransition()
 * @model
 * @generated
 */
public interface QoSTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(QoSLevel)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSTransition_Destination()
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	QoSLevel getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(QoSLevel value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(QoSLevel)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSTransition_Source()
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel#getTo
	 * @model opposite="to"
	 * @generated
	 */
	QoSLevel getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QoSLevel value);

} // QoSTransition
