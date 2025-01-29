# Day 07/20

+ Candy Machine
  - Partner Activity
+ Go over Candy machine
  - printf
  - variable scope
  - use of ||
  - multiple return statements / missing return

## Programs for class

### CandyMachine.java
  ```java
import java.util.Scanner;

public class CandyMachine {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);

      System.out.println("Welcome to my Candy Machine!\n");

      double money = collectMoney(console);
      String choice = pickCandy(console);
      double cost = candyCost(choice);

      dispenseCandy(money, cost);
   }

   public static double collectMoney(Scanner console) {
      System.out.print("How much money do you have? > $");
      double money = console.nextDouble();
      System.out.println("\tOK, $" + money + " received.");
      System.out.printf("\tOK, $%.2f received.\n", money);
      return money;
   }

   public static String pickCandy(Scanner console) {
      System.out.println("\n--------------------");
      System.out.println("<< print choices >> ");
      System.out.println("--------------------");
      System.out.print("Your pick? > ");
      String answer = console.next();
      return answer;
   }

   public static double candyCost(String choice) {
      //double cost = 0;
      if(choice.equals("A") || choice.equals("a")) {
         return 0.65;     // cost = 0.65;
      } else if(choice.equals("B") || choice.equals("b")) {
         return 0.50;
      }
      return -1;          // return cost;
   }

   public static void dispenseCandy(double money, double cost) {
      System.out.println();
      double change = money - cost;
      if(change < 0) {    // money < cost
         System.out.println("You can't afford this candy.");
         System.out.println("Your " + money + " is returned.");
      } else {            // money >= cost
         System.out.println("Take your yummy candy! Your change is $" + change);
      }
   }
}
```
