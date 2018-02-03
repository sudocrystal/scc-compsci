public class Day02Cake {
   public static void main(String[] args) {
      cake1();
      cake2();
      cake3();
   }

   public static void cake1(){
      top();
      vanilla();
   }

   public static void cake2(){
      top();
      System.out.println(" |~*~*~*~*~*~|");
      strawberry();
   }

   public static void cake3(){
      top();
      System.out.println(" |,.,.,.,.,.,|");
      chocolate();
   }

   public static void chocolate(){
      System.out.println(" | chocolate |");
      strawberry();
   }

   public static void strawberry(){
      System.out.println(" | strawberry|");
      vanilla();
   }

   public static void vanilla(){
      System.out.println(" |  vanilla  |");
      bottom();
      System.out.println();
   }

   public static void top(){
      System.out.println("     @@@@@");
      System.out.println(" @@@@@@@@@@@@@");
   }

   public static void bottom(){
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