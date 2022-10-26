package com.Controlador;

import com.accesoDatos.ConsultaPersona;
import com.modelos.Persona;
import com.vistas.Inicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            JOptionPane.showMessageDialog(null,"Se ha hecho click a este boton");
        }

        if (e.getSource() == frmInicio.bt_limpiar){
            JOptionPane.showMessageDialog(null,"Se ha hecho click en este boton");
        }
    }
}
