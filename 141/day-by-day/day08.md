# Day 08/20

+ Lecture
  - fence post problem
    - print numbers `1 2 3 4 5 ... 10`
    - print with comas `1, 2, 3, 4... 10`
    - explain origin of fencepost problem name
    - show more elegant solutions
      - 10 as fencepost
      - 1 as fencepost
  - while loops
    - ask user to enter a number 1-10, if invalid, tell them
    - convert to while loop to repeat until valid info
      - show without `value =` is an infinite loop
  - do-while loops
    - convert to do/while
      - show scope of variable matters
  - firstDigit
    - What if last digit? `return num % 10;`
    - when we don't have a single digit, chop a digit off
  - showTwos
    - when the number isn't odd, divide the number by two
+ Learning Practice
  - Self-Check
    - Self-Check 5.1
    - Self-Check 5.3 and 5.4
    - Self-Check 5.8
    - Self-Check 5.9 and 5.10
    - Self-Check 5.12 and 5.13
  - Exercises
    - Exercise 5.18

## Programs for class

[Ch5aFencepostAndWhile.java](https://github.com/sudocrystal/CS141-InteractiveLectures/blob/main/Ch5aFencepostAndWhile.java)

## Solutions
```java
import java.util.Scanner;

public class Day07FencepostAndWhile {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);

      //fencepost(10);
      //whileAndDoWhile(console);   
//      System.out.println("firstDigit(1234) = " + firstDigit(1234) );
//      System.out.println("firstDigit(-910) = " + firstDigit(-910) );
      showTwos(18);
      showTwos(120);
   }

   // This method demonstrates fencepost problems
   public static void fencepost(int n) {
      // THIRD: equally more elegant
      System.out.print(1);
      for(int i = 2; i <= n; i++) {
         System.out.print(", " + i);
      }
// SECOND: more elegant
//       for(int i = 1; i < n; i++) {
//          System.out.print(i + ", ");
//       }
//       System.out.println(n);
// FIRST: less elegant
//       for(int i = 1; i <= n; i++) {
//          if(i == n) {
//             System.out.print(i);
//          }
//          else {
//             System.out.print(i + ", ");
//          }
//       }
//       System.out.println();
   }

   // This method demonstrates while and do while loops
   public static void whileAndDoWhile(Scanner console) {
      // SOLUTION WITH A DO-WHILE LOOP
      int value = 0;
      do {
         System.out.print("Enter a value 1-10 > ");
         value = console.nextInt();
      } while(value > 10 || value < 1);
      System.out.println("Thank you. You entered: " + value);

// SOLUTION WITH A WHILE LOOP    
//       System.out.print("Enter a value 1-10 > ");
//       int value = console.nextInt();
//       while(value > 10 || value < 1) {
//          System.out.print("That is not a valid number, enter 1-10 > ");
//          value = console.nextInt();
//       }
//       System.out.println("Thank you. You entered: " + value);
   }

   // returns the first digit of a number
   // e.g. firstDigit(1234) --> 1
   // e.g. firstDigit(-910) --> 9
   public static int firstDigit(int num) {
      num = Math.abs(num);
      while(num > 9) {
         num = num / 10;
      }
      return num;
   }

   // prints a summary of the factors of two for a given number
   // logic is: divide number by 2 until you reach an odd number
   // e.g. showTwos(18) --> prints "18 = 2 * 9"
   // e.g showTwos(120) --> prints "120 = 2 * 2 * 2 * 15"
   // What if returns?
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
