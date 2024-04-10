import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese la ruta del archivo a leer:");
        String rutaArchivo = scanner.nextLine();

        try {
            leerArchivo(rutaArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el archivo.");
            // Aquí puedes agregar más información o acciones a realizar en caso de que no se encuentre el archivo.
        }

        scanner.close();
    }

    public static void leerArchivo(String ruta) throws FileNotFoundException {
        File archivo = new File(ruta);
        Scanner lector = new Scanner(archivo);

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            System.out.println(linea);
        }

        lector.close();
    }
}
