public class Day03ForLoops {
   // class constant - cannot be reassigned; ALL_CAPS; must be given a value at start
//    public static final int SIZE = 5;

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
   /*
   .......1
   ......2
   .....3
   ....4
   ...5
   ..6
   .7
   8
   */
   public static void dotNumBox() {
      // First without a systematic approach

      // With a systematic approach

      // With a second set of dots
   }

   // This is PracticeIt Exercise 2.22 which produces:
   /* (size is 7)
      $$$$$$$**************$$$$$$$
      **$$$$$$************$$$$$$**
      ****$$$$$**********$$$$$****
      ******$$$$********$$$$******
      ********$$$******$$$********
      **********$$****$$**********
      ************$**$************
   */
   public static void dollarFigure() {
   }

   // This method allows the dot/num box above to be scaled using the class constant
   public static void scaledDotNumBox() {
   }

   // This is PracticeIt Exercise 2.23 which is a scalable version of Ex 2.22:
   /* (size is 3)
      $$$******$$$
      **$$****$$**
      ****$**$****
   */
   public static void dollarFigure2() {
   }
}
