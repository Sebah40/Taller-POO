/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import gestion.datos.GestionDatos;
import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.FormatoTipo;
import enumeraciones.ObraTipo;
import enumeraciones.PrestamoTipo;
import enumeraciones.SexoTipo;
import excepciones.EjemplarInexistenteError;
import excepciones.LectorNoRegistradoError;
import gestion.inventario.Coleccion;
import gestion.inventario.Edicion;
import gestion.inventario.Ejemplar;
import gestion.inventario.Obra;
import gestion.inventario.Prestamo;
import gestion.inventario.Ubicacion;
import gestion.personas.Alumno;
import gestion.personas.Docente;
import gestion.personas.Lector;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author Grupo 2
 */
public class VentanaAdministrador extends javax.swing.JFrame {
    private GestionDatos datos;

    public VentanaAdministrador(GestionDatos datos) {
        super("Gestion de Biblioteca");
        this.datos = datos;
        initComponents();
        esconderPeriodos();
        actualizarTablaGestion();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollBar1 = new javax.swing.JScrollBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        botonDarBaja = new javax.swing.JButton();
        botonRealizarObservacion = new javax.swing.JButton();
        botonActualizarListaGestion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaGestionEjemplar = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaBusqueda = new javax.swing.JList<>();
        boxBusquedaTipo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        botonFiltrar = new javax.swing.JButton();
        txtBusquedaListado = new javax.swing.JTextField();
        lblTituloInicioPeriodo = new javax.swing.JLabel();
        lblTituloFinPeriodo = new javax.swing.JLabel();
        lblDiaInicioPeriodo = new javax.swing.JLabel();
        lblMesInicioPeriodo = new javax.swing.JLabel();
        lblAnioInicioPeriodo = new javax.swing.JLabel();
        lblDiaFinalPeriodo = new javax.swing.JLabel();
        lblMesFinalPeriodo = new javax.swing.JLabel();
        lblAnioFinalPeriodo = new javax.swing.JLabel();
        txtDiaFinalPeriodo = new javax.swing.JTextField();
        txtMesFinalPeriodo = new javax.swing.JTextField();
        txtAnioFinalPeriodo = new javax.swing.JTextField();
        txtDiaInicioPeriodo = new javax.swing.JTextField();
        txtAnioInicioPeriodo = new javax.swing.JTextField();
        txtMesInicioPeriodo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        boxTipoDePrestamo = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCodEjemplar = new javax.swing.JTextField();
        txtDocumentoLector = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        botonRegistrarPrestamo = new javax.swing.JButton();
        botonRegistrarDevolucion = new javax.swing.JButton();
        botonReservacion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        boxSexo = new javax.swing.JComboBox<>();
        txtNacionalidad = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtCodPostal = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtNumCelular = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtCarreras = new javax.swing.JTextField();
        boxCargo = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        botonRegistrarLector = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txtDiaNacimiento = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtMesNacimiento = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtAnioNacimiento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCanEjemplares = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtSubtitulo = new javax.swing.JTextField();
        txtPrimerAutor = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        boxTipoDeObra = new javax.swing.JComboBox<>();
        boxAreaTematica = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        txtPaisEdicion = new javax.swing.JTextField();
        txtNumEdicion = new javax.swing.JTextField();
        txtVolumenes = new javax.swing.JTextField();
        txtCantidadPaginas = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        boxFormato = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNombreColeccion = new javax.swing.JTextField();
        txtISBNColeccion = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtNumPasillo = new javax.swing.JTextField();
        txtNumEstanteria = new javax.swing.JTextField();
        txtNumEstante = new javax.swing.JTextField();
        txtAnioEdicion = new javax.swing.JTextField();
        boxFormaAdquisicion = new javax.swing.JComboBox<>();
        boxCaracteristicas = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        botonCargarDatos = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtSegundoAutor = new javax.swing.JTextField();
        txtTercerAutor = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtAreaReferencia = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabelReadmeGitHub = new javax.swing.JLabel();
        hyperlink = new javax.swing.JLabel();
        mona = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonDarBaja.setText("Dar de baja");
        botonDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDarBajaActionPerformed(evt);
            }
        });

        botonRealizarObservacion.setText("Realizar observacion");
        botonRealizarObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarObservacionActionPerformed(evt);
            }
        });

        botonActualizarListaGestion.setText("Actualizar lista");
        botonActualizarListaGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarListaGestionActionPerformed(evt);
            }
        });

        tablaGestionEjemplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo de barra", "Fecha adquisicion", "Forma de adquisicion", "Estado", "Ubicacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaGestionEjemplar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonRealizarObservacion)
                        .addGap(18, 18, 18)
                        .addComponent(botonDarBaja)
                        .addGap(18, 18, 18)
                        .addComponent(botonActualizarListaGestion)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDarBaja)
                    .addComponent(botonRealizarObservacion)
                    .addComponent(botonActualizarListaGestion))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestionar Ejemplares", jPanel2);

        jScrollPane2.setViewportView(ListaBusqueda);

        boxBusquedaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lectores no devolvieron obras.", "Obras mas solicitadas alumnos/docentes.", "Obras solicitadas por publico general.", "Ejemplares disponibles por area referencia.", "Obras reservadas en una fecha determinada.", "Lectores multados en un periodo de tiempo.", "Lectores por cantidad de multas aplicadas.", "Obras de una editorial determinada." }));
        boxBusquedaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBusquedaTipoActionPerformed(evt);
            }
        });

        jLabel21.setText("Filtrar por:");

        botonFiltrar.setText("Filtrar");
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });

        lblTituloInicioPeriodo.setText("Inicio del periodo");

        lblTituloFinPeriodo.setText("Fin del periodo");

        lblDiaInicioPeriodo.setText("Dia:");

        lblMesInicioPeriodo.setText("Mes:");

        lblAnioInicioPeriodo.setText("Año:");

        lblDiaFinalPeriodo.setText("Dia:");

        lblMesFinalPeriodo.setText("Mes:");

        lblAnioFinalPeriodo.setText("Año:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(lblTituloInicioPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloFinPeriodo)
                .addGap(320, 320, 320))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxBusquedaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusquedaListado, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lblDiaInicioPeriodo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMesInicioPeriodo)
                            .addComponent(lblAnioInicioPeriodo))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMesInicioPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(txtDiaInicioPeriodo)
                    .addComponent(txtAnioInicioPeriodo))
                .addGap(305, 305, 305)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiaFinalPeriodo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMesFinalPeriodo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblAnioFinalPeriodo)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAnioFinalPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txtDiaFinalPeriodo)
                    .addComponent(txtMesFinalPeriodo))
                .addGap(305, 305, 305))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(boxBusquedaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFiltrar)
                    .addComponent(txtBusquedaListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloInicioPeriodo)
                    .addComponent(lblTituloFinPeriodo))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaInicioPeriodo)
                    .addComponent(lblDiaFinalPeriodo)
                    .addComponent(txtDiaFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMesInicioPeriodo)
                    .addComponent(lblMesFinalPeriodo)
                    .addComponent(txtMesFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnioFinalPeriodo)
                    .addComponent(txtAnioInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnioInicioPeriodo))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel4);

        jLabel24.setText("Tipo de prestamo:");

        boxTipoDePrestamo.setModel(new DefaultComboBoxModel(PrestamoTipo.values()));

        jLabel26.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel26.setText("Informacion del Prestamo");

        jLabel27.setText("Codigo del ejemplar:");

        jLabel25.setText("Documento del lector:");

        botonRegistrarPrestamo.setText("Registrar prestamo");
        botonRegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPrestamoActionPerformed(evt);
            }
        });

        botonRegistrarDevolucion.setText("Registrar devolucion");
        botonRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarDevolucionActionPerformed(evt);
            }
        });

        botonReservacion.setText("Realizar reservación");
        botonReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodEjemplar)
                            .addComponent(txtDocumentoLector, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(boxTipoDePrestamo, 0, 176, Short.MAX_VALUE))
                        .addGap(399, 399, 399))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(botonReservacion)
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrarDevolucion)
                        .addGap(25, 25, 25))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel26)))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(479, 479, 479)
                .addComponent(botonRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrarDevolucion)
                    .addComponent(botonReservacion))
                .addGap(80, 80, 80)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(boxTipoDePrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(txtCodEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtDocumentoLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(botonRegistrarPrestamo)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prestamo", jPanel3);

        jLabel32.setText("Nombre:");

        jLabel33.setText("Apellido:");

        jLabel34.setText("Documento:");

        jLabel35.setText("Fecha de nacimiento");

        jLabel36.setText("Sexo:");

        jLabel37.setText("Nacionalidad:");

        jLabel38.setText("Domicilio:");

        jLabel39.setText("Codigo postal:");

        jLabel40.setText("Localidad:");

        jLabel41.setText("Departamento:");

        jLabel42.setText("Numero de Celular:");

        jLabel43.setText("Correo electronico:");

        boxSexo.setModel(new DefaultComboBoxModel(SexoTipo.values()));

        jLabel44.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel44.setText("Datos Personales");

        jLabel45.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel45.setText("Datos Universitarios");

        jLabel46.setText("Carrera/s:");

        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LECTOR GENERAL", "ALUMNO", "DOCENTE" }));

        jLabel47.setText("Cargo:");

        botonRegistrarLector.setText("Registrar");
        botonRegistrarLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarLectorActionPerformed(evt);
            }
        });

        jLabel28.setText("Dia:");

        jLabel61.setText("Mes:");

        jLabel62.setText("Año:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(48, 48, 48))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel61)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel28)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel62)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(37, 37, 37)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel42)
                                .addComponent(jLabel41)
                                .addComponent(jLabel43))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel46))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(215, 215, 215))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jLabel44))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(botonRegistrarLector, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel38)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel43)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(botonRegistrarLector)
                .addGap(203, 203, 203))
        );

        jTabbedPane1.addTab("Registrar nuevo lector", jPanel5);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setText("Datos de la Obra");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel2.setText("Datos de Edicion");

        jLabel3.setText("Tipo de obra:");

        jLabel4.setText("Cantidad de ejemplares:");

        jLabel5.setText("Área tematica:");

        jLabel6.setText("Titulo:");

        jLabel7.setText("Subtitulo:");

        jLabel8.setText("Primer autor:");

        jLabel9.setText("Genero:");

        jLabel10.setText("Caracteristicas:");

        jLabel11.setText("ISBN:");

        boxTipoDeObra.setModel(new DefaultComboBoxModel(ObraTipo.values()));

        boxAreaTematica.setModel(new DefaultComboBoxModel(AreaTematicaTipo.values()));

        jLabel12.setText("Editorial:");

        jLabel13.setText("Pais de Edicion:");

        jLabel14.setText("Numero de edicion:");

        jLabel15.setText("Año:");

        jLabel16.setText("Volumenes:");

        jLabel17.setText("Cantidad de paginas:");

        jLabel18.setText("Idioma:");

        jLabel19.setText("Formato:");

        boxFormato.setModel(new DefaultComboBoxModel(FormatoTipo.values()));

        jLabel29.setText("Forma de adquisicion:");

        jLabel30.setText("Nombre de coleccion:");

        jLabel31.setText("ISBN de la coleccion:");

        jLabel48.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel48.setText("Informacion de Ubicación");

        jLabel49.setText("Numero de pasillo:");

        jLabel50.setText("Numero de estanteria:");

        jLabel51.setText("Numero de estante:");

        txtNumEstanteria.setToolTipText("");

        boxFormaAdquisicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compra", "Donacion", "Regalo" }));

        boxCaracteristicas.setModel(new DefaultComboBoxModel(CaracteristicaTipo.values()));

        botonCargarDatos.setText("Cargar datos");
        botonCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarDatosActionPerformed(evt);
            }
        });

        jLabel54.setText("Segundo autor:");

        jLabel55.setText("Tercer autor:");

        jLabel56.setText("Area de referencia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel56)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaReferencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtISBN)
                            .addComponent(txtCanEjemplares)
                            .addComponent(boxAreaTematica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxTipoDeObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxFormaAdquisicion, 0, 265, Short.MAX_VALUE)
                            .addComponent(txtTitulo)
                            .addComponent(txtSegundoAutor)
                            .addComponent(txtTercerAutor)
                            .addComponent(txtGenero)
                            .addComponent(boxCaracteristicas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtISBNColeccion)
                            .addComponent(txtNombreColeccion)
                            .addComponent(txtSubtitulo)
                            .addComponent(txtPrimerAutor))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPaisEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel14))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNumEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel19))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(boxFormato, 0, 150, Short.MAX_VALUE)
                                                    .addComponent(txtIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(txtCantidadPaginas, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(txtVolumenes, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(txtAnioEdicion)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel2)))
                                        .addGap(142, 142, 142))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel49)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtNumPasillo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel51)
                                                            .addComponent(jLabel50))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtNumEstanteria, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtNumEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(57, 57, 57))
                                            .addComponent(botonCargarDatos))
                                        .addContainerGap())))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel48)
                                .addGap(162, 162, 162))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPaisEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNumEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtAnioEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtVolumenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCantidadPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(boxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(txtNumPasillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(txtNumEstanteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(txtNumEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(boxTipoDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCanEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(boxAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(txtAreaReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtPrimerAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(txtSegundoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(txtTercerAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(boxCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(boxFormaAdquisicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtNombreColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtISBNColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(botonCargarDatos)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar Obra", jPanel1);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabelReadmeGitHub.setText("¡Si tenes dudas sobre el proyecto te recomendamos que leas el Readme en github! ahi vas a encontrar informacion util.");
        
        final String icono1 = "ico2.png";
        Path rutaRelativa = Paths.get(icono1);
        Path rutaAbsoluta = rutaRelativa.toAbsolutePath();
        String rutaAbsolutaString = rutaAbsoluta.toString();
        mona.setIcon(new javax.swing.ImageIcon(rutaAbsolutaString));
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel7.add(jLabelReadmeGitHub, gridBagConstraints);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        jPanel7.add(mona, gridBagConstraints);
          
        hyperlink.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        hyperlink.setForeground(new java.awt.Color(51, 62, 223));
        hyperlink.setText("Visitanos aca");
        hyperlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hyperlinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hyperlinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hyperlinkMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 20, 0);
        jPanel7.add(hyperlink, gridBagConstraints);

        jTabbedPane1.addTab("Ayuda", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarDatosActionPerformed
        // Se crea un objeto de tipo ubicacion para inicializar luego los ejemplares
        try {
            Ubicacion nuevaUbicacion = new Ubicacion(Integer.parseInt(this.txtNumPasillo.getText()),
                                                     Integer.parseInt(this.txtNumEstante.getText()),
                                                     Integer.parseInt(this.txtNumEstanteria.getText()));
                   
                   // Se crea un objeto de tipo edicion para poder inicializar los ejemplares
            Edicion nuevaEdicion = new Edicion(this.txtEditorial.getText(),
                                               this.txtPaisEdicion.getText(),
                                               Integer.parseInt(this.txtNumEdicion.getText()),
                                               Integer.parseInt(this.txtAnioEdicion.getText()),
                                               Integer.parseInt(this.txtVolumenes.getText()),
                                               Integer.parseInt(this.txtCantidadPaginas.getText()),
                                               this.txtIdioma.getText(),
                                               (FormatoTipo) this.boxFormato.getSelectedItem());


            // Se controla que las obras que se inglesa pertenece a una coleccion o no
            if(this.boxCaracteristicas.getSelectedItem().equals(CaracteristicaTipo.COLECCION)){
                if(comprobacionColeccion()) {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor rellene todos los campos, en el caso de las colecciones ISBN y Nombre son obligatorios");
                } else {
                
                   Coleccion nuevaColeccion = new Coleccion();
                   
                        nuevaColeccion.setTipoDeObra((ObraTipo) boxTipoDeObra.getSelectedItem());
                        nuevaColeccion.setAreaTematica((AreaTematicaTipo) boxAreaTematica.getSelectedItem());
                        nuevaColeccion.setCantidadEjemplares(Integer.parseInt(txtCanEjemplares.getText()));
                        nuevaColeccion.setTitulo(txtTitulo.getText());
                        nuevaColeccion.setSubtitulo(txtSubtitulo.getText());
                        nuevaColeccion.setPrimerAutor(txtPrimerAutor.getText());
                        nuevaColeccion.setSegundoAutor(txtSegundoAutor.getText());
                        nuevaColeccion.setTercerAutor(txtAreaReferencia.getText());
                        nuevaColeccion.setGenero(txtGenero.getText());
                        nuevaColeccion.setCaracteristica((CaracteristicaTipo) boxCaracteristicas.getSelectedItem());
                        nuevaColeccion.setAreaReferencia(txtAreaReferencia.getText());
                        nuevaColeccion.setIsbn(Integer.parseInt(txtISBN.getText()));
                        nuevaColeccion.setEdicion(nuevaEdicion);
                        nuevaColeccion.setNombreColeccion(txtNombreColeccion.getText());
                        nuevaColeccion.setIsbnColeccion(Integer.parseInt(txtISBNColeccion.getText()));

                   
                   for(int i = 1; i <= nuevaColeccion.getCantidadEjemplares(); i++) {
                       try {
                           Ejemplar ejemplarNuevo = new Ejemplar(new GregorianCalendar(),
                                   (String) this.boxFormaAdquisicion.getSelectedItem(),
                                   nuevaUbicacion,
                                   nuevaColeccion);
                           
                       } catch (BarcodeException ex) {
                           Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                       } catch (OutputException ex) {
                           Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                       } catch (IOException ex) {
                           Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                       }
                       
                   }
                   
                   datos.agregarObra(nuevaColeccion);
                   limpiarRegistrarObra();
                   javax.swing.JOptionPane.showMessageDialog(rootPane, "La obra se registro de forma correcta.");
                } 
            } else {
                if(comprobacionObra() == false) {
                
                    Obra nuevaObra = new Obra();
                
                    nuevaObra.setTipoDeObra((ObraTipo) boxTipoDeObra.getSelectedItem());
                    nuevaObra.setAreaTematica((AreaTematicaTipo) boxAreaTematica.getSelectedItem());
                    nuevaObra.setCantidadEjemplares(Integer.parseInt(txtCanEjemplares.getText()));
                    nuevaObra.setTitulo(txtTitulo.getText());
                    nuevaObra.setSubtitulo(txtSubtitulo.getText());
                    nuevaObra.setPrimerAutor(txtPrimerAutor.getText());
                    nuevaObra.setSegundoAutor(txtSegundoAutor.getText());
                    nuevaObra.setTercerAutor(txtTercerAutor.getText());
                    nuevaObra.setGenero(txtGenero.getText());
                    nuevaObra.setCaracteristica((CaracteristicaTipo) boxCaracteristicas.getSelectedItem());
                    nuevaObra.setAreaReferencia(txtAreaReferencia.getText());
                    nuevaObra.setIsbn(Integer.parseInt(txtISBN.getText()));
                    nuevaObra.setEdicion(nuevaEdicion);

                    for(int i = 1; i <= nuevaObra.getCantidadEjemplares(); i++) {
                        try {
                            Ejemplar ejemplarNuevo = new Ejemplar(new GregorianCalendar(),
                                                                  (String) this.boxFormaAdquisicion.getSelectedItem(),
                                                                  nuevaUbicacion,
                                                                  nuevaObra);
                        } catch (BarcodeException ex) {
                            Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (OutputException ex) {
                            Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                
                    datos.agregarObra(nuevaObra);
                    limpiarRegistrarObra();
                    
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "La obra se registro de forma correcta.");
                
                } else { javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor ingrese todos los datos."); }
            }
        } catch(NumberFormatException ex) {javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor ingrese los datos de forma correcta");}
    }//GEN-LAST:event_botonCargarDatosActionPerformed

    private void limpiarRegistrarObra() {
        this.txtNumPasillo.setText("");
        this.txtNumEstanteria.setText("");
        this.txtNumEstante.setText("");
        this.txtEditorial.setText("");
        this.txtNumEdicion.setText("");
        this.txtAnioEdicion.setText("");
        this.txtVolumenes.setText("");
        this.txtCantidadPaginas.setText("");
        this.txtIdioma.setText("");
        this.txtCanEjemplares.setText("");
        this.txtTitulo.setText("");
        this.txtSubtitulo.setText("");
        this.txtPrimerAutor.setText("");
        this.txtSegundoAutor.setText("");
        this.txtTercerAutor.setText("");
        this.txtGenero.setText("");
        this.txtAreaReferencia.setText("");
        this.txtISBN.setText("");
        this.txtISBNColeccion.setText("");
        this.txtNombreColeccion.setText("");
        this.txtPaisEdicion.setText("");
    }
    
    private boolean comprobacionObra() {
        return txtNumPasillo.getText().equals("") || txtNumEstanteria.getText().equals("") || txtNumEstante.getText().equals("") ||
               txtEditorial.getText().equals("") || txtNumEdicion.getText().equals("") || txtAnioEdicion.getText().equals("") ||
               txtVolumenes.getText().equals("") || txtCantidadPaginas.getText().equals("") || txtIdioma.getText().equals("") ||
               txtCanEjemplares.getText().equals("") || txtTitulo.getText().equals("") || txtSubtitulo.getText().equals("") ||
               txtPrimerAutor.getText().equals("") || txtGenero.getText().equals("") || txtAreaReferencia.getText().equals("") || txtISBN.getText().equals("");
    }
    
    private boolean comprobacionColeccion() {
        return txtNumPasillo.getText().equals("") || txtNumEstanteria.getText().equals("") || txtNumEstante.getText().equals("") ||
               txtEditorial.getText().equals("") || txtNumEdicion.getText().equals("") || txtAnioEdicion.getText().equals("") ||
               txtVolumenes.getText().equals("") || txtCantidadPaginas.getText().equals("") || txtIdioma.getText().equals("") ||
               txtCanEjemplares.getText().equals("") || txtTitulo.getText().equals("") || txtSubtitulo.getText().equals("") ||
               txtPrimerAutor.getText().equals("") || txtGenero.getText().equals("") || txtAreaReferencia.getText().equals("") ||
               txtISBN.getText().equals("") || txtISBNColeccion.getText().equals("") || txtNombreColeccion.getText().equals("");
    }
    
    private void botonRegistrarLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarLectorActionPerformed
        try{
            GregorianCalendar fechaNacimiento = new GregorianCalendar(Integer.parseInt(this.txtAnioNacimiento.getText()),
                                                                       Integer.parseInt(this.txtMesNacimiento.getText()),
                                                                       Integer.parseInt(this.txtDiaNacimiento.getText()));
        
            if(comprobacionLectorGeneral() == false) {
                if(this.boxCargo.getSelectedItem().equals("LECTOR GENERAL")) {
            
            
                    Lector nuevoLector = new Lector(this.txtNombre.getText(),
                                                    this.txtApellido.getText(),
                                                    Integer.parseInt(this.txtDocumento.getText()),
                                                    fechaNacimiento,
                                                    this.txtNacionalidad.getText(),
                                                    this.txtDomicilio.getText(),
                                                    Integer.parseInt(this.txtCodPostal.getText()),
                                                    this.txtLocalidad.getText(),
                                                    this.txtNumCelular.getText(),
                                                    this.txtCorreoElectronico.getText(),
                                                    (SexoTipo) this.boxSexo.getSelectedItem());
            
                    this.datos.agregarLector(nuevoLector);
                    limpiarRegistrarLector();
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Se registro al lector de manera exitosa.");
                }
            } else { javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor rellene todos los campos."); }
        
            if(comprobacionLectorFacultad() == false) {
                if(this.boxCargo.getSelectedItem().equals("ALUMNO")) {
                    Alumno nuevoAlumno = new Alumno(this.txtCarreras.getText(),
                                                    this.txtNombre.getText(),
                                                    this.txtApellido.getText(),
                                                    Integer.parseInt(this.txtDocumento.getText()),
                                                    fechaNacimiento,
                                                    this.txtNacionalidad.getText(),
                                                    this.txtDomicilio.getText(),
                                                    Integer.parseInt(this.txtCodPostal.getText()),
                                                    this.txtLocalidad.getText(),
                                                    this.txtNumCelular.getText(),
                                                    this.txtCorreoElectronico.getText(),
                                                    (SexoTipo) this.boxSexo.getSelectedItem());
        
                    this.datos.agregarLector(nuevoAlumno);
                    limpiarRegistrarLector();
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Se registro al lector de manera exitosa.");
                }
            
        
                if(this.boxCargo.getSelectedItem().equals("DOCENTE")) {            
                    Docente nuevoDocente = new Docente(this.txtCarreras.getText(),
                                                       this.txtNombre.getText(),
                                                       this.txtApellido.getText(),
                                                       Integer.parseInt(this.txtDocumento.getText()),
                                                       fechaNacimiento,
                                                       this.txtNacionalidad.getText(),
                                                       this.txtDomicilio.getText(),
                                                       Integer.parseInt(this.txtCodPostal.getText()),
                                                       this.txtLocalidad.getText(),
                                                       this.txtNumCelular.getText(),
                                                       this.txtCorreoElectronico.getText(),
                                                       (SexoTipo) this.boxSexo.getSelectedItem());
        
                    this.datos.agregarLector(nuevoDocente);
                    limpiarRegistrarLector();
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Se registro al lector de manera exitosa.");
                }
            }else { javax.swing.JOptionPane.showMessageDialog(rootPane, "El campo carrera es obligatorio para los Alumnos y Profesores."); }
        } catch(NumberFormatException ex) { javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor ingrese los datos de forma correcta."); }
    }//GEN-LAST:event_botonRegistrarLectorActionPerformed

    private void limpiarRegistrarLector() {
        this.txtCarreras.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtDocumento.setText("");
        this.txtNacionalidad.setText("");
        this.txtDomicilio.setText("");
        this.txtCodPostal.setText("");
        this.txtLocalidad.setText("");
        this.txtDepartamento.setText("");
        this.txtNumCelular.setText("");
        this.txtCorreoElectronico.setText("");
        this.txtAnioNacimiento.setText("");
        this.txtMesNacimiento.setText("");
        this.txtDiaNacimiento.setText("");
    }
    
    private boolean comprobacionLectorGeneral() {
        return txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDocumento.getText().equals("") ||
               txtNacionalidad.getText().equals("") || txtDomicilio.getText().equals("") || txtCodPostal.getText().equals("") ||
               txtLocalidad.getText().equals("") || txtDepartamento.getText().equals("") || txtNumCelular.getText().equals("") ||
               txtCorreoElectronico.getText().equals("") || txtAnioNacimiento.getText().equals("") || txtMesNacimiento.getText().equals("") ||
               txtDiaNacimiento.getText().equals("");
    }
    
    private boolean comprobacionLectorFacultad() {
        return txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDocumento.getText().equals("") ||
               txtNacionalidad.getText().equals("") || txtDomicilio.getText().equals("") || txtCodPostal.getText().equals("") ||
               txtLocalidad.getText().equals("") || txtDepartamento.getText().equals("") || txtNumCelular.getText().equals("") ||
               txtCorreoElectronico.getText().equals("") || txtAnioNacimiento.getText().equals("") || txtMesNacimiento.getText().equals("") ||
               txtDiaNacimiento.getText().equals("") || txtCarreras.getText().equals("");
    }
        
    private void botonRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarPrestamoActionPerformed
        // Se busca al lector segun el documento que se coloco, si no se lo encuentra devulve una referencua nula
        Lector lectorPrestamo = null;
        Ejemplar ejemplarPrestamo = null;
        try {
            lectorPrestamo = this.datos.buscarLector(Integer.parseInt(this.txtDocumentoLector.getText()));
            
            ejemplarPrestamo = this.datos.buscarEjemplar(this.txtCodEjemplar.getText());
            
            // Verifico que el lector no este multado
            if(lectorPrestamo.estaMultado()) {
                // Si el lector esta multado veo si su multa ya expiro, si es asi digo que no esta mas multado y le concedo el prestamo
                if(lectorPrestamo.getMultas().get(lectorPrestamo.cantidadMultas()).getFinalizacion().before(new GregorianCalendar())) {
                    lectorPrestamo.setEstaMultado(false);
                    
                    Prestamo nuevoPrestamo = new Prestamo(new GregorianCalendar(),
                                                          (PrestamoTipo) this.boxTipoDePrestamo.getSelectedItem(),
                                                          datos.getUsuarioLoguado(),
                                                          ejemplarPrestamo,
                                                          lectorPrestamo);
                    
                    datos.escribirDatosObra();
                    datos.escribirDatosLector();
                    
                    GregorianCalendar fechaPrestamo = nuevoPrestamo.getFechaInicio();
                    GregorianCalendar fechaDevolver = nuevoPrestamo.getFechaDevolucion();
                    
                    String fechaPrestamoString = Integer.toString(fechaPrestamo.get(Calendar.YEAR)) + "/" + Integer.toString(fechaPrestamo.get(Calendar.MONTH) + 1) + "/"
                            + Integer.toString(fechaPrestamo.get(Calendar.DAY_OF_MONTH));
                    
                    String fechaDevolverString = 
                              Integer.toString(fechaDevolver.get(Calendar.YEAR))+ "/"
                            + Integer.toString(fechaDevolver.get(Calendar.MONTH) + 1) + "/"
                            + Integer.toString(fechaDevolver.get(Calendar.DAY_OF_MONTH));
                    
                    limpiarPrestamo();
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Fecha del prestamo: " + fechaPrestamoString + "\n Prestamo cargado exitosamente.\n Fecha a devolver: " + fechaDevolverString);
                
                } else { javax.swing.JOptionPane.showMessageDialog(rootPane, "Este lector esta multado no se le puede realizar un prestamo."); }
            } else if(lectorPrestamo.estaMultado() == false){
                Prestamo nuevoPrestamo = new Prestamo(new GregorianCalendar(),
                                                      (PrestamoTipo) this.boxTipoDePrestamo.getSelectedItem(),
                                                      datos.getUsuarioLoguado(),
                                                      ejemplarPrestamo,
                                                      lectorPrestamo);
                
                datos.escribirDatosObra();
                datos.escribirDatosLector();
                GregorianCalendar fechaDevolver = nuevoPrestamo.getFechaDevolucion();
                GregorianCalendar fechaPrestamo = nuevoPrestamo.getFechaInicio();
                
                String fechaPrestamoString = Integer.toString(fechaPrestamo.get(Calendar.YEAR)) + "/" + Integer.toString(fechaPrestamo.get(Calendar.MONTH) + 1) + "/"
                            + Integer.toString(fechaPrestamo.get(Calendar.DAY_OF_MONTH));
                
                String fechaDevolverString = 
                          Integer.toString(fechaDevolver.get(Calendar.YEAR))+ "/"
                        + Integer.toString(fechaDevolver.get(Calendar.MONTH) + 1) + "/"
                        + Integer.toString(fechaDevolver.get(Calendar.DAY_OF_MONTH));
                
                limpiarPrestamo();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Fecha del prestamo: " + fechaPrestamoString + "\n Prestamo cargado exitosamente.\n Fecha a devolver: " + fechaDevolverString);
            } 
        } catch (LectorNoRegistradoError ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "El Lector no se encuentra registrado, por favor cargue sus datos.");
        } catch (EjemplarInexistenteError ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Codigo no valido, ese ejemplar no existe.");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Este lector se encuentra multado.");
        }
    }//GEN-LAST:event_botonRegistrarPrestamoActionPerformed
    
    private void limpiarPrestamo() {
        this.txtDocumentoLector.setText("");
        this.txtCodEjemplar.setText("");
    }
    
    private void botonRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarDevolucionActionPerformed
        new DialogDevolucionEjemplar(this, true, datos).setVisible(true);
    }//GEN-LAST:event_botonRegistrarDevolucionActionPerformed
    
    private void actualizarLista(List<?> lista) {
        DefaultListModel listModel = new DefaultListModel();
        
        for (Object o : lista) {
            listModel.addElement(o.toString());
        }
        
        this.ListaBusqueda.setModel(listModel);
    }
    
    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        switch (this.boxBusquedaTipo.getSelectedIndex()){
            case 0:
                //Lectores que no devolvieron sus obras.
                List<Lector> lectores = datos.devolucionesTardias();
                if(lectores.size() != 0){
                    actualizarLista(lectores);
                }else{
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "No hay lectores con devoluciones fuera de tiempo.");
                }
                break;
            case 1:
                // Obras mas solicitadas por alumnos y docentes
                List<Obra> solicitudesFacultad = datos.getSolicitudFacultad();
                
                actualizarLista(solicitudesFacultad);
                break;
            case 2:
                //Obras mas solicitadas por el público general.
                List<Obra> solicitudesGeneral = datos.getSolicitudGeneral();
                
                actualizarLista(solicitudesGeneral);
                break;
            case 3:
                //Ejemplares disponibles por area de referencia.
                if(this.txtBusquedaListado.getText().equals("") == false) {    
                    List<Ejemplar> disponiblesAreaReferencia = datos.disponibleAreaReferencia(this.txtBusquedaListado.getText());
                
                    actualizarLista(disponiblesAreaReferencia);
                    break;
                } else {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor introduzca un area tematica.");
                    break;
                }
            case 4:
                //Obras reservadas en una fecha determinada.
                try {
                    GregorianCalendar fechaPeriodoInicio = new GregorianCalendar(Integer.parseInt(txtAnioInicioPeriodo.getText()),
                                                                                 Integer.parseInt(txtMesInicioPeriodo.getText()),
                                                                                 Integer.parseInt(txtDiaInicioPeriodo.getText()));
                
                    List<Ejemplar> reservadosDesdeFecha = datos.ejemplaresReservados(fechaPeriodoInicio);
                
                    actualizarLista(reservadosDesdeFecha);
                    break;
                } catch(NumberFormatException ex) {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Valor para la fecha invalido.");
                    break;
                }
            case 5:
                //Lectores multados en un período de tiempo.
                try {
                    GregorianCalendar fechaInicio = new GregorianCalendar(Integer.parseInt(txtAnioInicioPeriodo.getText()),
                                                                          Integer.parseInt(txtMesInicioPeriodo.getText()),
                                                                          Integer.parseInt(txtDiaInicioPeriodo.getText()));
                
                    GregorianCalendar fechaFinalizacion = new GregorianCalendar(Integer.parseInt(txtAnioFinalPeriodo.getText()),
                                                                                Integer.parseInt(txtMesFinalPeriodo.getText()),
                                                                                Integer.parseInt(txtDiaFinalPeriodo.getText()));
                
                    List<Lector> multadosPeriodoDeTiempo = datos.periodoDeMulta(fechaInicio, fechaFinalizacion);
                
                    actualizarLista(multadosPeriodoDeTiempo);
                    break;
                } catch(NumberFormatException ex) {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Valor para la fecha invalido.");
                    break;
                }
            case 6:
                //Lectores por cantidad de multas aplicadas.
                List<Lector> ordenMultados = datos.getMultas();
                
                if(ordenMultados.isEmpty()){
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "No hay lectores multados.");
                    break;
                }
                actualizarLista(ordenMultados);
                break;
            case 7:
                //Obras de una editorial determinada.
                if(this.txtBusquedaListado.getText().equals("") == false) {
                    List<Obra> obrasPorEditorial = datos.getEditoriales(this.txtBusquedaListado.getText());
                
                    actualizarLista(obrasPorEditorial);
                    break;
                } else {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor introduzca una editorial.");
                    break;
                }

        }
    }//GEN-LAST:event_botonFiltrarActionPerformed

    public void esconderPeriodos() {
        this.lblTituloFinPeriodo.setVisible(false);
        this.lblTituloInicioPeriodo.setVisible(false);
        this.lblAnioFinalPeriodo.setVisible(false);
        this.lblAnioInicioPeriodo.setVisible(false);
        this.lblDiaFinalPeriodo.setVisible(false);
        this.lblDiaInicioPeriodo.setVisible(false);
        this.lblMesFinalPeriodo.setVisible(false);
        this.lblMesInicioPeriodo.setVisible(false);
        this.txtAnioFinalPeriodo.setVisible(false);
        this.txtAnioInicioPeriodo.setVisible(false);
        this.txtMesFinalPeriodo.setVisible(false);
        this.txtMesInicioPeriodo.setVisible(false);
        this.txtDiaFinalPeriodo.setVisible(false);
        this.txtDiaInicioPeriodo.setVisible(false);
    }
    
    public void mostrarPeriodos() {
        this.lblTituloFinPeriodo.setVisible(true);
        this.lblTituloInicioPeriodo.setVisible(true);
        this.lblAnioFinalPeriodo.setVisible(true);
        this.lblAnioInicioPeriodo.setVisible(true);
        this.lblDiaFinalPeriodo.setVisible(true);
        this.lblDiaInicioPeriodo.setVisible(true);
        this.lblMesFinalPeriodo.setVisible(true);
        this.lblMesInicioPeriodo.setVisible(true);
        this.txtAnioFinalPeriodo.setVisible(true);
        this.txtAnioInicioPeriodo.setVisible(true);
        this.txtMesFinalPeriodo.setVisible(true);
        this.txtMesInicioPeriodo.setVisible(true);
        this.txtDiaFinalPeriodo.setVisible(true);
        this.txtDiaInicioPeriodo.setVisible(true);
    }
    
    public void mostrarPeriodoInicio() {
        this.lblTituloInicioPeriodo.setVisible(true);
        this.lblAnioInicioPeriodo.setVisible(true);
        this.lblDiaInicioPeriodo.setVisible(true);
        this.lblMesInicioPeriodo.setVisible(true);
        this.txtAnioInicioPeriodo.setVisible(true);
        this.txtMesInicioPeriodo.setVisible(true);
        this.txtDiaInicioPeriodo.setVisible(true);
    }
    
    private void botonReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservacionActionPerformed
        new DialogReservacionEjemplar(this, true, datos).setVisible(true);
    }//GEN-LAST:event_botonReservacionActionPerformed

    private void botonRealizarObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarObservacionActionPerformed
        try {
                new DialogObservacionEjemplar(this, true, datos, tablaGestionEjemplar.getSelectedRow()).setVisible(true);
        } catch( Exception ex ) { javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un elemento."); }
    }//GEN-LAST:event_botonRealizarObservacionActionPerformed

    private void botonDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDarBajaActionPerformed
        if(tablaGestionEjemplar.getSelectedRow() != -1) {
            new DialogBajaEjemplar(this, true, datos, tablaGestionEjemplar.getSelectedRow()).setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un elemento.");
        }
    }//GEN-LAST:event_botonDarBajaActionPerformed

    private void boxBusquedaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBusquedaTipoActionPerformed
        switch (this.boxBusquedaTipo.getSelectedIndex()){
            case 0:
                esconderPeriodos();
                break;
            case 1:
                esconderPeriodos();
                break;
            case 2:
                esconderPeriodos();
                break;
            case 3:
                esconderPeriodos();
                break;
            case 4:
                mostrarPeriodoInicio();
                break;
            case 5:
                mostrarPeriodos();
                break;
            case 6:
                esconderPeriodos();
                break;
            case 7:
                esconderPeriodos();
                break;
        }
    }//GEN-LAST:event_boxBusquedaTipoActionPerformed

    private void botonActualizarListaGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarListaGestionActionPerformed
        actualizarTablaGestion();
    }//GEN-LAST:event_botonActualizarListaGestionActionPerformed

    private void hyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyperlinkMouseClicked
        // TODO add your handling code here:
        try {

            Desktop.getDesktop().browse(new URI("https://github.com/MartinBorgo/Taller-POO"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_hyperlinkMouseClicked

    private void hyperlinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyperlinkMouseExited
        // TODO add your handling code here:
        hyperlink.setText("Visitanos aca");
    }//GEN-LAST:event_hyperlinkMouseExited

    private void hyperlinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyperlinkMouseEntered
        // TODO add your handling code here:
        hyperlink.setText("<html><a href='https://github.com/MartinBorgo/Taller-POO'>Visitanos aca</a></html>");
    }//GEN-LAST:event_hyperlinkMouseEntered

    private void actualizarTablaGestion() {
        List<Ejemplar> ejemplares = datos.listaEjemplares();
        
        DefaultTableModel model = (DefaultTableModel) tablaGestionEjemplar.getModel();
        
        model.setRowCount(0);
        for (Ejemplar ej : ejemplares) {
            String estado = ej.isEnPrestamo() ? "En prestamo" : "Disponible";
            String fechaAd = ej.getFechaAdquisicion().get(Calendar.DAY_OF_MONTH) + "/" + ej.getFechaAdquisicion().get(Calendar.MONTH) + "/" + ej.getFechaAdquisicion().get(Calendar.YEAR);
            
            String [] fila = {
                    ej.getCodigoBarras(),
                    fechaAd,
                    ej.getFormaAdquisicion(),
                    estado,
                    ej.getUbicacion().toString()
                };
            
            model.addRow(fila);
        }
        
        this.tablaGestionEjemplar.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaBusqueda;
    private javax.swing.JButton botonActualizarListaGestion;
    private javax.swing.JButton botonCargarDatos;
    private javax.swing.JButton botonDarBaja;
    private javax.swing.JButton botonFiltrar;
    private javax.swing.JButton botonRealizarObservacion;
    private javax.swing.JButton botonRegistrarDevolucion;
    private javax.swing.JButton botonRegistrarLector;
    private javax.swing.JButton botonRegistrarPrestamo;
    private javax.swing.JButton botonReservacion;
    private javax.swing.JComboBox<String> boxAreaTematica;
    private javax.swing.JComboBox<String> boxBusquedaTipo;
    private javax.swing.JComboBox<String> boxCaracteristicas;
    private javax.swing.JComboBox<String> boxCargo;
    private javax.swing.JComboBox<String> boxFormaAdquisicion;
    private javax.swing.JComboBox<String> boxFormato;
    private javax.swing.JComboBox<String> boxSexo;
    private javax.swing.JComboBox<String> boxTipoDeObra;
    private javax.swing.JComboBox<String> boxTipoDePrestamo;
    private javax.swing.JLabel hyperlink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelReadmeGitHub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAnioFinalPeriodo;
    private javax.swing.JLabel lblAnioInicioPeriodo;
    private javax.swing.JLabel lblDiaFinalPeriodo;
    private javax.swing.JLabel lblDiaInicioPeriodo;
    private javax.swing.JLabel lblMesFinalPeriodo;
    private javax.swing.JLabel lblMesInicioPeriodo;
    private javax.swing.JLabel lblTituloFinPeriodo;
    private javax.swing.JLabel lblTituloInicioPeriodo;
    private javax.swing.JTable tablaGestionEjemplar;
    private javax.swing.JTextField txtAnioEdicion;
    private javax.swing.JTextField txtAnioFinalPeriodo;
    private javax.swing.JTextField txtAnioInicioPeriodo;
    private javax.swing.JTextField txtAnioNacimiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAreaReferencia;
    private javax.swing.JTextField txtBusquedaListado;
    private javax.swing.JTextField txtCanEjemplares;
    private javax.swing.JTextField txtCantidadPaginas;
    private javax.swing.JTextField txtCarreras;
    private javax.swing.JTextField txtCodEjemplar;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDiaFinalPeriodo;
    private javax.swing.JTextField txtDiaInicioPeriodo;
    private javax.swing.JTextField txtDiaNacimiento;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtDocumentoLector;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtISBNColeccion;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtMesFinalPeriodo;
    private javax.swing.JTextField txtMesInicioPeriodo;
    private javax.swing.JTextField txtMesNacimiento;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreColeccion;
    private javax.swing.JTextField txtNumCelular;
    private javax.swing.JTextField txtNumEdicion;
    private javax.swing.JTextField txtNumEstante;
    private javax.swing.JTextField txtNumEstanteria;
    private javax.swing.JTextField txtNumPasillo;
    private javax.swing.JTextField txtPaisEdicion;
    private javax.swing.JTextField txtPrimerAutor;
    private javax.swing.JTextField txtSegundoAutor;
    private javax.swing.JTextField txtSubtitulo;
    private javax.swing.JTextField txtTercerAutor;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVolumenes;
    private javax.swing.JLabel mona;
    // End of variables declaration//GEN-END:variables
}