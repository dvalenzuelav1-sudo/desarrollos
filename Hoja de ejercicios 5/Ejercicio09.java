import java.util.ArrayList;

public class Ejercicio09 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(4);
        b.add(6);
        b.add(8);

        System.out.println("Lista A: " + a);
        System.out.println("Lista B: " + b);

        ArrayList<Integer> fusion = combinar(a, b);
        System.out.println("Fusion ordenada: " + fusion);
    }

    public static ArrayList<Integer> combinar(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                resultado.add(a.get(i));
                i++;
            } else {
                resultado.add(b.get(j));
                j++;
            }
        }

        while (i < a.size()) {
            resultado.add(a.get(i));
            i++;
        }

        while (j < b.size()) {
            resultado.add(b.get(j));
            j++;
        }

        return resultado;
    }
}