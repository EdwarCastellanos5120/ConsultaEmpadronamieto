package com.sandbox;

import com.accesoDatos.ConsultaPersona;
import com.modelos.Firma;
import com.modelos.Persona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jorge A. López
 * @project ConsultaEmpadronamieto
 * @created 10-24-2022 - 7:40 PM
 */
public class SandboxTestJA {

    private static Logger LOGGER;
    private static String url = "jdbc:sqlserver://mysqlserverjlopez.database.windows.net:1433;database=Db_ConsultaEmpadronamiento;user=azureuser@mysqlserverjlopez;password=Jlopezg112;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
    private static Connection connection;

    public static void main(String[] args) {
//        LOGGER = Logger.getLogger(SandboxTestJA.class.getName());
//        //LOGGER.log(Level.INFO,"MENSAJE TEST");
//
//        try {
//            connection = DriverManager.getConnection(url);
//            LOGGER.log(Level.INFO,"Se ha establecido la conexion a la instancia de Azure");
//        } catch (SQLException e) {
//            LOGGER.log(Level.SEVERE,"No se ha podido establecer la conexion a la instancia de Azure",e);
//        }

        String str="2001-10-24";
        Date date = Date.valueOf(str);


        Persona persona = new Persona();
        persona.setDpi("6499436122617");
        //fecha de nacimiento 2001-10-24
        persona.setFechaDeNacimiento(Date.valueOf(str));

        ConsultaPersona consultaPersona = new ConsultaPersona();
        Firma firma = consultaPersona.buscarPersona(persona);
        System.out.println(firma.toString());


    }
}
