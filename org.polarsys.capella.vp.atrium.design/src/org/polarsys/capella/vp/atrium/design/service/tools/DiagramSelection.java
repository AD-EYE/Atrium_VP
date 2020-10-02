//Manually-edited
package org.polarsys.capella.vp.atrium.design.service.tools;

import javax.swing.DefaultListModel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;


@SuppressWarnings("serial")
public class DiagramSelection extends javax.swing.JFrame{
	
	EObject element = null;
	
    public DiagramSelection(EObject element_p) {
    	element=element_p;
    	
    	Session session = SessionManager.INSTANCE.getSession(element);
    	DefaultListModel<String> nameDiagrams = new DefaultListModel<String>();
    	
		for (DRepresentationDescriptor descriptor :  DialectManager.INSTANCE.getAllRepresentationDescriptors(session))
		{
			   DDiagram diagram = (DDiagram)descriptor.getRepresentation();
			   nameDiagrams.addElement(diagram.getName());
		}
		
        initComponents(nameDiagrams);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents(DefaultListModel<String> nameDiagrams) {
        java.awt.GridBagConstraints gridBagConstraints;
        
        setAlwaysOnTop(true);
        setType(java.awt.Window.Type.POPUP);

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDiagram = new javax.swing.JList();
        proceedButton = new javax.swing.JButton();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 21, 0, 21, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select the desired diagrams");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.weighty = 10.0;
        getContentPane().add(jLabel1, gridBagConstraints);

        listDiagram.setModel(nameDiagrams);
        jScrollPane1.setViewportView(listDiagram);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.weighty = 50.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        proceedButton.setText("Proceed");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.weighty = 10.0;
        getContentPane().add(proceedButton, gridBagConstraints);

        pack();
    }// </editor-fold>                        

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
       java.util.List<String> selectedList = listDiagram.getSelectedValuesList();
       this.setVisible(false);
       new AtriumProcess(element,selectedList,"");
    }                                             

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listDiagram;
    private javax.swing.JButton proceedButton;
    // End of variables declaration                   
}
