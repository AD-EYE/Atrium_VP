
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
 * @model
 * @generated
 */

public interface CFA extends NamedElement {

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
	 * Returns the value of the '<em><b>Assumption</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.Assumption}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_Assumption()
	 * @model
	 * @generated
	 */

	EList<Assumption> getAssumption();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(DG)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_Goal()
	 * @model required="true"
	 * @generated
	 */

	DG getGoal();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getGoal <em>Goal</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
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
