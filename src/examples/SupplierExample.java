package examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * O {@code Supplier} é uma interface funcional que não recebe nenhum argumento
 * e retorna um resultado. Ele é frequentemente utilizado em operações de geração
 * ou fornecimento de valores, como em streams de dados.
 */
public class SupplierExample {
    public static void main(String[] args) {
        //Uso o Supplier e expressões lambda para uma saudação personalizada
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, isto é um exemplo de Supplier")
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
