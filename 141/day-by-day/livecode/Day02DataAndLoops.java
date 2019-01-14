/*
|   literal type       |  examples           | java data type
|----------------------|---------------------|-----------------
| whole numbers        |    |
| decimal numbers      |    |
| series of characters |    |
*/

public class Day02DataAndLoops {

   public static void main(String[] args) {
      expressionMystery();
      //variablesInJava();
      //forLoop();
      //beer();
      //nestedLoop();
   }

   public static void variablesInJava() {
   }

   // should print the "beer song" from 10 to 1
   public static void beer() {
      System.out.println("10 bottles of beer on the wall, 10 bottles of beer");
      System.out.println("Take one down, pass it around, 9 bottles of beer on the wall");
   }

   public static void forLoop() {
   }

   public static void nestedLoop() {
   }

   // evaluating expressions
   public static void expressionMystery() {
      System.out.println("A look at expression evaulation: ");

      System.out.print("4 + 7 * 3 = ");
      System.out.println();// 4 + 7 * 3 );

      System.out.print("(4 + 7) * 3 = ");
      System.out.println();// (4 + 7) * 3 );

      System.out.print("2 * 3 * 2 + 1 * 9 * 3 = ");
      System.out.println();// 2 * 3 * 2 + 1 * 9 * 3 );

      System.out.print("105 % 10 - 2 = ");
      System.out.println();// 105 % 10 - 2 );

      System.out.print("1 / 2 = ");
      System.out.println();// 1 / 2 );

      System.out.print("1.0 / 2 = ");
      System.out.println();// 1.0 / 2 );

      System.out.print("(double)(1 / 2) = ");
      System.out.println();// (double)(1 / 2) );

      System.out.print("(double) 1 / 2 = ");
      System.out.println();// (double) 1 / 2 );

      System.out.print("4 + 4 + \"hello\" = ");
      System.out.println();// 4 + 4 + "hello" );

      System.out.print("\"hello\" + 4 + 4 = ");
      System.out.println();// "hello" + 4 + 4 );
   }
}
