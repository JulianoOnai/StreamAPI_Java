import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        boolean numerosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.getFirst()));

        System.out.println(numerosIguais);
    }
}
