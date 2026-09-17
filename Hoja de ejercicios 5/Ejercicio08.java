import java.util.ArrayList;

public class Ejercicio08 {
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1, "Cliente A", 1500.0));
        facturas.add(new Factura(2, "Cliente B", 800.0));
        facturas.add(new Factura(3, "Cliente A", 2200.0));
        facturas.add(new Factura(4, "Cliente C", 500.0));
        facturas.add(new Factura(5, "Cliente B", 1200.0));
        facturas.add(new Factura(6, "Cliente A", 300.0));

        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<Double> totales = new ArrayList<>();

        for (Factura f : facturas) {
            int indice = clientes.indexOf(f.getCliente());
            if (indice == -1) {
                clientes.add(f.getCliente());
                totales.add(f.getMonto());
            } else {
                totales.set(indice, totales.get(indice) + f.getMonto());
            }
        }

        System.out.println("Resumen de facturacion por cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i) + ": Q" + totales.get(i));
        }
    }
}