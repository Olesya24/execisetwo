import org.junit.Test;

import static org.junit.Assert.*;

public class GHappyTest {

    @Test
    public void gHappyShouldReturnTrueWhenGG() {
        //GIVEN
        String a = "oooggooo";
        //WHEN
        boolean result = Task2.gHappy(a);
        //THEN
        assertTrue(result);
    }

    @Test
    public void gHappyShouldReturnFalseWhenG() {
        //GIVEN
        String a = "ooogooo";
        //WHEN
        boolean result = Task2.gHappy(a);
        //THEN
        assertFalse(result);
    }

    @Test
    public void gHappyShouldReturnFalseWhenGGOOGO() {
        //GIVEN
        String a = "oooggoogo";
        //WHEN
        boolean result = Task2.gHappy(a);
        //THEN
        assertFalse(result);
    }

    @Test
    public void gHappyShouldReturnTrueWhenEmptyString() {
        //GIVEN
        String a = "";
        //WHEN
        boolean result = Task2.gHappy(a);
        //THEN
        assertTrue(result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForString(){
        //WHEN
        boolean result = Task2.gHappy(null);
    }
}