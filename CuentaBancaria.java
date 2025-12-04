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
  /**
 * Retira dinero si la cantidad es válida y hay saldo suficiente.
 *
 * @param cantidad el monto a retirar
 * @return true si se retiró el dinero, false en caso contrario
 */
public boolean retirarDinero(final double cantidad) {
  if (cantidad > 0 && saldo >= cantidad) {
    saldo -= cantidad;
    return true;
  }
  return false;
}

/**
 * Dona dinero si hay saldo suficiente.
 *
 * @param cantidad el monto a donar
 * @return true si se completó la donación, false en caso contrario
 */
public boolean donarDinero(final double cantidad) {
  return retirarDinero(cantidad);
}

/**
 * Paga un servicio si hay saldo suficiente.
 *
 * @param costo el costo del servicio
 * @return true si se pagó el servicio, false en caso contrario
 */
public boolean pagarServicio(final double costo) {
  return retirarDinero(costo);
}

}
