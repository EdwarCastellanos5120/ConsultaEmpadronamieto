package com.Controlador;

import com.modelos.*;
import com.vistas.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Jorge A. López
 * @project ConsultaEmpadronamieto
 * @created 10-27-2022 - 6:31 PM
 */
public class PrincipalCtrl implements ActionListener {
    private Firma firma;
    private Principal frmPrincipal;
    private Persona persona;
    private Direccion direccion;
    private Municipio municipio;
    private Departamento departamento;
    private CentroDeVotacion centroDeVotacion;
    private Linea linea;
    private Hoja hoja;
    private Libro libro;
    private Mesa mesa;


    public PrincipalCtrl(Firma firma, Principal frmPrincipal){
        this.firma = firma;
        this.persona = firma.getPersona();
        this.direccion = persona.getDireccion();
        this.municipio = this.direccion.getMunicipio();
        this.departamento = this.municipio.getDepartamento();
        this.linea = firma.getLinea();
        this.hoja = this.linea.getHoja();
        this.libro = this.hoja.getLibro();
        this.mesa = this.libro.getMesa();
        this.centroDeVotacion = this.mesa.getCentroVotacion();


        this.frmPrincipal = frmPrincipal;

        this.frmPrincipal.jButtonRegresar.addActionListener(this);
        this.frmPrincipal.jButtonVerMapa.addActionListener(this);
    }

    public void llenarDatos(){
        frmPrincipal.lblDpi.setText(persona.getDpi());
        frmPrincipal.lblDepto.setText(departamento.getNombre());
        frmPrincipal.lblDireccion.setText(direccion.getCalle() + " Calle, Zona " + direccion.getZona()+", No. Casa "+direccion.getCasa() + ", Av. "+direccion.getAvenida());
        frmPrincipal.lblMunicipio.setText(municipio.getNombre());
        frmPrincipal.lblFechaNacimiento.setText(persona.getFechaDeNacimiento().toString());
        frmPrincipal.lblNombreLibro.setText(String.valueOf(libro.getCodigo()));
        frmPrincipal.lblNombreLinea.setText(String.valueOf(linea.getCodigo()));
        frmPrincipal.lblNombreMesa.setText(String.valueOf(mesa.getCodigo()));
        frmPrincipal.lblNombre.setText(persona.getNombre1() + " " + persona.getNombre2() + " " +persona.getApellido1() + " " +persona.getApellido2());
        frmPrincipal.lbNombreHoja.setText(String.valueOf(hoja.getCodigo()));
        frmPrincipal.lblNumEmpadronamiento.setText(String.valueOf(persona.getPadron()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
