package BD;

import Data.Amigo;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestorBD {
    private String url; // Propiedad de instancia
    private static final String DATABASE_PATH = "res/"; // Ruta donde se almacenará la base de datos
    private static final String DATABASE_URL = "jdbc:sqlite:";
     private Connection conn;


    // Constructor para inicializar el gestor con la base de datos deseada
    public GestorBD(String databaseName) {
        // Crear el directorio si no existe
        File carpeta = new File(DATABASE_PATH);
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        // Crear la URL para conectar a SQLite
        this.url = DATABASE_URL + DATABASE_PATH + databaseName + ".db";
    }

    // Método para obtener la conexión
    public Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(url);
        }
        return conn;
    }
    

    // Método para crear la base de datos
    public void conectarBDD() {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Driver: " + meta.getDriverName());
                System.out.println("Base de datos conectada/creada con éxito.");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    

   

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada con éxito.");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }
}
