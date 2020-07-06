
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;

import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;

import org.polarsys.capella.core.data.epbs.EpbsPackage;

import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;

import org.polarsys.capella.core.data.la.LaPackage;

import org.polarsys.capella.core.data.oa.OaPackage;

import org.polarsys.capella.core.data.pa.PaPackage;

import org.polarsys.capella.core.data.requirement.RequirementPackage;

import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.capella.vp.atrium.Atrium.AtriumFactory;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtriumPackageImpl extends EPackageImpl implements AtriumPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cfaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtriumPackageImpl() {
		super(eNS_URI, AtriumFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AtriumPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtriumPackage init() {
		if (isInited)
			return (AtriumPackage) EPackage.Registry.INSTANCE.getEPackage(AtriumPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtriumPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtriumPackageImpl theAtriumPackage = registeredAtriumPackage instanceof AtriumPackageImpl
				? (AtriumPackageImpl) registeredAtriumPackage
				: new AtriumPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAtriumPackage.createPackageContents();

		// Initialize created meta-data
		theAtriumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtriumPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtriumPackage.eNS_URI, theAtriumPackage);
		return theAtriumPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCFA() {
		return cfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCFA_Content() {
		return (EAttribute) cfaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCFA_State() {
		return (EAttribute) cfaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtriumFactory getAtriumFactory() {
		return (AtriumFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cfaEClass = createEClass(CFA);
		createEAttribute(cfaEClass, CFA__CONTENT);
		createEAttribute(cfaEClass, CFA__STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cfaEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		cfaEClass.getESuperTypes().add(theEmdePackage.getElementExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(cfaEClass, org.polarsys.capella.vp.atrium.Atrium.CFA.class, "CFA", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCFA_Content(), ecorePackage.getEString(), "content", null, 0, 1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCFA_State(), ecorePackage.getEBoolean(), "state", null, 0, 1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$
		addAnnotation(cfaEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
				" http://www.polarsys.org/capella/core/core/1.4.0#//NamedElement http://www.polarsys.org/capella/core/fa/1.4.0#//FunctionalExchange http://www.polarsys.org/capella/core/pa/1.4.0#//PhysicalFunction http://www.polarsys.org/capella/core/la/1.4.0#//LogicalFunction" //$NON-NLS-1$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$
		addAnnotation(cfaEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaCore.ecore#//NamedElement platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//FunctionalExchange platform:/plugin/org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore#//PhysicalFunction platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalFunction" //$NON-NLS-1$
		});
	}

} //AtriumPackageImpl
