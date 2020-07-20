package org.polarsys.capella.vp.atrium.design.service.tools;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

public class AtriumProcess extends javax.swing.JFrame {
	
	//handle list of CFA
	
	EList<CFA> listCFA = new BasicEList<CFA>();
	CFA_list the_CFA_list = null;
	
	public AtriumProcess(EObject element) {

		System.out.println(element);

		EObject root = element.eContainer();
		if (!(root instanceof LogicalArchitecture)) {
			System.out.println("It will be fixed later hopefully, but in the meantime please click on the diagram.");
		}

		initComponents(root);
		this.setVisible(true);
	}

	private void initComponents(EObject root) {

		jScrollPane1 = new javax.swing.JScrollPane();
		jListUnlinkedAssumptions = new javax.swing.JList();
		jScrollPane2 = new javax.swing.JScrollPane();
		jListLinkedAssumption = new javax.swing.JList();
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
		jButtonFinish = new javax.swing.JButton();
		
		
		//handle list of capella element NAME
		//EList <EObject> ListCapellaElement = null;
		DefaultComboBoxModel<String> ListCapellaElementName = new DefaultComboBoxModel<String>();
		
		//handle list of failure mode NAME
		DefaultComboBoxModel<String> ListFailureMode = new DefaultComboBoxModel<String>();
		
		LogicalArchitecture logArch = (LogicalArchitecture) root;
		TreeIterator<EObject> treeArch = logArch.eAllContents();
		
		EObject node= null;
		while(treeArch.hasNext())  {
		  node=treeArch.next();
		  if (node instanceof LogicalFunction)
		  {
			  LogicalFunction lf = (LogicalFunction) node;
			  ListCapellaElementName.addElement("[LF] " + lf.getName());
			  //ListCapellaElement.add(lf);
		  }
		  
		  if (node instanceof LogicalComponent)
		  {
			  LogicalComponent lc = (LogicalComponent) node;
			  ListCapellaElementName.addElement("[LC] " + lc.getName());
			  //ListCapellaElement.add(lc);
		  }
		  
		  if (node instanceof FunctionalExchange)
		  {
			  FunctionalExchange fe = (FunctionalExchange) node;
			  ListCapellaElementName.addElement("[FE] " + fe.getName());
			  //ListCapellaElement.add(fe);
		  }
		  
		  if (node instanceof FailureMode)
		  {
			  FailureMode fm = (FailureMode) node;
			  ListFailureMode.addElement(fm.getName());
		  }
		  
		  if (node instanceof CFA)
		  {
			  CFA myCFA = (CFA) node;
			  listCFA.add(myCFA);
		  }
		  
		  if (node instanceof CFA_list)
		  {
			  the_CFA_list = (CFA_list) node;
			  System.out.println("I have found the CFA list !");
		  }
		}
		

		// jListUnlinkedAssumptions.setModel(functionNames);
		jScrollPane1.setViewportView(jListUnlinkedAssumptions);

		jListLinkedAssumption.setModel(new javax.swing.DefaultListModel<String>() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane2.setViewportView(jListLinkedAssumption);

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
		
		jButtonFinish.setText("Finish and save");
		jButtonFinish.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonFinishActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(415, 415, 415).addComponent(jLabel5))
						.addGroup(layout.createSequentialGroup().addGap(130, 130, 130).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jComboBoxCapellaElement, javax.swing.GroupLayout.PREFERRED_SIZE,
												360, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(38, 38, 38).addComponent(jLabel7))
								.addComponent(jLabel6)).addGap(37, 37, 37)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel8).addComponent(jComboBoxFailureMode,
												javax.swing.GroupLayout.PREFERRED_SIZE, 359,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(32, 32, 32)
												.addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32,
														Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
												.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
																.createSequentialGroup()
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jButtonAddLinked,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				68,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jLabel1,
																				javax.swing.GroupLayout.Alignment.TRAILING))
																.addGap(43, 43, 43))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
																.createSequentialGroup()
																.addComponent(jButtonRemoveLinked,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 68,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(40, 40, 40)))))
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
						.addGroup(layout.createSequentialGroup().addComponent(jLabel3)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel4).addGap(367, 367, 367))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel9).addComponent(jTextFieldResultingCFA,
														javax.swing.GroupLayout.PREFERRED_SIZE, 500,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(274, 274, 274))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup()
												.addComponent(jButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE,
														162, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap()))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel5).addGap(31, 31, 31)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(jLabel8))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBoxCapellaElement, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7)
								.addComponent(jComboBoxFailureMode, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(36, 36, 36).addComponent(jLabel9)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextFieldResultingCFA, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jLabel4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jButtonAddLinked).addGap(37, 37, 37).addComponent(jLabel2)
												.addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButtonRemoveLinked).addGap(194, 194, 194))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
														javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18).addComponent(jButtonFinish,
														javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
												.addContainerGap()))));

		pack();
	}// </editor-fold>
	
	
	private void updateDisplayCFA()
	{
		if ((CapellaElementName!="Capella Element Example")&&(FailureName!="Failure Example"))
		{
			boolean found=false;
			for (CFA myCFA : listCFA)
			{
				if (myCFA.getName().equals(jTextFieldResultingCFA.getText()))
				{
					found=true;
				}
			}
			if (!(found))
			{
				//create CFA if not found
				final CFA newCFA = AtriumFactoryImpl.eINSTANCE.createCFA();

				newCFA.setContent("Some content");
				newCFA.setState(true);
				newCFA.setName(jTextFieldResultingCFA.getText());
				System.out.println(the_CFA_list);

				((CapellaElement) newCFA).setId(EcoreUtil.generateUUID());
				
				 TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(the_CFA_list);
				    domain.getCommandStack().execute(new RecordingCommand(domain) {

				        @Override
				        protected void doExecute() {
				            // Implement your write operations here,
				            // for example: set a new name
				        	((ExtensibleElement) the_CFA_list).getOwnedExtensions().add((ElementExtension) newCFA);
				        }
				    });
				listCFA.add(newCFA);
			}
			
		}
		
	}

	private void jButtonAddLinkedActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButtonRemoveLinkedActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBoxCapellaElementActionPerformed(java.awt.event.ActionEvent evt) {
		CapellaElementName = (String) jComboBoxCapellaElement.getSelectedItem();
		jTextFieldResultingCFA.setText("{ " + CapellaElementName + " ; " + FailureName + " }");
		updateDisplayCFA();
	}
	
    private void jComboBoxFailureModeActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	FailureName = (String) jComboBoxFailureMode.getSelectedItem();
    	jTextFieldResultingCFA.setText("{ " + CapellaElementName + " ; " + FailureName + " }");
		updateDisplayCFA();
    }                                                    

	private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.out.println(listCFA);
	}

	
	private String CapellaElementName= "Capella Element Example";
	private String FailureName= "Failure Example";
		
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonAddLinked;
	private javax.swing.JButton jButtonFinish;
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
	private javax.swing.JList<String> jListLinkedAssumption;
	private javax.swing.JList<String> jListUnlinkedAssumptions;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField jTextFieldResultingCFA;
	// End of variables declaration
}