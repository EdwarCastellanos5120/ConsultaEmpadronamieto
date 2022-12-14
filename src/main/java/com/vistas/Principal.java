/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas;

import com.modelos.Firma;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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

    String rutaFondo = "src/main/java/com/Img/fondo_1.jpg";
    String rutaFotoPerfil ="src/main/java/com/Img/fotos/";
    String rutaFotoFirma ="src/main/java/com/Img/firmas/";

    public void SetImageLabel(JLabel label, String path) {
        ImageIcon image = new ImageIcon(path);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }

    Firma firmaNueva = new Firma();

    public void constructor(Firma firma) {
        firmaNueva = firma;
        lblDpi.setText(firmaNueva.getPersona().getDpi());
        lblNombre.setText(firmaNueva.getPersona().getNombre1() + " " + firmaNueva.getPersona().getNombre2() + " "
                + firmaNueva.getPersona().getApellido1() + " " + firmaNueva.getPersona().getApellido2());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        lblFechaNacimiento.setText(sdf.format(firmaNueva.getPersona().getFechaDeNacimiento()));
        lblDepto.setText(firmaNueva.getPersona().getDireccion().getMunicipio().getDepartamento().getNombre());
        lblMunicipio.setText(firmaNueva.getPersona().getDireccion().getMunicipio().getNombre());
        
        lblDireccion.setText("Zona " + firmaNueva.getPersona().getDireccion().getZona() + " Calle "
                + firmaNueva.getPersona().getDireccion().getCalle() + " Avenida " + firmaNueva.getPersona().getDireccion().getAvenida()
                + " Casa No. " + firmaNueva.getPersona().getDireccion().getCasa() + " "+ 
                        firmaNueva.getPersona().getDireccion().getMunicipio().getNombre()+"," +
                firmaNueva.getPersona().getDireccion().getMunicipio().getDepartamento().getNombre());
        
        lblNumEmpadronamiento.setText(firmaNueva.getPersona().getDpi());
        lblNombreMesa.setText(firmaNueva.getLinea().getHoja().getLibro().getMesa().getCodigo() + "");
        lblNombreLibro.setText(firmaNueva.getLinea().getHoja().getLibro().getCodigo() + "");
        lbNombreHoja.setText(firmaNueva.getLinea().getHoja().getCodigo() + "");
        lblNombreLinea.setText(firmaNueva.getLinea().getCodigo()+ "");
        rutaFotoPerfil += firmaNueva.getPersona().getFoto() + ".JPG";
        rutaFotoFirma += firmaNueva.getPersona().getFirma() + ".png";
        SetImageLabel(lb_fotopersona, rutaFotoPerfil);
        SetImageLabel(lb_fotofirma, rutaFotoFirma);
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
        lbNombreHoja = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblDepto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jPanelFoto = new javax.swing.JPanel();
        lb_fotopersona = new javax.swing.JLabel();
        jPanelFirma = new javax.swing.JPanel();
        lb_fotofirma = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVerMapa.setBackground(new java.awt.Color(102, 255, 102));
        jButtonVerMapa.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonVerMapa.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVerMapa.setText("VER MAPA");
        jButtonVerMapa.setBorder(null);
//        jButtonVerMapa.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButtonVerMapaActionPerformed(evt);
//            }
//        });
        getContentPane().add(jButtonVerMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 170, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACI??N PERSONAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 480, 30));

        jLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 153, 102));
        jLabel.setText("NUMERO DE MESA:");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 20));

        lblNombreLinea.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombreLinea.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreLinea.setText("LB LINEA");
        getContentPane().add(lblNombreLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 100, 20));

        lblNombreMesa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombreMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreMesa.setText("LB MESA");
        getContentPane().add(lblNombreMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("NUMERO DE L??NEA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, 20));

        lblNombreLibro.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombreLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreLibro.setText("LB LIBRO");
        getContentPane().add(lblNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 110, 20));

        lbNombreHoja.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbNombreHoja.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreHoja.setText("LB HOJA");
        getContentPane().add(lbNombreHoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 110, 20));

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("FECHA LB");
        getContentPane().add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 190, 20));

        lblDepto.setBackground(new java.awt.Color(255, 255, 255));
        lblDepto.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblDepto.setForeground(new java.awt.Color(255, 255, 255));
        lblDepto.setText("DEPARTAMENTO LB");
        getContentPane().add(lblDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 170, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 102));
        jLabel8.setText("DPI:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 40, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FIRMA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 290, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 102));
        jLabel10.setText("NUMERO DE HOJA:\n");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 160, 20));

        jButtonRegresar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.setBorder(null);
