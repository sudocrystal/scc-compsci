# Day 03/20

+ HW Reflection
+ Lecture
  + Class Constants
    - `public static final`
    - should be in all caps
    - must be given a starting value
    - can't be reassigned
  + Nested Loops
    - systematic approach
      - multiplier * line + shift
      - multiplier is calculated as change between rows
      - shift is the amount needed after (m * line) to get example cases
    - multiple items on the same line (row)
    - scaling with a constant
+ Learning Practice
    - Self-Check
      - Self-Check 2.22 and 2.23
      - Self-Check 2.32 and 2.33
      - Self-Check 2.37 and 2.38
    - Exercises
      - Exercises 2.12 and 2.13
      - Exercises 2.16 and 2.17

## Programs for class
Wave Reflection, 
[Day03ForLoops](https://github.com/sudocrystal/CS141-InteractiveLectures/blob/main/Ch2bForLoops.java)

## Solutions
```java
public class Wave {
   private static final int SIZE = 20;

   public static void main(String[] args) {
      // prints line
      for(int i = 1; i <= SIZE; i++) {
          System.out.print("-");
      }
      System.out.println();

      // prints the repeated _-^- sequence
      for(int i = 1; i <= SIZE / 4; i++) {
          System.out.print("_-^-");
      }
      System.out.println();

      // prints the numbers
      for(int i = 1; i <= SIZE / 2; i++) {
          int num = i % 10;
          System.out.print(num + "" + num);
      }
      System.out.println();

      // prints line
      for(int i = 1; i <= SIZE; i++) {
          System.out.print("-");
      }
      System.out.println();
   }
}
```

```java
public class Ch2bForLoops {
   public static void main(String[] args) {
      dotBox();
      dotNumBox();
      dollarFigure();
      dollarFigure2();
   }

   /*
      This method creates a box made out of periods (5 x 4)
      ++++1....
      ++++2....
      ++++3....
      ++++4....
      ++++5....
      How do we make this dot-box longer? wider?
      How could we print the line number at the front of each row?
   */
   public static void dotBox() {
      for(int line = 1; line <= 5; line++) {
         for(int plus = 1; plus <= 4; plus++) {
            System.out.print("+");
         }
         System.out.print(line);
         for(int dot = 1; dot <= 4; dot++) {
            System.out.print(".");
         }
         System.out.println();
      }
   }

   // This method shows how to systematically produce repetitive ASCII art
  /*
    .......1
    ......2.
    .....3..
    ....4...
    ...5....
    ..6.....
    .7......
    8.......
  */
   public static void dotNumBox() {
      // First without a systematic approach
//       for(int line = 1; line <= 8; line++) {
//          for(int dot = 1; dot <= 8 - line; dot++) {
//             System.out.print(".");
//          }
//          System.out.print(line);
//          System.out.println();
//       }


      // With a systematic approach
//       for(int line = 1; line <= 8; line++) {
//          for(int dot = 1; dot <= -1 * line + 8; dot++) {
//             System.out.print(".");
//          }
//          System.out.print(line);
//          System.out.println();
//       }

      // With a second set of dots
      for(int line = 1; line <= 8; line++) {
         for(int dot = 1; dot <= -1 * line + 8; dot++) {
            System.out.print(".");
         }
         System.out.print(line);
         for(int dot = 1; dot <= 1 * line -1; dot++) {
            System.out.print(".");
         }
         System.out.println();
      }
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
      for(int line = 1; line <= 7; line++) {
         for(int star = 1; star <= 2 * line - 2; star++) {
            System.out.print("*");
         }
         for(int dollar = 1; dollar <= -1 * line + 8; dollar++) {
            System.out.print("$");
         }
         for(int mid = 1; mid <= -2 * line + 16; mid++) {
            System.out.print("*");
         }
         for(int dollar = 1; dollar <= -1 * line + 8; dollar++) {
            System.out.print("$");
         }
         for(int star = 1; star <= 2 * line - 2; star++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   // This method allows the dot/num box above to be scaled using the class constant
   public static void scaledDotNumBox() {
      for(int line = 1; line <= SIZE; line++) {
         for(int dot = 1; dot <= -1 * line + SIZE; dot++) {
            System.out.print(".");
         }
         System.out.print(line);
         for(int dot = 1; dot <= 1 * line -1; dot++) {
            System.out.print(".");
         }
         System.out.println();
      }
   }

   // This is PracticeIt Exercise 2.23 which is a scalable version of Ex 2.22:
   /* (size is 3)
      $$$******$$$
      **$$****$$**
      ****$**$****
   */
   public static void dollarFigure2() {
      for(int line = 1; line <= SIZE; line++) {
         for(int star = 1; star <= 2 * line - 2; star++) {
            System.out.print("*");
         }
         for(int dollar = 1; dollar <= -1 * line + (SIZE + 1); dollar++) {
            System.out.print("$");
         }
         for(int mid = 1; mid <= -2 * line + (2 * SIZE + 2); mid++) {
            System.out.print("*");
         }
         for(int dollar = 1; dollar <= -1 * line + (SIZE + 1); dollar++) {
            System.out.print("$");
         }
         for(int star = 1; star <= 2 * line - 2; star++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
```
