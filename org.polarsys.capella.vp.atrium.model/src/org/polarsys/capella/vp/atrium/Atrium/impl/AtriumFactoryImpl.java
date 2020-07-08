
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.ecore.EClass;
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
		case AtriumPackage.CFA:
			return createCFA();
		case AtriumPackage.ASSUMPTION:
			return createAssumption();
		case AtriumPackage.DG:
			return createDG();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
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

	//end-capella-code
} //AtriumFactoryImpl