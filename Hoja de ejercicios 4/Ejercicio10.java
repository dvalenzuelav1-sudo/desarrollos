import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        System.out.println("20 numeros aleatorios: " + numeros);
    }
}