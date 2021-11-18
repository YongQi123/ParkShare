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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint;
import org.eclipse.sirius.sample.QFTP.QoSCompoundLevel;
import org.eclipse.sirius.sample.QFTP.QoSLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SCompound Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundLevelImpl#getAllowedSpace <em>Allowed Space</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundLevelImpl#getGroupOfLevel <em>Group Of Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSCompoundLevelImpl extends MinimalEObjectImpl.Container implements QoSCompoundLevel {
	/**
	 * The cached value of the '{@link #getAllowedSpace() <em>Allowed Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedSpace()
	 * @generated
	 * @ordered
	 */
	protected QoSCompoundConstraint allowedSpace;

	/**
	 * The cached value of the '{@link #getGroupOfLevel() <em>Group Of Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupOfLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSLevel> groupOfLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSCompoundLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SCOMPOUND_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCompoundConstraint getAllowedSpace() {
		if (allowedSpace != null && allowedSpace.eIsProxy()) {
			InternalEObject oldAllowedSpace = (InternalEObject) allowedSpace;
			allowedSpace = (QoSCompoundConstraint) eResolveProxy(oldAllowedSpace);
			if (allowedSpace != oldAllowedSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE, oldAllowedSpace, allowedSpace));
			}
		}
		return allowedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCompoundConstraint basicGetAllowedSpace() {
		return allowedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedSpace(QoSCompoundConstraint newAllowedSpace, NotificationChain msgs) {
		QoSCompoundConstraint oldAllowedSpace = allowedSpace;
		allowedSpace = newAllowedSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE, oldAllowedSpace, newAllowedSpace);
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
	public void setAllowedSpace(QoSCompoundConstraint newAllowedSpace) {
		if (newAllowedSpace != allowedSpace) {
			NotificationChain msgs = null;
			if (allowedSpace != null)
				msgs = ((InternalEObject) allowedSpace).eInverseRemove(this, QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL,
						QoSCompoundConstraint.class, msgs);
			if (newAllowedSpace != null)
				msgs = ((InternalEObject) newAllowedSpace).eInverseAdd(this, QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL,
						QoSCompoundConstraint.class, msgs);
			msgs = basicSetAllowedSpace(newAllowedSpace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE,
					newAllowedSpace, newAllowedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSLevel> getGroupOfLevel() {
		if (groupOfLevel == null) {
			groupOfLevel = new EObjectContainmentEList<QoSLevel>(QoSLevel.class, this,
					QFTPPackage.QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL);
		}
		return groupOfLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE:
			if (allowedSpace != null)
				msgs = ((InternalEObject) allowedSpace).eInverseRemove(this, QFTPPackage.QO_SCOMPOUND_CONSTRAINT__LEVEL,
						QoSCompoundConstraint.class, msgs);
			return basicSetAllowedSpace((QoSCompoundConstraint) otherEnd, msgs);
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
		case QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE:
			return basicSetAllowedSpace(null, msgs);
		case QFTPPackage.QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL:
			return ((InternalEList<?>) getGroupOfLevel()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE:
			if (resolve)
				return getAllowedSpace();
			return basicGetAllowedSpace();
		case QFTPPackage.QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL:
			return getGroupOfLevel();
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
		case QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE:
			setAllowedSpace((QoSCompoundConstraint) newValue);
			return;
		case QFTPPackage.QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL:
			getGroupOfLevel().clear();
			getGroupOfLevel().addAll((Collection<? extends QoSLevel>) newValue);
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
		case QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE:
			setAllowedSpace((QoSCompoundConstraint) null);
			return;
		case QFTPPackage.QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL:
			getGroupOfLevel().clear();
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
		case QFTPPackage.QO_SCOMPOUND_LEVEL__ALLOWED_SPACE:
			return allowedSpace != null;
		case QFTPPackage.QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL:
			return groupOfLevel != null && !groupOfLevel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoSCompoundLevelImpl
