/**
 */
package sPTP.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sPTP.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sPTP.SPTPPackage
 * @generated
 */
public class SPTPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SPTPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPTPSwitch() {
		if (modelPackage == null) {
			modelPackage = SPTPPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SPTPPackage.INSTANCE: {
			Instance instance = (Instance) theEObject;
			T result = caseInstance(instance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.DESCRIPTOR: {
			Descriptor descriptor = (Descriptor) theEObject;
			T result = caseDescriptor(descriptor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.RESOURCE_INSTANCE: {
			ResourceInstance resourceInstance = (ResourceInstance) theEObject;
			T result = caseResourceInstance(resourceInstance);
			if (result == null)
				result = caseInstance(resourceInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.RESOURCE: {
			Resource resource = (Resource) theEObject;
			T result = caseResource(resource);
			if (result == null)
				result = caseDescriptor(resource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.RESOURCE_SERVICE_INSTANCE: {
			ResourceServiceInstance resourceServiceInstance = (ResourceServiceInstance) theEObject;
			T result = caseResourceServiceInstance(resourceServiceInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.RESOURCE_SERVICE: {
			ResourceService resourceService = (ResourceService) theEObject;
			T result = caseResourceService(resourceService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.EVENT_OCCURENCE: {
			EventOccurence eventOccurence = (EventOccurence) theEObject;
			T result = caseEventOccurence(eventOccurence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.STIMULUS_RECEPTION: {
			StimulusReception stimulusReception = (StimulusReception) theEObject;
			T result = caseStimulusReception(stimulusReception);
			if (result == null)
				result = caseEventOccurence(stimulusReception);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.STIMULUS_GENERATION: {
			StimulusGeneration stimulusGeneration = (StimulusGeneration) theEObject;
			T result = caseStimulusGeneration(stimulusGeneration);
			if (result == null)
				result = caseEventOccurence(stimulusGeneration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.SCENARIO_END_EVENT: {
			ScenarioEndEvent scenarioEndEvent = (ScenarioEndEvent) theEObject;
			T result = caseScenarioEndEvent(scenarioEndEvent);
			if (result == null)
				result = caseEventOccurence(scenarioEndEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.SCENARIO_START_EVENT: {
			ScenarioStartEvent scenarioStartEvent = (ScenarioStartEvent) theEObject;
			T result = caseScenarioStartEvent(scenarioStartEvent);
			if (result == null)
				result = caseEventOccurence(scenarioStartEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.USAGE_DEMAND: {
			UsageDemand usageDemand = (UsageDemand) theEObject;
			T result = caseUsageDemand(usageDemand);
			if (result == null)
				result = caseEventOccurence(usageDemand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.RESOURCE_USAGE: {
			ResourceUsage resourceUsage = (ResourceUsage) theEObject;
			T result = caseResourceUsage(resourceUsage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.STATIC_USAGE: {
			StaticUsage staticUsage = (StaticUsage) theEObject;
			T result = caseStaticUsage(staticUsage);
			if (result == null)
				result = caseResourceUsage(staticUsage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.DYNAMIC_USAGE: {
			DynamicUsage dynamicUsage = (DynamicUsage) theEObject;
			T result = caseDynamicUsage(dynamicUsage);
			if (result == null)
				result = caseResourceUsage(dynamicUsage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.CLIENT: {
			Client client = (Client) theEObject;
			T result = caseClient(client);
			if (result == null)
				result = caseStaticUsage(client);
			if (result == null)
				result = caseInstance(client);
			if (result == null)
				result = caseResourceUsage(client);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.SCENARIO: {
			Scenario scenario = (Scenario) theEObject;
			T result = caseScenario(scenario);
			if (result == null)
				result = caseDynamicUsage(scenario);
			if (result == null)
				result = caseResourceUsage(scenario);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.ACTION_EXECUTION: {
			ActionExecution actionExecution = (ActionExecution) theEObject;
			T result = caseActionExecution(actionExecution);
			if (result == null)
				result = caseScenario(actionExecution);
			if (result == null)
				result = caseDynamicUsage(actionExecution);
			if (result == null)
				result = caseResourceUsage(actionExecution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SPTPPackage.SPTP: {
			Sptp sptp = (Sptp) theEObject;
			T result = caseSptp(sptp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptor(Descriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstance(ResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceServiceInstance(ResourceServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceService(ResourceService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Occurence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Occurence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventOccurence(EventOccurence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus Reception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus Reception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulusReception(StimulusReception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus Generation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus Generation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulusGeneration(StimulusGeneration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioEndEvent(ScenarioEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioStartEvent(ScenarioStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageDemand(UsageDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUsage(ResourceUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticUsage(StaticUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicUsage(DynamicUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExecution(ActionExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sptp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sptp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSptp(Sptp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SPTPSwitch
