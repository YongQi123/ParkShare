/**
 */
package sPTP.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sPTP.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sPTP.SPTPPackage
 * @generated
 */
public class SPTPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SPTPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPTPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SPTPPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPTPSwitch<Adapter> modelSwitch = new SPTPSwitch<Adapter>() {
		@Override
		public Adapter caseInstance(Instance object) {
			return createInstanceAdapter();
		}

		@Override
		public Adapter caseDescriptor(Descriptor object) {
			return createDescriptorAdapter();
		}

		@Override
		public Adapter caseResourceInstance(ResourceInstance object) {
			return createResourceInstanceAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseResourceServiceInstance(ResourceServiceInstance object) {
			return createResourceServiceInstanceAdapter();
		}

		@Override
		public Adapter caseResourceService(ResourceService object) {
			return createResourceServiceAdapter();
		}

		@Override
		public Adapter caseEventOccurence(EventOccurence object) {
			return createEventOccurenceAdapter();
		}

		@Override
		public Adapter caseStimulusReception(StimulusReception object) {
			return createStimulusReceptionAdapter();
		}

		@Override
		public Adapter caseStimulusGeneration(StimulusGeneration object) {
			return createStimulusGenerationAdapter();
		}

		@Override
		public Adapter caseScenarioEndEvent(ScenarioEndEvent object) {
			return createScenarioEndEventAdapter();
		}

		@Override
		public Adapter caseScenarioStartEvent(ScenarioStartEvent object) {
			return createScenarioStartEventAdapter();
		}

		@Override
		public Adapter caseUsageDemand(UsageDemand object) {
			return createUsageDemandAdapter();
		}

		@Override
		public Adapter caseResourceUsage(ResourceUsage object) {
			return createResourceUsageAdapter();
		}

		@Override
		public Adapter caseStaticUsage(StaticUsage object) {
			return createStaticUsageAdapter();
		}

		@Override
		public Adapter caseDynamicUsage(DynamicUsage object) {
			return createDynamicUsageAdapter();
		}

		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseScenario(Scenario object) {
			return createScenarioAdapter();
		}

		@Override
		public Adapter caseActionExecution(ActionExecution object) {
			return createActionExecutionAdapter();
		}

		@Override
		public Adapter caseSptp(Sptp object) {
			return createSptpAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.Descriptor
	 * @generated
	 */
	public Adapter createDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.ResourceInstance
	 * @generated
	 */
	public Adapter createResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.ResourceServiceInstance <em>Resource Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.ResourceServiceInstance
	 * @generated
	 */
	public Adapter createResourceServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.ResourceService <em>Resource Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.ResourceService
	 * @generated
	 */
	public Adapter createResourceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.EventOccurence <em>Event Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.EventOccurence
	 * @generated
	 */
	public Adapter createEventOccurenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.StimulusReception <em>Stimulus Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.StimulusReception
	 * @generated
	 */
	public Adapter createStimulusReceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.StimulusGeneration <em>Stimulus Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.StimulusGeneration
	 * @generated
	 */
	public Adapter createStimulusGenerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.ScenarioEndEvent <em>Scenario End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.ScenarioEndEvent
	 * @generated
	 */
	public Adapter createScenarioEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.ScenarioStartEvent <em>Scenario Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.ScenarioStartEvent
	 * @generated
	 */
	public Adapter createScenarioStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.UsageDemand <em>Usage Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.UsageDemand
	 * @generated
	 */
	public Adapter createUsageDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.ResourceUsage <em>Resource Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.ResourceUsage
	 * @generated
	 */
	public Adapter createResourceUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.StaticUsage <em>Static Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.StaticUsage
	 * @generated
	 */
	public Adapter createStaticUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.DynamicUsage <em>Dynamic Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.DynamicUsage
	 * @generated
	 */
	public Adapter createDynamicUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.ActionExecution <em>Action Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.ActionExecution
	 * @generated
	 */
	public Adapter createActionExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sPTP.Sptp <em>Sptp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sPTP.Sptp
	 * @generated
	 */
	public Adapter createSptpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SPTPAdapterFactory
