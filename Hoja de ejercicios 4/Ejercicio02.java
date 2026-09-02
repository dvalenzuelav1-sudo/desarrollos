import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingresa 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }

        System.out.println("Elementos de la lista:");
        for (Integer n : numeros) {
            System.out.println(n);
        }
        sc.close();
    }
}