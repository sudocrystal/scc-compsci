# Day 18/20

+ Talk about HW#4 (+ extended due date)
+ Ask about Online Lecture
  - clarifications needed?
+ Review Inheritance
  - Instantiating Objects
    - as superclass = new superclass
    - as subclass = new subclass
    - as superclass = new subclass
  - Inheritance problems from the CS1/Exams/Final
+ Lecture: ArrayList
  - Limitations of Arrays
    - fixed size
    - adding, deleting, shifting can be tedious
  - ArrayList Benefits
    - auto sizing expansion
    - .size() gives elements actually in the list, not the capacity
    - methods for inserting, deleting, and searching
  - Limitations of ArrayList
    - must hold Objects
    - Wrapper classes / auto-boxing, auto-unboxing
  - ```import java.util.ArrayList```
  - ```ArrayList<Integer> list = new ArrayList<Integer>();```
  - ArrayList methods
    - `add(x)`, `toString()`, `size()`, `add(i,x)`, `get(i)`, `set(i,x)`, `indexOf(x)` returns -1 if not found, `remove(i)`, `clear()`
  - Problems in class
+ Learning Practice
  - Self-Check
    - All 6 Self-Check problems
  - Exercises
    - Exercise 10.3
    - Exercise 10.4
    - Exercise 10.6
    - Exercise 10.7
    - Exercise 10.12
    - Exercise 10.14
  - Challenge
    - Exercise 10.11
    - Exercise 10.17

## Programs for class
```java
import java.util.ArrayList;
import java.util.Random;

public class Day18ArrayList {
	public static void main(String[] args) {
      learnArrayList();

//       Random r = new Random();
//       ArrayList<Integer> values = createList(r,5,200);
//       System.out.println("initial values = " + values);
//       
//       duplicateList(values);
//       //maxToEnd(values);
//       //removeOdd(values);
//       
//       System.out.println("values = " + values);

    // ArrayList<String> words = createWordList();
    // System.out.println("words contains " + words);
    //
    // int len = maxLength(words);
    // System.out.println("highest # of chars = " + len);

    // removeStartWith(words,'c');
    // System.out.println("words contains " + words);
	}

   public static void learnArrayList() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(1);
      nums.add(29);
      nums.add(54);
      nums.add(2);

      System.out.println("nums contains = " + nums);
		System.out.println("# of elements = " + nums.size());
   }

   // this method should create a list of 'numElements' number of ints
   // where each int is a random number between 1 and 'high'
   // e.g. createList(3,15) might return [13, 1, 9]
   public static ArrayList<Integer> createList(Random r, int numElements, int high) {
      return null;
   }

	// duplicates a list of Integers by appending each element in the list
   // to the end of the list
	// e.g. [1,2,3] ==> [1,2,3,1,2,3]
	public static void duplicateList(ArrayList<Integer> list) {
	}

	// this method moves the max value in a list of Integers to the end
	// e.g. [1,29,54,2] ==> [1,29,2,54]
	public static void maxToEnd(ArrayList<Integer> list) {
	}

   // remove all odd value elements (not odd indexed) in list
   public static void removeOdd(ArrayList<Integer> list) {
   }

   // this method returns a list of Strings
   public static ArrayList<String> createWordList() {
      return null;
   }

	// this method returns the length of the longest String
	// e.g. ["hi", "hello", "hola", "yo"] ==> 5
	public static int maxLength(ArrayList<String> list) {
      return 0;
   }

   // remove all elements in list that begin with specified char
   public static void removeStartWith(ArrayList<String> list, char c) {
   }
}

// Helpful translation from array to ArrayList:
//    String[]          => ArrayList<String>
//    new String[10]    => new ArrayList<String>()
//    a.length          => list.size()
//    a[i]              => list.get(i)
//    a[i] = value;     => list.set(i, value);
//
// new operations:
//     list.remove(i);     --remove the ith value
//     list.add(value);    --appends a value
//     list.add(i, value); --adds at an index
//     list.clear()        --remove all value
//     list.contains(x)    --returns T/F if x is in the list
```

