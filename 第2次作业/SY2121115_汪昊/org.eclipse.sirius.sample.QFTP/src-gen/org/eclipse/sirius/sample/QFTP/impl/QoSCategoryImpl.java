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

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSCategory;
import org.eclipse.sirius.sample.QFTP.QoSCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SCategory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCategoryImpl#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCategoryImpl#getOwn <em>Own</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCategoryImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSCategoryImpl extends MinimalEObjectImpl.Container implements QoSCategory {
	/**
	 * The cached value of the '{@link #getReferenced() <em>Referenced</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenced()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSCategory> referenced;

	/**
	 * The cached value of the '{@link #getOwn() <em>Own</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwn()
	 * @generated
	 * @ordered
	 */
	protected QoSCategory own;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected QoSCharacteristics group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SCATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSCategory> getReferenced() {
		if (referenced == null) {
			referenced = new EObjectResolvingEList<QoSCategory>(QoSCategory.class, this,
					QFTPPackage.QO_SCATEGORY__REFERENCED);
		}
		return referenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCategory getOwn() {
		return own;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwn(QoSCategory newOwn, NotificationChain msgs) {
		QoSCategory oldOwn = own;
		own = newOwn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCATEGORY__OWN, oldOwn, newOwn);
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
	public void setOwn(QoSCategory newOwn) {
		if (newOwn != own) {
			NotificationChain msgs = null;
			if (own != null)
				msgs = ((InternalEObject) own).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SCATEGORY__OWN, null, msgs);
			if (newOwn != null)
				msgs = ((InternalEObject) newOwn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SCATEGORY__OWN, null, msgs);
			msgs = basicSetOwn(newOwn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCATEGORY__OWN, newOwn, newOwn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCharacteristics getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(QoSCharacteristics newGroup, NotificationChain msgs) {
		QoSCharacteristics oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCATEGORY__GROUP, oldGroup, newGroup);
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
	public void setGroup(QoSCharacteristics newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject) group).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SCATEGORY__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject) newGroup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SCATEGORY__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCATEGORY__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QFTPPackage.QO_SCATEGORY__OWN:
			return basicSetOwn(null, msgs);
		case QFTPPackage.QO_SCATEGORY__GROUP:
			return basicSetGroup(null, msgs);
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
		case QFTPPackage.QO_SCATEGORY__REFERENCED:
			return getReferenced();
		case QFTPPackage.QO_SCATEGORY__OWN:
			return getOwn();
		case QFTPPackage.QO_SCATEGORY__GROUP:
			return getGroup();
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
		case QFTPPackage.QO_SCATEGORY__REFERENCED:
			getReferenced().clear();
			getReferenced().addAll((Collection<? extends QoSCategory>) newValue);
			return;
		case QFTPPackage.QO_SCATEGORY__OWN:
			setOwn((QoSCategory) newValue);
			return;
		case QFTPPackage.QO_SCATEGORY__GROUP:
			setGroup((QoSCharacteristics) newValue);
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
		case QFTPPackage.QO_SCATEGORY__REFERENCED:
			getReferenced().clear();
			return;
		case QFTPPackage.QO_SCATEGORY__OWN:
			setOwn((QoSCategory) null);
			return;
		case QFTPPackage.QO_SCATEGORY__GROUP:
			setGroup((QoSCharacteristics) null);
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
		case QFTPPackage.QO_SCATEGORY__REFERENCED:
			return referenced != null && !referenced.isEmpty();
		case QFTPPackage.QO_SCATEGORY__OWN:
			return own != null;
		case QFTPPackage.QO_SCATEGORY__GROUP:
			return group != null;
		}
		return super.eIsSet(featureID);
	}

} //QoSCategoryImpl
