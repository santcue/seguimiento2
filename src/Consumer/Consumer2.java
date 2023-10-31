package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Bob", "Carlos", "David", "Eva");

        Consumer<String> filtroYMostrar = nombre -> {
            if (nombre.startsWith("C")) {
                System.out.println("Nombre que comienza con 'C': " + nombre);
            }
        };

        nombres.forEach(filtroYMostrar);
    }

}
