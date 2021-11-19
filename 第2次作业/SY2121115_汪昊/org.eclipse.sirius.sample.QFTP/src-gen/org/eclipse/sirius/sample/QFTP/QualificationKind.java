/**
 */
package org.eclipse.sirius.sample.QFTP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qualification Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQualificationKind()
 * @model
 * @generated
 */
public enum QualificationKind implements Enumerator {
	/**
	 * The '<em><b>Guarantee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARANTEE_VALUE
	 * @generated
	 * @ordered
	 */
	GUARANTEE(0, "Guarantee", "Guarantee"),

	/**
	 * The '<em><b>Best Effort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_EFFORT(1, "BestEffort", "BestEffort"),

	/**
	 * The '<em><b>Threshold Best Effort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THRESHOLD_BEST_EFFORT_VALUE
	 * @generated
	 * @ordered
	 */
	THRESHOLD_BEST_EFFORT(2, "ThresholdBestEffort", "ThresholdBestEffort"),

	/**
	 * The '<em><b>Compulsory Best Effort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY_BEST_EFFORT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPULSORY_BEST_EFFORT(3, "CompulsoryBestEffort", "CompulsoryBestEffort"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(4, "none", "none");

	/**
	 * The '<em><b>Guarantee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARANTEE
	 * @model name="Guarantee"
	 * @generated
	 * @ordered
	 */
	public static final int GUARANTEE_VALUE = 0;

	/**
	 * The '<em><b>Best Effort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT
	 * @model name="BestEffort"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_EFFORT_VALUE = 1;

	/**
	 * The '<em><b>Threshold Best Effort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THRESHOLD_BEST_EFFORT
	 * @model name="ThresholdBestEffort"
	 * @generated
	 * @ordered
	 */
	public static final int THRESHOLD_BEST_EFFORT_VALUE = 2;

	/**
	 * The '<em><b>Compulsory Best Effort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY_BEST_EFFORT
	 * @model name="CompulsoryBestEffort"
	 * @generated
	 * @ordered
	 */
	public static final int COMPULSORY_BEST_EFFORT_VALUE = 3;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Qualification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QualificationKind[] VALUES_ARRAY = new QualificationKind[] { GUARANTEE, BEST_EFFORT,
			THRESHOLD_BEST_EFFORT, COMPULSORY_BEST_EFFORT, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Qualification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QualificationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qualification Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualificationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualificationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qualification Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualificationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualificationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qualification Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualificationKind get(int value) {
		switch (value) {
		case GUARANTEE_VALUE:
			return GUARANTEE;
		case BEST_EFFORT_VALUE:
			return BEST_EFFORT;
		case THRESHOLD_BEST_EFFORT_VALUE:
			return THRESHOLD_BEST_EFFORT;
		case COMPULSORY_BEST_EFFORT_VALUE:
			return COMPULSORY_BEST_EFFORT;
		case NONE_VALUE:
			return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QualificationKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //QualificationKind
