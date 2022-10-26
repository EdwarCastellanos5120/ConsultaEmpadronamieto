/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas;


import com.modelos.Persona;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Edwar Alejandro
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        setLocationRelativeTo(this);
        SetImageLabel(label_imagen, rutaLogo);
        SetImageLabel(label_imagen1, rutaFondo);
        SetImageLabel(lb_dpi, rutaDPI);
        SetImageLabel(lb_calendario, rutaCalendario);
    }

   String rutaLogo="src/main/java/com/Img/logo.png",
    rutaFondo="src/main/java/com/Img/fondo_1.jpg",
    rutaDPI="src/main/java/com/Img/dpi.png",
    rutaCalendario="src/main/java/com/Img/calendario.png";
   
           
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        label_imagen = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_dpi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tx_DPI = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lb_calendario = new javax.swing.JLabel();
        tx_FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_Buscar = new javax.swing.JButton();
        bt_limpiar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        label_imagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(4, 28, 67));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_imagen.setText("logo");
        jPanel5.add(label_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 90));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 410, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIENVENIDO");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 280, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 40));

        lb_dpi.setText("dpi");
        jPanel1.add(lb_dpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 110));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 280, 10));

        tx_DPI.setBackground(new java.awt.Color(255, 255, 255));
        tx_DPI.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tx_DPI.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tx_DPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 280, 40));

        jPanel6.setBackground(new java.awt.Color(255, 153, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 280, 10));

        lb_calendario.setText("calendario");
        jPanel1.add(lb_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 80));

        tx_FechaNacimiento.setDateFormatString("dd-MM-yyyy\n");
        tx_FechaNacimiento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(tx_FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 280, 40));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccionar Fecha Nacimiento");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 220, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Ingresar Numero de Identificacion\n");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 220, -1));

        bt_Buscar.setBackground(new java.awt.Color(102, 255, 102));
        bt_Buscar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bt_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        bt_Buscar.setText("BUSCAR");
        bt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 160, 40));

        bt_limpiar.setBackground(new java.awt.Color(255, 255, 102));
        bt_limpiar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bt_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        bt_limpiar.setText("LIMPIAR");
        jPanel1.add(bt_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 160, 40));

        jPanel7.setBackground(new java.awt.Color(255, 153, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 390, 10));

        label_imagen1.setText("jLabel1");
        jPanel1.add(label_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_DPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_DPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_DPIActionPerformed

    private void bt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BuscarActionPerformed

    }//GEN-LAST:event_bt_BuscarActionPerformed


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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private void SetImageLabel(JLabel label, String path){
        ImageIcon image = new ImageIcon(path);
        Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }
     private void SetImageBoton(JButton button, String path){
        ImageIcon image = new ImageIcon(path);
        Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setIcon(icon);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt_Buscar;
    public javax.swing.JButton bt_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JLabel label_imagen1;
    private javax.swing.JLabel lb_calendario;
    private javax.swing.JLabel lb_dpi;
    public javax.swing.JTextField tx_DPI;
    public com.toedter.calendar.JDateChooser tx_FechaNacimiento;
    // End of variables declaration//GEN-END:variables

    
    
    
}
