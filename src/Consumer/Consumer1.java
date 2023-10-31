package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> operacion = num -> {
            int cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es " + cuadrado);
        };

        numeros.forEach(operacion);
    }

}
