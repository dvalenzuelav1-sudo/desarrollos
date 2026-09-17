import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", "Ventas", 6000.0));
        empleados.add(new Empleado("Luis", "Ventas", 3500.0));
        empleados.add(new Empleado("Maria", "Ventas", 7000.0));
        empleados.add(new Empleado("Carlos", "Contabilidad", 5500.0));
        empleados.add(new Empleado("Sofia", "Contabilidad", 4000.0));
        empleados.add(new Empleado("Pedro", "TI", 8000.0));

        ArrayList<Empleado> resultado = filtrarPorDepartamento(empleados, "Ventas");
        System.out.println("Empleados de Ventas con salario mayor a Q5,000:");
        for (Empleado e : resultado) {
            System.out.println(e);
        }
    }

    public static ArrayList<Empleado> filtrarPorDepartamento(ArrayList<Empleado> lista, String departamento) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado e : lista) {
            if (e.getDepartamento().equalsIgnoreCase(departamento) && e.getSalario() > 5000.0) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}