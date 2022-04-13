# Day 04/20

+ Partner Review Exercise:
  - numberTri and/or hourglass
+ Ascii Art Notes
  - Reduce Redundancy in a single line by using nested loops
  - Reduce Redundancy in structure with methods
  - NOTE (but no demo): could use Class constant for size
+ Lecture
  - Parameters
    - information for processing: parameter vs argument
    - ordering and Types
    - overloading
    - do PracticeIt Self-Check 3.6
  - Return Types
    - Value semantics (`add10`)
    - void / something else
    - return statements
      - there can be many; only one executes
    - where the method is called, use info, but don't have to
  - Math
    - abs, sqrt, pow
    - max, min
    - ceil, floor, round
    - cast if you don't want a double result
  - String Methods
    - length
    - charAt, indexOf
    - substring(x), substring(x,y)
    - toUpperCase, toLowerCase
    - .equals, .equalsIngnoreCase
+ Learning Practice
  - Self-Check
    - Self-Check 3.1 and 3.2
    - Self-Check 3.6 - 3.11
    - Self-Check 3.13 - 3.15
    - Self-Check 3.17 - 3.19
  - Exercises
    - Exercise 3.1 and 3.2
    - Exercise 3.9 - 3.11
    - Exercise 3.17 and 3.18

## Programs for class

### Day04ASCII.java
```java
public class Ch2cASCII {

   public static void main(String[] args) {
      //numberTri();
      //hourglass();
   }


   /* This method should produce the following
      -----1-----
      ----222----
      ---33333---
      --4444444--
      -555555555-
   */
   public static void numberTri() {
   }

   /* This method should produce the following
      |""""""""""|       // helpful hints: 10 quotes
       \::::::::/        //      1 space,  8 colons
        \::::::/         //      2 spaces, 6 colons
         \::::/          //      3 spaces, 4 colons
          \::/           //      4 spaces, 2 colons
           ||            //      5 spaces before ||
          /::\           //      4 spaces, 2 colons
         /::::\          //      3 spaces, 4 colons
        /::::::\         //      2 spaces, 6 colons
       /::::::::\        //      1 space,  8 colons
      |""""""""""|       //                10 quotes
   */
   public static void hourglass() {
      line();
      top();
      middle();
      bottom();
      line();
   }

   public static void line() {
      System.out.print("|");
      // TODO: the following two lines need editing
      for(int quote = 1; quote <= 1; quote++) {
         System.out.print("");
      }
      System.out.println("|");
   }

   public static void top() {
   }

   public static void middle() {
      // TODO: the following two lines need editing
      for(int space = 1; space <= 1; space++) {
         System.out.print("");
      }
      System.out.println("||");
   }

   public static void bottom() {
   }
}
```

### Day04ParametersObjects.java
```java
public class Ch3aParametersObjects {

   public static void main(String[] args) {
      // Giving information to a method:
      // calling a method with different arguments
      love("naps", "sunrises", "vacation");
      love("dogs", "lattes", "Netflix");
//       love("homework", 200);

      // Getting information from a method:
      // how to return information from a method
//       double value = 14;
//       System.out.println("Value starts out as " + value);
//       add10(value);
//       System.out.println("After method, value is " + value + "\n");

//       findC(3, 4);

      //sillyString("Shoreline");
      //sillyString("Hello World");
   }

   // this method prints out three items that are loved
   // What happens if the order of the parameters is changed?
   // What happens if you try to call this method without 3 arguments?
   public static void love(String fave1, String fave2, String fave3) {
      System.out.print("I love:");
      System.out.print("\t1. " + fave1);
      System.out.print("\t2. " + fave2);
      System.out.print("\t3. " + fave3);
      System.out.println();
   }

   // this method overloads "love" for 2 parameters
   public static void love(String fave, int num) {
      System.out.println("I love " + fave + " " + num + " times more than anything else in the world!");
      System.out.println();
   }

   // this method adds 10 to the parameter value
   public static void add10(double val) {
      val += 10;
      System.out.println("Inside method, value is " + val);
   }

   // uses pythagoeran's theorem to solve for c
   // Pythagoras theorem states that " In a right-angled triangle,
   // the square of the hypotenuse side is equal to
   // the sum of squares of the other two sides ".
   // a^2 + b^2 = c^2 which means c = squareroot(a^2 + b^2)
   public static void findC(int a, int b) {
      System.out.println("Given, a = " + a + " and b = " + b + ":");

      System.out.println("       c =  \n");
   }

   // This method prints out information about a given String
   public static void sillyString(String str) {
      System.out.print("Given the string: ");
      System.out.println(str);
      System.out.print("First letter: ");
      System.out.println();
      System.out.print("Last letter: ");
      System.out.println();
      System.out.print("Everything but the first and last letters: ");
      System.out.println();
      System.out.print("In all caps: ");
      System.out.println();
      System.out.print("In all lowercase: ");
      System.out.println();
      System.out.print("Is " + str + " equal to \"Hello World\"? ");
      System.out.println();
      System.out.print("Index of \"d\"? ");
      System.out.println();
      System.out.println();
   }
}
```

## Old Solutions

### Day04ASCII.java
```java
public class Day04ASCII {

   public static void main(String[] args) {
      //numberTri();
      hourglass();
   }


   /* This method should produce the following
      -----1-----
      ----222----
      ---33333---
      --4444444--
      -555555555-
   */
   public static void numberTri() {
      for(int line = 1; line <= 5; line++) {
         for(int dashes = 1; dashes <= -1 * line + 6; dashes++) {
            System.out.print("-");
         }
         for(int num = 1; num <= 2 * line - 1; num++) {
            System.out.print(line);
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
```

### Day04ParametersObjects.java
```java
public class Day04ParametersObjects {

   public static void main(String[] args) {
      //methodsWithParams();
      //double value = 14;
      //add10(value);
      //System.out.println("After method, value is " + value);
      //int x = ten();
      //System.out.println("x = " + x);
      //quadratic(1, -7, 12); // 4.0, 3.0
      //quadratic(1, 3, 2);   // -1.0, -2.0
      sillyString("Shoreline");
      sillyString("Hello World");
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

   // this method adds 10 to the parameter value, ONLY IN THIS METHOD
   public static void add10(double val) {
      val += 10;
      System.out.println("Inside method, value is " + val);
   }

   // this method should return the int literal 10
   public static int ten() {
      return 10;
   }

   // From PracticeIt BJP4 Exercise 3.8: quadratic
   // This method solves quadratic equations and prints their roots
   // A quadratic roots can be found using the equations:
   // first root: x = (-b + squareroot(square(b) - 4ac)) / 2a
   // second root: x = (-b - squareroot(square(b) - 4ac)) / 2a
   public static void quadratic(int a, int b, int c) {
      double firstRoot = quadPlus(a,b,c);
      double secondRoot = quadMinus(a,b,c);
      System.out.println(firstRoot + ", " + secondRoot);
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
```
