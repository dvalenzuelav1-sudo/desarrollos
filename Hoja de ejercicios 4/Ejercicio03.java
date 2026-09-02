import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
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

        System.out.println("Lista de nombres:");
        for (String n : nombres) {
            System.out.println(n);
        }
        sc.close();
    }
}