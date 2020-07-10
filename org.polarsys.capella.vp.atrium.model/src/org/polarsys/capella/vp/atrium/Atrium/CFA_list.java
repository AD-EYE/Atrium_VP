
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFA list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFA_list#getCFAs <em>CF As</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_list()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/la/1.4.0#//LogicalComponent'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalComponent'"
 * @generated
 */

public interface CFA_list extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>CF As</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.CFA}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CF As</em>' containment reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFA_list_CFAs()
	 * @model containment="true"
	 * @generated
	 */

	EList<CFA> getCFAs();

} // CFA_list
