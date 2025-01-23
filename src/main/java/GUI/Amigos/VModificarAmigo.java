package GUI.Amigos;

import BD.AmigoDAO;
import BD.GrupoDAO;
import Data.Amigo;
import java.util.List;
import javax.swing.JOptionPane;

public class VModificarAmigo extends javax.swing.JFrame {
    private VBuscarAmigo v;
    private AmigoDAO amigoDAO;
    private GrupoDAO grupoDAO;
    private int amigoId; 
    
    public VModificarAmigo(VBuscarAmigo v, AmigoDAO amigoDAO, GrupoDAO grupoDAO) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.v = v;
        this.amigoDAO = amigoDAO;
        this.grupoDAO = grupoDAO;
        cargarGrupos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aficionesField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnModificarAmigo = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();

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
        titulo.setText("Modifique los datos de su amigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        nombreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dirección:");

        direccionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Teléfono:");

        telefonoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Aficiones:");

        aficionesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aficionesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aficionesFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Grupo:");

        btnModificarAmigo.setBackground(new java.awt.Color(51, 51, 51));
        btnModificarAmigo.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        btnModificarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarAmigo.setText("Modificar Amigo");
        btnModificarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarAmigoMouseClicked(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAtras)
                        .addGap(58, 58, 58)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 322, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombreField, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                        .addComponent(telefonoField)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aficionesField))))
                        .addGap(245, 245, 245))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAtras)
                    .addComponent(titulo))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aficionesField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122)
                .addComponent(btnModificarAmigo)
                .addGap(55, 55, 55))
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
        v.setVisible(true);
    }//GEN-LAST:event_botonAtrasMouseClicked

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void direccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFieldActionPerformed

    private void btnModificarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarAmigoMouseClicked
        modificarAmigo();
    }//GEN-LAST:event_btnModificarAmigoMouseClicked

    private void aficionesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aficionesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aficionesFieldActionPerformed

    void rellenarCampos(String nombre, String direccion, String telefono, String aficiones, String grupo) {
        nombreField.setText(nombre);
        direccionField.setText(direccion);
        telefonoField.setText(telefono);
        aficionesField.setText(aficiones);
        comboBox.setSelectedItem(grupo);
    }

    public void modificarAmigo() {
        String nombre = nombreField.getText().trim();
        String direccion = direccionField.getText().trim();
        String telefono = telefonoField.getText().trim();
        String aficiones = aficionesField.getText().trim();
        String grupoSeleccionado = (String) comboBox.getSelectedItem();

        if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || aficiones.isEmpty() || grupoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }

        int grupoId = grupoDAO.obtenerIdPorNombre(grupoSeleccionado);
        Amigo amigo = new Amigo(amigoId, nombre, direccion, telefono, aficiones, grupoId, "Sin vacaciones");
        amigoDAO.actualizarAmigo(amigo);

        JOptionPane.showMessageDialog(this, "Amigo modificado exitosamente.");
    }

    private void cargarGrupos() {
        try {
            List<String> grupos = amigoDAO.obtenerGrupos(); 
            comboBox.removeAllItems();
            for (String grupo : grupos) {
                comboBox.addItem(grupo); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los grupos: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aficionesField;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton btnModificarAmigo;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField direccionField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
