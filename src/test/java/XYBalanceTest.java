import org.junit.Test;

import static org.junit.Assert.*;

public class XYBalanceTest {

    @Test
    public void xyBalanceShouldReturnTrue() {
        //GIVEN
        String a = "xaxxbby";
        //WHEN
        boolean result = Task2.xyBalance(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void xyBalanceShouldReturnFalse() {
        //GIVEN
        String a = "xaxxbbyx";
        //WHEN
        boolean result = Task2.xyBalance(a);
        //THEN
        assertFalse(result);
    }

    @Test
    public void xyBalanceShouldReturnTrueForEmptyString() {
        //GIVEN
        String a = "";
        //WHEN
        boolean result = Task2.xyBalance(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void xyBalanceShouldReturnTrueForOneY() {
        //GIVEN
        String a = "y";
        //WHEN
        boolean result = Task2.xyBalance(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void xyBalanceShouldReturnFalseForOneX() {
        //GIVEN
        String a = "x";
        //WHEN
        boolean result = Task2.xyBalance(a);
        //THEN
        assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForString(){
        //WHEN
        boolean result = Task2.xyBalance(null);
    }
}