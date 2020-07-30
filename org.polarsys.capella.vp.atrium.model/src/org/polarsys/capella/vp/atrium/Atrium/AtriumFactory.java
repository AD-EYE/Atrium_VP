
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage
 * @generated
 */
public interface AtriumFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtriumFactory eINSTANCE = org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Basic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Element</em>'.
	 * @generated
	 */
	AtriumBasicElement createAtriumBasicElement();

	/**
	 * Returns a new object of class '<em>CFA list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFA list</em>'.
	 * @generated
	 */
	CFA_list createCFA_list();

	/**
	 * Returns a new object of class '<em>sDG list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sDG list</em>'.
	 * @generated
	 */
	sDG_list createsDG_list();

	/**
	 * Returns a new object of class '<em>Assumption list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assumption list</em>'.
	 * @generated
	 */
	Assumption_list createAssumption_list();

	/**
	 * Returns a new object of class '<em>DG list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DG list</em>'.
	 * @generated
	 */
	DG_list createDG_list();

	/**
	 * Returns a new object of class '<em>DA list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DA list</em>'.
	 * @generated
	 */
	DA_list createDA_list();

	/**
	 * Returns a new object of class '<em>Failure list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure list</em>'.
	 * @generated
	 */
	Failure_list createFailure_list();

	/**
	 * Returns a new object of class '<em>ODD list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ODD list</em>'.
	 * @generated
	 */
	ODD_list createODD_list();

	/**
	 * Returns a new object of class '<em>FR list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FR list</em>'.
	 * @generated
	 */
	FR_list createFR_list();

	/**
	 * Returns a new object of class '<em>CFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFA</em>'.
	 * @generated
	 */
	CFA createCFA();

	/**
	 * Returns a new object of class '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assumption</em>'.
	 * @generated
	 */
	Assumption createAssumption();

	/**
	 * Returns a new object of class '<em>DG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DG</em>'.
	 * @generated
	 */
	DG createDG();

	/**
	 * Returns a new object of class '<em>sDG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sDG</em>'.
	 * @generated
	 */
	sDG createsDG();

	/**
	 * Returns a new object of class '<em>DA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DA</em>'.
	 * @generated
	 */
	DA createDA();

	/**
	 * Returns a new object of class '<em>Element State Atrium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element State Atrium</em>'.
	 * @generated
	 */
	ElementStateAtrium createElementStateAtrium();

	/**
	 * Returns a new object of class '<em>Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode</em>'.
	 * @generated
	 */
	FailureMode createFailureMode();

	/**
	 * Returns a new object of class '<em>ODD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ODD</em>'.
	 * @generated
	 */
	ODD createODD();

	/**
	 * Returns a new object of class '<em>FR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FR</em>'.
	 * @generated
	 */
	FR createFR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtriumPackage getAtriumPackage();

} //AtriumFactory
