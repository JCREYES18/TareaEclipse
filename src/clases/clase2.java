package clases;

public class clase2 {

    public static void main(String[] args) {
        clase2 objeto = new clase2();

        objeto.saludar();
        System.out.println("Calculando algunas medidas geométricas...");
        System.out.println("El área de un círculo de radio 3 es: " + objeto.calcularAreaCirculo(3));
        System.out.println("El área de un rombo con diagonales 4 y 6 es: " + objeto.calcularAreaRombo(4, 6));
        System.out.println("El perímetro de un triángulo con lados 3, 4 y 5 es: " + objeto.calcularPerimetroTriangulo(3, 4, 5));
        System.out.println("El área de un pentágono regular con lado 6 es: " + objeto.calcularAreaPentagono(6));
        System.out.println("El volumen de un cubo con lado 4 es: " + objeto.calcularVolumenCubo(4));
    }

    public void saludar() {
        System.out.println("¡Hola desde la clase2!");
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public double calcularAreaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double calcularAreaPentagono(double lado) {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(lado, 2);
    }

    public double calcularVolumenCubo(double lado) {
        return Math.pow(lado, 3);
    }
}
