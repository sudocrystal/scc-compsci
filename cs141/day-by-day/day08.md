# Day 08/20

+ Lecture
  - pseudorandom numbers
    - Self-Check 5.5
  - assertions
    - BJP3 Self-Check 5.27: assertions1
  - boolean methods
    - boolean zen
    - allSmallDigits (below)
    - reversed (below)
    - mention testing for the false case in the loop, true only if the loop executes entirely without returning false
+ Lab: boolean logic
+ (if time) modify candy machine so that bad user input is handled

## Programs for class
```java
public class Day08RandomNums {
   public static void main(String[] args) {

   }

   public static double decimalRound(double num, int places) {
      return 0.0;
   }
}
```

```java
public class Day08BooleanLogic {
   public static void main(String[] args) {
//       System.out.println( isEven(10) );
//       System.out.println( allSmallDigits(1234) );
//       System.out.println( isReverse("hello","olleh") );
   }

   // returns true is num is even, false if it's odd
   // e.g. isEven(10) --> true
   // e.g. isEven(-1) --> false
   public static boolean isEven(int num) {
      return false;
   }

   // returns true if all digits are smaller than 5
   // e.g. allSmallDigits(1233) --> true
   // e.g. allSmallDigits(99) --> false
   // e.g. allSmallDigits(1190) --> false
   public static boolean allSmallDigits(int x) {
      return false;
   }

   // returns true if the strings are reverse of each other
   // e.g. isReverse("hello","olleh") --> true
   // e.g. isReverse("time","fine") --> false
   public static boolean isReverse(String s1, String s2) {
      return false;
   }
}
```

## Solutions
```java
import java.util.Random;  //import java.util.*;

public class Day08RandomNums {
   public static void main(String[] args) {
      Random randGen = new Random();

      int x = randGen.nextInt(10);         //0-9
      //randGen.nextInt(9001) + 1000;      //1000-10000
      //randGen.nextInt(high-low+1) + low
      System.out.println(x);

      double y = randGen.nextDouble();
      //System.out.println(y);
      System.out.println(decimalRound(y,2));
   }

   public static double decimalRound(double num, int places) {
      int placeValue = 10 * places;
      return (int)(num*placeValue) / (double)(placeValue);
   }
}
```

```java
public class Day08BooleanLogic {
   public static void main(String[] args) {
//       System.out.println( isEven(10) );
//       System.out.println( allSmallDigits(1234) );
//       System.out.println( isReverse("hello","olleh") );
   }

   // returns true is num is even, false if it's odd
   // e.g. isEven(10) --> true
   // e.g. isEven(-1) --> false
   public static boolean isEven(int num) {
// FIRST WAY
//       num = Math.abs(num);
//       boolean even = false;
//       if(num % 2 == 0)
//           even = true;
//       else
//           even = false;
//       return even;
// SECOND WAY
//       num = Math.abs(num);
//       if(num % 2 == 0)
//           return true;
//       else
//           return false;
// THRID WAY (zen)
      return num % 2 == 0;
   }

   // returns true if all digits are smaller than 5
   // e.g. allSmallDigits(1233) --> true
   // e.g. allSmallDigits(99) --> false
   // e.g. allSmallDigits(1190) --> false
   public static boolean allSmallDigits(int x) {
      while(x > 0) {
         int last = x % 10;
         if(last > 4)
            return false;
         x /= 10;
      }
      return true;
   }

   // returns true if the strings are reverse of each other
   // e.g. isReverse("hello","olleh") --> true
   // e.g. isReverse("time","fine") --> false
   public static boolean isReverse(String s1, String s2) {
      if(s1.length() != s2.length())
         return false;
      for(int i=0; i<s1.length(); i++) {
         if(s1.charAt(i) != s2.charAt(s2.length()-i-1))
            return false;
      }
      return true;
   }
}
```
