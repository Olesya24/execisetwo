import org.junit.Test;

import static org.junit.Assert.*;

public class More20Test {

    @Test
    public void more20True() {
        //GIVEN
        int a = 61;
        //WHEN
        boolean result = Task2.more20(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void more20False() {
        //GIVEN
        int a = 20;
        //WHEN
        boolean result = Task2.more20(a);
        //THEN
        assertFalse(result);
    }

    @Test
    public void more20NonNegativeNullShouldReturnFalse() {
        //GIVEN
        int a = 0;
        //WHEN
        boolean result = Task2.more20(a);
        //THEN
        assertFalse(result);
    }

    @Test
    public void more20NegativeNumberShouldReturnFalse() {
        //GIVEN
        int a = -1;
        //WHEN
        boolean result = Task2.more20(a);
        //THEN
        assertFalse(result);
    }

}