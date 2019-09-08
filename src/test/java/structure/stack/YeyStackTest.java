package structure.stack;

import org.junit.Test;
import static org.junit.Assert.*;

public class YeyStackTest {
  @Test public void testPushAndPop() {
    YeyStack classUnderTest = new YeyStack();

    classUnderTest.push("Semua");
    classUnderTest.push("Halo");

    assertEquals("Halo", classUnderTest.pop());
    assertEquals("Semua", classUnderTest.pop());
  }

  @Test public void testTop() {
    YeyStack classUnderTest = new YeyStack();

    classUnderTest.push("Semua");
    classUnderTest.push("Halo");

    assertEquals("Halo", classUnderTest.top());
  }

  @Test public void testIsEmpty() {
    YeyStack classUnderTest = new YeyStack();

    assertTrue(classUnderTest.isEmpty());

    classUnderTest.push("Semua");

    assertFalse(classUnderTest.isEmpty());
  }

  @Test public void testSize() {
    YeyStack classUnderTest = new YeyStack();

    classUnderTest.push("Semua");
    classUnderTest.push("Halo");

    assertEquals(2, classUnderTest.size());
  }
}