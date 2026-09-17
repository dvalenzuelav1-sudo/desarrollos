public class Ejercicio07 {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarItem("Camisa", 2, 150.0);
        carrito.agregarItem("Pantalon", 1, 200.0);
        carrito.agregarItem("Camisa", 3, 150.0);
        carrito.agregarItem("Sombrero", 1, 90.0);

        System.out.println("Carrito despues de agregar (la camisa se acumulo a 5):");
        carrito.mostrarCarrito();

        carrito.eliminarItem("Sombrero");
        System.out.println("\nCarrito despues de eliminar Sombrero:");
        carrito.mostrarCarrito();

        carrito.vaciarCarrito();
        System.out.println("\nCarrito despues de vaciar (total debe ser 0):");
        carrito.mostrarCarrito();
    }
}