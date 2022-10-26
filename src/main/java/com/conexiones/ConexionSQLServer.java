/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author linda
 */
public class ConexionSQLServer {

    private static final String JDBC_URL = "jdbc:sqlserver://mysqlserverjlopez.database.windows.net:1433;database=Db_ConsultaEmpadronamiento;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
    private static final String JDBC_USER = "azureuser@mysqlserverjlopez";
    private static final String JDBC_PWD = "Jlopezg112";
    private static Logger LOGGER;

    public ConexionSQLServer(){
        LOGGER = Logger.getLogger(ConexionSQLServer.class.getName());
    }

    public static Connection getConnection(){
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PWD);
            LOGGER.log(Level.INFO,"Se ha establecido la conexion a la instancia de Azure");
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE,"No se ha podido establecer la conexion a la instancia de Azure",ex);
        }
        return conexion;
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
