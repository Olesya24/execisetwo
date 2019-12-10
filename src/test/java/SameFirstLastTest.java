import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {
    @Test
    public void sameFirstLastTrue() {
        //GIVEN
        int[] a = {1, 2, 3, 4, 5, 13, 1};
        //WHEN
        boolean result = Task2.sameFirstLast(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void sameFirstLastFalse() {
        //GIVEN
        int[] a = {1, 2, 3, 4, 5, 13};
        //WHEN
        boolean result = Task2.sameFirstLast(a);
        //THEN
        assertFalse(result);
    }

    @Test
    public void sameFirstLastShouldReturnTrueForOneElementInArray() {
        //GIVEN
        int[] a = {24};
        //WHEN
        boolean result = Task2.sameFirstLast(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void sameFirstLastShouldReturnFalseForEmptyArray() {
        //GIVEN
        int[] a = {};
        //WHEN
        boolean result = Task2.sameFirstLast(a);
        //THEN
        assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException(){
        //WHEN
        boolean result = Task2.sameFirstLast(null);
    }
}