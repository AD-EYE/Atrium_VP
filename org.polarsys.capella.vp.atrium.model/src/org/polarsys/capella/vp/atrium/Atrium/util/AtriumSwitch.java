
package org.polarsys.capella.vp.atrium.Atrium.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.vp.atrium.Atrium.*;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

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
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage
 * @generated
 */
public class AtriumSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtriumPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtriumSwitch() {
		if (modelPackage == null) {
			modelPackage = AtriumPackage.eINSTANCE;
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
		case AtriumPackage.ATRIUM_BASIC_ELEMENT: {
			AtriumBasicElement atriumBasicElement = (AtriumBasicElement) theEObject;
			T result = caseAtriumBasicElement(atriumBasicElement);
			if (result == null)
				result = caseNamedElement(atriumBasicElement);
			if (result == null)
				result = caseElementExtension(atriumBasicElement);
			if (result == null)
				result = caseAbstractNamedElement(atriumBasicElement);
			if (result == null)
				result = caseCapellaElement(atriumBasicElement);
			if (result == null)
				result = caseTraceableElement(atriumBasicElement);
			if (result == null)
				result = casePublishableElement(atriumBasicElement);
			if (result == null)
				result = caseModelElement(atriumBasicElement);
			if (result == null)
				result = caseExtensibleElement(atriumBasicElement);
			if (result == null)
				result = caseElement(atriumBasicElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.CFA_LIST: {
			CFA_list cfA_list = (CFA_list) theEObject;
			T result = caseCFA_list(cfA_list);
			if (result == null)
				result = caseNamedElement(cfA_list);
			if (result == null)
				result = caseElementExtension(cfA_list);
			if (result == null)
				result = caseAbstractNamedElement(cfA_list);
			if (result == null)
				result = caseCapellaElement(cfA_list);
			if (result == null)
				result = caseTraceableElement(cfA_list);
			if (result == null)
				result = casePublishableElement(cfA_list);
			if (result == null)
				result = caseModelElement(cfA_list);
			if (result == null)
				result = caseExtensibleElement(cfA_list);
			if (result == null)
				result = caseElement(cfA_list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.ASSUMPTION_LIST: {
			Assumption_list assumption_list = (Assumption_list) theEObject;
			T result = caseAssumption_list(assumption_list);
			if (result == null)
				result = caseNamedElement(assumption_list);
			if (result == null)
				result = caseElementExtension(assumption_list);
			if (result == null)
				result = caseAbstractNamedElement(assumption_list);
			if (result == null)
				result = caseCapellaElement(assumption_list);
			if (result == null)
				result = caseTraceableElement(assumption_list);
			if (result == null)
				result = casePublishableElement(assumption_list);
			if (result == null)
				result = caseModelElement(assumption_list);
			if (result == null)
				result = caseExtensibleElement(assumption_list);
			if (result == null)
				result = caseElement(assumption_list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.DG_LIST: {
			DG_list dG_list = (DG_list) theEObject;
			T result = caseDG_list(dG_list);
			if (result == null)
				result = caseNamedElement(dG_list);
			if (result == null)
				result = caseElementExtension(dG_list);
			if (result == null)
				result = caseAbstractNamedElement(dG_list);
			if (result == null)
				result = caseCapellaElement(dG_list);
			if (result == null)
				result = caseTraceableElement(dG_list);
			if (result == null)
				result = casePublishableElement(dG_list);
			if (result == null)
				result = caseModelElement(dG_list);
			if (result == null)
				result = caseExtensibleElement(dG_list);
			if (result == null)
				result = caseElement(dG_list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.DA_LIST: {
			DA_list dA_list = (DA_list) theEObject;
			T result = caseDA_list(dA_list);
			if (result == null)
				result = caseNamedElement(dA_list);
			if (result == null)
				result = caseElementExtension(dA_list);
			if (result == null)
				result = caseAbstractNamedElement(dA_list);
			if (result == null)
				result = caseCapellaElement(dA_list);
			if (result == null)
				result = caseTraceableElement(dA_list);
			if (result == null)
				result = casePublishableElement(dA_list);
			if (result == null)
				result = caseModelElement(dA_list);
			if (result == null)
				result = caseExtensibleElement(dA_list);
			if (result == null)
				result = caseElement(dA_list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.FAILURE_LIST: {
			Failure_list failure_list = (Failure_list) theEObject;
			T result = caseFailure_list(failure_list);
			if (result == null)
				result = caseNamedElement(failure_list);
			if (result == null)
				result = caseElementExtension(failure_list);
			if (result == null)
				result = caseAbstractNamedElement(failure_list);
			if (result == null)
				result = caseCapellaElement(failure_list);
			if (result == null)
				result = caseTraceableElement(failure_list);
			if (result == null)
				result = casePublishableElement(failure_list);
			if (result == null)
				result = caseModelElement(failure_list);
			if (result == null)
				result = caseExtensibleElement(failure_list);
			if (result == null)
				result = caseElement(failure_list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.CFA: {
			CFA cfa = (CFA) theEObject;
			T result = caseCFA(cfa);
			if (result == null)
				result = caseAtriumBasicElement(cfa);
			if (result == null)
				result = caseNamedElement(cfa);
			if (result == null)
				result = caseElementExtension(cfa);
			if (result == null)
				result = caseAbstractNamedElement(cfa);
			if (result == null)
				result = caseCapellaElement(cfa);
			if (result == null)
				result = caseTraceableElement(cfa);
			if (result == null)
				result = casePublishableElement(cfa);
			if (result == null)
				result = caseModelElement(cfa);
			if (result == null)
				result = caseExtensibleElement(cfa);
			if (result == null)
				result = caseElement(cfa);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.ASSUMPTION: {
			Assumption assumption = (Assumption) theEObject;
			T result = caseAssumption(assumption);
			if (result == null)
				result = caseAtriumBasicElement(assumption);
			if (result == null)
				result = caseNamedElement(assumption);
			if (result == null)
				result = caseElementExtension(assumption);
			if (result == null)
				result = caseAbstractNamedElement(assumption);
			if (result == null)
				result = caseCapellaElement(assumption);
			if (result == null)
				result = caseTraceableElement(assumption);
			if (result == null)
				result = casePublishableElement(assumption);
			if (result == null)
				result = caseModelElement(assumption);
			if (result == null)
				result = caseExtensibleElement(assumption);
			if (result == null)
				result = caseElement(assumption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.DG: {
			DG dg = (DG) theEObject;
			T result = caseDG(dg);
			if (result == null)
				result = caseAtriumBasicElement(dg);
			if (result == null)
				result = caseNamedElement(dg);
			if (result == null)
				result = caseElementExtension(dg);
			if (result == null)
				result = caseAbstractNamedElement(dg);
			if (result == null)
				result = caseCapellaElement(dg);
			if (result == null)
				result = caseTraceableElement(dg);
			if (result == null)
				result = casePublishableElement(dg);
			if (result == null)
				result = caseModelElement(dg);
			if (result == null)
				result = caseExtensibleElement(dg);
			if (result == null)
				result = caseElement(dg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.DA: {
			DA da = (DA) theEObject;
			T result = caseDA(da);
			if (result == null)
				result = caseAtriumBasicElement(da);
			if (result == null)
				result = caseNamedElement(da);
			if (result == null)
				result = caseElementExtension(da);
			if (result == null)
				result = caseAbstractNamedElement(da);
			if (result == null)
				result = caseCapellaElement(da);
			if (result == null)
				result = caseTraceableElement(da);
			if (result == null)
				result = casePublishableElement(da);
			if (result == null)
				result = caseModelElement(da);
			if (result == null)
				result = caseExtensibleElement(da);
			if (result == null)
				result = caseElement(da);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.ELEMENT_STATE_ATRIUM: {
			ElementStateAtrium elementStateAtrium = (ElementStateAtrium) theEObject;
			T result = caseElementStateAtrium(elementStateAtrium);
			if (result == null)
				result = caseNamedElement(elementStateAtrium);
			if (result == null)
				result = caseElementExtension(elementStateAtrium);
			if (result == null)
				result = caseAbstractNamedElement(elementStateAtrium);
			if (result == null)
				result = caseCapellaElement(elementStateAtrium);
			if (result == null)
				result = caseTraceableElement(elementStateAtrium);
			if (result == null)
				result = casePublishableElement(elementStateAtrium);
			if (result == null)
				result = caseModelElement(elementStateAtrium);
			if (result == null)
				result = caseExtensibleElement(elementStateAtrium);
			if (result == null)
				result = caseElement(elementStateAtrium);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtriumPackage.FAILURE_MODE: {
			FailureMode failureMode = (FailureMode) theEObject;
			T result = caseFailureMode(failureMode);
			if (result == null)
				result = caseAtriumBasicElement(failureMode);
			if (result == null)
				result = caseNamedElement(failureMode);
			if (result == null)
				result = caseElementExtension(failureMode);
			if (result == null)
				result = caseAbstractNamedElement(failureMode);
			if (result == null)
				result = caseCapellaElement(failureMode);
			if (result == null)
				result = caseTraceableElement(failureMode);
			if (result == null)
				result = casePublishableElement(failureMode);
			if (result == null)
				result = caseModelElement(failureMode);
			if (result == null)
				result = caseExtensibleElement(failureMode);
			if (result == null)
				result = caseElement(failureMode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtriumBasicElement(AtriumBasicElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFA list</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFA list</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFA_list(CFA_list object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption list</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption list</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption_list(Assumption_list object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DG list</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DG list</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDG_list(DG_list object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DA list</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DA list</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDA_list(DA_list object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure list</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure list</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure_list(Failure_list object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFA(CFA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption(Assumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDG(DG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDA(DA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element State Atrium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element State Atrium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementStateAtrium(ElementStateAtrium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureMode(FailureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishableElement(PublishableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapellaElement(CapellaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementExtension(ElementExtension object) {
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

} //AtriumSwitch
