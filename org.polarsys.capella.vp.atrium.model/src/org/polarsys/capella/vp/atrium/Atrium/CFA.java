
package org.polarsys.capella.vp.atrium.Atrium;

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
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA#isState <em>State</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/core/1.4.0#//NamedElement http://www.polarsys.org/capella/core/fa/1.4.0#//FunctionalExchange http://www.polarsys.org/capella/core/pa/1.4.0#//PhysicalFunction http://www.polarsys.org/capella/core/la/1.4.0#//LogicalFunction'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaCore.ecore#//NamedElement platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//FunctionalExchange platform:/plugin/org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore#//PhysicalFunction platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalFunction'"
 * @generated
 */

public interface CFA extends NamedElement, ElementExtension {

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

} // CFA
