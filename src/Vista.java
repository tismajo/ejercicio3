import java.util.Scanner;

public class Vista {
    Scanner scn = new Scanner(System.in);
    Controlador controlador = new Controlador();

    public void mostrarMenu() {
        while (true) {
            System.out.println("Ingresa el número de opción: ");
            System.out.println("1. Agregar carro\n2. Ver estadísticas");
            int opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    scn = new Scanner(System.in);
                    System.out.println("Ingresa los datos del carro");
                    System.out.print("Ingresa la placa: ");            
                    String placa = scn.nextLine();
                    System.out.print("Ingresa la marca: ");
                    String marca = scn.nextLine();
                    System.out.print("Ingresa la linea: ");
                    String linea = scn.nextLine();
                    System.out.print("Ingresa el modelo: ");
                    String modelo = scn.nextLine();
                    System.out.print("Ingresa la fecha de ingreso: ");
                    String fechaIngreso = scn.nextLine();
                    System.out.print("Ingresa el tipo de servicio: ");
                    String tipoServicio = scn.nextLine();
                    System.out.print("Ingresa el número de factura: ");
                    String factura = scn.nextLine();
                    System.out.print("Ingresa el monto total de reparación: ");
                    Double montoTotal = scn.nextDouble();
                    controlador.agregarCarro(placa, marca, linea, modelo, fechaIngreso, fechaIngreso, tipoServicio, factura, montoTotal);
                    System.out.println(controlador.taller);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
}
}