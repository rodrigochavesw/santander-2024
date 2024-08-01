import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Combina dois argumentos do tipo T e retorna mesmo tipo T, utilizado
 * para somar e juntar objetos
 **/

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 9, 11);

        BinaryOperator<Integer> soma = Integer::sum;

        // Implementando a minha lista com Stream usando o método . reduce

        int resultado = numeros.stream()
                  .reduce(0, Integer::sum);



        System.out.println(resultado);


    }
}