# Day 04/20

+ Things we should know
  - using a systematic approach to breaking down repetitive ascii art
  - using methods to repeat larger structures
+ Review Exercise:
  - numberTri and/or hourglass
+ Explain Homework #2: Rocket Ship
  - Rocket Ship Part
    - Reduce Redundancy in a single line by using nested loops
    - Reduce Redundancy in structure with methods
    - Class constant for size
+ Lecture
  - Parameters
    - information for processing: parameter vs argument
    - ordering and Types
    - overloading
  - Return Types
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
public class Day04ASCII {

   public static void main(String[] args) {
      numberTri();
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
   }
}
```

### Day04ParametersObjects.java
```java
public class Day04ParametersObjects {

   public static void main(String[] args) {
      methodsWithParams();
      //ten();
      //quadratic(1, -7, 12);       // 4.0, 3.0
      //quadratic(1, 3, 2);         // -1.0, -2.0
      //sillyString("Shoreline");
      //sillyString("Hello World");
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

   // this method should return the int literal 10
   public static void ten() {
      System.out.println("10");
   }

   // From PracticeIt BJP4 Exercise 3.8: quadratic
   // This method solves quadratic equations and prints their roots
   // A quadratic roots can be found using the equations:
   // first root: x = (-b + squareroot(square(b) - 4ac)) / 2a
   // second root: x = (-b - squareroot(square(b) - 4ac)) / 2a
   public static void quadratic(int a, int b, int c) {
//       double firstRoot = quadPlus(a,b,c);
//       double secondRoot = quadMinus(a,b,c);

   }

   // This method prints out information about a given String
   public static void sillyString(String s) {
      System.out.println("Given the string: " + s);
      System.out.println("First letter: ");
      System.out.println("Last letter: ");
      System.out.println("Everything but the first and last: ");
      System.out.println("In all caps: ");
      System.out.println("In all lowercase: ");
      System.out.println("Is is \"Hello World\"? ");
      System.out.println("Index of \"e\"? ");
   }
}
```

## Solutions

### Day04ASCII.java
```java
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
```

### Day04ParametersObjects.java
```java
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
