package local.djsantos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorNewTest {

    @Test
    public void shouldSumTwoValues() {
        int valueA = 2;
        int valueB = 4;

        CalculatorNew calculatorNew = new CalculatorNew();
        int soma = calculatorNew.sum(valueA, valueB);

        assertEquals(6, soma);
    }

}
