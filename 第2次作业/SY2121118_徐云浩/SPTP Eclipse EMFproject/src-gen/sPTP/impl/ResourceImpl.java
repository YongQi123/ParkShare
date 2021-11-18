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

import sPTP.Resource;
import sPTP.ResourceService;
import sPTP.SPTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sPTP.impl.ResourceImpl#getResourceservice <em>Resourceservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends DescriptorImpl implements Resource {
	/**
	 * The cached value of the '{@link #getResourceservice() <em>Resourceservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceservice()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> resourceservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPTPPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getResourceservice() {
		if (resourceservice == null) {
			resourceservice = new EObjectContainmentEList<ResourceService>(ResourceService.class, this,
					SPTPPackage.RESOURCE__RESOURCESERVICE);
		}
		return resourceservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SPTPPackage.RESOURCE__RESOURCESERVICE:
			return ((InternalEList<?>) getResourceservice()).basicRemove(otherEnd, msgs);
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
		case SPTPPackage.RESOURCE__RESOURCESERVICE:
			return getResourceservice();
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
		case SPTPPackage.RESOURCE__RESOURCESERVICE:
			getResourceservice().clear();
			getResourceservice().addAll((Collection<? extends ResourceService>) newValue);
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
		case SPTPPackage.RESOURCE__RESOURCESERVICE:
			getResourceservice().clear();
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
		case SPTPPackage.RESOURCE__RESOURCESERVICE:
			return resourceservice != null && !resourceservice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
