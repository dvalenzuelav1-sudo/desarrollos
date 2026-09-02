import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();
        double suma = 0;

        System.out.println("Ingresa calificaciones (escribe -1 para terminar):");
        while (true) {
            System.out.print("Calificacion: ");
            double nota = sc.nextDouble();
            if (nota == -1) {
                break;
            }
            calificaciones.add(nota);
            suma += nota;
        }

        if (calificaciones.isEmpty()) {
            System.out.println("No se ingresaron calificaciones.");
        } else {
            double promedio = suma / calificaciones.size();
            System.out.println("Calificaciones: " + calificaciones);
            System.out.println("Promedio: " + promedio);
        }
        sc.close();
    }
}