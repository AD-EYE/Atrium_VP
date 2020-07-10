
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assumption list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.Assumption_list#getAssumptions <em>Assumptions</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getAssumption_list()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/la/1.4.0#//LogicalComponent'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalComponent'"
 * @generated
 */

public interface Assumption_list extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.Assumption}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getAssumption_list_Assumptions()
	 * @model containment="true"
	 * @generated
	 */

	EList<Assumption> getAssumptions();

} // Assumption_list
