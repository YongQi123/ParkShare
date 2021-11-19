/**
 */
package sPTP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sPTP.Descriptor;
import sPTP.EventOccurence;
import sPTP.Instance;
import sPTP.SPTPPackage;
import sPTP.Sptp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sptp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sPTP.impl.SptpImpl#getEventoccurence <em>Eventoccurence</em>}</li>
 *   <li>{@link sPTP.impl.SptpImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link sPTP.impl.SptpImpl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SptpImpl extends MinimalEObjectImpl.Container implements Sptp {
	/**
	 * The cached value of the '{@link #getEventoccurence() <em>Eventoccurence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventoccurence()
	 * @generated
	 * @ordered
	 */
	protected EList<EventOccurence> eventoccurence;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instance;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Descriptor> descriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SptpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPTPPackage.Literals.SPTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventOccurence> getEventoccurence() {
		if (eventoccurence == null) {
			eventoccurence = new EObjectContainmentEList<EventOccurence>(EventOccurence.class, this,
					SPTPPackage.SPTP__EVENTOCCURENCE);
		}
		return eventoccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<Instance>(Instance.class, this, SPTPPackage.SPTP__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Descriptor> getDescriptor() {
		if (descriptor == null) {
			descriptor = new EObjectContainmentEList<Descriptor>(Descriptor.class, this, SPTPPackage.SPTP__DESCRIPTOR);
		}
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SPTPPackage.SPTP__EVENTOCCURENCE:
			return ((InternalEList<?>) getEventoccurence()).basicRemove(otherEnd, msgs);
		case SPTPPackage.SPTP__INSTANCE:
			return ((InternalEList<?>) getInstance()).basicRemove(otherEnd, msgs);
		case SPTPPackage.SPTP__DESCRIPTOR:
			return ((InternalEList<?>) getDescriptor()).basicRemove(otherEnd, msgs);
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
		case SPTPPackage.SPTP__EVENTOCCURENCE:
			return getEventoccurence();
		case SPTPPackage.SPTP__INSTANCE:
			return getInstance();
		case SPTPPackage.SPTP__DESCRIPTOR:
			return getDescriptor();
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
		case SPTPPackage.SPTP__EVENTOCCURENCE:
			getEventoccurence().clear();
			getEventoccurence().addAll((Collection<? extends EventOccurence>) newValue);
			return;
		case SPTPPackage.SPTP__INSTANCE:
			getInstance().clear();
			getInstance().addAll((Collection<? extends Instance>) newValue);
			return;
		case SPTPPackage.SPTP__DESCRIPTOR:
			getDescriptor().clear();
			getDescriptor().addAll((Collection<? extends Descriptor>) newValue);
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
		case SPTPPackage.SPTP__EVENTOCCURENCE:
			getEventoccurence().clear();
			return;
		case SPTPPackage.SPTP__INSTANCE:
			getInstance().clear();
			return;
		case SPTPPackage.SPTP__DESCRIPTOR:
			getDescriptor().clear();
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
		case SPTPPackage.SPTP__EVENTOCCURENCE:
			return eventoccurence != null && !eventoccurence.isEmpty();
		case SPTPPackage.SPTP__INSTANCE:
			return instance != null && !instance.isEmpty();
		case SPTPPackage.SPTP__DESCRIPTOR:
			return descriptor != null && !descriptor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SptpImpl
