import java.util.ArrayList;

public class Controlador {
    ArrayList<String> taller = new ArrayList<>();

    public void agregarCarro(String placa, String marca, String linea, String modelo, 
    String fechaIngreso, String propietario, String tipoServicio, String factura, Double montoTotal){
        String nuevoCarro = placa + " " + marca + " " + linea + " " + modelo + " " + fechaIngreso 
        + " " + propietario + " " + tipoServicio + " " + factura + " " + montoTotal;
        taller.add(nuevoCarro);
    }
}
