package pe.edu.unsch;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CuentaBancariaTest {

    @Test
    public void debeRetirarDinero() {
        CuentaBancaria cuenta = new CuentaBancaria(100);

        cuenta.retirar(30);

        assertEquals(999, cuenta.obtenerSaldo(), 0.001);
    }
}