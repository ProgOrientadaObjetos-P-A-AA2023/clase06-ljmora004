package paquete04;

import java.util.Scanner;
import paquete02.Vendedor;

public class Principal {

    public static void main(String[] args) {
        int i = 1;
        
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        
        // Inicio de proceso iterativo
        cadenaFinal = ""; // inicializo la variable que contendrá la cadena
        // final.
        while (i <= 3) { // bandera == true
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario minimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el numero de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino,
                    autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%s\nDatos de Vendedor %d\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario minimo: %.2f\n"
                    + "Numero de autos: %d\n"
                    + "Pago mensual: %.2f\n\n",
                    cadenaFinal,
                    i,
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());

            entrada.nextLine(); // limpieza del buffer
            i++;

        }
        // cuando se sale del ciclo repetitivo debemos presentar en pantalla
        // el valor de cadena final
        System.out.printf("%s\n", cadenaFinal);

    }
}
