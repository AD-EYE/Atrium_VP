
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.DG#getDesignAlternative <em>Design Alternative</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.DG#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction'"
 * @generated
 */

public interface DG extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Design Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.DA}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Alternative</em>' reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG_DesignAlternative()
	 * @model required="true"
	 * @generated
	 */

	EList<DA> getDesignAlternative();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG_Content()
	 * @model
	 * @generated
	 */

	String getContent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.DG#getContent <em>Content</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */

	void setContent(String value);

} // DG
