/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Labadmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.LabAdmin.Lab;
import Business.LabAdmin.Test;
import Business.LabAdmin.TestDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apoorva
 */
public class ViewUpdateDeleteTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateDeleteTestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Lab lab;
      private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ViewUpdateDeleteTestJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lowerRangeTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        apparatusTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upperRangeTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        sampleTxtField = new javax.swing.JTextField();
        priceTxtField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TestDetailsTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(24, 31, 46));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        jButton3.setBackground(new java.awt.Color(24, 31, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jLabel5.setText("Lower Range:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));
        add(lowerRangeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 116, -1));

        jLabel6.setText("Apparatus:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));
        add(apparatusTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 116, -1));

        jLabel7.setText("Upper Range:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        upperRangeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperRangeTxtFieldActionPerformed(evt);
            }
        });
        add(upperRangeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 116, -1));

        jLabel3.setText("Price: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        jLabel4.setText("Sample Required:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 116, -1));
        add(sampleTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 116, -1));
        add(priceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 116, -1));

        TestDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Sample Required", "Lower Range", "Upper Range", "Apparatus", "Price"
            }
        ));
        TestDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TestDetailsTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 479, 122));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Test Details");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 180, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/shreyascr/Desktop/AED final/AED_final_project/icons/Humaaans - 2 Characters.png")); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 410, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRow = TestDetailsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            Test t = (Test) TestDetailsTable.getValueAt(selectedRow, 0);
            Lab lab= system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName());
            lab.deleteTest(t);
            JOptionPane.showMessageDialog(null, "Test " + nameTxtField.getText() + " deleted");
            populateTable();
            nameTxtField.setText("");
            priceTxtField.setText("");
            sampleTxtField.setText("");
            lowerRangeTxtField.setText("");
            upperRangeTxtField.setText("");
            apparatusTxtField.setText("");
            priceTxtField.setText("");

        }
         dB4OUtil.storeSystem(system); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void upperRangeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperRangeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperRangeTxtFieldActionPerformed

    private void TestDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestDetailsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) TestDetailsTable.getModel();

        String name = dtm.getValueAt(TestDetailsTable.getSelectedRow(), 0).toString();
        String sample = dtm.getValueAt(TestDetailsTable.getSelectedRow(), 1).toString();
        Double lowerRange = Double.parseDouble(dtm.getValueAt(TestDetailsTable.getSelectedRow(), 2).toString());
        Double upperRange = Double.parseDouble(dtm.getValueAt(TestDetailsTable.getSelectedRow(), 3).toString());
        String apparatus = dtm.getValueAt(TestDetailsTable.getSelectedRow(),4).toString();
        Double price = Double.parseDouble(dtm.getValueAt(TestDetailsTable.getSelectedRow(), 5).toString());
        
        nameTxtField.setText(name);
        sampleTxtField.setText(sample);
        lowerRangeTxtField.setText(String.valueOf(lowerRange));
        upperRangeTxtField.setText(String.valueOf(upperRange));
        apparatusTxtField.setText(apparatus);
        priceTxtField.setText(String.valueOf(price));
        
    }//GEN-LAST:event_TestDetailsTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = TestDetailsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            if (!nameTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper Test name");
                nameTxtField.setText("");
                return;
            } else if (!sampleTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper sample required");
                priceTxtField.setText("");
                return;
            }    else if (!lowerRangeTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter lower range like 4.3");
                lowerRangeTxtField.setText("");
                return;
            } else if (!upperRangeTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter upper range like 7.3");
                upperRangeTxtField.setText("");
                return;
            } else if (Double.parseDouble(upperRangeTxtField.getText())-Double.parseDouble(lowerRangeTxtField.getText())<0) {
                JOptionPane.showMessageDialog(this, "Upper range cannot be lesser than lower range value");
                upperRangeTxtField.setText("");
                return;
            }else if (!apparatusTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper apparatus required");
                apparatusTxtField.setText("");
                return;
            }else if (!priceTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter price like :23.5");
                priceTxtField.setText("");
                return;
            }else{}
//            updateJPanel.setVisible(true);
            System.out.println("I am here");

            Test t = (Test) TestDetailsTable.getValueAt(selectedRow, 0);
            System.out.println("item : " + t.getName());
            t.setName(nameTxtField.getText());
            t.setSample(sampleTxtField.getText());
            t.setLowerRange(Double.parseDouble(lowerRangeTxtField.getText()));
            t.setUpperRange(Double.parseDouble(upperRangeTxtField.getText()));
            t.setApparatus(apparatusTxtField.getText());
            t.setPrice(Double.parseDouble(priceTxtField.getText()));
            populateTable();
            nameTxtField.setText("");
            priceTxtField.setText("");
            sampleTxtField.setText("");
            lowerRangeTxtField.setText("");
            upperRangeTxtField.setText("");
            apparatusTxtField.setText("");
            priceTxtField.setText("");
        }
         dB4OUtil.storeSystem(system);  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TestDetailsTable;
    private javax.swing.JTextField apparatusTxtField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lowerRangeTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JTextField sampleTxtField;
    private javax.swing.JTextField upperRangeTxtField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) TestDetailsTable.getModel();
        model.setRowCount(0);

        

       Lab lab= system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName());
                

            for(Test t1: lab.getTestlist().getTestList()){
            Object[] row = new Object[6];
            row[0] = t1;
            row[1] = t1.getSample();
            row[2] = t1.getLowerRange();
            row[3] = t1.getUpperRange();
            row[4] = t1.getApparatus();
            row[5] = t1.getPrice();
            model.addRow(row);
               }
        }
    
}
