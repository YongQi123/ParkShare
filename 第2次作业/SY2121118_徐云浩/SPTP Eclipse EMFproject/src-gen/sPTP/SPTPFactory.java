/**
 */
package sPTP;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sPTP.SPTPPackage
 * @generated
 */
public interface SPTPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SPTPFactory eINSTANCE = sPTP.impl.SPTPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor</em>'.
	 * @generated
	 */
	Descriptor createDescriptor();

	/**
	 * Returns a new object of class '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance</em>'.
	 * @generated
	 */
	ResourceInstance createResourceInstance();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Resource Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Service Instance</em>'.
	 * @generated
	 */
	ResourceServiceInstance createResourceServiceInstance();

	/**
	 * Returns a new object of class '<em>Resource Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Service</em>'.
	 * @generated
	 */
	ResourceService createResourceService();

	/**
	 * Returns a new object of class '<em>Event Occurence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Occurence</em>'.
	 * @generated
	 */
	EventOccurence createEventOccurence();

	/**
	 * Returns a new object of class '<em>Stimulus Reception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus Reception</em>'.
	 * @generated
	 */
	StimulusReception createStimulusReception();

	/**
	 * Returns a new object of class '<em>Stimulus Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus Generation</em>'.
	 * @generated
	 */
	StimulusGeneration createStimulusGeneration();

	/**
	 * Returns a new object of class '<em>Scenario End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario End Event</em>'.
	 * @generated
	 */
	ScenarioEndEvent createScenarioEndEvent();

	/**
	 * Returns a new object of class '<em>Scenario Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Start Event</em>'.
	 * @generated
	 */
	ScenarioStartEvent createScenarioStartEvent();

	/**
	 * Returns a new object of class '<em>Usage Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Demand</em>'.
	 * @generated
	 */
	UsageDemand createUsageDemand();

	/**
	 * Returns a new object of class '<em>Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Usage</em>'.
	 * @generated
	 */
	ResourceUsage createResourceUsage();

	/**
	 * Returns a new object of class '<em>Static Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Usage</em>'.
	 * @generated
	 */
	StaticUsage createStaticUsage();

	/**
	 * Returns a new object of class '<em>Dynamic Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Usage</em>'.
	 * @generated
	 */
	DynamicUsage createDynamicUsage();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Action Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Execution</em>'.
	 * @generated
	 */
	ActionExecution createActionExecution();

	/**
	 * Returns a new object of class '<em>Sptp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sptp</em>'.
	 * @generated
	 */
	Sptp createSptp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SPTPPackage getSPTPPackage();

} //SPTPFactory
