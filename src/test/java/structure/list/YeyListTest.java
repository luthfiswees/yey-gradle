package structure.list;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import static org.junit.Assert.*;

public class YeyListTest {
  @Test public void testStore() {
    YeyList classUnderTest = new YeyList();

    classUnderTest.store("Ayam");

    assertEquals(1, classUnderTest.count());
    assertEquals("Ayam", classUnderTest.get(0));
  }

  @Test public void testStoreWithIndex() {
    YeyList classUnderTest = new YeyList();

    classUnderTest.store("Saitama");
    classUnderTest.store("Bang");
    classUnderTest.store("Atomic Samurai");

    assertEquals(3, classUnderTest.count());
    assertEquals("Saitama", classUnderTest.get(0));
    assertEquals("Bang", classUnderTest.get(1));
    assertEquals("Atomic Samurai", classUnderTest.get(2));

    classUnderTest.store(1, "Tatsumaki");

    assertEquals(4, classUnderTest.count());
    assertEquals("Saitama", classUnderTest.get(0));
    assertEquals("Tatsumaki", classUnderTest.get(1));
    assertEquals("Bang", classUnderTest.get(2));
    assertEquals("Atomic Samurai", classUnderTest.get(3));
  }

  @Test public void testRemove() {
    YeyList classUnderTest = new YeyList();

    classUnderTest.store("Ayam");
    classUnderTest.store("Sapi");
    classUnderTest.store("Kambing");

    assertEquals(3, classUnderTest.count());
    assertEquals("Ayam", classUnderTest.get(0));
    assertEquals("Sapi", classUnderTest.get(1));
    assertEquals("Kambing", classUnderTest.get(2));

    classUnderTest.remove(1);

    assertEquals(2, classUnderTest.count());
    assertEquals("Ayam", classUnderTest.get(0));
    assertEquals("Kambing", classUnderTest.get(1));
  }

  @Test public void testUpdate() {
    YeyList classUnderTest = new YeyList();

    classUnderTest.store("Ayam");
    classUnderTest.store("Sapi");

    assertEquals(2, classUnderTest.count());
    assertEquals("Sapi", classUnderTest.get(1));
    
    classUnderTest.update(1, "Kambing");

    assertEquals(2, classUnderTest.count());
    assertEquals("Kambing", classUnderTest.get(1));
  }

  @Test public void testIsEmptyBeforeInstantiate() {
    YeyList classUnderTest = new YeyList();

    assertEquals(true, classUnderTest.isEmpty());
  }

  @Test public void testIsEmptyAfterInstantiate() {
    YeyList classUnderTest = new YeyList();

    classUnderTest.store("Keyboard");

    assertEquals(false, classUnderTest.isEmpty());

    classUnderTest.remove(0);

    assertEquals(true, classUnderTest.isEmpty());
  }

  @Test public void testPrintList() throws Exception {
    // Define class under test
    YeyList classUnderTest = new YeyList();

    // Populate list
    classUnderTest.store("Hello");
    classUnderTest.store("World");

    // Direct System.out outputs to PrintStream
    ByteArrayOutputStream bo = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bo));

    // Call function under test
    classUnderTest.printList();

    // Flush content off ByteArrayOutputStream
    bo.flush();

    // Extract content from ByteArrayOutputStream
    String outputLines = new String(bo.toByteArray());

    // Start asserting
    assertTrue(outputLines.contains("Hello"));
    assertTrue(outputLines.contains("World"));
  }
}