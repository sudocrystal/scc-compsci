# Start of the Quarter

+ Introduce Self
+ Review Canvas and Syllabus
+ Have students introduce self

# Day 01/20

+ Preview Quiz
  - Talk about the importance of previewing material
+ Lecture
  - JDK / Java
    - Compiled vs. Interpreted Languages
    - Strongly typed vs. duck typing
      - "If it walks like a duck, swims like a duck, and quacks like a duck, then it probably is a duck."
  - JGrasp
  - class declaration
  - main declaration
  - SOPrint vs SOPrintln
    - semicolons terminate statements
    - whitespace matters inside String literals
  - Escape Sequences
    - `\n, \t, \\, \"`
  - Comments
    - single, block, commenting out
  - Methods
    - Defining
    - Calling
+ Learning Practice
  - Talk about the importance of actually practicing material
  - Self-Check
    - Self-Check 1.5
    - Self-Check 1.7 - 1.14
    - Self-Check 1.17 - 1.23
  - Exercises
    - Exercises 1.7 - 1.10

## Programs for class

```java
public class Day01Methods {
   public static void main(String[] args) {
      System.out.println("This println is executed from the main.");
      //doSomething();
      //drawCone();
      //drawBox();
   }

   // this method will help us explore print vs println
   public static void doSomething() {
      System.out.println("Hello world!");
      System.out.print("Goodbye!");
      System.out.print("Where will this line show up?");
      System.out.println("Another line \\\\\\ of output");
      System.out.println();
      System.out.println("blank \"line\" above");
   }

   // this method draws a single ascii box
   public static void drawBox() {
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("+------+");
   }

   // this method draws a single ascii cone
   public static void drawCone() {
      System.out.println("   /\\");
      System.out.println("  /--\\");
      System.out.println(" /----\\");
      System.out.println("/------\\");
   }
}
```

## Solutions

```java
public class Day01Methods {
   public static void main(String[] args) {
      //doSomething();
      drawCone();
      drawBox();
      drawBox();
      drawReverseCone();
   }

   // this method will help us explore print vs println
   public static void doSomething() {
      System.out.println("Hello world!");
      System.out.print("Goodbye!");
      System.out.print("Where will this line show up?");
      System.out.println("Another line \\\\\\ of output");
      System.out.println();
      System.out.println("blank \"line\" above");
   }

   // this method draws a single ascii box
   public static void drawBox() {
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("+------+");
   }

   // this method draws a single ascii cone
   public static void drawCone() {
      System.out.println("   /\\");
      System.out.println("  /--\\");
      System.out.println(" /----\\");
      System.out.println("/------\\");
   }

   // this method draws an upside down cone
   public static void drawReverseCone() {
      System.out.println("\\------/");
      System.out.println(" \\----/");
      System.out.println("  \\--/");
      System.out.println("   \\/");
   }
}
```
