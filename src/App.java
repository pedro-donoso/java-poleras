import java.util.Scanner;

import polera.PoleraClase;

public class App {
    public static void main(String[] args) throws Exception {
        PoleraClase polera = new PoleraClase();
        int opcion;
        Scanner sc = new Scanner(System.in);

        // MUESTRO MENÚ DE OPCIONES
        do {
            System.out.println("1. Agregar Polera");
            System.out.println("2. Mostrar Poleras");
            System.out.println("3. Salir");
            System.out.println("Ingresar una opción");

            // ALMACENO OPCIÓN DEL USUARIO
            opcion = sc.nextInt();

            // TAREAS SEGÚN LA OPCIÓN ESCOGIDA
            switch (opcion) {
                case 1:
                System.out.println("Ingresa la talla");
                String talla = sc.next();
                System.out.println("Ingresa marca");
                String marca = sc.next();
                System.out.println("Ingresa la precio");
                int precio = sc.nextInt();
                polera.agregarPolera(talla, marca, precio);
                    break;
                case 2:
                    polera.mostrarPoleras();
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    sc.close();
            }
        } while (opcion != 3);
        System.out.println("Salí del Do While.");

        sc.close();
    }
}