/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise;
import Business.SupplierAdmin.Inventory;
import Business.SupplierAdmin.InventoryDirectory;
import Business.SupplierAdmin.Supplier;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderInventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apoorva
 */
public class OrderNewInventoryItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderNewInventoryItemJPanel
     */
        JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    String supplierName;
    ArrayList<Inventory> order;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public OrderNewInventoryItemJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system ) {
        initComponents();
                this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.system=system;
        order = new ArrayList<>();
        populateLogComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        QuantityJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentsTxtArea = new javax.swing.JTextArea();
        QuantityJTxtField = new javax.swing.JTextField();
        SupplierJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryOrderJTable = new javax.swing.JTable();
        TotalJLabel = new javax.swing.JLabel();
        TotalJTxtField = new javax.swing.JTextField();
        NewOrderJLabel = new javax.swing.JLabel();
        ConfirmJButton = new javax.swing.JButton();
        RestaurantJLabel = new javax.swing.JLabel();
        DeleteJButton = new javax.swing.JButton();
        MenuItemJLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        InventoryItemJComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Additional Comments:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 83, -1, -1));

        QuantityJLabel.setText("Quantity");
        add(QuantityJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 174, -1, -1));

        CommentsTxtArea.setColumns(20);
        CommentsTxtArea.setRows(5);
        jScrollPane2.setViewportView(CommentsTxtArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 79, -1, -1));
        add(QuantityJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 169, 138, -1));

        SupplierJComboBox.setBackground(new java.awt.Color(255, 255, 255));
        SupplierJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierJComboBoxActionPerformed(evt);
            }
        });
        add(SupplierJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 79, 138, -1));

        InventoryOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Item Name", "Manufacturer", "Pricer per unit", "Quantity"
            }
        ));
        InventoryOrderJTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                InventoryOrderJTableComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(InventoryOrderJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 100));

        TotalJLabel.setText("Total:");
        add(TotalJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        TotalJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalJTxtFieldActionPerformed(evt);
            }
        });
        add(TotalJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 130, -1));

        NewOrderJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewOrderJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderJLabel.setText("Hospital Order Dashboard");
        add(NewOrderJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 560, 23));

        ConfirmJButton.setBackground(new java.awt.Color(24, 31, 46));
        ConfirmJButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmJButton.setText("Confim");
        ConfirmJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        ConfirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmJButtonActionPerformed(evt);
            }
        });
        add(ConfirmJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        RestaurantJLabel.setText("Logistics Company");
        add(RestaurantJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 83, -1, -1));

        DeleteJButton.setBackground(new java.awt.Color(24, 31, 46));
        DeleteJButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteJButton.setText("Delete");
        DeleteJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        DeleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteJButtonActionPerformed(evt);
            }
        });
        add(DeleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        MenuItemJLabel.setText("Inventory Item");
        add(MenuItemJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 128, -1, -1));

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 229, -1, -1));

        InventoryItemJComboBox.setBackground(new java.awt.Color(255, 255, 255));
        InventoryItemJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryItemJComboBoxActionPerformed(evt);
            }
        });
        add(InventoryItemJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 124, 138, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/shreyascr/Desktop/AED final/AED_final_project/icons/Humaaans - 2 Characters.png")); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 380, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierJComboBoxActionPerformed
        // TODO add your handling code here:
       
        InventoryItemJComboBox.removeAllItems();
         supplierName = String.valueOf(SupplierJComboBox.getSelectedItem());
        System.out.println("supplier" +supplierName);
        populateInventoryItems(supplierName);
        
    }//GEN-LAST:event_SupplierJComboBoxActionPerformed

    private void InventoryOrderJTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_InventoryOrderJTableComponentAdded
        // TODO add your handling code here:
        TotalJTxtField.setText(getTotal());
    }//GEN-LAST:event_InventoryOrderJTableComponentAdded

    private void TotalJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalJTxtFieldActionPerformed

    private void ConfirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmJButtonActionPerformed
        // TODO add your handling code here:
        String supplierName = String.valueOf(SupplierJComboBox.getSelectedItem());
        Supplier sup = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName);       
        int rowCount = InventoryOrderJTable.getRowCount();
        for (int i = 0; i < rowCount; i++) {
        Inventory inv = (Inventory) InventoryOrderJTable.getValueAt(i, 0);
//        sup.getInventoryDirectory().addInventory(inv);
        }

        Boolean flag = true;
        if (sup.getInventoryDirectory().getInventoryList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no items chosen!");
            flag = false;
        } else {
            
            OrderInventoryWorkRequest orderInventoryWorkRequest = new OrderInventoryWorkRequest();
            orderInventoryWorkRequest.setInventoryList(sup.getInventoryDirectory().getInventoryList());
            System.out.println("list of items "+sup.getInventoryDirectory().getInventoryList());
            orderInventoryWorkRequest.setSender(this.userAccount);
            int selectedValue = SupplierJComboBox.getSelectedIndex();
//           System.out.println(lab.getName());
//           System.out.println(lab.getClass());
 //
            orderInventoryWorkRequest.setReceiver(system.getUserAccountDirectory().findUserAccount(supplierName));
            orderInventoryWorkRequest.setMessage(CommentsTxtArea.getText());
            orderInventoryWorkRequest.setRequestDate(new Date());
            orderInventoryWorkRequest.setStatus("Item ordered");
            system.getWorkQueue().addWorkRequest(orderInventoryWorkRequest);
            
        }

       if (flag) {
            JOptionPane.showMessageDialog(null, "inventory item order placed");
            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
            System.out.println("prev");
            List<WorkRequest> r = this.userAccount.getWorkQueue().getWorkRequestList();
            
            ViewInventoryOrderJPanel cust = new ViewInventoryOrderJPanel(userProcessContainer, userAccount, system);
            userProcessContainer.add("CustomerAreaJPanel", cust);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_ConfirmJButtonActionPerformed

    private void DeleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = InventoryOrderJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            DefaultTableModel dtm = (DefaultTableModel) InventoryOrderJTable.getModel();
            dtm.removeRow(InventoryOrderJTable.getSelectedRow());
            TotalJTxtField.setText(getTotal());
            QuantityJTxtField.setText("");
            //            populateTable();
        }
    }//GEN-LAST:event_DeleteJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("list of items "+system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().getInventoryList());
        int selectedValue = InventoryItemJComboBox.getSelectedIndex();
        String name = InventoryItemJComboBox.getItemAt(selectedValue);
        Inventory i1 = new Inventory();
        i1.setAvailability(Integer.parseInt(QuantityJTxtField.getText()));
        i1.setName(name);
        i1.setManufacturer(system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().findInventory(name).getManufacturer());
        i1.setPrice(system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().findInventory(name).getPrice());
        order.add(i1);
        populateTable();
        TotalJTxtField.setText(getTotal());
        int rowCount = InventoryOrderJTable.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            int quantity = Integer.parseInt(InventoryOrderJTable.getValueAt(i, 2).toString());
            Inventory item = (Inventory) InventoryOrderJTable.getValueAt(i, 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InventoryItemJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryItemJComboBoxActionPerformed
        // TODO add your handling code here:
        //        int index = MenuItemJComboBox.getSelectedIndex();
        //clear of the selected items
        
        int selectedValue = InventoryItemJComboBox.getSelectedIndex();
        String name = InventoryItemJComboBox.getItemAt(selectedValue);
       
        
    }//GEN-LAST:event_InventoryItemJComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentsTxtArea;
    private javax.swing.JButton ConfirmJButton;
    private javax.swing.JButton DeleteJButton;
    private javax.swing.JComboBox<String> InventoryItemJComboBox;
    private javax.swing.JTable InventoryOrderJTable;
    private javax.swing.JLabel MenuItemJLabel;
    private javax.swing.JLabel NewOrderJLabel;
    private javax.swing.JLabel QuantityJLabel;
    private javax.swing.JTextField QuantityJTxtField;
    private javax.swing.JLabel RestaurantJLabel;
    private javax.swing.JComboBox<String> SupplierJComboBox;
    private javax.swing.JLabel TotalJLabel;
    private javax.swing.JTextField TotalJTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void populateLogComboBox() {
      for(Enterprise res: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Supplier")){
                            SupplierJComboBox.addItem(res.getName());
         
        }
        }
    }

    private void populateInventoryItems(String name2) {
       int si = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getOrganizationList().size();
        int si1 = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().getSupplierDirectory().size();
        System.out.println(si);
        System.out.println(si1);
                 for(Inventory i: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().getInventoryList()){
                     
                   
                 InventoryItemJComboBox.addItem(i.getName());
                 }

    }

    private void populateTable() {
         //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm = (DefaultTableModel) InventoryOrderJTable.getModel();
//        dtm.setRowCount(0);
        int selectedValue = SupplierJComboBox.getSelectedIndex();
        String name = SupplierJComboBox.getItemAt(selectedValue);
        Supplier sup =system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getSupplierDirectory().findSupplier(name);


        for (Inventory i : order) {
          
                Object[] row = new Object[4];
                row[0] = i;
                row[1] = i.getManufacturer();
                row[2] = i.getPrice();
                row[3] = i.getAvailability();
                dtm.addRow(row);
            
    }
    }

    private String getTotal() {
        int rowCount = InventoryOrderJTable.getRowCount();
        Double total = 0.0;
        for (int i = 0; i < rowCount; i++) {
            total = total + ((Double.parseDouble(InventoryOrderJTable.getValueAt(i, 2).toString())) * (Integer.parseInt(InventoryOrderJTable.getValueAt(i, 3).toString())));
        }
        System.out.println(total);
        return total.toString();

    
    }
}