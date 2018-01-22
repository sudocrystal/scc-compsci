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

## Programs for class

### a
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

### b
```java
// import the Scanner class
// import java.util.Scanner;

public class Day04ParametersObjects {

   public static void main(String[] args) {
      methodsWithParams();
      //quadratic();
      //sillyString("Shoreline");
      //sillyString("Hello World");

      // TODO: create a Scanner object called in
      // TODO: read in an amount of money and store in variable cash
      //pennies(in, cash);
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

### a
```java

```

### b
