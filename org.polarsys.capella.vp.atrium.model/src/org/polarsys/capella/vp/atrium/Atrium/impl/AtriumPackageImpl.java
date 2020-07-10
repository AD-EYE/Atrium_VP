
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
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

import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.Assumption_list;
import org.polarsys.capella.vp.atrium.Atrium.AtriumFactory;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.DG_list;
import org.polarsys.capella.vp.atrium.Atrium.Goal_list;
import org.polarsys.capella.vp.atrium.Atrium.CFAlist;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;
import org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type;
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
	private EClass cfA_listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumption_listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dG_listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cfaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateLinkedElement_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assumptionType_TypeEEnum = null;

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
	public EClass getCFA_list() {
		return cfA_listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCFA_list_CFAs() {
		return (EReference) cfA_listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssumption_list() {
		return assumption_listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssumption_list_Assumptions() {
		return (EReference) assumption_listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDG_list() {
		return dG_listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDG_list_DGs() {
		return (EReference) dG_listEClass.getEStructuralFeatures().get(0);
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
	public EReference getCFA_LinkedtoElement() {
		return (EReference) cfaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCFA_Assumption() {
		return (EReference) cfaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCFA_Goal() {
		return (EReference) cfaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCFA_Content() {
		return (EAttribute) cfaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCFA_State() {
		return (EAttribute) cfaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCFA_StateLinkedElement() {
		return (EAttribute) cfaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssumption_Content() {
		return (EAttribute) assumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssumption_Rationale() {
		return (EAttribute) assumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssumption_Validity() {
		return (EAttribute) assumptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssumption_AssumptionType() {
		return (EAttribute) assumptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDG() {
		return dgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDG_Content() {
		return (EAttribute) dgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getstateLinkedElement_Type() {
		return stateLinkedElement_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getassumptionType_Type() {
		return assumptionType_TypeEEnum;
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
		cfA_listEClass = createEClass(CFA_LIST);
		createEReference(cfA_listEClass, CFA_LIST__CF_AS);

		assumption_listEClass = createEClass(ASSUMPTION_LIST);
		createEReference(assumption_listEClass, ASSUMPTION_LIST__ASSUMPTIONS);

		dG_listEClass = createEClass(DG_LIST);
		createEReference(dG_listEClass, DG_LIST__DGS);

		cfaEClass = createEClass(CFA);
		createEReference(cfaEClass, CFA__LINKEDTO_ELEMENT);
		createEReference(cfaEClass, CFA__ASSUMPTION);
		createEReference(cfaEClass, CFA__GOAL);
		createEAttribute(cfaEClass, CFA__CONTENT);
		createEAttribute(cfaEClass, CFA__STATE);
		createEAttribute(cfaEClass, CFA__STATE_LINKED_ELEMENT);

		assumptionEClass = createEClass(ASSUMPTION);
		createEAttribute(assumptionEClass, ASSUMPTION__CONTENT);
		createEAttribute(assumptionEClass, ASSUMPTION__RATIONALE);
		createEAttribute(assumptionEClass, ASSUMPTION__VALIDITY);
		createEAttribute(assumptionEClass, ASSUMPTION__ASSUMPTION_TYPE);

		dgEClass = createEClass(DG);
		createEAttribute(dgEClass, DG__CONTENT);

		// Create enums
		stateLinkedElement_TypeEEnum = createEEnum(STATE_LINKED_ELEMENT_TYPE);
		assumptionType_TypeEEnum = createEEnum(ASSUMPTION_TYPE_TYPE);
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
		cfA_listEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		cfA_listEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		assumption_listEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		assumption_listEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		dG_listEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		dG_listEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		cfaEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		cfaEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		assumptionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		assumptionEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		dgEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		dgEClass.getESuperTypes().add(theEmdePackage.getElementExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(cfA_listEClass, CFA_list.class, "CFA_list", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFA_list_CFAs(), this.getCFA(), null, "CFAs", null, 0, -1, CFA_list.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(assumption_listEClass, Assumption_list.class, "Assumption_list", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssumption_list_Assumptions(), this.getAssumption(), null, "Assumptions", null, 0, -1, //$NON-NLS-1$
				Assumption_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dG_listEClass, DG_list.class, "DG_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDG_list_DGs(), this.getDG(), null, "DGs", null, 0, -1, DG_list.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(cfaEClass, org.polarsys.capella.vp.atrium.Atrium.CFA.class, "CFA", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFA_LinkedtoElement(), theCapellacorePackage.getCapellaElement(), null, "linkedtoElement", //$NON-NLS-1$
				null, 1, 1, org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFA_Assumption(), this.getAssumption(), null, "assumption", null, 0, -1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFA_Goal(), this.getDG(), null, "goal", null, 1, 1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCFA_Content(), ecorePackage.getEString(), "content", null, 0, 1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCFA_State(), ecorePackage.getEBoolean(), "state", null, 0, 1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCFA_StateLinkedElement(), this.getstateLinkedElement_Type(), "stateLinkedElement", null, 0, 1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssumption_Content(), ecorePackage.getEString(), "content", null, 0, 1, Assumption.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssumption_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Assumption.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssumption_Validity(), ecorePackage.getEString(), "validity", null, 0, 1, Assumption.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssumption_AssumptionType(), this.getassumptionType_Type(), "assumptionType", null, 0, 1, //$NON-NLS-1$
				Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dgEClass, org.polarsys.capella.vp.atrium.Atrium.DG.class, "DG", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDG_Content(), ecorePackage.getEString(), "content", null, 0, 1, //$NON-NLS-1$
				org.polarsys.capella.vp.atrium.Atrium.DG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateLinkedElement_TypeEEnum, stateLinkedElement_Type.class, "stateLinkedElement_Type"); //$NON-NLS-1$
		addEEnumLiteral(stateLinkedElement_TypeEEnum, stateLinkedElement_Type.LEGACY);
		addEEnumLiteral(stateLinkedElement_TypeEEnum, stateLinkedElement_Type.NEW_DEVELOPMENT);

		initEEnum(assumptionType_TypeEEnum, assumptionType_Type.class, "assumptionType_Type"); //$NON-NLS-1$
		addEEnumLiteral(assumptionType_TypeEEnum, assumptionType_Type.CLARIFICATION);
		addEEnumLiteral(assumptionType_TypeEEnum, assumptionType_Type.TASK);
		addEEnumLiteral(assumptionType_TypeEEnum, assumptionType_Type.RISK);

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
		addAnnotation(cfA_listEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/la/1.4.0#//LogicalComponent" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(assumption_listEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/la/1.4.0#//LogicalComponent" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(dG_listEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/la/1.4.0#//LogicalComponent" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(cfaEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(assumptionEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(dgEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction" //$NON-NLS-1$ //$NON-NLS-2$
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
		addAnnotation(cfA_listEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalComponent" //$NON-NLS-1$
		});
		addAnnotation(assumption_listEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalComponent" //$NON-NLS-1$
		});
		addAnnotation(dG_listEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalComponent" //$NON-NLS-1$
		});
		addAnnotation(cfaEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction" //$NON-NLS-1$
		});
		addAnnotation(assumptionEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction" //$NON-NLS-1$
		});
		addAnnotation(dgEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction" //$NON-NLS-1$
		});
	}

} //AtriumPackageImpl
