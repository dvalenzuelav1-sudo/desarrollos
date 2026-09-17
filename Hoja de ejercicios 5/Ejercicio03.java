import java.util.ArrayList;

public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<Double> ventas = new ArrayList<>();
        double[] montos = {1200.5, 980.0, 1500.75, 800.25, 2100.0, 1450.0, 760.5,
                           1900.0, 1150.0, 2200.0, 950.5, 1300.0, 1750.25, 890.0,
                           2400.0, 1000.0, 1600.5, 700.0, 1850.0, 1200.0, 1400.0,
                           2050.0, 850.5, 1700.0, 950.0, 1550.5, 1100.0, 1250.0,
                           1800.0, 1350.0};
        for (double monto : montos) {
            ventas.add(monto);
        }

        System.out.println("Ventas del mes (" + ventas.size() + " dias): " + ventas);
        System.out.println("Promedio mensual: " + promedioMensual(ventas));
        System.out.println("Valor maximo: " + valorMaximo(ventas));
        System.out.println("Valor minimo: " + valorMinimo(ventas));
        System.out.println("Dias con ventas sobre el promedio: " + diasSobrePromedio(ventas));
    }

    public static double promedioMensual(ArrayList<Double> ventas) {
        double suma = 0;
        for (double v : ventas) {
            suma += v;
        }
        return suma / ventas.size();
    }

    public static double valorMaximo(ArrayList<Double> ventas) {
        double maximo = ventas.get(0);
        for (double v : ventas) {
            if (v > maximo) {
                maximo = v;
            }
        }
        return maximo;
    }

    public static double valorMinimo(ArrayList<Double> ventas) {
        double minimo = ventas.get(0);
        for (double v : ventas) {
            if (v < minimo) {
                minimo = v;
            }
        }
        return minimo;
    }

    public static int diasSobrePromedio(ArrayList<Double> ventas) {
        double promedio = promedioMensual(ventas);
        int contador = 0;
        for (double v : ventas) {
            if (v > promedio) {
                contador++;
            }
        }
        return contador;
    }
}