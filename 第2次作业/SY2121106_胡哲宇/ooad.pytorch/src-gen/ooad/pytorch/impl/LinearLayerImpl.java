/**
 */
package ooad.pytorch.impl;

import ooad.pytorch.LinearLayer;
import ooad.pytorch.PytorchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LinearLayerImpl extends ModuleImpl implements LinearLayer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PytorchPackage.Literals.LINEAR_LAYER;
	}

} //LinearLayerImpl
