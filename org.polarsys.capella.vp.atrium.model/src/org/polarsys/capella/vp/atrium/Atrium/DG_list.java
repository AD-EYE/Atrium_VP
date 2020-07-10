
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DG list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.DG_list#getDGs <em>DGs</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG_list()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/la/1.4.0#//LogicalComponent'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalComponent'"
 * @generated
 */

public interface DG_list extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>DGs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.DG}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DGs</em>' containment reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG_list_DGs()
	 * @model containment="true"
	 * @generated
	 */

	EList<DG> getDGs();

} // DG_list
