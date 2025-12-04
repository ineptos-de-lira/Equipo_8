import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test; 

/**
 * Pruebas unitarias.
 */
public class CuentaBancariaTest {

  @Test
  public void pruebaagregarDineroValido() {
    CuentaBancaria cuenta = new CuentaBancaria(0);
    assertTrue(cuenta.agregarDinero(100));
    assertEquals(100, cuenta.getSaldo());
  }
  
  @Test
  public void pruebaagregarDineroInvalido() {
    CuentaBancaria cuenta = new CuentaBancaria(0);
    assertFalse(cuenta.agregarDinero(-50));
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

  @Test
  public void pruebaDonacionValida() {
    CuentaBancaria cuenta = new CuentaBancaria(300);
    assertTrue(cuenta.pagarServicio(100));
    assertEquals(200, cuenta.getSaldo());
  }

  @Test
  public void pruebaPagarServicioValido() {
    CuentaBancaria cuenta = new CuentaBancaria(600);
    assertTrue(cuenta.pagarServicio(250));
    assertEquals(350, cuenta.getSaldo());
  }

  @Test
  public void pruebaPagarServicioInsuficiente() {
    CuentaBancaria cuenta = new CuentaBancaria(50);
    assertFalse(cuenta.pagarServicio(200));
    assertEquals(50, cuenta.getSaldo());
  }

}