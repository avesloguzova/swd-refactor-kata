package task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbbreviateTest {

  public static final String TEST_STRING = "qwertyuiop";

  @Test
  public void emptyStringTest() {
    assertEquals("", Abbreviate.abbreviate("", 0, 8));
  }

  @Test
  public void widthMoreLengthTest(){
    assertEquals(TEST_STRING,Abbreviate.abbreviate(TEST_STRING,0,11));
  }

  @Test
  public void offsetMoreLengthTest() {
    assertEquals("...yuiop", Abbreviate.abbreviate(TEST_STRING, 12, 8));
  }

  @Test(expected = IllegalArgumentException.class)
  public void negativeOffsetTest() {
    Abbreviate.abbreviate(TEST_STRING, -1, 10);
  }

  @Test
  public void smallOffsetTest() {
    assertEquals("qwert...", Abbreviate.abbreviate(TEST_STRING, 3, 8));
  }

  @Test(expected = IllegalArgumentException.class)
  public void smallMaxWidthTest() {
    Abbreviate.abbreviate(TEST_STRING, 0, 3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void maxWidthWithOffsetTest() {
    Abbreviate.abbreviate(TEST_STRING, 5, 5);
  }

//    @Test
}