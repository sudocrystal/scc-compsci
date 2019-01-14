public class Day02Cake {
   public static void main(String[] args) {
      cake1();
      cake2();
      //cake3();
   }

   // this method print the first cake
   public static void cake1() {
   }

   // this method prints the second cake
   public static void cake2() {
   }

   // this method prints all layers from strawberry to the bottom
   public static void strawberry() {
      System.out.println(" | strawberry|");
      vanilla();
   }

   // this method prints the vanilla layer and the stand
   public static void vanilla() {
      System.out.println(" |  vanilla  |");
      bottom();
      System.out.println();
   }

   // this method prints the cake topper
   public static void top() {
      System.out.println("     @@@@@");
      System.out.println(" @@@@@@@@@@@@@");
   }

   // this method prints the cake stand
   public static void bottom() {
      System.out.println(" *************");
      System.out.println("      ) (");
      System.out.println("/-------------\\");
      System.out.println();
   }
}

/*
   The above program will produce the output below:

      @@@@@
  @@@@@@@@@@@@@
  |  vanilla  |
  *************
       ) (
 /-------------\

      @@@@@
  @@@@@@@@@@@@@
  |~*~*~*~*~*~|
  | strawberry|
  |  vanilla  |
  *************
       ) (
 /-------------\

      @@@@@
  @@@@@@@@@@@@@
  |,.,.,.,.,.,|
  | chocolate |
  | strawberry|
  |  vanilla  |
  *************
       ) (
 /-------------\

*/
