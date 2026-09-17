import java.util.ArrayList;

public class Ejercicio06 {
    public static void main(String[] args) {
        ArrayList<Double> ventas = new ArrayList<>();
        double[] montos = {800.0, 950.5, 1100.0, 700.25, 1600.0, 900.0, 1300.5,
                           1020.0, 850.0, 1750.0, 640.0, 1200.75, 980.0, 1500.0,
                           1100.5, 930.0, 1400.0, 750.25, 1650.0, 880.0, 1250.0,
                           1000.0, 1150.5, 1350.0, 890.0, 1700.0, 950.0, 1080.5,
                           1450.0, 1550.0};
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