import java.util.*;

public class Day13Arrays {
   public static void main(String[] args) {

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
