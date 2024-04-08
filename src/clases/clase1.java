package clases;

import java.util.Scanner;

public class clase1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa");

        while (true) {
            mostrarMenu();

            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opción no válida, por favor seleccione nuevamente.");
                scanner.next();
                continue;
            }

            if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                break;
            }

            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción no válida, por favor seleccione nuevamente.");
                continue;
            }

            System.out.println("Ingrese dos números:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            double resultado = (opcion == 1) ? num1 + num2 : (opcion == 2) ? num1 - num2 : (num2 != 0) ? num1 / num2 : Double.POSITIVE_INFINITY;
            System.out.println("El resultado es: " + resultado);
        }
    }

    public static void mostrarMenu() {
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Salir");
    }
}
