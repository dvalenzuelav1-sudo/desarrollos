public class Ejercicio04 {
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();

        for (int i = 1; i <= 13; i++) {
            historial.visitarPagina("https://sitio" + i + ".com");
        }

        System.out.println("Cantidad de entradas en el historial: " + historial.getCantidad());
        System.out.println("Historial (maximo 10, la mas antigua se elimina):");
        historial.mostrarHistorial();
    }
}