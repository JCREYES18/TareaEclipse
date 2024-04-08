package clases;

import java.util.Scanner;

public class clase1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa");

        boolean salir = false;
        while (!salir) {
            System.out.println("Por favor, seleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");

            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opción no válida, por favor seleccione nuevamente.");
                scanner.next(); // Limpiar el buffer del scanner
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese dos números para suma:");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    System.out.println("El resultado es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Ingrese dos números para resta:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("El resultado es: " + (num1 - num2));
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor seleccione nuevamente.");
            }
        }
    }
}
