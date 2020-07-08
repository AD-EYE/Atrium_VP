
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getLinkedtoElement <em>Linkedto Element</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#isState <em>State</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getStateLinkedElement <em>State Linked Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/la/1.4.0#//LogicalComponent http://www.polarsys.org/capella/core/cs/1.4.0#//Part http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction http://www.polarsys.org/capella/core/cs/1.4.0#//Component http://www.polarsys.org/capella/core/fa/1.4.0#//FunctionalExchange http://www.polarsys.org/capella/core/la/1.4.0#//LogicalFunction'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalComponent platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Part platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//FunctionalExchange platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalFunction'"
 * @generated
 */

public interface CFA extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Linkedto Element</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkedto Element</em>' reference.
	 * @see #setLinkedtoElement(CapellaElement)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_LinkedtoElement()
	 * @model required="true"
	 * @generated
	 */

	CapellaElement getLinkedtoElement();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getLinkedtoElement <em>Linkedto Element</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkedto Element</em>' reference.
	 * @see #getLinkedtoElement()
	 * @generated
	 */

	void setLinkedtoElement(CapellaElement value);

	/**
	 * Returns the value of the '<em><b>Assumption</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.Assumption}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' containment reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_Assumption()
	 * @model containment="true"
	 * @generated
	 */

	EList<Assumption> getAssumption();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(DG)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_Goal()
	 * @model containment="true" required="true"
	 * @generated
	 */

	DG getGoal();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getGoal <em>Goal</em>}' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */

	void setGoal(DG value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_Content()
	 * @model
	 * @generated
	 */

	String getContent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getContent <em>Content</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */

	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(boolean)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_State()
	 * @model
	 * @generated
	 */

	boolean isState();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#isState <em>State</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #isState()
	 * @generated
	 */

	void setState(boolean value);

	/**
	 * Returns the value of the '<em><b>State Linked Element</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Linked Element</em>' attribute.
	 * @see org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type
	 * @see #setStateLinkedElement(stateLinkedElement_Type)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_StateLinkedElement()
	 * @model
	 * @generated
	 */

	stateLinkedElement_Type getStateLinkedElement();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getStateLinkedElement <em>State Linked Element</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Linked Element</em>' attribute.
	 * @see org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type
	 * @see #getStateLinkedElement()
	 * @generated
	 */

	void setStateLinkedElement(stateLinkedElement_Type value);

} // CFA
