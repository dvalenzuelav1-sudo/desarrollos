import java.util.ArrayList;

public class Ejercicio01 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Camisa", 150.0, 25));
        productos.add(new Producto(2, "Pantalon", 200.0, 5));
        productos.add(new Producto(3, "Zapatos", 350.0, 8));
        productos.add(new Producto(4, "Sombrero", 90.0, 15));

        System.out.println("Precios antes del aumento:");
        mostrarProductos(productos);

        aplicarAumento(productos, 10.0);

        System.out.println("\nPrecios despues del aumento (10% solo para stock < 10):");
        mostrarProductos(productos);
    }

    public static void aplicarAumento(ArrayList<Producto> lista, double porcentaje) {
        for (Producto p : lista) {
            if (p.getStock() < 10) {
                p.setPrecio(p.getPrecio() * (1 + porcentaje / 100.0));
            }
        }
    }

    public static void mostrarProductos(ArrayList<Producto> lista) {
        for (Producto p : lista) {
            System.out.println(p);
        }
    }
}