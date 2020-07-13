
package org.polarsys.capella.vp.atrium.Atrium;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element State Atrium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium#isIsNewDevelopment <em>Is New Development</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getElementStateAtrium()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/core/1.4.0#//CapellaElement'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaCore.ecore#//CapellaElement'"
 * @generated
 */

public interface ElementStateAtrium extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Is New Development</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is New Development</em>' attribute.
	 * @see #setIsNewDevelopment(boolean)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getElementStateAtrium_IsNewDevelopment()
	 * @model
	 * @generated
	 */

	boolean isIsNewDevelopment();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium#isIsNewDevelopment <em>Is New Development</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is New Development</em>' attribute.
	 * @see #isIsNewDevelopment()
	 * @generated
	 */

	void setIsNewDevelopment(boolean value);

} // ElementStateAtrium
