public class CuentaBancaria {

    /** Saldo actual de la cuenta. */
    private double saldo;

    /**
    * Crea una nueva cuenta con saldo inicial.
    *
    * @param saldoInicial saldo inicial de la cuenta
    */
    public CuentaBancaria(final double saldoInicial) {
        this.saldo = saldoInicial;
    }

    /**
    * Obtiene el saldo actual de la cuenta.
    *
    * @return saldo actual
    */
    public double getSaldo() {
        return saldo;
    }

    /**
    * Añade dinero al saldo si la cantidad es válida.
    *
    * @param cantidad monto a añadir
    * @return true si se añadió correctamente, false si no
    */
    public boolean añadirDinero(final double cantidad) {
    if (cantidad > 0) {
        saldo += cantidad;
    return true;
    }
        return false;
  }
}
