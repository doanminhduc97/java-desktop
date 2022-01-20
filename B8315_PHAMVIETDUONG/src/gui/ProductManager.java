/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import databaseAccess.TblManufacturerDA;
import databaseAccess.TblProductDA;
import entities.TblManufacturer;
import entities.TblProduct;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ProductManager extends javax.swing.JFrame {
    TblManufacturerDA manufacturerDA = new TblManufacturerDA();
    TblProductDA productDA = new TblProductDA();
    /**
     * Creates new form ProductManager
     */
    public ProductManager() {
        initComponents();
        showManufacturer();
    }
    private void showManufacturer() {
        DefaultTableModel tblModel = new DefaultTableModel();
        //set label table
        tblModel.addColumn("ProId");
        tblModel.addColumn("ManuName");
        tblModel.addColumn("ProName");
        tblModel.addColumn("YearMaking");
        tblModel.addColumn("ExpireDate");
        tblModel.addColumn("Price");
        // đưa dữ liệu vào combobox
        List<TblManufacturer> dataList = manufacturerDA.getAll();
        for(TblManufacturer manu: dataList) {
            cbManuName.addItem(manu.getManuName());
        }
//        System.out.println(cbManuName.getSelectedIndex());
//        System.out.println(cbManuName.getSelectedIndex());

        // đưa dữ liệu vào table
        
        // set model
        tblProduct.setModel(tblModel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbManuName = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtYearMaking = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExpireDate = new javax.swing.JTextField();
        showProduct = new javax.swing.JButton();
        search = new javax.swing.JButton();
        addNewProduct = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("PRODUCT MANAGER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 10, 130, 20));

        jLabel2.setText("Manufacturer:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 510, 30));

        jLabel3.setText("Product Name: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtProName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtProName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 510, 30));

        jLabel4.setText("Price:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, -1));

        getContentPane().add(cbManuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 510, 30));

        jLabel5.setText("Year Making:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, -1));

        txtYearMaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearMakingActionPerformed(evt);
            }
        });
        getContentPane().add(txtYearMaking, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 510, 30));

        jLabel6.setText("Expire Date:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, -1));

        txtExpireDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpireDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtExpireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 510, 30));

        showProduct.setText("Display all products");
        showProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductActionPerformed(evt);
            }
        });
        getContentPane().add(showProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        search.setText("Find by product name");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        addNewProduct.setText("Add new product");
        addNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(addNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblProduct);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 620, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtProNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProNameActionPerformed

    private void txtYearMakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearMakingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearMakingActionPerformed

    private void txtExpireDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpireDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpireDateActionPerformed

    private void showProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductActionPerformed
        List<TblProduct> dataList = productDA.getAll();
        showTblProduct(dataList);
    }//GEN-LAST:event_showProductActionPerformed
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(txtProName.getText().length() > 0) {
            List<TblProduct> dataList = productDA.search(txtProName.getText());
            showTblProduct(dataList);
        } else {
            List<TblProduct> dataList = productDA.getAll();
            showTblProduct(dataList);
        }
        
        
        
    }//GEN-LAST:event_searchActionPerformed

    private void addNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewProductActionPerformed
        int manuId = cbManuName.getSelectedIndex() + 1;
        int yearMaking = Integer.parseInt(txtYearMaking.getText());
        Date expireDate = Date.valueOf(txtExpireDate.getText());
        float price = Float.parseFloat(txtPrice.getText());
        TblProduct product = new TblProduct(manuId, txtProName.getText(), yearMaking, expireDate, price);
        if(productDA.insert(product)) {
            JOptionPane.showMessageDialog(this, "Them thanh cong!");
        } else {
            JOptionPane.showMessageDialog(this, "Them that bai!");
        }
    }//GEN-LAST:event_addNewProductActionPerformed

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
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewProduct;
    private javax.swing.JComboBox<String> cbManuName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search;
    private javax.swing.JButton showProduct;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtExpireDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProName;
    private javax.swing.JTextField txtYearMaking;
    // End of variables declaration//GEN-END:variables

    private void showTblProduct(List<TblProduct> products) {
        DefaultTableModel tblModel = new DefaultTableModel();
        //set label table
        tblModel.addColumn("ProId");
        tblModel.addColumn("ManuName");
        tblModel.addColumn("ProName");
        tblModel.addColumn("YearMaking");
        tblModel.addColumn("ExpireDate");
        tblModel.addColumn("Price");
        for(TblProduct product: products) {
            Vector row = new Vector();
            row.add(product.getProId());
            row.add(product.getManuName());
            row.add(product.getProName());
            row.add(product.getYearMaking());
            row.add(product.getExpireDate());            
            row.add(product.getPrice());
            tblModel.addRow(row);
        }
            tblProduct.setModel(tblModel);
    }
}