/**
 */
package org.eclipse.sirius.sample.QFTP.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sirius.sample.QFTP.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage
 * @generated
 */
public class QFTPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QFTPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFTPSwitch() {
		if (modelPackage == null) {
			modelPackage = QFTPPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case QFTPPackage.QO_SREQUIRED: {
			QoSRequired qoSRequired = (QoSRequired) theEObject;
			T result = caseQoSRequired(qoSRequired);
			if (result == null)
				result = caseQoSConstraint(qoSRequired);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SCHARACTERISTICS: {
			QoSCharacteristics qoSCharacteristics = (QoSCharacteristics) theEObject;
			T result = caseQoSCharacteristics(qoSCharacteristics);
			if (result == null)
				result = caseQoSContext(qoSCharacteristics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SLEVEL: {
			QoSLevel qoSLevel = (QoSLevel) theEObject;
			T result = caseQoSLevel(qoSLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SDIMENSION: {
			QoSDimension qoSDimension = (QoSDimension) theEObject;
			T result = caseQoSDimension(qoSDimension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SPARAMETER: {
			QoSParameter qoSParameter = (QoSParameter) theEObject;
			T result = caseQoSParameter(qoSParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SCOMPOUND_LEVEL: {
			QoSCompoundLevel qoSCompoundLevel = (QoSCompoundLevel) theEObject;
			T result = caseQoSCompoundLevel(qoSCompoundLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SDIMENTION_SLOT: {
			QoSDimentionSlot qoSDimentionSlot = (QoSDimentionSlot) theEObject;
			T result = caseQoSDimentionSlot(qoSDimentionSlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SVALUE: {
			QoSValue qoSValue = (QoSValue) theEObject;
			T result = caseQoSValue(qoSValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SOFFERED: {
			QoSOffered qoSOffered = (QoSOffered) theEObject;
			T result = caseQoSOffered(qoSOffered);
			if (result == null)
				result = caseQoSConstraint(qoSOffered);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SCONSTRAINT: {
			QoSConstraint qoSConstraint = (QoSConstraint) theEObject;
			T result = caseQoSConstraint(qoSConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SCONTEXT: {
			QoSContext qoSContext = (QoSContext) theEObject;
			T result = caseQoSContext(qoSContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_STRANSITION: {
			QoSTransition qoSTransition = (QoSTransition) theEObject;
			T result = caseQoSTransition(qoSTransition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SCONTRACT: {
			QoSContract qoSContract = (QoSContract) theEObject;
			T result = caseQoSContract(qoSContract);
			if (result == null)
				result = caseQoSConstraint(qoSContract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SCATEGORY: {
			QoSCategory qoSCategory = (QoSCategory) theEObject;
			T result = caseQoSCategory(qoSCategory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT: {
			QoSCompoundConstraint qoSCompoundConstraint = (QoSCompoundConstraint) theEObject;
			T result = caseQoSCompoundConstraint(qoSCompoundConstraint);
			if (result == null)
				result = caseQoSConstraint(qoSCompoundConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SRequired</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SRequired</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSRequired(QoSRequired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SCharacteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SCharacteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSCharacteristics(QoSCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SLevel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SLevel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSLevel(QoSLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SDimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SDimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSDimension(QoSDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSParameter(QoSParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SCompound Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SCompound Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSCompoundLevel(QoSCompoundLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SDimention Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SDimention Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSDimentionSlot(QoSDimentionSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SValue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSValue(QoSValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SOffered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SOffered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSOffered(QoSOffered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SConstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSConstraint(QoSConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSContext(QoSContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo STransition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo STransition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSTransition(QoSTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SContract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SContract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSContract(QoSContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SCategory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SCategory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSCategory(QoSCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SCompound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SCompound Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSCompoundConstraint(QoSCompoundConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QFTPSwitch
