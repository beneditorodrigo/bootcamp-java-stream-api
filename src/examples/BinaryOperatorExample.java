package examples;

import java.util.Arrays;
import java.util.List;

/**
 * A {@code BinaryOperator} é uma interface funcional que representa uma operação sobre
 * dois operandos do mesmo tipo, produzindo um resultado do mesmo tipo que os operandos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        //Cria uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);

        //Usa o BinaryOperator para somar os números do Stream
        int resultado = numeros
                .stream()
                .reduce(0, Integer::sum);

        System.out.println("Resultado: " + resultado);
    }
}
