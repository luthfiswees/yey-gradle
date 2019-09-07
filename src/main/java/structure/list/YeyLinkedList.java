package structure.list;

// This is my take for implementing linked list from scratch
// Wkwkwkwkwkwk
public class YeyLinkedList {

  YeyLinkedListNode head;

  public YeyLinkedList() {}

  // Public Functions

  public void store(String element) {
    YeyLinkedListNode temp = this.head;
    YeyLinkedListNode newElement = new YeyLinkedListNode(element);

    if (isEmpty()){
      this.head = newElement;
    } else {
      while (temp.next != null) {
        temp = temp.next;
      }

      temp.next = newElement;
    }
  }

  public void store(int index, String element) {
    int counter = 0;
    YeyLinkedListNode tail;
    YeyLinkedListNode temp = this.head;
    YeyLinkedListNode newElement = new YeyLinkedListNode(element);

    while (counter < index-1) {
      temp = temp.next;
      counter++;
    }
      
    tail = temp.next;
    temp.next = newElement;
    temp.next.next = tail;
  }

  public String get(int index) {
    YeyLinkedListNode temp = this.head;
    
    for(int i=0; i < index; i++){
      temp = temp.next;
    }

    return temp.data;
  }

  public void remove(int index) {
    YeyLinkedListNode temp = this.head;
    YeyLinkedListNode tails;
    
    for(int i=0; i < index-1; i++){
      temp = temp.next;
    }

    tails = temp.next.next;
    temp.next = tails;
  }

  public void update(int index, String newData) {
    YeyLinkedListNode temp = this.head;
    
    for(int i=0; i < index; i++){
      temp = temp.next;
    }

    temp.data = newData;
  }

  public int count() {
    if (isEmpty()) return 0;
    
    int counter = 1;
    YeyLinkedListNode temp = this.head;

    while (temp.next != null){
      temp = temp.next;
      counter++;
    }

    return counter;
  }

  public boolean isEmpty() {
    return (this.head == null);
  }

  public void printList() {
    YeyLinkedListNode temp = this.head;

    if (!isEmpty()) System.out.println(temp.data);

    while (temp.next != null){
      temp = temp.next;
      System.out.println(temp.data);
    }
  }
}