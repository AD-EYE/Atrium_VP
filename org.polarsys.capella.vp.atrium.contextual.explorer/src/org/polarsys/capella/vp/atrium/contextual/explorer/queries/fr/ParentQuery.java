
// Generated on 30.07.2020 at 10:52:21 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.contextual.explorer.queries.fr;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParentQuery implements IQuery {

	/**
	* <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	* Default constructor
	* @generated
	*/
	public ParentQuery() {
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
		EObject eObject = (EObject) object_p;
		result.add(eObject.eContainer());
		return result;
	}

}
