/**
 */
package sPTP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sPTP.ResourceUsage;
import sPTP.SPTPPackage;
import sPTP.UsageDemand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sPTP.impl.UsageDemandImpl#getResourceusage <em>Resourceusage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageDemandImpl extends EventOccurenceImpl implements UsageDemand {
	/**
	 * The cached value of the '{@link #getResourceusage() <em>Resourceusage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceusage()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceUsage> resourceusage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageDemandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPTPPackage.Literals.USAGE_DEMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceUsage> getResourceusage() {
		if (resourceusage == null) {
			resourceusage = new EObjectContainmentEList<ResourceUsage>(ResourceUsage.class, this,
					SPTPPackage.USAGE_DEMAND__RESOURCEUSAGE);
		}
		return resourceusage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SPTPPackage.USAGE_DEMAND__RESOURCEUSAGE:
			return ((InternalEList<?>) getResourceusage()).basicRemove(otherEnd, msgs);
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
		case SPTPPackage.USAGE_DEMAND__RESOURCEUSAGE:
			return getResourceusage();
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
		case SPTPPackage.USAGE_DEMAND__RESOURCEUSAGE:
			getResourceusage().clear();
			getResourceusage().addAll((Collection<? extends ResourceUsage>) newValue);
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
		case SPTPPackage.USAGE_DEMAND__RESOURCEUSAGE:
			getResourceusage().clear();
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
		case SPTPPackage.USAGE_DEMAND__RESOURCEUSAGE:
			return resourceusage != null && !resourceusage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsageDemandImpl
