package structure.list;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import static org.junit.Assert.*;

public class YeyLinkedListTest {
  @Test public void testStore(){
    YeyLinkedList classUnderTest = new YeyLinkedList();

    classUnderTest.store("Yoyoy");
    classUnderTest.store("Weber");

    assertEquals(2, classUnderTest.count());
    assertEquals("Yoyoy", classUnderTest.get(0));
    assertEquals("Weber", classUnderTest.get(1));
  }

  @Test public void testUpdate() {
    YeyLinkedList classUnderTest = new YeyLinkedList();

    classUnderTest.store("Saitama");
    classUnderTest.store("Bofoi");
    classUnderTest.store("Tamaki");

    assertEquals(3, classUnderTest.count());
    assertEquals("Bofoi", classUnderTest.get(1));

    classUnderTest.update(1, "Genos");

    assertEquals(3, classUnderTest.count());
    assertEquals("Genos", classUnderTest.get(1));
  }

  @Test public void testRemove() {
    YeyLinkedList classUnderTest = new YeyLinkedList();

    classUnderTest.store("Hello");
    classUnderTest.store("My");
    classUnderTest.store("World");

    assertEquals(3, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("My", classUnderTest.get(1));
    assertEquals("World", classUnderTest.get(2));

    classUnderTest.remove(1);

    assertEquals(2, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("World", classUnderTest.get(1));
  }

  @Test public void testIsEmpty() {
    YeyLinkedList classUnderTest = new YeyLinkedList();

    assertEquals(true, classUnderTest.isEmpty());

    classUnderTest.store("Filling");

    assertEquals(false, classUnderTest.isEmpty());
  }

  @Test public void testPrintList() throws Exception {
    // Declare class under test
    YeyLinkedList classUnderTest = new YeyLinkedList();

    // Populate list
    classUnderTest.store("Flamingo");
    classUnderTest.store("Swallow");

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
    assertTrue(outputLines.contains("Flamingo"));
    assertTrue(outputLines.contains("Swallow"));
  }  
}