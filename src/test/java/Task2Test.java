import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void nonStartTest() throws Exception {
        //GIVEN
        Task2 string= new Task2();
        //WHEN
        String actualString1 = string.nonStart("","");
        String actualString2 = string.nonStart("a", "x");
        String actualString3 = string.nonStart("ab", "xy");
        String actualString4 = string.nonStart("ab", "x");
        String actualString5 = string.nonStart("x", "ac");
        String actualString6 = string.nonStart("java", "core");

        String expected1 = "";
        String expected2 = "";
        String expected3 = "by";
        String expected4 = "b";
        String expected5 = "c";
        String expected6 = "avaore";


        //THEN
        assertEquals(expected1,actualString1);
        assertEquals(expected2,actualString2);
        assertEquals(expected3,actualString3);
        assertEquals(expected4,actualString4);
        assertEquals(expected5,actualString5);
        assertEquals(expected6,actualString6);
    }


    @Test
    public void sameFirstLastTest() {
        //GIVEN
        Task2 nums=new Task2();

        //THEN
        int[] actualnums1 = {};
        int[] actualnums2 = {24};
        int[] actualnums3 = {8, 8} ;
        int[] actualnums4 = {1, 2, 3, 4, 5, 13, 1};
        int[] actualnums5 = {1, 2, 3, 4, 5, 13};

        //WHEN
        assertEquals(false, nums.sameFirstLast(actualnums1));
        assertEquals(true, nums.sameFirstLast(actualnums2));
        assertEquals(true,nums.sameFirstLast(actualnums3));
        assertEquals(true,nums.sameFirstLast(actualnums4));
        assertEquals(false, nums.sameFirstLast(actualnums5));

    }

    @Test
    public void more20Test() {
        //GIVEN
        Task2 number = new Task2();

        //THEN
        boolean actualNumber1 = number.more20(0);
        boolean actualNumber2 = number.more20(20);
        boolean actualNumber3 = number.more20(61);
        boolean actualNumber4 = number.more20(1021);
        boolean actualNumber5 = number.more20(1000);
        boolean actualNumber6 = number.more20(-1);

        //WHEN
        assertFalse(actualNumber1);
        assertFalse(actualNumber2);
        assertTrue(actualNumber3);
        assertTrue(actualNumber4);
        assertFalse(actualNumber5);
        assertFalse(actualNumber6);

    }

    @Test
    public void makeChocolateTest() {
        //GIVEN
        Task2 bar = new Task2();

        //THEN
        int actualbar1 = bar.makeChocolate(4, 1, 9);
        int actualbar2 = bar.makeChocolate(1, 2, 5);
        int actualbar3 = bar.makeChocolate(4, 1, 10);
        int actualbar4 = bar.makeChocolate(60, 100, 550);


        int expected1 = 4;
        int expected2 = 0;
        int expected3 = -1;
        int expected4 = 50;

        //WHEN
        assertEquals(expected1, actualbar1);
        assertEquals(expected2, actualbar2);
        assertEquals(expected3, actualbar3);
        assertEquals(expected4, actualbar4);
    }


    @Test
    public void xyBalanceTest() {
        //GIVEN
        Task2 balance = new Task2();

        //THEN
        boolean actualBalance1 = balance.xyBalance("");
        boolean actualBalance2 = balance.xyBalance("y");
        boolean actualBalance3 = balance.xyBalance("x");
        boolean actualBalance4 = balance.xyBalance("xy");
        boolean actualBalance5 = balance.xyBalance("xaxxbby");
        boolean actualBalance6 = balance.xyBalance("xaxxbbyx");
        boolean actualBalance7 = balance.xyBalance("12xabxxydxyxyzz");

        //WHEN
        assertTrue(actualBalance1);
        assertTrue(actualBalance2);
        assertFalse(actualBalance3);
        assertTrue(actualBalance4);
        assertTrue(actualBalance5);
        assertFalse(actualBalance6);
        assertTrue(actualBalance7);
    }
}