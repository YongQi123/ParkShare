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

import org.eclipse.sirius.sample.QFTP.LogicalOperators;
import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSConstraint;
import org.eclipse.sirius.sample.QFTP.QoSContext;
import org.eclipse.sirius.sample.QFTP.QoSLevel;
import org.eclipse.sirius.sample.QFTP.QoSValue;
import org.eclipse.sirius.sample.QFTP.QualificationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SConstraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl#getEvaluate <em>Evaluate</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl#getCurrentLevel <em>Current Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSConstraintImpl extends MinimalEObjectImpl.Container implements QoSConstraint {
	/**
	 * The cached value of the '{@link #getEvaluate() <em>Evaluate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluate()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSValue> evaluate;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final QualificationKind QUALIFICATION_EDEFAULT = QualificationKind.GUARANTEE;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected QualificationKind qualification = QUALIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperators LOGICAL_OPERATOR_EDEFAULT = LogicalOperators.AND;

	/**
	 * The cached value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperators logicalOperator = LOGICAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected QoSConstraint next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected QoSConstraint previous;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected QoSContext context;

	/**
	 * The cached value of the '{@link #getCurrentLevel() <em>Current Level</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSLevel> currentLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SCONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSValue> getEvaluate() {
		if (evaluate == null) {
			evaluate = new EObjectResolvingEList<QoSValue>(QoSValue.class, this, QFTPPackage.QO_SCONSTRAINT__EVALUATE);
		}
		return evaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationKind getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualification(QualificationKind newQualification) {
		QualificationKind oldQualification = qualification;
		qualification = newQualification == null ? QUALIFICATION_EDEFAULT : newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCONSTRAINT__QUALIFICATION,
					oldQualification, qualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperators getLogicalOperator() {
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperator(LogicalOperators newLogicalOperator) {
		LogicalOperators oldLogicalOperator = logicalOperator;
		logicalOperator = newLogicalOperator == null ? LOGICAL_OPERATOR_EDEFAULT : newLogicalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCONSTRAINT__LOGICAL_OPERATOR,
					oldLogicalOperator, logicalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSConstraint getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (QoSConstraint) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QFTPPackage.QO_SCONSTRAINT__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSConstraint basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(QoSConstraint newNext, NotificationChain msgs) {
		QoSConstraint oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCONSTRAINT__NEXT, oldNext, newNext);
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
	public void setNext(QoSConstraint newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, QFTPPackage.QO_SCONSTRAINT__PREVIOUS,
						QoSConstraint.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this, QFTPPackage.QO_SCONSTRAINT__PREVIOUS,
						QoSConstraint.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCONSTRAINT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSConstraint getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject) previous;
			previous = (QoSConstraint) eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QFTPPackage.QO_SCONSTRAINT__PREVIOUS,
							oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSConstraint basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(QoSConstraint newPrevious, NotificationChain msgs) {
		QoSConstraint oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCONSTRAINT__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(QoSConstraint newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this, QFTPPackage.QO_SCONSTRAINT__NEXT,
						QoSConstraint.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this, QFTPPackage.QO_SCONSTRAINT__NEXT,
						QoSConstraint.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCONSTRAINT__PREVIOUS, newPrevious,
					newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSContext getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (QoSContext) eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QFTPPackage.QO_SCONSTRAINT__CONTEXT,
							oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(QoSContext newContext, NotificationChain msgs) {
		QoSContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCONSTRAINT__CONTEXT, oldContext, newContext);
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
	public void setContext(QoSContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this, QFTPPackage.QO_SCONTEXT__SUPPORT,
						QoSContext.class, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this, QFTPPackage.QO_SCONTEXT__SUPPORT,
						QoSContext.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCONSTRAINT__CONTEXT, newContext,
					newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSLevel> getCurrentLevel() {
		if (currentLevel == null) {
			currentLevel = new EObjectWithInverseResolvingEList.ManyInverse<QoSLevel>(QoSLevel.class, this,
					QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL, QFTPPackage.QO_SLEVEL__ALLOWED_SPACE);
		}
		return currentLevel;
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
		case QFTPPackage.QO_SCONSTRAINT__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, QFTPPackage.QO_SCONSTRAINT__PREVIOUS,
						QoSConstraint.class, msgs);
			return basicSetNext((QoSConstraint) otherEnd, msgs);
		case QFTPPackage.QO_SCONSTRAINT__PREVIOUS:
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this, QFTPPackage.QO_SCONSTRAINT__NEXT,
						QoSConstraint.class, msgs);
			return basicSetPrevious((QoSConstraint) otherEnd, msgs);
		case QFTPPackage.QO_SCONSTRAINT__CONTEXT:
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this, QFTPPackage.QO_SCONTEXT__SUPPORT,
						QoSContext.class, msgs);
			return basicSetContext((QoSContext) otherEnd, msgs);
		case QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCurrentLevel()).basicAdd(otherEnd, msgs);
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
		case QFTPPackage.QO_SCONSTRAINT__NEXT:
			return basicSetNext(null, msgs);
		case QFTPPackage.QO_SCONSTRAINT__PREVIOUS:
			return basicSetPrevious(null, msgs);
		case QFTPPackage.QO_SCONSTRAINT__CONTEXT:
			return basicSetContext(null, msgs);
		case QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL:
			return ((InternalEList<?>) getCurrentLevel()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SCONSTRAINT__EVALUATE:
			return getEvaluate();
		case QFTPPackage.QO_SCONSTRAINT__QUALIFICATION:
			return getQualification();
		case QFTPPackage.QO_SCONSTRAINT__LOGICAL_OPERATOR:
			return getLogicalOperator();
		case QFTPPackage.QO_SCONSTRAINT__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case QFTPPackage.QO_SCONSTRAINT__PREVIOUS:
			if (resolve)
				return getPrevious();
			return basicGetPrevious();
		case QFTPPackage.QO_SCONSTRAINT__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL:
			return getCurrentLevel();
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
		case QFTPPackage.QO_SCONSTRAINT__EVALUATE:
			getEvaluate().clear();
			getEvaluate().addAll((Collection<? extends QoSValue>) newValue);
			return;
		case QFTPPackage.QO_SCONSTRAINT__QUALIFICATION:
			setQualification((QualificationKind) newValue);
			return;
		case QFTPPackage.QO_SCONSTRAINT__LOGICAL_OPERATOR:
			setLogicalOperator((LogicalOperators) newValue);
			return;
		case QFTPPackage.QO_SCONSTRAINT__NEXT:
			setNext((QoSConstraint) newValue);
			return;
		case QFTPPackage.QO_SCONSTRAINT__PREVIOUS:
			setPrevious((QoSConstraint) newValue);
			return;
		case QFTPPackage.QO_SCONSTRAINT__CONTEXT:
			setContext((QoSContext) newValue);
			return;
		case QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL:
			getCurrentLevel().clear();
			getCurrentLevel().addAll((Collection<? extends QoSLevel>) newValue);
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
		case QFTPPackage.QO_SCONSTRAINT__EVALUATE:
			getEvaluate().clear();
			return;
		case QFTPPackage.QO_SCONSTRAINT__QUALIFICATION:
			setQualification(QUALIFICATION_EDEFAULT);
			return;
		case QFTPPackage.QO_SCONSTRAINT__LOGICAL_OPERATOR:
			setLogicalOperator(LOGICAL_OPERATOR_EDEFAULT);
			return;
		case QFTPPackage.QO_SCONSTRAINT__NEXT:
			setNext((QoSConstraint) null);
			return;
		case QFTPPackage.QO_SCONSTRAINT__PREVIOUS:
			setPrevious((QoSConstraint) null);
			return;
		case QFTPPackage.QO_SCONSTRAINT__CONTEXT:
			setContext((QoSContext) null);
			return;
		case QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL:
			getCurrentLevel().clear();
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
		case QFTPPackage.QO_SCONSTRAINT__EVALUATE:
			return evaluate != null && !evaluate.isEmpty();
		case QFTPPackage.QO_SCONSTRAINT__QUALIFICATION:
			return qualification != QUALIFICATION_EDEFAULT;
		case QFTPPackage.QO_SCONSTRAINT__LOGICAL_OPERATOR:
			return logicalOperator != LOGICAL_OPERATOR_EDEFAULT;
		case QFTPPackage.QO_SCONSTRAINT__NEXT:
			return next != null;
		case QFTPPackage.QO_SCONSTRAINT__PREVIOUS:
			return previous != null;
		case QFTPPackage.QO_SCONSTRAINT__CONTEXT:
			return context != null;
		case QFTPPackage.QO_SCONSTRAINT__CURRENT_LEVEL:
			return currentLevel != null && !currentLevel.isEmpty();
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
		result.append(" (qualification: ");
		result.append(qualification);
		result.append(", logicalOperator: ");
		result.append(logicalOperator);
		result.append(')');
		return result.toString();
	}

} //QoSConstraintImpl
