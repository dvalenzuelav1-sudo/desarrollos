import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        String entrada;

        System.out.println("Ingresa elementos (escribe \"fin\" para terminar):");
        while (true) {
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            elementos.add(entrada);
        }

        System.out.println("Elementos ingresados: " + elementos);
        sc.close();
    }
}