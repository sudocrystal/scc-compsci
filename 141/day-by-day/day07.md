# Day 07/20

+ Midterm next week (review materials)
+ PracticeIt Ex 4.18
  - trim, bounds, off by one
+ Go over Candy machine
  - printf
  - variable scope
+ Lecture
  - fence post problem
  - while loops
  - do-while loops
  - short circuit evaluation preview
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

### CandyMachine.java
```java
import java.util.Scanner;

public class CandyMachine {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);

      System.out.println("Welcome to my Candy Machine!");

      double money = collectMoney(console);
      String choice = pickCandy(console);
      double cost = candyCost(choice);

      dispenseCandy(money, cost);
   }

   public static double collectMoney(Scanner console) {
      System.out.print("money > $");
      double money = console.nextDouble();
      System.out.println("\nOK, $" + money + " received.\n");
      return money;
   }

   public static String pickCandy(Scanner console) {
      System.out.println("choices");
      System.out.print("pick > ");
      String answer = console.next();
      return answer;
   }

   public static double candyCost(String choice) {
      //double cost = 0;
      if(choice.equals("A") || choice.equals("a")) {
         return 0.65;     // cost = 0.65;
      }
      else if(choice.equals("B") || choice.equals("b")) {
         return 0.50;
      }
      return -1;          // return cost;
   }

   public static void dispenseCandy(double money, double cost) {
      System.out.println();
      double change = money - cost;
      if(change < 0)    // money < cost
         System.out.println("You can't afford this candy. Your " + money + " is returned.");
      else              // money >= cost
         System.out.println("Take your yummy candy! Your change is $" + change);
   }
}
```

### Day07FencepostAndWhile.java
```java
import java.util.Scanner;

public class Day07FencepostAndWhile {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);

      fencepost(10);
      whileAndDoWhile(console);   
//       System.out.println("firstDigit(1234) = " + firstDigit(1234) );
//       System.out.println("firstDigit(-910) = " + firstDigit(-910) );
//       showTwos(7);
//       showTwos(18);
//       showTwos(68);
//       showTwos(120);
   }

   // This method demonstrates fencepost problems
   public static void fencepost(int n) {
      for(int i = 1; i <= n; i++) {
         System.out.print(i);
      }
      System.out.println();
   }

   // This method demonstrates while and do while loops
   public static void whileAndDoWhile(Scanner console) {
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
   // e.g showTwos(120) --> prints "120 = 2 * 2 * 2 * 15"
   public static void showTwos(int num) {
   }
}
```

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
      showTwos(7);
      showTwos(18);
      showTwos(68);
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
