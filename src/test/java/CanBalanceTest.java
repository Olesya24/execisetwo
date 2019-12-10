import org.junit.Test;

import static org.junit.Assert.*;

public class CanBalanceTest {

    @Test
    public void canBalanceTrue() {
        //GIVEN
        int[] a = {1, 2, 3, 1, 0, 2, 3};
        //WHEN
        boolean result = Task2.canBalance(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void canBalanceFalse() {
        //GIVEN
        int[] a = {1, 2, 3, 1, 0, 1, 3};
        //WHEN
        boolean result = Task2.canBalance(a);
        //THEN
        assertFalse(result);
    }

    @Test
    public void canBalanceShouldReturnFalseForOneElementInArray() {
        //GIVEN
        int[] a = {24};
        //WHEN
        boolean result = Task2.canBalance(a);
        //THEN
        assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForArray(){
        //WHEN
        boolean result = Task2.canBalance(null);
    }
}