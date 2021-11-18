/**
 */
package org.eclipse.sirius.sample.QFTP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qo SStatistical Attribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.QFTP.QFTPPackage#getQoSStatisticalAttribute()
 * @model
 * @generated
 */
public enum QoSStatisticalAttribute implements Enumerator {
	/**
	 * The '<em><b>Maximumvalue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUMVALUE_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUMVALUE(0, "maximumvalue", "maximumvalue"),

	/**
	 * The '<em><b>Minimumvalue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUMVALUE_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMUMVALUE(1, "minimumvalue", "minimumvalue"),

	/**
	 * The '<em><b>Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(2, "range", "range"),

	/**
	 * The '<em><b>Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN(3, "mean", "mean"),

	/**
	 * The '<em><b>Variance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANCE(4, "variance", "variance"),

	/**
	 * The '<em><b>Standarddeviation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARDDEVIATION_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARDDEVIATION(5, "standarddeviation", "standarddeviation"),

	/**
	 * The '<em><b>Percentile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTILE(6, "percentile", "percentile");

	/**
	 * The '<em><b>Maximumvalue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUMVALUE
	 * @model name="maximumvalue"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUMVALUE_VALUE = 0;

	/**
	 * The '<em><b>Minimumvalue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUMVALUE
	 * @model name="minimumvalue"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMUMVALUE_VALUE = 1;

	/**
	 * The '<em><b>Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE
	 * @model name="range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 2;

	/**
	 * The '<em><b>Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN
	 * @model name="mean"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_VALUE = 3;

	/**
	 * The '<em><b>Variance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANCE
	 * @model name="variance"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANCE_VALUE = 4;

	/**
	 * The '<em><b>Standarddeviation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARDDEVIATION
	 * @model name="standarddeviation"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARDDEVIATION_VALUE = 5;

	/**
	 * The '<em><b>Percentile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE
	 * @model name="percentile"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTILE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Qo SStatistical Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QoSStatisticalAttribute[] VALUES_ARRAY = new QoSStatisticalAttribute[] { MAXIMUMVALUE,
			MINIMUMVALUE, RANGE, MEAN, VARIANCE, STANDARDDEVIATION, PERCENTILE, };

	/**
	 * A public read-only list of all the '<em><b>Qo SStatistical Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QoSStatisticalAttribute> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qo SStatistical Attribute</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QoSStatisticalAttribute get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QoSStatisticalAttribute result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qo SStatistical Attribute</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QoSStatisticalAttribute getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QoSStatisticalAttribute result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qo SStatistical Attribute</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QoSStatisticalAttribute get(int value) {
		switch (value) {
		case MAXIMUMVALUE_VALUE:
			return MAXIMUMVALUE;
		case MINIMUMVALUE_VALUE:
			return MINIMUMVALUE;
		case RANGE_VALUE:
			return RANGE;
		case MEAN_VALUE:
			return MEAN;
		case VARIANCE_VALUE:
			return VARIANCE;
		case STANDARDDEVIATION_VALUE:
			return STANDARDDEVIATION;
		case PERCENTILE_VALUE:
			return PERCENTILE;
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
	private QoSStatisticalAttribute(int value, String name, String literal) {
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

} //QoSStatisticalAttribute
