package GUI.Grupos;

import BD.GestorBD;
import BD.GrupoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rubén
 */
public class VBuscarGrupo extends javax.swing.JFrame {
    private VGestionGrupo v;
    private GestorBD gestorBD;
    private boolean[][] celdasModificadas;
   
    public VBuscarGrupo(VGestionGrupo v, GestorBD gestorBD) {
        initComponents();
        setLocationRelativeTo(null);
        this.v = v;
        this.gestorBD =gestorBD;
        cargarDatosEnTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        titulo.setText("Consulte todos los grupos");

        buscador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(botonBuscar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

    private void buscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorFocusGained
        if (buscador.getText().equals("ID o Nombre del Grupo")) {
        buscador.setText("");
    }
    }//GEN-LAST:event_buscadorFocusGained

    private void buscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorFocusLost
        if (buscador.getText().isEmpty()) {
        buscador.setText("ID o Nombre del Grupo");
    }
    }//GEN-LAST:event_buscadorFocusLost

    private void botonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseClicked
         int filaSeleccionada = jTable1.getSelectedRow(); // Obtén la fila seleccionada
    
    if (filaSeleccionada == -1) { // Verifica si no hay fila seleccionada
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para borrar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
    int idGrupo = (int) modeloTabla.getValueAt(filaSeleccionada, 0); // Obtén el ID del grupo (columna 0)
    
    // Confirmación de eliminación
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas borrar el grupo con ID " + idGrupo + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        // Eliminar el grupo de la base de datos
        GrupoDAO grupoDAO = new GrupoDAO(gestorBD);
        boolean exito = grupoDAO.eliminarGrupo(idGrupo);
        
        if (exito) {
            // Si la eliminación en la BD fue exitosa, elimina la fila del JTable
            modeloTabla.removeRow(filaSeleccionada);
            JOptionPane.showMessageDialog(this, "Grupo eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el grupo de la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_botonBorrarMouseClicked

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        String busqueda = buscador.getText().trim();

        // Validar que el texto de búsqueda no esté vacío
        if (busqueda.isEmpty() || busqueda.equals("ID o Nombre del Grupo")) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID o Nombre del Grupo válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();

        // Limpiar los datos actuales de la tabla
        modeloTabla.setRowCount(0);

        // Realizar la búsqueda en la base de datos utilizando GrupoDAO
        GrupoDAO grupoDAO = new GrupoDAO(gestorBD);

        try {
            // Buscar por ID o nombre en la base de datos
            List<Object[]> resultados = buscarGrupoPorCriterio(grupoDAO, busqueda);

            // Verificar si hay resultados
            if (resultados.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados para la búsqueda: " + busqueda, "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Rellenar el JTable con los resultados
            for (Object[] fila : resultados) {
                modeloTabla.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al realizar la búsqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
    DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
    GrupoDAO grupoDAO = new GrupoDAO(gestorBD);

    for (int fila = 0; fila < modeloTabla.getRowCount(); fila++) {
        int id = (int) modeloTabla.getValueAt(fila, 0); // Obtener ID (columna 0)
        String nombreGrupo = (String) modeloTabla.getValueAt(fila, 1);
        String destinoVacaciones = (String) modeloTabla.getValueAt(fila, 2);

        if (celdasModificadas[fila][1] || celdasModificadas[fila][2]) {
            grupoDAO.modificarGrupo(id, nombreGrupo, destinoVacaciones);
            JOptionPane.showMessageDialog(null, "Grupo con ID " + id + " actualizado correctamente. ");
        }
    }

    inicializarSeguimientoDeCambios(modeloTabla);    }//GEN-LAST:event_botonModificarMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
    ///
    }//GEN-LAST:event_botonModificarActionPerformed
    
    private void configurarEstiloTabla() {
    // CABECERA
    jTable1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            java.awt.Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            comp.setBackground(java.awt.Color.LIGHT_GRAY); 
            comp.setForeground(java.awt.Color.WHITE); 
            comp.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28)); 
            return comp;
        }
    });

    // CUERPO
    jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            java.awt.Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            comp.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 20));
            return comp;
        }
    });

    // ORDENAR COLUMNAS
    jTable1.setAutoCreateRowSorter(true);
    
        // MODIFICAR ALTURA DE FILAS
    jTable1.setRowHeight(40);
}
    
    private List<Object[]> buscarGrupoPorCriterio(GrupoDAO grupoDAO, String criterio) {
        List<Object[]> resultados = new ArrayList<>();
        try {
            // Intentar buscar por ID
            try {
                int id = Integer.parseInt(criterio);
                List<Object[]> datos = grupoDAO.obtenerDatosDinamicos("grupo");
                for (Object[] fila : datos) {
                    if ((int) fila[0] == id) { // Comparar por ID (columna 0)
                        resultados.add(fila);
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                // Si no es un número, buscar por nombre
                List<Object[]> datos = grupoDAO.obtenerDatosDinamicos("grupo");
                for (Object[] fila : datos) {
                    if (fila[1].toString().equalsIgnoreCase(criterio)) { // Comparar por nombre (columna 1)
                        resultados.add(fila);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar grupo: " + e.getMessage());
        }
        return resultados;
    }
    
    private void inicializarSeguimientoDeCambios(DefaultTableModel modeloTabla) {
    int filas = modeloTabla.getRowCount();
    int columnas = modeloTabla.getColumnCount();

    // Inicializa el array para rastrear cambios
    celdasModificadas = new boolean[filas][columnas];
    
    modeloTabla.addTableModelListener(new TableModelListener() {
        @Override
        public void tableChanged(TableModelEvent e) {
            if (e.getType() == TableModelEvent.UPDATE) {
                int fila = e.getFirstRow();
                int columna = e.getColumn();
                if (columna != 0) { // Ignorar cambios en la columna de ID
                    celdasModificadas[fila][columna] = true; // Marca la celda como modificada
                }
            }
        }
    });
}
    
     private void cargarDatosEnTabla() {
    GrupoDAO grupoDAO = new GrupoDAO(gestorBD); // Usa el GestorBD inicializado
    List<Object[]> datos = grupoDAO.obtenerDatosDinamicos("grupo"); // Obtén los datos de la tabla `grupo`

    // Define el modelo de la tabla
    DefaultTableModel modeloTabla = new DefaultTableModel();

    try (
        Connection conn = gestorBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM grupo");
        ResultSet rs = stmt.executeQuery()) {

        // Obtener metadatos del ResultSet para las columnas
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Agregar las columnas al modelo
        for (int i = 1; i <= columnCount; i++) {
            modeloTabla.addColumn(metaData.getColumnLabel(i)); // Nombre de la columna
        }

        // Agregar las filas al modelo
        for (Object[] fila : datos) {
            modeloTabla.addRow(fila); // Agregar cada fila al modelo
        }

    } catch (SQLException e) {
        System.out.println("Error al cargar datos en la tabla: " + e.getMessage());
    }

    // Asignar el modelo al JTable
    jTable1.setModel(modeloTabla);
    
    configurarEstiloTabla();
    
    inicializarSeguimientoDeCambios(modeloTabla);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField buscador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
