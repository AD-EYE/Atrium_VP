
// Generated on 05.08.2020 at 11:14:55 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.contextual.explorer.queries.failuremode;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;

import org.polarsys.capella.vp.atrium.Atrium.CFA;

/**
 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferencingViewpointElementQuery implements IQuery {

	/**
	* <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	* Default constructor
	* @generated
	*/
	public ReferencingViewpointElementQuery() {
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
		Resource resource = ((EObject) object_p).eResource();
		if (resource != null) {
			for (TreeIterator<EObject> iter = resource.getAllContents(); iter.hasNext();) {
				EObject eObject = iter.next();

				if (eObject instanceof CFA) {
					CFA referencingElement = (CFA) eObject;
					if (referencingElement.getLinkedtoFailure() != null
							&& referencingElement.getLinkedtoFailure().equals(object_p))
						result.add(eObject);
				}
			}
		}
		return result;
	}

}