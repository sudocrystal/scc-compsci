public class Day03ForLoops {
   // class constant - cannot be reassigned; ALL_CAPS; must be given a value at start
   public static final int SIZE = 5;

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
      for(int line = 1; line <= 8; line++) {
         for(int dots = 1; dots <= 8 - line; dots++) {
            System.out.print(".");
         }
         System.out.print(line);
         System.out.println();
      }

      // With a systematic approach
      for(int line = 1; line <= 8; line++) {
        for(int dots = 1; dots <= -1 * line + 8; dots++) {
           System.out.print(".");
        }
        System.out.print(line);
        System.out.println();
     }  

      // With a second set of dots
      for(int line = 1; line <= 8; line++) {
        for(int dots = 1; dots <= -1 * line + 8; dots++) {
           System.out.print(".");
        }
        System.out.print(line);
        for(int dots = 1; dots <= 1 * line - 1; dots++) {
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
         for(int star = 1; star <=  2 * line - 2; star++) {
            System.out.print("*");
         }
         // 4 more loops
         System.out.println();
      }
   }

   // This method allows the dot/num box above to be scaled using the class constant
   public static void scaledDotNumBox() {
      for (int line = 1; line <= SIZE; line++) {
         for (int dots = 1; dots <= -1 * line + SIZE; dots++) {
            System.out.print(".");
         }
         System.out.print(line);
         for (int dots = 1; dots <= 1 * line - 1; dots++) {
            System.out.print(".");
         }
         System.out.println();
      }
   }

   // This is PracticeIt Exercise 2.23 which is a scalable version of Ex 2.22:
   public static void dollarFigure2() {
      for(int line = 1; line <= SIZE; line++) {
         for(int star = 1; star <=  2 * line - 2; star++) {
            System.out.print("*");
         }
         for(int dollar = 1; dollar <= -1 * line + (SIZE + 1); dollar++) {
            System.out.print("$");
         }
         for(int star = 1; star <= -2 * line + (SIZE + 1) * 2; star++) {
            System.out.print("*");
         }
         // two more loops
         System.out.println();
      }
   }
}