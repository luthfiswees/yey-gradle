package structure.list;

import org.junit.Test;
import static org.junit.Assert.*;

public class YeyListTest {
  @Test public void testStore() {
    YeyList classUnderTest = new YeyList();

    classUnderTest.store("Ayam");

    assertEquals(1, classUnderTest.count());
    assertEquals("Ayam", classUnderTest.get(0));
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
}