package GUI;

import BD.GestorBD;
import GUI.Amigos.VGestionAmigos;
import GUI.Grupos.VGestionGrupo;


/**
 *
 * @author Rubén
 */
public class VPal extends javax.swing.JFrame {
    private GestorBD gestorBD;
    
    public VPal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        gestorBD = new GestorBD("miBaseDeDatos");
        gestorBD.conectarBDD(); // Conectar la base de datos
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        botonGestionarAlumno = new javax.swing.JButton();
        botonGestionarGrupos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 0, 50));

        botonGestionarAlumno.setBackground(new java.awt.Color(51, 51, 51));
        botonGestionarAlumno.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        botonGestionarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        botonGestionarAlumno.setText("Gestionar Amigos");
        botonGestionarAlumno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonGestionarAlumno.setPreferredSize(new java.awt.Dimension(431, 31));
        botonGestionarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGestionarAlumnoMouseClicked(evt);
            }
        });
        botonGestionarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarAlumnoActionPerformed(evt);
            }
        });
        jPanel3.add(botonGestionarAlumno);

        botonGestionarGrupos.setBackground(new java.awt.Color(51, 51, 51));
        botonGestionarGrupos.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        botonGestionarGrupos.setForeground(new java.awt.Color(255, 255, 255));
        botonGestionarGrupos.setText("Gestionar Grupos");
        botonGestionarGrupos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonGestionarGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGestionarGruposMouseClicked(evt);
            }
        });
        botonGestionarGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarGruposActionPerformed(evt);
            }
        });
        jPanel3.add(botonGestionarGrupos);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FriendsApp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGestionarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGestionarAlumnoActionPerformed

    private void botonGestionarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGestionarAlumnoMouseClicked
        
    VGestionAmigos gAmigos = new VGestionAmigos(gestorBD, this); // Pasamos GestorBD y VPal
    gAmigos.setVisible(true); // Mostrar la nueva ventana
    this.dispose(); // Ocultar la ventana principal
        
    }//GEN-LAST:event_botonGestionarAlumnoMouseClicked

    private void botonGestionarGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarGruposActionPerformed
        VGestionGrupo gGrupo = new VGestionGrupo(gestorBD, this);
        gGrupo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonGestionarGruposActionPerformed

    private void botonGestionarGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGestionarGruposMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGestionarGruposMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGestionarAlumno;
    private javax.swing.JButton botonGestionarGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
