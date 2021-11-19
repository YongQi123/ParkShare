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
 * An implementation of the model object '<em><b>Qo SOffered</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSOfferedImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSOfferedImpl#getQRequired <em>QRequired</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSOfferedImpl extends QoSConstraintImpl implements QoSOffered {
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
	 * The cached value of the '{@link #getQRequired() <em>QRequired</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSRequired> qRequired;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSOfferedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SOFFERED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSContract> getContract() {
		if (contract == null) {
			contract = new EObjectWithInverseResolvingEList.ManyInverse<QoSContract>(QoSContract.class, this,
					QFTPPackage.QO_SOFFERED__CONTRACT, QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSRequired> getQRequired() {
		if (qRequired == null) {
			qRequired = new EObjectWithInverseResolvingEList.ManyInverse<QoSRequired>(QoSRequired.class, this,
					QFTPPackage.QO_SOFFERED__QREQUIRED, QFTPPackage.QO_SREQUIRED__QOFFERED);
		}
		return qRequired;
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
		case QFTPPackage.QO_SOFFERED__CONTRACT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContract()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SOFFERED__QREQUIRED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQRequired()).basicAdd(otherEnd, msgs);
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
		case QFTPPackage.QO_SOFFERED__CONTRACT:
			return ((InternalEList<?>) getContract()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SOFFERED__QREQUIRED:
			return ((InternalEList<?>) getQRequired()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SOFFERED__CONTRACT:
			return getContract();
		case QFTPPackage.QO_SOFFERED__QREQUIRED:
			return getQRequired();
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
		case QFTPPackage.QO_SOFFERED__CONTRACT:
			getContract().clear();
			getContract().addAll((Collection<? extends QoSContract>) newValue);
			return;
		case QFTPPackage.QO_SOFFERED__QREQUIRED:
			getQRequired().clear();
			getQRequired().addAll((Collection<? extends QoSRequired>) newValue);
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
		case QFTPPackage.QO_SOFFERED__CONTRACT:
			getContract().clear();
			return;
		case QFTPPackage.QO_SOFFERED__QREQUIRED:
			getQRequired().clear();
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
		case QFTPPackage.QO_SOFFERED__CONTRACT:
			return contract != null && !contract.isEmpty();
		case QFTPPackage.QO_SOFFERED__QREQUIRED:
			return qRequired != null && !qRequired.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoSOfferedImpl
