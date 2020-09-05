package local.djsantos;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar("1 + 5 + 3");
        assertEquals(9, soma);
    }

    @Test
    public void testSomarWithMock() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.somar("1+3")).thenReturn(10);

        int resultado = calculadora.somar("1+3");

        assertEquals(10, resultado);

    }

}