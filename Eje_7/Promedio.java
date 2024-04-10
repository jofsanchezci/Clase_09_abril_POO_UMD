import java.util.InputMismatchException;
import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de números a promediar:");
        int cantidadNumeros = scanner.nextInt();

        double suma = 0;
        int cantidadValidos = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + i + ":");
            try {
                double numero = scanner.nextDouble();
                suma += numero;
                cantidadValidos++;
            } catch (InputMismatchException e) {
                System.out.println("Error: Tipo de dato incorrecto. Intente nuevamente.");
                // Limpiamos el buffer del scanner
                scanner.next();
                i--; // Volvemos a pedir el mismo número
            }
        }

        if (cantidadValidos > 0) {
            double promedio = suma / cantidadValidos;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos para calcular el promedio.");
        }

        scanner.close();
    }
}
