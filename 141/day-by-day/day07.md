# Day 07/20

+ Go over Candy machine
  - printf
  - variable scope
+ Lecture
  - fence post problem
  - while loops
  - do-while loops
+ Learning Practice

## Programs for class
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
      if(choice.equals("A") || choice.equals("a"))
         return 0.65;     // cost = 0.65;
      else if(choice.equals("B") || choice.equals("b"))
         return 0.50;
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
      for(int i=1; i<=n; i++)
         System.out.print(i);
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
