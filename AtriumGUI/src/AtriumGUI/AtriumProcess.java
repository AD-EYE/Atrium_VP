/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtriumGUI;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author adeye
 */
public class AtriumProcess extends javax.swing.JFrame {

    /**
     * Creates new form AtriumProcess
     */
    public AtriumProcess() {
        initComponents();
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | AtriumProcess.MAXIMIZED_BOTH);
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUnlinkedAssumptions = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListLinkedAssumptions = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonAddLinked = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonRemoveLinked = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCFA = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxDG = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListUnlinkedDA = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListLinkedDA = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jButtonAddLinkedDA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonRemoveLinkedDA = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDG2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jListUnlinkedSDG = new javax.swing.JList<>();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jListLinkedSDG = new javax.swing.JList<>();
        jLabel39 = new javax.swing.JLabel();
        jButtonAddLinkedSDG = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jButtonRemoveLinkedSDG = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListDG = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListDA = new javax.swing.JList<>();
        jButtonAddDG = new javax.swing.JButton();
        jButtonAddDA = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListCFA = new javax.swing.JList<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jListSDG = new javax.swing.JList<>();
        jButtonAddSDG = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jButtonRemoveDG = new javax.swing.JButton();
        jButtonRemoveDA = new javax.swing.JButton();
        jButtonRemoveSDG = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListAssumption = new javax.swing.JList<>();
        jButtonAddAssumption = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jListODD = new javax.swing.JList<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        jListFR = new javax.swing.JList<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButtonAddODD = new javax.swing.JButton();
        jButtonAddFR = new javax.swing.JButton();
        jButtonRemoveAssumption = new javax.swing.JButton();
        jButtonRemoveODD = new javax.swing.JButton();
        jButtonRemoveFR = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButtonAddFailure = new javax.swing.JButton();
        jButtonRemoveFM = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListFailure = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListCapella = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1600, 1000));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 20, 0, 20, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 1000));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel1.setLayout(jPanel1Layout);

        jScrollPane1.setViewportView(jListUnlinkedAssumptions);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 0.2;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setViewportView(jListLinkedAssumptions);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 0.2;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jLabel1.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jButtonAddLinked.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jButtonAddLinked, gridBagConstraints);

        jLabel2.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jButtonRemoveLinked.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 5.0;
        jPanel1.add(jButtonRemoveLinked, gridBagConstraints);

        jLabel3.setText("Unlinked Assumptions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Linked Assumptions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jComboBoxCFA, gridBagConstraints);

        jLabel19.setText("CFA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jLabel19, gridBagConstraints);

        jLabel20.setText("linked to :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel20, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jComboBoxDG, gridBagConstraints);

        jLabel21.setText("Design Goal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel1.add(jLabel21, gridBagConstraints);

        jTabbedPane.addTab("Linking DG and Assumptions to CFA", jPanel1);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel2Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel2.setLayout(jPanel2Layout);

        jScrollPane3.setViewportView(jListUnlinkedDA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane3, gridBagConstraints);

        jScrollPane4.setViewportView(jListLinkedDA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane4, gridBagConstraints);

        jLabel5.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 10.0;
        jPanel2.add(jLabel5, gridBagConstraints);

        jButtonAddLinkedDA.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 10.0;
        jPanel2.add(jButtonAddLinkedDA, gridBagConstraints);

        jLabel6.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        jPanel2.add(jLabel6, gridBagConstraints);

        jButtonRemoveLinkedDA.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 10.0;
        jPanel2.add(jButtonRemoveLinkedDA, gridBagConstraints);

        jLabel7.setText("Design Goal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel2.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jComboBoxDG2, gridBagConstraints);

        jLabel9.setText("Unlinked Design Alternative");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel2.add(jLabel9, gridBagConstraints);

        jLabel23.setText("Linked Design Alternative");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jLabel23, gridBagConstraints);

        jScrollPane14.setViewportView(jListUnlinkedSDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane14, gridBagConstraints);

        jLabel37.setText("Unlinked Sub-Design Goal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel2.add(jLabel37, gridBagConstraints);

        jScrollPane15.setViewportView(jListLinkedSDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane15, gridBagConstraints);

        jLabel39.setText("Add to linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 10.0;
        jPanel2.add(jLabel39, gridBagConstraints);

        jButtonAddLinkedSDG.setText("=>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel2.add(jButtonAddLinkedSDG, gridBagConstraints);

        jLabel40.setText("Remove from linked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        jPanel2.add(jLabel40, gridBagConstraints);

        jButtonRemoveLinkedSDG.setText("<=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 20.0;
        jPanel2.add(jButtonRemoveLinkedSDG, gridBagConstraints);

        jTabbedPane.addTab("Linking DG and DA", jPanel2);

        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel3Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel3.setLayout(jPanel3Layout);

        jScrollPane8.setViewportView(jListDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane8, gridBagConstraints);

        jScrollPane6.setViewportView(jListDA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane6, gridBagConstraints);

        jButtonAddDG.setText("Add DG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonAddDG, gridBagConstraints);

        jButtonAddDA.setText("Add DA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonAddDA, gridBagConstraints);

        jScrollPane9.setViewportView(jListCFA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane9, gridBagConstraints);

        jLabel25.setText("CFA list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel25, gridBagConstraints);

        jLabel26.setText("Restart this UI to create CFA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jLabel26, gridBagConstraints);

        jLabel27.setText("Design Goal List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel27, gridBagConstraints);

        jLabel29.setText("Design Alternative List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel29, gridBagConstraints);

        jScrollPane13.setViewportView(jListSDG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane13, gridBagConstraints);

        jButtonAddSDG.setText("Add sDG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel3.add(jButtonAddSDG, gridBagConstraints);

        jLabel36.setText("Sub-Design Goal list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel3.add(jLabel36, gridBagConstraints);

        jButtonRemoveDG.setText("Remove DG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonRemoveDG, gridBagConstraints);

        jButtonRemoveDA.setText("Delete DA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(jButtonRemoveDA, gridBagConstraints);

        jButtonRemoveSDG.setText("Remove sDG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel3.add(jButtonRemoveSDG, gridBagConstraints);

        jTabbedPane.addTab("Edit DG, sDG, DA, CFA", jPanel3);

        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
        jPanel5Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel5.setLayout(jPanel5Layout);

        jScrollPane7.setViewportView(jListAssumption);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane7, gridBagConstraints);

        jButtonAddAssumption.setText("Add Assumption");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 16.0;
        jPanel5.add(jButtonAddAssumption, gridBagConstraints);

        jLabel8.setText("Assumption list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel8, gridBagConstraints);

        jScrollPane11.setViewportView(jListODD);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane11, gridBagConstraints);

        jScrollPane12.setViewportView(jListFR);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane12, gridBagConstraints);

        jLabel32.setText("Operational Design Domain");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel32, gridBagConstraints);

        jLabel33.setText("Functional Requirements");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel33, gridBagConstraints);

        jButtonAddODD.setText("Add ODD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 16.0;
        jPanel5.add(jButtonAddODD, gridBagConstraints);

        jButtonAddFR.setText("Add FR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel5.add(jButtonAddFR, gridBagConstraints);

        jButtonRemoveAssumption.setText("Remove Assumption");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 16.0;
        jPanel5.add(jButtonRemoveAssumption, gridBagConstraints);

        jButtonRemoveODD.setText("Remove ODD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 16.0;
        jPanel5.add(jButtonRemoveODD, gridBagConstraints);

        jButtonRemoveFR.setText("Remove FR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel5.add(jButtonRemoveFR, gridBagConstraints);

        jLabel31.setText("Capella element");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel31, gridBagConstraints);

        jLabel30.setText("Restart the UI to process new element");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel5.add(jLabel30, gridBagConstraints);

        jButtonAddFailure.setText("Add Failure Mode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 16.0;
        jPanel5.add(jButtonAddFailure, gridBagConstraints);

        jButtonRemoveFM.setText("Remove Failure Mode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 16.0;
        jPanel5.add(jButtonRemoveFM, gridBagConstraints);

        jLabel24.setText("Failure list");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel5.add(jLabel24, gridBagConstraints);

        jScrollPane10.setViewportView(jListFailure);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(jScrollPane10, gridBagConstraints);

        jScrollPane5.setViewportView(jListCapella);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(jScrollPane5, gridBagConstraints);

        jTabbedPane.addTab("Edit Assumption, ODD, FR", jPanel5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        getContentPane().add(jTabbedPane, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("ATRIUM process");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel22, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AtriumProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtriumProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtriumProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtriumProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtriumProcess().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButtonRemoveAssumption;
    private javax.swing.JButton jButtonRemoveDA;
    private javax.swing.JButton jButtonRemoveDG;
    private javax.swing.JButton jButtonRemoveFM;
    private javax.swing.JButton jButtonRemoveFR;
    private javax.swing.JButton jButtonRemoveLinked;
    private javax.swing.JButton jButtonRemoveLinkedDA;
    private javax.swing.JButton jButtonRemoveLinkedSDG;
    private javax.swing.JButton jButtonRemoveODD;
    private javax.swing.JButton jButtonRemoveSDG;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
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
    // End of variables declaration//GEN-END:variables
}
