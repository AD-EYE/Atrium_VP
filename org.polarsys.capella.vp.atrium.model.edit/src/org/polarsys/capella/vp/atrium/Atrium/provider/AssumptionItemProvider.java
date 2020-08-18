
package org.polarsys.capella.vp.atrium.Atrium.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;

import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumFactory;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.vp.atrium.Atrium.Assumption} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssumptionItemProvider extends AtriumBasicElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor createdFromPropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssumptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process AtriumPackage.Literals.ASSUMPTION__CREATED_FROM
			if (createdFromPropertyDescriptor != null) {
				Object createdFromValue = eObject.eGet(AtriumPackage.Literals.ASSUMPTION__CREATED_FROM, true);
				if (createdFromValue != null && createdFromValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) createdFromValue)) {
					itemPropertyDescriptors.remove(createdFromPropertyDescriptor);
				} else if (createdFromValue == null && ExtensionModelManager.getAnyType(eObject,
						AtriumPackage.Literals.ASSUMPTION__CREATED_FROM) != null) {
					itemPropertyDescriptors.remove(createdFromPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(createdFromPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(createdFromPropertyDescriptor);
				}
			}
		}
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLinkedWithCFAsPropertyDescriptor(object);
			addCreatedFromPropertyDescriptor(object);
			addAssumptionTypePropertyDescriptor(object);
			addRationalePropertyDescriptor(object);
			addValidityPropertyDescriptor(object);
			addResponsibleArchitectPropertyDescriptor(object);
			addResponsibleExpertPropertyDescriptor(object);
			addDateOfCompletionPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linked With CF As feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedWithCFAsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_linkedWithCFAs_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_linkedWithCFAs_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__LINKED_WITH_CF_AS, true, false, true, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Created From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedFromPropertyDescriptor(Object object) {
		// begin-extension-code
		createdFromPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_createdFrom_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_createdFrom_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__CREATED_FROM, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(createdFromPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Rationale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRationalePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_rationale_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_rationale_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__RATIONALE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Validity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidityPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_validity_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_validity_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__VALIDITY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Responsible Architect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsibleArchitectPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_responsibleArchitect_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_responsibleArchitect_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__RESPONSIBLE_ARCHITECT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Responsible Expert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsibleExpertPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_responsibleExpert_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_responsibleExpert_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__RESPONSIBLE_EXPERT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Date Of Completion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateOfCompletionPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_dateOfCompletion_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_dateOfCompletion_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__DATE_OF_COMPLETION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Assumption Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumptionTypePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Assumption_assumptionType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Assumption_assumptionType_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Assumption_type"), //$NON-NLS-1$
				AtriumPackage.Literals.ASSUMPTION__ASSUMPTION_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This returns Assumption.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Assumption")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Assumption) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_Assumption_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Assumption.class)) {
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
		case AtriumPackage.ASSUMPTION__RATIONALE:
		case AtriumPackage.ASSUMPTION__VALIDITY:
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_ARCHITECT:
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_EXPERT:
		case AtriumPackage.ASSUMPTION__DATE_OF_COMPLETION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}