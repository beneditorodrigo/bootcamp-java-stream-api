package examples;

import java.util.Arrays;
import java.util.List;

/**
 * O {@code Function} é uma interface funcional que representa uma operação
 * que aceita um argumento de entrada e produz um resultado. É utilizada para
 * transformar ou mapear ou elementos do Stream em outros valores ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        //Cria uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);

        //Usa a função para dobrar os números e armazenar em outra lista
        List<Integer> numerosDobrados = numeros
                .stream()
                //Usa a Function com lambda para dobrar todos os números
                .map(n -> n * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
