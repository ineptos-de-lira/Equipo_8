/**
 * Representa una cuenta bancaria simple.
 */

public class CuentaBancaria {

  /** Saldo actual de la cuenta. */
  private double saldo;

  /**
   * Crea una nueva cuenta con saldo inicial.
   *
   */
  public CuentaBancaria(final double saldoInicial) {
    this.saldo = saldoInicial;
  }

  /**
   * Obtiene el saldo actual de la cuenta.
   *
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * Añade dinero al saldo si la cantidad es válida.
   *
   */
  public boolean agregarDinero(final double cantidad) {
    if (cantidad > 0) {
      saldo += cantidad;
      return true;
    }
    return false;
  }
}
