/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    // Método para crear la tabla 'grupo'
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
    public void insertarGrupo(String nombreGrupo, String destinoVacaciones) {
        String sql = "INSERT INTO grupo (nombre_grupo, destino_vacaciones) VALUES (?, ?)";

        try (
                Connection conn = gestorBD.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreGrupo);
            stmt.setString(2, destinoVacaciones);
            stmt.executeUpdate();
            System.out.println("Grupo insertado con éxito: " + nombreGrupo);
        } catch (SQLException e) {
            System.out.println("Error al insertar grupo: " + e.getMessage());
        }
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

   
    // Método para insertar datos de prueba en grupos
    public void agregarDatosDePruebaGrupos() {
        insertarGrupo("Grupo de Verano", "Playa de Cancún");
        insertarGrupo("Grupo de Invierno", "Montañas de los Alpes");
        insertarGrupo("Grupo de Primavera", "Valle de las Flores");
    }
    
}
