/**
 */
package org.eclipse.sirius.sample.QFTP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSCharacteristics;
import org.eclipse.sirius.sample.QFTP.QoSConstraint;
import org.eclipse.sirius.sample.QFTP.QoSContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SContext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl#isIsOoSObeservation <em>Is Oo SObeservation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl#getOppositeAssociation <em>Opposite Association</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl#getBasedOn <em>Based On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSContextImpl extends MinimalEObjectImpl.Container implements QoSContext {
	/**
	 * The default value of the '{@link #isIsOoSObeservation() <em>Is Oo SObeservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOoSObeservation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OO_SOBESERVATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOoSObeservation() <em>Is Oo SObeservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOoSObeservation()
	 * @generated
	 * @ordered
	 */
	protected boolean isOoSObeservation = IS_OO_SOBESERVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOppositeAssociation() <em>Opposite Association</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSContext> oppositeAssociation;

	/**
	 * The cached value of the '{@link #getSupport() <em>Support</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSConstraint> support;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSCharacteristics> basedOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SCONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOoSObeservation() {
		return isOoSObeservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOoSObeservation(boolean newIsOoSObeservation) {
		boolean oldIsOoSObeservation = isOoSObeservation;
		isOoSObeservation = newIsOoSObeservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCONTEXT__IS_OO_SOBESERVATION,
					oldIsOoSObeservation, isOoSObeservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSContext> getOppositeAssociation() {
		if (oppositeAssociation == null) {
			oppositeAssociation = new EObjectResolvingEList<QoSContext>(QoSContext.class, this,
					QFTPPackage.QO_SCONTEXT__OPPOSITE_ASSOCIATION);
		}
		return oppositeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSConstraint> getSupport() {
		if (support == null) {
			support = new EObjectWithInverseResolvingEList<QoSConstraint>(QoSConstraint.class, this,
					QFTPPackage.QO_SCONTEXT__SUPPORT, QFTPPackage.QO_SCONSTRAINT__CONTEXT);
		}
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSCharacteristics> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectWithInverseResolvingEList.ManyInverse<QoSCharacteristics>(QoSCharacteristics.class,
					this, QFTPPackage.QO_SCONTEXT__BASED_ON, QFTPPackage.QO_SCHARACTERISTICS__CONTEXT);
		}
		return basedOn;
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
		case QFTPPackage.QO_SCONTEXT__SUPPORT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSupport()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SCONTEXT__BASED_ON:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBasedOn()).basicAdd(otherEnd, msgs);
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
		case QFTPPackage.QO_SCONTEXT__SUPPORT:
			return ((InternalEList<?>) getSupport()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SCONTEXT__BASED_ON:
			return ((InternalEList<?>) getBasedOn()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SCONTEXT__IS_OO_SOBESERVATION:
			return isIsOoSObeservation();
		case QFTPPackage.QO_SCONTEXT__OPPOSITE_ASSOCIATION:
			return getOppositeAssociation();
		case QFTPPackage.QO_SCONTEXT__SUPPORT:
			return getSupport();
		case QFTPPackage.QO_SCONTEXT__BASED_ON:
			return getBasedOn();
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
		case QFTPPackage.QO_SCONTEXT__IS_OO_SOBESERVATION:
			setIsOoSObeservation((Boolean) newValue);
			return;
		case QFTPPackage.QO_SCONTEXT__OPPOSITE_ASSOCIATION:
			getOppositeAssociation().clear();
			getOppositeAssociation().addAll((Collection<? extends QoSContext>) newValue);
			return;
		case QFTPPackage.QO_SCONTEXT__SUPPORT:
			getSupport().clear();
			getSupport().addAll((Collection<? extends QoSConstraint>) newValue);
			return;
		case QFTPPackage.QO_SCONTEXT__BASED_ON:
			getBasedOn().clear();
			getBasedOn().addAll((Collection<? extends QoSCharacteristics>) newValue);
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
		case QFTPPackage.QO_SCONTEXT__IS_OO_SOBESERVATION:
			setIsOoSObeservation(IS_OO_SOBESERVATION_EDEFAULT);
			return;
		case QFTPPackage.QO_SCONTEXT__OPPOSITE_ASSOCIATION:
			getOppositeAssociation().clear();
			return;
		case QFTPPackage.QO_SCONTEXT__SUPPORT:
			getSupport().clear();
			return;
		case QFTPPackage.QO_SCONTEXT__BASED_ON:
			getBasedOn().clear();
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
		case QFTPPackage.QO_SCONTEXT__IS_OO_SOBESERVATION:
			return isOoSObeservation != IS_OO_SOBESERVATION_EDEFAULT;
		case QFTPPackage.QO_SCONTEXT__OPPOSITE_ASSOCIATION:
			return oppositeAssociation != null && !oppositeAssociation.isEmpty();
		case QFTPPackage.QO_SCONTEXT__SUPPORT:
			return support != null && !support.isEmpty();
		case QFTPPackage.QO_SCONTEXT__BASED_ON:
			return basedOn != null && !basedOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isOoSObeservation: ");
		result.append(isOoSObeservation);
		result.append(')');
		return result.toString();
	}

} //QoSContextImpl