# Solutions
```java
import java.util.ArrayList;
import java.util.Random;

public class Day18ArrayList {
	public static void main(String[] args) {
      // learnArrayList();

//       ArrayList<Integer> values = createList(3,200);
//       System.out.println("initial values = " + values);
//       
//       //duplicateList(values);
//       //maxToEnd(values);
//       removeOdd(values);
//       
//       System.out.println("values = " + values);

    ArrayList<String> words = createWordList();
    System.out.println("words contains " + words);

//     int len = maxLength(words);
//     System.out.println("highest # of chars = " + len);

    removeStartWith(words,'c');
    System.out.println("words contains " + words);
	}

   public static void learnArrayList() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
      System.out.println("# of elements = " + nums.size());
      nums.add(1);
      nums.add(29);
      nums.add(54);
      nums.add(2);
      nums.remove(0);
      nums.remove(nums.size()-1);
      System.out.println("first element is " + nums.get(0));
      nums.set(1,540);
      System.out.println("29 is at index " + nums.indexOf(29));

      System.out.println("nums contains = " + nums);
		System.out.println("# of elements = " + nums.size());

      for(int i = 0; i < nums.size(); i++)
         System.out.println(nums.get(i));

      for(int x : nums)
         System.out.println(x);
   }

   // this method should create a list of 'numElements' number of ints
   // where each int is a random number between 1 and 'high'
   // e.g. createList(3,15) might return [13, 1, 9]
   public static ArrayList<Integer> createList(int numElements, int high) {
      Random r = new Random();
      ArrayList<Integer> nums = new ArrayList<Integer>();
      //for(int i = 0; i < numElements; i++) {
      while(nums.size() < numElements) {
         int x = r.nextInt(high) + 1;
         if(!nums.contains(x)) {
            nums.add(x);
         }
      }
      return nums;
   }

	// duplicates a list of Integers by appending each element in the list
   // to the end of the list
	// e.g. [1,2,3] ==> [1,2,3,1,2,3]
	public static void duplicateList(ArrayList<Integer> list) {
      int size = list.size();
      for(int i = 0; i < size; i++) {
         int x = list.get(i);
         list.add(x);
      }
	}

	// this method moves the max value in a list of Integers to the end
	// e.g. [1,29,54,2] ==> [1,29,2,54]
	public static void maxToEnd(ArrayList<Integer> list) {
      int max = list.get(0); //Integer.MIN_VALUE;
      for(int x : list)
         max = Math.max(max,x);
      list.add(list.remove(list.indexOf(max)));
	}

  // remove all odd value elements (not odd indexed) in list
  public static void removeOdd(ArrayList<Integer> list) {
      // for(int i = 0; i < list.size(); i++) {
      //     if(list.get(i) % 2 == 1) {
      //        list.remove(i);
      //        i--;
      //     }
      // }

      for(int i = list.size() - 1; i >= 0; i--) {
         if(list.get(i) % 2 == 1) {
             list.remove(i);
         }
      }
  }

   // this method returns a list of Strings
   public static ArrayList<String> createWordList() {
      ArrayList<String> words = new ArrayList<String>();
      words.add("carrots");
      words.add("cabbage");
      words.add("red peppers");
      words.add("celery");
      return words;
   }

	// this method returns the length of the longest String
	// e.g. ["hi", "hello", "hola", "yo"] ==> 5
	public static int maxLength(ArrayList<String> list) {
      int len = list.get(0).length();
      for(int i = 0; i < list.size(); i++) {
         len = Math.max(len, list.get(i).length());
      }
      return len;
   }

   // remove all elements in list that begin with specified char
   public static void removeStartWith(ArrayList<String> list, char c) {
      for(int i = list.size() - 1; i >= 0; i--) {
         if(list.get(i).startsWith(""+c)) {
            list.remove(i);
         }
      }
   }
}

// Helpful translation from array to ArrayList:
//    String[]          => ArrayList<String>
//    new String[10]    => new ArrayList<String>()
//    a.length          => list.size()
//    a[i]              => list.get(i)
//    a[i] = value;     => list.set(i, value);
//
// new operations:
//     list.remove(i);     --remove the ith value
//     list.add(value);    --appends a value
//     list.add(i, value); --adds at an index
//     list.clear()        --remove all value
//     list.contains(x)    --returns T/F if x is in the list
```
