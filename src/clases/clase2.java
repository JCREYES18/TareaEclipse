package clases;

public class clase2 {

    public static void main(String[] args) {
        // Crear una instancia de Clase2
        clase2 objeto = new clase2();

        // Ejemplo de uso de los métodos
        objeto.saludar();
        System.out.println("El área de un círculo de radio 3 es: " + objeto.calcularAreaCirculo(3));
        System.out.println("El perímetro de un círculo de radio 3 es: " + objeto.calcularPerimetroCirculo(3));
        System.out.println("El área de un triángulo con base 4 y altura 3 es: " + objeto.calcularAreaTriangulo(4, 3));
        System.out.println("El perímetro de un triángulo con lados 3, 4 y 5 es: " + objeto.calcularPerimetroTriangulo(3, 4, 5));
        System.out.println("El volumen de una esfera con radio 4 es: " + objeto.calcularVolumenEsfera(4));
    }

    public void saludar() {
        System.out.println("¡Hola desde la Clase2!");
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
    
    public double calcularVolumenEsfera(double radio) {
        return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
    }
}
