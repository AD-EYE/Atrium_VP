package org.polarsys.capella.vp.atrium.design.service.tools;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumBasicElement;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;
import org.polarsys.capella.vp.atrium.Atrium.sDG;
import org.polarsys.capella.vp.atrium.Atrium.validity_Type;

public class EditingPanel extends javax.swing.JFrame {

	AtriumProcess my_parent = null;
	AtriumBasicElement editedObject=null;
	EList<CFA> listCFA = new BasicEList<CFA>();
	EList<DG> listDG = new BasicEList<DG>();
	EList<DA> listDA = new BasicEList<DA>();
	EList<sDG> listsDG = new BasicEList<sDG>();
	EList<FailureMode> listFailure = new BasicEList<FailureMode>();
	
    public EditingPanel(AtriumProcess parent) {
    	my_parent=parent;
        initComponents();
    }
                        
    private void initComponents() {

    	Editingpanel = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNameeditedObject = new javax.swing.JTextField();
        jTextContentEditedObject = new javax.swing.JTextField();
        jButtonSaveEditedObject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Editing [Object]");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Content :");

        jTextNameeditedObject.setText("jTextField1");

        jTextContentEditedObject.setText("jTextField2");

        jButtonSaveEditedObject.setText("Save and Quit");
        jButtonSaveEditedObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveEditedObjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(Editingpanel.getContentPane());
        Editingpanel.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSaveEditedObject, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addGap(33, 33, 33)
                            .addComponent(jTextNameeditedObject, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jTextContentEditedObject))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNameeditedObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextContentEditedObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonSaveEditedObject)
                .addGap(21, 21, 21))
        );
        
        Editingpanel.setAlwaysOnTop(true);
        Editingpanel.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        Editingpanel.setSize(new java.awt.Dimension(560, 260));
        Editingpanel.setType(java.awt.Window.Type.POPUP);

        pack();
    }// </editor-fold>                        

    private void jButtonSaveEditedObjectActionPerformed(java.awt.event.ActionEvent evt) {                                                        
    	boolean alreadyHere = false; //protection against existing name
    	if (editedObject instanceof DG) {for (DG dg : listDG){if (jTextNameeditedObject.getText().equals(dg.getName()) && (!(dg.equals((DG) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof DA) {for (DA da : listDA){if (jTextNameeditedObject.getText().equals(da.getName()) && (!(da.equals((DA) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof CFA) {for (CFA cfa : listCFA){if (jTextNameeditedObject.getText().equals(cfa.getName()) && (!(cfa.equals((CFA) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof sDG) {for (sDG sdg : listsDG){if (jTextNameeditedObject.getText().equals(sdg.getName()) && (!(sdg.equals((sDG) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof FailureMode) {for (FailureMode f : listFailure){if (jTextNameeditedObject.getText().equals(f.getName()) && (!(f.equals((FailureMode) editedObject)))){alreadyHere = true;}}}
	
		if (!(alreadyHere))
		{
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(editedObject);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	editedObject.setName(jTextNameeditedObject.getText());
			        	editedObject.setContent(jTextContentEditedObject.getText());
			        }
			    });
			
			
			my_parent.updateDisplayTab0();
			my_parent.updateDisplayTab1();
			my_parent.updateDisplayTab2();
			my_parent.updateDisplayTab3();
			my_parent.updateDisplayTab4();
			Editingpanel.setVisible(false);
			
			if (editedObject instanceof DG) {my_parent.ObjectAdded();}
			if (editedObject instanceof FailureMode) {my_parent.FailureModeModified(editedObject);}
		}
		else {JOptionPane.showMessageDialog(getParent(), "There is already an assumption named like that, please chose another name.");}
    }
    
    public void editing(AtriumBasicElement object, EList<DG> listDG_p, EList<DA> listDA_p, EList<CFA> listCFA_p, EList<sDG> listsDG_p, EList<FailureMode> listFailure_p)
    {	
    	listDG = listDG_p;
    	listDA = listDA_p;
    	listCFA = listCFA_p;
    	listsDG = listsDG_p;
    	listFailure = listFailure_p;
    	
    	editedObject=object;
    	jTextNameeditedObject.setText(object.getName());
    	jTextContentEditedObject.setText(object.getContent());
    	
    	if (object instanceof CFA) {jLabel1.setText("Editing CFA");}
    	if (object instanceof DG) {jLabel1.setText("Editing Design Goal");}
    	if (object instanceof DA) {jLabel1.setText("Editing Design alternative");}
    	if (object instanceof FailureMode) {jLabel1.setText("Editing Failure Mode");}
    	if (object instanceof sDG) {jLabel1.setText("Editing subDesign Goal");}
    	
    	Editingpanel.setVisible(true);
    }
   

    // Variables declaration - do not modify
    private javax.swing.JFrame Editingpanel;
    private javax.swing.JButton jButtonSaveEditedObject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextContentEditedObject;
    private javax.swing.JTextField jTextNameeditedObject;
    // End of variables declaration                   
}
