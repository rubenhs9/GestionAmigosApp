package Data;

import BD.AmigoDAO;
import BD.GestorBD;
import BD.GrupoDAO;
import GUI.VPal;


public class Main {

    public static void main(String[] args) {
       GestorBD gestorBD = new GestorBD("miBaseDeDatos");
    gestorBD.conectarBDD(); // Conectar a la base de datos

    // Crear la tabla de grupos si no existe
    GrupoDAO grupoDAO = new GrupoDAO(gestorBD);
    grupoDAO.crearTablaGrupo();
    grupoDAO.limpiarTabla();
    grupoDAO.agregarDatosDePruebaGrupos();

    // Crear la tabla de amigos si no existe
    AmigoDAO amigoDAO = new AmigoDAO(gestorBD);
    amigoDAO.crearTablaAmigos();
    amigoDAO.limpiarTabla();
    amigoDAO.agregarDatosDePruebaAmigos();
    amigoDAO.mostrarTodosLosAmigos();

    java.awt.EventQueue.invokeLater(() -> {
        VPal vPal = new VPal(); 
        vPal.setVisible(true);
    });
}


}
