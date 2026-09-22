import java.util.ArrayList;
import java.util.Scanner;

public class Gestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        ArrayList<tarea> tareas = new ArrayList<>();


        do {
            System.out.println("1. Añadir Tarea | 2. Ver Tarea | 3. Marcar tareas como completadas | 4. Eliminar tarea | 5. Filtrar por prioridad | 6. Salir.");
            System.out.print("Elige la opcion:");
            opcion = sc.nextInt();

            if (opcion == 1) {
                sc.nextLine();
                System.out.println("Dime la descripcion de la tarea que desees");
                String descripcion = sc.nextLine();
                System.out.println("Dime la prioridad (ALTA, MEDIA o BAJA)");
                String prioridad = sc.nextLine();

                tarea t = new tarea(descripcion, prioridad);
                tareas.add(t);
                System.out.println("Tarea añadida correctamente");

            } else if (opcion == 2) {
                if(tareas.isEmpty()){
                    System.out.println("No hay tareas");
                }else
                for (tarea t : tareas) {
                    System.out.println("Id: " + t.id);
                    System.out.println("Descripcion: " + t.descripcion);
                    System.out.println("Prioridad: " + t.prioridad);
                    if (t.estado) {
                        System.out.println("Estado : completado");
                    } else {
                        System.out.println("Estado : no completado");
                    }
                }
            } else if (opcion == 3) {
                System.out.println("Dime que tarea seleccionar: ");
                int idBuscar = sc.nextInt();

                for (tarea t : tareas) {

                    if (t.id == idBuscar) {
                        t.estado = true;
                        System.out.println("tarea completada");
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Dime que id quieres eliminar: ");
                int idBuscar = sc.nextInt();

                for (int i = 0; i < tareas.size(); i++) {

                    if (tareas.get(i).id == idBuscar) {
                        tareas.remove(i);
                        System.out.println("Tarea eliminada");
                        break;
                    }
                }
            }
        } while (opcion != 6);
    }
}