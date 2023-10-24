import java.util.Scanner;


public class examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        listatareas miLista = new listatareas();

        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Prioridad de la tarea (1-alta, 2-media, 3-baja): ");
                    int prioridad = scanner.nextInt();
                    System.out.println("\n");
                    tarea nuevaTarea = new tarea(descripcion, prioridad);
                    miLista.agregarTarea(nuevaTarea);
                    break;
                case 2:
                    System.out.println("Elige indice para marcar como completada");
                    int indice = scanner.nextInt();
                    miLista.marcarTareaCompletada(indice);
                    break;
                case 3:
                    System.out.println("Elige indice para eliminar tarea");
                    int index = scanner.nextInt();
                    miLista.eliminarTarea(index);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("Lista de tareas:");
                    miLista.mostrarTareas();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
