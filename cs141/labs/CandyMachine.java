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