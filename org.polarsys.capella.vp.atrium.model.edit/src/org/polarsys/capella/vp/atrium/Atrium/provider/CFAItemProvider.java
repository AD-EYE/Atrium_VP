
package org.polarsys.capella.vp.atrium.Atrium.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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

import org.polarsys.capella.vp.atrium.Atrium.AtriumFactory;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.CFA;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.vp.atrium.Atrium.CFA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CFAItemProvider extends NamedElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor linkedtoElementPropertyDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor goalPropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFAItemProvider(AdapterFactory adapterFactory) {
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
			// Process AtriumPackage.Literals.CFA__LINKEDTO_ELEMENT
			if (linkedtoElementPropertyDescriptor != null) {
				Object linkedtoElementValue = eObject.eGet(AtriumPackage.Literals.CFA__LINKEDTO_ELEMENT, true);
				if (linkedtoElementValue != null && linkedtoElementValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) linkedtoElementValue)) {
					itemPropertyDescriptors.remove(linkedtoElementPropertyDescriptor);
				} else if (linkedtoElementValue == null && ExtensionModelManager.getAnyType(eObject,
						AtriumPackage.Literals.CFA__LINKEDTO_ELEMENT) != null) {
					itemPropertyDescriptors.remove(linkedtoElementPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(linkedtoElementPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(linkedtoElementPropertyDescriptor);
				}
			}
			// Process AtriumPackage.Literals.CFA__GOAL
			if (goalPropertyDescriptor != null) {
				Object goalValue = eObject.eGet(AtriumPackage.Literals.CFA__GOAL, true);
				if (goalValue != null && goalValue instanceof EObject
						&& ModelExtensionHelper.getInstance(eObject).isExtensionModelDisabled((EObject) goalValue)) {
					itemPropertyDescriptors.remove(goalPropertyDescriptor);
				} else if (goalValue == null
						&& ExtensionModelManager.getAnyType(eObject, AtriumPackage.Literals.CFA__GOAL) != null) {
					itemPropertyDescriptors.remove(goalPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(goalPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(goalPropertyDescriptor);
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

			addLinkedtoElementPropertyDescriptor(object);
			addAssumptionPropertyDescriptor(object);
			addGoalPropertyDescriptor(object);
			addContentPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linkedto Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedtoElementPropertyDescriptor(Object object) {
		// begin-extension-code
		linkedtoElementPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CFA_linkedtoElement_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CFA_linkedtoElement_feature", "_UI_CFA_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				AtriumPackage.Literals.CFA__LINKEDTO_ELEMENT, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(linkedtoElementPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Assumption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumptionPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CFA_assumption_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CFA_assumption_feature", "_UI_CFA_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				AtriumPackage.Literals.CFA__ASSUMPTION, true, false, true, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalPropertyDescriptor(Object object) {
		// begin-extension-code
		goalPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CFA_goal_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CFA_goal_feature", "_UI_CFA_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				AtriumPackage.Literals.CFA__GOAL, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(goalPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CFA_content_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CFA_content_feature", "_UI_CFA_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				AtriumPackage.Literals.CFA__CONTENT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CFA_state_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CFA_state_feature", "_UI_CFA_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				AtriumPackage.Literals.CFA__STATE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This returns CFA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CFA")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((CFA) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_CFA_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(CFA.class)) {
		case AtriumPackage.CFA__CONTENT:
		case AtriumPackage.CFA__STATE:
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
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					AtriumFactory.eINSTANCE.createCFA_list());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					AtriumFactory.eINSTANCE.createAssumption_list());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, AtriumFactory.eINSTANCE.createDG_list());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, AtriumFactory.eINSTANCE.createCFA());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					AtriumFactory.eINSTANCE.createAssumption());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, AtriumFactory.eINSTANCE.createDG());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					AtriumFactory.eINSTANCE.createElementStateAtrium());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

}