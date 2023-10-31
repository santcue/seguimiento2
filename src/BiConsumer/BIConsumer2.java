package BiConsumer;

import java.util.function.BiConsumer;

public class BIConsumer2 {

    public static void main(String[] args) {
        // Simulación de dos fuentes de datos
        String baseDeDatos = "Datos de la base de datos";
        String archivo = "Datos del archivo";

        BiConsumer<String, String> combinarYProcesar = (fuente1, fuente2) -> {
            String resultado = fuente1 + " | " + fuente2;
            System.out.println("Datos combinados y procesados: " + resultado);
        };

        combinarYProcesar.accept(baseDeDatos, archivo);
    }


}
