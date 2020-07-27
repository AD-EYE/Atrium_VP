package org.polarsys.capella.vp.atrium.design.service.tools;

import java.util.Collections;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.UIManager;
import javax.xml.soap.Node;

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
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.Assumption_list;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.DA_list;
import org.polarsys.capella.vp.atrium.Atrium.DG_list;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.Failure_list;
import org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

public class AtriumProcess extends javax.swing.JFrame {
	
	EList<CFA> listCFA = new BasicEList<CFA>();
	EList<Assumption> listAssumption = new BasicEList<Assumption>();
	
	DefaultListModel<String> nameLinkedAssumption = new DefaultListModel<String>();
	DefaultListModel<String> nameUnlinkedAssumption = new DefaultListModel<String>();
	DefaultComboBoxModel<String> ListFailureMode = new DefaultComboBoxModel<String>();
	
	LogicalComponentPkg the_LogicalComponentPkg = null;
	CFA_list the_CFA_list = null;
	Failure_list the_Failure_list = null;
	Assumption_list the_Assumption_list = null;
	DG_list the_DG_list = null;
	DA_list the_DA_list= null;
	
	EditingFrameAssumption myEditor = null;
	
	
	public AtriumProcess(EObject element) {
		EObject root = element;
		while (!(root instanceof LogicalArchitecture))
		{
			root = root.eContainer();
			//TODO add protection there
		}
		
		myEditor = new EditingFrameAssumption(this);

		initComponents(root);
		this.setVisible(true);
	}

	@SuppressWarnings("serial")
	private void initComponents(EObject root) {

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
		
		EList<String> ListCapellaElementName = new BasicEList<String>();
		
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
		  
		  if (node instanceof FailureMode)
		  {
			  FailureMode fm = (FailureMode) node;
			  ListFailureMode.addElement(fm.getName());
		  }
		  
		  if (node instanceof CFA){listCFA.add((CFA) node);}
		  
		  if (node instanceof Assumption){listAssumption.add((Assumption) node);}
		  
		  if (node instanceof LogicalComponentPkg){the_LogicalComponentPkg = (LogicalComponentPkg) node;}
		  
		  if (node instanceof CFA_list){the_CFA_list = (CFA_list) node;}
		  
		  if (node instanceof Failure_list){the_Failure_list = (Failure_list) node;}
		  
		  if (node instanceof Assumption_list){the_Assumption_list = (Assumption_list) node;}
		  
		  if (node instanceof DA_list){the_DA_list = (DA_list) node;}
		  
		  if (node instanceof DG_list){the_DG_list = (DG_list) node;}
		}
		
