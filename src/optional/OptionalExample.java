package optional;

import java.util.Optional;

/**
 * A {@code Optional} é uma classe contêiner na API do Java que pode ou não conter
 * um valor não-nulo. Um {@code Optional} é usado para representar valores que podem
 * estar ausentes, evitando assim o uso de null e ajudando a prevenir erros de
 * ponteiro nulo. Ele oferece métodos para verificar a presença de um valor, recuperar
 * o valor, e executar ações condicionais com base na presença do valor.
 */
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Exemplo de Optional Java");

        if (optional.isPresent()) {
            System.out.println(optional.get()); // Output: Exemplo de Optional Java
        }

        optional.ifPresent(value -> System.out.println("Value: " + value)); // Output: Value: Exemplo de Optional Java

        String orElseExample = optional.orElse("default");
        System.out.println(orElseExample); // Output: Exemplo de Optional Java
    }
}
