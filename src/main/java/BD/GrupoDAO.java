package BD;

import Data.Grupo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rubén
 */
public class GrupoDAO {
    private GestorBD gestorBD;

    public GrupoDAO(GestorBD gestorBD) {
        this.gestorBD = gestorBD;
    }
    
    public void crearTablaGrupo() {
        String sql = """
                CREATE TABLE IF NOT EXISTS grupo (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nombre_grupo TEXT NOT NULL,
                    destino_vacaciones TEXT
                );
                """;
        try (   Connection conn = gestorBD.getConnection();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla 'grupo' creada con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla 'grupo': " + e.getMessage());
        }
    }
    
    public String obtenerNombrePorId(int grupoId) {
        String sql = "SELECT nombre_grupo FROM grupo WHERE id = ?";
        try (Connection conn = gestorBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, grupoId); // Asigna el valor del grupoId al parámetro de la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("nombre_grupo"); // Retorna el nombre del grupo
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el nombre del grupo: " + e.getMessage());
        }
        return null; // Retorna null si no se encuentra el grupo
    }
   
    // Método para buscar un grupo por nombre
    public String buscarGrupoPorNombre(String nombreGrupo) {
        String sql = "SELECT nombre_grupo, destino_vacaciones FROM grupo WHERE nombre_grupo = ?";
        String resultado = "";

        try (
            Connection conn = gestorBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombreGrupo);
            var rs = stmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre_grupo");
                String destino = rs.getString("destino_vacaciones");
                resultado = "Nombre: " + nombre + ", Destino: " + destino;
            } else {
                resultado = "No se encontró ningún grupo con el nombre: " + nombreGrupo;
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar grupo: " + e.getMessage());
            resultado = "Error al realizar la búsqueda.";
        }

        return resultado;
    }


    public int obtenerIdPorNombre(String nombreGrupo) {
    String sql = "SELECT id FROM grupo WHERE nombre_grupo = ?";
    try (
        Connection conn = gestorBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nombreGrupo);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("id");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener ID del grupo: " + e.getMessage());
    }
    return -1; // Retorna -1 si no encuentra el grupo
}


    // Método para insertar un grupo en la tabla 'grupo'
    public void insertarGrupo(Grupo grupo) {
        String sql = "INSERT INTO grupo (nombre_grupo, destino_vacaciones) VALUES (?, ?)";

        try (
                Connection conn = gestorBD.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, grupo.getNombreGrupo());
            stmt.setString(2, grupo.getDestinoVacaciones());
            stmt.executeUpdate();
            System.out.println("Grupo insertado con éxito: " + grupo.getNombreGrupo());
        } catch (SQLException e) {
            System.out.println("Error al insertar grupo: " + e.getMessage());
        }
    }
    
    public List<Object[]> obtenerDatosDinamicos(String tabla) {
    List<Object[]> datos = new ArrayList<>();
    String sql = "SELECT * FROM " + tabla; 

    try (
        Connection conn = gestorBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {

        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount(); 
        
        while (rs.next()) {
            Object[] fila = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                fila[i - 1] = rs.getObject(i); 
            }
            datos.add(fila); 
        }

    } catch (SQLException e) {
        System.out.println("Error al obtener datos dinámicos: " + e.getMessage());
    }

    return datos;
}

    public boolean existeNombre(String nombre) {
    String sql = "SELECT COUNT(*) FROM grupo WHERE nombre_grupo = ?";
    
    try (Connection conn = gestorBD.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, nombre);  
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;  
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al verificar el teléfono: " + e.getMessage());
    }
    return false;  
}

   public List<String> obtenerNombresDeGrupos() {
    List<String> nombresDeGrupos = new ArrayList<>();
    String sql = "SELECT nombre_grupo FROM grupo";

    try (
        Connection conn = gestorBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            nombresDeGrupos.add(rs.getString("nombre_grupo"));
        }

    } catch (SQLException e) {
        System.out.println("Error al obtener nombres de grupos: " + e.getMessage());
    }

    return nombresDeGrupos;
}
   
    public void limpiarTabla(){
        String sql = "DELETE FROM grupo; VACUUM";
    
    try (Connection conn = gestorBD.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        int rowsAffected = stmt.executeUpdate();
        System.out.println("Se han eliminado " + rowsAffected + " amigos.");
    } catch (SQLException e) {
        System.out.println("Error al borrar los amigos: " + e.getMessage());
    }
    }

    public boolean eliminarGrupo(int idGrupo) {
    String sql = "DELETE FROM grupo WHERE id = ?";
    
    try (Connection conn = gestorBD.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, idGrupo); // Asigna el ID del grupo al query
        
        int filasAfectadas = stmt.executeUpdate(); // Ejecuta la eliminación
        return filasAfectadas > 0; // Retorna true si se eliminó correctamente
    } catch (SQLException e) {
        System.out.println("Error al eliminar el grupo: " + e.getMessage());
        return false;
    }
}
   
    public void agregarDatosDePruebaGrupos() {
    // Lista de grupos de prueba
    List<Grupo> gruposDePrueba = List.of(
        new Grupo(1, "Grupo de Verano", "Playa de Cancún"),
        new Grupo(2, "Grupo de Invierno", "Montañas de los Alpes"),
        new Grupo(3, "Grupo de Primavera", "Valle de las Flores"),
        new Grupo(4, "Grupo de Otoño", "Bosque de Secuoyas")
    );

    for (Grupo grupo : gruposDePrueba) {
        insertarGrupo(grupo); 
    }
    System.out.println("Datos de prueba de grupos insertados con éxito.");
}
    
    public void modificarGrupo(int id, String nombreGrupo, String destinoVacaciones) {
    String sql = "UPDATE grupo SET nombre_grupo = ?, destino_vacaciones = ? WHERE id = ?";
    try (
        Connection conn = gestorBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, nombreGrupo);
        stmt.setString(2, destinoVacaciones);
        stmt.setInt(3, id);

        int filasAfectadas = stmt.executeUpdate();
        if (filasAfectadas > 0) {
            System.out.println("Grupo actualizado correctamente: ID " + id);
        } else {
            System.out.println("No se pudo actualizar el grupo: ID " + id);
        }

    } catch (SQLException e) {
        System.out.println("Error al modificar grupo: " + e.getMessage());
    }
}
    
}
