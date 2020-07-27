
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.common.lib.IdGenerator;

import org.polarsys.capella.vp.atrium.Atrium.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtriumFactoryImpl extends EFactoryImpl implements AtriumFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtriumFactory init() {
		try {
			AtriumFactory theAtriumFactory = (AtriumFactory) EPackage.Registry.INSTANCE
					.getEFactory(AtriumPackage.eNS_URI);
			if (theAtriumFactory != null) {
				return theAtriumFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtriumFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtriumFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AtriumPackage.ATRIUM_BASIC_ELEMENT:
			return createAtriumBasicElement();
		case AtriumPackage.CFA_LIST:
			return createCFA_list();
		case AtriumPackage.SDG_LIST:
			return createsDG_list();
		case AtriumPackage.ASSUMPTION_LIST:
			return createAssumption_list();
		case AtriumPackage.DG_LIST:
			return createDG_list();
		case AtriumPackage.DA_LIST:
			return createDA_list();
		case AtriumPackage.FAILURE_LIST:
			return createFailure_list();
		case AtriumPackage.CFA:
			return createCFA();
		case AtriumPackage.ASSUMPTION:
			return createAssumption();
		case AtriumPackage.DG:
			return createDG();
		case AtriumPackage.SDG:
			return createsDG();
		case AtriumPackage.DA:
			return createDA();
		case AtriumPackage.ELEMENT_STATE_ATRIUM:
			return createElementStateAtrium();
		case AtriumPackage.FAILURE_MODE:
			return createFailureMode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AtriumPackage.ASSUMPTION_TYPE_TYPE:
			return createassumptionType_TypeFromString(eDataType, initialValue);
		case AtriumPackage.VALIDITY_TYPE:
			return createvalidity_TypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AtriumPackage.ASSUMPTION_TYPE_TYPE:
			return convertassumptionType_TypeToString(eDataType, instanceValue);
		case AtriumPackage.VALIDITY_TYPE:
			return convertvalidity_TypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtriumBasicElement createAtriumBasicElement() {
		AtriumBasicElementImpl atriumBasicElement = new AtriumBasicElementImpl();
		//begin-capella-code

		atriumBasicElement.setId(IdGenerator.createId());

		//end-capella-code
		return atriumBasicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFA_list createCFA_list() {
		CFA_listImpl cfA_list = new CFA_listImpl();
		//begin-capella-code

		cfA_list.setId(IdGenerator.createId());

		//end-capella-code
		return cfA_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sDG_list createsDG_list() {
		sDG_listImpl sDG_list = new sDG_listImpl();
		//begin-capella-code

		sDG_list.setId(IdGenerator.createId());

		//end-capella-code
		return sDG_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption_list createAssumption_list() {
		Assumption_listImpl assumption_list = new Assumption_listImpl();
		//begin-capella-code

		assumption_list.setId(IdGenerator.createId());

		//end-capella-code
		return assumption_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DG_list createDG_list() {
		DG_listImpl dG_list = new DG_listImpl();
		//begin-capella-code

		dG_list.setId(IdGenerator.createId());

		//end-capella-code
		return dG_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DA_list createDA_list() {
		DA_listImpl dA_list = new DA_listImpl();
		//begin-capella-code

		dA_list.setId(IdGenerator.createId());

		//end-capella-code
		return dA_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure_list createFailure_list() {
		Failure_listImpl failure_list = new Failure_listImpl();
		//begin-capella-code

		failure_list.setId(IdGenerator.createId());

		//end-capella-code
		return failure_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFA createCFA() {
		CFAImpl cfa = new CFAImpl();
		//begin-capella-code

		cfa.setId(IdGenerator.createId());

		//end-capella-code
		return cfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		//begin-capella-code

		assumption.setId(IdGenerator.createId());

		//end-capella-code
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DG createDG() {
		DGImpl dg = new DGImpl();
		//begin-capella-code

		dg.setId(IdGenerator.createId());

		//end-capella-code
		return dg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sDG createsDG() {
		sDGImpl sDG = new sDGImpl();
		//begin-capella-code

		sDG.setId(IdGenerator.createId());

		//end-capella-code
		return sDG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DA createDA() {
		DAImpl da = new DAImpl();
		//begin-capella-code

		da.setId(IdGenerator.createId());

		//end-capella-code
		return da;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementStateAtrium createElementStateAtrium() {
		ElementStateAtriumImpl elementStateAtrium = new ElementStateAtriumImpl();
		//begin-capella-code

		elementStateAtrium.setId(IdGenerator.createId());

		//end-capella-code
		return elementStateAtrium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureMode createFailureMode() {
		FailureModeImpl failureMode = new FailureModeImpl();
		//begin-capella-code

		failureMode.setId(IdGenerator.createId());

		//end-capella-code
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public assumptionType_Type createassumptionType_TypeFromString(EDataType eDataType, String initialValue) {
		assumptionType_Type result = assumptionType_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertassumptionType_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public validity_Type createvalidity_TypeFromString(EDataType eDataType, String initialValue) {
		validity_Type result = validity_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertvalidity_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtriumPackage getAtriumPackage() {
		return (AtriumPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtriumPackage getPackage() {
		return AtriumPackage.eINSTANCE;
	}

	//begin-capella-code

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public AtriumBasicElement createAtriumBasicElement(String name_p) {
		AtriumBasicElement atriumBasicElement = createAtriumBasicElement();
		atriumBasicElement.setName(name_p);
		return atriumBasicElement;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public CFA_list createCFA_list(String name_p) {
		CFA_list cfA_list = createCFA_list();
		cfA_list.setName(name_p);
		return cfA_list;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public sDG_list createsDG_list(String name_p) {
		sDG_list sDG_list = createsDG_list();
		sDG_list.setName(name_p);
		return sDG_list;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Assumption_list createAssumption_list(String name_p) {
		Assumption_list assumption_list = createAssumption_list();
		assumption_list.setName(name_p);
		return assumption_list;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public DG_list createDG_list(String name_p) {
		DG_list dG_list = createDG_list();
		dG_list.setName(name_p);
		return dG_list;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public DA_list createDA_list(String name_p) {
		DA_list dA_list = createDA_list();
		dA_list.setName(name_p);
		return dA_list;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Failure_list createFailure_list(String name_p) {
		Failure_list failure_list = createFailure_list();
		failure_list.setName(name_p);
		return failure_list;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public CFA createCFA(String name_p) {
		CFA cfa = createCFA();
		cfa.setName(name_p);
		return cfa;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Assumption createAssumption(String name_p) {
		Assumption assumption = createAssumption();
		assumption.setName(name_p);
		return assumption;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public DG createDG(String name_p) {
		DG dg = createDG();
		dg.setName(name_p);
		return dg;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public sDG createsDG(String name_p) {
		sDG sDG = createsDG();
		sDG.setName(name_p);
		return sDG;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public DA createDA(String name_p) {
		DA da = createDA();
		da.setName(name_p);
		return da;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ElementStateAtrium createElementStateAtrium(String name_p) {
		ElementStateAtrium elementStateAtrium = createElementStateAtrium();
		elementStateAtrium.setName(name_p);
		return elementStateAtrium;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public FailureMode createFailureMode(String name_p) {
		FailureMode failureMode = createFailureMode();
		failureMode.setName(name_p);
		return failureMode;
	}

	//end-capella-code
} //AtriumFactoryImpl