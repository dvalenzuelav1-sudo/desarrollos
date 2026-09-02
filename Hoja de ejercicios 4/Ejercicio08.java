import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        System.out.println("Ingresa numeros (escribe 0 para terminar):");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            numeros.add(n);
            if (n % 2 == 0) {
                pares.add(n);
            }
        }

        System.out.println("Numeros ingresados: " + numeros);
        System.out.println("Numeros pares: " + pares);
        sc.close();
    }
}