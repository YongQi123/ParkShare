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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint;
import org.eclipse.sirius.sample.QFTP.QoSCompoundLevel;
import org.eclipse.sirius.sample.QFTP.QoSConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SCompound Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundConstraintImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSCompoundConstraintImpl extends QoSConstraintImpl implements QoSCompoundConstraint {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSConstraint> constraint;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected QoSCompoundLevel level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSCompoundConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SCOMPOUND_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<QoSConstraint>(QoSConstraint.class, this,
					QFTPPackage.QO_SCOMPOUND_CONSTRAINT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCompoundLevel getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (QoSCompoundLevel) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCompoundLevel basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel(QoSCompoundLevel newLevel, NotificationChain msgs) {
		QoSCompoundLevel oldLevel = level;
		level = newLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL, oldLevel, newLevel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(QoSCompoundLevel newLevel) {
		if (newLevel != level) {
			NotificationChain msgs = null;
			if (level != null)
				msgs = ((InternalEObject) level).eInverseRemove(this, QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE,
						QoSCompoundLevel.class, msgs);
			if (newLevel != null)
				msgs = ((InternalEObject) newLevel).eInverseAdd(this, QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE,
						QoSCompoundLevel.class, msgs);
			msgs = basicSetLevel(newLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL, newLevel,
					newLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL:
			if (level != null)
				msgs = ((InternalEObject) level).eInverseRemove(this, QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE,
						QoSCompoundLevel.class, msgs);
			return basicSetLevel((QoSCompoundLevel) otherEnd, msgs);
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
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL:
			return basicSetLevel(null, msgs);
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
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__CONSTRAINT:
			return getConstraint();
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL:
			if (resolve)
				return getLevel();
			return basicGetLevel();
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
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends QoSConstraint>) newValue);
			return;
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL:
			setLevel((QoSCompoundLevel) newValue);
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
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__CONSTRAINT:
			getConstraint().clear();
			return;
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL:
			setLevel((QoSCompoundLevel) null);
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
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL:
			return level != null;
		}
		return super.eIsSet(featureID);
	}

} //QoSCompoundConstraintImpl
