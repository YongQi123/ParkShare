/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SDimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getStatisticalQualifier <em>Statistical Qualifier</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getEvaluate <em>Evaluate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimension()
 * @model
 * @generated
 */
public interface QoSDimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.QFTP.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.DirectionKind
	 * @see #setDirection(DirectionKind)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimension_Direction()
	 * @model default=""
	 * @generated
	 */
	DirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.DirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Statistical Qualifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistical Qualifier</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute
	 * @see #setStatisticalQualifier(QoSStatisticalAttribute)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimension_StatisticalQualifier()
	 * @model
	 * @generated
	 */
	QoSStatisticalAttribute getStatisticalQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getStatisticalQualifier <em>Statistical Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistical Qualifier</em>' attribute.
	 * @see org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute
	 * @see #getStatisticalQualifier()
	 * @generated
	 */
	void setStatisticalQualifier(QoSStatisticalAttribute value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimension_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(QoSCharacteristics)
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimension_Type()
	 * @model containment="true"
	 * @generated
	 */
	QoSCharacteristics getType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(QoSCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Evaluate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.QFTP.QoSDimentionSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluate</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSDimension_Evaluate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QoSDimentionSlot> getEvaluate();

} // QoSDimension
