package org.polarsys.capella.vp.atrium.design.service.tools;

import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;
import org.polarsys.capella.vp.atrium.Atrium.validity_Type;

public class EditingPanel extends javax.swing.JFrame {

	AtriumProcess my_parent = null;
	
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
        // TODO add your handling code here:
    }
    
    public void editing()
    {
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
