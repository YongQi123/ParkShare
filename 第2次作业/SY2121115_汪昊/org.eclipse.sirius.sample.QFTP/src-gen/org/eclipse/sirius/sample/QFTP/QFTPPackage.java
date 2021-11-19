/**
 */
package org.eclipse.sirius.sample.QFTP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.QFTP.QFTPFactory
 * @model kind="package"
 * @generated
 */
public interface QFTPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QFTP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/sample/QFTP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QFTP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFTPPackage eINSTANCE = org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl <em>Qo SConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSConstraint()
	 * @generated
	 */
	int QO_SCONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Evaluate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT__EVALUATE = 0;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT__QUALIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT__LOGICAL_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT__NEXT = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT__PREVIOUS = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT__CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Current Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT__CURRENT_LEVEL = 6;

	/**
	 * The number of structural features of the '<em>Qo SConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Qo SConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSRequiredImpl <em>Qo SRequired</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSRequiredImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSRequired()
	 * @generated
	 */
	int QO_SREQUIRED = 0;

	/**
	 * The feature id for the '<em><b>Evaluate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__EVALUATE = QO_SCONSTRAINT__EVALUATE;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__QUALIFICATION = QO_SCONSTRAINT__QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__LOGICAL_OPERATOR = QO_SCONSTRAINT__LOGICAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__NEXT = QO_SCONSTRAINT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__PREVIOUS = QO_SCONSTRAINT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__CONTEXT = QO_SCONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Current Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__CURRENT_LEVEL = QO_SCONSTRAINT__CURRENT_LEVEL;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__CONTRACT = QO_SCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QOffered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED__QOFFERED = QO_SCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qo SRequired</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED_FEATURE_COUNT = QO_SCONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qo SRequired</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUIRED_OPERATION_COUNT = QO_SCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl <em>Qo SContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSContext()
	 * @generated
	 */
	int QO_SCONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Is Oo SObeservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTEXT__IS_OO_SOBESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Opposite Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTEXT__OPPOSITE_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTEXT__SUPPORT = 2;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTEXT__BASED_ON = 3;

	/**
	 * The number of structural features of the '<em>Qo SContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTEXT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Qo SContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl <em>Qo SCharacteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCharacteristics()
	 * @generated
	 */
	int QO_SCHARACTERISTICS = 1;

	/**
	 * The feature id for the '<em><b>Is Oo SObeservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__IS_OO_SOBESERVATION = QO_SCONTEXT__IS_OO_SOBESERVATION;

	/**
	 * The feature id for the '<em><b>Opposite Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__OPPOSITE_ASSOCIATION = QO_SCONTEXT__OPPOSITE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__SUPPORT = QO_SCONTEXT__SUPPORT;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__BASED_ON = QO_SCONTEXT__BASED_ON;

	/**
	 * The feature id for the '<em><b>Is Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__IS_INVARIANT = QO_SCONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QSub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__QSUB = QO_SCONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>QParent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__QPARENT = QO_SCONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>QTemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__QTEMPLATE = QO_SCONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>QDerivation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__QDERIVATION = QO_SCONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__DIMENSION = QO_SCONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__PARAMETER = QO_SCONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS__CONTEXT = QO_SCONTEXT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Qo SCharacteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS_FEATURE_COUNT = QO_SCONTEXT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Qo SCharacteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCHARACTERISTICS_OPERATION_COUNT = QO_SCONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSLevelImpl <em>Qo SLevel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSLevelImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSLevel()
	 * @generated
	 */
	int QO_SLEVEL = 2;

	/**
	 * The feature id for the '<em><b>Allowed Space</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SLEVEL__ALLOWED_SPACE = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SLEVEL__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SLEVEL__TO = 2;

	/**
	 * The number of structural features of the '<em>Qo SLevel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SLEVEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Qo SLevel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SLEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl <em>Qo SDimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSDimension()
	 * @generated
	 */
	int QO_SDIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Statistical Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__STATISTICAL_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Evaluate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__EVALUATE = 4;

	/**
	 * The number of structural features of the '<em>Qo SDimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Qo SDimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSParameterImpl <em>Qo SParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSParameterImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSParameter()
	 * @generated
	 */
	int QO_SPARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Qo SParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SPARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Qo SParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundLevelImpl <em>Qo SCompound Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCompoundLevelImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCompoundLevel()
	 * @generated
	 */
	int QO_SCOMPOUND_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Allowed Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_LEVEL__ALLOWED_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Group Of Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Qo SCompound Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_LEVEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Qo SCompound Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimentionSlotImpl <em>Qo SDimention Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSDimentionSlotImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSDimentionSlot()
	 * @generated
	 */
	int QO_SDIMENTION_SLOT = 6;

	/**
	 * The feature id for the '<em><b>Referenced Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENTION_SLOT__REFERENCED_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Qo SDimention Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENTION_SLOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qo SDimention Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENTION_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSValueImpl <em>Qo SValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSValueImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSValue()
	 * @generated
	 */
	int QO_SVALUE = 7;

	/**
	 * The feature id for the '<em><b>Owner Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SVALUE__OWNER_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Qo SValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SVALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qo SValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SVALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSOfferedImpl <em>Qo SOffered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSOfferedImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSOffered()
	 * @generated
	 */
	int QO_SOFFERED = 8;

	/**
	 * The feature id for the '<em><b>Evaluate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__EVALUATE = QO_SCONSTRAINT__EVALUATE;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__QUALIFICATION = QO_SCONSTRAINT__QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__LOGICAL_OPERATOR = QO_SCONSTRAINT__LOGICAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__NEXT = QO_SCONSTRAINT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__PREVIOUS = QO_SCONSTRAINT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__CONTEXT = QO_SCONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Current Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__CURRENT_LEVEL = QO_SCONSTRAINT__CURRENT_LEVEL;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__CONTRACT = QO_SCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QRequired</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED__QREQUIRED = QO_SCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qo SOffered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED_FEATURE_COUNT = QO_SCONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qo SOffered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFERED_OPERATION_COUNT = QO_SCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSTransitionImpl <em>Qo STransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSTransitionImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSTransition()
	 * @generated
	 */
	int QO_STRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_STRANSITION__DESTINATION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_STRANSITION__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Qo STransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_STRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Qo STransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_STRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSContractImpl <em>Qo SContract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSContractImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSContract()
	 * @generated
	 */
	int QO_SCONTRACT = 12;

	/**
	 * The feature id for the '<em><b>Evaluate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__EVALUATE = QO_SCONSTRAINT__EVALUATE;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__QUALIFICATION = QO_SCONSTRAINT__QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__LOGICAL_OPERATOR = QO_SCONSTRAINT__LOGICAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__NEXT = QO_SCONSTRAINT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__PREVIOUS = QO_SCONSTRAINT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__CONTEXT = QO_SCONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Current Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__CURRENT_LEVEL = QO_SCONSTRAINT__CURRENT_LEVEL;

	/**
	 * The feature id for the '<em><b>Require Accorded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__REQUIRE_ACCORDED = QO_SCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offer Accorded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT__OFFER_ACCORDED = QO_SCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qo SContract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT_FEATURE_COUNT = QO_SCONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qo SContract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCONTRACT_OPERATION_COUNT = QO_SCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCategoryImpl <em>Qo SCategory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCategoryImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCategory()
	 * @generated
	 */
	int QO_SCATEGORY = 13;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY__REFERENCED = 0;

	/**
	 * The feature id for the '<em><b>Own</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY__OWN = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY__GROUP = 2;

	/**
	 * The number of structural features of the '<em>Qo SCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Qo SCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundConstraintImpl <em>Qo SCompound Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCompoundConstraintImpl
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCompoundConstraint()
	 * @generated
	 */
	int QO_SCOMPOUND_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Evaluate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__EVALUATE = QO_SCONSTRAINT__EVALUATE;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__QUALIFICATION = QO_SCONSTRAINT__QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__LOGICAL_OPERATOR = QO_SCONSTRAINT__LOGICAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__NEXT = QO_SCONSTRAINT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__PREVIOUS = QO_SCONSTRAINT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__CONTEXT = QO_SCONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Current Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__CURRENT_LEVEL = QO_SCONSTRAINT__CURRENT_LEVEL;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__CONSTRAINT = QO_SCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT__LEVEL = QO_SCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qo SCompound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT_FEATURE_COUNT = QO_SCONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qo SCompound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCOMPOUND_CONSTRAINT_OPERATION_COUNT = QO_SCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute <em>Qo SStatistical Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSStatisticalAttribute()
	 * @generated
	 */
	int QO_SSTATISTICAL_ATTRIBUTE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.QualificationKind <em>Qualification Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.QualificationKind
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQualificationKind()
	 * @generated
	 */
	int QUALIFICATION_KIND = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.DirectionKind <em>Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.DirectionKind
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getDirectionKind()
	 * @generated
	 */
	int DIRECTION_KIND = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.QFTP.LogicalOperators <em>Logical Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.QFTP.LogicalOperators
	 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getLogicalOperators()
	 * @generated
	 */
	int LOGICAL_OPERATORS = 18;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSRequired <em>Qo SRequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SRequired</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSRequired
	 * @generated
	 */
	EClass getQoSRequired();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSRequired#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contract</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSRequired#getContract()
	 * @see #getQoSRequired()
	 * @generated
	 */
	EReference getQoSRequired_Contract();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSRequired#getQOffered <em>QOffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>QOffered</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSRequired#getQOffered()
	 * @see #getQoSRequired()
	 * @generated
	 */
	EReference getQoSRequired_QOffered();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics <em>Qo SCharacteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SCharacteristics</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics
	 * @generated
	 */
	EClass getQoSCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#isIsInvariant <em>Is Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Invariant</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#isIsInvariant()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EAttribute getQoSCharacteristics_IsInvariant();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQSub <em>QSub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>QSub</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQSub()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EReference getQoSCharacteristics_QSub();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQParent <em>QParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>QParent</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQParent()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EReference getQoSCharacteristics_QParent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQTemplate <em>QTemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>QTemplate</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQTemplate()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EReference getQoSCharacteristics_QTemplate();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQDerivation <em>QDerivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>QDerivation</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getQDerivation()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EReference getQoSCharacteristics_QDerivation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getDimension()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EReference getQoSCharacteristics_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getParameter()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EReference getQoSCharacteristics_Parameter();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCharacteristics#getContext()
	 * @see #getQoSCharacteristics()
	 * @generated
	 */
	EReference getQoSCharacteristics_Context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSLevel <em>Qo SLevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SLevel</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel
	 * @generated
	 */
	EClass getQoSLevel();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getAllowedSpace <em>Allowed Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Space</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel#getAllowedSpace()
	 * @see #getQoSLevel()
	 * @generated
	 */
	EReference getQoSLevel_AllowedSpace();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel#getFrom()
	 * @see #getQoSLevel()
	 * @generated
	 */
	EReference getQoSLevel_From();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSLevel#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSLevel#getTo()
	 * @see #getQoSLevel()
	 * @generated
	 */
	EReference getQoSLevel_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSDimension <em>Qo SDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SDimension</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimension
	 * @generated
	 */
	EClass getQoSDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimension#getDirection()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EAttribute getQoSDimension_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getStatisticalQualifier <em>Statistical Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statistical Qualifier</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimension#getStatisticalQualifier()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EAttribute getQoSDimension_StatisticalQualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimension#getUnit()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EAttribute getQoSDimension_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimension#getType()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EReference getQoSDimension_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.QFTP.QoSDimension#getEvaluate <em>Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluate</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimension#getEvaluate()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EReference getQoSDimension_Evaluate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSParameter <em>Qo SParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SParameter</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSParameter
	 * @generated
	 */
	EClass getQoSParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel <em>Qo SCompound Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SCompound Level</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundLevel
	 * @generated
	 */
	EClass getQoSCompoundLevel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getAllowedSpace <em>Allowed Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allowed Space</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getAllowedSpace()
	 * @see #getQoSCompoundLevel()
	 * @generated
	 */
	EReference getQoSCompoundLevel_AllowedSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getGroupOfLevel <em>Group Of Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Of Level</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundLevel#getGroupOfLevel()
	 * @see #getQoSCompoundLevel()
	 * @generated
	 */
	EReference getQoSCompoundLevel_GroupOfLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSDimentionSlot <em>Qo SDimention Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SDimention Slot</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimentionSlot
	 * @generated
	 */
	EClass getQoSDimentionSlot();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSDimentionSlot#getReferencedValue <em>Referenced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Value</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSDimentionSlot#getReferencedValue()
	 * @see #getQoSDimentionSlot()
	 * @generated
	 */
	EReference getQoSDimentionSlot_ReferencedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSValue <em>Qo SValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SValue</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSValue
	 * @generated
	 */
	EClass getQoSValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.QFTP.QoSValue#getOwnerValue <em>Owner Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owner Value</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSValue#getOwnerValue()
	 * @see #getQoSValue()
	 * @generated
	 */
	EReference getQoSValue_OwnerValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSOffered <em>Qo SOffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SOffered</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSOffered
	 * @generated
	 */
	EClass getQoSOffered();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSOffered#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contract</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSOffered#getContract()
	 * @see #getQoSOffered()
	 * @generated
	 */
	EReference getQoSOffered_Contract();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSOffered#getQRequired <em>QRequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>QRequired</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSOffered#getQRequired()
	 * @see #getQoSOffered()
	 * @generated
	 */
	EReference getQoSOffered_QRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint <em>Qo SConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SConstraint</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint
	 * @generated
	 */
	EClass getQoSConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getEvaluate <em>Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluate</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getEvaluate()
	 * @see #getQoSConstraint()
	 * @generated
	 */
	EReference getQoSConstraint_Evaluate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getQualification()
	 * @see #getQoSConstraint()
	 * @generated
	 */
	EAttribute getQoSConstraint_Qualification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getLogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Operator</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getLogicalOperator()
	 * @see #getQoSConstraint()
	 * @generated
	 */
	EAttribute getQoSConstraint_LogicalOperator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getNext()
	 * @see #getQoSConstraint()
	 * @generated
	 */
	EReference getQoSConstraint_Next();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getPrevious()
	 * @see #getQoSConstraint()
	 * @generated
	 */
	EReference getQoSConstraint_Previous();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getContext()
	 * @see #getQoSConstraint()
	 * @generated
	 */
	EReference getQoSConstraint_Context();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSConstraint#getCurrentLevel <em>Current Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Level</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSConstraint#getCurrentLevel()
	 * @see #getQoSConstraint()
	 * @generated
	 */
	EReference getQoSConstraint_CurrentLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSContext <em>Qo SContext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SContext</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext
	 * @generated
	 */
	EClass getQoSContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.QFTP.QoSContext#isIsOoSObeservation <em>Is Oo SObeservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Oo SObeservation</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext#isIsOoSObeservation()
	 * @see #getQoSContext()
	 * @generated
	 */
	EAttribute getQoSContext_IsOoSObeservation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSContext#getOppositeAssociation <em>Opposite Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opposite Association</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext#getOppositeAssociation()
	 * @see #getQoSContext()
	 * @generated
	 */
	EReference getQoSContext_OppositeAssociation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSContext#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Support</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext#getSupport()
	 * @see #getQoSContext()
	 * @generated
	 */
	EReference getQoSContext_Support();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSContext#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Based On</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContext#getBasedOn()
	 * @see #getQoSContext()
	 * @generated
	 */
	EReference getQoSContext_BasedOn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSTransition <em>Qo STransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo STransition</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSTransition
	 * @generated
	 */
	EClass getQoSTransition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSTransition#getDestination()
	 * @see #getQoSTransition()
	 * @generated
	 */
	EReference getQoSTransition_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSTransition#getSource()
	 * @see #getQoSTransition()
	 * @generated
	 */
	EReference getQoSTransition_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSContract <em>Qo SContract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SContract</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContract
	 * @generated
	 */
	EClass getQoSContract();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSContract#getRequireAccorded <em>Require Accorded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Require Accorded</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContract#getRequireAccorded()
	 * @see #getQoSContract()
	 * @generated
	 */
	EReference getQoSContract_RequireAccorded();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSContract#getOfferAccorded <em>Offer Accorded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offer Accorded</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSContract#getOfferAccorded()
	 * @see #getQoSContract()
	 * @generated
	 */
	EReference getQoSContract_OfferAccorded();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSCategory <em>Qo SCategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SCategory</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCategory
	 * @generated
	 */
	EClass getQoSCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCategory#getReferenced()
	 * @see #getQoSCategory()
	 * @generated
	 */
	EReference getQoSCategory_Referenced();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getOwn <em>Own</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Own</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCategory#getOwn()
	 * @see #getQoSCategory()
	 * @generated
	 */
	EReference getQoSCategory_Own();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.QFTP.QoSCategory#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCategory#getGroup()
	 * @see #getQoSCategory()
	 * @generated
	 */
	EReference getQoSCategory_Group();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint <em>Qo SCompound Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SCompound Constraint</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint
	 * @generated
	 */
	EClass getQoSCompoundConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getConstraint()
	 * @see #getQoSCompoundConstraint()
	 * @generated
	 */
	EReference getQoSCompoundConstraint_Constraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSCompoundConstraint#getLevel()
	 * @see #getQoSCompoundConstraint()
	 * @generated
	 */
	EReference getQoSCompoundConstraint_Level();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute <em>Qo SStatistical Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qo SStatistical Attribute</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute
	 * @generated
	 */
	EEnum getQoSStatisticalAttribute();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.QFTP.QualificationKind <em>Qualification Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualification Kind</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.QualificationKind
	 * @generated
	 */
	EEnum getQualificationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.QFTP.DirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.DirectionKind
	 * @generated
	 */
	EEnum getDirectionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.QFTP.LogicalOperators <em>Logical Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operators</em>'.
	 * @see org.eclipse.sirius.sample.QFTP.LogicalOperators
	 * @generated
	 */
	EEnum getLogicalOperators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QFTPFactory getQFTPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSRequiredImpl <em>Qo SRequired</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSRequiredImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSRequired()
		 * @generated
		 */
		EClass QO_SREQUIRED = eINSTANCE.getQoSRequired();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SREQUIRED__CONTRACT = eINSTANCE.getQoSRequired_Contract();

		/**
		 * The meta object literal for the '<em><b>QOffered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SREQUIRED__QOFFERED = eINSTANCE.getQoSRequired_QOffered();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl <em>Qo SCharacteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCharacteristicsImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCharacteristics()
		 * @generated
		 */
		EClass QO_SCHARACTERISTICS = eINSTANCE.getQoSCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Is Invariant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SCHARACTERISTICS__IS_INVARIANT = eINSTANCE.getQoSCharacteristics_IsInvariant();

		/**
		 * The meta object literal for the '<em><b>QSub</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCHARACTERISTICS__QSUB = eINSTANCE.getQoSCharacteristics_QSub();

		/**
		 * The meta object literal for the '<em><b>QParent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCHARACTERISTICS__QPARENT = eINSTANCE.getQoSCharacteristics_QParent();

		/**
		 * The meta object literal for the '<em><b>QTemplate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCHARACTERISTICS__QTEMPLATE = eINSTANCE.getQoSCharacteristics_QTemplate();

		/**
		 * The meta object literal for the '<em><b>QDerivation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCHARACTERISTICS__QDERIVATION = eINSTANCE.getQoSCharacteristics_QDerivation();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCHARACTERISTICS__DIMENSION = eINSTANCE.getQoSCharacteristics_Dimension();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCHARACTERISTICS__PARAMETER = eINSTANCE.getQoSCharacteristics_Parameter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCHARACTERISTICS__CONTEXT = eINSTANCE.getQoSCharacteristics_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSLevelImpl <em>Qo SLevel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSLevelImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSLevel()
		 * @generated
		 */
		EClass QO_SLEVEL = eINSTANCE.getQoSLevel();

		/**
		 * The meta object literal for the '<em><b>Allowed Space</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SLEVEL__ALLOWED_SPACE = eINSTANCE.getQoSLevel_AllowedSpace();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SLEVEL__FROM = eINSTANCE.getQoSLevel_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SLEVEL__TO = eINSTANCE.getQoSLevel_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl <em>Qo SDimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSDimensionImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSDimension()
		 * @generated
		 */
		EClass QO_SDIMENSION = eINSTANCE.getQoSDimension();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SDIMENSION__DIRECTION = eINSTANCE.getQoSDimension_Direction();

		/**
		 * The meta object literal for the '<em><b>Statistical Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SDIMENSION__STATISTICAL_QUALIFIER = eINSTANCE.getQoSDimension_StatisticalQualifier();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SDIMENSION__UNIT = eINSTANCE.getQoSDimension_Unit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SDIMENSION__TYPE = eINSTANCE.getQoSDimension_Type();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SDIMENSION__EVALUATE = eINSTANCE.getQoSDimension_Evaluate();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSParameterImpl <em>Qo SParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSParameterImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSParameter()
		 * @generated
		 */
		EClass QO_SPARAMETER = eINSTANCE.getQoSParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundLevelImpl <em>Qo SCompound Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCompoundLevelImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCompoundLevel()
		 * @generated
		 */
		EClass QO_SCOMPOUND_LEVEL = eINSTANCE.getQoSCompoundLevel();

		/**
		 * The meta object literal for the '<em><b>Allowed Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCOMPOUND_LEVEL__ALLOWED_SPACE = eINSTANCE.getQoSCompoundLevel_AllowedSpace();

		/**
		 * The meta object literal for the '<em><b>Group Of Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCOMPOUND_LEVEL__GROUP_OF_LEVEL = eINSTANCE.getQoSCompoundLevel_GroupOfLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSDimentionSlotImpl <em>Qo SDimention Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSDimentionSlotImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSDimentionSlot()
		 * @generated
		 */
		EClass QO_SDIMENTION_SLOT = eINSTANCE.getQoSDimentionSlot();

		/**
		 * The meta object literal for the '<em><b>Referenced Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SDIMENTION_SLOT__REFERENCED_VALUE = eINSTANCE.getQoSDimentionSlot_ReferencedValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSValueImpl <em>Qo SValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSValueImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSValue()
		 * @generated
		 */
		EClass QO_SVALUE = eINSTANCE.getQoSValue();

		/**
		 * The meta object literal for the '<em><b>Owner Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SVALUE__OWNER_VALUE = eINSTANCE.getQoSValue_OwnerValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSOfferedImpl <em>Qo SOffered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSOfferedImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSOffered()
		 * @generated
		 */
		EClass QO_SOFFERED = eINSTANCE.getQoSOffered();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SOFFERED__CONTRACT = eINSTANCE.getQoSOffered_Contract();

		/**
		 * The meta object literal for the '<em><b>QRequired</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SOFFERED__QREQUIRED = eINSTANCE.getQoSOffered_QRequired();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl <em>Qo SConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSConstraintImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSConstraint()
		 * @generated
		 */
		EClass QO_SCONSTRAINT = eINSTANCE.getQoSConstraint();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONSTRAINT__EVALUATE = eINSTANCE.getQoSConstraint_Evaluate();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SCONSTRAINT__QUALIFICATION = eINSTANCE.getQoSConstraint_Qualification();

		/**
		 * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SCONSTRAINT__LOGICAL_OPERATOR = eINSTANCE.getQoSConstraint_LogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONSTRAINT__NEXT = eINSTANCE.getQoSConstraint_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONSTRAINT__PREVIOUS = eINSTANCE.getQoSConstraint_Previous();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONSTRAINT__CONTEXT = eINSTANCE.getQoSConstraint_Context();

		/**
		 * The meta object literal for the '<em><b>Current Level</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONSTRAINT__CURRENT_LEVEL = eINSTANCE.getQoSConstraint_CurrentLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl <em>Qo SContext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSContextImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSContext()
		 * @generated
		 */
		EClass QO_SCONTEXT = eINSTANCE.getQoSContext();

		/**
		 * The meta object literal for the '<em><b>Is Oo SObeservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SCONTEXT__IS_OO_SOBESERVATION = eINSTANCE.getQoSContext_IsOoSObeservation();

		/**
		 * The meta object literal for the '<em><b>Opposite Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONTEXT__OPPOSITE_ASSOCIATION = eINSTANCE.getQoSContext_OppositeAssociation();

		/**
		 * The meta object literal for the '<em><b>Support</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONTEXT__SUPPORT = eINSTANCE.getQoSContext_Support();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONTEXT__BASED_ON = eINSTANCE.getQoSContext_BasedOn();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSTransitionImpl <em>Qo STransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSTransitionImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSTransition()
		 * @generated
		 */
		EClass QO_STRANSITION = eINSTANCE.getQoSTransition();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_STRANSITION__DESTINATION = eINSTANCE.getQoSTransition_Destination();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_STRANSITION__SOURCE = eINSTANCE.getQoSTransition_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSContractImpl <em>Qo SContract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSContractImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSContract()
		 * @generated
		 */
		EClass QO_SCONTRACT = eINSTANCE.getQoSContract();

		/**
		 * The meta object literal for the '<em><b>Require Accorded</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONTRACT__REQUIRE_ACCORDED = eINSTANCE.getQoSContract_RequireAccorded();

		/**
		 * The meta object literal for the '<em><b>Offer Accorded</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCONTRACT__OFFER_ACCORDED = eINSTANCE.getQoSContract_OfferAccorded();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCategoryImpl <em>Qo SCategory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCategoryImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCategory()
		 * @generated
		 */
		EClass QO_SCATEGORY = eINSTANCE.getQoSCategory();

		/**
		 * The meta object literal for the '<em><b>Referenced</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCATEGORY__REFERENCED = eINSTANCE.getQoSCategory_Referenced();

		/**
		 * The meta object literal for the '<em><b>Own</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCATEGORY__OWN = eINSTANCE.getQoSCategory_Own();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCATEGORY__GROUP = eINSTANCE.getQoSCategory_Group();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.impl.QoSCompoundConstraintImpl <em>Qo SCompound Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.impl.QoSCompoundConstraintImpl
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSCompoundConstraint()
		 * @generated
		 */
		EClass QO_SCOMPOUND_CONSTRAINT = eINSTANCE.getQoSCompoundConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCOMPOUND_CONSTRAINT__CONSTRAINT = eINSTANCE.getQoSCompoundConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCOMPOUND_CONSTRAINT__LEVEL = eINSTANCE.getQoSCompoundConstraint_Level();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute <em>Qo SStatistical Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.QoSStatisticalAttribute
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQoSStatisticalAttribute()
		 * @generated
		 */
		EEnum QO_SSTATISTICAL_ATTRIBUTE = eINSTANCE.getQoSStatisticalAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.QualificationKind <em>Qualification Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.QualificationKind
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getQualificationKind()
		 * @generated
		 */
		EEnum QUALIFICATION_KIND = eINSTANCE.getQualificationKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.DirectionKind <em>Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.DirectionKind
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getDirectionKind()
		 * @generated
		 */
		EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.QFTP.LogicalOperators <em>Logical Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.QFTP.LogicalOperators
		 * @see org.eclipse.sirius.sample.QFTP.impl.QFTPPackageImpl#getLogicalOperators()
		 * @generated
		 */
		EEnum LOGICAL_OPERATORS = eINSTANCE.getLogicalOperators();

	}

} //QFTPPackage
