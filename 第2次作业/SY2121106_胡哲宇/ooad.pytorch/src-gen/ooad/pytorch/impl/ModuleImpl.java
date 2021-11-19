/**
 */
package ooad.pytorch.impl;

import java.util.Collection;

import ooad.pytorch.PytorchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ooad.pytorch.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ooad.pytorch.impl.ModuleImpl#getNext <em>Next</em>}</li>
 *   <li>{@link ooad.pytorch.impl.ModuleImpl#getPrev <em>Prev</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModuleImpl extends MinimalEObjectImpl.Container implements ooad.pytorch.Module {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<ooad.pytorch.Module> next;

	/**
	 * The cached value of the '{@link #getPrev() <em>Prev</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev()
	 * @generated
	 * @ordered
	 */
	protected EList<ooad.pytorch.Module> prev;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PytorchPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PytorchPackage.MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ooad.pytorch.Module> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<ooad.pytorch.Module>(ooad.pytorch.Module.class,
					this, PytorchPackage.MODULE__NEXT, PytorchPackage.MODULE__PREV);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ooad.pytorch.Module> getPrev() {
		if (prev == null) {
			prev = new EObjectWithInverseResolvingEList.ManyInverse<ooad.pytorch.Module>(ooad.pytorch.Module.class,
					this, PytorchPackage.MODULE__PREV, PytorchPackage.MODULE__NEXT);
		}
		return prev;
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
		case PytorchPackage.MODULE__NEXT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNext()).basicAdd(otherEnd, msgs);
		case PytorchPackage.MODULE__PREV:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrev()).basicAdd(otherEnd, msgs);
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
		case PytorchPackage.MODULE__NEXT:
			return ((InternalEList<?>) getNext()).basicRemove(otherEnd, msgs);
		case PytorchPackage.MODULE__PREV:
			return ((InternalEList<?>) getPrev()).basicRemove(otherEnd, msgs);
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
		case PytorchPackage.MODULE__NAME:
			return getName();
		case PytorchPackage.MODULE__NEXT:
			return getNext();
		case PytorchPackage.MODULE__PREV:
			return getPrev();
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
		case PytorchPackage.MODULE__NAME:
			setName((String) newValue);
			return;
		case PytorchPackage.MODULE__NEXT:
			getNext().clear();
			getNext().addAll((Collection<? extends ooad.pytorch.Module>) newValue);
			return;
		case PytorchPackage.MODULE__PREV:
			getPrev().clear();
			getPrev().addAll((Collection<? extends ooad.pytorch.Module>) newValue);
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
		case PytorchPackage.MODULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PytorchPackage.MODULE__NEXT:
			getNext().clear();
			return;
		case PytorchPackage.MODULE__PREV:
			getPrev().clear();
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
		case PytorchPackage.MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PytorchPackage.MODULE__NEXT:
			return next != null && !next.isEmpty();
		case PytorchPackage.MODULE__PREV:
			return prev != null && !prev.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
