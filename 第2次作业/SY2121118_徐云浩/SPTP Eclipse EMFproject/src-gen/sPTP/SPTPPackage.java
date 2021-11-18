/**
 */
package sPTP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see sPTP.SPTPFactory
 * @model kind="package"
 * @generated
 */
public interface SPTPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sPTP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sPTP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sPTP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SPTPPackage eINSTANCE = sPTP.impl.SPTPPackageImpl.init();

	/**
	 * The meta object id for the '{@link sPTP.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.InstanceImpl
	 * @see sPTP.impl.SPTPPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.DescriptorImpl
	 * @see sPTP.impl.SPTPPackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 1;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ResourceInstanceImpl
	 * @see sPTP.impl.SPTPPackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__TYPE = INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Resourceserviceinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__RESOURCESERVICEINSTANCE = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__NAME = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ResourceImpl
	 * @see sPTP.impl.SPTPPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Resourceservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCESERVICE = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ResourceServiceInstanceImpl <em>Resource Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ResourceServiceInstanceImpl
	 * @see sPTP.impl.SPTPPackageImpl#getResourceServiceInstance()
	 * @generated
	 */
	int RESOURCE_SERVICE_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE_INSTANCE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Resource Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ResourceServiceImpl <em>Resource Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ResourceServiceImpl
	 * @see sPTP.impl.SPTPPackageImpl#getResourceService()
	 * @generated
	 */
	int RESOURCE_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Resource Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.EventOccurenceImpl <em>Event Occurence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.EventOccurenceImpl
	 * @see sPTP.impl.SPTPPackageImpl#getEventOccurence()
	 * @generated
	 */
	int EVENT_OCCURENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURENCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Occurence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Occurence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.StimulusReceptionImpl <em>Stimulus Reception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.StimulusReceptionImpl
	 * @see sPTP.impl.SPTPPackageImpl#getStimulusReception()
	 * @generated
	 */
	int STIMULUS_RECEPTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_RECEPTION__NAME = EVENT_OCCURENCE__NAME;

	/**
	 * The number of structural features of the '<em>Stimulus Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_RECEPTION_FEATURE_COUNT = EVENT_OCCURENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stimulus Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_RECEPTION_OPERATION_COUNT = EVENT_OCCURENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.StimulusGenerationImpl <em>Stimulus Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.StimulusGenerationImpl
	 * @see sPTP.impl.SPTPPackageImpl#getStimulusGeneration()
	 * @generated
	 */
	int STIMULUS_GENERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_GENERATION__NAME = EVENT_OCCURENCE__NAME;

	/**
	 * The number of structural features of the '<em>Stimulus Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_GENERATION_FEATURE_COUNT = EVENT_OCCURENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stimulus Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_GENERATION_OPERATION_COUNT = EVENT_OCCURENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ScenarioEndEventImpl <em>Scenario End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ScenarioEndEventImpl
	 * @see sPTP.impl.SPTPPackageImpl#getScenarioEndEvent()
	 * @generated
	 */
	int SCENARIO_END_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_END_EVENT__NAME = EVENT_OCCURENCE__NAME;

	/**
	 * The number of structural features of the '<em>Scenario End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_END_EVENT_FEATURE_COUNT = EVENT_OCCURENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scenario End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_END_EVENT_OPERATION_COUNT = EVENT_OCCURENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ScenarioStartEventImpl <em>Scenario Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ScenarioStartEventImpl
	 * @see sPTP.impl.SPTPPackageImpl#getScenarioStartEvent()
	 * @generated
	 */
	int SCENARIO_START_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_START_EVENT__NAME = EVENT_OCCURENCE__NAME;

	/**
	 * The number of structural features of the '<em>Scenario Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_START_EVENT_FEATURE_COUNT = EVENT_OCCURENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scenario Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_START_EVENT_OPERATION_COUNT = EVENT_OCCURENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.UsageDemandImpl <em>Usage Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.UsageDemandImpl
	 * @see sPTP.impl.SPTPPackageImpl#getUsageDemand()
	 * @generated
	 */
	int USAGE_DEMAND = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND__NAME = EVENT_OCCURENCE__NAME;

	/**
	 * The feature id for the '<em><b>Resourceusage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND__RESOURCEUSAGE = EVENT_OCCURENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usage Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND_FEATURE_COUNT = EVENT_OCCURENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Usage Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND_OPERATION_COUNT = EVENT_OCCURENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ResourceUsageImpl <em>Resource Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ResourceUsageImpl
	 * @see sPTP.impl.SPTPPackageImpl#getResourceUsage()
	 * @generated
	 */
	int RESOURCE_USAGE = 12;

	/**
	 * The number of structural features of the '<em>Resource Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_USAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Resource Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.StaticUsageImpl <em>Static Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.StaticUsageImpl
	 * @see sPTP.impl.SPTPPackageImpl#getStaticUsage()
	 * @generated
	 */
	int STATIC_USAGE = 13;

	/**
	 * The number of structural features of the '<em>Static Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_USAGE_FEATURE_COUNT = RESOURCE_USAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_USAGE_OPERATION_COUNT = RESOURCE_USAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.DynamicUsageImpl <em>Dynamic Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.DynamicUsageImpl
	 * @see sPTP.impl.SPTPPackageImpl#getDynamicUsage()
	 * @generated
	 */
	int DYNAMIC_USAGE = 14;

	/**
	 * The number of structural features of the '<em>Dynamic Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_USAGE_FEATURE_COUNT = RESOURCE_USAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_USAGE_OPERATION_COUNT = RESOURCE_USAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ClientImpl
	 * @see sPTP.impl.SPTPPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__TYPE = STATIC_USAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__USED_RESOURCES = STATIC_USAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = STATIC_USAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = STATIC_USAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = STATIC_USAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ScenarioImpl
	 * @see sPTP.impl.SPTPPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 16;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEP = DYNAMIC_USAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = DYNAMIC_USAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = DYNAMIC_USAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.ActionExecutionImpl <em>Action Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.ActionExecutionImpl
	 * @see sPTP.impl.SPTPPackageImpl#getActionExecution()
	 * @generated
	 */
	int ACTION_EXECUTION = 17;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__STEP = SCENARIO__STEP;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__PREDECESSOR = SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__SUCCESSOR = SCENARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_FEATURE_COUNT = SCENARIO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_OPERATION_COUNT = SCENARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sPTP.impl.SptpImpl <em>Sptp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sPTP.impl.SptpImpl
	 * @see sPTP.impl.SPTPPackageImpl#getSptp()
	 * @generated
	 */
	int SPTP = 18;

	/**
	 * The feature id for the '<em><b>Eventoccurence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPTP__EVENTOCCURENCE = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPTP__INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPTP__DESCRIPTOR = 2;

	/**
	 * The number of structural features of the '<em>Sptp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPTP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sptp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPTP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link sPTP.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see sPTP.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference list '{@link sPTP.Instance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see sPTP.Instance#getType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Type();

	/**
	 * Returns the meta object for class '{@link sPTP.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see sPTP.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for class '{@link sPTP.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see sPTP.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link sPTP.ResourceInstance#getResourceserviceinstance <em>Resourceserviceinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceserviceinstance</em>'.
	 * @see sPTP.ResourceInstance#getResourceserviceinstance()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Resourceserviceinstance();

	/**
	 * Returns the meta object for the attribute '{@link sPTP.ResourceInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sPTP.ResourceInstance#getName()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_Name();

	/**
	 * Returns the meta object for class '{@link sPTP.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see sPTP.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link sPTP.Resource#getResourceservice <em>Resourceservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceservice</em>'.
	 * @see sPTP.Resource#getResourceservice()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Resourceservice();

	/**
	 * Returns the meta object for class '{@link sPTP.ResourceServiceInstance <em>Resource Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Service Instance</em>'.
	 * @see sPTP.ResourceServiceInstance
	 * @generated
	 */
	EClass getResourceServiceInstance();

	/**
	 * Returns the meta object for the reference '{@link sPTP.ResourceServiceInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sPTP.ResourceServiceInstance#getType()
	 * @see #getResourceServiceInstance()
	 * @generated
	 */
	EReference getResourceServiceInstance_Type();

	/**
	 * Returns the meta object for class '{@link sPTP.ResourceService <em>Resource Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Service</em>'.
	 * @see sPTP.ResourceService
	 * @generated
	 */
	EClass getResourceService();

	/**
	 * Returns the meta object for the reference list '{@link sPTP.ResourceService#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see sPTP.ResourceService#getInstance()
	 * @see #getResourceService()
	 * @generated
	 */
	EReference getResourceService_Instance();

	/**
	 * Returns the meta object for class '{@link sPTP.EventOccurence <em>Event Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Occurence</em>'.
	 * @see sPTP.EventOccurence
	 * @generated
	 */
	EClass getEventOccurence();

	/**
	 * Returns the meta object for the attribute '{@link sPTP.EventOccurence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sPTP.EventOccurence#getName()
	 * @see #getEventOccurence()
	 * @generated
	 */
	EAttribute getEventOccurence_Name();

	/**
	 * Returns the meta object for class '{@link sPTP.StimulusReception <em>Stimulus Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus Reception</em>'.
	 * @see sPTP.StimulusReception
	 * @generated
	 */
	EClass getStimulusReception();

	/**
	 * Returns the meta object for class '{@link sPTP.StimulusGeneration <em>Stimulus Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus Generation</em>'.
	 * @see sPTP.StimulusGeneration
	 * @generated
	 */
	EClass getStimulusGeneration();

	/**
	 * Returns the meta object for class '{@link sPTP.ScenarioEndEvent <em>Scenario End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario End Event</em>'.
	 * @see sPTP.ScenarioEndEvent
	 * @generated
	 */
	EClass getScenarioEndEvent();

	/**
	 * Returns the meta object for class '{@link sPTP.ScenarioStartEvent <em>Scenario Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Start Event</em>'.
	 * @see sPTP.ScenarioStartEvent
	 * @generated
	 */
	EClass getScenarioStartEvent();

	/**
	 * Returns the meta object for class '{@link sPTP.UsageDemand <em>Usage Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Demand</em>'.
	 * @see sPTP.UsageDemand
	 * @generated
	 */
	EClass getUsageDemand();

	/**
	 * Returns the meta object for the containment reference list '{@link sPTP.UsageDemand#getResourceusage <em>Resourceusage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceusage</em>'.
	 * @see sPTP.UsageDemand#getResourceusage()
	 * @see #getUsageDemand()
	 * @generated
	 */
	EReference getUsageDemand_Resourceusage();

	/**
	 * Returns the meta object for class '{@link sPTP.ResourceUsage <em>Resource Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Usage</em>'.
	 * @see sPTP.ResourceUsage
	 * @generated
	 */
	EClass getResourceUsage();

	/**
	 * Returns the meta object for class '{@link sPTP.StaticUsage <em>Static Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Usage</em>'.
	 * @see sPTP.StaticUsage
	 * @generated
	 */
	EClass getStaticUsage();

	/**
	 * Returns the meta object for class '{@link sPTP.DynamicUsage <em>Dynamic Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Usage</em>'.
	 * @see sPTP.DynamicUsage
	 * @generated
	 */
	EClass getDynamicUsage();

	/**
	 * Returns the meta object for class '{@link sPTP.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see sPTP.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference list '{@link sPTP.Client#getUsedResources <em>Used Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Resources</em>'.
	 * @see sPTP.Client#getUsedResources()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_UsedResources();

	/**
	 * Returns the meta object for the attribute '{@link sPTP.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sPTP.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for class '{@link sPTP.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see sPTP.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link sPTP.Scenario#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see sPTP.Scenario#getStep()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Step();

	/**
	 * Returns the meta object for class '{@link sPTP.ActionExecution <em>Action Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Execution</em>'.
	 * @see sPTP.ActionExecution
	 * @generated
	 */
	EClass getActionExecution();

	/**
	 * Returns the meta object for the reference list '{@link sPTP.ActionExecution#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessor</em>'.
	 * @see sPTP.ActionExecution#getPredecessor()
	 * @see #getActionExecution()
	 * @generated
	 */
	EReference getActionExecution_Predecessor();

	/**
	 * Returns the meta object for the reference list '{@link sPTP.ActionExecution#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor</em>'.
	 * @see sPTP.ActionExecution#getSuccessor()
	 * @see #getActionExecution()
	 * @generated
	 */
	EReference getActionExecution_Successor();

	/**
	 * Returns the meta object for class '{@link sPTP.Sptp <em>Sptp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sptp</em>'.
	 * @see sPTP.Sptp
	 * @generated
	 */
	EClass getSptp();

	/**
	 * Returns the meta object for the containment reference list '{@link sPTP.Sptp#getEventoccurence <em>Eventoccurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eventoccurence</em>'.
	 * @see sPTP.Sptp#getEventoccurence()
	 * @see #getSptp()
	 * @generated
	 */
	EReference getSptp_Eventoccurence();

	/**
	 * Returns the meta object for the containment reference list '{@link sPTP.Sptp#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see sPTP.Sptp#getInstance()
	 * @see #getSptp()
	 * @generated
	 */
	EReference getSptp_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link sPTP.Sptp#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptor</em>'.
	 * @see sPTP.Sptp#getDescriptor()
	 * @see #getSptp()
	 * @generated
	 */
	EReference getSptp_Descriptor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SPTPFactory getSPTPFactory();

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
		 * The meta object literal for the '{@link sPTP.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.InstanceImpl
		 * @see sPTP.impl.SPTPPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

		/**
		 * The meta object literal for the '{@link sPTP.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.DescriptorImpl
		 * @see sPTP.impl.SPTPPackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ResourceInstanceImpl
		 * @see sPTP.impl.SPTPPackageImpl#getResourceInstance()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE = eINSTANCE.getResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Resourceserviceinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__RESOURCESERVICEINSTANCE = eINSTANCE.getResourceInstance_Resourceserviceinstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__NAME = eINSTANCE.getResourceInstance_Name();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ResourceImpl
		 * @see sPTP.impl.SPTPPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Resourceservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCESERVICE = eINSTANCE.getResource_Resourceservice();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ResourceServiceInstanceImpl <em>Resource Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ResourceServiceInstanceImpl
		 * @see sPTP.impl.SPTPPackageImpl#getResourceServiceInstance()
		 * @generated
		 */
		EClass RESOURCE_SERVICE_INSTANCE = eINSTANCE.getResourceServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SERVICE_INSTANCE__TYPE = eINSTANCE.getResourceServiceInstance_Type();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ResourceServiceImpl <em>Resource Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ResourceServiceImpl
		 * @see sPTP.impl.SPTPPackageImpl#getResourceService()
		 * @generated
		 */
		EClass RESOURCE_SERVICE = eINSTANCE.getResourceService();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SERVICE__INSTANCE = eINSTANCE.getResourceService_Instance();

		/**
		 * The meta object literal for the '{@link sPTP.impl.EventOccurenceImpl <em>Event Occurence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.EventOccurenceImpl
		 * @see sPTP.impl.SPTPPackageImpl#getEventOccurence()
		 * @generated
		 */
		EClass EVENT_OCCURENCE = eINSTANCE.getEventOccurence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_OCCURENCE__NAME = eINSTANCE.getEventOccurence_Name();

		/**
		 * The meta object literal for the '{@link sPTP.impl.StimulusReceptionImpl <em>Stimulus Reception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.StimulusReceptionImpl
		 * @see sPTP.impl.SPTPPackageImpl#getStimulusReception()
		 * @generated
		 */
		EClass STIMULUS_RECEPTION = eINSTANCE.getStimulusReception();

		/**
		 * The meta object literal for the '{@link sPTP.impl.StimulusGenerationImpl <em>Stimulus Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.StimulusGenerationImpl
		 * @see sPTP.impl.SPTPPackageImpl#getStimulusGeneration()
		 * @generated
		 */
		EClass STIMULUS_GENERATION = eINSTANCE.getStimulusGeneration();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ScenarioEndEventImpl <em>Scenario End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ScenarioEndEventImpl
		 * @see sPTP.impl.SPTPPackageImpl#getScenarioEndEvent()
		 * @generated
		 */
		EClass SCENARIO_END_EVENT = eINSTANCE.getScenarioEndEvent();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ScenarioStartEventImpl <em>Scenario Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ScenarioStartEventImpl
		 * @see sPTP.impl.SPTPPackageImpl#getScenarioStartEvent()
		 * @generated
		 */
		EClass SCENARIO_START_EVENT = eINSTANCE.getScenarioStartEvent();

		/**
		 * The meta object literal for the '{@link sPTP.impl.UsageDemandImpl <em>Usage Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.UsageDemandImpl
		 * @see sPTP.impl.SPTPPackageImpl#getUsageDemand()
		 * @generated
		 */
		EClass USAGE_DEMAND = eINSTANCE.getUsageDemand();

		/**
		 * The meta object literal for the '<em><b>Resourceusage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_DEMAND__RESOURCEUSAGE = eINSTANCE.getUsageDemand_Resourceusage();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ResourceUsageImpl <em>Resource Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ResourceUsageImpl
		 * @see sPTP.impl.SPTPPackageImpl#getResourceUsage()
		 * @generated
		 */
		EClass RESOURCE_USAGE = eINSTANCE.getResourceUsage();

		/**
		 * The meta object literal for the '{@link sPTP.impl.StaticUsageImpl <em>Static Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.StaticUsageImpl
		 * @see sPTP.impl.SPTPPackageImpl#getStaticUsage()
		 * @generated
		 */
		EClass STATIC_USAGE = eINSTANCE.getStaticUsage();

		/**
		 * The meta object literal for the '{@link sPTP.impl.DynamicUsageImpl <em>Dynamic Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.DynamicUsageImpl
		 * @see sPTP.impl.SPTPPackageImpl#getDynamicUsage()
		 * @generated
		 */
		EClass DYNAMIC_USAGE = eINSTANCE.getDynamicUsage();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ClientImpl
		 * @see sPTP.impl.SPTPPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Used Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__USED_RESOURCES = eINSTANCE.getClient_UsedResources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ScenarioImpl
		 * @see sPTP.impl.SPTPPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STEP = eINSTANCE.getScenario_Step();

		/**
		 * The meta object literal for the '{@link sPTP.impl.ActionExecutionImpl <em>Action Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.ActionExecutionImpl
		 * @see sPTP.impl.SPTPPackageImpl#getActionExecution()
		 * @generated
		 */
		EClass ACTION_EXECUTION = eINSTANCE.getActionExecution();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXECUTION__PREDECESSOR = eINSTANCE.getActionExecution_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXECUTION__SUCCESSOR = eINSTANCE.getActionExecution_Successor();

		/**
		 * The meta object literal for the '{@link sPTP.impl.SptpImpl <em>Sptp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sPTP.impl.SptpImpl
		 * @see sPTP.impl.SPTPPackageImpl#getSptp()
		 * @generated
		 */
		EClass SPTP = eINSTANCE.getSptp();

		/**
		 * The meta object literal for the '<em><b>Eventoccurence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPTP__EVENTOCCURENCE = eINSTANCE.getSptp_Eventoccurence();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPTP__INSTANCE = eINSTANCE.getSptp_Instance();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPTP__DESCRIPTOR = eINSTANCE.getSptp_Descriptor();

	}

} //SPTPPackage
