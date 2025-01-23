package BD;

import Data.Amigo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AmigoDAO {
    private GestorBD gestorBD;
    
    public AmigoDAO(GestorBD gestorBD) {
        this.gestorBD = gestorBD;
    }
    
    public void crearTablaAmigos() {
        String sql = """
                CREATE TABLE IF NOT EXISTS amigos (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nombre TEXT NOT NULL,
                    direccion TEXT,
                    telefono TEXT,
                    aficiones TEXT,
                    grupo_id INTEGER,
                    vacaciones TEXT,
                    FOREIGN KEY (grupo_id) REFERENCES grupo (id)
                );
                """;
        try (Connection conn = gestorBD.getConnection(); 
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla 'amigos' creada con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla 'amigos': " + e.getMessage());
        }
    }
    
    public void actualizarAmigo(Amigo amigo) {
    String sql = """
            UPDATE amigos SET
            nombre = ?, direccion = ?, telefono = ?, aficiones = ?, grupo_id = ?, vacaciones = ?
            WHERE id = ?;
            """;
    try (Connection conn = gestorBD.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, amigo.getNombre());
        stmt.setString(2, amigo.getDireccion());
        stmt.setString(3, amigo.getTelefono());
        stmt.setString(4, amigo.getAficiones());
        stmt.setInt(5, amigo.getGrupoId());
        stmt.setString(6, amigo.getVacaciones());
        stmt.setInt(7, amigo.getId()); // Ahora usa el ID correcto
        int rowsUpdated = stmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Amigo actualizado: " + amigo.getNombre());
        } else {
            System.out.println("No se encontró el amigo con ID: " + amigo.getId());
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar amigo: " + e.getMessage());
    }
}

    public void insertarAmigo(Amigo amigo) {
        String sql = """
                INSERT INTO amigos (nombre, direccion, telefono, aficiones, grupo_id, vacaciones)
                VALUES (?, ?, ?, ?, ?, ?);
                """;

        try (Connection conn = gestorBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, amigo.getNombre());
            stmt.setString(2, amigo.getDireccion());
            stmt.setString(3, amigo.getTelefono());
            stmt.setString(4, amigo.getAficiones());
            stmt.setInt(5, amigo.getGrupoId());
            stmt.setString(6, amigo.getVacaciones());
            stmt.executeUpdate();
            System.out.println("Amigo insertado con éxito: " + amigo.getNombre());
        } catch (SQLException e) {
            System.out.println("Error al insertar amigo: " + e.getMessage());
        }
    }

    private boolean esNumerico(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public void borrarAmigo(String criterio) {
    String sql;
    PreparedStatement stmt;

    // Verifica si el criterio es numérico
    if (esNumerico(criterio)) {
        // Si el criterio es un número, interpretamos que es un ID
        sql = "DELETE FROM amigos WHERE id = ?";
        try (Connection conn = gestorBD.getConnection()) {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(criterio));
            int filasEliminadas = stmt.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Amigo con ID " + criterio + " ha sido borrado.");
            } else {
                System.out.println("No se encontró un amigo con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al borrar amigo por ID: " + e.getMessage());
        }
    } else {
        // Si el criterio no es numérico, lo interpretamos como un nombre
        sql = "DELETE FROM amigos WHERE LOWER(nombre) LIKE LOWER(?)";
        try (Connection conn = gestorBD.getConnection()) {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + criterio + "%");
            int filasEliminadas = stmt.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Amigo(s) con nombre " + criterio + " ha sido borrado.");
            } else {
                System.out.println("No se encontró un amigo con ese nombre.");
            }
        } catch (SQLException e) {
            System.out.println("Error al borrar amigo por nombre: " + e.getMessage());
        }
    }
}
    
    public List<String> buscarAmigosConGrupoYDestino(String criterio) {
    List<String> resultados = new ArrayList<>();
    String sql;

    try (Connection conn = gestorBD.getConnection()) {
        PreparedStatement stmt;

        // Verifica si el criterio es numérico
        if (esNumerico(criterio)) {
            sql = """
                SELECT amigos.id, amigos.nombre, amigos.direccion, amigos.telefono, amigos.aficiones, 
                       grupo.nombre_grupo, grupo.destino_vacaciones
                FROM amigos
                LEFT JOIN grupo ON amigos.grupo_id = grupo.id
                WHERE amigos.id = ?;
                """;
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(criterio));
        } else {
            sql = """
                SELECT amigos.id, amigos.nombre, amigos.direccion, amigos.telefono, amigos.aficiones, 
                       grupo.nombre_grupo, grupo.destino_vacaciones
                FROM amigos
                LEFT JOIN grupo ON amigos.grupo_id = grupo.id
                WHERE LOWER(amigos.nombre) LIKE LOWER(?);
                """;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + criterio + "%");
        }

        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String resultado = String.format("""
                    ----------------------------
                    ID: %d
                                                 
                    Nombre: %s
                    Dirección: %s
                    Teléfono: %s
                    Aficiones: %s
                    Grupo: %s
                    Vacaciones: %s
                    ----------------------------
                    """,
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("telefono"),
                    rs.getString("aficiones"),
                    rs.getString("nombre_grupo") == null ? "N/A" : rs.getString("nombre_grupo"),
                    rs.getString("destino_vacaciones") == null ? "N/A" : rs.getString("destino_vacaciones")
                );

                resultados.add(resultado);
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al buscar amigos: " + e.getMessage());
    }
    return resultados;
}
    
    public void limpiarTabla(){
        String sql = "DELETE FROM amigos; VACUUM";
    
    try (Connection conn = gestorBD.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        int rowsAffected = stmt.executeUpdate();
        System.out.println("Se han eliminado " + rowsAffected + " amigos.");
    } catch (SQLException e) {
        System.out.println("Error al borrar los amigos: " + e.getMessage());
    }
    }
    
    public void mostrarTodosLosAmigos() {
    String sql = "SELECT * FROM amigos";  // Consulta para obtener todos los registros de la tabla amigos

    try (Connection conn = gestorBD.getConnection();  // Obtiene la conexión a la base de datos
         PreparedStatement stmt = conn.prepareStatement(sql);  // Prepara la consulta
         ResultSet rs = stmt.executeQuery()) {  // Ejecuta la consulta y obtiene los resultados

        // Recorre el ResultSet e imprime los valores de cada campo
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String telefono = rs.getString("telefono");
            String aficiones = rs.getString("aficiones");
            int grupoId = rs.getInt("grupo_id");
            String vacaciones = rs.getString("vacaciones");

            // Imprime los valores de cada campo
            System.out.println("----------------------------");
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Aficiones: " + aficiones);
            System.out.println("Grupo ID: " + grupoId);
            System.out.println("Vacaciones: " + vacaciones);
            System.out.println("----------------------------");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener los amigos: " + e.getMessage());
    }
}
    
    public List<String> obtenerGrupos() {
        List<String> grupos = new ArrayList<>();
        String sql = "SELECT nombre_grupo FROM grupo";

        try (Connection conn = gestorBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                grupos.add(rs.getString("nombre_grupo"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener grupos: " + e.getMessage());
        }

        return grupos;
    }

    public void agregarDatosDePruebaAmigos() {
        List<Amigo> amigosDePrueba = List.of(
                new Amigo(1, "Juan", "Calle 1", "123456789", "Correr, Leer", 1, "Verano"),
                new Amigo(2, "Ana", "Calle 2", "987654321", "Pintar, Música", 2, "Invierno"),
                new Amigo(3, "Carlos", "Avenida Principal", "456123789", "Fútbol, Viajar", 1, "Primavera"),
                new Amigo(4, "María", "Plaza Central", "321654987", "Cine, Natación", 3, "Otoño")
        );

        for (Amigo amigo : amigosDePrueba) {
            insertarAmigo(amigo);
        }
        System.out.println("Datos de prueba de amigos insertados con éxito.");
    }
}
