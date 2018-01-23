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
  - PracticeIt
    - Self-Check
      - Self-Check 4.1
        - hint on (d): use addition and modulus
        - hint on (g): magnitude means ignore whether the number is positive or negative (use absolute value)
      - Self-Check 4.2 - 4.11
      - Self-Check 4.14
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
//       double finalGpa = calcGPA(finalPercenage);
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
