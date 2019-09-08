package structure.list;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import static org.junit.Assert.*;

public class YeyDoublyLinkedListTest {
  @Test public void testStore() {
    YeyDoublyLinkedList classUnderTest = new YeyDoublyLinkedList();

    classUnderTest.store("Hello");
    classUnderTest.store("Warudo");

    assertEquals(2, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("Warudo", classUnderTest.get(1));
  }

  @Test public void testStoreWithIndex() {
    YeyDoublyLinkedList classUnderTest = new YeyDoublyLinkedList();

    classUnderTest.store("Hello");
    classUnderTest.store("My");
    classUnderTest.store("Warudo");

    assertEquals(3, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("My", classUnderTest.get(1));
    assertEquals("Warudo", classUnderTest.get(2));

    classUnderTest.store(2, "Beautiful");

    assertEquals(4, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("My", classUnderTest.get(1));
    assertEquals("Beautiful", classUnderTest.get(2));
    assertEquals("Warudo", classUnderTest.get(3));
  }

  @Test public void testUpdate() {
    YeyDoublyLinkedList classUnderTest = new YeyDoublyLinkedList();

    classUnderTest.store("Hello");
    classUnderTest.store("My");
    classUnderTest.store("Dog");

    assertEquals(3, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("My", classUnderTest.get(1));
    assertEquals("Dog", classUnderTest.get(2));

    classUnderTest.update(1, "Our");

    assertEquals(3, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("Our", classUnderTest.get(1));
    assertEquals("Dog", classUnderTest.get(2));
  }

  @Test public void testRemove() {
    YeyDoublyLinkedList classUnderTest = new YeyDoublyLinkedList();

    classUnderTest.store("Hello");
    classUnderTest.store("My");
    classUnderTest.store("Dog");

    assertEquals(3, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("My", classUnderTest.get(1));
    assertEquals("Dog", classUnderTest.get(2));

    classUnderTest.remove(1);

    assertEquals(2, classUnderTest.count());
    assertEquals("Hello", classUnderTest.get(0));
    assertEquals("Dog", classUnderTest.get(1));
  }

  @Test public void testIsEmpty() {
    YeyDoublyLinkedList classUnderTest = new YeyDoublyLinkedList();

    assertTrue(classUnderTest.isEmpty());

    classUnderTest.store("Mie");

    assertFalse(classUnderTest.isEmpty());
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