# Start of the Quarter

+ Introduce Self
+ Review Canvas and Syllabus

# Day 01/10

+ Part 1: Explore java.util.ArrayList
  - Review the primary functionality of an ArrayList, including constructing an ArrayList object and utilizing its behaviors (add, toString, remove, size, ...)
    - Review Native Array
      - `.length`, `arr[0] = 99;`
      - contiguous memory
    - ArrayList
      - `.size()`
      - also contiguous memory
      - implemented using an array
    - Show
      - making ArrayList
      - size
      - print list
      - Add values 100, 200, 300, ... 900, 1000
      - Observe what happens "underneath the hood" using JGrasp's canvas visualizer
        - Set breakpoint
        - What happens at adding one more value (25)?? -> creates more underlying space
      - Remove at an index -> elements shift and reindex

+ Part 2: Build SimpleArrayIntList
  - Show in ExploringArrayList the eventual creation of `SimpleArrayIntList numbers = new SimpleArrayIntList();` in place of Java's ArrayList
  - Generate a new class called SimpleArrayIntList that we will use to understand how java.util.ArrayList works "under the hood"
    - Two fields:
      - a native array of int's to store the data that will be contained in the SimpleArrayIntList
      - a size field that tracks the data actually in the SimpleArrayIntList
    - A constructor that initializes the array (arbitrarily a capacity of 20) and size (0 until data is added).
    - A toString method that prints the data in the SimpleArrayIntList in the format "[5, 12, 3]" as an example.
      - reminder about fence-post problems
    - An add method that allows data to be added to the SimpleArrayIntList.

+ Part 3: Build ArrayIntList
  - Lightly introduce the concept of an interface: IntList
    - `IntList numbers = new ArrayIntList();`
    - Show interface IntList
      - rules for implementation
      - method headers without method body
      - LinkedList will do all these things, but differently than ArrayList
  - Begin building ArrayIntList implements IntList
    - Show that ArrayIntList won't compile without all the methods from the interface
    - Copy over fields, constructor, add, and toString from SimpleArrayIntList
      - Constructor: change name and starting [CAPACITY]
    - Superficially fulfill the interface requirements so that ArrayIntList will compile; include dummy returns where needed, pre/post conditions as applicable
    - Implement size, get, and indexOf
    - Throw Exceptions as applicable (add, get)
      - `checkIndex(index);`
      - `checkCapacity(size + 1);`

+ (in pairs) Part 4: Complete ArrayIntList
  - Implement add(index, value):  you will need to shift elements in the array before adding in the new element, as well as increase the tracked size
  - Implement remove(index):  you will need to shift elements in the array to "remove" data, as well as decrease the tracked size
  - Throw Exceptions as applicable for both methods
  - Expand your Main class to prove to yourself that all method implementations work appropriately



## Solutions

```java
import java.util.*;

public class ExploringArrayList {
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      //SimpleArrayIntList numbers = new SimpleArrayIntList();
      //ArrayIntList numbers = new ArrayIntList();

      System.out.println(numbers);
      for(int i = 1; i <= 10; i++) {
         numbers.add(i * 100);
      }
      System.out.println(numbers);
      numbers.add(25);
      numbers.remove(0);
      numbers.remove(3);
      System.out.println(numbers);
   }
}
```

```java
public class SimpleArrayIntList {
   // fields
   private int[] data; // array of integers
   private int size;   // current number of elements in the list

   // constructors
   public SimpleArrayIntList() {
        data = new int[20];
        size = 0;
   }

   // accessors

   // mutators
   public void add(int value) {
      data[size] = value;
      size++;
   }

   // toString
   public String toString() {
      if (size == 0) {
         return "[]";
      } else {
         String result = "[" + data[0];
         for (int i = 1; i < size; i++) {
            result += ", " + data[i];
         }
         result += "]";
         return result;
      }
   }
}
```

```java
public class ArrayIntList implements IntList{
    private int[] data; // array of integers
    private int size;   // current number of elements in the list

    public static final int CAPACITY = 20;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        data = new int[CAPACITY];
        size = 0;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + data[0];
            for (int i = 1; i < size; i++) {
                result += ", " + data[i];
            }
            result += "]";
            return result;
        }
    }

    // pre : size() < capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(int value) {
        checkCapacity(size + 1);
        data[size] = value;
        size++;
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the integer at the given index in the list
    public int get(int index) {
        checkIndex(index);
        return data[index];
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // pre : size() < capacity (throws IllegalStateException if not) &&
    //       0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        checkCapacity(size + 1);
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    // post: checks that the underlying array has the given capacity,
    //       throwing an IllegalStateException if it does not
    private void checkCapacity(int capacity) {
        if (capacity > data.length) {
            throw new IllegalStateException("would exceed list capacity");
        }
    }
}
```
