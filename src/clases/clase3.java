package clases;

import java.util.Arrays;
import java.util.Scanner;

public class clase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese una serie de números separados por espacios:");

        String[] numerosStr = scanner.nextLine().split(" ");
        int[] numeros = new int[numerosStr.length];

        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        System.out.println("Los números ingresados son: " + Arrays.toString(numeros));

        int cantidadNumeros = numeros.length;
        System.out.println("La cantidad de números ingresados es: " + cantidadNumeros);

        int suma = calcularSuma(numeros);
        System.out.println("La suma de los números ingresados es: " + suma);

        int maximo = encontrarMaximo(numeros);
        System.out.println("El número máximo ingresado es: " + maximo);
    }

    public static int calcularSuma(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static int encontrarMaximo(int[] numeros) {
        int maximo = Integer.MIN_VALUE;
        for (int num : numeros) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }
}
