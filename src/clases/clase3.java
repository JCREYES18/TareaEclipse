package clases;

import java.util.Scanner;

public class clase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una serie de números separados por espacios:");

        int[] numeros = leerNumeros(scanner);

        System.out.println("Los números ingresados son: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        double promedio = calcularPromedio(numeros);
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);
    }

    public static int[] leerNumeros(Scanner scanner) {
        System.out.print("Números: ");
        String[] entrada = scanner.nextLine().split(" ");
        int[] numeros = new int[entrada.length];
        
        for (int i = 0; i < entrada.length; i++) {
            try {
                numeros[i] = Integer.parseInt(entrada[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese solo números separados por espacios.");
                break;
            }
        }
        
        return numeros;
    }

    public static double calcularPromedio(int[] numeros) {
        double sumatoria = 0;
        for (int num : numeros) {
            sumatoria += num;
        }
        return sumatoria / numeros.length;
    }
}
