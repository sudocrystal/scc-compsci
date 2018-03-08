# Day 13/20

+ Lecture
  - array fundamentals
    - declaring
      - array syntax
    - accessing and modifying a single element
    - initializing using a loop
      - array.length
    - initializing using shorthand syntax {}s
    - printing
      - can't print by just saying SOP(a)
      - show manually with for loop
      - then with Array.toString(a)
+ First Practice
  - Self-Check 7.1 - 7.9, do 7.4 last
+ Lecture (cont)
  - Count negative numbers in the Array
  - Make all negative numbers positive
  - Find the min in the Array
  - Check if two arrays contain the same values
    - can't use == on the entire array
    - do it manually, then show them Arrays.equals(a,b)
+ Learning Practice
  - Self-Check
    - Self-Check 7.1 - 7.11
    - Self-Check 7.13 - 7.15
  - Exercises
    - Exercise 7.1 - 7.3

## Programs for class
```java
import java.util.*;

public class Day13Arrays {
   public static void main(String[] args) {
      arrayFundamentals();

//       Random rand = new Random();
//       int[] values =
//       System.out.println("Count of neg = " + countNeg(values));

//       makePositive(values);


//       System.out.println("Min value = " + findMin(decimals));

//       String[] words1 = {"apple","pear"};
//       String[] words2 = {"apple","pear"};
//       String[] words3 = {"orange","apple","banana"};
//       System.out.println(Arrays.toString(words1) + " == " + Arrays.toString(words2) + "? \t\t\t\t\t" + areEqual(words1,words2));
//       System.out.println(Arrays.toString(words2) + " == " + Arrays.toString(words3) + "? \t" + areEqual(words2,words3));
   }

   public static void arrayFundamentals() {
   }

   // returns a count of the negative numbers in the array
   public static int countNeg(int[] arr) {
      return 0;
   }

   // make all negative values positive
   public static void makePositive(int[] arr) {
   }

   // returns the smallest vlalue in the array
   public static double findMin(double[] arr) {
      return 0.0;
   }

   // returns true if the lists contain exactly the same items
   // returns false otherwise
   // **fun** can you check if they are the same, but not same order?
   public static boolean areEqual(String[] list1, String[] list2) {
      return false;
   }      
}
```

## Solutions
```java
import java.util.*;

public class Day13Arrays {
   public static void main(String[] args) {
      Random rand = new Random();
      // int[] values = new int[5];
      // for(int i = 0; i < values.length; i++)
      //   values[i] = rand.nextInt(21) - 10;
      // System.out.println(Arrays.toString(values));
      // System.out.println("Count of neg = " + countNeg(values));
      //
      // int[] valuesCopy = makePositive(values);
      // System.out.println(Arrays.toString(values));
      // System.out.println(Arrays.toString(valuesCopy));

      // double[] decimals = new double[10];
      // for(int i = 0; i < decimals.length; i++)
      //   decimals[i] = (int)(rand.nextDouble() * 1000) / 100;
      // System.out.println("Min value = " + findMin(decimals));

      String[] words1 = ["apple","pear"];
      String[] words2 = ["apple","pear"];
      String[] words3 = ["orange","apple","banana"];
      System.out.println(Arrays.toString(words1) + " == " + Array.toString(words2) + "? " + areEqual(words1,words2));
      System.out.println(Arrays.toString(words2) + " == " + Array.toString(words3) + "? " + areEqual(words2,words3));
   }

   // returns a count of the negative numbers in the array
   public static int countNeg(int[] arr) {
      return 0;
   }

   //make all negative values positive
   public static void makePositive(int[] arr) {
   }

   // returns the smallest vlalue in the array
   public static double findMin(double[] arr) {
      return 0.0;
   }

   // returns true if the lists contain exactly the same items
   // returns false otherwise
   // **fun** can you check if they are the same, but not same order?
   public static boolean areEqual(String[] list1, String[] list2) {
      return false;
   }      
}
```
