package com.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.conexiones.ConexionSQLServer;
import com.modelos.*;

/**
 * @author Jorge A. López
 * @project ConsultaEmpadronamieto
 * @created 10-24-2022 - 8:38 PM
 */
public class ConsultaPersona extends ConexionSQLServer{

    private static Logger LOGGER;
    private static final String CONSULTA = "SELECT * "
            + "FROM dbo.tb_personas p "
            + "JOIN dbo.tb_firmas f "
                + "ON p.persona_codigo = f.persona_codigo "
            + "JOIN dbo.tb_lineas l "
                + "ON f.linea_codigo = l.linea_codigo "
            + "JOIN dbo.tb_hojas h "
                + "ON l.hoja_codigo = h.hoja_codigo "
            + "JOIN dbo.tb_libros lb "
                + "ON h.libro_codigo = lb.libro_codigo "
            + "JOIN dbo.tb_mesas m "
                + "ON lb.mesa_codigo = m.mesa_codigo "
            + "JOIN dbo.tb_centrosDeVotacion cv "
                + "ON m.centroDeVotacion_codigo = cv.centroDeVotacion_codigo "
            + "JOIN dbo.tb_direcciones d "
                + "ON cv.direccion_codigo = d.direccion_codigo "
            + "JOIN dbo.tb_municipios mu "
                + "ON d.municipio_codigo = mu.municipio_codigo "
            + "JOIN dbo.tb_departamentos dep "
                + "ON mu.departamento_codigo = dep.departamento_codigo "
            + "WHERE p.persona_dpi=?;";

    public ConsultaPersona(){
        LOGGER = Logger.getLogger(ConsultaPersona.class.getName());
    }

    public Firma buscarPersona(Persona solicitante){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Firma firma = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(CONSULTA);
            stmt.setString(1, solicitante.getDpi());
            rs = stmt.executeQuery();
            while (rs.next()) {
                if (solicitante.getDpi().equals(rs.getString("persona_dpi"))
                    && solicitante.getFechaDeNacimiento().equals(rs.getDate("persona_fechaDeNacimiento"))
                )
                {
                    Departamento departamento = new Departamento(
                            rs.getInt("departamento_codigo"),
                            rs.getString("departamento_nombre")
                    );
                    Municipio municipio = new Municipio(
                            rs.getInt("municipio_codigo"),
                            rs.getString("municipio_nombre"),
                            departamento
                    );
                    Direccion direccion = new Direccion(
                            rs.getInt("direccion_codigo"),
                            rs.getFloat("direccion_longitud"),
                            rs.getFloat("direccion_latitud"),
                            rs.getInt("direccion_zona"),
                            rs.getInt("direccion_calle"),
                            rs.getInt("direccion_avenida"),
                            rs.getInt("direccion_casa"),
                            municipio
                    );
                    Persona persona = new Persona(
                            rs.getInt("persona_codigo"),
                            rs.getString("persona_dpi"),
                            rs.getInt("persona_padron"),
                            rs.getString("persona_nombre1"),
                            rs.getString("persona_nombre2"),
                            rs.getString("persona_apellido1"),
                            rs.getString("persona_apellido2"),
                            rs.getString("persona_foto"),
                            rs.getString("persona_firma"),
                            rs.getDate("persona_fechaDeNacimiento"),
                            direccion
                    );
                    CentroDeVotacion centroDeVotacion = new CentroDeVotacion(
                            rs.getInt("centroDeVotacion_codigo"),
                            rs.getString("centroDeVotacion_nombre"),
                            direccion
                    );
                    Mesa mesa = new Mesa(
                            rs.getInt("mesa_codigo"),
                            centroDeVotacion
                    );
                    Libro libro = new Libro(
                            rs.getInt("libro_codigo"),
                            mesa
                    );
                    Hoja hoja = new Hoja(
                            rs.getInt("hoja_codigo"),
                            libro
                    );
                    Linea linea = new Linea(
                            rs.getInt("linea_codigo"),
                            hoja
                    );
                    LOGGER.log(Level.INFO,"Se ha hecho la consulta [busqueda] en la base de datos.");
                    firma = new Firma(persona, linea);
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE,"No se ha podido realizar la consulta exitosamente",ex);
        } finally {
            ConexionSQLServer.close(conn);
            ConexionSQLServer.close(stmt);
            ConexionSQLServer.close(rs);
        }
        return firma;
    }
}
