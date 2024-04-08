package clases;

import java.util.Scanner;
import java.util.ArrayList;

public class clase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una serie de números separados por espacios:");

        ArrayList<Integer> numeros = leerNumeros(scanner);

        System.out.println("Los números ingresados son: " + numeros);
    }

    public static ArrayList<Integer> leerNumeros(Scanner scanner) {
        ArrayList<Integer> numeros = new ArrayList<>();
        String[] entrada = scanner.nextLine().split(" ");
        
        for (String num : entrada) {
            try {
                numeros.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese solo números separados por espacios.");
                break;
            }
        }
        
        return numeros;
    }
}
