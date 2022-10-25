package com.accesoDatos;

import com.modelos.*;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jorge A. López
 * @project ConsultaEmpadronamieto
 * @created 10-24-2022 - 8:38 PM
 */
public class ConsultaPersona {
    public Firma buscarPersona(Persona persona){

        Departamento departamento = new Departamento(1,"Jutiapa");
        Municipio municipio = new Municipio(1,"Jutiapa",departamento);
        Direccion direccion = new Direccion(1, (float) 34.343,(float)234.233,2,1,4,5,municipio);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(new Date());


        if(persona.getDpi() == "3422501832201"){
            System.out.println("Se encontro la persona");

            persona.setCodigo(1);
            persona.setPadron(10);
            persona.setNombre1("Jorge");
            persona.setNombre2("Alfonso");
            persona.setApellido1("Lopez");
            persona.setApellido2("Garcia");
            persona.setFoto("jorge-foto");
            persona.setFirma("firma-jorge");
            persona.setDireccion(direccion);

            JOptionPane.showMessageDialog(null,"Se ha encontrado la persona");
            System.out.println(persona.toString());

        } else {
            JOptionPane.showMessageDialog(null,"No se ha encontrado la persona");
        }


        CentroDeVotacion centroDeVotacion = new CentroDeVotacion(1,"Centro de Votacion UMG",direccion);
        Mesa mesa = new Mesa(1,centroDeVotacion);
        Libro libro = new Libro(1,mesa);
        Hoja hoja = new Hoja(1,libro);
        Linea linea = new Linea(1,hoja);


        return new Firma(persona, linea);
    }
}
