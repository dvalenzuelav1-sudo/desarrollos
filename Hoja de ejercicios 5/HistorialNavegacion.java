import java.util.ArrayList;

public class HistorialNavegacion {
    private static final int LIMITE = 10;
    private ArrayList<String> historial;

    public HistorialNavegacion() {
        historial = new ArrayList<>();
    }

    public void visitarPagina(String url) {
        historial.add(url);
        if (historial.size() > LIMITE) {
            historial.remove(0);
        }
    }

    public ArrayList<String> getHistorial() {
        return historial;
    }

    public int getCantidad() {
        return historial.size();
    }

    public void mostrarHistorial() {
        for (int i = 0; i < historial.size(); i++) {
            System.out.println(i + ". " + historial.get(i));
        }
    }
}