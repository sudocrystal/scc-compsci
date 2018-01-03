# Day 07/20

+ Review Cumulative sum

+ Lecture
  - fence post problems
    - Example in notes 1, 2, 3, 4, 5
  - while loops
    - Example in notes
    - Example PracticeIt Exercise 5.19 firstDigit
    - Example PracticeIt Exercise 5.1 showTwos
  - do-while loops
  - Random tid-bits
    - Math.abs
    - !text.equals("")
    - text.charAt(text.length()-1)
+ Lab: while loops

## Programs for class
```java
import java.util.*;

public class Day07FencePost {
   public static void main(String[] args) {
      for(int i=1; i<=10; i++)
         System.out.print(i);
      System.out.println();
   }
 }
```

```java
import java.util.*;

public class Day07SentinelLoops {
   private static Scanner in = new Scanner(System.in);

   public static void main(String[] args) {
//       int choice = options();     
//       System.out.println( firstDigit(1234) );
//       System.out.println( firstDigit(-910) );
//       showTwos(7);
//       showTwos(18);
//       showTwos(68);
//       showTwos(120);
   }

   // returns the choice a user makes (1-5)
   // repeatedly prompts until a valid choice (1-5) is picked
   public static int options() {
      return 0;
   }

   // returns the first digit of a number
   // e.g. firstDigit(1234) --> 1
   // e.g. firstDigit(-910) --> 9
   public static int firstDigit(int num) {
      return 0;
   }

   // returns a summary of the factors of two for a given number
   // the logic is that you divide your number by 2 until you reach an odd number
   // e.g. showTwos(18) --> prints "18 = 2 * 9"
   public static void showTwos(int num) {

   }
}
```

## Solutions
```java
import java.util.*;

public class Day07FencePost {
  public static void main(String[] args) {
//  FIRST WAY
//       for(int i=1; i<=10; i++) {
//          if(i != 10)
//             System.out.print(i + ", ");
//          else
//             System.out.print(i);
//       }
//       System.out.println();
//  SECOND WAY
//       for(int i=1; i<10; i++)
//          System.out.print(i + ", ");
//       System.out.println("10");
//  THRID WAY
     System.out.print("1");
     for(int i=2; i<=10; i++)
        System.out.print(", " + i);
     System.out.println();
  }
}
```

```java
import java.util.*;

public class Day07SentinelLoops {
   private static Scanner in = new Scanner(System.in);

   public static void main(String[] args) {
//       int choice = options();     
//       System.out.println( firstDigit(1234) );
//       System.out.println( firstDigit(-910) );
//       showTwos(7);
//       showTwos(18);
//       showTwos(68);
//       showTwos(120);
   }

   // returns the choice a user makes (1-5)
   // repeatedly prompts until a valid choice (1-5) is picked
   public static int options() {
      System.out.println("Displays choices.");
      System.out.print("Pick an option (1-5) > ");
      int pick = in.nextInt();
      while(pick < 1 || pick > 5) {
          System.out.println("Invalid choice.");
          System.out.print("Pick an option (1-5) > ");
          pick = in.nextInt();
      }
      return pick;
   }

   // returns the first digit of a number
   // e.g. firstDigit(1234) --> 1
   // e.g. firstDigit(-910) --> 9
   public static int firstDigit(int num) {
      while(num > 9) {
         num = num / 10;
      }
      return num;
   }

   // returns a summary of the factors of two for a given number
   // the logic is that you divide your number by 2 until you reach an odd number
   // e.g. showTwos(18) --> prints "18 = 2 * 9"
   public static void showTwos(int num) {
      String twos = num + " = ";
      while(num % 2 != 1) {
         twos += "2 * ";
         num /= 2;
      }
      twos += num;
      System.out.println(twos);
   }
}
```
