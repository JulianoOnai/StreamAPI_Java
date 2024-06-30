import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream()
                .filter(Desafio11::ehQuadradoPerfeito)
                .reduce(0, Integer::sum);

        System.out.println(resultado);
    }

    public static boolean ehQuadradoPerfeito(int num) {
        if (num < 0) {
            return false;
        }
        int raiz = (int) Math.sqrt(num);
        return raiz * raiz == num;
    }
}