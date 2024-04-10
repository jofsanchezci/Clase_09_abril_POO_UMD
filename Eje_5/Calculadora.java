import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Por favor ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Por favor ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        try {
            double resultadoSuma = sumar(num1, num2);
            double resultadoResta = restar(num1, num2);
            double resultadoMultiplicacion = multiplicar(num1, num2);
            double resultadoDivision = dividir(num1, num2);

            System.out.println("Suma: " + resultadoSuma);
            System.out.println("Resta: " + resultadoResta);
            System.out.println("Multiplicación: " + resultadoMultiplicacion);
            System.out.println("División: " + resultadoDivision);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida");
        }

        scanner.close();
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return num1 / num2;
    }
}
