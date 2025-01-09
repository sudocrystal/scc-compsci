# Day 02/20

+ HW Reflection (egg2 problem)
+ Review Exercise: Cake
  - With a partner, analyze the expected output and complete the program
+ Explain Program \#1
+ Things we should know
  - class declaration
  - main method declaration
  - printing to the screen
  - defining and calling a method
+ Lecture
  - Literals
  - Data Types
  - Expressions, Operators
    - Order of operations
    - Casting
  - Variables
    - Naming
    - Declaring
    - Initializing
    - Assignment Operator
    - Shortcut Assignment
  - For Loops
    - Basic Syntax
    - Sequential
    - Nested
+ Learning Practice
  - Primitive Data
    - Self-Check 2.1 - 2.3
    - Self-Check 2.5 - 2.13
  - Definite Loops
    - Self-Check 2.21
    - Self-Check 2.26 - 2.31
    - Exercises 2.4 - 2.6
    - Exercise 2.9

## Programs for class

### Day02Cake.java
```java
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

```

### Day02DataAndLoops.java
```java
/*
|   literal type       |  examples           | java data type
|----------------------|---------------------|-----------------
| whole numbers        |    |  
| decimal numbers      |    |
| series of characters |    |
*/

public class Day02DataAndLoops {

   public static void main(String[] args) {
      expressionMystery();
      //variablesInJava();
      //forLoop();
      //nestedLoop();
   }

   public static void variablesInJava() {
   }

   public static void forLoop() {
   }

   public static void nestedLoop() {
   }

   // evaluating expressions
   public static void expressionMystery() {
      System.out.println("A look at expression evaulation: ");

      System.out.print("4 + 7 * 3 = ");
      System.out.println();// 4 + 7 * 3 );

      System.out.print("(4 + 7) * 3 = ");
      System.out.println();// (4 + 7) * 3 );

      System.out.print("2 * 3 * 2 + 1 * 9 * 3 = ");
      System.out.println();// 2 * 3 * 2 + 1 * 9 * 3 );

      System.out.print("105 % 10 - 2 = ");
      System.out.println();// 105 % 10 - 2 );

      System.out.print("1 / 2 = ");
      System.out.println();// 1 / 2 );

      System.out.print("1.0 / 2 = ");
      System.out.println();// 1.0 / 2 );

      System.out.print("(double)(1 / 2) = ");
      System.out.println();// (double)(1 / 2) );

      System.out.print("(double) 1 / 2 = ");
      System.out.println();// (double) 1 / 2 );

      System.out.print("4 + 4 + \"hello\" = ");
      System.out.println();// 4 + 4 + "hello" );

      System.out.print("\"hello\" + 4 + 4 = ");
      System.out.println();// "hello" + 4 + 4 );
   }
}
```


## Solutions

### Day02Cake.java
```java
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
```

### Day02DataAndLoops.java
```java
/*
|   literal type       |  examples           | java data type
|----------------------|---------------------|-----------------
| whole numbers        |  4, -5, 19, 1000, 0 |  int
| decimal numbers      |  3.14, -2.1, 0.0    |  double
| series of characters |  "hi", "0", "#!@"   |  String
*/

public class Day02DataAndLoops {

   public static void main(String[] args) {
      expressionMystery();
      variablesInJava();
      forLoop();
      nestedLoop();
   }

   // evaluating expressions
   public static void expressionMystery() {
      System.out.println("A look at expression evaulation: ");

      System.out.print("4 + 7 * 3 = ");
      System.out.println();// 4 + 7 * 3 );

      System.out.print("(4 + 7) * 3 = ");
      System.out.println();// (4 + 7) * 3 );

      System.out.print("2 * 3 * 2 + 1 * 9 * 3 = ");
      System.out.println();// 2 * 3 * 2 + 1 * 9 * 3 );

      System.out.print("105 % 10 - 2 = ");
      System.out.println();// 105 % 10 - 2 );

      System.out.print("1 / 2 = ");
      System.out.println();// 1 / 2 );

      System.out.print("1.0 / 2 = ");
      System.out.println();// 1.0 / 2 );

      System.out.print("(double)(1 / 2) = ");
      System.out.println();// (double)(1 / 2) );

      System.out.print("(double) 1 / 2 = ");
      System.out.println();// (double) 1 / 2 );

      System.out.print("4 + 4 + \"hello\" = ");
      System.out.println();// 4 + 4 + "hello" );

      System.out.print("\"hello\" + 4 + 4 = ");
      System.out.println();// "hello" + 4 + 4 );
   }

   public static void variablesInJava() {
      int x = 10;
      //int x;
      //x = 10;
      x = 25;
      System.out.println("x is " + x + "!");
   }

   public static void forLoop() {
      for(int i = 10; i > 0; i--) {
         System.out.println(i);
      }
      System.out.println();
      for(int i = 1; i <= 10; i++) {
         System.out.print(i + " ");
      }
      System.out.println();
   }

   public static void nestedLoop() {
      for(int i = 1; i <= 10; i++) {
         for(int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i = 1; i <= 10; i++) {
         for(int j = 1; j <= i; j++) {
            System.out.print(i);
         }
         System.out.println();
      }
      for(int i = 1; i <= 10; i++) {
         for(int j = 1; j <= i; j++) {
            System.out.print(j);
         }
         System.out.println();
      }
   }
}
```
