package clases;

import java.util.Arrays;
import java.util.Scanner;

public class clase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una serie de números separados por espacios:");

        int[] numeros = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Los números ingresados son: " + Arrays.toString(numeros));

        int total = Arrays.stream(numeros).sum();
        System.out.println("El total de los números ingresados es: " + total);

        int maximo = Arrays.stream(numeros).max().getAsInt();
        System.out.println("El número máximo ingresado es: " + maximo);

        double mediana = calcularMediana(numeros);
        System.out.println("La mediana de los números ingresados es: " + mediana);
    }

    public static double calcularMediana(int[] numeros) {
        Arrays.sort(numeros);
        int n = numeros.length;
        return (n % 2 != 0) ? numeros[n / 2] : (numeros[n / 2 - 1] + numeros[n / 2]) / 2.0;
    }
}
