/**
 */
package sPTP.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sPTP.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPTPFactoryImpl extends EFactoryImpl implements SPTPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SPTPFactory init() {
		try {
			SPTPFactory theSPTPFactory = (SPTPFactory) EPackage.Registry.INSTANCE.getEFactory(SPTPPackage.eNS_URI);
			if (theSPTPFactory != null) {
				return theSPTPFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SPTPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPTPFactoryImpl() {
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
		case SPTPPackage.INSTANCE:
			return createInstance();
		case SPTPPackage.DESCRIPTOR:
			return createDescriptor();
		case SPTPPackage.RESOURCE_INSTANCE:
			return createResourceInstance();
		case SPTPPackage.RESOURCE:
			return createResource();
		case SPTPPackage.RESOURCE_SERVICE_INSTANCE:
			return createResourceServiceInstance();
		case SPTPPackage.RESOURCE_SERVICE:
			return createResourceService();
		case SPTPPackage.EVENT_OCCURENCE:
			return createEventOccurence();
		case SPTPPackage.STIMULUS_RECEPTION:
			return createStimulusReception();
		case SPTPPackage.STIMULUS_GENERATION:
			return createStimulusGeneration();
		case SPTPPackage.SCENARIO_END_EVENT:
			return createScenarioEndEvent();
		case SPTPPackage.SCENARIO_START_EVENT:
			return createScenarioStartEvent();
		case SPTPPackage.USAGE_DEMAND:
			return createUsageDemand();
		case SPTPPackage.RESOURCE_USAGE:
			return createResourceUsage();
		case SPTPPackage.STATIC_USAGE:
			return createStaticUsage();
		case SPTPPackage.DYNAMIC_USAGE:
			return createDynamicUsage();
		case SPTPPackage.CLIENT:
			return createClient();
		case SPTPPackage.SCENARIO:
			return createScenario();
		case SPTPPackage.ACTION_EXECUTION:
			return createActionExecution();
		case SPTPPackage.SPTP:
			return createSptp();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor createDescriptor() {
		DescriptorImpl descriptor = new DescriptorImpl();
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance createResourceInstance() {
		ResourceInstanceImpl resourceInstance = new ResourceInstanceImpl();
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceServiceInstance createResourceServiceInstance() {
		ResourceServiceInstanceImpl resourceServiceInstance = new ResourceServiceInstanceImpl();
		return resourceServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService createResourceService() {
		ResourceServiceImpl resourceService = new ResourceServiceImpl();
		return resourceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurence createEventOccurence() {
		EventOccurenceImpl eventOccurence = new EventOccurenceImpl();
		return eventOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimulusReception createStimulusReception() {
		StimulusReceptionImpl stimulusReception = new StimulusReceptionImpl();
		return stimulusReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimulusGeneration createStimulusGeneration() {
		StimulusGenerationImpl stimulusGeneration = new StimulusGenerationImpl();
		return stimulusGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioEndEvent createScenarioEndEvent() {
		ScenarioEndEventImpl scenarioEndEvent = new ScenarioEndEventImpl();
		return scenarioEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioStartEvent createScenarioStartEvent() {
		ScenarioStartEventImpl scenarioStartEvent = new ScenarioStartEventImpl();
		return scenarioStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageDemand createUsageDemand() {
		UsageDemandImpl usageDemand = new UsageDemandImpl();
		return usageDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUsage createResourceUsage() {
		ResourceUsageImpl resourceUsage = new ResourceUsageImpl();
		return resourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticUsage createStaticUsage() {
		StaticUsageImpl staticUsage = new StaticUsageImpl();
		return staticUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUsage createDynamicUsage() {
		DynamicUsageImpl dynamicUsage = new DynamicUsageImpl();
		return dynamicUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecution createActionExecution() {
		ActionExecutionImpl actionExecution = new ActionExecutionImpl();
		return actionExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sptp createSptp() {
		SptpImpl sptp = new SptpImpl();
		return sptp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPTPPackage getSPTPPackage() {
		return (SPTPPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SPTPPackage getPackage() {
		return SPTPPackage.eINSTANCE;
	}

} //SPTPFactoryImpl