//        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButtonRegresarActionPerformed(evt);
//            }
//        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 40));

        jPanelFoto.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelFoto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_fotopersona.setText("foto_persona");
        jPanelFoto.add(lb_fotopersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        getContentPane().add(jPanelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, 230));

        jPanelFirma.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFirma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelFirma.setForeground(new java.awt.Color(255, 255, 255));
        jPanelFirma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_fotofirma.setText("foto_firma");
        jPanelFirma.add(lb_fotofirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        getContentPane().add(jPanelFirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 400, 230));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("NOMBRE LB");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 270, 20));

        lblDpi.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblDpi.setForeground(new java.awt.Color(255, 255, 255));
        lblDpi.setText("DPI LABEL");
        getContentPane().add(lblDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 140, 20));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 102));
        jLabel13.setText("NOMBRE COMPLETO:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 190, 20));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 102));
        jLabel14.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 200, 20));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 102));
        jLabel15.setText("DEPARTAMENTO:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 150, 20));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 102));
        jLabel16.setText("MUNICIPIO:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 100, 20));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 102));
        jLabel17.setText("DIRECCI??N:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, 20));

        lblNumEmpadronamiento.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNumEmpadronamiento.setForeground(new java.awt.Color(255, 255, 255));
        lblNumEmpadronamiento.setText("EMPADRONO LB");
        getContentPane().add(lblNumEmpadronamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 160, 20));

        lblMunicipio.setBackground(new java.awt.Color(255, 255, 255));
        lblMunicipio.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio.setText("MUNICIPIO LB");
        getContentPane().add(lblMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 140, 20));

        lblDireccion.setBackground(new java.awt.Color(255, 255, 255));
        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("DIRECCION LB");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 610, 20));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 102));
        jLabel11.setText("NUMERO DE LIBRO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 20));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 102));
        jLabel12.setText("N??MERO DE \nEMPADRONAMIENTO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 290, 20));

        lb_fondo.setText("jLabel2");
        getContentPane().add(lb_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void jButtonVerMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerMapaActionPerformed
//        Mapa mapa= new Mapa();
//       mapa.setVisible(true);
//       this.setVisible(false);
//    }//GEN-LAST:event_jButtonVerMapaActionPerformed
//
//    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
//       Inicio inicio= new Inicio();
//       inicio.setVisible(true);
//       this.setVisible(false);
//    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
    public javax.swing.JButton jButtonRegresar;
    public javax.swing.JButton jButtonVerMapa;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanelFirma;
    public javax.swing.JPanel jPanelFoto;
    public javax.swing.JLabel lbNombreHoja;
    public javax.swing.JLabel lb_fondo;
    public javax.swing.JLabel lb_fotofirma;
    public javax.swing.JLabel lb_fotopersona;
    public javax.swing.JLabel lblDepto;
    public javax.swing.JLabel lblDireccion;
    public javax.swing.JLabel lblDpi;
    public javax.swing.JLabel lblFechaNacimiento;
    public javax.swing.JLabel lblMunicipio;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblNombreLibro;
    public javax.swing.JLabel lblNombreLinea;
    public javax.swing.JLabel lblNombreMesa;
    public javax.swing.JLabel lblNumEmpadronamiento;
    // End of variables declaration//GEN-END:variables
}
