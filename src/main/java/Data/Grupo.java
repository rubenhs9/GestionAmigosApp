/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Rubén
 */
public class Grupo {
    private int id;
    private String nombreGrupo;
    private String destinoVacaciones;

    public Grupo(String nombreGrupo, String destinoVacaciones) {
        this.id = id;
        this.nombreGrupo = nombreGrupo;
        this.destinoVacaciones = destinoVacaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDestinoVacaciones() {
        return destinoVacaciones;
    }

    public void setDestinoVacaciones(String destinoVacaciones) {
        this.destinoVacaciones = destinoVacaciones;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombreGrupo=" + nombreGrupo + ", destinoVacaciones=" + destinoVacaciones + '}';
    }
    
    
    
    
}
