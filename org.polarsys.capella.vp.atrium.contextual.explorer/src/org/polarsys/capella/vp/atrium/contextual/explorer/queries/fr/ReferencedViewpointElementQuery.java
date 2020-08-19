
// Generated on 19.08.2020 at 11:01:35 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.contextual.explorer.queries.fr;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;

import org.polarsys.capella.vp.atrium.Atrium.FR;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferencedViewpointElementQuery implements IQuery {

	/**
	* <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	* Default constructor
	* @generated
	*/
	public ReferencedViewpointElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		FR object = (FR) object_p;
		if (object.getLinkedAssumption() != null)
			result.add(object.getLinkedAssumption());

		return result;
	}

}