/**
 */
package ooad.pytorch.impl;

import ooad.pytorch.ActivationLayer;
import ooad.pytorch.AvgPool1d;
import ooad.pytorch.AvgPool2d;
import ooad.pytorch.AvgPool3d;
import ooad.pytorch.AvgPoolLayer;
import ooad.pytorch.Bilinear;
import ooad.pytorch.Conv1d;
import ooad.pytorch.Conv2d;
import ooad.pytorch.Conv3d;
import ooad.pytorch.ConvLayer;
import ooad.pytorch.Identity;
import ooad.pytorch.LeakyReLU;
import ooad.pytorch.Linear;
import ooad.pytorch.LinearLayer;
import ooad.pytorch.MaxPool1d;
import ooad.pytorch.MaxPool2d;
import ooad.pytorch.MaxPool3d;
import ooad.pytorch.MaxPoolLayer;
import ooad.pytorch.NeuralNetwork;
import ooad.pytorch.PytorchFactory;
import ooad.pytorch.PytorchPackage;
import ooad.pytorch.ReLU;
import ooad.pytorch.Sigmoid;
import ooad.pytorch.Softmax;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PytorchPackageImpl extends EPackageImpl implements PytorchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neuralNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxPoolLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avgPoolLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bilinearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conv1dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conv2dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conv3dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxPool1dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxPool2dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxPool3dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avgPool1dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avgPool2dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avgPool3dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sigmoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reLUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leakyReLUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softmaxEClass = null;

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
	 * @see ooad.pytorch.PytorchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PytorchPackageImpl() {
		super(eNS_URI, PytorchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PytorchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PytorchPackage init() {
		if (isInited)
			return (PytorchPackage) EPackage.Registry.INSTANCE.getEPackage(PytorchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPytorchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PytorchPackageImpl thePytorchPackage = registeredPytorchPackage instanceof PytorchPackageImpl
				? (PytorchPackageImpl) registeredPytorchPackage
				: new PytorchPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePytorchPackage.createPackageContents();

		// Initialize created meta-data
		thePytorchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePytorchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PytorchPackage.eNS_URI, thePytorchPackage);
		return thePytorchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeuralNetwork() {
		return neuralNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeuralNetwork_Name() {
		return (EAttribute) neuralNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeuralNetwork_Modules() {
		return (EReference) neuralNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Name() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Next() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Prev() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvLayer() {
		return convLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxPoolLayer() {
		return maxPoolLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvgPoolLayer() {
		return avgPoolLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationLayer() {
		return activationLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearLayer() {
		return linearLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinear() {
		return linearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBilinear() {
		return bilinearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConv1d() {
		return conv1dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConv2d() {
		return conv2dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConv3d() {
		return conv3dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxPool1d() {
		return maxPool1dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxPool2d() {
		return maxPool2dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxPool3d() {
		return maxPool3dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvgPool1d() {
		return avgPool1dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvgPool2d() {
		return avgPool2dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvgPool3d() {
		return avgPool3dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSigmoid() {
		return sigmoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReLU() {
		return reLUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeakyReLU() {
		return leakyReLUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftmax() {
		return softmaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PytorchFactory getPytorchFactory() {
		return (PytorchFactory) getEFactoryInstance();
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
		neuralNetworkEClass = createEClass(NEURAL_NETWORK);
		createEAttribute(neuralNetworkEClass, NEURAL_NETWORK__NAME);
		createEReference(neuralNetworkEClass, NEURAL_NETWORK__MODULES);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__NAME);
		createEReference(moduleEClass, MODULE__NEXT);
		createEReference(moduleEClass, MODULE__PREV);

		convLayerEClass = createEClass(CONV_LAYER);

		maxPoolLayerEClass = createEClass(MAX_POOL_LAYER);

		avgPoolLayerEClass = createEClass(AVG_POOL_LAYER);

		activationLayerEClass = createEClass(ACTIVATION_LAYER);

		linearLayerEClass = createEClass(LINEAR_LAYER);

		identityEClass = createEClass(IDENTITY);

		linearEClass = createEClass(LINEAR);

		bilinearEClass = createEClass(BILINEAR);

		conv1dEClass = createEClass(CONV1D);

		conv2dEClass = createEClass(CONV2D);

		conv3dEClass = createEClass(CONV3D);

		maxPool1dEClass = createEClass(MAX_POOL1D);

		maxPool2dEClass = createEClass(MAX_POOL2D);

		maxPool3dEClass = createEClass(MAX_POOL3D);

		avgPool1dEClass = createEClass(AVG_POOL1D);

		avgPool2dEClass = createEClass(AVG_POOL2D);

		avgPool3dEClass = createEClass(AVG_POOL3D);

		sigmoidEClass = createEClass(SIGMOID);

		reLUEClass = createEClass(RE_LU);

		leakyReLUEClass = createEClass(LEAKY_RE_LU);

		softmaxEClass = createEClass(SOFTMAX);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		convLayerEClass.getESuperTypes().add(this.getModule());
		maxPoolLayerEClass.getESuperTypes().add(this.getModule());
		avgPoolLayerEClass.getESuperTypes().add(this.getModule());
		activationLayerEClass.getESuperTypes().add(this.getModule());
		linearLayerEClass.getESuperTypes().add(this.getModule());
		identityEClass.getESuperTypes().add(this.getLinearLayer());
		linearEClass.getESuperTypes().add(this.getLinearLayer());
		bilinearEClass.getESuperTypes().add(this.getLinearLayer());
		conv1dEClass.getESuperTypes().add(this.getConvLayer());
		conv2dEClass.getESuperTypes().add(this.getConvLayer());
		conv3dEClass.getESuperTypes().add(this.getConvLayer());
		maxPool1dEClass.getESuperTypes().add(this.getMaxPoolLayer());
		maxPool2dEClass.getESuperTypes().add(this.getMaxPoolLayer());
		maxPool3dEClass.getESuperTypes().add(this.getMaxPoolLayer());
		avgPool1dEClass.getESuperTypes().add(this.getAvgPoolLayer());
		avgPool2dEClass.getESuperTypes().add(this.getAvgPoolLayer());
		avgPool3dEClass.getESuperTypes().add(this.getAvgPoolLayer());
		sigmoidEClass.getESuperTypes().add(this.getActivationLayer());
		reLUEClass.getESuperTypes().add(this.getActivationLayer());
		leakyReLUEClass.getESuperTypes().add(this.getActivationLayer());
		softmaxEClass.getESuperTypes().add(this.getActivationLayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(neuralNetworkEClass, NeuralNetwork.class, "NeuralNetwork", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeuralNetwork_Name(), ecorePackage.getEString(), "name", null, 0, 1, NeuralNetwork.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeuralNetwork_Modules(), this.getModule(), null, "modules", null, 0, -1, NeuralNetwork.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, ooad.pytorch.Module.class, "Module", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ooad.pytorch.Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Next(), this.getModule(), this.getModule_Prev(), "next", null, 0, -1,
				ooad.pytorch.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Prev(), this.getModule(), this.getModule_Next(), "prev", null, 0, -1,
				ooad.pytorch.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convLayerEClass, ConvLayer.class, "ConvLayer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxPoolLayerEClass, MaxPoolLayer.class, "MaxPoolLayer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(avgPoolLayerEClass, AvgPoolLayer.class, "AvgPoolLayer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(activationLayerEClass, ActivationLayer.class, "ActivationLayer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearLayerEClass, LinearLayer.class, "LinearLayer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearEClass, Linear.class, "Linear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bilinearEClass, Bilinear.class, "Bilinear", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conv1dEClass, Conv1d.class, "Conv1d", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conv2dEClass, Conv2d.class, "Conv2d", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conv3dEClass, Conv3d.class, "Conv3d", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxPool1dEClass, MaxPool1d.class, "MaxPool1d", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxPool2dEClass, MaxPool2d.class, "MaxPool2d", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxPool3dEClass, MaxPool3d.class, "MaxPool3d", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(avgPool1dEClass, AvgPool1d.class, "AvgPool1d", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(avgPool2dEClass, AvgPool2d.class, "AvgPool2d", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(avgPool3dEClass, AvgPool3d.class, "AvgPool3d", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sigmoidEClass, Sigmoid.class, "Sigmoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reLUEClass, ReLU.class, "ReLU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leakyReLUEClass, LeakyReLU.class, "LeakyReLU", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(softmaxEClass, Softmax.class, "Softmax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PytorchPackageImpl
