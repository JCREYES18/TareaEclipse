package clases;

public class clase2 {

    public static void main(String[] args) {
        clase2 objeto = new clase2();
        objeto.saludar();
        System.out.println("Realizando cálculos matemáticos...");
        System.out.println("Resultado de f(x) = x^2 + 3x + 2 para x = 5: " + objeto.calcularFuncionCuadratica(5));
        System.out.println("Suma de los primeros 10 números naturales: " + objeto.calcularSumaNaturales(10));
        System.out.println("Factorial de 6: " + objeto.calcularFactorial(6));
        System.out.println("Valor absoluto de -8: " + objeto.calcularValorAbsoluto(-8));
        System.out.println("Raíz cuadrada de 25: " + objeto.calcularRaizCuadrada(25));
    }

    public void saludar() {
        System.out.println("¡Hola desde la clase2!");
    }

    public double calcularFuncionCuadratica(double x) {
        return Math.pow(x, 2) + 3 * x + 2;
    }

    public int calcularSumaNaturales(int n) {
        return n * (n + 1) / 2;
    }

    public int calcularFactorial(int n) {
        return (n == 0) ? 1 : n * calcularFactorial(n - 1);
    }

    public int calcularValorAbsoluto(int num) {
        return Math.abs(num);
    }

    public double calcularRaizCuadrada(double num) {
        return Math.sqrt(num);
    }
}
