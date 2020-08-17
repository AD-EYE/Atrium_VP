package org.polarsys.capella.vp.atrium.design.service.tools;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.capella.vp.atrium.Atrium.AtriumBasicElement;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.sDG;

@SuppressWarnings("serial")
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
    	//paste all the initComponent method from Netbeans here

    	java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNameeditedObject = new javax.swing.JTextField();
        jButtonSaveEditedObject = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextContentEditedObject = new javax.swing.JTextPane();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Editing [Object]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Content :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        getContentPane().add(jLabel3, gridBagConstraints);

        jTextNameeditedObject.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jTextNameeditedObject, gridBagConstraints);

        jButtonSaveEditedObject.setText("Save and Quit");
        jButtonSaveEditedObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveEditedObjectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 10.0;
        getContentPane().add(jButtonSaveEditedObject, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Selection ?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel4, gridBagConstraints);

        buttonGroup1.add(jRadioButtonYes);
        jRadioButtonYes.setText("Yes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jRadioButtonYes, gridBagConstraints);

        buttonGroup1.add(jRadioButtonNo);
        jRadioButtonNo.setText("No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jRadioButtonNo, gridBagConstraints);

        jScrollPane1.setViewportView(jTextContentEditedObject);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 40.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>                        

    private void jButtonSaveEditedObjectActionPerformed(java.awt.event.ActionEvent evt) {      
    	TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(editedObject);
    	boolean alreadyHere = false; //protection against existing name
    	if (editedObject instanceof DG) {for (DG dg : listDG){if (jTextNameeditedObject.getText().equals(dg.getName()) && (!(dg.equals((DG) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof DA) {for (DA da : listDA){if (jTextNameeditedObject.getText().equals(da.getName()) && (!(da.equals((DA) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof CFA) {for (CFA cfa : listCFA){if (jTextNameeditedObject.getText().equals(cfa.getName()) && (!(cfa.equals((CFA) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof sDG) {for (sDG sdg : listsDG){if (jTextNameeditedObject.getText().equals(sdg.getName()) && (!(sdg.equals((sDG) editedObject)))){alreadyHere = true;}}}
    	if (editedObject instanceof FailureMode) {for (FailureMode f : listFailure){if (jTextNameeditedObject.getText().equals(f.getName()) && (!(f.equals((FailureMode) editedObject)))){alreadyHere = true;}}}
	
		if (!(alreadyHere))
		{
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
			this.setVisible(false);
			
			if (editedObject instanceof DG) {my_parent.ObjectAdded();}
			
			if (editedObject instanceof DA)
			{
				domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	DA da = (DA) editedObject;
			        	da.setIsPartOfSelection(jRadioButtonYes.isSelected());
			        }
			    });	
			}
			
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
    	if (object instanceof FailureMode) {jLabel1.setText("Editing Failure Mode");}
    	if (object instanceof sDG) {jLabel1.setText("Editing subDesign Goal");}
    	
    	if (object instanceof DA) 
    	{
    		jLabel1.setText("Editing Design alternative");
    		jRadioButtonNo.setVisible(true);
    		jRadioButtonYes.setVisible(true);
    		jLabel4.setVisible(true);
    		
    		DA da = (DA) object;
    		if (da.isIsPartOfSelection()){jRadioButtonYes.setSelected(true);}
    		else {jRadioButtonNo.setSelected(true);}
    	}
    	else 
    	{
    		jRadioButtonNo.setVisible(false);
    		jRadioButtonYes.setVisible(false);
    		jLabel4.setVisible(false);
    	}
    	
    	this.setVisible(true);
    }
   

    // Variables declaration - do not modify
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextContentEditedObject;
    private javax.swing.JButton jButtonSaveEditedObject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JTextField jTextNameeditedObject;
    // End of variables declaration                   
}
