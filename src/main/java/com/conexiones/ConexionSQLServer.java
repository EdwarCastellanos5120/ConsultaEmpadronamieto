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

/**
 *
 * @author linda
 */
public class ConexionSQLServer {

    private static final String JDBC_URL = "jdbc:sqlserver://mysqlserverjlopez.database.windows.net:1433;database=Db_ConsultaEmpadronamiento;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
    private static final String JDBC_USER = "azureuser@mysqlserverjlopez";
    private static final String JDBC_PWD = "Jlopezg112";

    public static Connection getConnection() throws SQLException {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PWD);
            System.out.println("Buena conexion");
        } catch (SQLException ex) {
            System.out.println("Errorcitooo");
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
