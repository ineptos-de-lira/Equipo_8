import java.util.Scanner;


public final class BancoApp {

  // Constructor privado para evitar instanciación.
  private BancoApp() { }

  /**
   * Método principal del sistema.
   *
   * @param args argumentos del sistema
   */
  public static void main(final String[] args) {

    Scanner entrada = new Scanner(System.in);
    CuentaBancaria cuenta = new CuentaBancaria(0);

    int opcion = 0;

    while (opcion != 5) {
      System.out.println("===== SISTEMA BANCARIO =====");
      System.out.println("1. Añadir dinero");
      System.out.println("2. Retirar dinero");
      System.out.println("3. Donar dinero");
      System.out.println("4. Pagar servicio");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");

      opcion = entrada.nextInt();
    }
  }
}

