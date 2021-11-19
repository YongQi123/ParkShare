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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSCharacteristics;
import org.eclipse.sirius.sample.QFTP.QoSContext;
import org.eclipse.sirius.sample.QFTP.QoSDimension;
import org.eclipse.sirius.sample.QFTP.QoSParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SCharacteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#isIsInvariant <em>Is Invariant</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#getQSub <em>QSub</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#getQParent <em>QParent</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#getQTemplate <em>QTemplate</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#getQDerivation <em>QDerivation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSCharacteristicsImpl extends QoSContextImpl implements QoSCharacteristics {
	/**
	 * The default value of the '{@link #isIsInvariant() <em>Is Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInvariant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INVARIANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInvariant() <em>Is Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInvariant()
	 * @generated
	 * @ordered
	 */
	protected boolean isInvariant = IS_INVARIANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQSub() <em>QSub</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQSub()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSCharacteristics> qSub;

	/**
	 * The cached value of the '{@link #getQParent() <em>QParent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQParent()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSCharacteristics> qParent;

	/**
	 * The cached value of the '{@link #getQTemplate() <em>QTemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQTemplate()
	 * @generated
	 * @ordered
	 */
	protected QoSCharacteristics qTemplate;

	/**
	 * The cached value of the '{@link #getQDerivation() <em>QDerivation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDerivation()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSCharacteristics> qDerivation;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected QoSDimension dimension;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSParameter> parameter;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSContext> context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFTPPackage.Literals.QO_SCHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInvariant() {
		return isInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSCharacteristics> getQSub() {
		if (qSub == null) {
			qSub = new EObjectWithInverseResolvingEList.ManyInverse<QoSCharacteristics>(QoSCharacteristics.class, this,
					QFTPPackage.QO_SCHARACTERISTICS__QSUB, QFTPPackage.QO_SCHARACTERISTICS__QPARENT);
		}
		return qSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSCharacteristics> getQParent() {
		if (qParent == null) {
			qParent = new EObjectWithInverseResolvingEList.ManyInverse<QoSCharacteristics>(QoSCharacteristics.class,
					this, QFTPPackage.QO_SCHARACTERISTICS__QPARENT, QFTPPackage.QO_SCHARACTERISTICS__QSUB);
		}
		return qParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCharacteristics getQTemplate() {
		if (qTemplate != null && qTemplate.eIsProxy()) {
			InternalEObject oldQTemplate = (InternalEObject) qTemplate;
			qTemplate = (QoSCharacteristics) eResolveProxy(oldQTemplate);
			if (qTemplate != oldQTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE, oldQTemplate, qTemplate));
			}
		}
		return qTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCharacteristics basicGetQTemplate() {
		return qTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQTemplate(QoSCharacteristics newQTemplate, NotificationChain msgs) {
		QoSCharacteristics oldQTemplate = qTemplate;
		qTemplate = newQTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE, oldQTemplate, newQTemplate);
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
	public void setQTemplate(QoSCharacteristics newQTemplate) {
		if (newQTemplate != qTemplate) {
			NotificationChain msgs = null;
			if (qTemplate != null)
				msgs = ((InternalEObject) qTemplate).eInverseRemove(this, QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION,
						QoSCharacteristics.class, msgs);
			if (newQTemplate != null)
				msgs = ((InternalEObject) newQTemplate).eInverseAdd(this, QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION,
						QoSCharacteristics.class, msgs);
			msgs = basicSetQTemplate(newQTemplate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE,
					newQTemplate, newQTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSCharacteristics> getQDerivation() {
		if (qDerivation == null) {
			qDerivation = new EObjectWithInverseResolvingEList<QoSCharacteristics>(QoSCharacteristics.class, this,
					QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION, QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE);
		}
		return qDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSDimension getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(QoSDimension newDimension, NotificationChain msgs) {
		QoSDimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QFTPPackage.QO_SCHARACTERISTICS__DIMENSION, oldDimension, newDimension);
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
	public void setDimension(QoSDimension newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject) dimension).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SCHARACTERISTICS__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject) newDimension).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QFTPPackage.QO_SCHARACTERISTICS__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFTPPackage.QO_SCHARACTERISTICS__DIMENSION,
					newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<QoSParameter>(QoSParameter.class, this,
					QFTPPackage.QO_SCHARACTERISTICS__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSContext> getContext() {
		if (context == null) {
			context = new EObjectWithInverseResolvingEList.ManyInverse<QoSContext>(QoSContext.class, this,
					QFTPPackage.QO_SCHARACTERISTICS__CONTEXT, QFTPPackage.QO_SCONTEXT__BASED_ON);
		}
		return context;
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
		case QFTPPackage.QO_SCHARACTERISTICS__QSUB:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQSub()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__QPARENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQParent()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE:
			if (qTemplate != null)
				msgs = ((InternalEObject) qTemplate).eInverseRemove(this, QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION,
						QoSCharacteristics.class, msgs);
			return basicSetQTemplate((QoSCharacteristics) otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQDerivation()).basicAdd(otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__CONTEXT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContext()).basicAdd(otherEnd, msgs);
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
		case QFTPPackage.QO_SCHARACTERISTICS__QSUB:
			return ((InternalEList<?>) getQSub()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__QPARENT:
			return ((InternalEList<?>) getQParent()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE:
			return basicSetQTemplate(null, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION:
			return ((InternalEList<?>) getQDerivation()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__DIMENSION:
			return basicSetDimension(null, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		case QFTPPackage.QO_SCHARACTERISTICS__CONTEXT:
			return ((InternalEList<?>) getContext()).basicRemove(otherEnd, msgs);
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
		case QFTPPackage.QO_SCHARACTERISTICS__IS_INVARIANT:
			return isIsInvariant();
		case QFTPPackage.QO_SCHARACTERISTICS__QSUB:
			return getQSub();
		case QFTPPackage.QO_SCHARACTERISTICS__QPARENT:
			return getQParent();
		case QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE:
			if (resolve)
				return getQTemplate();
			return basicGetQTemplate();
		case QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION:
			return getQDerivation();
		case QFTPPackage.QO_SCHARACTERISTICS__DIMENSION:
			return getDimension();
		case QFTPPackage.QO_SCHARACTERISTICS__PARAMETER:
			return getParameter();
		case QFTPPackage.QO_SCHARACTERISTICS__CONTEXT:
			return getContext();
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
		case QFTPPackage.QO_SCHARACTERISTICS__QSUB:
			getQSub().clear();
			getQSub().addAll((Collection<? extends QoSCharacteristics>) newValue);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__QPARENT:
			getQParent().clear();
			getQParent().addAll((Collection<? extends QoSCharacteristics>) newValue);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE:
			setQTemplate((QoSCharacteristics) newValue);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION:
			getQDerivation().clear();
			getQDerivation().addAll((Collection<? extends QoSCharacteristics>) newValue);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__DIMENSION:
			setDimension((QoSDimension) newValue);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends QoSParameter>) newValue);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__CONTEXT:
			getContext().clear();
			getContext().addAll((Collection<? extends QoSContext>) newValue);
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
		case QFTPPackage.QO_SCHARACTERISTICS__QSUB:
			getQSub().clear();
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__QPARENT:
			getQParent().clear();
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE:
			setQTemplate((QoSCharacteristics) null);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION:
			getQDerivation().clear();
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__DIMENSION:
			setDimension((QoSDimension) null);
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__PARAMETER:
			getParameter().clear();
			return;
		case QFTPPackage.QO_SCHARACTERISTICS__CONTEXT:
			getContext().clear();
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
		case QFTPPackage.QO_SCHARACTERISTICS__IS_INVARIANT:
			return isInvariant != IS_INVARIANT_EDEFAULT;
		case QFTPPackage.QO_SCHARACTERISTICS__QSUB:
			return qSub != null && !qSub.isEmpty();
		case QFTPPackage.QO_SCHARACTERISTICS__QPARENT:
			return qParent != null && !qParent.isEmpty();
		case QFTPPackage.QO_SCHARACTERISTICS__QTEMPLATE:
			return qTemplate != null;
		case QFTPPackage.QO_SCHARACTERISTICS__QDERIVATION:
			return qDerivation != null && !qDerivation.isEmpty();
		case QFTPPackage.QO_SCHARACTERISTICS__DIMENSION:
			return dimension != null;
		case QFTPPackage.QO_SCHARACTERISTICS__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case QFTPPackage.QO_SCHARACTERISTICS__CONTEXT:
			return context != null && !context.isEmpty();
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
		result.append(" (isInvariant: ");
		result.append(isInvariant);
		result.append(')');
		return result.toString();
	}

} //QoSCharacteristicsImpl
