import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias de la clase CuentaBancaria.
 */
public class CuentaBancariaTest {

  @Test
  public void pruebaAñadirDineroValido() {
    CuentaBancaria cuenta = new CuentaBancaria(0);
    assertTrue(cuenta.añadirDinero(100));
    assertEquals(100, cuenta.getSaldo());
  }
  
  @Test
  public void pruebaAñadirDineroInvalido() {
    CuentaBancaria cuenta = new CuentaBancaria(0);
    assertFalse(cuenta.añadirDinero(-50));
    assertEquals(0, cuenta.getSaldo());
  }

  @Test
  public void pruebaRetiroValido() {
    CuentaBancaria cuenta = new CuentaBancaria(200);
    assertTrue(cuenta.retirarDinero(150));
    assertEquals(50, cuenta.getSaldo());
  }

  @Test
  public void pruebaRetiroInsuficiente() {
    CuentaBancaria cuenta = new CuentaBancaria(50);
    assertFalse(cuenta.retirarDinero(100));
    assertEquals(50, cuenta.getSaldo());
  }


}