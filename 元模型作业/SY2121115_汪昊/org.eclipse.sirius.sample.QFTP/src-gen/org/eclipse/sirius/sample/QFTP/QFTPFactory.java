/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage
 * @generated
 */
public interface QFTPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFTPFactory eINSTANCE = org.eclipse.sirius.sample.QFTP.impl.QFTPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Qo SRequired</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SRequired</em>'.
	 * @generated
	 */
	QoSRequired createQoSRequired();

	/**
	 * Returns a new object of class '<em>Qo SCharacteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SCharacteristics</em>'.
	 * @generated
	 */
	QoSCharacteristics createQoSCharacteristics();

	/**
	 * Returns a new object of class '<em>Qo SLevel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SLevel</em>'.
	 * @generated
	 */
	QoSLevel createQoSLevel();

	/**
	 * Returns a new object of class '<em>Qo SDimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SDimension</em>'.
	 * @generated
	 */
	QoSDimension createQoSDimension();

	/**
	 * Returns a new object of class '<em>Qo SParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SParameter</em>'.
	 * @generated
	 */
	QoSParameter createQoSParameter();

	/**
	 * Returns a new object of class '<em>Qo SCompound Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SCompound Level</em>'.
	 * @generated
	 */
	QoSCompoundLevel createQoSCompoundLevel();

	/**
	 * Returns a new object of class '<em>Qo SDimention Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SDimention Slot</em>'.
	 * @generated
	 */
	QoSDimentionSlot createQoSDimentionSlot();

	/**
	 * Returns a new object of class '<em>Qo SValue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SValue</em>'.
	 * @generated
	 */
	QoSValue createQoSValue();

	/**
	 * Returns a new object of class '<em>Qo SOffered</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SOffered</em>'.
	 * @generated
	 */
	QoSOffered createQoSOffered();

	/**
	 * Returns a new object of class '<em>Qo SConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SConstraint</em>'.
	 * @generated
	 */
	QoSConstraint createQoSConstraint();

	/**
	 * Returns a new object of class '<em>Qo SContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SContext</em>'.
	 * @generated
	 */
	QoSContext createQoSContext();

	/**
	 * Returns a new object of class '<em>Qo STransition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo STransition</em>'.
	 * @generated
	 */
	QoSTransition createQoSTransition();

	/**
	 * Returns a new object of class '<em>Qo SContract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SContract</em>'.
	 * @generated
	 */
	QoSContract createQoSContract();

	/**
	 * Returns a new object of class '<em>Qo SCategory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SCategory</em>'.
	 * @generated
	 */
	QoSCategory createQoSCategory();

	/**
	 * Returns a new object of class '<em>Qo SCompound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SCompound Constraint</em>'.
	 * @generated
	 */
	QoSCompoundConstraint createQoSCompoundConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QFTPPackage getQFTPPackage();

} //QFTPFactory
