import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controlador {
    ArrayList<String> taller = new ArrayList<>();

    /**
     * @param agregarCarro() Permire que el usuario ingrese los datos del carro.
     */

    public void agregarCarro(String placa, String marca, String linea, String modelo, 
    String fechaIngreso, String propietario, String tipoServicio, String factura, Double montoTotal){
        String nuevoCarro = placa + " " + marca + " " + linea + " " + modelo + " " + fechaIngreso 
        + " " + propietario + " " + tipoServicio + " " + factura + " " + montoTotal;
        taller.add(nuevoCarro);
    }

    // datosEstadisticos() sacados con ayuda de chatGPT
    public void datosEstadisticos(){
        // Mapa para contar los tipos de servicios
        Map<String, Integer> contadorServicios = new HashMap<>();

        // Mapa para contar las marcas de automóviles
        Map<String, Integer> contadorMarcas = new HashMap<>();

        // Mapa para contar los modelos de automóviles
        Map<String, Integer> contadorModelos = new HashMap<>();

        // Variable para el cálculo de ingresos totales
        double ingresosTotales = 0.0;

        // Iterar sobre los carros en el taller
        for (String carro : taller) {
            String[] palabras = carro.split(" ");
            String tipoServicio = palabras[6]; // Suponiendo que "tipoServicio" es el séptimo elemento en el array
            String marca = palabras[1]; // Suponiendo que "marca" es el segundo elemento en el array
            String modelo = palabras[3]; // Suponiendo que "modelo" es el cuarto elemento en el array
            Double montoTotal = Double.parseDouble(palabras[8]); // Suponiendo que "montoTotal" es el noveno elemento en el array

            // Contar los tipos de servicios
            contadorServicios.put(tipoServicio, contadorServicios.getOrDefault(tipoServicio, 0) + 1);

            // Contar las marcas de automóviles
            contadorMarcas.put(marca, contadorMarcas.getOrDefault(marca, 0) + 1);

            // Contar los modelos de automóviles
            contadorModelos.put(modelo, contadorModelos.getOrDefault(modelo, 0) + 1);

            // Sumar los ingresos totales
            ingresosTotales += montoTotal;
        }

        // Imprimir los tipos de servicios más solicitados
        System.out.println("Tipos de servicios más solicitados:");
        for (Map.Entry<String, Integer> entry : contadorServicios.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }

        // Imprimir las marcas más comunes
        System.out.println("Marcas más comunes:");
        for (Map.Entry<String, Integer> entry : contadorMarcas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }

        // Imprimir los 3 modelos de automóviles más frecuentes
        System.out.println("Los 3 modelos de automóviles más frecuentes:");
        contadorModelos.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " veces"));

        // Imprimir los ingresos totales
        System.out.println("Ingresos totales: Q" + ingresosTotales);
    }
}
