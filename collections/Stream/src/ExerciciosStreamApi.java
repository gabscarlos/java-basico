import java.util.Arrays;
import java.util.List;

public class ExerciciosStreamApi {
    public static void main(String[] args) throws Exception {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).forEach(System.out::println);

        System.out.println("Transforme essa lista de String em uma lista de números inteiros: ");
        numerosAleatorios.stream().map(Integer::parseInt).forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        numerosAleatorios.stream().map(Integer::parseInt).filter(n -> n % 2 == 0 && n > 2).forEach(System.out::println);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
