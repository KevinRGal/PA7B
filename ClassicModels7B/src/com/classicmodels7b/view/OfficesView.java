/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.view;

import com.classicmodels7b.controller.OfficesController;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class OfficesView extends javax.swing.JFrame {

    /**
     * Creates new form OfficesView
     */
    OfficesController officesController = new OfficesController();
    public OfficesView() {
        initComponents();
        officesController.readOffices(JTableOffices);
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
        lblOfficeCode = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblAddressLine1 = new javax.swing.JLabel();
        lblPostalCode = new javax.swing.JLabel();
        lblAddressLine2 = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        txtOfficeCode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddressLine1 = new javax.swing.JTextField();
        txtPostalCode = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtAddressLine2 = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTerritory = new javax.swing.JLabel();
        txtTerritory = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableOffices = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        jLabel1.setText("OFFICES");

        lblOfficeCode.setText("Offices Code:");

        lblCity.setText("City:");

        lblPhone.setText("Phone:");

        lblAddressLine1.setText("Address Line 1:");

        lblPostalCode.setText("Postal Code");

        lblAddressLine2.setText("Address Line 2:");

        lblState.setText("State:");

        lblCountry.setText("Country:");

        txtOfficeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfficeCodeActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtAddressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressLine1ActionPerformed(evt);
            }
        });

        txtPostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostalCodeActionPerformed(evt);
            }
        });

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTerritory.setText("Territory:");

        txtTerritory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerritoryActionPerformed(evt);
            }
        });

        JTableOffices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTableOffices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableOfficesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableOffices);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOfficeCode)
                            .addComponent(lblCity)
                            .addComponent(lblPhone)
                            .addComponent(lblAddressLine1)
                            .addComponent(lblAddressLine2)
                            .addComponent(lblState)
                            .addComponent(lblCountry)
                            .addComponent(lblPostalCode)
                            .addComponent(lblTerritory))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtOfficeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddressLine1)
                            .addComponent(txtAddressLine2)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTerritory, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOfficeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOfficeCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAddressLine1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddressLine2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblState)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostalCode)
                    .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTerritory)
                    .addComponent(txtTerritory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAddressLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine1ActionPerformed

    private void txtPostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostalCodeActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtOfficeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfficeCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOfficeCodeActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String officeCode = txtOfficeCode.getText();
        String city = txtCity.getText();
        String phone = txtPhone.getText();
        String addressLine1 = txtAddressLine1.getText();
        String addressLine2 = txtAddressLine2.getText();
        String state = txtState.getText();
        String contry = txtCountry.getText();
        String postalCode = txtPostalCode.getText();
        String territory = txtTerritory.getText();
        
        if (txtOfficeCode.getText().isEmpty() || txtCity.getText().isEmpty() || txtPhone.getText().isEmpty() || txtAddressLine1.getText().isEmpty() || txtState.getText().isEmpty() || txtCountry.getText().isEmpty() || txtPostalCode.getText().isEmpty() || txtTerritory.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verify the data is complete"); 
               System.exit(0);
} 
        String serverAnswer = officesController.createOffice(officeCode, city, phone, addressLine1, addressLine2, state, contry, postalCode, territory);
        JOptionPane.showMessageDialog(null, serverAnswer);
        officesController.readOffices(JTableOffices);

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtTerritoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerritoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerritoryActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        officesController.deleteOffice(txtOfficeCode.getText());
        officesController.readOffices(JTableOffices);
        this.cleareFields();
        
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        officesController.readOffices(JTableOffices);
    }//GEN-LAST:event_btnReadActionPerformed

    private void JTableOfficesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableOfficesMouseClicked
        // TODO add your handling code here:
        int rowSelected;
        rowSelected = JTableOffices.getSelectedRow();
       

          
             txtOfficeCode.setText(JTableOffices.getValueAt(rowSelected, 0).toString());
             txtCity.setText(JTableOffices.getValueAt(rowSelected, 1).toString());
             txtPhone.setText(JTableOffices.getValueAt(rowSelected, 2).toString());
             txtAddressLine1.setText(JTableOffices.getValueAt(rowSelected, 3).toString());
             txtAddressLine2.setText(JTableOffices.getValueAt(rowSelected, 4).toString());
             txtState.setText(JTableOffices.getValueAt(rowSelected, 5).toString());
             txtCountry.setText(JTableOffices.getValueAt(rowSelected, 6).toString());
             txtPostalCode.setText(JTableOffices.getValueAt(rowSelected, 7).toString());
             txtTerritory.setText(JTableOffices.getValueAt(rowSelected, 8).toString());


    }//GEN-LAST:event_JTableOfficesMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String officeCode = txtOfficeCode.getText();
        String city = txtCity.getText();
        String phone = txtPhone.getText();
        String addressLine1 = txtAddressLine1.getText();
        String addressLine2 = txtAddressLine2.getText();
        String state = txtState.getText();
        String contry = txtCountry.getText();
        String postalCode = txtPostalCode.getText();
        String territory = txtTerritory.getText();
        
        String serverAnswer = officesController.updateOffice(city, phone, addressLine1, addressLine2, state, contry, postalCode, territory, officeCode);
        JOptionPane.showMessageDialog(null, serverAnswer);
        officesController.readOffices(JTableOffices);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(OfficesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficesView().setVisible(true);
            }
        });
    }
private void cleareFields () {
    txtOfficeCode.setText("");
    txtCity.setText("");
    txtPhone.setText("");
    txtAddressLine1.setText("");
    txtAddressLine2.setText("");
    txtState.setText("");
    txtCountry.setText("");
    txtPostalCode.setText("");
    txtTerritory.setText("");
    
    
    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableOffices;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblOfficeCode;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPostalCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTerritory;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtOfficeCode;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTerritory;
    // End of variables declaration//GEN-END:variables

    private void PreparedStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}