		Collections.sort(ListCapellaElementName);
		//DefaultComboBoxModel <String> ListCapellaElementNameBox = new DefaultComboBoxModel<String>(ListCapellaElementName.toArray(new String[ListCapellaElementName.size()]));
		
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
	        }
	    });
		
		
		//create CFAs in CFA list
		for (String el : ListCapellaElementName)
		{
			for (int i =0; i<ListFailureMode.getSize();i++)
			{
				boolean found = false;
				
				for (CFA cfa : listCFA)
				{
					if (cfa.getName().equals("{ " + el + " : " + ListFailureMode.getElementAt(i) + " }"))
					{
						found = true;
					}
				}
				
				if (!(found))
				{
					final CFA newCFA = AtriumFactoryImpl.eINSTANCE.createCFA();
					newCFA.setContent("Some content");
					newCFA.setState(true);
					newCFA.setName("{ " + el + " : " + ListFailureMode.getElementAt(i) + " }");
	
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

        jComboBoxDG.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDGActionPerformed(evt);
            }
        });

        jLabel21.setText("Design Goal");

      

        jLabel1.setText("Add to linked");
		jLabel2.setText("Remove from linked");
		jLabel3.setText("Unlinked Assumptions");
		jLabel4.setText("Linked Assumptions");
		jLabel5.setText("Linking CFAs and Assumptions");
		jLabel6.setText("Capella Element");
		jLabel7.setText("+");
		jLabel8.setText("Failure Mode");
		jLabel9.setText("Resulting CFA");
		
		jButtonAddFailure.setText("Add Failure Mode");
        jButtonAddFailure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFailureActionPerformed(evt);
            }
        });
        
        jButtonAddAssumption.setText("Add Assumption");
        jButtonAddAssumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAssumptionActionPerformed(evt);
            }
        });

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

        jListUnlinkedDA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListUnlinkedDA);

        jListLinkedDA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListLinkedDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListLinkedDAMouseClicked(evt);
            }
        });
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

        jComboBoxDG2.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Unlinked Design Alternative");

        jLabel23.setText("Linked Design Alternative");

        jListUnlinkedSDG.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane14.setViewportView(jListUnlinkedSDG);

        jLabel37.setText("Unlinked Sub-Design Goal");

        jListLinkedSDG.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane15.setViewportView(jListLinkedSDG);

        jLabel38.setText("Linked Sub-Design Goal");

        jLabel39.setText("Add to linked");

        jButtonAddLinkedSDG.setText("=>");
        jButtonAddLinkedSDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLinkedSDGActionPerformed(evt);
            }
        });

        jLabel40.setText("Remove from linked");

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

        jListDG.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jListDG);

        jListDA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jListDA);

        jButtonAddDG.setText("Add Design Goal");
        jButtonAddDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDGActionPerformed(evt);
            }
        });

        jButtonAddDA.setText("Add Design Alternative");
        jButtonAddDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDAActionPerformed(evt);
            }
        });

        jListCFA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jListCFA);

        jLabel25.setText("CFA list");

        jLabel26.setText("All unique combination of Capella element + failure mode are created automatically.");

        jLabel27.setText("Design Goal List");

        jLabel29.setText("Design Alternative List");

        jListSDG.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane13.setViewportView(jListSDG);

        jButtonAddSDG.setText("Add Sub-Design Goal");

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

        jListAssumption.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jListAssumption);

        jButtonAddAssumption.setText("Add Assumption");
        jButtonAddAssumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAssumptionActionPerformed(evt);
            }
        });

        jLabel8.setText("Assumption list");

        jListODD.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
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
                jButtonAddODDActionPerformed(evt);
            }
        });

        jButtonAddFR.setText("Add Functional Requirement");

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
        
        jListFailure.setModel(ListFailureMode);
        jScrollPane5.setViewportView(jListFailure);

        jButtonAddFailure.setText("Add Failure Mode");
        jButtonAddFailure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFailureActionPerformed(evt);
            }
        });

        jLabel24.setText("Failure list");
        
        
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
	
	
	public void updateDisplayCFA()
	{
		nameLinkedAssumption=new DefaultListModel<String>();
		nameUnlinkedAssumption=new DefaultListModel<String>();
		CFA the_CFA=null;
		
		if ((CapellaElementName!="Capella Element Example")&&(FailureName!="Failure Example"))
		{	
			for (CFA myCFA : listCFA) //look for the CFA that we are interested in
			{
				if (myCFA.getName().equals(jComboBoxCFA.getSelectedItem())){the_CFA = myCFA;}
			}
			
			for (Assumption a : listAssumption) //go through all the Assumptions to find those linked with the_CFA
			{
				if (the_CFA.getAssumption().contains(a)){nameLinkedAssumption.addElement(a.getName());}
				else{nameUnlinkedAssumption.addElement(a.getName());}
			}
			
			jListUnlinkedAssumptions.setModel(nameUnlinkedAssumption); //update list of assumptions
			jListLinkedAssumptions.setModel(nameLinkedAssumption);
		}
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
		
		updateDisplayCFA();//because the lists have changed
	}
	

	private void createFailureMode(String name) {
		final FailureMode newFailure = AtriumFactoryImpl.eINSTANCE.createFailureMode();
		newFailure.setContent("Some content");
		newFailure.setName(name);
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_Failure_list);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		        @Override
		        protected void doExecute() {
		        	((ExtensibleElement) the_Failure_list).getOwnedExtensions().add((ElementExtension) newFailure);//the add action is done there, within a transaction context
		        }
		    });
		
		ListFailureMode.addElement(newFailure.getName());//updating our local ComboBox
	}
	
	private void createAssumption(String name) {
		final Assumption newAssumption = AtriumFactoryImpl.eINSTANCE.createAssumption();
		newAssumption.setContent("Some content");
		newAssumption.setName(name);
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_Assumption_list);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		        @Override
		        protected void doExecute() {
		        	((ExtensibleElement) the_Assumption_list).getOwnedExtensions().add((ElementExtension) newAssumption);//the add action is done there, within a transaction context
		        }
		    });
		
		listAssumption.add(newAssumption);//updating our local list
		
		updateDisplayCFA();
	}

	
	private void jButtonAddLinkedActionPerformed(java.awt.event.ActionEvent evt) {
		if (!(jListUnlinkedAssumptions.getSelectedValue()==null)) //if one unlinked assumption is selected
		{
			moveAssumption("add");
		}
	}
	
	private void jButtonRemoveLinkedActionPerformed(java.awt.event.ActionEvent evt) {
		if (!(jListLinkedAssumptions.getSelectedValue()==null)) //if one linked assumption is selected
		{
			moveAssumption("remove");
		}
	}
	
	private void jComboBoxCFAActionPerformed(java.awt.event.ActionEvent evt) {
		CapellaElementName = (String) jComboBoxCFA.getSelectedItem();
		updateDisplayCFA();
	}
	
	private void jButtonAddFailureActionPerformed(java.awt.event.ActionEvent evt) {
		String name = JOptionPane.showInputDialog(getParent(), "Please name the new Failure Mode", "MyNewFailure");
		if (name != null) //if the user has not pressed "cancel"
		{ 
			boolean alreadyHere = false; //protection against existing name
			for (int i=0; i<ListFailureMode.getSize();i++)
			{
				if (name.equals(ListFailureMode.getElementAt(i))){alreadyHere = true;}
			}
			if (!(alreadyHere)) {createFailureMode(name);}
			else {JOptionPane.showMessageDialog(getParent(), "There is already a failure named like that, please chose another name.");}
		}
	}
	
	private void jButtonAddAssumptionActionPerformed(java.awt.event.ActionEvent evt) {
		String name = JOptionPane.showInputDialog(getParent(), "Please name the new Assumption", "MyNewAssumption");
		if (name != null) { //if the user has not pressed "cancel"
			
			boolean alreadyHere = false; //protection against existing name
			for (Assumption a : listAssumption)
			{
				if (name.equals(a.getName())){alreadyHere = true;}
			}
			if (!(alreadyHere)) {createAssumption(name);}
			else {JOptionPane.showMessageDialog(getParent(), "There is already an assumption named like that, please chose another name.");}
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
            myEditor.editAssumption(edited_assumption);
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
            myEditor.editAssumption(edited_assumption);
        } 
    }                                             

    private void jListLinkedDAMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButtonAddLinkedDAActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jButtonRemoveLinkedDAActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void jButtonAddDGActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButtonAddDAActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButtonAddODDActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jButtonAddLinkedSDGActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButtonRemoveLinkedSDGActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jComboBoxDGActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

	private String CapellaElementName= "Capella Element Example";
	private String FailureName= "Failure Example";
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
