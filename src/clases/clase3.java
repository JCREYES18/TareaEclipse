package clases;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class clase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese una serie de números separados por espacios:");

        String[] numerosStr = scanner.nextLine().split(" ");
        int[] numeros = Arrays.stream(numerosStr).mapToInt(Integer::parseInt).toArray();

        System.out.println("Los números ingresados son: " + Arrays.toString(numeros));

        int total = Arrays.stream(numeros).sum();
        System.out.println("La suma de los números ingresados es: " + total);

        int maximo = Arrays.stream(numeros).max().getAsInt();
        System.out.println("El número máximo ingresado es: " + maximo);

        int minimo = Arrays.stream(numeros).min().getAsInt();
        System.out.println("El número mínimo ingresado es: " + minimo);

        int moda = calcularModa(numeros);
        System.out.println("La moda de los números ingresados es: " + moda);
    }

    public static int calcularModa(int[] numeros) {
        Map<Integer, Integer> conteo = new HashMap<>();
        for (int num : numeros) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }

        int moda = -1;
        int frecuenciaMaxima = 0;
        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() > frecuenciaMaxima) {
                moda = entry.getKey();
                frecuenciaMaxima = entry.getValue();
            }
        }
        return moda;
    }
}
