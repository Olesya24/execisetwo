import org.junit.Test;

import static org.junit.Assert.*;

public class ShiftLeftTest {

    @Test
    public void shiftLeft() {
        //GIVEN
        int[] a = {1, 1, 2, 2, 4};
        //WHEN
        int[] result = Task2.shiftLeft(a);

        int[] expected = {1, 2, 2, 4, 1};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test
    public void shiftLeftForOneElement() {
        //GIVEN
        int[] a = {1};

        //WHEN
        int[] result = Task2.shiftLeft(a);

        int[] expected = {1};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test
    public void shiftLeftForEmptyArray() {
        //GIVEN
        int[] a = {};

        //WHEN
        int[] result = Task2.shiftLeft(a);

        int[] expected = {};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForArray(){
        //WHEN
        int[] result = Task2.shiftLeft(null);
    }
}