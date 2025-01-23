
package GUI.Amigos;

import BD.AmigoDAO;
import BD.GestorBD;
import BD.GrupoDAO;
import Data.Amigo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rubén
 */
public class VBuscarAmigo extends javax.swing.JFrame {
    private VModificarAmigo m;
    private VGestionAmigos v;
    private GestorBD gestorBD;
    private AmigoDAO amigoDAO;
    private GrupoDAO grupoDAO;
    private Amigo amigo;
    private VGestionAmigos vGestionAmigos;
   
    public VBuscarAmigo(VGestionAmigos v, GestorBD gestorBD) {
        this.gestorBD = gestorBD;
        this.amigoDAO = new AmigoDAO(gestorBD);
        this.grupoDAO = new GrupoDAO(gestorBD);
        this.vGestionAmigos = vGestionAmigos;
        minitComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.v = v;
    }

    private void minitComponents(){
        

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        botonBorrar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        fieldConsultas = new java.awt.TextArea();

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
        titulo.setText("Consulte a sus amigos");

        buscador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscador.setText("ID o Nombre del Amigo");
        buscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (buscador.getText().equals("ID o Nombre del Amigo")) {
                    buscador.setText(""); // Limpiar texto predeterminado
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (buscador.getText().isEmpty()) {
                    buscador.setText("ID o Nombre del Amigo"); // Restaurar texto predeterminado
                }
            }
        });

        botonBorrar.setBackground(new java.awt.Color(125, 24, 24));
        botonBorrar.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        botonBorrar.setText("Borrar");
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBorrarMouseClicked(evt);
            }
        });
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        
        
        botonModificar.setBackground(new java.awt.Color(51, 51, 51));
        botonModificar.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar");
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(fieldConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(botonAtras))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscador)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(fieldConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(189, 189, 189))
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
    fieldConsultas.setFont(new java.awt.Font("Lato", java.awt.Font.BOLD, 30));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        botonBorrar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        fieldConsultas = new java.awt.TextArea();

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
        titulo.setText("Consulte a sus amigos");

        buscador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscador.setText("ID o Nombre del Amigo");
        buscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscadorFocusLost(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(125, 24, 24));
        botonBorrar.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        botonBorrar.setText("Borrar");
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBorrarMouseClicked(evt);
            }
        });
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(51, 51, 51));
        botonModificar.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar");
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        fieldConsultas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(fieldConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(botonAtras))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscador)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(fieldConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(189, 189, 189))
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

    private void botonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarMouseClicked

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        String criterio = buscador.getText().trim();
        amigoDAO.borrarAmigo(criterio);
        fieldConsultas.setText("Amigo borrado conrrectamente");
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
    buscarAmigo();
    
    }//GEN-LAST:event_botonBuscarMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        String criterio = buscador.getText();
        List<String> resultados = amigoDAO.buscarAmigosConGrupoYDestino(criterio);

        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontró ningún amigo con ese criterio.");
            return;
        }

        String datosAmigo = resultados.get(0); 
        System.out.println("Datos del amigo: " + datosAmigo); // DEPURACION ///////////////////
        String[] lineas = datosAmigo.split("\n"); 

        String nombre = obtenerValorCampo(lineas, "Nombre:");
        String direccion = obtenerValorCampo(lineas, "Dirección:");
        String telefono = obtenerValorCampo(lineas, "Teléfono:");
        String aficiones = obtenerValorCampo(lineas, "Aficiones:");
        String grupo = obtenerValorCampo(lineas, "Grupo:");

        // DEPURACION ///////////////////
        String idAmigoStr = obtenerValorCampo(lineas, "ID:");
        System.out.println("Valor de ID extraído: " + idAmigoStr); 

        int idAmigo = -1; 
        try {
            idAmigo = Integer.parseInt(idAmigoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener un ID válido.");
            return;
        }

                // DEPURACION ///////////////////
        System.out.println("ID convertido: " + idAmigo); // Depuración

        if (idAmigo == -1) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener el ID del amigo.");
            return;
        }

        VModificarAmigo ventanaModificacion = new VModificarAmigo(gestorBD, this, grupoDAO, amigoDAO, idAmigo);

        ventanaModificacion.rellenarCampos(nombre, direccion, telefono, aficiones, grupo);

        ventanaModificacion.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_botonModificarMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarActionPerformed

    private void buscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorFocusGained
        buscador.setText("");
    }//GEN-LAST:event_buscadorFocusGained

    private void buscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorFocusLost
        buscador.setText("ID o Nombre del Amigo");
    }//GEN-LAST:event_buscadorFocusLost

    void buscarAmigo(){
        String criterio = buscador.getText().trim();
    System.out.println("Criterio de búsqueda: " + criterio);

    if (criterio == null || criterio.trim().isEmpty()) {
        fieldConsultas.setText("Por favor, introduzca un criterio de búsqueda válido.");
        return;
    }

    // Llamar al método del DAO para buscar con el nombre del grupo y el destino
    List<String> resultados = amigoDAO.buscarAmigosConGrupoYDestino(criterio);

    if (resultados.isEmpty()) {
        fieldConsultas.setText("No se encontraron resultados para: " + criterio);
    } else {
        // Combinar los resultados en un solo string para mostrarlos en el campo de texto
        StringBuilder sb = new StringBuilder();
        for (String resultado : resultados) {
            sb.append(resultado).append("\n");
        }
        fieldConsultas.setText(sb.toString());
    }
    
    }
    
    private String obtenerValorCampo(String[] lineas, String campo) {
    for (String linea : lineas) {
        if (linea.contains(campo)) {
            return linea.substring(linea.indexOf(campo) + campo.length()).trim();
        }
    }
    return ""; 
    }

   public int getBuscador() {
    String b = buscador.getText();
    
    // Comprobamos si el texto en el buscador es un número
    try {
        return Integer.parseInt(b);
    } catch (NumberFormatException e) {
        // Si no es un número, muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID numérico válido.");
        return -1; // Devolvemos un valor que indique que no se pudo obtener el ID
    }
}
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField buscador;
    private java.awt.TextArea fieldConsultas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
