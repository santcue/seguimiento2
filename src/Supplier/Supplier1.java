package Supplier;

import java.util.function.Supplier;

public class Supplier1 {

    public static void main(String[] args) {
        Supplier<String> obtenerDatosDeFuenteExterna = () -> {
            // Simulación de obtener datos de una fuente externa
            return "Datos de la fuente externa";
        };

        String datos = obtenerDatosDeFuenteExterna.get();
        System.out.println("Datos obtenidos: " + datos);
    }

}
