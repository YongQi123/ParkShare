/**
 */
package sPTP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sPTP.UsageDemand#getResourceusage <em>Resourceusage</em>}</li>
 * </ul>
 *
 * @see sPTP.SPTPPackage#getUsageDemand()
 * @model
 * @generated
 */
public interface UsageDemand extends EventOccurence {
	/**
	 * Returns the value of the '<em><b>Resourceusage</b></em>' containment reference list.
	 * The list contents are of type {@link sPTP.ResourceUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceusage</em>' containment reference list.
	 * @see sPTP.SPTPPackage#getUsageDemand_Resourceusage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceUsage> getResourceusage();

} // UsageDemand
