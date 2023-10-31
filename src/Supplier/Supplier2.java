package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier2 {

    public static void main(String[] args) {
        Supplier<Integer> generarNumeroAleatorio = () -> {
            Random rand = new Random();
            return rand.nextInt(100) + 1;
        };

        int numero = generarNumeroAleatorio.get();
        System.out.println("Número aleatorio: " + numero);
    }

}
