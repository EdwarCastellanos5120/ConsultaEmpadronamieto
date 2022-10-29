package com.Controlador;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

import com.modelos.*;
import com.vistas.Mapa;
import com.vistas.Principal;
import com.vistas.RoutePainter;

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
    private Mapa frmMapa;
    private Persona persona;
    private Direccion direccion;
    private Municipio municipio;
    private Departamento departamento;
    private CentroDeVotacion centroDeVotacion;
    private Linea linea;
    private Hoja hoja;
    private Libro libro;
    private Mesa mesa;
    private JXMapViewer mapViewer;
    private JFrame frame;

    private String fotoPath = "src/main/java/com/Img/fotos/";
    private String firmaPath = "src/main/java/com/Img/firmas/";
    private GeoPosition dirVotacion;


    public PrincipalCtrl(){
        frame = new JFrame("Donde debes votar...");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(false);

        mapViewer = new JXMapViewer();
        frame.getContentPane().add(mapViewer);

        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);

        mapViewer.setTileFactory(tileFactory);
    }
    public PrincipalCtrl(Firma firma, Principal frmPrincipal){
        this.firma = firma;
        this.persona = firma.getPersona();
        this.direccion = persona.getDireccion();
        this.municipio = direccion.getMunicipio();
        this.departamento = municipio.getDepartamento();
        this.linea = firma.getLinea();
        this.hoja = linea.getHoja();
        this.libro = hoja.getLibro();
        this.mesa = libro.getMesa();
        this.centroDeVotacion = this.mesa.getCentroVotacion();

        this.frmPrincipal = frmPrincipal;
//        this.frmMapa = new Mapa();
        frame = new JFrame("Donde debes votar...");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(false);

        mapViewer = new JXMapViewer();
        frame.getContentPane().add(mapViewer);

        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);

        mapViewer.setTileFactory(tileFactory);


        this.frmPrincipal.jButtonRegresar.addActionListener(this);
        this.frmPrincipal.jButtonVerMapa.addActionListener(this);
    }

    public void PasarData(Firma firma, Principal frmPrincipal){
        this.firma = firma;
        this.persona = firma.getPersona();
        this.direccion = persona.getDireccion();
        this.municipio = direccion.getMunicipio();
        this.departamento = municipio.getDepartamento();
        this.linea = firma.getLinea();
        this.hoja = linea.getHoja();
        this.libro = hoja.getLibro();
        this.mesa = libro.getMesa();
        this.centroDeVotacion = this.mesa.getCentroVotacion();

        this.frmPrincipal = frmPrincipal;
//        this.frmMapa = new Mapa();
        frame = new JFrame("Donde debes votar...");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(false);

        mapViewer = new JXMapViewer();
        frame.getContentPane().add(mapViewer);

        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);

        mapViewer.setTileFactory(tileFactory);


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
        frmPrincipal.lblNumEmpadronamiento.setText(persona.getDpi());

        dirVotacion = new GeoPosition(direccion.getLatitud(), direccion.getLongitud());

        frmPrincipal.SetImageLabel(frmPrincipal.lb_fotopersona,fotoPath.concat(persona.getFoto().concat(".jpg")));
        frmPrincipal.SetImageLabel(frmPrincipal.lb_fotofirma,firmaPath.concat(persona.getFirma().concat(".png")));



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frmPrincipal.jButtonRegresar){
            InicioCtrl.limpiar();
            InicioCtrl.frmInicio.setVisible(true);
            frmPrincipal.setVisible(false);
        }

        if(e.getSource() == frmPrincipal.jButtonVerMapa){

            List<GeoPosition> track = Arrays.asList(dirVotacion);
            RoutePainter routePainter = new RoutePainter(track);

            // Calcula el nivel de enfoque
            mapViewer.zoomToBestFit(new HashSet<GeoPosition>(track), 1);

            // Se anadieron interacciones , mouse listener
            MouseInputListener mia = new PanMouseInputListener(mapViewer);
            mapViewer.addMouseListener(mia);
            mapViewer.addMouseMotionListener(mia);

            mapViewer.addMouseListener(new CenterMapListener(mapViewer));

            mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCursor(mapViewer));

            mapViewer.addKeyListener(new PanKeyListener(mapViewer));

            Set<Waypoint> waypoints = new HashSet<Waypoint>(Arrays.asList(
                    new DefaultWaypoint(dirVotacion)));

            WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<Waypoint>();
            waypointPainter.setWaypoints(waypoints);

            List<Painter<JXMapViewer>> painters = new ArrayList<Painter<JXMapViewer>>();
            painters.add(routePainter);
            painters.add(waypointPainter);

            CompoundPainter<JXMapViewer> painter = new CompoundPainter<JXMapViewer>(painters);
            mapViewer.setOverlayPainter(painter);

            frame.setVisible(true);
        }


    }
}
