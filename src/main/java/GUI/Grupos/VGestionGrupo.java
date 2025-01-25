/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Grupos;

import BD.GestorBD;
import GUI.Amigos.VAgregarAmigos;
import GUI.Amigos.VBuscarAmigo;
import GUI.VPal;

/**
 *
 * @author Rubén
 */
public class VGestionGrupo extends javax.swing.JFrame {
    
    VPal v;
    private GestorBD gestorBD;
    private VBuscarGrupo vb;
    
    public VGestionGrupo(GestorBD gestorBD, VPal v) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.v = v;
        this.gestorBD =  gestorBD;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        botonAgregar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 0, 50));

        botonAgregar.setBackground(new java.awt.Color(51, 51, 51));
        botonAgregar.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("Agegar Grupo");
        botonAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonAgregar.setPreferredSize(new java.awt.Dimension(431, 31));
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(botonAgregar);

        botonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscar.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar Grupo");
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

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        VAgregarGrupo amigos = new VAgregarGrupo( gestorBD,this);
        amigos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseClicked
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_botonAtrasMouseClicked

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        VBuscarGrupo amigos = new VBuscarGrupo(this, gestorBD);
        amigos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
