package org.polarsys.capella.vp.atrium.design.service.tools;

import java.util.Collections;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
import org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

@SuppressWarnings("serial")
public class AtriumProcess extends javax.swing.JFrame {
	
	EList<CFA> listCFA = new BasicEList<CFA>();
	EList<Assumption> listAssumption = new BasicEList<Assumption>();
	EList<DG> listDG = new BasicEList<DG>();
	EList<DA> listDA = new BasicEList<DA>();
	EList<sDG> listsDG = new BasicEList<sDG>();
	EList<FailureMode> ListFailureMode = new BasicEList<FailureMode>();
	EList<ODD> listODD = new BasicEList<ODD>();
	EList<FR> listFR = new BasicEList<FR>();
	
	DefaultListModel<String> nameLinkedAssumption = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedAssumption = new DefaultListModel<String>();
	
	DefaultListModel<String> nameLinkedsDG = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedsDG = new DefaultListModel<String>();
	
	DefaultListModel<String> nameLinkedDA = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedDA = new DefaultListModel<String>();
	
	DefaultComboBoxModel<String> listDGcbModel= new DefaultComboBoxModel<String>();
	
	EList<String> ListCapellaElementName = new BasicEList<String>();
	

	LogicalComponentPkg the_LogicalComponentPkg = null;
	
	sDG_list the_sDG_list = null;
	CFA_list the_CFA_list = null;
	Failure_list the_Failure_list = null;
	Assumption_list the_Assumption_list = null;
	DG_list the_DG_list = null;
	DA_list the_DA_list= null;
	ODD_list the_ODD_list = null;
	FR_list the_FR_list = null;
	
	EditingFrameAssumption myAssumptionEditor = null;
	EditingPanel myEditor = null;
	
	
	public AtriumProcess(EObject element) {
		EObject root = element;
		while (!(root instanceof LogicalArchitecture))
		{
			root = root.eContainer();
			//TODO add protection there
		}
		
		myAssumptionEditor = new EditingFrameAssumption(this);
		myEditor = new EditingPanel(this);
		
		sortAtriumElementOnce(root);
		initComponents();
		updateDisplayTab0();
		updateDisplayTab1();
		updateDisplayTab2();
		updateDisplayTab3();
		updateDisplayTab4();
		ObjectAdded();
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
			  ListCapellaElementName.add("[LF] " + lf.getName());
		  }
		  
		  if (node instanceof LogicalComponent)
		  {
			  LogicalComponent lc = (LogicalComponent) node;
			  ListCapellaElementName.add("[LC] " + lc.getName());
		  }
		  
