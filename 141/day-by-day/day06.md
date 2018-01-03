# Day 06/20

+ Review CandyMachine
  - Using the Scanner
  - Use of methods
  - Passing information
  - Returning information
+ Common Algorithms
  - Cumulative Sum
  - Max
  - Even or odd
  - Replicate String
  - Reverse String
+ Practice problems
  - Together
    - 4.1 FractionSum
    - 4.2 Repl
  - With a partner
    - 4.5 pow
    - 4.17 stutter
    - 4.18 word count
+ Announcement
  - Grade RocketShip
  - Release Admissions HW (due a week from today)

## Programs for class
```java
import java.util.Scanner;

public class CandyMachine {
   private static Scanner in = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.println("Welcome to my Candy Machine!");
      double money = collectMoney();
      char choice = pickCandy();
      double cost = candyCost(choice);
      dispenseCandy(money, cost);
   }

   public static double collectMoney() {
      return 0.0;
   }

   public static char pickCandy() {
      return 'X';
   }

   public static double candyCost(char choice) {
      return 0.0;
   }

   public static void dispenseCandy(double money, double cost) {  
   }
}
```

## Solutions
