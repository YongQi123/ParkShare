/**
 */
package org.eclipse.sirius.sample.QFTP.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.sample.QFTP.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QFTPFactoryImpl extends EFactoryImpl implements QFTPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QFTPFactory init() {
		try {
			QFTPFactory theQFTPFactory = (QFTPFactory) EPackage.Registry.INSTANCE.getEFactory(QFTPPackage.eNS_URI);
			if (theQFTPFactory != null) {
				return theQFTPFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QFTPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFTPFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QFTPPackage.QO_SREQUIRED:
			return createQoSRequired();
		case QFTPPackage.QO_SCHARACTERISTICS:
			return createQoSCharacteristics();
		case QFTPPackage.QO_SLEVEL:
			return createQoSLevel();
		case QFTPPackage.QO_SDIMENSION:
			return createQoSDimension();
		case QFTPPackage.QO_SPARAMETER:
			return createQoSParameter();
		case QFTPPackage.QO_SCOMPOUND_LEVEL:
			return createQoSCompoundLevel();
		case QFTPPackage.QO_SDIMENTION_SLOT:
			return createQoSDimentionSlot();
		case QFTPPackage.QO_SVALUE:
			return createQoSValue();
		case QFTPPackage.QO_SOFFERED:
			return createQoSOffered();
		case QFTPPackage.QO_SCONSTRAINT:
			return createQoSConstraint();
		case QFTPPackage.QO_SCONTEXT:
			return createQoSContext();
		case QFTPPackage.QO_STRANSITION:
			return createQoSTransition();
		case QFTPPackage.QO_SCONTRACT:
			return createQoSContract();
		case QFTPPackage.QO_SCATEGORY:
			return createQoSCategory();
		case QFTPPackage.QO_SCOMPOUND_CONSTRAINT:
			return createQoSCompoundConstraint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QFTPPackage.QO_SSTATISTICAL_ATTRIBUTE:
			return createQoSStatisticalAttributeFromString(eDataType, initialValue);
		case QFTPPackage.QUALIFICATION_KIND:
			return createQualificationKindFromString(eDataType, initialValue);
		case QFTPPackage.DIRECTION_KIND:
			return createDirectionKindFromString(eDataType, initialValue);
		case QFTPPackage.LOGICAL_OPERATORS:
			return createLogicalOperatorsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QFTPPackage.QO_SSTATISTICAL_ATTRIBUTE:
			return convertQoSStatisticalAttributeToString(eDataType, instanceValue);
		case QFTPPackage.QUALIFICATION_KIND:
			return convertQualificationKindToString(eDataType, instanceValue);
		case QFTPPackage.DIRECTION_KIND:
			return convertDirectionKindToString(eDataType, instanceValue);
		case QFTPPackage.LOGICAL_OPERATORS:
			return convertLogicalOperatorsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSRequired createQoSRequired() {
		QoSRequiredImpl qoSRequired = new QoSRequiredImpl();
		return qoSRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCharacteristics createQoSCharacteristics() {
		QoSCharacteristicsImpl qoSCharacteristics = new QoSCharacteristicsImpl();
		return qoSCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSLevel createQoSLevel() {
		QoSLevelImpl qoSLevel = new QoSLevelImpl();
		return qoSLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSDimension createQoSDimension() {
		QoSDimensionImpl qoSDimension = new QoSDimensionImpl();
		return qoSDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSParameter createQoSParameter() {
		QoSParameterImpl qoSParameter = new QoSParameterImpl();
		return qoSParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCompoundLevel createQoSCompoundLevel() {
		QoSCompoundLevelImpl qoSCompoundLevel = new QoSCompoundLevelImpl();
		return qoSCompoundLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSDimentionSlot createQoSDimentionSlot() {
		QoSDimentionSlotImpl qoSDimentionSlot = new QoSDimentionSlotImpl();
		return qoSDimentionSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSValue createQoSValue() {
		QoSValueImpl qoSValue = new QoSValueImpl();
		return qoSValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSOffered createQoSOffered() {
		QoSOfferedImpl qoSOffered = new QoSOfferedImpl();
		return qoSOffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSConstraint createQoSConstraint() {
		QoSConstraintImpl qoSConstraint = new QoSConstraintImpl();
		return qoSConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSContext createQoSContext() {
		QoSContextImpl qoSContext = new QoSContextImpl();
		return qoSContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSTransition createQoSTransition() {
		QoSTransitionImpl qoSTransition = new QoSTransitionImpl();
		return qoSTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSContract createQoSContract() {
		QoSContractImpl qoSContract = new QoSContractImpl();
		return qoSContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCategory createQoSCategory() {
		QoSCategoryImpl qoSCategory = new QoSCategoryImpl();
		return qoSCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCompoundConstraint createQoSCompoundConstraint() {
		QoSCompoundConstraintImpl qoSCompoundConstraint = new QoSCompoundConstraintImpl();
		return qoSCompoundConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSStatisticalAttribute createQoSStatisticalAttributeFromString(EDataType eDataType, String initialValue) {
		QoSStatisticalAttribute result = QoSStatisticalAttribute.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQoSStatisticalAttributeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationKind createQualificationKindFromString(EDataType eDataType, String initialValue) {
		QualificationKind result = QualificationKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualificationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind createDirectionKindFromString(EDataType eDataType, String initialValue) {
		DirectionKind result = DirectionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperators createLogicalOperatorsFromString(EDataType eDataType, String initialValue) {
		LogicalOperators result = LogicalOperators.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFTPPackage getQFTPPackage() {
		return (QFTPPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QFTPPackage getPackage() {
		return QFTPPackage.eINSTANCE;
	}

} //QFTPFactoryImpl
