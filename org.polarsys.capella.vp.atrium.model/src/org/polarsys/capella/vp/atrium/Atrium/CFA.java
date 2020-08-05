
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
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getLinkedtoFailure <em>Linkedto Failure</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA()
 * @model
 * @generated
 */

public interface CFA extends AtriumBasicElement {

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
	 * Returns the value of the '<em><b>Linkedto Failure</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkedto Failure</em>' reference.
	 * @see #setLinkedtoFailure(FailureMode)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_LinkedtoFailure()
	 * @model required="true"
	 * @generated
	 */

	FailureMode getLinkedtoFailure();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getLinkedtoFailure <em>Linkedto Failure</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkedto Failure</em>' reference.
	 * @see #getLinkedtoFailure()
	 * @generated
	 */

	void setLinkedtoFailure(FailureMode value);

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
	 * @model
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
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.vp.atrium.Atrium.state_Type}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.polarsys.capella.vp.atrium.Atrium.state_Type
	 * @see #setState(state_Type)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_State()
	 * @model
	 * @generated
	 */

	state_Type getState();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getState <em>State</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.polarsys.capella.vp.atrium.Atrium.state_Type
	 * @see #getState()
	 * @generated
	 */

	void setState(state_Type value);

} // CFA