		  if (node instanceof FunctionalExchange)
		  {
			  FunctionalExchange fe = (FunctionalExchange) node;
			  ListCapellaElementName.add("[FE] " + fe.getName());
		  }
		  
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
		
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(root);
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
		
		
		//create CFAs in CFA list
		for (String el : ListCapellaElementName)
		{
			for (FailureMode f : ListFailureMode)
			{
				boolean found = false;
				
				for (CFA cfa : listCFA){if (cfa.getName().equals("{ " + el + " : " + f.getName() + " }")) {found = true;}}
				
				if (!(found))
				{
					final CFA newCFA = AtriumFactoryImpl.eINSTANCE.createCFA();
					newCFA.setContent("Some content");
					newCFA.setState(true);
					newCFA.setName("{ " + el + " : " + f.getName() + " }");
	
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
	
	
	@SuppressWarnings("serial")
	private void initComponents() { //this function has been auto-generated by netbeans. You do not have to go through it, I barely changed anything except the handlers

		jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUnlinkedAssumptions = new javax.swing.JList<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListLinkedAssumptions = new javax.swing.JList<String>();
        jLabel1 = new javax.swing.JLabel();
        jButtonAddLinked = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonRemoveLinked = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCFA = new javax.swing.JComboBox<String>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxDG = new javax.swing.JComboBox<String>();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListUnlinkedDA = new javax.swing.JList<String>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListLinkedDA = new javax.swing.JList<String>();
        jLabel5 = new javax.swing.JLabel();
        jButtonAddLinkedDA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonRemoveLinkedDA = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDG2 = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jListUnlinkedSDG = new javax.swing.JList<String>();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jListLinkedSDG = new javax.swing.JList<String>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButtonAddLinkedSDG = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jButtonRemoveLinkedSDG = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListDG = new javax.swing.JList<String>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListDA = new javax.swing.JList<String>();
        jButtonAddDG = new javax.swing.JButton();
        jButtonAddDA = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListCFA = new javax.swing.JList<String>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jListSDG = new javax.swing.JList<String>();
        jButtonAddSDG = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListAssumption = new javax.swing.JList<String>();
        jButtonAddAssumption = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jListODD = new javax.swing.JList<String>();
        jScrollPane12 = new javax.swing.JScrollPane();
        jListFR = new javax.swing.JList<String>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButtonAddODD = new javax.swing.JButton();
        jButtonAddFR = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListFailure = new javax.swing.JList<String>();
        jButtonAddFailure = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListCapella = new javax.swing.JList<String>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
		
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
	                jListLinkedAssumptionMouseClicked(evt);
	            }
	        });
		 
		jListUnlinkedAssumptions.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jListUnlinkedAssumptionMouseClicked(evt);
	            }
	        });
		

		jScrollPane1.setViewportView(jListUnlinkedAssumptions);
		jScrollPane2.setViewportView(jListLinkedAssumptions);

		jButtonAddLinked.setText("=>");
		jButtonAddLinked.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddLinkedActionPerformed(evt);
			}
		});

		jButtonRemoveLinked.setText("<=");
		jButtonRemoveLinked.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRemoveLinkedActionPerformed(evt);
			}
		});
        
		DefaultComboBoxModel <String> CbCFA= new DefaultComboBoxModel<String>();
		for (int i = 0; i < listCFA.size(); i++) {
			CbCFA.addElement(listCFA.get(i).getName());
		}
        jComboBoxCFA.setModel(CbCFA);
        jComboBoxCFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCFAActionPerformed(evt);
            }
        });

        jLabel19.setText("CFA");

        jLabel20.setText("linked to :");
        
        jComboBoxDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDGActionPerformed(evt);
            }
        });

        jLabel21.setText("Design Goal");
        
        jComboBoxDG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDG2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Add to linked");
		jLabel2.setText("Remove from linked");
		jLabel3.setText("Unlinked Assumptions");
		jLabel4.setText("Linked Assumptions");
		jLabel5.setText("Linking CFAs and Assumptions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButtonAddLinked, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jButtonRemoveLinked, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(47, 47, 47)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxCFA, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxDG, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(214, 214, 214))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBoxDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddLinked)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemoveLinked)
                                .addGap(163, 163, 163))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );

        jTabbedPane.addTab("Linking DG and Assumptions to CFA", jPanel1);

        jScrollPane3.setViewportView(jListUnlinkedDA);
        jScrollPane4.setViewportView(jListLinkedDA);

        jLabel5.setText("Add to linked");

        jButtonAddLinkedDA.setText("=>");
        jButtonAddLinkedDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLinkedDAActionPerformed(evt);
            }
        });

        jLabel6.setText("Remove from linked");

        jButtonRemoveLinkedDA.setText("<=");
        jButtonRemoveLinkedDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveLinkedDAActionPerformed(evt);
            }
        });

        jLabel7.setText("Design Goal");
        jLabel9.setText("Unlinked Design Alternative");
        jLabel23.setText("Linked Design Alternative");
        jScrollPane14.setViewportView(jListUnlinkedSDG);
        jLabel37.setText("Unlinked Sub-Design Goal");
        jScrollPane15.setViewportView(jListLinkedSDG);
        jLabel38.setText("Linked Sub-Design Goal");
        jLabel39.setText("Add to linked");
        jLabel40.setText("Remove from linked");

        jButtonAddLinkedSDG.setText("=>");
        jButtonAddLinkedSDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLinkedSDGActionPerformed(evt);
            }
        });

        jButtonRemoveLinkedSDG.setText("<=");
        jButtonRemoveLinkedSDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveLinkedSDGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(498, 498, 498))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonAddLinkedSDG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonRemoveLinkedDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonAddLinkedDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonRemoveLinkedSDG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(482, 482, 482))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel39)
                                        .addGap(48, 48, 48)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxDG2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxDG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddLinkedDA)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveLinkedDA))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jScrollPane14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddLinkedSDG)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveLinkedSDG)
                        .addGap(51, 51, 51))))
        );

        jTabbedPane.addTab("Linking DG and DA", jPanel2);
       
        jScrollPane8.setViewportView(jListDG);
        jScrollPane6.setViewportView(jListDA);

        jButtonAddDG.setText("Add Design Goal");
        jButtonAddDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd(evt,2);
            }
        });

        jButtonAddDA.setText("Add Design Alternative");
        jButtonAddDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd(evt,3);
            }
        });

        jScrollPane9.setViewportView(jListCFA);
        jLabel25.setText("CFA list");
        jLabel26.setText("All unique combination of Capella element + failure mode are created automatically.");
        jLabel27.setText("Design Goal List");
        jLabel29.setText("Design Alternative List");

        
        jScrollPane13.setViewportView(jListSDG);

        jButtonAddSDG.setText("Add Sub-Design Goal");
        jButtonAddSDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd(evt,4);
            }
        });

        jLabel36.setText("Sub-Design Goal list");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddDG)
                        .addGap(86, 86, 86)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonAddDA)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonAddSDG)
                                .addGap(73, 73, 73))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddSDG)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddDA)
                        .addComponent(jButtonAddDG)))
                .addGap(30, 30, 30))
        );

        jTabbedPane.addTab("Edit DG, sDG, DA, CFA", jPanel3);
        
        jScrollPane7.setViewportView(jListAssumption);

        jButtonAddAssumption.setText("Add Assumption");
        jButtonAddAssumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd(evt,7);
            }
        });

        jLabel8.setText("Assumption list");

        jListODD.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        //TODO
        
        jScrollPane11.setViewportView(jListODD);

        jListFR.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jScrollPane12.setViewportView(jListFR);

        jLabel32.setText("Operational Design Domain");

        jLabel33.setText("Functional Requirements");

        jButtonAddODD.setText("Add ODD");
        jButtonAddODD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd(evt,5);
            }
        });

        jButtonAddFR.setText("Add Functional Requirement");
        jButtonAddFR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd(evt,6);
            }
        });
        
        jLabel34.setText("(will add the corresponding assumption)");
        jLabel35.setText("(will add the corresponding assumption)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 241, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButtonAddAssumption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddODD)
                .addGap(249, 249, 249)
                .addComponent(jButtonAddFR)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(155, 155, 155)
                .addComponent(jLabel35)
                .addGap(77, 77, 77))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane12)
                            .addComponent(jScrollPane11)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddAssumption)
                        .addComponent(jButtonAddODD)
                        .addComponent(jButtonAddFR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Edit Assumption, ODD, FR", jPanel5);
        
        jScrollPane5.setViewportView(jListFailure);

        jButtonAddFailure.setText("Add Failure Mode");
        jButtonAddFailure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd(evt,1);
            }
        });

        jLabel24.setText("Failure List (please restart that UI after creating/editing one)");
        
        
        DefaultListModel <String> listModel = new DefaultListModel<String>();
        for (int i = 0; i < ListCapellaElementName.size(); i++)
        {
            listModel.addElement(ListCapellaElementName.get(i));
        }
        jListCapella.setModel(listModel);
    
        jScrollPane10.setViewportView(jListCapella);

        jLabel30.setText("To add a Capella element, simply add it on the Capella model. Please restart this UI afterward.");
        jLabel31.setText("Capella element");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddFailure)
                        .addGap(206, 206, 206))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddFailure)
                    .addComponent(jLabel30))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Capella elements and Failure mode", jPanel4);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("ATRIUM process");
        jLabel28.setText("Double click on any listed item to edit it");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(278, 278, 278)
                .addComponent(jLabel28)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
	}
	
	public void updateDisplayTab4()
	{
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
	
	private void moveAssumption(String action) //action="add" or "remove"
	{
		CFA the_CFA = null;
		String movingAssumption = null;
		Assumption the_moving_assumption = null;
		
		//decide on which list should we look for the Assumptions based on if we want to add or remove a link
		if (action=="add") {movingAssumption = jListUnlinkedAssumptions.getSelectedValue();}
		else if (action=="remove") {movingAssumption = jListLinkedAssumptions.getSelectedValue();}
		else {System.out.println("The moveAssumption action you want to do is unclear...");}
		
		for (Assumption a : listAssumption) //Go through all the assumptions to find the one with the same name
		{
			if (a.getName().equals(movingAssumption)){the_moving_assumption=a;}
		}
		
		for (CFA myCFA : listCFA) //look for the CFA that we are interested in
		{
			if (myCFA.getName().equals(jComboBoxCFA.getSelectedItem())){the_CFA=myCFA;}
		}
		
		final CFA CFA_parameter = the_CFA;
		final Assumption assumption_parameter = the_moving_assumption;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_CFA_list);
		
		if (action=="remove")
		{
			domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	CFA_parameter.getAssumption().remove(assumption_parameter);//the remove action is done there, within a transaction context
			        }
			    });
		}
		else if (action=="add")
		{
			 domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	CFA_parameter.getAssumption().add(assumption_parameter);//the add action is done there, within a transaction context
			        }
			    });
		}
		else {System.out.println("The moveAssumption action you want to do is unclear...twice");}
		
		updateDisplayTab0();//because the lists have changed
	}
	
	private void movesDG(String action) //action="add" or "remove"
	{
		DG the_DG = null;
		String movingsDG = null;
		sDG the_moving_sDG = null;
		
		//decide on which list should we look for the sDG based on if we want to add or remove a link
		if (action=="add") {movingsDG = jListUnlinkedSDG.getSelectedValue();}
		else if (action=="remove") {movingsDG = jListLinkedSDG.getSelectedValue();}
		else {System.out.println("The movesDG action you want to do is unclear...");}
		
		for (sDG sdg : listsDG) //Go through all the dDG to find the one with the same name
		{
			if (sdg.getName().equals(movingsDG)){the_moving_sDG=sdg;}
		}
		
		for (DG myDG : listDG) //look for the CFA that we are interested in
		{
			if (myDG.getName().equals(jComboBoxDG2.getSelectedItem())){the_DG=myDG;}
		}
		
		final DG DG_parameter = the_DG;
		final sDG sDG_parameter = the_moving_sDG;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_DG_list);
		
		if (action=="remove")
		{
			domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	DG_parameter.getSubDGs().remove(sDG_parameter);//the remove action is done there, within a transaction context
			        }
			    });
		}
		else if (action=="add")
		{
			 domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	DG_parameter.getSubDGs().add(sDG_parameter);//the add action is done there, within a transaction context
			        }
			    });
		}
		else {System.out.println("The movesDG action you want to do is unclear...twice");}
		
		updateDisplayTab1();//because the lists have changed
	}
	
	private void moveDA(String action) //action="add" or "remove"
	{
		DG the_DG = null;
		String movingDA = null;
		DA the_moving_DA = null;
		
		//decide on which list should we look for the sDG based on if we want to add or remove a link
		if (action=="add") {movingDA = jListUnlinkedDA.getSelectedValue();}
		else if (action=="remove") {movingDA = jListLinkedDA.getSelectedValue();}
		else {System.out.println("The movesDA action you want to do is unclear...");}
		
		for (DA da : listDA) //Go through all the dDG to find the one with the same name
		{
			if (da.getName().equals(movingDA)){the_moving_DA=da;}
		}
		
		for (DG myDG : listDG) //look for the CFA that we are interested in
		{
			if (myDG.getName().equals(jComboBoxDG2.getSelectedItem())){the_DG=myDG;}
		}
		
		final DG DG_parameter = the_DG;
		final DA DA_parameter = the_moving_DA;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_DG_list);
		
		if (action=="remove")
		{
			domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	DG_parameter.getDesignAlternative().remove(DA_parameter);//the remove action is done there, within a transaction context
			        }
			    });
		}
		else if (action=="add")
		{
			 domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	DG_parameter.getDesignAlternative().add(DA_parameter);//the add action is done there, within a transaction context
			        }
			    });
		}
		else {System.out.println("The movesDA action you want to do is unclear...twice");}
		
		updateDisplayTab1();//because the lists have changed
	}
	
	
	private void linkCFAwithDG()
	{
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_CFA_list);
		
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
	
	
	
	private void jButtonAddLinkedActionPerformed(java.awt.event.ActionEvent evt) {
		if (!(jListUnlinkedAssumptions.getSelectedValue()==null))
		{
			moveAssumption("add");
		}
	}
	
	private void jButtonRemoveLinkedActionPerformed(java.awt.event.ActionEvent evt) {
		if (!(jListLinkedAssumptions.getSelectedValue()==null))
		{
			moveAssumption("remove");
		}
	}
	
	private void jButtonAddLinkedDAActionPerformed(java.awt.event.ActionEvent evt) {                                                   
		if (!(jListUnlinkedDA.getSelectedValue()==null))
		{
			moveDA("add");
		}
    }                                                  

    private void jButtonRemoveLinkedDAActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    	if (!(jListLinkedDA.getSelectedValue()==null))
		{
			moveDA("remove");
		}
    }
	
    private void jButtonAddLinkedSDGActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    	if (!(jListUnlinkedSDG.getSelectedValue()==null))
		{
			movesDG("add");
		}
    }                                                   

    private void jButtonRemoveLinkedSDGActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    	if (!(jListLinkedSDG.getSelectedValue()==null))
		{
			movesDG("remove");
		}
    }
	
	
	
	
	private void jListLinkedAssumptionMouseClicked(java.awt.event.MouseEvent evt) {
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
    		
    		 myEditor.editing(edited_object, listDG, listDA, listCFA, listsDG, ListFailureMode);
    	}
	}                                                                                       

    private void jComboBoxDGActionPerformed(java.awt.event.ActionEvent evt) {
    	if (jComboBoxCFA.getSelectedItem()!=null)
    	{
    		linkCFAwithDG();
    	} 
    }
    
    @SuppressWarnings("rawtypes")
	private void jButtonAdd(java.awt.event.ActionEvent evt, int type)
    {
    	String DialogString = null;
    	String DefaultName = null;
		EList ObjectList = null;
		
    	switch (type)
    	{
    	case 1:
    		DialogString = "Failure";
    		DefaultName = "MyNewFailureTEMP";
    		ObjectList = ListFailureMode;
    		break;
    	case 2:
    		DialogString = "Design Goal";
    		DefaultName = "MyNewDG";
    		ObjectList = listDG;
    		break;
    	case 3:
    		DialogString = "Design Alternative";
    		DefaultName = "MyNewDA";
    		ObjectList = listDA;
    		break;
    	case 4:
    		DialogString = "SubDesign Goal";
    		DefaultName = "MyNewSubDG";
    		ObjectList = listsDG;
    		break;
    	case 5:
    		DialogString = "Operational Design Domain";
    		DefaultName = "MyNewODD";
    		ObjectList = listODD;
    		break;
    	case 6:
    		DialogString = "Functional Requirements";
    		DefaultName = "MyNewFR";
    		ObjectList = listFR;
    		break;
    	case 7:
    		DialogString = "Assumption";
    		DefaultName = "MyNewAssumption";
    		ObjectList = listAssumption;
    	}
    	
    	String name = JOptionPane.showInputDialog(getParent(), "Please name the new " + DialogString, DefaultName);
    	
    	if (name != null)  //if the user has not pressed "cancel"
    	{
			if (ObjectList.contains(name)){JOptionPane.showMessageDialog(getParent(), "There is already a " + DialogString + " named like that, please chose another name.");}
			else{createTool(name,type);}
		}
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void createTool(String name, int type)
	{
		EObject Extensible_list = null;
		AtriumBasicElement newObject = null;
		EList ObjectList = null;
		
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_CFA_list); //arbitrary
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
		else{myEditor.editing(newObject_parameter, listDG, listDA, listCFA, listsDG, ListFailureMode);}
		
		if ((type==5))
		{
			createTool("MyAssumption [created from ODD " + name + "]",7);
		}
		if ((type==6))
		{
			createTool("MyAssumption [created from FR " + name + "]",7);
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
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
    private javax.swing.JPanel jPanel4;
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
