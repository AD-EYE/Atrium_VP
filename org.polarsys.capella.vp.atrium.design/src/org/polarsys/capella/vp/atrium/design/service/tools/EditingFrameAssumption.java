package org.polarsys.capella.vp.atrium.design.service.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;
import org.polarsys.capella.vp.atrium.Atrium.validity_Type;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

public class EditingFrameAssumption extends javax.swing.JFrame {
	
	Assumption edited_assumption = null;
	AtriumProcess my_parent = null;
	
	public EditingFrameAssumption(AtriumProcess parent) {
		my_parent=parent;
		initcomponents();	
	}
	
	private void initcomponents()
	{
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
	    EditingContent = new javax.swing.JTextField();
	    EditingRationale = new javax.swing.JTextField();
	    EditingDate = new javax.swing.JTextField();
	    jLabel17 = new javax.swing.JLabel();
	    isValid = new javax.swing.JRadioButton();
	    isInvalid = new javax.swing.JRadioButton();
	    isRisk = new javax.swing.JRadioButton();
	    isClarification = new javax.swing.JRadioButton();
	    isTask = new javax.swing.JRadioButton();
	    jLabel18 = new javax.swing.JLabel();
	    EditingName = new javax.swing.JTextField();
	    buttonGroup1 = new javax.swing.ButtonGroup();
	    buttonGroup2 = new javax.swing.ButtonGroup();
	    
	    
	    Editingframe.setAlwaysOnTop(true);
	    Editingframe.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
	    Editingframe.setSize(new java.awt.Dimension(770, 430));
	    Editingframe.setType(java.awt.Window.Type.POPUP);
	    
	    FinishAndSaveEditing.setLabel("Save and quit");
        FinishAndSaveEditing.setName(""); // NOI18N
        FinishAndSaveEditing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishAndSaveEditingActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Content");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Rationale");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Validity");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Type");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Responsible architect");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Responsible Expert");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Date of Completion");
        
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Editing an Assumption");

        buttonGroup2.add(isValid);
        isValid.setText("Valid");

        buttonGroup2.add(isInvalid);
        isInvalid.setText("Invalid");

        buttonGroup1.add(isRisk);
        isRisk.setText("Risk");

        buttonGroup1.add(isClarification);
        isClarification.setText("Clarification");

        buttonGroup1.add(isTask);
        isTask.setText("Task");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Name");
        
        javax.swing.GroupLayout EditingframeLayout = new javax.swing.GroupLayout(Editingframe.getContentPane());
        Editingframe.getContentPane().setLayout(EditingframeLayout);
        EditingframeLayout.setHorizontalGroup(
            EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditingframeLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EditingframeLayout.createSequentialGroup()
                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditingframeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditingframeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(FinishAndSaveEditing, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EditingframeLayout.createSequentialGroup()
                                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditingDate)
                                    .addComponent(EditingResponsibleExpert)
                                    .addComponent(EditingResponsibleArchitect, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EditingRationale)
                                    .addComponent(EditingContent)))
                            .addGroup(EditingframeLayout.createSequentialGroup()
                                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EditingframeLayout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(isValid)
                                        .addGap(18, 18, 18)
                                        .addComponent(isInvalid))
                                    .addGroup(EditingframeLayout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addComponent(isClarification)
                                        .addGap(18, 18, 18)
                                        .addComponent(isTask)
                                        .addGap(18, 18, 18)
                                        .addComponent(isRisk)))
                                .addGap(0, 342, Short.MAX_VALUE))))
                    .addGroup(EditingframeLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(EditingName)))
                .addContainerGap())
        );
        EditingframeLayout.setVerticalGroup(
            EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditingframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(isRisk)
                    .addComponent(isClarification)
                    .addComponent(isTask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EditingframeLayout.createSequentialGroup()
                        .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(EditingContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditingRationale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(isValid)
                    .addComponent(isInvalid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditingResponsibleExpert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGroup(EditingframeLayout.createSequentialGroup()
                        .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(EditingResponsibleArchitect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGap(18, 18, 18)
                .addGroup(EditingframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(EditingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(FinishAndSaveEditing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
	}
	
    private void FinishAndSaveEditingActionPerformed(java.awt.event.ActionEvent evt) {
    	
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
		
		my_parent.updateDisplayCFA();
		Editingframe.setVisible(false);
    }
    
    public void editAssumption(Assumption edited_assumption_parameter)
    {
    	edited_assumption = edited_assumption_parameter;

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
    
    
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
 	private javax.swing.JTextField EditingContent;
    private javax.swing.JTextField EditingDate;
    private javax.swing.JTextField EditingName;
    private javax.swing.JTextField EditingRationale;
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
}
