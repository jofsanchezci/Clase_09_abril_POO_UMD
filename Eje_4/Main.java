public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Acceso denegado - Debes tener al menos 18 años.");
    }
    else {
      System.out.println("Acceso concedido - ¡Ya eres mayor!");
    }
  }

  public static void main(String[] args) {
    checkAge(19);
  }
}