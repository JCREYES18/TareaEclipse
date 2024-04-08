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
            System.out.println("5. Salir");

            int opcion = obtenerOpcion(scanner);
            if (opcion == 5) {
                salir = true;
                System.out.println("Saliendo del programa...");
            } else if (opcion >= 1 && opcion <= 4) {
                ejecutarOperacion(scanner, opcion);
            } else {
                System.out.println("Opción no válida, por favor seleccione nuevamente.");
            }
        }
    }

    private static int obtenerOpcion(Scanner scanner) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void ejecutarOperacion(Scanner scanner, int opcion) {
        System.out.println("Ingrese dos números para la operación:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
          
             
           
        }

        System.out.println("El resultado es: " + resultado);
    }
}
