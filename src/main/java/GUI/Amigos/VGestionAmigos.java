
package GUI.Amigos;

import BD.GestorBD;
import GUI.VPal;

/**
 *
 * @author Rubén
 */
public class VGestionAmigos extends javax.swing.JFrame {

    VPal v;
    private GestorBD gestorBD;
    VGestionAmigos vGestionAmigos;
    
    public VGestionAmigos(GestorBD gestorBD, VPal v) {
        this.gestorBD = gestorBD;
        this.v = v;
        initComponents();
        setLocationRelativeTo(null);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        botonaAgregar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 0, 50));

        botonaAgregar.setBackground(new java.awt.Color(51, 51, 51));
        botonaAgregar.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        botonaAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonaAgregar.setText("Agregar Amigo");
        botonaAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonaAgregar.setPreferredSize(new java.awt.Dimension(431, 31));
        botonaAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonaAgregarMouseClicked(evt);
            }
        });
        botonaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonaAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(botonaAgregar);

        botonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscar.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar Amigo");
        botonBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });
        jPanel3.add(botonBuscar);

        botonAtras.setBackground(new java.awt.Color(51, 51, 51));
        botonAtras.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atrás");
        botonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonaAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonaAgregarMouseClicked
       VAgregarAmigos amigos = new VAgregarAmigos(gestorBD, this);
        amigos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonaAgregarMouseClicked

    private void botonaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonaAgregarActionPerformed

    private void botonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseClicked
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_botonAtrasMouseClicked

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        VBuscarAmigo amigos = new VBuscarAmigo(this, gestorBD);
        amigos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBuscarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonaAgregar;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
