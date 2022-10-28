package com.Controlador;

import com.accesoDatos.ConsultaPersona;
import com.modelos.Firma;
import com.modelos.Persona;
import com.vistas.Inicio;
import com.vistas.Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author Jorge A. López
 * @project ConsultaEmpadronamieto
 * @created 10-25-2022 - 7:26 PM
 */
public class InicioCtrl implements ActionListener {
    private Persona personaModelo;
    private ConsultaPersona personaConsulta;
    private Inicio frmInicio;
    private Principal frmPrincipal;

    public InicioCtrl(Persona personaModelo, ConsultaPersona personaConsulta, Inicio frmInicio, Principal frmPrincipal){
        this.personaModelo = personaModelo;
        this.personaConsulta = personaConsulta;
        this.frmInicio = frmInicio;
        this.frmPrincipal = frmPrincipal;


        this.frmInicio.bt_Buscar.addActionListener(this);
        this.frmInicio.bt_limpiar.addActionListener(this);
    }



    public void inicioApp(){
        frmInicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmInicio.bt_Buscar){

            //Verifica que se haya ingresado algun dato
            if (frmInicio.tx_DPI.getText().isEmpty() || frmInicio.tx_FechaNacimiento.getDate() == null){
                JOptionPane.showMessageDialog(null,"No se han ingresado los suficientes datos","ERROR",JOptionPane.ERROR_MESSAGE);
            } else {
                //Conversion fecha de nacimiento utils.Date a sql.Date
                Date date = frmInicio.tx_FechaNacimiento.getDate();
                long d = date.getTime();
                java.sql.Date fechaNacimiento = new java.sql.Date(d);

                personaModelo.setDpi(frmInicio.tx_DPI.getText());
                personaModelo.setFechaDeNacimiento(fechaNacimiento);

                Firma firma = personaConsulta.buscarPersona(personaModelo);

                JOptionPane.showMessageDialog(null,"Se han encontrado una incidencia \n DPI " + firma.getPersona().getDpi() +
                        "\n Nombre " + firma.getPersona().getNombre1() +
                        " "+firma.getPersona().getApellido1(),"Consulta de Empadronamiento",JOptionPane.INFORMATION_MESSAGE);

                frmInicio.setVisible(false);
                PrincipalCtrl controladorPrincipal = new PrincipalCtrl(firma,frmPrincipal);
                controladorPrincipal.llenarDatos();
                frmPrincipal.setVisible(true);

            }
        }

        if (e.getSource() == frmInicio.bt_limpiar){
            frmInicio.tx_DPI.setText(null);
        }
    }
}
