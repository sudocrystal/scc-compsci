# Day 05/20

+ Lecture
  - User Input
    - nextInt
    - nextDouble
    - next
  - Decisions
    - relational operators
      - ==, .equals, !=, !.equals, <, >, <=, >=
    - logical
      - &&, ||, !
    - often confused
      - = vs ==
      - == vs .equals
    - if-statements
      - basic
      - if/else
      - if/else if/else if
      - if/else if/else
+ Learning Practice
  - 8 independent problems
    - Do odd problems
  - PracticeIt
    - Self-Check
      - Self-Check 4.1
        - This is kind of a terrible problem. Don't grade completion
        - hint on (d): use addition and modulus
        - hint on (g): magnitude means ignore whether the number is positive or negative (use absolute value)
      - Self-Check 4.2 - 4.11
      - Self-Check 4.13
    - Exercises
      - Exercise 4.1 (remember that an int divided by an int is an int)

## Programs for Class
```java
import java.util.Scanner;

public class Day05InputDecisions {

   public static void main(String[] args) {
      // creates a Scanner object called console for User Input
      Scanner console = new Scanner(System.in);

      repeatPhrase();
//       repeatPhrase(console);

//       double finalPercentage = calcGrade(console);
//       System.out.println("Expected Final Grade: " + finalPercentage);
//       double finalGpa = calcGPA(finalPercentage);
//       TODO: print gpa
   }

   // takes a phrase and a number
   // prints the phrase to the screen that number of times
   // what if "returns"?
   public static void repeatPhrase() {
   }

   // prompts for a phrase and a number
   // prints the phrase to the screen, one letter per line, all caps
   // repeatPhrase() where the user types in "try" and 3
   /* should produce:
      TTT
      RRR
      YYY
   */
   public static void repeatPhrase(Scanner console) {
   }

   // prompts for your percentage grade in the following categories:
   // Individual Homework (30%)
   // Learning Practice (20%)
   // Midterm (20%)
   // Final (30%)
   // returns the calculated final percentage for the class
   //TODO: PERCENTAGE GRADE METHOD

   // takes a percentage grade as a parameter
   // returns the calculated gpa, according to the following:
   // >= 95% is a 4.0
   // 94 is a 3.9
   // 93 is a 3.8
   // 92 is a 3.7
   // 91 is a 3.6
   // 90 is a 3.5
   // else return 2.0 for now
   //TODO: GPA METHOD
}
```

## Solutions
```java
import java.util.Scanner;

public class Day05InputDecisions {

   public static void main(String[] args) {
      // creates a Scanner object called console for User Input
      Scanner console = new Scanner(System.in);

      //String multiPhrase = repeatPhrase("something",3);
      //System.out.println(multiPhrase);
      //repeatPhrase(console);

      double finalPercentage = calcGrade(console);
      System.out.println("Expected Final Grade: " + finalPercentage);
      double finalGpa = calcGPA(finalPercentage);
      System.out.println("Expected GPA: " + finalGpa);
   }

   // takes a phrase and a number
   // prints the phrase to the screen that number of times
   // what if "returns"?
   public static String repeatPhrase(String phrase, int times) {
      String result = "";
      for(int i = 1; i <= times; i++) {
         result += phrase;
      }
      return result;
   }

   // prompts for a phrase and a number
   // prints the phrase to the screen, one letter per line, all caps
   // repeatPhrase() where the user types in "try" and 3
   /* should produce:
      TTT
      RRR
      YYY
   */
   public static void repeatPhrase(Scanner console) {
      System.out.print("Enter a phrase: ");
      String phrase = console.next();
      //phrase = phrase.toUpperCase();
      System.out.print("How many times? ");
      int times = console.nextInt();

      for(int letter = 0; letter < phrase.length(); letter++) {
         for(int num = 1; num <= times; num++) {
            //System.out.print(phrase.charAt(letter));
            System.out.print(phrase.toUpperCase().charAt(letter));
         }
         System.out.println();
      }
   }

   // prompts for your percentage grade in the following categories:
   // Individual Homework (30%)
   // Learning Practice (20%)
   // Midterm (20%)
   // Final (30%)
   // returns the calculated final percentage for the class
   public static double calcGrade(Scanner console) {
      System.out.print("Individual homework average? ");
      double hw = console.nextDouble();
      System.out.print("Practice average? ");
      double practice = console.nextDouble();
      System.out.print("Midterm? ");
      double midterm = console.nextDouble();
      System.out.print("Final? ");
      double finalexam = console.nextDouble();

      return hw * 0.3 + practice * 0.2 + midterm*0.2 + finalexam*0.3;
   }

   // takes a percentage grade as a parameter
   // returns the calculated gpa, according to the following:
   // >= 95% is a 4.0
   // 94 is a 3.9
   // 93 is a 3.8
   // 92 is a 3.7
   // 91 is a 3.6
   // 90 is a 3.5
   // else return 2.0 for now
   public static double calcGPA(double percent) {
      if(percent >= 95) {
         return 4.0;
      }
      else if(percent >= 94) {
         return 3.9;
      }
      else if(percent >= 93) {
         return 3.8;
      }
      return 2.0;
   }
}
```
