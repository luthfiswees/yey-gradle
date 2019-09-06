package structure.list;

public class YeyList {

  private String[] yeyArray;

  public YeyList() {}

  // Public functions
  public void store(String element) {
    // Call length of the array first here
    int currentLength = count();

    // Check if current list is empty?
    if (isEmpty()) {
      this.yeyArray = new String[1];
    }

    // Check if array is already full
    if (isArrayFull()) {
      // Create new array
      String[] newArray = new String[currentLength+1];
      
      // Copy every element in the old array to the new array
      for(int i=0; i<currentLength; i++) {
        newArray[i] = this.yeyArray[i];
      }
      this.yeyArray = newArray;
    }

    // Initiate store operations
    this.yeyArray[currentLength] = element;
  }

  public void remove(int index) {
    // Create new array
    int currentLength = count();
    String[] newArray = new String[currentLength-1];

    // Copy every element before the removed index
    for(int i=0; i < index; i++) {
      newArray[i] = this.yeyArray[i];
    }

    // Shift element in the rest of index so the removed element is not included
    for(int j=index+1; j < currentLength; j++) {
      newArray[j-1] = this.yeyArray[j];
    }

    // Replace yey array to the new array
    this.yeyArray = newArray;
  }

  public String get(int index) {
    return this.yeyArray[index];
  }

  public void update(int index, String newValue) {
    this.yeyArray[index] = newValue;
  }

  public int count() {
    if (this.yeyArray == null) return 0;
    return (this.yeyArray.length);
  }

  public boolean isEmpty() {
    return (this.yeyArray == null);
  }

  public void printList() {
    for(int i=0; i<count(); i++) {
      System.out.println(this.yeyArray[i]);
    }
  }

  // Private functions
  private boolean isArrayFull() {
    return (this.yeyArray[count()-1] != null);
  }
}