package clases;

public class clase2 {

    public static void main(String[] args) {
        clase2 objeto = new clase2();

        objeto.saludar();
        System.out.println("El área de un círculo de radio 3 es: " + objeto.calcularAreaCirculo(3));
        System.out.println("El perímetro de un círculo de radio 3 es: " + objeto.calcularPerimetroCirculo(3));
        System.out.println("El área de un trapecio con bases 4 y 6 y altura 3 es: " + objeto.calcularAreaTrapecio(4, 6, 3));
        System.out.println("El volumen de una esfera con radio 4 es: " + objeto.calcularVolumenEsfera(4));
        System.out.println("El perímetro de un cuadrado con lado 5 es: " + objeto.calcularPerimetroCuadrado(5));
        System.out.println("El perímetro de un rectángulo con base 5 y altura 6 es: " + objeto.calcularPerimetroRectangulo(5, 6));
    }

    public void saludar() {
        System.out.println("¡Hola desde la clase2!");
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double calcularVolumenEsfera(double radio) {
        return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
    }
    
    public double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }
    
    public double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
}
