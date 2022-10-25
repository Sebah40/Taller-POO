/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz;

import gestion.datos.GestionDatos;
import gestion.inventario.Ejemplar;
import gestion.inventario.Ubicacion;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 
 * @author Grupo2
 */
public class DialogBajaEjemplar extends javax.swing.JDialog {
    private GestionDatos datos;
    private Integer indice;
    
    public DialogBajaEjemplar(java.awt.Frame parent, boolean modal, GestionDatos datos, Integer indice) {
        super(parent, modal);
        this.datos = datos;
        this.indice = indice;
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaDeTexto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPasilloBaja = new javax.swing.JTextField();
        txtEstanteriaBaja = new javax.swing.JTextField();
        txtEstanteBaja = new javax.swing.JTextField();
        botonDarBaja = new javax.swing.JButton();
        botonCerrarVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Numero de estante:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jLabel1, gridBagConstraints);

        cajaDeTexto.setColumns(20);
        cajaDeTexto.setRows(5);
        jScrollPane1.setViewportView(cajaDeTexto);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel2.setText("Ubicación de baja");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Numero de pasillo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel4.setText("Motivo de baja");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Numero de estanteria:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel1.add(txtPasilloBaja, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel1.add(txtEstanteriaBaja, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel1.add(txtEstanteBaja, gridBagConstraints);

        botonDarBaja.setText("Hecho");
        botonDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDarBajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(botonDarBaja, gridBagConstraints);

        botonCerrarVentana.setText("Cancelar");
        botonCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarVentanaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(botonCerrarVentana, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDarBajaActionPerformed
        try{
            List<Ejemplar> ejemplares = datos.listaEjemplares();
        
            Ubicacion ubicacionBaja = new Ubicacion(Integer.parseInt(txtPasilloBaja.getText()),
                                                    Integer.parseInt(txtEstanteriaBaja.getText()),
                                                    Integer.parseInt(txtEstanteBaja.getText()));
        
            ejemplares.get(indice).setFechaBaja(new GregorianCalendar());
            ejemplares.get(indice).setMotivoBaja(cajaDeTexto.getText());
            ejemplares.get(indice).setUbicacionBaja(ubicacionBaja);
            
            datos.escribirDatosObra();
            this.setVisible(false);
            
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Se a dado de baja un ejemplar.");
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Por favor introduzca valores validos para la ubicacion.");
        }
    }//GEN-LAST:event_botonDarBajaActionPerformed

    private void botonCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVentanaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarVentanaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarVentana;
    private javax.swing.JButton botonDarBaja;
    private javax.swing.JTextArea cajaDeTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEstanteBaja;
    private javax.swing.JTextField txtEstanteriaBaja;
    private javax.swing.JTextField txtPasilloBaja;
    // End of variables declaration//GEN-END:variables
}
