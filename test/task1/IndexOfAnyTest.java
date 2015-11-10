package task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndexOfAnyTest {
    @Test
    public void emptyStringTest() {
        assertEquals(-1, IndexOfAny.indexOfAny("", new char[0]));
    }

    @Test
    public void successSearchTest() {
        assertEquals(2, IndexOfAny.indexOfAny("adfg", new char[]{'x', 'f', 'e'}));
    }

    @Test
    public void  failSearchTest() {
        assertEquals(-1,IndexOfAny.indexOfAny("qwerty",new char[]{'a'}));
    }
}