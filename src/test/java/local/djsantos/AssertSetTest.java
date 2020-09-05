package local.djsantos;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertSetTest {

    @Test
    public void testAssertSet() {
        // array
        byte[] esperado = "teste".getBytes();
        byte[] retorno = "teste".getBytes();
        assertArrayEquals(esperado, retorno);

        // string
        assertEquals("text", "text");

        // false
        assertFalse(false);

        // not null
        Object obj = new Object();
        assertNotNull(obj);

        // null
        assertNull(null);

        // not same
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2);

        // same
        Integer number = 6;
        assertSame(number, number);

    }

}