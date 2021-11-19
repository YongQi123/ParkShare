/**
 */
package org.eclipse.sirius.sample.QFTP.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.sample.QFTP.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage
 * @generated
 */
public class QFTPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QFTPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFTPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QFTPPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QFTPSwitch<Adapter> modelSwitch = new QFTPSwitch<Adapter>() {
		@Override
		public Adapter caseQoSRequired(QoSRequired object) {
			return createQoSRequiredAdapter();
		}

		@Override
		public Adapter caseQoSCharacteristics(QoSCharacteristics object) {
			return createQoSCharacteristicsAdapter();
		}

		@Override
		public Adapter caseQoSLevel(QoSLevel object) {
			return createQoSLevelAdapter();
		}

		@Override
		public Adapter caseQoSDimension(QoSDimension object) {
			return createQoSDimensionAdapter();
		}

		@Override
		public Adapter caseQoSParameter(QoSParameter object) {
			return createQoSParameterAdapter();
		}

		@Override
		public Adapter caseQoSCompoundLevel(QoSCompoundLevel object) {
			return createQoSCompoundLevelAdapter();
		}

		@Override
		public Adapter caseQoSDimentionSlot(QoSDimentionSlot object) {
			return createQoSDimentionSlotAdapter();
		}

		@Override
		public Adapter caseQoSValue(QoSValue object) {
			return createQoSValueAdapter();
		}

		@Override
		public Adapter caseQoSOffered(QoSOffered object) {
			return createQoSOfferedAdapter();
		}

		@Override
		public Adapter caseQoSConstraint(QoSConstraint object) {
			return createQoSConstraintAdapter();
		}

		@Override
		public Adapter caseQoSContext(QoSContext object) {
			return createQoSContextAdapter();
		}

		@Override
		public Adapter caseQoSTransition(QoSTransition object) {
			return createQoSTransitionAdapter();
		}

		@Override
		public Adapter caseQoSContract(QoSContract object) {
			return createQoSContractAdapter();
		}

		@Override
		public Adapter caseQoSCategory(QoSCategory object) {
			return createQoSCategoryAdapter();
		}

		@Override
		public Adapter caseQoSCompoundConstraint(QoSCompoundConstraint object) {
			return createQoSCompoundConstraintAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSRequired <em>Qo SRequired</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSRequired
	 * @generated
	 */
	public Adapter createQoSRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics <em>Qo SCharacteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics
	 * @generated
	 */
	public Adapter createQoSCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSLevel <em>Qo SLevel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel
	 * @generated
	 */
	public Adapter createQoSLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSDimension <em>Qo SDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimension
	 * @generated
	 */
	public Adapter createQoSDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSParameter <em>Qo SParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSParameter
	 * @generated
	 */
	public Adapter createQoSParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel <em>Qo SCompound Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundLevel
	 * @generated
	 */
	public Adapter createQoSCompoundLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSDimentionSlot <em>Qo SDimention Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimentionSlot
	 * @generated
	 */
	public Adapter createQoSDimentionSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSValue <em>Qo SValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSValue
	 * @generated
	 */
	public Adapter createQoSValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSOffered <em>Qo SOffered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSOffered
	 * @generated
	 */
	public Adapter createQoSOfferedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint <em>Qo SConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint
	 * @generated
	 */
	public Adapter createQoSConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSContext <em>Qo SContext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext
	 * @generated
	 */
	public Adapter createQoSContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSTransition <em>Qo STransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSTransition
	 * @generated
	 */
	public Adapter createQoSTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSContract <em>Qo SContract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContract
	 * @generated
	 */
	public Adapter createQoSContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSCategory <em>Qo SCategory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCategory
	 * @generated
	 */
	public Adapter createQoSCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint <em>Qo SCompound Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint
	 * @generated
	 */
	public Adapter createQoSCompoundConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QFTPAdapterFactory
