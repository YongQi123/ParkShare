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
 * An implementation of the model object '<em><b>Qo SContract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSContractImpl#getRequireAccorded <em>Require Accorded</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSContractImpl#getOfferAccorded <em>Offer Accorded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSContractImpl extends QoSConstraintImpl implements QoSContract {
	/**
	 * The cached value of the '{@link #getRequireAccorded() <em>Require Accorded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireAccorded()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSRequired> requireAccorded;

	/**
	 * The cached value of the '{@link #getOfferAccorded() <em>Offer Accorded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferAccorded()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSOffered> offerAccorded;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SCONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSRequired> getRequireAccorded() {
		if (requireAccorded == null) {
			requireAccorded = new EObjectWithInverseResolvingEList.ManyInverse<QoSRequired>(QoSRequired.class, this,
					QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED, QFTPPackage.QO_SREQUIRED__CONTRACT);
		}
		return requireAccorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSOffered> getOfferAccorded() {
		if (offerAccorded == null) {
			offerAccorded = new EObjectWithInverseResolvingEList.ManyInverse<QoSOffered>(QoSOffered.class, this,
					QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED, QFTPPackage.QO_SOFFERED__CONTRACT);
		}
		return offerAccorded;
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
		case QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequireAccorded()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOfferAccorded()).basicAdd(otherEnd, msgs);
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
		case QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED:
			return ((InternalEList<?>) getRequireAccorded()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED:
			return ((InternalEList<?>) getOfferAccorded()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED:
			return getRequireAccorded();
		case QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED:
			return getOfferAccorded();
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
		case QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED:
			getRequireAccorded().clear();
			getRequireAccorded().addAll((Collection<? extends QoSRequired>) newValue);
			return;
		case QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED:
			getOfferAccorded().clear();
			getOfferAccorded().addAll((Collection<? extends QoSOffered>) newValue);
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
		case QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED:
			getRequireAccorded().clear();
			return;
		case QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED:
			getOfferAccorded().clear();
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
		case QFTPPackage.QO_SCONTRACT__REQUIRE_ACCORDED:
			return requireAccorded != null && !requireAccorded.isEmpty();
		case QFTPPackage.QO_SCONTRACT__OFFER_ACCORDED:
			return offerAccorded != null && !offerAccorded.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoSContractImpl
