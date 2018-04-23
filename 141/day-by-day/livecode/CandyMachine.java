import java.util.Scanner;

public class CandyMachine {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);

      intro();
      double money = collectMoney(console);
      double cost = pickCandy(console);
      dispenseCandy(money, cost);
   }

   public static void intro() {
      System.out.println("Welcome to my Candy Machine!\n");
   }

   public static double collectMoney(Scanner console) {
      System.out.print("money > ");
      return console.nextDouble();
   }

   public static double pickCandy(Scanner console) {
      System.out.println("**choices**");
      System.out.print("choice > ");
      String choice = console.next();

      if(choice.equals('A') || choice.equals('a'))
         return 0.65;
      else if(choice.equals('B') || choice.equals('b'))
         return 0.45;
      return -1;
   }

   public static void dispenseCandy(double money, double cost) {
      double change = money - cost;

      if(change < 0)
         System.out.println("cannot afford");
      else
         System.out.println("afford + change");
   }
}
