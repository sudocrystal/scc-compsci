# Day 04/20

+ Partner Review Exercise:
  - hourglass
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

[Ch2cASCII.java]()
[Ch3aParametersObjects.java](https://github.com/sudocrystal/CS141-InteractiveLectures/blob/main/Ch3aParameters.java)

## Solutions

### Day04ASCII.java
```java
public class Day04ASCII {
   public static void main(String[] args) {
      //numberTri();
      hourglass();
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
}
```

### Day04ParametersObjects.java
```java
public class Ch3aParametersObjects {
   public static void main(String[] args) {
      // Giving information to a method:
      // calling a method with different arguments
//       love("naps", "sunrises", "vacation");
//       love("dogs", "lattes", "Netflix");
//       love("homework", 200);

      // Getting information from a method:
      // how to return information from a method
//       double value = 14;
//       System.out.println("Value starts out as " + value);
//       value = add10(value);
//       System.out.println("After method, value is " + value + "\n");
      //findC(3, 4);
      sillyString("Shoreline");
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
      System.out.println("I love " + fave + " " + num + " times more than anything
else in the world!");
      System.out.println();
   }
   // this method adds 10 to the parameter value
   public static double add10(double val) {
      val += 10;  // val = val + 10;
      System.out.println("Inside method, value is " + val);
      return val;
   }

   // uses pythagoeran's theorem to solve for c
   // Pythagoras theorem states that " In a right-angled triangle,
   // the square of the hypotenuse side is equal to
   // the sum of squares of the other two sides ".
   // a^2 + b^2 = c^2 which means c = squareroot(a^2 + b^2)
   public static void findC(int a, int b) {
      System.out.println("Given, a = " + a + " and b = " + b + ":");
      double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
      System.out.println("       c = " + (int)c + " \n");
   }

   // This method prints out information about a given String
   public static void sillyString(String str) {
      System.out.print("Given the string: ");
      System.out.println(str);
      System.out.print("First letter: ");
      System.out.println(str.charAt(0));
      System.out.print("Last letter: ");
      System.out.println(str.charAt(str.length() - 1));
      System.out.print("Everything but the first and last letters: ");
      System.out.println(str.substring(1, str.length() - 1));
      System.out.print("In all caps: ");
      System.out.println(str.toUpperCase());
      System.out.print("In all lowercase: ");
      System.out.println(str.toLowerCase());
      System.out.print("Is " + str + " equal to \"Hello World\"? ");
      System.out.println(str.equals("Hello World"));
      System.out.print("Index of \"d\"? ");
      System.out.println(str.indexOf("d"));
      System.out.println();
   }
}
```
