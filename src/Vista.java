import java.util.Scanner;

public class Vista {
    Scanner scn = new Scanner(System.in);
    Controlador controlador = new Controlador();

    /**
     * @param mostrarMenu() muestra el menú que le permitirá al usuario saber qué opciones tiene
     * la opción 1 le dejará agregar carros, la opción 2 le mostrará datos de su interés y la opción 3
     * le permitirá salir del programa.
     */
    public void mostrarMenu() {
        while (true) {
            System.out.println("Ingresa el número de opción: ");
            System.out.println("1. Agregar carro\n2. Ver estadísticas\n3. Mostrar taller\n4. Salir del programa");
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
                    break;
                case 2:
                    controlador.datosEstadisticos();
                    break;
                case 3:
                    System.out.println(controlador.taller);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
}
}