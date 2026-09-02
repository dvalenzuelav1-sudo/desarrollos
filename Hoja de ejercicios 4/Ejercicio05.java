import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String nombre;

        System.out.println("Ingresa nombres (escribe \"fin\" para terminar):");
        while (true) {
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(nombre);
        }

        System.out.print("Nombre a buscar: ");
        String buscado = sc.nextLine();

        if (nombres.contains(buscado)) {
            System.out.println("El nombre \"" + buscado + "\" SI existe en la lista.");
        } else {
            System.out.println("El nombre \"" + buscado + "\" NO existe en la lista.");
        }
        sc.close();
    }
}