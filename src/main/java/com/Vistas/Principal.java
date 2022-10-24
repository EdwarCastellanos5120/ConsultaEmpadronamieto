/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Edwar Alejandro
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(this);
     SetImageLabel(lb_fondo, rutaFondo);
    }

       String rutaFondo="src/main/java/com/Img/fondo_1.jpg";

        private void SetImageLabel(JLabel label, String path){
        ImageIcon image = new ImageIcon(path);
        Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVerMapa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        lblNombreLinea = new javax.swing.JLabel();
        lblNombreMesa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombreLibro = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblDepto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jPanelFoto = new javax.swing.JPanel();
        jPanelFirma = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblDpi = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblNumEmpadronamiento = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lb_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVerMapa.setBackground(new java.awt.Color(0, 255, 153));
        jButtonVerMapa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonVerMapa.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVerMapa.setText("VER MAPA");
        jButtonVerMapa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVerMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerMapaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 70, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACIÓN PERSONAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 330, 30));

        jLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel.setText("NOMBRE DE MESA:");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 160, 20));

        lblNombreLinea.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblNombreLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 100, 20));

        lblNombreMesa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblNombreMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 100, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("NOMBRE DE LÍNEA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 160, 20));

        lblNombreLibro.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 110, 20));

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, 20));

        lblDepto.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 170, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("DPI:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 40, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("NÚMERO DE EMPADRONAMIENTO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 290, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("NOMBRE DE LIBRO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 160, 20));

        jButtonRegresar.setBackground(new java.awt.Color(255, 51, 102));
        jButtonRegresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        jPanelFoto.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jPanelFirma.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFirma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelFirma.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelFirmaLayout = new javax.swing.GroupLayout(jPanelFirma);
        jPanelFirma.setLayout(jPanelFirmaLayout);
        jPanelFirmaLayout.setHorizontalGroup(
            jPanelFirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanelFirmaLayout.setVerticalGroup(
            jPanelFirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelFirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 270, 20));

        lblDpi.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 140, 20));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setText("NOMBRE COMPLETO:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, 20));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 190, 20));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setText("DEPARTAMENTO:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 20));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel16.setText("MUNICIPIO:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 20));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel17.setText("DIRECCIÓN:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 20));

        lblNumEmpadronamiento.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblNumEmpadronamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 160, 20));

        lblMunicipio.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, 20));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 510, 20));

        lb_fondo.setText("jLabel2");
        getContentPane().add(lb_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 750, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerMapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerMapaActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVerMapa;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelFirma;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JLabel lb_fondo;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDpi;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreLibro;
    private javax.swing.JLabel lblNombreLinea;
    private javax.swing.JLabel lblNombreMesa;
    private javax.swing.JLabel lblNumEmpadronamiento;
    // End of variables declaration//GEN-END:variables
}
