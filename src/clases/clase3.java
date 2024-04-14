package clases;

import java.util.Arrays;
import java.util.Scanner;

public class clase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese una serie de palabras separadas por espacios:");

        String[] palabras = scanner.nextLine().split(" ");

        System.out.println("Las palabras ingresadas son: " + Arrays.toString(palabras));

        int cantidadPalabras = palabras.length;
        System.out.println("La cantidad de palabras ingresadas es: " + cantidadPalabras);

        String palabraMasLarga = encontrarPalabraMasLarga(palabras);
        System.out.println("La palabra más larga ingresada es: " + palabraMasLarga);

        String palabraMasCorta = encontrarPalabraMasCorta(palabras);
        System.out.println("La palabra más corta ingresada es: " + palabraMasCorta);
    }

    public static String encontrarPalabraMasLarga(String[] palabras) {
        String palabraMasLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

    public static String encontrarPalabraMasCorta(String[] palabras) {
        String palabraMasCorta = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
        }
        return palabraMasCorta;
    }
}
