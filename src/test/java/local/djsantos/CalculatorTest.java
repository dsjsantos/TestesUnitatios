package local.djsantos;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum("1 + 5 + 3");
        assertEquals(9, sum);
    }

    @Test
    public void testSumWithMock() {
        Calculator calculator = mock(Calculator.class);

        when(calculator.sum("1+3")).thenReturn(10);

        int resultado = calculator.sum("1+3");

        assertEquals(10, resultado);

    }

}