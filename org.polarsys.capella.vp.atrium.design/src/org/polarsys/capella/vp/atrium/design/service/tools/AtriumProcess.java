package org.polarsys.capella.vp.atrium.design.service.tools;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
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
	
	EditingFrameAssumption myEditor = new EditingFrameAssumption();
	
	
	
	public AtriumProcess(EObject element) {

		EObject root = element;
		while (!(root instanceof LogicalArchitecture))
		{
			root = root.eContainer();
			//TODO add protection there
		}

		initComponents(root);
		this.setVisible(true);
	}

	private void initComponents(EObject root) {

		jScrollPane1 = new javax.swing.JScrollPane();
		jListUnlinkedAssumptions = new javax.swing.JList();
		jScrollPane2 = new javax.swing.JScrollPane();
		jListLinkedAssumptions = new javax.swing.JList();
		jButtonAddLinked = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jButtonRemoveLinked = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jComboBoxCapellaElement = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jComboBoxFailureMode = new javax.swing.JComboBox();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jTextFieldResultingCFA = new javax.swing.JTextField();
        jButtonAddFailure = new javax.swing.JButton();
        jButtonAddAssumption = new javax.swing.JButton();
		
		
		//handle list of Capella element NAME
		DefaultComboBoxModel<String> ListCapellaElementName = new DefaultComboBoxModel<String>();
		
		LogicalArchitecture logArch = (LogicalArchitecture) root;
		TreeIterator<EObject> treeArch = logArch.eAllContents();
		
		EObject node= null;
		
		while(treeArch.hasNext())
		{
		  node=treeArch.next();
		  if (node instanceof LogicalFunction)
		  {
			  LogicalFunction lf = (LogicalFunction) node;
			  ListCapellaElementName.addElement("[LF] " + lf.getName());
		  }
		  
		  if (node instanceof LogicalComponent)
		  {
			  LogicalComponent lc = (LogicalComponent) node;
			  ListCapellaElementName.addElement("[LC] " + lc.getName());
		  }
		  
		  if (node instanceof FunctionalExchange)
		  {
			  FunctionalExchange fe = (FunctionalExchange) node;
			  ListCapellaElementName.addElement("[FE] " + fe.getName());
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
		
		
		 jListLinkedAssumptions.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jListLinkedAssumptionMouseClicked(evt);
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

		jComboBoxCapellaElement.setModel(ListCapellaElementName);
		jComboBoxCapellaElement.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxCapellaElementActionPerformed(evt);
			}
		});
		
		jComboBoxFailureMode.setModel(ListFailureMode);
        jComboBoxFailureMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFailureModeActionPerformed(evt);
            }
        });
      

        jLabel1.setText("Add to linked");
		jLabel2.setText("Remove from linked");
		jLabel3.setText("Unlinked Assumptions");
		jLabel4.setText("Linked Assumptions");
		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel5.setText("Linking CFAs and Assumptions");
		jLabel6.setText("Capella Element");
		jLabel7.setText("+");
		jLabel8.setText("Failure Mode");
		jLabel9.setText("Resulting CFA");
		jTextFieldResultingCFA.setText("{ " + CapellaElementName + " ; " + FailureName + " }");
		
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxCapellaElement, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxFailureMode, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jButtonAddFailure)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonRemoveLinked, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonAddLinked, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldResultingCFA, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAddAssumption)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCapellaElement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxFailureMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddFailure))
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldResultingCFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddLinked)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveLinked)
                        .addGap(193, 193, 193))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jButtonAddAssumption)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>              
	
	
	private void updateDisplayCFA()
	{
		nameLinkedAssumption=new DefaultListModel<String>();
		nameUnlinkedAssumption=new DefaultListModel<String>();
		CFA the_CFA=null;
		
		if ((CapellaElementName!="Capella Element Example")&&(FailureName!="Failure Example"))
		{	
			for (CFA myCFA : listCFA) //look for the CFA that we are interested in
			{
				if (myCFA.getName().equals(jTextFieldResultingCFA.getText())){the_CFA = myCFA;}
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
			if (myCFA.getName().equals(jTextFieldResultingCFA.getText())){the_CFA=myCFA;}
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
	
	private void createCFAifNew()
	{
		if ((CapellaElementName!="Capella Element Example")&&(FailureName!="Failure Example"))//do nothing if a CFA is not chosen yet
		{
			boolean found=false;
			for (CFA myCFA : listCFA)//we are not sure to find a matching CFA
			{
				if (myCFA.getName().equals(jTextFieldResultingCFA.getText())){found=true;}
			}
			if (!(found))//if the CFA doesnt exist, then we create it
			{
				final CFA newCFA = AtriumFactoryImpl.eINSTANCE.createCFA();
				newCFA.setContent("Some content");
				newCFA.setState(true);
				newCFA.setName(jTextFieldResultingCFA.getText());

				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_CFA_list);
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
		
		ListFailureMode.addElement(newFailure.getName());//updating our local list
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
	
	private void jComboBoxCapellaElementActionPerformed(java.awt.event.ActionEvent evt) {
		CapellaElementName = (String) jComboBoxCapellaElement.getSelectedItem();
		jTextFieldResultingCFA.setText("{ " + CapellaElementName + " ; " + FailureName + " }");
		createCFAifNew();
		updateDisplayCFA();
	}
	
    private void jComboBoxFailureModeActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	FailureName = (String) jComboBoxFailureMode.getSelectedItem();
    	jTextFieldResultingCFA.setText("{ " + CapellaElementName + " ; " + FailureName + " }");
		createCFAifNew();
		updateDisplayCFA();
    }
	
	private void jButtonAddFailureActionPerformed(java.awt.event.ActionEvent evt) {
		String name = JOptionPane.showInputDialog(getParent(), "Please name the new Failure Mode", "MyNewFailure");
		if (name != null) { //if the user has not pressed "cancel"
			createFailureMode(name);
		}
    }
	
	private void jButtonAddAssumptionActionPerformed(java.awt.event.ActionEvent evt) {
		String name = JOptionPane.showInputDialog(getParent(), "Please name the new Assumption", "MyNewAssumption");
		if (name != null) { //if the user has not pressed "cancel"
			createAssumption(name);
		}
    }   
	
	private void jListLinkedAssumptionMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            myEditor.test();
        }
        
    }      

	private String CapellaElementName= "Capella Element Example";
	private String FailureName= "Failure Example";
	private javax.swing.JButton jButtonAddAssumption;
    private javax.swing.JButton jButtonAddFailure;
	private javax.swing.JButton jButtonAddLinked;
	private javax.swing.JButton jButtonRemoveLinked;
	private javax.swing.JComboBox<String> jComboBoxCapellaElement;
	private javax.swing.JComboBox<String> jComboBoxFailureMode;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JList<String> jListLinkedAssumptions;
	private javax.swing.JList<String> jListUnlinkedAssumptions;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField jTextFieldResultingCFA;
}
