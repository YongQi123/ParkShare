/**
 */
package sPTP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sPTP.ActionExecution;
import sPTP.SPTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sPTP.impl.ActionExecutionImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link sPTP.impl.ActionExecutionImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionExecutionImpl extends ScenarioImpl implements ActionExecution {
	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionExecution> predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionExecution> successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPTPPackage.Literals.ACTION_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionExecution> getPredecessor() {
		if (predecessor == null) {
			predecessor = new EObjectWithInverseResolvingEList.ManyInverse<ActionExecution>(ActionExecution.class, this,
					SPTPPackage.ACTION_EXECUTION__PREDECESSOR, SPTPPackage.ACTION_EXECUTION__SUCCESSOR);
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionExecution> getSuccessor() {
		if (successor == null) {
			successor = new EObjectWithInverseResolvingEList.ManyInverse<ActionExecution>(ActionExecution.class, this,
					SPTPPackage.ACTION_EXECUTION__SUCCESSOR, SPTPPackage.ACTION_EXECUTION__PREDECESSOR);
		}
		return successor;
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
		case SPTPPackage.ACTION_EXECUTION__PREDECESSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPredecessor()).basicAdd(otherEnd, msgs);
		case SPTPPackage.ACTION_EXECUTION__SUCCESSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuccessor()).basicAdd(otherEnd, msgs);
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
		case SPTPPackage.ACTION_EXECUTION__PREDECESSOR:
			return ((InternalEList<?>) getPredecessor()).basicRemove(otherEnd, msgs);
		case SPTPPackage.ACTION_EXECUTION__SUCCESSOR:
			return ((InternalEList<?>) getSuccessor()).basicRemove(otherEnd, msgs);
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
		case SPTPPackage.ACTION_EXECUTION__PREDECESSOR:
			return getPredecessor();
		case SPTPPackage.ACTION_EXECUTION__SUCCESSOR:
			return getSuccessor();
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
		case SPTPPackage.ACTION_EXECUTION__PREDECESSOR:
			getPredecessor().clear();
			getPredecessor().addAll((Collection<? extends ActionExecution>) newValue);
			return;
		case SPTPPackage.ACTION_EXECUTION__SUCCESSOR:
			getSuccessor().clear();
			getSuccessor().addAll((Collection<? extends ActionExecution>) newValue);
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
		case SPTPPackage.ACTION_EXECUTION__PREDECESSOR:
			getPredecessor().clear();
			return;
		case SPTPPackage.ACTION_EXECUTION__SUCCESSOR:
			getSuccessor().clear();
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
		case SPTPPackage.ACTION_EXECUTION__PREDECESSOR:
			return predecessor != null && !predecessor.isEmpty();
		case SPTPPackage.ACTION_EXECUTION__SUCCESSOR:
			return successor != null && !successor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionExecutionImpl
