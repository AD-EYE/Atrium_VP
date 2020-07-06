
// Generated on 03.07.2020 at 03:27:13 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.design.service.tools;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.AtriumFactory;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.capella.vp.atrium.design.service.tools.OpenActionService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class OpenActionService {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean add_CFA(EObject element, EObject newSemanticContainer) {

		CFA myCFA = AtriumFactory.eINSTANCE.createCFA();

		myCFA.setContent("I AM A CFA !");
		myCFA.setState(true);

		myCFA.setId(EcoreUtil.generateUUID());

		if (element instanceof AbstractFunction) {
			AbstractFunction AF = (AbstractFunction) element;
			AF.getOwnedExtensions().add(myCFA);
			return true;
		} else if (element instanceof FunctionalExchange) {
			FunctionalExchange FE = (FunctionalExchange) element;
			FE.getOwnedExtensions().add(myCFA);
			return true;
		} else {
			((ExtensibleElement) element).getOwnedExtensions().add((ElementExtension) myCFA);
		}

		return true;
	}
}