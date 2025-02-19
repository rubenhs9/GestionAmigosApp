/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Amigos;

import BD.AmigoDAO;
import BD.GestorBD;
import BD.GrupoDAO;
import Data.Amigo;
import java.util.List;
import javax.swing.JOptionPane;

public class VAgregarAmigos extends javax.swing.JFrame {
    VGestionAmigos v;
    
    private GestorBD gestorBD;
    private AmigoDAO amigoDAO;
    private GrupoDAO grupoDAO;
    private VGestionAmigos vGestionAmigos;
    
    public VAgregarAmigos(GestorBD gestorBD, VGestionAmigos vGestionAmigos) {
        this.gestorBD = gestorBD;
        this.amigoDAO = new AmigoDAO(gestorBD);
        this.grupoDAO = new GrupoDAO(gestorBD);
        this.vGestionAmigos = vGestionAmigos;

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        cargarGruposEnComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldAficiones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonAgregarAmigo = new javax.swing.JButton();
        comboBoxGrupos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        botonAtras.setBackground(new java.awt.Color(51, 51, 51));
        botonAtras.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atrás");
        botonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtrasMouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Agrege a su amigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        textFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dirección:");

        textFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDireccionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Teléfono:");

        textFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Aficiones:");

        textFieldAficiones.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Grupo:");

        botonAgregarAmigo.setBackground(new java.awt.Color(51, 51, 51));
        botonAgregarAmigo.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonAgregarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarAmigo.setText("Agregar Amigo");
        botonAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarAmigoMouseClicked(evt);
            }
        });

        comboBoxGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        
        textFieldNombre.setFont(new java.awt.Font("Lato", java.awt.Font.ITALIC, 30));
        textFieldDireccion.setFont(new java.awt.Font("Lato", java.awt.Font.ITALIC, 30));
        textFieldTelefono.setFont(new java.awt.Font("Lato", java.awt.Font.ITALIC, 30));
        textFieldAficiones.setFont(new java.awt.Font("Lato", java.awt.Font.ITALIC, 30));
        comboBoxGrupos.setFont(new java.awt.Font("Lato", java.awt.Font.ITALIC, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAtras)
                        .addGap(200, 200, 200)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 154, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(340, 340, 340))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(textFieldTelefono)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textFieldDireccion))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(54, 54, 54)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldAficiones, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                            .addComponent(comboBoxGrupos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(298, 298, 298))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(titulo)))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldAficiones, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(botonAgregarAmigo)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseClicked
        this.dispose();
        vGestionAmigos.setVisible(true);
    }//GEN-LAST:event_botonAtrasMouseClicked

    private void botonAgregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarAmigoMouseClicked
        agregarAmigo();
    }//GEN-LAST:event_botonAgregarAmigoMouseClicked

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void textFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDireccionActionPerformed

    private void cargarGruposEnComboBox() {
        List<String> nombresDeGrupos = grupoDAO.obtenerNombresDeGrupos();
        comboBoxGrupos.removeAllItems();
        for (String nombreGrupo : nombresDeGrupos) {
            comboBoxGrupos.addItem(nombreGrupo);
        }
    }
    
    private void agregarAmigo() {
        String nombre = textFieldNombre.getText().trim();
        String direccion = textFieldDireccion.getText().trim();
        String telefono = textFieldTelefono.getText().trim();
        String aficiones = textFieldAficiones.getText().trim();
        String grupoSeleccionado = (String) comboBoxGrupos.getSelectedItem();

        if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || aficiones.isEmpty() || grupoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. ", "¡Cuidado!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (amigoDAO.existeTelefono(telefono)) {
            JOptionPane.showMessageDialog(null, "El teléfono ya está registrado con otro amigo. ", "¡Cuidado!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int grupoId = grupoDAO.obtenerIdPorNombre(grupoSeleccionado);
        Amigo amigo = new Amigo(0, nombre, direccion, telefono, aficiones, grupoId, "Sin vacaciones");
        amigoDAO.insertarAmigo(amigo);

        JOptionPane.showMessageDialog(null, "Tu amigo " + nombre + " ha sido agregado con éxito. ", "Información", JOptionPane.INFORMATION_MESSAGE);
        limpiarCampos();
    }
    
    private void limpiarCampos() {
        textFieldNombre.setText("");
        textFieldDireccion.setText("");
        textFieldTelefono.setText("");
        textFieldAficiones.setText("");
        comboBoxGrupos.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarAmigo;
    private javax.swing.JButton botonAtras;
    private javax.swing.JComboBox<String> comboBoxGrupos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldAficiones;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
