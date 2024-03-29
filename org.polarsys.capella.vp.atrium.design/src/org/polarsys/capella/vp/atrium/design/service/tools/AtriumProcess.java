//Manually-edited
package org.polarsys.capella.vp.atrium.design.service.tools;


import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.internal.DataValue;

import org.eclipse.emf.ecore.xml.type.internal.DataValue.URI.MalformedURIException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.data.capellacommon.TransfoLink;
import org.polarsys.capella.core.data.capellacommon.impl.TransfoLinkImpl;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellamodeller.util.CapellamodellerResourceImpl;
import org.polarsys.capella.core.data.cs.impl.PartImpl;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl;
import org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.Assumption_list;
import org.polarsys.capella.vp.atrium.Atrium.AtriumBasicElement;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.DA_list;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.DG_list;
import org.polarsys.capella.vp.atrium.Atrium.FR;
import org.polarsys.capella.vp.atrium.Atrium.FR_list;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.Failure_list;
import org.polarsys.capella.vp.atrium.Atrium.ODD;
import org.polarsys.capella.vp.atrium.Atrium.ODD_list;
import org.polarsys.capella.vp.atrium.Atrium.sDG;
import org.polarsys.capella.vp.atrium.Atrium.sDG_list;
import org.polarsys.capella.vp.atrium.Atrium.state_Type;
import org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

@SuppressWarnings("serial")
/**
 * @brief  Class that launches the UI - AtriumProcess
 */
public class AtriumProcess extends javax.swing.JFrame {
	
	//required to legally write in the EMF file
	TransactionalEditingDomain domain = null;
	
	//internal list of element
	EList<CFA> listCFA = new BasicEList<CFA>();
	EList<Assumption> listAssumption = new BasicEList<Assumption>();
	EList<DG> listDG = new BasicEList<DG>();
	EList<DA> listDA = new BasicEList<DA>();
	EList<sDG> listsDG = new BasicEList<sDG>();
	EList<FailureMode> ListFailureMode = new BasicEList<FailureMode>();
	EList<ODD> listODD = new BasicEList<ODD>();
	EList<FR> listFR = new BasicEList<FR>();
	EList<EObject> ListCapellaElement = new BasicEList<EObject>();
	
	EList<String> ListCapellaElementName = new BasicEList<String>();
	
	//Displayed list 
	DefaultListModel<String> nameLinkedAssumption = new DefaultListModel<String>();
	DefaultListModel<String> nameLinkedDAtoCFA = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedDAtoCFA = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedAssumption = new DefaultListModel<String>();
	DefaultListModel<String> nameLinkedsDG = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedsDG = new DefaultListModel<String>();
	DefaultListModel<String> nameLinkedDA = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedDA = new DefaultListModel<String>();
	DefaultListModel<String> nameLinkedCFA = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedCFA = new DefaultListModel<String>();
	
	//determined sortAtriumElementOnce and are then constant
	LogicalComponentPkg the_LogicalComponentPkg = null;
	sDG_list the_sDG_list = null;
	CFA_list the_CFA_list = null;
	Failure_list the_Failure_list = null;
	Assumption_list the_Assumption_list = null;
	DG_list the_DG_list = null;
	DA_list the_DA_list= null;
	ODD_list the_ODD_list = null;
	FR_list the_FR_list = null;
	
	//Auxiliary editors (described in the corresponding file)
	EditingFrameAssumption myAssumptionEditor = null;
	EditingPanel myEditor = null;
	
	/**
     * @brief  Atrium constructor - Gather ressources and library, then launch the Atrium process and UI
     * @param element The element the user clicked to lauch the UI
     * @param selectedList The list of diagram the user want to process, if null it process the whole model + library
     * @param library_path The absolute path of the library 
     */
	public AtriumProcess(EObject element, List<String> selectedList, String library_path) {
		
		EObject root = element;
		while (!((root==null)||(root instanceof LogicalArchitecture))){root = root.eContainer();}
		EList<TreeIterator <EObject>> treeArchList = new BasicEList<TreeIterator <EObject>>();
		treeArchList.add(root.eAllContents());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = null;
		
		URI URI1=null;
		
		if (!(library_path.equals("")))
		{
			try {
				URI1 = URI.createFileURI(library_path);  
				//C:/capellaStudio/runtime-New_configuration/Libel/Libel.melodymodeller -> example
				 resource = resourceSet.getResource(URI1, true);
				 treeArchList.add(((CapellamodellerResourceImpl) resource).getContents().get(0).eAllContents());
			} catch (Exception exception) {
				System.out.println("Unable to open the additional ressource. Please double check the library path.");
			}
		}
		
        domain = TransactionUtil.getEditingDomain(element);
      
		sortAtriumElementOnce(treeArchList);
		
		//recreate the iterator as they cannot be reset
		EList<TreeIterator <EObject>> treeArchList2 = new BasicEList<TreeIterator <EObject>>();
		treeArchList2.add(root.eAllContents());
		
		if (!(library_path.equals("")))
		{
			try {
				treeArchList2.add(((CapellamodellerResourceImpl) resource).getContents().get(0).eAllContents());
			} catch (Exception e) {
				System.out.println("Unable to open the additional ressource. Please double check the library path.");
			}
		}
		
		
		if (selectedList==null) {sortCapellaElementOnce(treeArchList2);}
		else {sortCapellaElementOnceDiagram(selectedList, root);}
		createLists();
		updateCFA();
		initComponents();
		updateDGComboBox();
		updateComboBoxAssumption();
		updateDisplayTab0();
		updateDisplayTab1();
		updateDisplayTab2();
		updateDisplayTab3();
		updateDisplayTab4();
		
		myAssumptionEditor = new EditingFrameAssumption(this);
		myEditor = new EditingPanel(this);
		
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | Frame.MAXIMIZED_BOTH);
		
