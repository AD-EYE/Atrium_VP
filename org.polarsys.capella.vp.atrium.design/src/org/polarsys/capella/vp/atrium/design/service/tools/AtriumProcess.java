package org.polarsys.capella.vp.atrium.design.service.tools;


import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.la.LogicalFunction;
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
	DefaultListModel<String> nameUnlinkedAssumption = new DefaultListModel<String>();
	DefaultListModel<String> nameLinkedsDG = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedsDG = new DefaultListModel<String>();
	DefaultListModel<String> nameLinkedDA = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedDA = new DefaultListModel<String>();
	
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
	
	
	public AtriumProcess(EObject element) {
		EObject root = element;
		while (!(root instanceof LogicalArchitecture))
		{
			root = root.eContainer();
			//TODO add protection there
		}
		
		domain = TransactionUtil.getEditingDomain(root);
		
		myAssumptionEditor = new EditingFrameAssumption(this);
		myEditor = new EditingPanel(this);
		
		sortAtriumElementOnce(root);
		updateCFA();
		initComponents();
		ObjectAdded();
		updateDisplayTab0();
		updateDisplayTab1();
		updateDisplayTab2();
		updateDisplayTab3();
		
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | Frame.MAXIMIZED_BOTH);
		
		this.setVisible(true);
	}

	private void sortAtriumElementOnce(EObject root)
	{
		LogicalArchitecture logArch = (LogicalArchitecture) root;
		TreeIterator<EObject> treeArch = logArch.eAllContents();
		
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
		  
		  //if you want that UI to process other capella element, add your code here !
		  
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
		
		Collections.sort(ListCapellaElementName);
		
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
	
	private void updateCFA()
	{
		//first rename CFA whose failure might have been renamed
		for (CFA cfa : listCFA)
		{
			NamedElement capella_object = (NamedElement) cfa.getLinkedtoElement();
			String name = capella_object.getName();
			String failure = cfa.getLinkedtoFailure().getName();
			if (!(cfa.getName().equals("{ " + name + " : " + failure + " }")))
			{
				cfa.setName("{ " + name + " : " + failure + " }");
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
				
				for (CFA cfa : listCFA){if (cfa.getName().equals("{ " + el.getName() + " : " + f.getName() + " }")) {found = true;}}
				
				if (!(found))
				{
					final CFA newCFA = AtriumFactoryImpl.eINSTANCE.createCFA();
					newCFA.setContent("Some content");
					newCFA.setState(state_Type.UNPROCESSED);
					newCFA.setName("{ " + el.getName() + " : " + f.getName() + " }");
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
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() { 
		//Copy and paste the netbean generated code here. Just make sure to keep the Action listener coded here right under the variables declaration. Also, three lists have been overridden
		
		java.awt.GridBagConstraints gridBagConstraints;
		
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
        jButtonAddAssumption = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jScrollPane12 = new javax.swing.JScrollPane();
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
        
        //all listeners have been put below
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
                jComboBoxCFAActionPerformed(evt);
            }
        });
        jComboBoxDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDGActionPerformed(evt);
            }
        });
        jComboBoxDG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDG2ActionPerformed(evt);
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
        
        //all modified initializations are there
		
        DefaultComboBoxModel <String> CbCFA= new DefaultComboBoxModel<String>();
		for (int i = 0; i < listCFA.size(); i++) {
			CbCFA.addElement(listCFA.get(i).getName());
		}
		jComboBoxCFA.setModel(CbCFA);
		jComboBoxCFA.setMaximumRowCount(20);
		jComboBoxDG.setMaximumRowCount(20);
		DefaultListModel <String> listModel = new DefaultListModel<String>();
	        for (int i = 0; i < ListCapellaElementName.size(); i++)
	        {
	            listModel.addElement(ListCapellaElementName.get(i));
	        }
	        jListCapella.setModel(listModel);
		
	        
	     //Paste the netBean generated code here (initComponent). Remove all the <>. Cut and paste the variable declaration as well

	        setPreferredSize(new java.awt.Dimension(1600, 1000));
	        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
	        layout.columnWidths = new int[] {0, 20, 0, 20, 0};
	        layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
	        getContentPane().setLayout(layout);

	        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 1000));
	        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
	        jPanel1Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0};
	        jPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
	        jPanel1.setLayout(jPanel1Layout);

	        jScrollPane1.setViewportView(jListUnlinkedAssumptions);

	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 2;
	        gridBagConstraints.gridy = 10;
	        gridBagConstraints.gridheight = 9;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
	        gridBagConstraints.weightx = 40.0;
	        gridBagConstraints.weighty = 0.2;
	        jPanel1.add(jScrollPane1, gridBagConstraints);

	        jScrollPane2.setViewportView(jListLinkedAssumptions);

	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 6;
	        gridBagConstraints.gridy = 10;
	        gridBagConstraints.gridheight = 9;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
	        gridBagConstraints.weightx = 40.0;
	        gridBagConstraints.weighty = 0.2;
	        jPanel1.add(jScrollPane2, gridBagConstraints);

	        jLabel1.setText("Add to linked");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 10;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
	        gridBagConstraints.weightx = 5.0;
	        gridBagConstraints.weighty = 5.0;
	        jPanel1.add(jLabel1, gridBagConstraints);

	        jButtonAddLinked.setText("=>");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 12;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
	        gridBagConstraints.weightx = 5.0;
	        gridBagConstraints.weighty = 5.0;
	        jPanel1.add(jButtonAddLinked, gridBagConstraints);

	        jLabel2.setText("Remove from linked");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 14;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
	        gridBagConstraints.weightx = 5.0;
	        gridBagConstraints.weighty = 5.0;
	        jPanel1.add(jLabel2, gridBagConstraints);

	        jButtonRemoveLinked.setText("<=");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 16;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
	        gridBagConstraints.weightx = 5.0;
	        gridBagConstraints.weighty = 5.0;
	        jPanel1.add(jButtonRemoveLinked, gridBagConstraints);

	        jLabel3.setText("Unlinked Assumptions");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 2;
	        gridBagConstraints.gridy = 8;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
	        gridBagConstraints.weightx = 40.0;
	        jPanel1.add(jLabel3, gridBagConstraints);

	        jLabel4.setText("Linked Assumptions");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 6;
	        gridBagConstraints.gridy = 8;
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

	        jTabbedPane.addTab("Linking DG and Assumptions to CFA", jPanel1);

	        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
	        jPanel2Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0};
	        jPanel2Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
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
	        gridBagConstraints.gridy = 20;
	        gridBagConstraints.gridheight = 9;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
	        gridBagConstraints.weightx = 40.0;
	        gridBagConstraints.weighty = 1.0;
	        jPanel2.add(jScrollPane14, gridBagConstraints);

	        jLabel37.setText("Unlinked Sub-Design Goal");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 2;
	        gridBagConstraints.gridy = 18;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
	        jPanel2.add(jLabel37, gridBagConstraints);

	        jScrollPane15.setViewportView(jListLinkedSDG);

	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 6;
	        gridBagConstraints.gridy = 20;
	        gridBagConstraints.gridheight = 9;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
	        gridBagConstraints.weightx = 40.0;
	        gridBagConstraints.weighty = 1.0;
	        jPanel2.add(jScrollPane15, gridBagConstraints);

	        jLabel39.setText("Add to linked");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 22;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
	        gridBagConstraints.weighty = 10.0;
	        jPanel2.add(jLabel39, gridBagConstraints);

	        jButtonAddLinkedSDG.setText("=>");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 24;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
	        jPanel2.add(jButtonAddLinkedSDG, gridBagConstraints);

	        jLabel40.setText("Remove from linked");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 26;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
	        jPanel2.add(jLabel40, gridBagConstraints);

	        jButtonRemoveLinkedSDG.setText("<=");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 4;
	        gridBagConstraints.gridy = 28;
	        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.weightx = 10.0;
	        gridBagConstraints.weighty = 20.0;
	        jPanel2.add(jButtonRemoveLinkedSDG, gridBagConstraints);

	        jTabbedPane.addTab("Linking DG and DA", jPanel2);

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
	
	public void updateDisplayTab0()
	{
		nameLinkedAssumption=new DefaultListModel<String>();
		nameUnlinkedAssumption=new DefaultListModel<String>();
		CFA the_CFA=null;
		
		DefaultComboBoxModel<String> listDGcbModel= new DefaultComboBoxModel<String>();
        listDGcbModel.addElement("-- NONE --");
        for (DG dg : listDG) {listDGcbModel.addElement(dg.getName());}
        jComboBoxDG.setModel(listDGcbModel);
			
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
			
			jListUnlinkedAssumptions.setModel(nameUnlinkedAssumption); //update display list of assumptions
			jListLinkedAssumptions.setModel(nameLinkedAssumption);
			
			if (listDG.contains(the_CFA.getGoal())){jComboBoxDG.setSelectedItem(the_CFA.getGoal().getName());}
			else{jComboBoxDG.setSelectedItem("-- NONE --");}
		}
	}
	
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
				if (the_DG.getSubDGs().contains(sdg)){nameLinkedsDG.addElement(sdg.getName());}
				else{nameUnlinkedsDG.addElement(sdg.getName());}
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
	
	public void updateDisplayTab2()
	{
		DefaultListModel <String> listModelDG = new DefaultListModel<String>();
        for (DG dg : listDG){listModelDG.addElement(dg.getName());}
        jListDG.setModel(listModelDG);
        
        DefaultListModel <String> listModelDA = new DefaultListModel<String>();
        for (DA da : listDA){listModelDA.addElement(da.getName());}
        jListDA.setModel(listModelDA);
        
        DefaultListModel <String> listModelCFA = new DefaultListModel<String>();
        for (CFA cfa : listCFA){listModelCFA.addElement(cfa.getName());}
        jListCFA.setModel(listModelCFA);
        
        DefaultListModel <String> listModelsDG = new DefaultListModel<String>();
        for (sDG sdg : listsDG){listModelsDG.addElement(sdg.getName());}
        jListSDG.setModel(listModelsDG);
	}
	
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

	
	public void ObjectAdded()
	{
		DefaultComboBoxModel<String> listDGcbModel= new DefaultComboBoxModel<String>();
        listDGcbModel.addElement("-- NONE --");
        for (DG dg : listDG) {listDGcbModel.addElement(dg.getName());}
        jComboBoxDG2.setModel(listDGcbModel);
	}
	
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
		        			break;
		        			
		        		case 2: //remove link assumption --> cfa
		        			((CFA) rootObject_p).getAssumption().remove((Assumption)the_moving_Object_p);
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
		        	}
		        }
		    });
		}
	
		updateDisplayTab1();//because the lists have changed
		updateDisplayTab0();
	}
	
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
	
	private void jComboBoxCFAActionPerformed(java.awt.event.ActionEvent evt) {
		updateDisplayTab0();
	}
	
	private void jComboBoxDG2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
		updateDisplayTab1();
    }	
	
	
	private void jListLinkedAssumptionsMouseClicked(java.awt.event.MouseEvent evt) {
		Assumption edited_assumption = null;
        if (evt.getClickCount() == 2) {
        	String selectedAssumptionName = jListLinkedAssumptions.getSelectedValue();
        	for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
    		{
    			if (a.getName().equals(selectedAssumptionName)){edited_assumption=a;}
    		}
            myAssumptionEditor.editAssumption(edited_assumption, listAssumption);
        } 
    }
	
	private void jListUnlinkedAssumptionMouseClicked(java.awt.event.MouseEvent evt) {
		Assumption edited_assumption = null;
        if (evt.getClickCount() == 2) {
        	String selectedAssumptionName = jListUnlinkedAssumptions.getSelectedValue();
        	for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
    		{
    			if (a.getName().equals(selectedAssumptionName)){edited_assumption=a;}
    		}
            myAssumptionEditor.editAssumption(edited_assumption, listAssumption);
        } 
    }
	
	private void jListAssumptionMouseClicked(java.awt.event.MouseEvent evt) {                                             
		Assumption edited_assumption = null;
        if (evt.getClickCount() == 2) {
        	String selectedAssumptionName = jListAssumption.getSelectedValue();
        	for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
    		{
    			if (a.getName().equals(selectedAssumptionName)){edited_assumption=a;}
    		}
            myAssumptionEditor.editAssumption(edited_assumption, listAssumption);
        } 
    }  
	
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
    	}
	}                                                                                       

    private void jComboBoxDGActionPerformed(java.awt.event.ActionEvent evt) {
    	if (jComboBoxCFA.getSelectedItem()!=null)
    	{
    		linkCFAwithDG();
    	} 
    }
    
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
  
    	
    	final AtriumBasicElement elToDelete_param = elToDelete;
    	final EObject Extensible_list_param = Extensible_list; 
    	
    	domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	        	((ExtensibleElement) Extensible_list_param).getOwnedExtensions().remove(elToDelete_param);//the remove action is done there, within a transaction context
	        }
	    });
        	
    	listObject.remove(elToDelete);
    	updateDisplayTab2();
    	updateDisplayTab3();
    	
    }
	
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
		else{myEditor.editing(newObject_parameter, listDG, listDA, listCFA, listsDG, ListFailureMode, listODD, listFR);}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void createAssumptionFromODDorFR(AtriumBasicElement ODDorFR)
	{	
		EList ObjectList = listAssumption;
		EObject Extensible_list = the_Assumption_list;
		AtriumBasicElement newObject = AtriumFactoryImpl.eINSTANCE.createAssumption();
		
		final EObject Extensible_list2 = Extensible_list;
		final AtriumBasicElement newObject2 = newObject;
		
		newObject.setName("New Assumption");
		
		domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	        	((ExtensibleElement) Extensible_list2).getOwnedExtensions().add((ElementExtension) newObject2);//the add action is done there, within a transaction context
	        }
	    });
		
		ObjectList.add(newObject);//updating our local list
		myAssumptionEditor.editAssumption((Assumption) newObject, listAssumption);
	}

	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	//variables auto-generated by netbeans
    private javax.swing.JButton jButtonRemoveDA;
    private javax.swing.JButton jButtonRemoveAssumption;
    private javax.swing.JButton jButtonRemoveDG;
    private javax.swing.JButton jButtonRemoveFM;
    private javax.swing.JButton jButtonRemoveFR;
    private javax.swing.JButton jButtonRemoveODD;
    private javax.swing.JButton jButtonRemoveSDG;
	private javax.swing.JButton jButtonAddAssumption;
    private javax.swing.JButton jButtonAddDA;
    private javax.swing.JButton jButtonAddDG;
    private javax.swing.JButton jButtonAddFR;
    private javax.swing.JButton jButtonAddFailure;
    private javax.swing.JButton jButtonAddLinked;
    private javax.swing.JButton jButtonAddLinkedDA;
    private javax.swing.JButton jButtonAddLinkedSDG;
    private javax.swing.JButton jButtonAddODD;
    private javax.swing.JButton jButtonAddSDG;
    private javax.swing.JButton jButtonRemoveLinked;
    private javax.swing.JButton jButtonRemoveLinkedDA;
    private javax.swing.JButton jButtonRemoveLinkedSDG;
    private javax.swing.JComboBox<String> jComboBoxCFA;
    private javax.swing.JComboBox<String> jComboBoxDG;
    private javax.swing.JComboBox<String> jComboBoxDG2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JList<String> jListAssumption;
    private javax.swing.JList<String> jListCFA;
    private javax.swing.JList<String> jListCapella;
    private javax.swing.JList<String> jListDA;
    private javax.swing.JList<String> jListDG;
    private javax.swing.JList<String> jListFR;
    private javax.swing.JList<String> jListFailure;
    private javax.swing.JList<String> jListLinkedAssumptions;
    private javax.swing.JList<String> jListLinkedDA;
    private javax.swing.JList<String> jListLinkedSDG;
    private javax.swing.JList<String> jListODD;
    private javax.swing.JList<String> jListSDG;
    private javax.swing.JList<String> jListUnlinkedAssumptions;
    private javax.swing.JList<String> jListUnlinkedDA;
    private javax.swing.JList<String> jListUnlinkedSDG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
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
