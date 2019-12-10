import org.junit.Test;

import static org.junit.Assert.*;

public class Fix23Test {

    @Test
    public void fix23LastThreeInArray() {
        //GIVEN
        int[] a = {1, 2, 3};
        //WHEN
        int[] result = Task2.fix23(a);

        int[] expected = {1, 2, 0};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test
    public void fix23MiddleThreeInArray() {
        //GIVEN
        int[] a = {2, 3, 5};
        //WHEN
        int[] result = Task2.fix23(a);

        int[] expected = {2, 0, 5};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test
    public void fix23FirstThreeInArray() {
        //GIVEN
        int[] a = {3, 2, 1};
        //WHEN
        int[] result = Task2.fix23(a);

        int[] expected = {3, 2, 1};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test
    public void fix23MiddleAndLastThreeInArray() {
        //GIVEN
        int[] a = {2, 3, 3};
        //WHEN
        int[] result = Task2.fix23(a);

        int[] expected = {2, 0, 3};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test
    public void fix23WithoutThreeInArray() {
        //GIVEN
        int[] a = {1, 2, 1};
        //WHEN
        int[] result = Task2.fix23(a);

        int[] expected = {1, 2, 1};

        //THEN
        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForArray(){
        //WHEN
        int[] result = Task2.fix23(null);
    }
}