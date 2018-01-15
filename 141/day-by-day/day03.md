# Day 03/20

+ Things we should already know
  + Review a nested for-loop  
    - nested
+ Lecture
  + Class Constants
    - `public static final`
    - should be in all caps
    - must be given a starting value
    - can't be reassigned
  + Loop Tables
    - tracing a nested for-loop
  + Nested Loops
    - systematic approach
    - multiple items on the same line (row)
    - scaling with a constant
+ Learning Practice
    - Self-Check 2.22 and 2.23
    - Self-Check 2.32 and 2.33
    - Self-Check 2.37 and 2.38
    - Exercises 2.12 and 2.13
    - Exercises 2.16 and 2.17

## Programs for class
```java
public class Day03ForLoops {
   // class constant - cannot be reassigned; ALL_CAPS; must be given a value at start
//    public static final int SIZE = 5;

   public static void main(String[] args) {
      dotBox();
      dotNumBox();
      dollarFigure();
      scaledDotNumBox();
      dollarFigure2();
   }

   /*
      This method creates a box made out of periods (5 x 4)
      ....
      ....
      ....
      ....
      ....
      How do we make this dot-box longer? wider?
      How could we print the line number at the front of each row?
   */
   public static void dotBox() {
      for(int line = 1; line <= 5; line++) {
         for(int dot = 1; dot <= 4; dot++) {
            System.out.print(".");
         }
         System.out.println();
      }
   }

   // This method shows how to systematically produce repetitive ASCII art
   public static void dotNumBox() {
      // First without a systematic approach

      // With a systematic approach

      // With a second set of dots

   }

   // This is PracticeIt Exercise 2.22 which produces:
   /*
      $$$$$$$**************$$$$$$$
      **$$$$$$************$$$$$$**
      ****$$$$$**********$$$$$****
      ******$$$$********$$$$******
      ********$$$******$$$********
      **********$$****$$**********
      ************$**$************
   */
   public static void dollarFigure() {
   }

   // This method allows the dot/num box above to be scaled using the class constant
   public static void scaledDotNumBox() {
   }

   // This is PracticeIt Exercise 2.23 which is a scalable version of Ex 2.22:
   public static void dollarFigure2() {
   }
}
```

## Solutions
```java
public class Day03ForLoops {
   // class constant - cannot be reassigned; ALL_CAPS; must be given a value at start
//    public static final int SIZE = 5;

   public static void main(String[] args) {
      dotBox();
      dotNumBox();
      dollarFigure();
      scaledDotNumBox();
      dollarFigure2();
   }

   /*
      This method creates a box made out of periods (5 x 4)
      ....
      ....
      ....
      ....
      ....
      How do we make this dot-box longer? wider?
      How could we print the line number at the front of each row?
   */
   public static void dotBox() {
      for(int line = 1; line <= 5; line++) {
         for(int dot = 1; dot <= 4; dot++) {
            System.out.print(".");
         }
         System.out.println();
      }
   }

   // This method shows how to systematically produce repetitive ASCII art
   public static void dotNumBox() {
      // First without a systematic approach
//       for(int line = 1; line <= 8; line++) {
//          for(int dots = 1; dots <= 8 - line; dots++) {
//             System.out.print(".");
//          }
//          System.out.print(line);
//          System.out.println();
//       }

      // With a systematic approach
//       for(int line = 1; line <= 8; line++) {
//         for(int dots = 1; dots <= -1 * line + 8; dots++) {
//            System.out.print(".");
//         }
//         System.out.print(line);
//         System.out.println();
//      }  

      // With a second set of dots
//       for(int line = 1; line <= 8; line++) {
//         for(int dots = 1; dots <= -1 * line + 8; dots++) {
//            System.out.print(".");
//         }
//         System.out.print(line);
//         for(int dots = 1; dots <= 1 * line - 1; dots++) {
//            System.out.print(".");
//         }
//         System.out.println();
//      }
   }

   // This is PracticeIt Exercise 2.22 which produces:
   /*
      $$$$$$$**************$$$$$$$
      **$$$$$$************$$$$$$**
      ****$$$$$**********$$$$$****
      ******$$$$********$$$$******
      ********$$$******$$$********
      **********$$****$$**********
      ************$**$************
   */
   public static void dollarFigure() {
   }

   // This method allows the dot/num box above to be scaled using the class constant
   public static void scaledDotNumBox() {
//       for (int line = 1; line <= SIZE; line++) {
//          for (int dots = 1; dots <= -1 * line + SIZE; dots++) {
//             System.out.print(".");
//          }
//          System.out.print(line);
//          for (int dots = 1; dots <= 1 * line - 1; dots++) {
//             System.out.print(".");
//          }
//          System.out.println();
//       }
   }

   // This is PracticeIt Exercise 2.23 which is a scalable version of Ex 2.22:
   public static void dollarFigure2() {
   }
}
```
