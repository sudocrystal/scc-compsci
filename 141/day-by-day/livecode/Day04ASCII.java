public class Day04ASCII {

   public static void main(String[] args) {
      //numberTri();
      hourglass();
   }
   
   
   /* This method should produce the following
      -----1-----
      ----333----
      ---55555---
      --7777777--
      -999999999-
   */
   public static void numberTri() {
      for(int line = 1; line <=5; line++) {
         for(int dashes = 1; dashes <= -1 * (line-1) + 5; dashes++) {
            System.out.print("-");
         }
         for(int num = 1; num <= 2 * line - 1; num++) {
            System.out.print(2 * line - 1);
         }
         for(int dashes = 1; dashes <= -1 * line + 6; dashes++) {
            System.out.print("-");
         }
         System.out.println();
      }
   }
   
   /* This method should produce the following
      |""""""""""|
       \::::::::/
        \::::::/
         \::::/
          \::/
           ||
          /::\
         /::::\
        /::::::\
       /::::::::\
      |""""""""""|
   */
   public static void hourglass() {
      line();
      topCone();
      //middle();
      //bottomCone();
      line();
   }
   
   public static void line() {
      System.out.print("|");
      for(int quote = 1; quote <= 10; quote++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   public static void topCone() {
      for(int line = 1; line <= 4; line++) {
         
         System.out.print("\\");
         for(int colon = 1; colon <= -2 * line + 10; colon++) {
            System.out.print(":");
         }
         System.out.print("/");
         System.out.println();
      }
   }
}