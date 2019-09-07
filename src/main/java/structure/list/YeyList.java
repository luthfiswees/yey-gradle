package structure.list;

// Class YeyList is my take to implement List data structure from scratch
// Wkwkwkwkwkwk
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

  public void store(int index, String element) {
    // Call the length of the array
    int currentLength = count();

    // Check if current list is empty?
    if (isEmpty()){
      this.yeyArray = new String[currentLength+1];
    }

    // Check if array is already full
    if (isArrayFull()) {
      // Create new array
      String[] newArray = new String[currentLength+1];

      // Copy every element of the array up to the index specified
      for(int i=0; i < index; i++) {
        newArray[i] = this.yeyArray[i];
      }

      // Add new element here
      newArray[index] = element;

      // Copy the rest of the array
      for(int i=index; i < currentLength; i++) {
        newArray[i+1] = this.yeyArray[i];
      }

      // Replace current array with the new ones
      this.yeyArray = newArray;
    }
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
    // Return array element in index specified
    return this.yeyArray[index];
  }

  public void update(int index, String newValue) {
    // Replace value of array in index specified
    this.yeyArray[index] = newValue;
  }

  public int count() {
    // Check if the array is null, if it's null. Return zero length
    if (this.yeyArray == null) return 0;

    // Return the length of the array for normal case
    return (this.yeyArray.length);
  }

  public boolean isEmpty() {
    // Check if array doesn't declared yet
    return ((this.yeyArray == null) || (this.yeyArray.length == 0));
  }

  public void printList() {
    for(int i=0; i<count(); i++) {
      // Print element
      System.out.println(this.yeyArray[i]);
    }
  }

  // Private functions
  private boolean isArrayFull() {
    // Check if the last element of the array is occupied
    return (this.yeyArray[count()-1] != null);
  }
}