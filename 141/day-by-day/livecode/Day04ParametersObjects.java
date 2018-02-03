public class Day04ParametersObjects {

   public static void main(String[] args) {
      //methodsWithParams();
      //int x = ten();
      //System.out.println("x = " + x);
      //quadratic(1, -7, 12); // 4.0, 3.0
      //quadratic(1, 3, 2);   // -1.0, -2.0 
      sillyString("Shoreline");
      sillyString("Hello World");
   }
   
   public static int ten() {
      return 10;
   }
   
   // this methods shows calling a method with different arguments
   public static void methodsWithParams() {
      love("naps", "sunrises", "vacation");
      love("dogs", "lattes", "running");
      love("homework",200);
   }
   
   // this method prints out three items that are loved
   // What happens if the order of the parameters is changed?
   // What happens if you try to call this method without 3 arguments?
   public static void love(String fave1, String fave2, String fave3) {
      System.out.println("I love:");
      System.out.println("\t1. " + fave1);
      System.out.println("\t2. " + fave2);
      System.out.println("\t3. " + fave3);
      System.out.println();
   }
   
   // this method overloads "love" for 2 parameters
   public static void love(String fave, int num) {
      System.out.println("I love " + fave + " " + num + " times more than anything else in the world!");
   }
   
   // From PracticeIt BJP4 Exercise 3.8: quadratic
   // This method solves quadratic equations and prints their roots
   // A quadratic roots can be found using the equations:
   // first root: x = (-b + squareroot(square(b) - 4ac)) / 2a
   // second root: x = (-b - squareroot(square(b) - 4ac)) / 2a
   public static void quadratic(int a, int b, int c) {
      double firstRoot = quadPlus(a,b,c);
      double secondRoot = quadMinus(a,b,c);
      System.out.println(firstRoot);
      System.out.println(secondRoot);
   }
   
   public static double quadPlus(int a, int b, int c) {
      double result = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
      return result;
   }
   
   public static double quadMinus(int a, int b, int c) {
      double result = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
      return result;
   }
   
   // This method prints out information about a given String
   public static void sillyString(String s) {
      System.out.println("Given the string: " + s);
      System.out.println("First letter: " + s.charAt(0));
      System.out.println("Last letter: " + s.charAt(s.length()-1) );
      System.out.println("Everything but the first and last: " + s.substring(1,s.length()-1) );
      System.out.println("In all caps: " + s.toUpperCase() );
      System.out.println("In all lowercase: " + s.toLowerCase() );
      System.out.println("Is is \"Hello World\"? " + s.equals("Hello World") );
      System.out.println("Index of \"e\"? " + s.indexOf("e") );
      System.out.println();
   }
}