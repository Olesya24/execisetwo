import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {

    @Test
    public void nonStart() {
        //GIVEN
        String a = "java";
        String b = "core";
        String expected = "avaore";
        //WHEN
        String result = Task2.nonStart(a, b);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharInA() {
        //GIVEN
        String a = "j";
        String b = "ore";
        String expected = "re";
        //WHEN
        String result = Task2.nonStart(a, b);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharInB() {
        //GIVEN
        String a = "ab";
        String b = "x";
        String expected = "b";
        //WHEN
        String result = Task2.nonStart(a, b);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharsInAB() {
        //GIVEN
        String a = "a";
        String b = "x";
        String expected = "";
        //WHEN
        String result = Task2.nonStart(a, b);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void nonStartEmptyStrings() {
        //GIVEN
        String a = "";
        String b = "";
        String expected = "";
        //WHEN
        String result = Task2.nonStart(a, b);
        //THEN
        assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForString(){
        //WHEN
        String result = Task2.nonStart(null, null);
    }
}