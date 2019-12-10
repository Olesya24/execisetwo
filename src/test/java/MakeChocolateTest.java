import org.junit.Test;

import static org.junit.Assert.*;

public class MakeChocolateTest {

    @Test
    public void makeChocolateShouldReturn50() {
        //GIVEN
        int small = 60;
        int big = 100;
        int goal = 550;

        int expected = 50;

        //WHEN
        int result = Task2.makeChocolate(small, big, goal);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void makeChocolateShouldReturn0() {
        //GIVEN
        int small = 1;
        int big = 2;
        int goal = 5;

        int expected = 0;

        //WHEN
        int result = Task2.makeChocolate(small, big, goal);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void makeChocolateCantBeDone() {
        //GIVEN
        int small = 4;
        int big = 1;
        int goal = 10;

        int expected = -1;

        //WHEN
        int result = Task2.makeChocolate(small, big, goal);

        //THEN
        assertEquals(expected, result);
    }
}