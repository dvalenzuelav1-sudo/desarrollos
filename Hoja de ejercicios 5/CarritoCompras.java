import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<ItemCarrito> items;

    public CarritoCompras() {
        items = new ArrayList<>();
    }

    public void agregarItem(String producto, int cantidad, double precioUnitario) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equalsIgnoreCase(producto)) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        items.add(new ItemCarrito(producto, cantidad, precioUnitario));
    }

    public void eliminarItem(String producto) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProducto().equalsIgnoreCase(producto)) {
                items.remove(i);
                return;
            }
        }
    }

    public void vaciarCarrito() {
        items.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void mostrarCarrito() {
        for (ItemCarrito item : items) {
            System.out.println(item);
        }
        System.out.println("Total: Q" + calcularTotal());
    }
}