		this.setVisible(true);
	}

	/**
     * @brief  On UI start, sort all AtriumBasicElement in the model + library in order to be processed later
     * @param treeArchList The list of iterators used to go through the whole model + library
     */
	private void sortAtriumElementOnce(EList<TreeIterator<EObject>> treeArchList)
	{       
		for (TreeIterator<EObject> treeArch : treeArchList)
		{
			EObject node = null;
			while(treeArch.hasNext())
			{
			  node = treeArch.next();
			  if (node instanceof FailureMode){ListFailureMode.add((FailureMode) node);}
			  if (node instanceof DG){listDG.add((DG) node);}
			  if (node instanceof DA){listDA.add((DA) node);}
			  if (node instanceof sDG){listsDG.add((sDG) node);}
			  if (node instanceof CFA){listCFA.add((CFA) node);}
			  if (node instanceof ODD){listODD.add((ODD) node);} 
			  if (node instanceof FR){listFR.add((FR) node);} 
			  if (node instanceof Assumption){listAssumption.add((Assumption) node);}
			  if (node instanceof LogicalComponentPkg){the_LogicalComponentPkg = (LogicalComponentPkg) node;} 
			  if (node instanceof CFA_list){the_CFA_list = (CFA_list) node;}
			  if (node instanceof sDG_list){the_sDG_list = (sDG_list) node;}
			  if (node instanceof Failure_list){the_Failure_list = (Failure_list) node;}
			  if (node instanceof Assumption_list){the_Assumption_list = (Assumption_list) node;}
			  if (node instanceof DA_list){the_DA_list = (DA_list) node;}
			  if (node instanceof DG_list){the_DG_list = (DG_list) node;}
			  if (node instanceof ODD_list){the_ODD_list = (ODD_list) node;}
			  if (node instanceof FR_list){the_FR_list = (FR_list) node;}
			}
		}
	}
	
	/**
     * @brief  On UI start, sort all Capella element in the model + library in order to be processed later'
     * @param treeArchList The list of iterators used to go through the whole model + library
     */
	private void sortCapellaElementOnce(EList<TreeIterator<EObject>> treeArchList)
	{
		for (TreeIterator<EObject> treeArch : treeArchList)
		{
			EObject node = null;
			while(treeArch.hasNext())
			{
				node = treeArch.next();
				if (node instanceof LogicalFunction)
				{
					LogicalFunction lf = (LogicalFunction) node;
					ListCapellaElement.add(lf);
					ListCapellaElementName.add("[LF] " + lf.getName());
				}
				
				if (node instanceof LogicalComponent)
				{
					LogicalComponent lc = (LogicalComponent) node;
					ListCapellaElement.add(lc);
					ListCapellaElementName.add("[LC] " + lc.getName());
				}
				
				if (node instanceof FunctionalExchange)
				{
					FunctionalExchange fe = (FunctionalExchange) node;
					ListCapellaElement.add(fe);
					ListCapellaElementName.add("[FE] " + fe.getName());
				}
				
				if (node instanceof ComponentExchange)
				{
					ComponentExchange ce = (ComponentExchange) node;
					ListCapellaElement.add(ce);
					ListCapellaElementName.add("[CE] " + ce.getName());
				}
			}
		}
		Collections.sort(ListCapellaElementName);
	}
	
	/**
     * @brief  On UI start, sort all Capella element in the diagram in list in order to be processed later
     * @param selectedList The selected list of diagrams the user want to process
     * @param root The root of the project, currently the logical architecture
     */
	private void sortCapellaElementOnceDiagram(List<String> selectedList, EObject root)
	{
		Session session = SessionManager.INSTANCE.getSession(root);
		for (DRepresentationDescriptor descriptor :  DialectManager.INSTANCE.getAllRepresentationDescriptors(session))
		{
			   DDiagram diagram = (DDiagram)descriptor.getRepresentation();
			   if (selectedList.contains(diagram.getName()))
			   {
				   for (DDiagramElement element: diagram.getDiagramElements())
				   {
					   if ((element.isVisible()))
					   {
						   if (element.getTarget() instanceof PartImpl)
						   {  
							   LogicalComponent lc = null;
							   EList<EObject> list = element.getTarget().eCrossReferences(); // strange
							   for (EObject eo : list)
							   {
								   if (eo instanceof LogicalComponent){lc = (LogicalComponent) eo;}
							   }
							   ListCapellaElement.add(lc);
							   ListCapellaElementName.add("[LC] " + lc.getName());
						   }
						   if (element.getTarget() instanceof FunctionalExchangeImpl)
						   {
							   FunctionalExchange fe = (FunctionalExchange) element.getTarget();
							   ListCapellaElement.add(fe);
							   ListCapellaElementName.add("[FE] " + fe.getName());
						   }
						   if (element.getTarget() instanceof ComponentExchangeImpl)
						   {
							   ComponentExchange ce = (ComponentExchange) element.getTarget();
							   ListCapellaElement.add(ce);
							   ListCapellaElementName.add("[CE] " + ce.getName());
						   }
						   if (element.getTarget() instanceof LogicalFunctionImpl)
						   { 
							   LogicalFunction lf = (LogicalFunction) element.getTarget();
							   ListCapellaElement.add(lf);
							   ListCapellaElementName.add("[LF] " + lf.getName());
						   }
					   }
				   }
			   }
		}
	}
	
	/**
     * @brief  On UI start, if they are not found in the main project, the AtriumBasicElement list are created there
     */
	private void createLists() {
		domain.getCommandStack().execute(new RecordingCommand(domain) { // in a transaction context, create any list that has not been found
	        @Override
	        protected void doExecute() {
	        	if (the_Assumption_list==null)
	        	{
	        		the_Assumption_list = AtriumFactoryImpl.eINSTANCE.createAssumption_list();
	        		((CapellaElement) the_Assumption_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_Assumption_list);
	        	}
	        	if (the_DA_list==null)
	        	{
	        		the_DA_list = AtriumFactoryImpl.eINSTANCE.createDA_list();
	        		((CapellaElement) the_DA_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_DA_list);
	        	}
	        	if (the_DG_list==null)
	        	{
	        		the_DG_list = AtriumFactoryImpl.eINSTANCE.createDG_list();
	        		((CapellaElement) the_DG_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_DG_list);
	        	}
	        	if (the_CFA_list==null)
	        	{
	        		the_CFA_list = AtriumFactoryImpl.eINSTANCE.createCFA_list();
	        		((CapellaElement) the_CFA_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_CFA_list);
	        	}
	        	if (the_Failure_list==null)
	        	{
	        		the_Failure_list = AtriumFactoryImpl.eINSTANCE.createFailure_list();
	        		((CapellaElement) the_Failure_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_Failure_list);
	        	}
	        	if (the_sDG_list==null)
	        	{
	        		the_sDG_list = AtriumFactoryImpl.eINSTANCE.createsDG_list();
	        		((CapellaElement) the_sDG_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_sDG_list);
	        	}
	        	if (the_ODD_list==null)
	        	{
	        		the_ODD_list = AtriumFactoryImpl.eINSTANCE.createODD_list();
	        		((CapellaElement) the_ODD_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_ODD_list);
	        	}
	        	if (the_FR_list==null)
	        	{
	        		the_FR_list = AtriumFactoryImpl.eINSTANCE.createFR_list();
	        		((CapellaElement) the_FR_list).setId(EcoreUtil.generateUUID());
	        		((ExtensibleElement) the_LogicalComponentPkg).getOwnedExtensions().add((ElementExtension) the_FR_list);
	        	}
	        }
	    });
	}
	
	/**
     * @brief  On UI start, make sure all CFA are created and consistent with the failure mode and capella elements
     */
	private void updateCFA()
	{
		//first rename CFA whose failure might have been renamed
		for (CFA cfa : listCFA)
		{
			NamedElement capella_object = (NamedElement) cfa.getLinkedtoElement();
			String name = capella_object.getName();
			String failure = cfa.getLinkedtoFailure().getName();
			if (!(cfa.getName().equals(name + " : " + failure)))
			{
				final CFA cfa_p=cfa;
				final String name_p=name;
				final String failure_p=failure;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	cfa_p.setName(name_p + " : " + failure_p);
			        }
			    });
			}
		}
		
		
		//create or delete CFAs in CFA list that have not been found yet
		EList<CFA> temp_listCFA = new BasicEList<CFA>();
		for (CFA cfa : listCFA) {temp_listCFA.add(cfa);}

		for (CFA cfa : temp_listCFA)
		{
			if ((cfa.getLinkedtoElement()==null) || (cfa.getLinkedtoFailure()==null))
			{
				final CFA old_cfa=cfa;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	((ExtensibleElement) the_CFA_list).getOwnedExtensions().remove(old_cfa);//the remove action is done there, within a transaction context
			        }
			    });
				listCFA.remove(cfa);
			}
		}

		for (EObject obj : ListCapellaElement)
		{
			NamedElement el = (NamedElement) obj;
			
			for (FailureMode f : ListFailureMode)
			{
				boolean found = false;
				
				for (CFA cfa : listCFA){if (cfa.getName().equals(el.getName() + " : " + f.getName())) {found = true;}}
				
				if (!(found))
				{
					final CFA newCFA = AtriumFactoryImpl.eINSTANCE.createCFA();
					newCFA.setContent("Some content");
					newCFA.setState(state_Type.UNPROCESSED);
					newCFA.setName(el.getName() + " : " + f.getName());
					newCFA.setLinkedtoElement(el);
					newCFA.setLinkedtoFailure(f);
					
	
					domain.getCommandStack().execute(new RecordingCommand(domain) {
					        @Override
					        protected void doExecute() {
					        	((ExtensibleElement) the_CFA_list).getOwnedExtensions().add((ElementExtension) newCFA);//the add action is done there, within a transaction context
					        }
					    });
					 
					listCFA.add(newCFA);//updating our local list
				}
			}
		}
	}
	
	/**
     * @brief  Create all Swing Component on the window
     * Add the listeners, initialize some list
     */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() { 
		//Copy and paste the netbean generated code here. Just make sure to keep the Action listener coded here right under the variables declaration. Also, three lists have been overridden
		
		java.awt.GridBagConstraints gridBagConstraints;
		
		//First paste all the variable declaration here
		 	jTabbedPane = new javax.swing.JTabbedPane();
	        jPanel1 = new javax.swing.JPanel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jListUnlinkedAssumptions = new javax.swing.JList();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        jListLinkedAssumptions = new javax.swing.JList();
	        jLabel1 = new javax.swing.JLabel();
	        jButtonAddLinked = new javax.swing.JButton();
	        jLabel2 = new javax.swing.JLabel();
	        jButtonRemoveLinked = new javax.swing.JButton();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jComboBoxCFA = new javax.swing.JComboBox();
	        jLabel19 = new javax.swing.JLabel();
	        jLabel20 = new javax.swing.JLabel();
	        jComboBoxDG = new javax.swing.JComboBox();
	        jLabel21 = new javax.swing.JLabel();
	        jLabel11 = new javax.swing.JLabel();
	        jScrollPane17 = new javax.swing.JScrollPane();
	        jListLinkedDAtoCFA = new javax.swing.JList();
	        jLabel12 = new javax.swing.JLabel();
	        jScrollPane16 = new javax.swing.JScrollPane();
	        jListUnlinkedDAtoCFA = new javax.swing.JList();
	        jButtonAddLinkedDAtoCFA = new javax.swing.JButton();
	        jButtonRemoveDAtoCFA = new javax.swing.JButton();
	        jLabel13 = new javax.swing.JLabel();
	        jLabel14 = new javax.swing.JLabel();
	        jPanel2 = new javax.swing.JPanel();
	        jScrollPane3 = new javax.swing.JScrollPane();
	        jListUnlinkedDA = new javax.swing.JList();
	        jScrollPane4 = new javax.swing.JScrollPane();
	        jListLinkedDA = new javax.swing.JList();
	        jLabel5 = new javax.swing.JLabel();
	        jButtonAddLinkedDA = new javax.swing.JButton();
	        jLabel6 = new javax.swing.JLabel();
	        jButtonRemoveLinkedDA = new javax.swing.JButton();
	        jLabel7 = new javax.swing.JLabel();
	        jComboBoxDG2 = new javax.swing.JComboBox();
	        jLabel9 = new javax.swing.JLabel();
	        jLabel23 = new javax.swing.JLabel();
	        jScrollPane14 = new javax.swing.JScrollPane();
	        jListUnlinkedSDG = new javax.swing.JList();
	        jLabel37 = new javax.swing.JLabel();
	        jScrollPane15 = new javax.swing.JScrollPane();
	        jListLinkedSDG = new javax.swing.JList();
	        jLabel39 = new javax.swing.JLabel();
	        jButtonAddLinkedSDG = new javax.swing.JButton();
	        jLabel40 = new javax.swing.JLabel();
	        jButtonRemoveLinkedSDG = new javax.swing.JButton();
	        jLabel10 = new javax.swing.JLabel();
	        jPanel3 = new javax.swing.JPanel();
	        jScrollPane8 = new javax.swing.JScrollPane();
	        jListDG = new javax.swing.JList();
	        jScrollPane6 = new javax.swing.JScrollPane();
	        jListDA = new javax.swing.JList();
	        jButtonAddDG = new javax.swing.JButton();
	        jButtonAddDA = new javax.swing.JButton();
	        jScrollPane9 = new javax.swing.JScrollPane();
	        jListCFA = new javax.swing.JList();
	        jLabel25 = new javax.swing.JLabel();
	        jLabel26 = new javax.swing.JLabel();
	        jLabel27 = new javax.swing.JLabel();
	        jLabel29 = new javax.swing.JLabel();
	        jScrollPane13 = new javax.swing.JScrollPane();
	        jListSDG = new javax.swing.JList();
	        jButtonAddSDG = new javax.swing.JButton();
	        jLabel36 = new javax.swing.JLabel();
	        jButtonRemoveDG = new javax.swing.JButton();
	        jButtonRemoveDA = new javax.swing.JButton();
	        jButtonRemoveSDG = new javax.swing.JButton();
	        jPanel5 = new javax.swing.JPanel();
	        jScrollPane7 = new javax.swing.JScrollPane();
	        jListAssumption = new javax.swing.JList();
	        jButtonAddAssumption = new javax.swing.JButton();
	        jLabel8 = new javax.swing.JLabel();
	        jScrollPane11 = new javax.swing.JScrollPane();
	        jListODD = new javax.swing.JList();
	        jScrollPane12 = new javax.swing.JScrollPane();
	        jListFR = new javax.swing.JList();
	        jLabel32 = new javax.swing.JLabel();
	        jLabel33 = new javax.swing.JLabel();
	        jButtonAddODD = new javax.swing.JButton();
	        jButtonAddFR = new javax.swing.JButton();
	        jButtonRemoveAssumption = new javax.swing.JButton();
	        jButtonRemoveODD = new javax.swing.JButton();
	        jButtonRemoveFR = new javax.swing.JButton();
	        jLabel31 = new javax.swing.JLabel();
	        jLabel30 = new javax.swing.JLabel();
	        jButtonAddFailure = new javax.swing.JButton();
	        jButtonRemoveFM = new javax.swing.JButton();
	        jLabel24 = new javax.swing.JLabel();
	        jScrollPane10 = new javax.swing.JScrollPane();
	        jListFailure = new javax.swing.JList();
	        jScrollPane5 = new javax.swing.JScrollPane();
	        jListCapella = new javax.swing.JList();
	        jPanel4 = new javax.swing.JPanel();
	        jScrollPane18 = new javax.swing.JScrollPane();
	        jListUnlinkedCFA = new javax.swing.JList();
	        jScrollPane19 = new javax.swing.JScrollPane();
	        jListLinkedCFA = new javax.swing.JList();
	        jLabel15 = new javax.swing.JLabel();
	        jButtonAddLinkedCFA = new javax.swing.JButton();
	        jLabel16 = new javax.swing.JLabel();
	        jButtonRemoveLinkedCFA = new javax.swing.JButton();
	        jLabel17 = new javax.swing.JLabel();
	        jComboBoxAssumption = new javax.swing.JComboBox();
	        jLabel18 = new javax.swing.JLabel();
	        jLabel28 = new javax.swing.JLabel();
	        jLabel22 = new javax.swing.JLabel();
        
        
        //three lists have been overridden here
        jListFR = new javax.swing.JList()
        {
        	public String getToolTipText(MouseEvent me) 
        	{
        		FR edited_FR=null;
                int index = locationToIndex(me.getPoint());
                if (index > -1) 
                {
                   String item = (String) getModel().getElementAt(index);
                   for (FR fr : listFR) //Go through all the assumptions to find the one with the same name
           		{
					if (fr.getName().equals(item)){edited_FR=fr;}
           		}
                   return "<html><p width=\"500\">" + edited_FR.getContent() + "</p></html>";
                }
                return null;
            }
        };
        
        jListODD = new javax.swing.JList()
        {
        	public String getToolTipText(MouseEvent me) 
        	{
        		ODD edited_odd=null;
                int index = locationToIndex(me.getPoint());
                if (index > -1) 
                {
                   String item = (String) getModel().getElementAt(index);
                   for (ODD odd : listODD) //Go through all the assumptions to find the one with the same name
           		{
					if (odd.getName().equals(item)){edited_odd=odd;}
           		}
                   return "<html><p width=\"500\">" + edited_odd.getContent() + "</p></html>";
                }
                return null;
            }
        };
        
        jListAssumption = new javax.swing.JList()
        {
        	public String getToolTipText(MouseEvent me) 
        	{
        		Assumption edited_assumption=null;
                int index = locationToIndex(me.getPoint());
                if (index > -1) 
                {
                   String item = (String) getModel().getElementAt(index);
                   for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
           		{
					if (a.getName().equals(item)){edited_assumption=a;}
           		}
                   return "<html><p width=\"500\">" + edited_assumption.getContent() + "</p></html>";
                }
                return null;
            }
        };
        
        //all modified initializations are there
		
        DefaultComboBoxModel <String> CbCFA= new DefaultComboBoxModel<String>();
		for (int i = 0; i < listCFA.size(); i++) {
			if (!(listCFA.get(i).isNonApplicable())){CbCFA.addElement(listCFA.get(i).getName());}	
		}
		
		DefaultListModel <String> listModelCFA = new DefaultListModel<String>();
        for (CFA cfa : listCFA){if(!(cfa.isNonApplicable())) {listModelCFA.addElement(cfa.getName());}}
        jListCFA.setModel(listModelCFA);
        
        
        jComboBoxAssumption.setMaximumRowCount(20);
		jComboBoxCFA.setModel(CbCFA);
		jComboBoxCFA.setMaximumRowCount(20);
		jComboBoxDG.setMaximumRowCount(20);
		DefaultListModel <String> listModel = new DefaultListModel<String>();
        for (int i = 0; i < ListCapellaElementName.size(); i++)
        {
            listModel.addElement(ListCapellaElementName.get(i));
        }
	    jListCapella.setModel(listModel);
	    
	    AutoCompletion.enable(jComboBoxDG);
	    AutoCompletion.enable(jComboBoxDG2);
	    AutoCompletion.enable(jComboBoxCFA);
	    AutoCompletion.enable(jComboBoxAssumption);
        
        //all listeners have been put below
	    jListUnlinkedDAtoCFA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt,jListUnlinkedDAtoCFA, listDA);
            }
        });
	    jListLinkedDAtoCFA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt,jListLinkedDAtoCFA, listDA);
            }
        });
		jListUnlinkedDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt,jListUnlinkedDA, listDA);
            }
        });
		jListLinkedDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListLinkedDA, listDA);
            }
        });
		jListUnlinkedSDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListUnlinkedSDG, listsDG);
            }
        });
		jListLinkedSDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListLinkedSDG, listsDG);
            }
        });
		
		jListUnlinkedCFA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListUnlinkedCFA, listCFA);
            }
        });
		jListLinkedCFA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListLinkedCFA, listCFA);
            }
        });
		jListCFA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListCFA, listCFA);
            }
        });
		jListDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListDG, listDG);
            }
        });
		jListSDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListSDG, listsDG);
            }
        });
		jListDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListDA, listDA);
            }
        });
		jListFailure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jListMouseClicked(evt,jListFailure, ListFailureMode);
            }
        });
		jListODD.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jListMouseClicked(evt,jListODD,listODD);
			}
		});			
		jListFR.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jListMouseClicked(evt,jListFR, listFR);
			}
		});
		
		jListAssumption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAssumptionMouseClicked(evt);
            }
        });
		jListLinkedAssumptions.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jListLinkedAssumptionsMouseClicked(evt);
	        }
	    });
		jListUnlinkedAssumptions.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jListUnlinkedAssumptionMouseClicked(evt);
	        }
	    });
		
		jButtonRemoveFM.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveObject(evt,1);
			}
		});
		jButtonRemoveDG.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveObject(evt,2);
			}
		});
		jButtonRemoveDA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveObject(evt,3);
			}
		});
		jButtonRemoveSDG.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveObject(evt,4);
			}
		});
		jButtonRemoveODD.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveObject(evt,5);
			}
		});
		jButtonRemoveFR.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveObject(evt,6);
			}
		});
		jButtonRemoveAssumption.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveObject(evt,7);
			}
		});
		
		
		jButtonAddLinked.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				moveObject(1);
			}
		});
		
		jButtonRemoveLinked.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				moveObject(2);
			}
		});
	   jComboBoxCFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 updateDisplayTab0();
            }
        });
        jComboBoxDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDGActionPerformed(evt);
            }
        });
        jComboBoxDG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	updateDisplayTab1();
            }
        });
        jComboBoxAssumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	updateDisplayTab4();
            }
        });
        jButtonAddLinkedDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveObject(5);
            }
        });
        jButtonRemoveLinkedDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	moveObject(6);
            }
        });
        jButtonAddLinkedSDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	moveObject(3);
            }
        });
        jButtonRemoveLinkedSDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	moveObject(4);
            }
        });
        jButtonAddDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	createAtriumElement("Default DG Name", 2);
            }
        });
        jButtonAddDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	createAtriumElement("Default DA Name", 3);
            }
        });
        jButtonAddSDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	createAtriumElement("Default sDG Name", 4);
            }
        });
        jButtonAddAssumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	createAtriumElement("Default Assumption Name", 7);
            }
        });
        jButtonAddODD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	createAtriumElement("Default ODD Name", 5);
            }
        });
        jButtonAddFR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	createAtriumElement("Default FR Name",6);
            }
        });
        jButtonAddFailure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	createAtriumElement("Default Failure Name",1);
            }
        }); 
        jButtonAddLinkedDAtoCFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	moveObject(7);
            }
        });
        jButtonRemoveDAtoCFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	moveObject(8);
            }
        });
        jButtonAddLinkedCFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	moveObject(9);
            }
        });
        jButtonRemoveLinkedCFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	moveObject(10);
            }
        });
	        
	     //Paste the netBean generated code here (initComponent). Remove all the <>. Cut and paste the variable declaration as well to the top

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 20, 0, 20, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 1000));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel1.setLayout(jPanel1Layout);

        jScrollPane1.setViewportView(jListUnlinkedAssumptions);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 40.0;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setViewportView(jListLinkedAssumptions);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 0.2;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jLabel1.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 5.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jButtonAddLinked.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jButtonAddLinked, gridBagConstraints);

        jLabel2.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 5.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jButtonRemoveLinked.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jButtonRemoveLinked, gridBagConstraints);

        jLabel3.setText("Unlinked Assumptions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 40.0;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Linked Assumptions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 40.0;
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 40.0;
        jPanel1.add(jComboBoxCFA, gridBagConstraints);

        jLabel19.setText("CFA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jLabel19, gridBagConstraints);

        jLabel20.setText("linked to :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 5.0;
        jPanel1.add(jLabel20, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 40.0;
        jPanel1.add(jComboBoxDG, gridBagConstraints);

        jLabel21.setText("Design Goal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 40.0;
        jPanel1.add(jLabel21, gridBagConstraints);

        jLabel11.setText("Linked DA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        jPanel1.add(jLabel11, gridBagConstraints);

        jScrollPane17.setViewportView(jListLinkedDAtoCFA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 0.2;
        jPanel1.add(jScrollPane17, gridBagConstraints);

        jLabel12.setText("Unlinked DA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel1.add(jLabel12, gridBagConstraints);

        jScrollPane16.setViewportView(jListUnlinkedDAtoCFA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 40.0;
        jPanel1.add(jScrollPane16, gridBagConstraints);

        jButtonAddLinkedDAtoCFA.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jButtonAddLinkedDAtoCFA, gridBagConstraints);

        jButtonRemoveDAtoCFA.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jButtonRemoveDAtoCFA, gridBagConstraints);

        jLabel13.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        jPanel1.add(jLabel13, gridBagConstraints);

        jLabel14.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        jPanel1.add(jLabel14, gridBagConstraints);

        jTabbedPane.addTab("Linking DG and Assumptions to CFA", jPanel1);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel2Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel2.setLayout(jPanel2Layout);

        jScrollPane3.setViewportView(jListUnlinkedDA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane3, gridBagConstraints);

        jScrollPane4.setViewportView(jListLinkedDA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane4, gridBagConstraints);

        jLabel5.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 10.0;
        jPanel2.add(jLabel5, gridBagConstraints);

        jButtonAddLinkedDA.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 10.0;
        jPanel2.add(jButtonAddLinkedDA, gridBagConstraints);

        jLabel6.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        jPanel2.add(jLabel6, gridBagConstraints);

        jButtonRemoveLinkedDA.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 10.0;
        jPanel2.add(jButtonRemoveLinkedDA, gridBagConstraints);

        jLabel7.setText("Design Goal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel2.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jComboBoxDG2, gridBagConstraints);

        jLabel9.setText("Unlinked Design Alternative");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel2.add(jLabel9, gridBagConstraints);

        jLabel23.setText("Linked Design Alternative");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jLabel23, gridBagConstraints);

        jScrollPane14.setViewportView(jListUnlinkedSDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane14, gridBagConstraints);

        jLabel37.setText("Unlinked Sub-Design Goal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel2.add(jLabel37, gridBagConstraints);

        jScrollPane15.setViewportView(jListLinkedSDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane15, gridBagConstraints);

        jLabel39.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 10.0;
        jPanel2.add(jLabel39, gridBagConstraints);

        jButtonAddLinkedSDG.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel2.add(jButtonAddLinkedSDG, gridBagConstraints);

        jLabel40.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        jPanel2.add(jLabel40, gridBagConstraints);

        jButtonRemoveLinkedSDG.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 20.0;
        jPanel2.add(jButtonRemoveLinkedSDG, gridBagConstraints);

        jLabel10.setText("Linked Sub-Design Goal (the order is kept and meaningful)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        jPanel2.add(jLabel10, gridBagConstraints);

        jTabbedPane.addTab("Linking DG with DA and sDG", jPanel2);

        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel3Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel3.setLayout(jPanel3Layout);

        jScrollPane8.setViewportView(jListDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane8, gridBagConstraints);

        jScrollPane6.setViewportView(jListDA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane6, gridBagConstraints);

        jButtonAddDG.setText("Add DG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonAddDG, gridBagConstraints);

        jButtonAddDA.setText("Add DA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonAddDA, gridBagConstraints);

        jScrollPane9.setViewportView(jListCFA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane9, gridBagConstraints);

        jLabel25.setText("CFA list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel25, gridBagConstraints);

        jLabel26.setText("Restart this UI to create CFA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jLabel26, gridBagConstraints);

        jLabel27.setText("Design Goal List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel27, gridBagConstraints);

        jLabel29.setText("Design Alternative List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel29, gridBagConstraints);

        jScrollPane13.setViewportView(jListSDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane13, gridBagConstraints);

        jButtonAddSDG.setText("Add sDG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel3.add(jButtonAddSDG, gridBagConstraints);

        jLabel36.setText("Sub-Design Goal list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel36, gridBagConstraints);

        jButtonRemoveDG.setText("Remove DG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonRemoveDG, gridBagConstraints);

        jButtonRemoveDA.setText("Delete DA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonRemoveDA, gridBagConstraints);

        jButtonRemoveSDG.setText("Remove sDG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel3.add(jButtonRemoveSDG, gridBagConstraints);

        jTabbedPane.addTab("Edit DG, sDG, DA, CFA", jPanel3);

        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel5Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel5.setLayout(jPanel5Layout);

        jScrollPane7.setViewportView(jListAssumption);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane7, gridBagConstraints);

        jButtonAddAssumption.setText("Add Assumption");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonAddAssumption, gridBagConstraints);

        jLabel8.setText("Assumption list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel8, gridBagConstraints);

        jScrollPane11.setViewportView(jListODD);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 30.0;
        jPanel5.add(jScrollPane11, gridBagConstraints);

        jScrollPane12.setViewportView(jListFR);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 30.0;
        jPanel5.add(jScrollPane12, gridBagConstraints);

        jLabel32.setText("Operational Design Domain");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel32, gridBagConstraints);

        jLabel33.setText("Functional Requirements");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel33, gridBagConstraints);

        jButtonAddODD.setText("Add ODD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonAddODD, gridBagConstraints);

        jButtonAddFR.setText("Add FR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonAddFR, gridBagConstraints);

        jButtonRemoveAssumption.setText("Remove Assumption");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonRemoveAssumption, gridBagConstraints);

        jButtonRemoveODD.setText("Remove ODD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonRemoveODD, gridBagConstraints);

        jButtonRemoveFR.setText("Remove FR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonRemoveFR, gridBagConstraints);

        jLabel31.setText("Capella element");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel31, gridBagConstraints);

        jLabel30.setText("Restart the UI to process new element");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel5.add(jLabel30, gridBagConstraints);

        jButtonAddFailure.setText("Add Failure Mode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonAddFailure, gridBagConstraints);

        jButtonRemoveFM.setText("Remove Failure Mode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jButtonRemoveFM, gridBagConstraints);

        jLabel24.setText("Failure list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel24, gridBagConstraints);

        jScrollPane10.setViewportView(jListFailure);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 30.0;
        jPanel5.add(jScrollPane10, gridBagConstraints);

        jScrollPane5.setViewportView(jListCapella);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 30.0;
        jPanel5.add(jScrollPane5, gridBagConstraints);

        jTabbedPane.addTab("Edit Assumption, ODD, FR", jPanel5);

        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel4Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel4.setLayout(jPanel4Layout);

        jScrollPane18.setViewportView(jListUnlinkedCFA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane18, gridBagConstraints);

        jScrollPane19.setViewportView(jListLinkedCFA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane19, gridBagConstraints);

        jLabel15.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 10.0;
        jPanel4.add(jLabel15, gridBagConstraints);

        jButtonAddLinkedCFA.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 10.0;
        jPanel4.add(jButtonAddLinkedCFA, gridBagConstraints);

        jLabel16.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        jPanel4.add(jLabel16, gridBagConstraints);

        jButtonRemoveLinkedCFA.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 10.0;
        jPanel4.add(jButtonRemoveLinkedCFA, gridBagConstraints);

        jLabel17.setText("Assumption");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel4.add(jLabel17, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jComboBoxAssumption, gridBagConstraints);

        jLabel18.setText("Unlinked CFAs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel4.add(jLabel18, gridBagConstraints);

        jLabel28.setText("Linked CFAs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jLabel28, gridBagConstraints);

        jTabbedPane.addTab("Linking CFA to Assumptions", jPanel4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        getContentPane().add(jTabbedPane, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("ATRIUM process");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel22, gridBagConstraints);

        pack();
    }// </editor-fold>
	
	/**
     * @brief  Re-sort Assumption and DA between linked and unlinked to the selected CFA
     * Basically what is displayed on tab 1 + the selected DG
     */
	public void updateDisplayTab0()
	{
		nameLinkedAssumption=new DefaultListModel<String>();
		nameLinkedDAtoCFA=new DefaultListModel<String>();
		nameUnlinkedDAtoCFA=new DefaultListModel<String>();
		nameUnlinkedAssumption=new DefaultListModel<String>();
		CFA the_CFA=null;
			
		for (CFA myCFA : listCFA) //look for the CFA that we are interested in
		{
			if (myCFA.getName().equals(jComboBoxCFA.getSelectedItem())){the_CFA = myCFA;}
		}
		
		if (the_CFA!=null)
		{
			for (Assumption a : listAssumption) //go through all the Assumptions to find those linked with the_CFA
			{
				if (the_CFA.getAssumption().contains(a)){nameLinkedAssumption.addElement(a.getName());}
				else{nameUnlinkedAssumption.addElement(a.getName());}
			}
			for (DA da : listDA) //go through all the DA to find those linked with the_CFA
			{
				if (the_CFA.getDesignAlternative().contains(da)){nameLinkedDAtoCFA.addElement(da.getName());}
				else{nameUnlinkedDAtoCFA.addElement(da.getName());}
			}
			
			jListUnlinkedAssumptions.setModel(nameUnlinkedAssumption); //update display list of assumptions
			jListLinkedAssumptions.setModel(nameLinkedAssumption);
			
			jListUnlinkedDAtoCFA.setModel(nameUnlinkedDAtoCFA); //update display list of DA
			jListLinkedDAtoCFA.setModel(nameLinkedDAtoCFA);
			
			if (listDG.contains(the_CFA.getGoal())){jComboBoxDG.setSelectedItem(the_CFA.getGoal().getName());}
			else{jComboBoxDG.setSelectedItem("-- NONE --");}
		}
	}
	
	/**
     * @brief  Re-sort sDG and DA between linked and unlinked to the selected DG
     * Basically what is displayed on tab 1
     */
	public void updateDisplayTab1()
	{
		nameLinkedsDG = new DefaultListModel<String>();
		nameUnlinkedsDG = new DefaultListModel<String>();
		
		nameLinkedDA = new DefaultListModel<String>();
		nameUnlinkedDA = new DefaultListModel<String>();
		
		DG the_DG=null;
		
		for (DG myDG : listDG) //look for the DG that we are interested in
		{
			if (myDG.getName().equals(jComboBoxDG2.getSelectedItem())){the_DG = myDG;}
		}
		
		if (the_DG!=null)
		{
			for (sDG sdg : listsDG) //go through all the sDG to find those linked with the_DG
			{
				if (the_DG.getSubDGs().contains(sdg)){/*nameLinkedsDG.addElement(sdg.getName());*/}
				else{nameUnlinkedsDG.addElement(sdg.getName());}
			}
			
			for (sDG sdg : the_DG.getSubDGs())
			{
				nameLinkedsDG.addElement(sdg.getName());
			}
			
			for (DA da : listDA) //go through all the DA to find those linked with the_DG
			{
				if (the_DG.getDesignAlternative().contains(da)){nameLinkedDA.addElement(da.getName());}
				else{nameUnlinkedDA.addElement(da.getName());}
			}
		}
		
		jListUnlinkedSDG.setModel(nameUnlinkedsDG); //update display list of sDG
		jListLinkedSDG.setModel(nameLinkedsDG);
		
		jListUnlinkedDA.setModel(nameUnlinkedDA); //update display list of DA
		jListLinkedDA.setModel(nameLinkedDA);
	}
	
	/**
     * @brief  Update the list of DG, DA and sDG
     * Basically what is displayed on tab 2
     */
	public void updateDisplayTab2()
	{
		DefaultListModel <String> listModelDG = new DefaultListModel<String>();
        for (DG dg : listDG){listModelDG.addElement(dg.getName());}
        jListDG.setModel(listModelDG);
        
        DefaultListModel <String> listModelDA = new DefaultListModel<String>();
        for (DA da : listDA){listModelDA.addElement(da.getName());}
        jListDA.setModel(listModelDA);
        
        DefaultListModel <String> listModelsDG = new DefaultListModel<String>();
        for (sDG sdg : listsDG){listModelsDG.addElement(sdg.getName());}
        jListSDG.setModel(listModelsDG);
	}
	
	/**
     * @brief  Update the list of Assumptions, ODD, FR and FailureMode
     * Basically what is displayed on tab 3
     */
	public void updateDisplayTab3()
	{
		DefaultListModel <String> listModelsAssumptions = new DefaultListModel<String>();
        for (Assumption a : listAssumption){listModelsAssumptions.addElement(a.getName());}
        jListAssumption.setModel(listModelsAssumptions);
        
        DefaultListModel <String> listModelODD = new DefaultListModel<String>();
        for (ODD odd : listODD){listModelODD.addElement(odd.getName());}
        jListODD.setModel(listModelODD);
        
        DefaultListModel <String> listModelFR = new DefaultListModel<String>();
        for (FR fr : listFR){listModelFR.addElement(fr.getName());}
        jListFR.setModel(listModelFR);
        
        DefaultListModel <String> listModelFailure = new DefaultListModel<String>();
        for (FailureMode f : ListFailureMode){listModelFailure.addElement(f.getName());}
        jListFailure.setModel(listModelFailure); 
	}
	
	/**
     * @brief  Re-sort CFA between linked and unlinked to the selected assumption
     * Basically what is displayed on tab 4
     */
	public void updateDisplayTab4()
	{
		nameLinkedCFA = new DefaultListModel<String>();
		nameUnlinkedCFA = new DefaultListModel<String>();
		
		Assumption the_Assumption=null;
		
		for (Assumption a : listAssumption) //look for the Assumption that we are interested in
		{
			if (a.getName().equals(jComboBoxAssumption.getSelectedItem())){the_Assumption = a;}
		}
		
		if (the_Assumption!=null)
		{
			for (CFA cfa : listCFA) //go through all the CFA to find those linked with the_Assumption
			{
				if (the_Assumption.getLinkedWithCFAs().contains(cfa)){nameLinkedCFA.addElement(cfa.getName());}
				else{nameUnlinkedCFA.addElement(cfa.getName());}
			}		
		}
		jListUnlinkedCFA.setModel(nameUnlinkedCFA); //update display list of CFA
		jListLinkedCFA.setModel(nameLinkedCFA);
	}

	/**
     * @brief  Update the DG ComboBoxes, deleting or adding new DGs
     */
	public void updateDGComboBox()
	{
		DefaultComboBoxModel<String> listDGcbModel= new DefaultComboBoxModel<String>();
        listDGcbModel.addElement("-- NONE --");
        for (DG dg : listDG) {listDGcbModel.addElement(dg.getName());}
        jComboBoxDG.setModel(listDGcbModel);
        
		DefaultComboBoxModel<String> listDGcbModel2= new DefaultComboBoxModel<String>();
        listDGcbModel2.addElement("-- NONE --");
        for (DG dg : listDG) {listDGcbModel2.addElement(dg.getName());}
        jComboBoxDG2.setModel(listDGcbModel2);
	}
	
	/**
     * @brief  Update the ComboBox, deleting or adding new Assumptions
     */
	public void updateComboBoxAssumption()
	{
		DefaultComboBoxModel<String> listComboBoxModelAssumption= new DefaultComboBoxModel<String>();
        for (Assumption a : listAssumption) {listComboBoxModelAssumption.addElement(a.getName());}
        jComboBoxAssumption.setModel(listComboBoxModelAssumption);
	}
	
	/**
     * @brief  Link or unlink an object to another
     * @param  type An number describing which linking or unlinking is performed
     */
	@SuppressWarnings("rawtypes")
	private void moveObject(int type)
	{
		AtriumBasicElement rootObject = null;
		AtriumBasicElement the_moving_Object = null;
		JList<String> fromTo = null;
		JComboBox<String> RootCombo = null;
		EList listOfMovingObject = null;
		EList listOfRootObject = null;
		
		switch (type)
		{
			case 1: //add link assumption --> cfa
				fromTo=jListUnlinkedAssumptions;
				RootCombo=jComboBoxCFA;
				listOfMovingObject=listAssumption;
				listOfRootObject=listCFA;
				break;
			
			case 2: //remove link assumption --> cfa
				fromTo=jListLinkedAssumptions;
				RootCombo=jComboBoxCFA;
				listOfMovingObject=listAssumption;
				listOfRootObject=listCFA;
				break;
				
			case 3: //add link sDG --> DG
				fromTo=jListUnlinkedSDG;
				RootCombo=jComboBoxDG2;
				listOfMovingObject=listsDG;
				listOfRootObject=listDG;
				break;
				
			case 4: //remove link sDG --> DG
				fromTo=jListLinkedSDG;
				RootCombo=jComboBoxDG2;
				listOfMovingObject=listsDG;
				listOfRootObject=listDG;
				break;
				
			case 5: //add link DA --> DG
				fromTo=jListUnlinkedDA;
				RootCombo=jComboBoxDG2;
				listOfMovingObject=listDA;
				listOfRootObject=listDG;
				break;
				
			case 6: //remove link DA --> DG
				fromTo=jListLinkedDA;
				RootCombo=jComboBoxDG2;
				listOfMovingObject=listDA;
				listOfRootObject=listDG;
				break;	
				
			case 7: //add link DA->CFA
				fromTo=jListUnlinkedDAtoCFA;
				RootCombo=jComboBoxCFA;
				listOfMovingObject=listDA;
				listOfRootObject=listCFA;
				break;
				
			case 8: //remove link DA->CFA
				fromTo=jListLinkedDAtoCFA;
				RootCombo=jComboBoxCFA;
				listOfMovingObject=listDA;
				listOfRootObject=listCFA;
				break;
				
			case 9: //add link CFA->Assumption
				fromTo=jListUnlinkedCFA;
				RootCombo=jComboBoxAssumption;
				listOfMovingObject=listCFA;
				listOfRootObject=listAssumption;
				break;
				
			case 10: //remove link CFA->Assumption
				fromTo=jListLinkedCFA;
				RootCombo=jComboBoxAssumption;
				listOfMovingObject=listCFA;
				listOfRootObject=listAssumption;
				break;
		
		}
		
		
		List <String> movingStrings = fromTo.getSelectedValuesList();
		
		for (String nameObject : movingStrings)
		{
			for (Object o : listOfMovingObject) //Go through all the DA to find the one with the same name
			{
				AtriumBasicElement abe = (AtriumBasicElement) o;
				if (abe.getName().equals(nameObject)){the_moving_Object=abe;}
			}
			
			for (Object o : listOfRootObject) //look for the DG that we are interested in
			{
				AtriumBasicElement abe = (AtriumBasicElement) o;
				if (abe.getName().equals(RootCombo.getSelectedItem())){rootObject=abe;}
			}
			
			final int type_p = type;
			final AtriumBasicElement rootObject_p = rootObject;
			final AtriumBasicElement the_moving_Object_p = the_moving_Object;
			
			domain.getCommandStack().execute(new RecordingCommand(domain) {
		        @Override
		        protected void doExecute() {
		        	switch (type_p)
		        	{
		        		case 1: //add link assumption --> cfa
		        			((CFA) rootObject_p).getAssumption().add((Assumption)the_moving_Object_p);
		        			((Assumption) the_moving_Object_p).getLinkedWithCFAs().add((CFA) rootObject_p);//Bidirectional association
		        			break;
		        		case 2: //remove link assumption --> cfa
		        			((CFA) rootObject_p).getAssumption().remove((Assumption)the_moving_Object_p);
		        			((Assumption) the_moving_Object_p).getLinkedWithCFAs().remove((CFA) rootObject_p);//Bidirectional association
		        			break;
		        		case 3: //add link sDG --> DG
		        			((DG) rootObject_p).getSubDGs().add((sDG)the_moving_Object_p);
		        			break;
		        		case 4: //remove link sDG --> DG
		        			((DG) rootObject_p).getSubDGs().remove((sDG)the_moving_Object_p);
		        			break;
		        		case 5: //add link DA --> DG
		        			((DG) rootObject_p).getDesignAlternative().add((DA)the_moving_Object_p);
		        			break;
		        		case 6: //remove link DA --> DG
		        			((DG) rootObject_p).getDesignAlternative().remove((DA)the_moving_Object_p);
		        			break;
		        		case 7: //add link DA --> CFA
		        			((CFA) rootObject_p).getDesignAlternative().add((DA)the_moving_Object_p);
		        			break;
		        		case 8: //remove link DA --> CFA
		        			((CFA) rootObject_p).getDesignAlternative().remove((DA)the_moving_Object_p);
		        			break;
		        		case 9: //add link CFA->Assumption
		        			((Assumption) rootObject_p).getLinkedWithCFAs().add((CFA)the_moving_Object_p);
		        			((CFA) the_moving_Object_p).getAssumption().add((Assumption) rootObject_p);//Bidirectional association
		        			break;
		        		case 10: //remove link CFA->Assumption
		        			((Assumption) rootObject_p).getLinkedWithCFAs().remove((CFA)the_moving_Object_p);
		        			((CFA) the_moving_Object_p).getAssumption().remove((Assumption) rootObject_p);//Bidirectional association
		        			break;
		        	}
		        }
		    });
		}
	
		updateDisplayTab1();//because the lists have changed
		updateDisplayTab0();
		updateDisplayTab4();
	}
	
	/**
     * @brief  Link the previously selected CFA with the DG selected
     */
	private void linkCFAwithDG()
	{
		CFA the_CFA = null;
		DG the_DG = null;
		
		for (CFA myCFA : listCFA) //look for the CFA that we are interested in
		{
			if (myCFA.getName().equals(jComboBoxCFA.getSelectedItem())){the_CFA=myCFA;}
		}
		
		for (DG myDG : listDG) //look for the DG that we are interested in
		{
			if (myDG.getName().equals(jComboBoxDG.getSelectedItem())){the_DG=myDG;}
		}
		
		final CFA CFA_parameter = the_CFA;
		final DG DG_parameter = the_DG;
		
		if (jComboBoxDG.getSelectedItem()!="--NONE--")
		{
			
			domain.getCommandStack().execute(new RecordingCommand(domain) {
		        @Override
		        protected void doExecute() {
		        	CFA_parameter.setGoal(DG_parameter);//the set action is done there, within a transaction context
		        }
		    });
		}
		else
		{
			domain.getCommandStack().execute(new RecordingCommand(domain) {
		        @Override
		        protected void doExecute() {
		        	CFA_parameter.setGoal(null);//the set action is done there, within a transaction context
		        }
		    });
		}
	}
	
	/**
     * @brief  Open the editing window when the user double click on a Assumption in the Linked Assumption list
     * This should be merge with the other MouseClicked events 
     * @param  evt The ActionEvent that has been triggered (not used)
     */
	private void jListLinkedAssumptionsMouseClicked(java.awt.event.MouseEvent evt) {
		Assumption edited_assumption = null;
        if (evt.getClickCount() == 2) {
        	String selectedAssumptionName = jListLinkedAssumptions.getSelectedValue();
        	for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
    		{
    			if (a.getName().equals(selectedAssumptionName)){edited_assumption=a;}
    		}
            myAssumptionEditor.editAssumption(edited_assumption, listAssumption);
            disableAllComponent();
        } 
    }
	
	/**
     * @brief  Open the editing window when the user double click on a Assumption in the Unlinked Assumption list
     * This should be merge with the other MouseClicked events
     * @param  evt The ActionEvent that has been triggered (not used)
     */
	private void jListUnlinkedAssumptionMouseClicked(java.awt.event.MouseEvent evt) {
		Assumption edited_assumption = null;
        if (evt.getClickCount() == 2) {
        	String selectedAssumptionName = jListUnlinkedAssumptions.getSelectedValue();
        	for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
    		{
    			if (a.getName().equals(selectedAssumptionName)){edited_assumption=a;}
    		}
            myAssumptionEditor.editAssumption(edited_assumption, listAssumption);
            disableAllComponent();
        } 
    }
	
	/**
     * @brief  Open the editing window when the user double click on a Assumption in the Assumption list
     * This should be merge with the other MouseClicked events
     * @param  evt The ActionEvent that has been triggered (not used)
     */
	private void jListAssumptionMouseClicked(java.awt.event.MouseEvent evt) {                                             
		Assumption edited_assumption = null;
        if (evt.getClickCount() == 2) {
        	String selectedAssumptionName = jListAssumption.getSelectedValue();
        	for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
    		{
    			if (a.getName().equals(selectedAssumptionName)){edited_assumption=a;}
    		}
            myAssumptionEditor.editAssumption(edited_assumption, listAssumption);
            disableAllComponent();
        } 
    }  
	
	/**
     * @brief  Open the editing window when the user double click on a AtriumBasicElement 
     * @param  evt The ActionEvent that has been triggered (not used)
     * @param jlist The jlist which has been clicked
     * @param list The list of the corresponding object type
     */
	@SuppressWarnings("rawtypes")
	private void jListMouseClicked(java.awt.event.MouseEvent evt, javax.swing.JList<String> jlist, EList list) {
		AtriumBasicElement edited_object = null;
    	if (evt.getClickCount() == 2) 
    	{
    		String selectedElementName = jlist.getSelectedValue();
    		
    		for (Object o : list)
    		{
    			AtriumBasicElement abe = (AtriumBasicElement) o;
    			if (abe.getName().equals(selectedElementName)){edited_object=abe;}
    		}
    		
    		 myEditor.editing(edited_object, listDG, listDA, listCFA, listsDG, ListFailureMode, listODD, listFR);
    		 disableAllComponent();
    	}
	}                                                                                       

	/**
     * @brief  Link CFA with DG if a CFA is selected while choosing a DG 
     * @param  evt The ActionEvent that has been triggered (not used)
     */
    private void jComboBoxDGActionPerformed(java.awt.event.ActionEvent evt) {
    	if (jComboBoxCFA.getSelectedItem()!=null)
    	{
    		linkCFAwithDG();
    	} 
    }
    
    /**
     * @brief Delete the selected AtriumBasicElement in a given list after the user clicked a button
     * @param  evt The ActionEvent that has been triggered (not used)
     * @param type A number corresponding to which element should be deleted (or on which button the user has clicked)
     */
    @SuppressWarnings({ "rawtypes" })
	private void jButtonRemoveObject(java.awt.event.ActionEvent evt, int type)
    {
    	javax.swing.JList<String> jlist = null;
    	EList listObject = null;
    	EObject Extensible_list = null;
    	
    	switch (type)
    	{
    		case 1:
    			jlist = jListFailure;
    			listObject = ListFailureMode;
    			Extensible_list = the_Failure_list;
    			break;
    		case 2:
    			jlist = jListDG;
    			listObject = listDG;
    			Extensible_list = the_DG_list;
    			break;
    		case 3:
    			jlist = jListDA;
    			listObject = listDA;
    			Extensible_list = the_DA_list;
    			break;
    		case 4:
    			jlist = jListSDG;
    			listObject = listsDG;
    			Extensible_list = the_sDG_list;
    			break;
    		case 5:
    			jlist = jListODD;
    			listObject = listODD;
    			Extensible_list = the_ODD_list;
    			break;
    		case 6:
    			jlist = jListFR;
    			listObject = listFR;
    			Extensible_list = the_FR_list;
    			break;
    		case 7:
    			jlist = jListAssumption;
    			listObject = listAssumption ;
    			Extensible_list = the_Assumption_list;
    			break;
    	}
    	
    	AtriumBasicElement elToDelete = null;
    	String strToDelete = jlist.getSelectedValue();
    	for (Object obj : listObject)
    	{
    		AtriumBasicElement abe = (AtriumBasicElement) obj;
    		if (abe.getName()==strToDelete) {elToDelete=abe;}
    	}
  
    	if (type==7) {deleteLinkedODDorFR(((Assumption)elToDelete));}
    	if ((type==5)||(type==6)) {deleteLinkedAssumption(elToDelete);}
  
    	final AtriumBasicElement elToDelete_param = elToDelete;
    	final EObject Extensible_list_param = Extensible_list; 
    	
    	domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	        	((ExtensibleElement) Extensible_list_param).getOwnedExtensions().remove(elToDelete_param);//the remove action is done there, within a transaction context
	        }
	    });
        	
    	listObject.remove(elToDelete);
    	updateDisplayTab0();
    	updateDisplayTab1();
    	updateDisplayTab2();
    	updateDisplayTab3();
    	updateDisplayTab4();	
    	updateDGComboBox();
    }
    
    /**
     * @brief Delete an ODD or an FR whose linked Assumption has been deleted
     * @param  assumption The assumption that has been deleted
     */
    private void deleteLinkedODDorFR(Assumption assumption)
    {
    	if (assumption.getCreatedFrom() instanceof ODD)
    	{
    		final AtriumBasicElement elToDelete_param = assumption.getCreatedFrom();
    		domain.getCommandStack().execute(new RecordingCommand(domain) {
    	        @Override
    	        protected void doExecute() {
    	        	((ExtensibleElement) the_ODD_list).getOwnedExtensions().remove(elToDelete_param);//the remove action is done there, within a transaction context
    	        }
    	    });
    		
    		listODD.remove(elToDelete_param);
    	}
    	else if (assumption.getCreatedFrom() instanceof FR)
    	{
    		final AtriumBasicElement elToDelete_param = assumption.getCreatedFrom();
    		domain.getCommandStack().execute(new RecordingCommand(domain) {
    	        @Override
    	        protected void doExecute() {
    	        	((ExtensibleElement) the_FR_list).getOwnedExtensions().remove(elToDelete_param);//the remove action is done there, within a transaction context
    	        }
    	    });
    		
    		listFR.remove(elToDelete_param);
    	}
    }
    
    /**
     * @brief Delete an assumption whose linked ODD or FR has been deleted
     * @param  ODDorFR The ODD or FR which has been deleted
     */
    private void deleteLinkedAssumption(AtriumBasicElement ODDorFR)
    {
    	Assumption linkedAssumption = null;
    	if (ODDorFR instanceof ODD){linkedAssumption=((ODD) ODDorFR).getLinkedAssumption();}
    	else {linkedAssumption=((FR) ODDorFR).getLinkedAssumption();}
    	
    	final Assumption assumption_param=linkedAssumption;
    	
    	domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	        	((ExtensibleElement) the_Assumption_list).getOwnedExtensions().remove(assumption_param);//the remove action is done there, within a transaction context
	        }
	    });
    	
    	listAssumption.remove(assumption_param);
    }
	
    /**
     * @brief Create a new empty AtriumBAsicElement, then open the corresponding editing window
     * @param  name The Default name given to that object
     * @param type A number corresponding to which element should be created
     */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void createAtriumElement(String name, int type)
	{
		EObject Extensible_list = null;
		AtriumBasicElement newObject = null;
		EList ObjectList = null;
		
		switch (type)
		{
			case 1:
				ObjectList = ListFailureMode;
				Extensible_list = the_Failure_list;
				newObject = AtriumFactoryImpl.eINSTANCE.createFailureMode();
				break;
			
			case 2:
				ObjectList = listDG;
				Extensible_list = the_DG_list;
				newObject = AtriumFactoryImpl.eINSTANCE.createDG();
				break;
				
			case 3:
				ObjectList = listDA;
				Extensible_list = the_DA_list;
				newObject = AtriumFactoryImpl.eINSTANCE.createDA();
				break;
				
			case 4:
				ObjectList = listsDG;
				Extensible_list = the_sDG_list;
				newObject = AtriumFactoryImpl.eINSTANCE.createsDG();
				break;
				
			case 5:
				ObjectList = listODD;
				Extensible_list = the_ODD_list;
				newObject = AtriumFactoryImpl.eINSTANCE.createODD();
				break;
				
			case 6:
				ObjectList = listFR;
				Extensible_list = the_FR_list;
				newObject = AtriumFactoryImpl.eINSTANCE.createFR();
				break;
				
			case 7:
				ObjectList = listAssumption;
				Extensible_list = the_Assumption_list;
				newObject = AtriumFactoryImpl.eINSTANCE.createAssumption();
				break;
		}

		final EObject Extensible_list2 = Extensible_list;
		final AtriumBasicElement newObject2 = newObject;
		
		newObject.setName(name);
		
		domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	        	((ExtensibleElement) Extensible_list2).getOwnedExtensions().add((ElementExtension) newObject2);//the add action is done there, within a transaction context
	        }
	    });
		
		ObjectList.add(newObject);//updating our local list
		AtriumBasicElement newObject_parameter = (AtriumBasicElement) newObject;
		
		if (type==7) {myAssumptionEditor.editAssumption((Assumption) newObject, listAssumption);}
		else
		{
			myEditor.editing(newObject_parameter, listDG, listDA, listCFA, listsDG, ListFailureMode, listODD, listFR);
		}
		disableAllComponent();
	}
	
	/**
     * @brief Automatically create an Assumption linked to a new ODD or FR
     * @param  ODDorFR The new ODD or the new FR that will create the new assumption
     * @return The new assumption created
     */
	public Assumption createAssumptionFromODDorFR(AtriumBasicElement ODDorFR)
	{	
		EList<Assumption> ObjectList = listAssumption;
		final Assumption_list Extensible_list = the_Assumption_list;
		final Assumption newObject = AtriumFactoryImpl.eINSTANCE.createAssumption();
		
		newObject.setName("New Assumption");
		newObject.setCreatedFrom(ODDorFR);
		
		domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	        	((ExtensibleElement) Extensible_list).getOwnedExtensions().add((ElementExtension) newObject);//the add action is done there, within a transaction context
	        }
	    });
		
		ObjectList.add(newObject);//updating our local list
		myAssumptionEditor.editAssumption((Assumption) newObject, listAssumption);
		disableAllComponent();
		return newObject;
	}
	
	/**
     * @brief Return all components contained a given container
     * @param  c A container
     * @return A list of components contained inside the given container
     */
	private List<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<Component>();
        for (Component comp : comps) {
            compList.add(comp);
            if (comp instanceof Container)
                compList.addAll(getAllComponents((Container) comp));
        }
        return compList;
}
	/**
     * @brief Disable all components in the main Atrium process jTabbedPane
     */
	private void disableAllComponent()
	{
		List<Component> comps = getAllComponents(jTabbedPane);
		for (Component comp : comps) {
		       comp.setEnabled(false);
		}
	}
	
	/**
     * @brief Enable all components in the main Atrium process jTabbedPane
     */
	public void enableAllComponent()
	{
		List<Component> comps = getAllComponents(jTabbedPane);
		for (Component comp : comps) {
		       comp.setEnabled(true);
		}
	}

	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	//variables auto-generated by netbeans
	private javax.swing.JButton jButtonAddAssumption;
    private javax.swing.JButton jButtonAddDA;
    private javax.swing.JButton jButtonAddDG;
    private javax.swing.JButton jButtonAddFR;
    private javax.swing.JButton jButtonAddFailure;
    private javax.swing.JButton jButtonAddLinked;
    private javax.swing.JButton jButtonAddLinkedCFA;
    private javax.swing.JButton jButtonAddLinkedDA;
    private javax.swing.JButton jButtonAddLinkedDAtoCFA;
    private javax.swing.JButton jButtonAddLinkedSDG;
    private javax.swing.JButton jButtonAddODD;
    private javax.swing.JButton jButtonAddSDG;
    private javax.swing.JButton jButtonRemoveAssumption;
    private javax.swing.JButton jButtonRemoveDA;
    private javax.swing.JButton jButtonRemoveDAtoCFA;
    private javax.swing.JButton jButtonRemoveDG;
    private javax.swing.JButton jButtonRemoveFM;
    private javax.swing.JButton jButtonRemoveFR;
    private javax.swing.JButton jButtonRemoveLinked;
    private javax.swing.JButton jButtonRemoveLinkedCFA;
    private javax.swing.JButton jButtonRemoveLinkedDA;
    private javax.swing.JButton jButtonRemoveLinkedSDG;
    private javax.swing.JButton jButtonRemoveODD;
    private javax.swing.JButton jButtonRemoveSDG;
    private javax.swing.JComboBox<String> jComboBoxCFA;
    private javax.swing.JComboBox<String> jComboBoxDG;
    private javax.swing.JComboBox<String> jComboBoxDG2;
    private javax.swing.JComboBox<String> jComboBoxAssumption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListUnlinkedDAtoCFA;
    private javax.swing.JList<String> jListAssumption;
    private javax.swing.JList<String> jListCFA;
    private javax.swing.JList<String> jListCapella;
    private javax.swing.JList<String> jListDA;
    private javax.swing.JList<String> jListLinkedDAtoCFA;
    private javax.swing.JList<String> jListDG;
    private javax.swing.JList<String> jListFR;
    private javax.swing.JList<String> jListFailure;
    private javax.swing.JList<String> jListLinkedAssumptions;
    private javax.swing.JList<String> jListLinkedCFA;
    private javax.swing.JList<String> jListLinkedDA;
    private javax.swing.JList<String> jListLinkedSDG;
    private javax.swing.JList<String> jListODD;
    private javax.swing.JList<String> jListSDG;
    private javax.swing.JList<String> jListUnlinkedAssumptions;
    private javax.swing.JList<String> jListUnlinkedCFA;
    private javax.swing.JList<String> jListUnlinkedDA;
    private javax.swing.JList<String> jListUnlinkedSDG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane;
}
