package structure.list;

public class YeyDoublyLinkedList {

  public YeyDoublyLinkedListNode head;

  public YeyDoublyLinkedList() {}

  public void store(String element) {
    YeyDoublyLinkedListNode temp = this.head;
    YeyDoublyLinkedListNode newElement = new YeyDoublyLinkedListNode(element);

    if (isEmpty()) {
      this.head = newElement;
      return;
    }

    while (temp.next != null) {
      temp = temp.next;
    }

    newElement.prev = temp;
    temp.next = newElement;
  }

  public void store(int index, String element) {
    int counter = 0;
    YeyDoublyLinkedListNode tail;
    YeyDoublyLinkedListNode temp = this.head;
    YeyDoublyLinkedListNode newElement = new YeyDoublyLinkedListNode(element);

    while (counter < index-1) {
      temp = temp.next;
      counter++;
    }

    tail = temp.next;
    newElement.prev = temp;
    temp.next = newElement;
    temp.next.next = tail;
  }

  public String get(int index) {
    int counter = 0;
    YeyDoublyLinkedListNode temp = this.head;

    while (counter < index ) {
      temp = temp.next;
      counter++;
    }

    return temp.data;
  }

  public void remove(int index) {
    int counter = 0;
    YeyDoublyLinkedListNode tail;
    YeyDoublyLinkedListNode temp = this.head;

    while (counter < index-1) {
      temp = temp.next;
      counter++;
    }

    tail = temp.next.next;
    tail.prev = temp;
    temp.next = tail;
  }

  public void update(int index, String newData) {
    int counter = 0;
    YeyDoublyLinkedListNode temp = this.head;

    while (counter < index) {
      temp = temp.next;
      counter++;
    }

    temp.data = newData;
  }

  public int count() {
    int counter = 1;
    YeyDoublyLinkedListNode temp = this.head;

    if (isEmpty()) return 0;

    while (temp.next != null) {
      temp = temp.next;
      counter++;
    }

    return counter;
  }

  public boolean isEmpty() {
    return (this.head == null);
  }

  public void printList() {
    YeyDoublyLinkedListNode temp = this.head;

    if (isEmpty()) return;

    while (temp.next != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }

    System.out.println(temp.data);
  }
}