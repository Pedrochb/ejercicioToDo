import java.util.ArrayList;

public class tarea {
    public String descripcion;
    public boolean estado;
    public String prioridad;
    public int id;
    private static int contador = 1;

    public tarea(String descripcion, String prioridad) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = false;
    }
}
