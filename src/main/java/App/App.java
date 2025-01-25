package App;

import BD.AmigoDAO;
import BD.GestorBD;
import BD.GrupoDAO;
import GUI.VPal;

/**
 *
 * @author Rubén
 */
public class App {
    private GestorBD gestorBD;
    private GrupoDAO grupoDAO;
    private AmigoDAO amigoDAO;

    public App() {
        gestorBD = new GestorBD("miBaseDeDatos");
        grupoDAO = new GrupoDAO(gestorBD);
        amigoDAO = new AmigoDAO(gestorBD);
    }

    public void iniciar() {
        gestorBD.conectarBDD();
        
        grupoDAO.crearTablaGrupo();
        grupoDAO.limpiarTabla();
        grupoDAO.agregarDatosDePruebaGrupos();

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
