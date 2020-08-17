package org.polarsys.capella.vp.atrium.design.service.tools;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;
import org.polarsys.capella.vp.atrium.Atrium.validity_Type;

@SuppressWarnings("serial")
public class EditingFrameAssumption extends javax.swing.JFrame {
	
	Assumption edited_assumption = null;
	EList<Assumption> listAssumption = null;
	AtriumProcess my_parent = null;
	
	public EditingFrameAssumption(AtriumProcess parent) {
		my_parent=parent;
		initcomponents();	
	}
	
	private void initcomponents()
	{
		//paste all the initComponent method from Netbeans here
		java.awt.GridBagConstraints gridBagConstraints;

        Editingframe = new javax.swing.JFrame();
        FinishAndSaveEditing = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        EditingResponsibleArchitect = new javax.swing.JTextField();
        EditingResponsibleExpert = new javax.swing.JTextField();
        EditingDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        isValid = new javax.swing.JRadioButton();
        isInvalid = new javax.swing.JRadioButton();
        isRisk = new javax.swing.JRadioButton();
        isClarification = new javax.swing.JRadioButton();
        isTask = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        EditingName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EditingContent = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        EditingRationale = new javax.swing.JTextPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();

        Editingframe.setAlwaysOnTop(true);
        Editingframe.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        Editingframe.setSize(new java.awt.Dimension(770, 430));
        Editingframe.setType(java.awt.Window.Type.POPUP);
        java.awt.GridBagLayout EditingframeLayout = new java.awt.GridBagLayout();
        EditingframeLayout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
        EditingframeLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        Editingframe.getContentPane().setLayout(EditingframeLayout);

        FinishAndSaveEditing.setLabel("Save and quit");
        FinishAndSaveEditing.setName(""); // NOI18N
        FinishAndSaveEditing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishAndSaveEditingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 10.0;
        Editingframe.getContentPane().add(FinishAndSaveEditing, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Content");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Rationale");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Validity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Responsible architect");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Responsible Expert");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel15, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Date of Completion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel16, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(EditingResponsibleArchitect, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(EditingResponsibleExpert, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(EditingDate, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Editing an Assumption");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        Editingframe.getContentPane().add(jLabel17, gridBagConstraints);

        buttonGroup2.add(isValid);
        isValid.setText("Valid");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(isValid, gridBagConstraints);

        buttonGroup2.add(isInvalid);
        isInvalid.setText("Invalid");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(isInvalid, gridBagConstraints);

        buttonGroup1.add(isRisk);
        isRisk.setText("Risk");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(isRisk, gridBagConstraints);

        buttonGroup1.add(isClarification);
        isClarification.setText("Clarification");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(isClarification, gridBagConstraints);

        buttonGroup1.add(isTask);
        isTask.setText("Task");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(isTask, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        Editingframe.getContentPane().add(jLabel18, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Editingframe.getContentPane().add(EditingName, gridBagConstraints);

        jScrollPane1.setViewportView(EditingContent);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 70.0;
        gridBagConstraints.weighty = 30.0;
        Editingframe.getContentPane().add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setViewportView(EditingRationale);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 30.0;
        Editingframe.getContentPane().add(jScrollPane2, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1084, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );

        pack();
	}
	
    private void FinishAndSaveEditingActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	boolean alreadyHere = false; //protection against existing name
		for (Assumption a : listAssumption)
		{
			if (EditingName.getText().equals(a.getName()) && (!(a.equals(edited_assumption)))){alreadyHere = true;}
		}
		
		if (!(alreadyHere))
		{
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(edited_assumption);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
			        @Override
			        protected void doExecute() {
			        	edited_assumption.setName(EditingName.getText());
			        	if (isRisk.isSelected()){edited_assumption.setAssumptionType(assumptionType_Type.RISK);}
			        	else if (isTask.isSelected()){edited_assumption.setAssumptionType(assumptionType_Type.TASK);}
			        	else if (isClarification.isSelected()){edited_assumption.setAssumptionType(assumptionType_Type.CLARIFICATION);}
			        	edited_assumption.setContent(EditingContent.getText());
			        	edited_assumption.setRationale(EditingRationale.getText());
			        	if (isValid.isSelected()) {edited_assumption.setValidity(validity_Type.VALID);}
			        	else if (isInvalid.isSelected()) {edited_assumption.setValidity(validity_Type.INVALID);}
			        	edited_assumption.setResponsibleArchitect(EditingResponsibleArchitect.getText());
			        	edited_assumption.setResponsibleExpert(EditingResponsibleExpert.getText());
			        	edited_assumption.setDateOfCompletion(EditingDate.getText());
			        }
			    });
			
			my_parent.updateDisplayTab0();
			my_parent.updateDisplayTab3();
			Editingframe.setVisible(false);
		}
		else {JOptionPane.showMessageDialog(getParent(), "There is already an assumption named like that, please chose another name.");}
    }
    
    public void editAssumption(Assumption edited_assumption_parameter, EList<Assumption> listAssumption_parameter)
    {
    	edited_assumption = edited_assumption_parameter;
    	listAssumption = listAssumption_parameter;

    	EditingName.setText(edited_assumption.getName());
    	isRisk.setSelected(edited_assumption.getAssumptionType()==assumptionType_Type.RISK);
    	isTask.setSelected(edited_assumption.getAssumptionType()==assumptionType_Type.TASK);
    	isClarification.setSelected(edited_assumption.getAssumptionType()==assumptionType_Type.CLARIFICATION);
    	EditingContent.setText(edited_assumption.getContent());
    	EditingRationale.setText(edited_assumption.getRationale());
    	isValid.setSelected(edited_assumption.getValidity()==validity_Type.VALID);
    	isInvalid.setSelected(edited_assumption.getValidity()==validity_Type.INVALID);
    	EditingResponsibleArchitect.setText(edited_assumption.getResponsibleArchitect());
    	EditingResponsibleExpert.setText(edited_assumption.getResponsibleExpert());
    	EditingDate.setText(edited_assumption.getDateOfCompletion());
    	
    	Editingframe.setVisible(true);
    }
    
    
    private javax.swing.JTextPane EditingContent;
    private javax.swing.JTextField EditingDate;
    private javax.swing.JTextField EditingName;
    private javax.swing.JTextPane EditingRationale;
    private javax.swing.JTextField EditingResponsibleArchitect;
    private javax.swing.JTextField EditingResponsibleExpert;
    private javax.swing.JFrame Editingframe;
    private java.awt.Button FinishAndSaveEditing;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton isClarification;
    private javax.swing.JRadioButton isInvalid;
    private javax.swing.JRadioButton isRisk;
    private javax.swing.JRadioButton isTask;
    private javax.swing.JRadioButton isValid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
}
