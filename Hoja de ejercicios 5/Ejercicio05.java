import java.util.ArrayList;

public class Ejercicio05 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Teclado", 120.0, 4));
        productos.add(new Producto(2, "Mouse", 60.0, 30));
        productos.add(new Producto(3, "Monitor", 900.0, 7));
        productos.add(new Producto(4, "Parlantes", 250.0, 12));
        productos.add(new Producto(5, "Webcam", 300.0, 2));

        System.out.println("Precios antes del aumento:");
        mostrarProductos(productos);

        aplicarAumento(productos, 15.0);

        System.out.println("\nPrecios despues del aumento (15% solo para stock < 10):");
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