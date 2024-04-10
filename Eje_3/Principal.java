public class Principal {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[0]);
    } catch (Exception e) {
      System.out.println("Algo Salio Mal");
    } finally {
      System.out.println("La exepcion ha terminado");
    }
  }
}