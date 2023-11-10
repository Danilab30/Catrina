/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.catrina.ui;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import mx.itson.catrina.entities.Account;
import mx.itson.catrina.entities.Transactions;
import mx.itson.catrina.enums.TypeTransactions;
import static mx.itson.catrina.enums.TypeTransactions.Ingresos;

/**
 *
 * @author dani_
 */
public class FormAccount extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public FormAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFile = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblRfc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransactions = new javax.swing.JTable();
        lblCiudad = new javax.swing.JLabel();
        lblAccountState = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        lblClabe = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblDepositos = new javax.swing.JLabel();
        lblRetiros = new javax.swing.JLabel();
        lblFinalBalance = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFile.setText("File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        lblName.setText("Nombre: ");

        lblRfc.setText("RFC: ");

        tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DATE", "DESCRIPTION", "DEPOSITS", "WITHDRAWALS", "SUBTOTAL"
            }
        ));
        tblTransactions.setEnabled(false);
        tblTransactions.setShowGrid(true);
        jScrollPane1.setViewportView(tblTransactions);

        lblCiudad.setText("Ciudad: ");

        lblAccountState.setText("Account Statement");

        lblAccount.setText("Account: ");

        lblClabe.setText("CLABE: ");

        lblCurrency.setText("CURRENCY: ");

        lblDireccion.setText("Direccion: ");

        lblDepositos.setText("Depositos: ");

        lblRetiros.setText("Retiros: ");

        lblFinalBalance.setText("Balance Final: ");

        lblFinal.setText("Final Balance: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFinal)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblRfc)
                            .addComponent(lblDireccion)
                            .addComponent(lblCiudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClabe)
                            .addComponent(lblAccount)
                            .addComponent(lblAccountState)
                            .addComponent(lblCurrency))
                        .addGap(191, 191, 191))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRetiros)
                            .addComponent(btnFile)
                            .addComponent(lblDepositos)
                            .addComponent(lblFinalBalance))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnFile)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRfc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCiudad)
                        .addGap(24, 24, 24)
                        .addComponent(lblDepositos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFinalBalance))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAccountState)
                        .addGap(9, 9, 9)
                        .addComponent(lblAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblClabe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCurrency)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinal)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

                File file = fileChooser.getSelectedFile();
                byte fileBytes[] = Files.readAllBytes(file.toPath());

                String content = new String(fileBytes, StandardCharsets.UTF_8);
                Account account = new Account().deserialize(content);

                lblName.setText("Nombre: " + account.getCustomer().getName());
                lblRfc.setText("RFC: " + account.getCustomer().getRfc());
                lblDireccion.setText("Direccion: " + account.getCustomer().getAddress());
                lblCiudad.setText("Ciudad: " + account.getCustomer().getCity());
                lblAccount.setText("Cuenta: " + account.getAccount());
                lblClabe.setText("CLABE: " + account.getClabe());
                lblCurrency.setText("Currency: " + account.getCurrency());
                double numRetiros = 0;
                double numDepositos = 0;
                Transactions transactions = new Transactions().deserialize(content);

                if (account != null) {
                    DefaultTableModel model = (DefaultTableModel) tblTransactions.getModel();
                    model.setRowCount(0);
                    for (Transactions a : account.getTransactions()) {
                        model.addRow(new Object[]{
                            a.getDescription(),
                            a.getDate(),
                            a.getAmount()

                        });
                        DefaultTableModel table = (DefaultTableModel) tblTransactions.getModel();

                        double subTotal = 0;

                        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                        account.getTransactions().sort((m1, m2) -> m1.getDate().compareTo(m2.getDate()));

                        Locale local = new Locale("es", "MX");
                        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(local);

                        for (Transactions transaction : account.getTransactions()) {

                            // Evalúa si es tipo ingreso y suma al subtotal
                            if (transaction.getType() == TypeTransactions.Ingresos) {
                                subTotal += transaction.getAmount();
                                numDepositos += transaction.getAmount();
                                // Agrega una nueva fila con la información proporcionada
                                table.addRow(new Object[]{
                                    transaction.getDescription(), date.format(transaction.getDate()), "",
                                    numberFormat.format(transaction.getAmount()), numberFormat.format(subTotal)
                                });

                            } else if (transaction.getType() == TypeTransactions.Retiros) {
                                subTotal -= transaction.getAmount();
                                numRetiros += transaction.getAmount();
                                // Agrega una nueva fila con la información proporcionada
                                table.addRow(new Object[]{
                                    transaction.getDescription(), date.format(transaction.getDate()),
                                    numberFormat.format(transaction.getAmount()), "", numberFormat.format(subTotal)

                                });

                            }

                        }

                        lblFinal.setText("Final Balance: " + numberFormat.format(subTotal));
                        lblDepositos.setText("Depositos: " + numberFormat.format(numDepositos));
                        lblRetiros.setText("Retiros: " + numberFormat.format(numRetiros));
                        lblFinalBalance.setText("Final Balance: " + numberFormat.format(numDepositos - numRetiros));
                    }
                }

            }

        } catch (IOException ex) {
            System.err.print("Error: " + ex.getMessage());

    }//GEN-LAST:event_btnFileActionPerformed
    }

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
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAccountState;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblClabe;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblDepositos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblFinalBalance;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRetiros;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JTable tblTransactions;
    // End of variables declaration//GEN-END:variables
}
