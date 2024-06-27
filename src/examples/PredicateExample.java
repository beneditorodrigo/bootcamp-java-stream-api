package examples;

import java.util.Arrays;
import java.util.List;

/**
 * A {@code Predicate} é uma interface funcional com um predicato que
 * retorna um valor booleano. É frequentemente usado para testes de filtragem.
 */
public class PredicateExample {
    public static void main(String[] args) {
        //Cria uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Spring", "Bootcamp", "Dio");

        //Stream para filtrar palavras e depois imprimir
        palavras.stream()
                //Predicate para filtrar palavras com mais de 5 caracteres
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
