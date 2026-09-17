public class Factura {
    private int idFactura;
    private String cliente;
    private double monto;

    public Factura(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Factura{id=" + idFactura + ", cliente='" + cliente + "', monto=" + monto + "}";
    }
}