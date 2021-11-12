/**
 */
package org.eclipse.sirius.sample.QFTP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSContract;
import org.eclipse.sirius.sample.QFTP.QoSOffered;
import org.eclipse.sirius.sample.QFTP.QoSRequired;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SRequired</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSRequiredImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSRequiredImpl#getQOffered <em>QOffered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSRequiredImpl extends QoSConstraintImpl implements QoSRequired {
	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSContract> contract;

	/**
	 * The cached value of the '{@link #getQOffered() <em>QOffered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQOffered()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSOffered> qOffered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSRequiredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SREQUIRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSContract> getContract() {
		if (contract == null) {
			contract = new EObjectWithInverseResolvingEList.ManyInverse<QoSContract>(QoSContract.class, this,
					QFTPPackage.QO_SREQUIRED__CONTRACT, QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSOffered> getQOffered() {
		if (qOffered == null) {
			qOffered = new EObjectWithInverseResolvingEList.ManyInverse<QoSOffered>(QoSOffered.class, this,
					QFTPPackage.QO_SREQUIRED__QOFFERED, QFTPPackage.QO_SOFFERED__QREQUIRED);
		}
		return qOffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QFTPPackage.QO_SREQUIRED__CONTRACT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContract()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SREQUIRED__QOFFERED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQOffered()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QFTPPackage.QO_SREQUIRED__CONTRACT:
			return ((InternalEList<?>) getContract()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SREQUIRED__QOFFERED:
			return ((InternalEList<?>) getQOffered()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QFTPPackage.QO_SREQUIRED__CONTRACT:
			return getContract();
		case QFTPPackage.QO_SREQUIRED__QOFFERED:
			return getQOffered();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QFTPPackage.QO_SREQUIRED__CONTRACT:
			getContract().clear();
			getContract().addAll((Collection<? extends QoSContract>) newValue);
			return;
		case QFTPPackage.QO_SREQUIRED__QOFFERED:
			getQOffered().clear();
			getQOffered().addAll((Collection<? extends QoSOffered>) newValue);
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
		case QFTPPackage.QO_SREQUIRED__CONTRACT:
			getContract().clear();
			return;
		case QFTPPackage.QO_SREQUIRED__QOFFERED:
			getQOffered().clear();
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
		case QFTPPackage.QO_SREQUIRED__CONTRACT:
			return contract != null && !contract.isEmpty();
		case QFTPPackage.QO_SREQUIRED__QOFFERED:
			return qOffered != null && !qOffered.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoSRequiredImpl
