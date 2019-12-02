import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void nonStartTest() throws Exception {
        //GIVEN
        Task2 string= new Task2();
        //WHERE
        String actual1 = string.nonStart("","");
        String actual2 = string.nonStart("a", "x");
        String actual3 = string.nonStart("ab", "xy");
        String actual4 = string.nonStart("ab", "x");
        String actual5 = string.nonStart("x", "ac");
        String actual6 = string.nonStart("java", "core");

        String expected1 = "";
        String expected2 = "";
        String expected3 = "by";
        String expected4 = "b";
        String expected5 = "c";
        String expected6 = "avaore";


        //THEN
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
        assertEquals(expected4,actual4);
        assertEquals(expected5,actual5);
        assertEquals(expected6,actual6);
    }


    @Test
    public void sameFirstLastTest() {
        //GIVEN
        Task2 nums=new Task2();

        //WHERE
        int[] actual1 = {};
        int[] actual2 = {24};
        int[] actual3 = {8, 8} ;
        int[] actual4 = {1, 2, 3, 4, 5, 13, 1};
        int[] actual5 = {1, 2, 3, 4, 5, 13};

        //THEN
        assertEquals(false, nums.sameFirstLast(actual1));
        assertEquals(true, nums.sameFirstLast(actual2));
        assertEquals(true,nums.sameFirstLast(actual3));
        assertEquals(true,nums.sameFirstLast(actual4));
        assertEquals(false, nums.sameFirstLast(actual5));

    }

    @Test
    public void more20Test() {
        //GIVEN
        Task2 number = new Task2();

        //WHERE
        boolean actual1 = number.more20(0);
        boolean actual2 = number.more20(20);
        boolean actual3 = number.more20(61);
        boolean actual4 = number.more20(1021);
        boolean actual5 = number.more20(1000);
        boolean actual6 = number.more20(-1);

        //THEN
        assertFalse(actual1);
        assertFalse(actual2);
        assertTrue(actual3);
        assertTrue(actual4);
        assertFalse(actual5);
        assertFalse(actual6);

    }

    @Test
    public void makeChocolateTest() {
        //GIVEN
        Task2 bar = new Task2();

        //WHERE
        int actual1 = bar.makeChocolate(4, 1, 9);
        int actual2 = bar.makeChocolate(1, 2, 5);
        int actual3 = bar.makeChocolate(4, 1, 10);
        int actual4 = bar.makeChocolate(60, 100, 550);


        int expected1 = 4;
        int expected2 = 0;
        int expected3 = -1;
        int expected4 = 50;

        //THEN
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
    }


    @Test
    public void xyBalanceTest() {
        //GIVEN
        Task2 balance = new Task2();

        //WHERE
        boolean actual1 = balance.xyBalance("");
        boolean actual2 = balance.xyBalance("y");
        boolean actual3 = balance.xyBalance("x");
        boolean actual4 = balance.xyBalance("xy");
        boolean actual5 = balance.xyBalance("xaxxbby");
        boolean actual6 = balance.xyBalance("xaxxbbyx");
        boolean actual7 = balance.xyBalance("12xabxxydxyxyzz");

        //THEN
        assertTrue(actual1);
        assertTrue(actual2);
        assertFalse(actual3);
        assertTrue(actual4);
        assertTrue(actual5);
        assertFalse(actual6);
        assertTrue(actual7);
    }

    @Test
    public void mirrorEndsTest() {
        //GIVEN
        Task2 mirror = new Task2();

        //WHERE
        String actual1 = mirror.mirrorEnds("");
        String actual2 = mirror.mirrorEnds("k");
        String actual3 = mirror.mirrorEnds("aba");
        String actual4 = mirror.mirrorEnds("band andab");
        String actual5 = mirror.mirrorEnds("abab");

        String expected1 = "";
        String expected2 = "k";
        String expected3 = "aba";
        String expected4 = "ba";
        String expected5 = "";

        //THEN
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);

    }

    @Test
    public void shiftLeftTest() {
        //GIVEN
        Task2 nums=new Task2();

        //WHERE
        int[] a1 = {};
        int[] a2 = {1};
        int[] a3 = {1, 2};
        int[] a4 = {1, 1, 2, 2, 4};

        int[] actual1 = nums.shiftLeft(a1);
        int[] actual2 = nums.shiftLeft(a2);
        int[] actual3 = nums.shiftLeft(a3);
        int[] actual4 = nums.shiftLeft(a4);

        int[] expected1 = {};
        int[] expected2 = {1};
        int[] expected3 = {2, 1};
        int[] expected4 = {1, 2, 2, 4, 1};

        //THEN
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
    }

    @Test
    public void canBalanceTest() {
        //GIVEN
        Task2 nums=new Task2();

        //WHERE
        int[] actual1 = {24};
        int[] actual3 = {8, 8};
        int[] actual4 = {1, 2, 3, 1, 0, 1, 3};
        int[] actual5 = {1, 2, 3, 1, 0, 2, 3};
        int[] actual6 = {10, 0, 1, -1, 10};

        //THEN
        assertEquals(false, nums.canBalance(actual1));
        assertEquals(true, nums.canBalance(actual3));
        assertEquals(false, nums.canBalance(actual4));
        assertEquals(true, nums.canBalance(actual5));
        assertEquals(true, nums.canBalance(actual6));
    }

    @Test
    public void fix23Test() {
        //GIVEN
        Task2 nums=new Task2();

        //WHERE
        int[] a1 = {1, 2, 3};
        int[] a2 = {2, 3, 5};
        int[] a3 = {3, 2, 1};
        int[] a4 = {1, 2, 1};
        int[] a5 = {2, 3, 3};

        int[] actual1 = nums.fix23(a1);
        int[] actual2 = nums.fix23(a2);
        int[] actual3 = nums.fix23(a3);
        int[] actual4 = nums.fix23(a4);
        int[] actual5 = nums.fix23(a5);

        int[] expected1 = {1, 2, 0};
        int[] expected2 = {2, 0, 5};
        int[] expected3 = {3, 2, 1};
        int[] expected4 = {1, 2, 1};
        int[] expected5 = {2, 0, 3};

        //THEN
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }


    @Test
    public void gHappyTest() {
        //GIVEN
        Task2 happy = new Task2();

        //WHERE
        boolean actual1 = happy.gHappy("");
        boolean actual2 = happy.gHappy("g");
        boolean actual3 = happy.gHappy("gg");
        boolean actual4 = happy.gHappy("oooggooo");
        boolean actual5 = happy.gHappy("ooogooo");
        boolean actual6 = happy.gHappy("oooggoogo");

        //THEN
        assertTrue(actual1);
        assertFalse(actual2);
        assertTrue(actual3);
        assertTrue(actual4);
        assertFalse(actual5);
        assertFalse(actual6);
    }
}