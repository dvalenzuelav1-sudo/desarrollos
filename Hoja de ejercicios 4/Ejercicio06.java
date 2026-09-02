import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- TAREAS PENDIENTES ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar como completada");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Tarea: ");
                    tareas.add(sc.nextLine());
                    break;
                case 2:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        System.out.println("Tareas:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(i + ". " + tareas.get(i));
                        }
                        System.out.print("Indice de la tarea completada: ");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice >= 0 && indice < tareas.size()) {
                            System.out.println("Tarea \"" + tareas.remove(indice) + "\" completada y eliminada.");
                        } else {
                            System.out.println("Indice invalido.");
                        }
                    }
                    break;
                case 3:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        System.out.println("Tareas pendientes:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}