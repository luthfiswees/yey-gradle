package structure.stack;

public class YeyStack {

  private YeyStackNode top;

  public YeyStack() {}

  public void push(String element) {
    YeyStackNode next = this.top;
    this.top = new YeyStackNode(element);
    this.top.next = next;
  }

  public String pop() {
    YeyStackNode poppedElement = this.top;

    if (isEmpty()) return null;

    this.top = this.top.next;

    return poppedElement.data;
  }

  public String top() {
    return this.top.data;
  }

  public int size() {
    int counter = 1;

    if (isEmpty()) return 0;

    while (top.next != null) {
      top = top.next;
      counter++;
    }

    return counter;
  }

  public boolean isEmpty() {
    return (this.top == null);
  }
}