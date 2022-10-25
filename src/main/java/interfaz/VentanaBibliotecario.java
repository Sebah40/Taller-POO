/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import enumeraciones.PrestamoTipo;
import enumeraciones.SexoTipo;
import excepciones.EjemplarInexistenteError;
import excepciones.LectorNoRegistradoError;
import gestion.datos.GestionDatos;
import gestion.inventario.Ejemplar;
import gestion.inventario.Obra;
import gestion.inventario.Prestamo;
import gestion.personas.Alumno;
import gestion.personas.Docente;
import gestion.personas.Lector;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Grupo 2
 */
public class VentanaBibliotecario extends javax.swing.JFrame {
    private GestionDatos datos;

    public VentanaBibliotecario(GestionDatos datos) {
        super("Gestion de Biblioteca");
        this.datos = datos;
        initComponents();
        esconderPeriodos();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaBusqueda = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        boxBusquedaTipo = new javax.swing.JComboBox<>();
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
        txtMesInicioPeriodo = new javax.swing.JTextField();
        txtAnioInicioPeriodo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxTipoDePrestamo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCodEjemplar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDocumentoLector = new javax.swing.JTextField();
        botonRegistrarPrestamo = new javax.swing.JButton();
        botonRegistrarDevolucion = new javax.swing.JButton();
        botonReservacionEjemplar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
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
        jLabel24 = new javax.swing.JLabel();
        boxCargo = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txtCarreras = new javax.swing.JTextField();
        botonRegistrarLector = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDiaNacimiento = new javax.swing.JTextField();
        txtMesNacimiento = new javax.swing.JTextField();
        txtAnioNacimiento = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        hyperlink = new javax.swing.JLabel();
        fotoMona = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(ListaBusqueda);

        jLabel1.setText("Filtrar por:");

        boxBusquedaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lectores no devolvieron obras.", "Obras mas solicitadas alumnos/docentes.", "Obras solicitadas por publico general.", "Ejemplares disponibles por area referencia.", "Obras reservadas en una fecha determinada.", "Lectores multados en un periodo de tiempo.", "Lectores por cantidad de multas aplicadas.", "Obras de una editorial determinada." }));
        boxBusquedaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBusquedaTipoActionPerformed(evt);
            }
        });

        botonFiltrar.setText("Filtrar");
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });

        lblTituloInicioPeriodo.setText("Inicio de periodo");

        lblTituloFinPeriodo.setText("Final de relleno");

        lblDiaInicioPeriodo.setText("Dia:");

        lblMesInicioPeriodo.setText("Mes:");

        lblAnioInicioPeriodo.setText("Año:");

        lblDiaFinalPeriodo.setText("Dia:");

        lblMesFinalPeriodo.setText("Mes:");

        lblAnioFinalPeriodo.setText("Año:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloInicioPeriodo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMesInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDiaInicioPeriodo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDiaInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtAnioInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloFinPeriodo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDiaFinalPeriodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAnioFinalPeriodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnioFinalPeriodo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMesFinalPeriodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMesFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(294, 294, 294))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxBusquedaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusquedaListado, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnioInicioPeriodo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMesInicioPeriodo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(843, 843, 843))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxBusquedaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFiltrar)
                    .addComponent(txtBusquedaListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloInicioPeriodo)
                    .addComponent(lblTituloFinPeriodo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaInicioPeriodo)
                    .addComponent(lblDiaFinalPeriodo)
                    .addComponent(txtDiaFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMesInicioPeriodo)
                    .addComponent(lblMesFinalPeriodo)
                    .addComponent(txtMesFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnioFinalPeriodo)
                    .addComponent(txtAnioFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnioInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnioInicioPeriodo))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listado", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel4.setText("Informacion del Prestamo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 322, -1));

        jLabel5.setText("Tipo de prestamo:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        boxTipoDePrestamo.setModel(new DefaultComboBoxModel(PrestamoTipo.values()));
        jPanel2.add(boxTipoDePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 189, -1));

        jLabel6.setText("Codigo de ejemplar:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));
        jPanel2.add(txtCodEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 189, -1));

        jLabel7.setText("Documento del lector:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));
        jPanel2.add(txtDocumentoLector, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 189, -1));

        botonRegistrarPrestamo.setText("Registrar prestamo");
        botonRegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPrestamoActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegistrarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        botonRegistrarDevolucion.setText("Registrar devolucion");
        botonRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarDevolucionActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegistrarDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        botonReservacionEjemplar.setText("Realizar reservacion");
        botonReservacionEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservacionEjemplarActionPerformed(evt);
            }
        });
        jPanel2.add(botonReservacionEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jTabbedPane1.addTab("Prestamo", jPanel2);

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel10.setText("Datos Personales");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel11.setText("Datos Universitarios");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Apellido:");

        jLabel14.setText("Documento:");

        jLabel15.setText("Fecha de nacimiento");

        jLabel16.setText("Sexo:");

        jLabel17.setText("Nacionalidad:");

        jLabel18.setText("Domicilio:");

        jLabel19.setText("Codigo postal:");

        jLabel20.setText("Localidad:");

        jLabel21.setText("Departamento:");

        jLabel22.setText("Numero celular:");

        jLabel23.setText("Correo electronico:");

        boxSexo.setModel(new DefaultComboBoxModel(SexoTipo.values()));

        jLabel24.setText("Cargo:");

        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LECTOR GENERAL", "ALUMNO", "DOCENTE" }));

        jLabel25.setText("Carrera/s:");

        botonRegistrarLector.setText("Registrar");
        botonRegistrarLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarLectorActionPerformed(evt);
            }
        });

        jLabel2.setText("Dia:");

        jLabel3.setText("Mes:");

        jLabel8.setText("Año:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtDocumento)
                            .addComponent(boxSexo, 0, 168, Short.MAX_VALUE)
                            .addComponent(txtNacionalidad)
                            .addComponent(txtDomicilio))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDiaNacimiento)
                                                .addComponent(txtMesNacimiento)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtAnioNacimiento)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCarreras)
                            .addComponent(boxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(botonRegistrarLector, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel10)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(botonRegistrarLector)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar nuevo lector", jPanel3);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel9.setText("¡Si tenes dudas sobre el proyecto te recomendamos que leas el Readme en github! ahi vas a encontrar informacion util.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        jPanel4.add(jLabel9, gridBagConstraints);

        hyperlink.setForeground(new java.awt.Color(51, 62, 223));
        hyperlink.setText("¡Visitanos aca!");
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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jPanel4.add(hyperlink, gridBagConstraints);
        
                final String icono1 = "ico2.png";
        Path rutaRelativa = Paths.get(icono1);
        Path rutaAbsoluta = rutaRelativa.toAbsolutePath();
        String rutaAbsolutaString = rutaAbsoluta.toString();
        fotoMona.setIcon(new javax.swing.ImageIcon(rutaAbsolutaString));
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        jPanel4.add(fotoMona, gridBagConstraints);

        jTabbedPane1.addTab("Ayuda", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        switch (this.boxBusquedaTipo.getSelectedIndex()){
            case 0:
                //Lectores que no devolvieron sus obras.
                List<Lector> lectores = datos.devolucionesTardias();
                
                actualizarLista(lectores);
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

    private void botonRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarDevolucionActionPerformed
        new DialogDevolucionEjemplar(this, true, datos).setVisible(true);
    }//GEN-LAST:event_botonRegistrarDevolucionActionPerformed

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
                    
                    String fechaDevolverString = Integer.toString(fechaDevolver.get(Calendar.YEAR)) + "/" + Integer.toString(fechaDevolver.get(Calendar.MONTH) + 1) + "/" 
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
                    
                    GregorianCalendar fechaPrestamo = nuevoPrestamo.getFechaInicio();
                    GregorianCalendar fechaDevolver = nuevoPrestamo.getFechaDevolucion();
                    
                    String fechaPrestamoString = Integer.toString(fechaPrestamo.get(Calendar.YEAR)) + "/" + Integer.toString(fechaPrestamo.get(Calendar.MONTH) + 1) + "/"
                            + Integer.toString(fechaPrestamo.get(Calendar.DAY_OF_MONTH));
                    
                    String fechaDevolverString = Integer.toString(fechaDevolver.get(Calendar.YEAR))+ "/" + Integer.toString(fechaDevolver.get(Calendar.MONTH) + 1) + "/" 
                            + Integer.toString(fechaDevolver.get(Calendar.DAY_OF_MONTH));                
                
                    datos.escribirDatosObra();
                    datos.escribirDatosLector();
                    limpiarPrestamo();
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Fecha del prestamo: " + fechaPrestamoString + "\n Prestamo cargado exitosamente.\n Fecha a devolver: " + fechaDevolverString);
            } 
        } catch (LectorNoRegistradoError ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "El Lector no se encuentra registrado, por favor cargue sus datos.");
        } catch (EjemplarInexistenteError ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Codigo no valido, ese ejemplar no existe.");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor rellene todos los campos.");
        } 
    }//GEN-LAST:event_botonRegistrarPrestamoActionPerformed

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
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Se a registrado el lector de manera exitosa.");
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
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Se a registrado el lector de manera exitosa.");
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
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Se a registrado el lector de manera exitosa.");
                }
            }else { javax.swing.JOptionPane.showMessageDialog(rootPane, "El campo carrera es obligatorio para los Alumnos y Profesores."); }
        } catch(NumberFormatException ex) { javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor ingrese los datos de forma correcta."); }
    }//GEN-LAST:event_botonRegistrarLectorActionPerformed

    private void botonReservacionEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservacionEjemplarActionPerformed
        new DialogReservacionEjemplar(this, true, datos).setVisible(true);
    }//GEN-LAST:event_botonReservacionEjemplarActionPerformed

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

    private void hyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyperlinkMouseClicked
        // TODO add your handling code here:
        try {

            Desktop.getDesktop().browse(new URI("https://github.com/MartinBorgo/Taller-POO"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_hyperlinkMouseClicked

    private void hyperlinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyperlinkMouseEntered
        // TODO add your handling code here:
        hyperlink.setText("<html><a href='https://github.com/MartinBorgo/Taller-POO'>Visitanos aca</a></html>");
    }//GEN-LAST:event_hyperlinkMouseEntered

    private void hyperlinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyperlinkMouseExited
        // TODO add your handling code here:
        hyperlink.setText("Visitanos aca");
    }//GEN-LAST:event_hyperlinkMouseExited

    private void actualizarLista(List<?> lista) {
        DefaultListModel listModel = new DefaultListModel();
        
        for (Object o : lista) {
            listModel.addElement(o.toString());
        }
        
        this.ListaBusqueda.setModel(listModel);
    }
    
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
    
    private void limpiarPrestamo() {
        this.txtDocumentoLector.setText("");
        this.txtCodEjemplar.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaBusqueda;
    private javax.swing.JButton botonFiltrar;
    private javax.swing.JButton botonRegistrarDevolucion;
    private javax.swing.JButton botonRegistrarLector;
    private javax.swing.JButton botonRegistrarPrestamo;
    private javax.swing.JButton botonReservacionEjemplar;
    private javax.swing.JComboBox<String> boxBusquedaTipo;
    private javax.swing.JComboBox<String> boxCargo;
    private javax.swing.JComboBox<String> boxSexo;
    private javax.swing.JComboBox<String> boxTipoDePrestamo;
    private javax.swing.JLabel fotoMona;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAnioFinalPeriodo;
    private javax.swing.JLabel lblAnioInicioPeriodo;
    private javax.swing.JLabel lblDiaFinalPeriodo;
    private javax.swing.JLabel lblDiaInicioPeriodo;
    private javax.swing.JLabel lblMesFinalPeriodo;
    private javax.swing.JLabel lblMesInicioPeriodo;
    private javax.swing.JLabel lblTituloFinPeriodo;
    private javax.swing.JLabel lblTituloInicioPeriodo;
    private javax.swing.JTextField txtAnioFinalPeriodo;
    private javax.swing.JTextField txtAnioInicioPeriodo;
    private javax.swing.JTextField txtAnioNacimiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBusquedaListado;
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
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtMesFinalPeriodo;
    private javax.swing.JTextField txtMesInicioPeriodo;
    private javax.swing.JTextField txtMesNacimiento;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCelular;
    // End of variables declaration//GEN-END:variables
}
