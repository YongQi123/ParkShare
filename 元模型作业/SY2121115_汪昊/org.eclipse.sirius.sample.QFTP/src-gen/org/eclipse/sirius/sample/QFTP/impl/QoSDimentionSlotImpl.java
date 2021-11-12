/**
 */
package org.eclipse.sirius.sample.QFTP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSDimentionSlot;
import org.eclipse.sirius.sample.QFTP.QoSValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SDimention Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimentionSlotImpl#getReferencedValue <em>Referenced Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSDimentionSlotImpl extends MinimalEObjectImpl.Container implements QoSDimentionSlot {
	/**
	 * The cached value of the '{@link #getReferencedValue() <em>Referenced Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedValue()
	 * @generated
	 * @ordered
	 */
	protected QoSValue referencedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSDimentionSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SDIMENTION_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSValue getReferencedValue() {
		if (referencedValue != null && referencedValue.eIsProxy()) {
			InternalEObject oldReferencedValue = (InternalEObject) referencedValue;
			referencedValue = (QoSValue) eResolveProxy(oldReferencedValue);
			if (referencedValue != oldReferencedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QFTPPackage.QO_SDIMENTION_SLOT__REFERENCED_VALUE, oldReferencedValue, referencedValue));
			}
		}
		return referencedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSValue basicGetReferencedValue() {
		return referencedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedValue(QoSValue newReferencedValue) {
		QoSValue oldReferencedValue = referencedValue;
		referencedValue = newReferencedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SDIMENTION_SLOT__REFERENCED_VALUE,
					oldReferencedValue, referencedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QFTPPackage.QO_SDIMENTION_SLOT__REFERENCED_VALUE:
			if (resolve)
				return getReferencedValue();
			return basicGetReferencedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QFTPPackage.QO_SDIMENTION_SLOT__REFERENCED_VALUE:
			setReferencedValue((QoSValue) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QFTPPackage.QO_SDIMENTION_SLOT__REFERENCED_VALUE:
			setReferencedValue((QoSValue) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QFTPPackage.QO_SDIMENTION_SLOT__REFERENCED_VALUE:
			return referencedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //QoSDimentionSlotImpl
