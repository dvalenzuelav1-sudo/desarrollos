import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar por indice");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Elemento a agregar: ");
                    elementos.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Indice a eliminar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (indice >= 0 && indice < elementos.size()) {
                        System.out.println("Elemento eliminado: " + elementos.remove(indice));
                    } else {
                        System.out.println("Indice invalido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista: " + elementos);
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