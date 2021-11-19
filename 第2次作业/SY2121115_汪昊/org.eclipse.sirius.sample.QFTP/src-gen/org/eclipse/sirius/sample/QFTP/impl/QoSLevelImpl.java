/**
 */
package org.eclipse.sirius.sample.QFTP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSConstraint;
import org.eclipse.sirius.sample.QFTP.QoSLevel;
import org.eclipse.sirius.sample.QFTP.QoSTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SLevel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSLevelImpl#getAllowedSpace <em>Allowed Space</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSLevelImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSLevelImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSLevelImpl extends MinimalEObjectImpl.Container implements QoSLevel {
	/**
	 * The cached value of the '{@link #getAllowedSpace() <em>Allowed Space</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedSpace()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSConstraint> allowedSpace;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSTransition> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSTransition> to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SLEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSConstraint> getAllowedSpace() {
		if (allowedSpace == null) {
			allowedSpace = new EObjectWithInverseResolvingEList.ManyInverse<QoSConstraint>(QoSConstraint.class, this,
					QFTPPackage.QO_SLEVEL__ALLOWED_SPACE, QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL);
		}
		return allowedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSTransition> getFrom() {
		if (from == null) {
			from = new EObjectWithInverseResolvingEList<QoSTransition>(QoSTransition.class, this,
					QFTPPackage.QO_SLEVEL__FROM, QFTPPackage.QO_STRANSITION__DESTINATION);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSTransition> getTo() {
		if (to == null) {
			to = new EObjectWithInverseResolvingEList<QoSTransition>(QoSTransition.class, this,
					QFTPPackage.QO_SLEVEL__TO, QFTPPackage.QO_STRANSITION__SOURCE);
		}
		return to;
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
		case QFTPPackage.QO_SLEVEL__ALLOWED_SPACE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllowedSpace()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SLEVEL__FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFrom()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SLEVEL__TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTo()).basicAdd(otherEnd, msgs);
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
		case QFTPPackage.QO_SLEVEL__ALLOWED_SPACE:
			return ((InternalEList<?>) getAllowedSpace()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SLEVEL__FROM:
			return ((InternalEList<?>) getFrom()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SLEVEL__TO:
			return ((InternalEList<?>) getTo()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SLEVEL__ALLOWED_SPACE:
			return getAllowedSpace();
		case QFTPPackage.QO_SLEVEL__FROM:
			return getFrom();
		case QFTPPackage.QO_SLEVEL__TO:
			return getTo();
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
		case QFTPPackage.QO_SLEVEL__ALLOWED_SPACE:
			getAllowedSpace().clear();
			getAllowedSpace().addAll((Collection<? extends QoSConstraint>) newValue);
			return;
		case QFTPPackage.QO_SLEVEL__FROM:
			getFrom().clear();
			getFrom().addAll((Collection<? extends QoSTransition>) newValue);
			return;
		case QFTPPackage.QO_SLEVEL__TO:
			getTo().clear();
			getTo().addAll((Collection<? extends QoSTransition>) newValue);
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
		case QFTPPackage.QO_SLEVEL__ALLOWED_SPACE:
			getAllowedSpace().clear();
			return;
		case QFTPPackage.QO_SLEVEL__FROM:
			getFrom().clear();
			return;
		case QFTPPackage.QO_SLEVEL__TO:
			getTo().clear();
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
		case QFTPPackage.QO_SLEVEL__ALLOWED_SPACE:
			return allowedSpace != null && !allowedSpace.isEmpty();
		case QFTPPackage.QO_SLEVEL__FROM:
			return from != null && !from.isEmpty();
		case QFTPPackage.QO_SLEVEL__TO:
			return to != null && !to.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoSLevelImpl
