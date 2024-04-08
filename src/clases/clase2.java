package clases;

public class clase2 {

    public static void main(String[] args) {
        // Ejemplo de uso de las funciones
        saludar();
        System.out.println("El área de un cuadrado de lado 5 es: " + calcularAreaCuadrado(5));
        System.out.println("El área de un círculo de radio 3 es: " + calcularAreaCirculo(3));
    }

    public static void saludar() {
        System.out.println("¡Hola desde la clase2!");
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}
