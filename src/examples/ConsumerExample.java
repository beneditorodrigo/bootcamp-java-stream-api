package examples;

import java.util.Arrays;
import java.util.List;

/**
 * O {@code Consumer} é uma interface funcional que representa uma operação que aceita um único
 * argumento de entrada e não retorna nenhum resultado. É frequentemente usado em operações de
 * terminal da Stream API, como forEach, para aplicar uma ação a cada elemento do stream.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        //Cria uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);

        //Usar o Consumer para imprimir números pares
        numeros.forEach(n -> {
            //O ideal seria usar stream.filter(), mas o objetivo aqui é somente mostrar o Consumer
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}