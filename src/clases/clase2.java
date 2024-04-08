package clases;

public class clase2 {

    public static void main(String[] args) {
        // Crear una instancia de Clase2
        clase2 objeto = new clase2();

        // Ejemplo de uso de los métodos
        objeto.saludar();
        System.out.println("El área de un cuadrado de lado 5 es: " + objeto.calcularAreaCuadrado(5));
        System.out.println("El perímetro de un cuadrado de lado 5 es: " + objeto.calcularPerimetroCuadrado(5));
        System.out.println("El área de un círculo de radio 3 es: " + objeto.calcularAreaCirculo(3));
        System.out.println("La circunferencia de un círculo de radio 3 es: " + objeto.calcularCircunferenciaCirculo(3));
    }

    public void saludar() {
        System.out.println("¡Hola desde la clase2!");
    }

    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double calcularCircunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}
