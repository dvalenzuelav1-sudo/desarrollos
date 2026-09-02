import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.println("Ingresa empleados (nombre \"fin\" para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Salario de " + nombre + ": ");
            double salario = sc.nextDouble();
            sc.nextLine();
            empleados.add(new Empleado(nombre, salario));
        }

        if (empleados.isEmpty()) {
            System.out.println("No se ingresaron empleados.");
        } else {
            double suma = 0;
            for (Empleado e : empleados) {
                suma += e.getSalario();
            }
            double promedio = suma / empleados.size();
            System.out.println("Promedio de salarios: " + promedio);
        }
        sc.close();
    }
}