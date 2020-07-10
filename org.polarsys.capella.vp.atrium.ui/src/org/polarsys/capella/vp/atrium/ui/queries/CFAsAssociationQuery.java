
// Generated on 10.07.2020 at 04:31:07 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.queries;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.query.CapellaQueries;
import org.polarsys.capella.core.model.utils.ListExt;

import org.polarsys.capella.core.model.handler.helpers.CapellaProjectHelper;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.capella.vp.atrium.Atrium.CFA_list;

import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[CFAsAssociationQuery]</b></em>' BusinessQuery defined for 
* '<em><b>[AtriumPackage.eINSTANCE.getCFA_list_CFAs()]</b></em>'.
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CFAsAssociationQuery implements IBusinessQuery {

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param elementP
	* @generated
	*/
	public List<EObject> getAvailableElements(EObject elementP) {
		List<EObject> availableElements = new ArrayList<EObject>();

		Project project = CapellaProjectHelper.getProject(elementP);
		SystemEngineering systemEngineering = project != null ? SystemEngineeringExt.getSystemEngineering(project)
				: null;

		if (null != systemEngineering) {
			Set<EObject> all = EObjectExt.getAll(systemEngineering, AtriumPackage.Literals.CFA);
			availableElements.addAll(all);
		}
		availableElements = ListExt.removeDuplicates(availableElements);
		availableElements.remove(elementP);
		return availableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param elementP
	 * @param onlyGeneratedP
	 * @generated
	 */
	public List<EObject> getCurrentElements(EObject elementP, boolean onlyGeneratedP) {
		List<EObject> currentsElements = new ArrayList<EObject>();
		if (elementP instanceof CFA_list)
			currentsElements.addAll(((CFA_list) elementP).getCFAs());
		return currentsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return AtriumPackage.Literals.CFA_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EReference> getEStructuralFeatures() {
		List<EReference> eReferences = new ArrayList<EReference>();
		eReferences.add(AtriumPackage.eINSTANCE.getCFA_list_CFAs());
		return eReferences;
	}
}
// create the extension