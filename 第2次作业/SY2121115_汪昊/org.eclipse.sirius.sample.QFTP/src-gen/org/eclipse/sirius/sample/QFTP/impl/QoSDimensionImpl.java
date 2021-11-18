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

import org.eclipse.sirius.sample.QFTP.DirectionKind;
import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSCharacteristics;
import org.eclipse.sirius.sample.QFTP.QoSDimension;
import org.eclipse.sirius.sample.QFTP.QoSDimentionSlot;
import org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SDimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl#getStatisticalQualifier <em>Statistical Qualifier</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl#getEvaluate <em>Evaluate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSDimensionImpl extends MinimalEObjectImpl.Container implements QoSDimension {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind DIRECTION_EDEFAULT = DirectionKind.INCREASING;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatisticalQualifier() <em>Statistical Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticalQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final QoSStatisticalAttribute STATISTICAL_QUALIFIER_EDEFAULT = QoSStatisticalAttribute.MAXIMUMVALUE;

	/**
	 * The cached value of the '{@link #getStatisticalQualifier() <em>Statistical Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticalQualifier()
	 * @generated
	 * @ordered
	 */
	protected QoSStatisticalAttribute statisticalQualifier = STATISTICAL_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QoSCharacteristics type;

	/**
	 * The cached value of the '{@link #getEvaluate() <em>Evaluate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluate()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSDimentionSlot> evaluate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SDIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionKind newDirection) {
		DirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SDIMENSION__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSStatisticalAttribute getStatisticalQualifier() {
		return statisticalQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticalQualifier(QoSStatisticalAttribute newStatisticalQualifier) {
		QoSStatisticalAttribute oldStatisticalQualifier = statisticalQualifier;
		statisticalQualifier = newStatisticalQualifier == null ? STATISTICAL_QUALIFIER_EDEFAULT
				: newStatisticalQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SDIMENSION__STATISTICAL_QUALIFIER,
					oldStatisticalQualifier, statisticalQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SDIMENSION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCharacteristics getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(QoSCharacteristics newType, NotificationChain msgs) {
		QoSCharacteristics oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SDIMENSION__TYPE, oldType, newType);
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
	public void setType(QoSCharacteristics newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SDIMENSION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SDIMENSION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SDIMENSION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSDimentionSlot> getEvaluate() {
		if (evaluate == null) {
			evaluate = new EObjectContainmentEList<QoSDimentionSlot>(QoSDimentionSlot.class, this,
					QFTPPackage.QO_SDIMENSION__EVALUATE);
		}
		return evaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QFTPPackage.QO_SDIMENSION__TYPE:
			return basicSetType(null, msgs);
		case QFTPPackage.QO_SDIMENSION__EVALUATE:
			return ((InternalEList<?>) getEvaluate()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SDIMENSION__DIRECTION:
			return getDirection();
		case QFTPPackage.QO_SDIMENSION__STATISTICAL_QUALIFIER:
			return getStatisticalQualifier();
		case QFTPPackage.QO_SDIMENSION__UNIT:
			return getUnit();
		case QFTPPackage.QO_SDIMENSION__TYPE:
			return getType();
		case QFTPPackage.QO_SDIMENSION__EVALUATE:
			return getEvaluate();
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
		case QFTPPackage.QO_SDIMENSION__DIRECTION:
			setDirection((DirectionKind) newValue);
			return;
		case QFTPPackage.QO_SDIMENSION__STATISTICAL_QUALIFIER:
			setStatisticalQualifier((QoSStatisticalAttribute) newValue);
			return;
		case QFTPPackage.QO_SDIMENSION__UNIT:
			setUnit((String) newValue);
			return;
		case QFTPPackage.QO_SDIMENSION__TYPE:
			setType((QoSCharacteristics) newValue);
			return;
		case QFTPPackage.QO_SDIMENSION__EVALUATE:
			getEvaluate().clear();
			getEvaluate().addAll((Collection<? extends QoSDimentionSlot>) newValue);
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
		case QFTPPackage.QO_SDIMENSION__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case QFTPPackage.QO_SDIMENSION__STATISTICAL_QUALIFIER:
			setStatisticalQualifier(STATISTICAL_QUALIFIER_EDEFAULT);
			return;
		case QFTPPackage.QO_SDIMENSION__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case QFTPPackage.QO_SDIMENSION__TYPE:
			setType((QoSCharacteristics) null);
			return;
		case QFTPPackage.QO_SDIMENSION__EVALUATE:
			getEvaluate().clear();
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
		case QFTPPackage.QO_SDIMENSION__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case QFTPPackage.QO_SDIMENSION__STATISTICAL_QUALIFIER:
			return statisticalQualifier != STATISTICAL_QUALIFIER_EDEFAULT;
		case QFTPPackage.QO_SDIMENSION__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case QFTPPackage.QO_SDIMENSION__TYPE:
			return type != null;
		case QFTPPackage.QO_SDIMENSION__EVALUATE:
			return evaluate != null && !evaluate.isEmpty();
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", statisticalQualifier: ");
		result.append(statisticalQualifier);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //QoSDimensionImpl
