
package org.polarsys.capella.vp.atrium.Atrium;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.DA#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.DA#isIsPartOfSelection <em>Is Part Of Selection</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDA()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction'"
 * @generated
 */

public interface DA extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDA_Content()
	 * @model
	 * @generated
	 */

	String getContent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.DA#getContent <em>Content</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */

	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Is Part Of Selection</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of Selection</em>' attribute.
	 * @see #setIsPartOfSelection(boolean)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDA_IsPartOfSelection()
	 * @model
	 * @generated
	 */

	boolean isIsPartOfSelection();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.DA#isIsPartOfSelection <em>Is Part Of Selection</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of Selection</em>' attribute.
	 * @see #isIsPartOfSelection()
	 * @generated
	 */

	void setIsPartOfSelection(boolean value);

} // DA
