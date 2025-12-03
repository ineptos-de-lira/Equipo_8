import java.util.Scanner;

/**
 * Clase principal que ejecuta el menú del sistema bancario.
 */
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

      switch (opcion) {
        case 1:
          System.out.print("Cantidad a añadir: ");
          cuenta.añadirDinero(entrada.nextDouble());
          break;

        case 2:
          System.out.print("Cantidad a retirar: ");
          cuenta.retirarDinero(entrada.nextDouble());
          break;

        case 3:
          System.out.print("Cantidad a donar: ");
          cuenta.donarDinero(entrada.nextDouble());
          break;

        case 4:
          System.out.print("Costo del servicio: ");
          cuenta.pagarServicio(entrada.nextDouble());
          break;

        case 5:
          System.out.println("Saliendo...");
          break;

        default:
          System.out.println("Opción inválida.");
          break;
      }

      System.out.println("Saldo actual: $" + cuenta.getSaldo());
      System.out.println();
    }

    entrada.close();
  }
}


