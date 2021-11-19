/**
 */
package org.eclipse.sirius.sample.QFTP.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.sirius.sample.QFTP.DirectionKind;
import org.eclipse.sirius.sample.QFTP.LogicalOperators;
import org.eclipse.sirius.sample.QFTP.QFTPFactory;
import org.eclipse.sirius.sample.QFTP.QFTPPackage;
import org.eclipse.sirius.sample.QFTP.QoSCategory;
import org.eclipse.sirius.sample.QFTP.QoSCharacteristics;
import org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint;
import org.eclipse.sirius.sample.QFTP.QoSCompoundLevel;
import org.eclipse.sirius.sample.QFTP.QoSConstraint;
import org.eclipse.sirius.sample.QFTP.QoSContext;
import org.eclipse.sirius.sample.QFTP.QoSContract;
import org.eclipse.sirius.sample.QFTP.QoSDimension;
import org.eclipse.sirius.sample.QFTP.QoSDimentionSlot;
import org.eclipse.sirius.sample.QFTP.QoSLevel;
import org.eclipse.sirius.sample.QFTP.QoSOffered;
import org.eclipse.sirius.sample.QFTP.QoSParameter;
import org.eclipse.sirius.sample.QFTP.QoSRequired;
import org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute;
import org.eclipse.sirius.sample.QFTP.QoSTransition;
import org.eclipse.sirius.sample.QFTP.QoSValue;
import org.eclipse.sirius.sample.QFTP.QualificationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QFTPPackageImpl extends EPackageImpl implements QFTPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSRequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSCompoundLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSDimentionSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSOfferedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSCompoundConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qoSStatisticalAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualificationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QFTPPackageImpl() {
		super(eNS_URI, QFTPFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QFTPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QFTPPackage init() {
		if (isInited)
			return (QFTPPackage) EPackage.Registry.INSTANCE.getEPackage(QFTPPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQFTPPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QFTPPackageImpl theQFTPPackage = registeredQFTPPackage instanceof QFTPPackageImpl
				? (QFTPPackageImpl) registeredQFTPPackage
				: new QFTPPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQFTPPackage.createPackageContents();

		// Initialize created meta-data
		theQFTPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQFTPPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QFTPPackage.eNS_URI, theQFTPPackage);
		return theQFTPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSRequired() {
		return qoSRequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSRequired_Contract() {
		return (EReference) qoSRequiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSRequired_QOffered() {
		return (EReference) qoSRequiredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSCharacteristics() {
		return qoSCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoSCharacteristics_IsInvariant() {
		return (EAttribute) qoSCharacteristicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCharacteristics_QSub() {
		return (EReference) qoSCharacteristicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCharacteristics_QParent() {
		return (EReference) qoSCharacteristicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCharacteristics_QTemplate() {
		return (EReference) qoSCharacteristicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCharacteristics_QDerivation() {
		return (EReference) qoSCharacteristicsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCharacteristics_Dimension() {
		return (EReference) qoSCharacteristicsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCharacteristics_Parameter() {
		return (EReference) qoSCharacteristicsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCharacteristics_Context() {
		return (EReference) qoSCharacteristicsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSLevel() {
		return qoSLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSLevel_AllowedSpace() {
		return (EReference) qoSLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSLevel_From() {
		return (EReference) qoSLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSLevel_To() {
		return (EReference) qoSLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSDimension() {
		return qoSDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoSDimension_Direction() {
		return (EAttribute) qoSDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoSDimension_StatisticalQualifier() {
		return (EAttribute) qoSDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoSDimension_Unit() {
		return (EAttribute) qoSDimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSDimension_Type() {
		return (EReference) qoSDimensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSDimension_Evaluate() {
		return (EReference) qoSDimensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSParameter() {
		return qoSParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSCompoundLevel() {
		return qoSCompoundLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCompoundLevel_AllowedSpace() {
		return (EReference) qoSCompoundLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCompoundLevel_GroupOfLevel() {
		return (EReference) qoSCompoundLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSDimentionSlot() {
		return qoSDimentionSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSDimentionSlot_ReferencedValue() {
		return (EReference) qoSDimentionSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSValue() {
		return qoSValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSValue_OwnerValue() {
		return (EReference) qoSValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSOffered() {
		return qoSOfferedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSOffered_Contract() {
		return (EReference) qoSOfferedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSOffered_QRequired() {
		return (EReference) qoSOfferedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSConstraint() {
		return qoSConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSConstraint_Evaluate() {
		return (EReference) qoSConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoSConstraint_Qualification() {
		return (EAttribute) qoSConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoSConstraint_LogicalOperator() {
		return (EAttribute) qoSConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSConstraint_Next() {
		return (EReference) qoSConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSConstraint_Previous() {
		return (EReference) qoSConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSConstraint_Context() {
		return (EReference) qoSConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSConstraint_CurrentLevel() {
		return (EReference) qoSConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSContext() {
		return qoSContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoSContext_IsOoSObeservation() {
		return (EAttribute) qoSContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSContext_OppositeAssociation() {
		return (EReference) qoSContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSContext_Support() {
		return (EReference) qoSContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSContext_BasedOn() {
		return (EReference) qoSContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSTransition() {
		return qoSTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSTransition_Destination() {
		return (EReference) qoSTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSTransition_Source() {
		return (EReference) qoSTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSContract() {
		return qoSContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSContract_RequireAccorded() {
		return (EReference) qoSContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSContract_OfferAccorded() {
		return (EReference) qoSContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSCategory() {
		return qoSCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCategory_Referenced() {
		return (EReference) qoSCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCategory_Own() {
		return (EReference) qoSCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCategory_Group() {
		return (EReference) qoSCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSCompoundConstraint() {
		return qoSCompoundConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCompoundConstraint_Constraint() {
		return (EReference) qoSCompoundConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSCompoundConstraint_Level() {
		return (EReference) qoSCompoundConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQoSStatisticalAttribute() {
		return qoSStatisticalAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualificationKind() {
		return qualificationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionKind() {
		return directionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperators() {
		return logicalOperatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFTPFactory getQFTPFactory() {
		return (QFTPFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		qoSRequiredEClass = createEClass(QO_SREQUIRED);
		createEReference(qoSRequiredEClass, QO_SREQUIRED__CONTRACT);
		createEReference(qoSRequiredEClass, QO_SREQUIRED__QOFFERED);

		qoSCharacteristicsEClass = createEClass(QO_SCHARACTERISTICS);
		createEAttribute(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__IS_INVARIANT);
		createEReference(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__QSUB);
		createEReference(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__QPARENT);
		createEReference(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__QTEMPLATE);
		createEReference(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__QDERIVATION);
		createEReference(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__DIMENSION);
		createEReference(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__PARAMETER);
		createEReference(qoSCharacteristicsEClass, QO_SCHARACTERISTICS__CONTEXT);

		qoSLevelEClass = createEClass(QO_SLEVEL);
		createEReference(qoSLevelEClass, QO_SLEVEL__ALLOWED_SPACE);
		createEReference(qoSLevelEClass, QO_SLEVEL__FROM);
		createEReference(qoSLevelEClass, QO_SLEVEL__TO);

		qoSDimensionEClass = createEClass(QO_SDIMENSION);
		createEAttribute(qoSDimensionEClass, QO_SDIMENSION__DIRECTION);
		createEAttribute(qoSDimensionEClass, QO_SDIMENSION__STATISTICAL_QUALIFIER);
		createEAttribute(qoSDimensionEClass, QO_SDIMENSION__UNIT);
		createEReference(qoSDimensionEClass, QO_SDIMENSION__TYPE);
		createEReference(qoSDimensionEClass, QO_SDIMENSION__EVALUATE);

		qoSParameterEClass = createEClass(QO_SPARAMETER);

		qoSCompoundLevelEClass = createEClass(QO_SCOMPOUND_LEVEL);
		createEReference(qoSCompoundLevelEClass, QO_SCOMPOUND_LEVEL__ALLOWED_SPACE);
		createEReference(qoSCompoundLevelEClass, QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL);

		qoSDimentionSlotEClass = createEClass(QO_SDIMENTION_SLOT);
		createEReference(qoSDimentionSlotEClass, QO_SDIMENTION_SLOT__REFERENCED_VALUE);

		qoSValueEClass = createEClass(QO_SVALUE);
		createEReference(qoSValueEClass, QO_SVALUE__OWNER_VALUE);

		qoSOfferedEClass = createEClass(QO_SOFFERED);
		createEReference(qoSOfferedEClass, QO_SOFFERED__CONTRACT);
		createEReference(qoSOfferedEClass, QO_SOFFERED__QREQUIRED);

		qoSConstraintEClass = createEClass(QO_SCONSTRAINT);
		createEReference(qoSConstraintEClass, QO_SCONSTRAINT__EVALUATE);
		createEAttribute(qoSConstraintEClass, QO_SCONSTRAINT__QUALIFICATION);
		createEAttribute(qoSConstraintEClass, QO_SCONSTRAINT__LOGICAL_OPERATOR);
		createEReference(qoSConstraintEClass, QO_SCONSTRAINT__NEXT);
		createEReference(qoSConstraintEClass, QO_SCONSTRAINT__PREVIOUS);
		createEReference(qoSConstraintEClass, QO_SCONSTRAINT__CONTEXT);
		createEReference(qoSConstraintEClass, QO_SCONSTRAINT__CURRENT_LEVEL);

		qoSContextEClass = createEClass(QO_SCONTEXT);
		createEAttribute(qoSContextEClass, QO_SCONTEXT__IS_OO_SOBESERVATION);
		createEReference(qoSContextEClass, QO_SCONTEXT__OPPOSITE_ASSOCIATION);
		createEReference(qoSContextEClass, QO_SCONTEXT__SUPPORT);
		createEReference(qoSContextEClass, QO_SCONTEXT__BASED_ON);

		qoSTransitionEClass = createEClass(QO_STRANSITION);
		createEReference(qoSTransitionEClass, QO_STRANSITION__DESTINATION);
		createEReference(qoSTransitionEClass, QO_STRANSITION__SOURCE);

		qoSContractEClass = createEClass(QO_SCONTRACT);
		createEReference(qoSContractEClass, QO_SCONTRACT__REQUIRE_ACCORDED);
		createEReference(qoSContractEClass, QO_SCONTRACT__OFFER_ACCORDED);

		qoSCategoryEClass = createEClass(QO_SCATEGORY);
		createEReference(qoSCategoryEClass, QO_SCATEGORY__REFERENCED);
		createEReference(qoSCategoryEClass, QO_SCATEGORY__OWN);
		createEReference(qoSCategoryEClass, QO_SCATEGORY__GROUP);

		qoSCompoundConstraintEClass = createEClass(QO_SCOMPOUND_CONSTRAINT);
		createEReference(qoSCompoundConstraintEClass, QO_SCOMPOUND_CONSTRAINT__CONSTRAINT);
		createEReference(qoSCompoundConstraintEClass, QO_SCOMPOUND_CONSTRAINT__LEVEL);

		// Create enums
		qoSStatisticalAttributeEEnum = createEEnum(QO_SSTATISTICAL_ATTRIBUTE);
		qualificationKindEEnum = createEEnum(QUALIFICATION_KIND);
		directionKindEEnum = createEEnum(DIRECTION_KIND);
		logicalOperatorsEEnum = createEEnum(LOGICAL_OPERATORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qoSRequiredEClass.getESuperTypes().add(this.getQoSConstraint());
		qoSCharacteristicsEClass.getESuperTypes().add(this.getQoSContext());
		qoSOfferedEClass.getESuperTypes().add(this.getQoSConstraint());
		qoSContractEClass.getESuperTypes().add(this.getQoSConstraint());
		qoSCompoundConstraintEClass.getESuperTypes().add(this.getQoSConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(qoSRequiredEClass, QoSRequired.class, "QoSRequired", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSRequired_Contract(), this.getQoSContract(), this.getQoSContract_RequireAccorded(),
				"contract", null, 0, -1, QoSRequired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSRequired_QOffered(), this.getQoSOffered(), this.getQoSOffered_QRequired(), "qOffered",
				null, 0, -1, QoSRequired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSCharacteristicsEClass, QoSCharacteristics.class, "QoSCharacteristics", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQoSCharacteristics_IsInvariant(), theXMLTypePackage.getBoolean(), "isInvariant", "false", 0,
				1, QoSCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQoSCharacteristics_QSub(), this.getQoSCharacteristics(), this.getQoSCharacteristics_QParent(),
				"qSub", null, 0, -1, QoSCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCharacteristics_QParent(), this.getQoSCharacteristics(), this.getQoSCharacteristics_QSub(),
				"qParent", null, 0, -1, QoSCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCharacteristics_QTemplate(), this.getQoSCharacteristics(),
				this.getQoSCharacteristics_QDerivation(), "qTemplate", null, 0, 1, QoSCharacteristics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCharacteristics_QDerivation(), this.getQoSCharacteristics(),
				this.getQoSCharacteristics_QTemplate(), "qDerivation", null, 0, -1, QoSCharacteristics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCharacteristics_Dimension(), this.getQoSDimension(), null, "dimension", null, 0, 1,
				QoSCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCharacteristics_Parameter(), this.getQoSParameter(), null, "parameter", null, 1, -1,
				QoSCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCharacteristics_Context(), this.getQoSContext(), this.getQoSContext_BasedOn(), "context",
				null, 0, -1, QoSCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSLevelEClass, QoSLevel.class, "QoSLevel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSLevel_AllowedSpace(), this.getQoSConstraint(), this.getQoSConstraint_CurrentLevel(),
				"allowedSpace", null, 0, -1, QoSLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSLevel_From(), this.getQoSTransition(), this.getQoSTransition_Destination(), "from", null,
				0, -1, QoSLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSLevel_To(), this.getQoSTransition(), this.getQoSTransition_Source(), "to", null, 0, -1,
				QoSLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSDimensionEClass, QoSDimension.class, "QoSDimension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQoSDimension_Direction(), this.getDirectionKind(), "direction", "", 0, 1, QoSDimension.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQoSDimension_StatisticalQualifier(), this.getQoSStatisticalAttribute(),
				"statisticalQualifier", null, 0, 1, QoSDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQoSDimension_Unit(), theXMLTypePackage.getString(), "unit", null, 0, 1, QoSDimension.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSDimension_Type(), this.getQoSCharacteristics(), null, "Type", null, 0, 1,
				QoSDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSDimension_Evaluate(), this.getQoSDimentionSlot(), null, "evaluate", null, 1, -1,
				QoSDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSParameterEClass, QoSParameter.class, "QoSParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(qoSCompoundLevelEClass, QoSCompoundLevel.class, "QoSCompoundLevel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSCompoundLevel_AllowedSpace(), this.getQoSCompoundConstraint(),
				this.getQoSCompoundConstraint_Level(), "allowedSpace", null, 0, 1, QoSCompoundLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCompoundLevel_GroupOfLevel(), this.getQoSLevel(), null, "groupOfLevel", null, 0, -1,
				QoSCompoundLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSDimentionSlotEClass, QoSDimentionSlot.class, "QoSDimentionSlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSDimentionSlot_ReferencedValue(), this.getQoSValue(), null, "referencedValue", null, 0, 1,
				QoSDimentionSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSValueEClass, QoSValue.class, "QoSValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSValue_OwnerValue(), this.getQoSDimentionSlot(), null, "ownerValue", null, 1, -1,
				QoSValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSOfferedEClass, QoSOffered.class, "QoSOffered", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSOffered_Contract(), this.getQoSContract(), this.getQoSContract_OfferAccorded(), "contract",
				null, 0, -1, QoSOffered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSOffered_QRequired(), this.getQoSRequired(), this.getQoSRequired_QOffered(), "qRequired",
				null, 0, -1, QoSOffered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSConstraintEClass, QoSConstraint.class, "QoSConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSConstraint_Evaluate(), this.getQoSValue(), null, "evaluate", null, 0, -1,
				QoSConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQoSConstraint_Qualification(), this.getQualificationKind(), "qualification", null, 0, 1,
				QoSConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQoSConstraint_LogicalOperator(), this.getLogicalOperators(), "logicalOperator", null, 0, 1,
				QoSConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQoSConstraint_Next(), this.getQoSConstraint(), this.getQoSConstraint_Previous(), "next", null,
				0, 1, QoSConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSConstraint_Previous(), this.getQoSConstraint(), this.getQoSConstraint_Next(), "previous",
				null, 0, 1, QoSConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSConstraint_Context(), this.getQoSContext(), this.getQoSContext_Support(), "context", null,
				0, 1, QoSConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSConstraint_CurrentLevel(), this.getQoSLevel(), this.getQoSLevel_AllowedSpace(),
				"currentLevel", null, 0, -1, QoSConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSContextEClass, QoSContext.class, "QoSContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQoSContext_IsOoSObeservation(), theXMLTypePackage.getBoolean(), "isOoSObeservation", null, 0,
				1, QoSContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQoSContext_OppositeAssociation(), this.getQoSContext(), null, "oppositeAssociation", null, 0,
				-1, QoSContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSContext_Support(), this.getQoSConstraint(), this.getQoSConstraint_Context(), "support",
				null, 0, -1, QoSContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSContext_BasedOn(), this.getQoSCharacteristics(), this.getQoSCharacteristics_Context(),
				"basedOn", null, 0, -1, QoSContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSTransitionEClass, QoSTransition.class, "QoSTransition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSTransition_Destination(), this.getQoSLevel(), this.getQoSLevel_From(), "destination", null,
				0, 1, QoSTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSTransition_Source(), this.getQoSLevel(), this.getQoSLevel_To(), "source", null, 0, 1,
				QoSTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSContractEClass, QoSContract.class, "QoSContract", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSContract_RequireAccorded(), this.getQoSRequired(), this.getQoSRequired_Contract(),
				"requireAccorded", null, 0, -1, QoSContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSContract_OfferAccorded(), this.getQoSOffered(), this.getQoSOffered_Contract(),
				"offerAccorded", null, 0, -1, QoSContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSCategoryEClass, QoSCategory.class, "QoSCategory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSCategory_Referenced(), this.getQoSCategory(), null, "referenced", null, 0, -1,
				QoSCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCategory_Own(), this.getQoSCategory(), null, "own", null, 0, 1, QoSCategory.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCategory_Group(), this.getQoSCharacteristics(), null, "group", null, 0, 1,
				QoSCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSCompoundConstraintEClass, QoSCompoundConstraint.class, "QoSCompoundConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSCompoundConstraint_Constraint(), this.getQoSConstraint(), null, "constraint", null, 0, -1,
				QoSCompoundConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSCompoundConstraint_Level(), this.getQoSCompoundLevel(),
				this.getQoSCompoundLevel_AllowedSpace(), "level", null, 0, 1, QoSCompoundConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.class, "QoSStatisticalAttribute");
		addEEnumLiteral(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.MAXIMUMVALUE);
		addEEnumLiteral(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.MINIMUMVALUE);
		addEEnumLiteral(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.RANGE);
		addEEnumLiteral(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.MEAN);
		addEEnumLiteral(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.VARIANCE);
		addEEnumLiteral(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.STANDARDDEVIATION);
		addEEnumLiteral(qoSStatisticalAttributeEEnum, QoSStatisticalAttribute.PERCENTILE);

		initEEnum(qualificationKindEEnum, QualificationKind.class, "QualificationKind");
		addEEnumLiteral(qualificationKindEEnum, QualificationKind.GUARANTEE);
		addEEnumLiteral(qualificationKindEEnum, QualificationKind.BEST_EFFORT);
		addEEnumLiteral(qualificationKindEEnum, QualificationKind.THRESHOLD_BEST_EFFORT);
		addEEnumLiteral(qualificationKindEEnum, QualificationKind.COMPULSORY_BEST_EFFORT);
		addEEnumLiteral(qualificationKindEEnum, QualificationKind.NONE);

		initEEnum(directionKindEEnum, DirectionKind.class, "DirectionKind");
		addEEnumLiteral(directionKindEEnum, DirectionKind.INCREASING);
		addEEnumLiteral(directionKindEEnum, DirectionKind.DECREASING);
		addEEnumLiteral(directionKindEEnum, DirectionKind.UNDEFINED);

		initEEnum(logicalOperatorsEEnum, LogicalOperators.class, "LogicalOperators");
		addEEnumLiteral(logicalOperatorsEEnum, LogicalOperators.AND);
		addEEnumLiteral(logicalOperatorsEEnum, LogicalOperators.OR);
		addEEnumLiteral(logicalOperatorsEEnum, LogicalOperators.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //QFTPPackageImpl
