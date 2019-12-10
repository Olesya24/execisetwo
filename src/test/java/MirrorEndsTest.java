import org.junit.Test;

import static org.junit.Assert.*;

public class MirrorEndsTest {

    @Test
    public void mirrorEndsBa() {
        //GIVEN
        String a = "band andab";
        String expected = "ba";
        //WHEN
        String result = Task2.mirrorEnds(a);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void mirrorEndsAba() {
        //GIVEN
        String a = "aba";
        String expected = "aba";
        //WHEN
        String result = Task2.mirrorEnds(a);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void mirrorEndsForOneChar() {
        //GIVEN
        String a = "k";
        String expected = "k";
        //WHEN
        String result = Task2.mirrorEnds(a);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void mirrorEndsForEmptyString() {
        //GIVEN
        String a = "";
        String expected = "";
        //WHEN
        String result = Task2.mirrorEnds(a);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void notMirrorEndsShouldReturnEmptyString() {
        //GIVEN
        String a = "abab";
        String expected = "";
        //WHEN
        String result = Task2.mirrorEnds(a);
        //THEN
        assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForString(){
        //WHEN
        String result = Task2.mirrorEnds(null);
    }
}