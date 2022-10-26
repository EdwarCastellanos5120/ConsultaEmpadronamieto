package com.Controlador;

import com.accesoDatos.ConsultaPersona;
import com.modelos.Persona;
import com.vistas.Inicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

/**
 * @author Jorge A. López
 * @project ConsultaEmpadronamieto
 * @created 10-25-2022 - 7:26 PM
 */
public class InicioCtrl implements ActionListener {
    private Persona personaModelo;
    private ConsultaPersona personaConsulta;
    private Inicio frmInicio;

    public InicioCtrl(Persona personaModelo, ConsultaPersona personaConsulta, Inicio frmInicio){
        this.personaModelo = personaModelo;
        this.personaConsulta = personaConsulta;
        this.frmInicio = frmInicio;


        this.frmInicio.bt_Buscar.addActionListener(this);
        this.frmInicio.bt_limpiar.addActionListener(this);
    }

    public void inicioApp(){
        frmInicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmInicio.bt_Buscar){
            personaModelo.setDpi(frmInicio.tx_DPI.getText());

            System.out.println(frmInicio.tx_FechaNacimiento.getDate());

            personaModelo.setFechaDeNacimiento((Date) frmInicio.tx_FechaNacimiento.getDate());

            personaConsulta.buscarPersona(personaModelo);


            JOptionPane.showMessageDialog(null,"Se ha hecho click a este boton");
        }

        if (e.getSource() == frmInicio.bt_limpiar){
            frmInicio.tx_DPI.setText(null);
            frmInicio.tx_FechaNacimiento.setDate(null);
        }
    }
}
