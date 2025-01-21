# Day 05/20

+ Lecture
  - review from last class with `repeatPhrase()`
  - User Input
    - nextInt
    - nextDouble
    - next
  - `repeatPhrase(console)`
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
[Ch4aInputDecisions.java](https://github.com/sudocrystal/CS141-InteractiveLectures/blob/main/Ch4aInputDecisions.java)

## Solutions
```java
import java.util.Scanner;

public class Ch4aInputDecisions {
   public static void main(String[] args) {
      // creates a Scanner object called console for User Input
      Scanner console = new Scanner(System.in);

      //String multiPhrase = repeatPhrase("something",3);
      //System.out.println(multiPhrase);

      //repeatPhrase(console);

      double finalPoints = calcGrade(console);
      System.out.println("Expected Final Grade: " + finalPoints);

      double finalGpa = calcGPA(finalPoints);
      System.out.println("Expected GPA: " + finalGpa);
   }

   // takes a phrase and a number
   // prints the phrase to the screen that number of times
   // what if "returns"?
   public static String repeatPhrase(String phrase, int times) {
      // for(int i = 1; i <= times; i++) {
      //    System.out.println(phrase);
      // }
      String result = "";
      for(int i = 1; i <= times; i++) {
         result += phrase;
      }
      return result;
   }

   // prompts for a phrase and a number
   // prints the phrase to the screen, one letter per line, all caps
   /* repeatPhrase() where the user types in "try" and 3 should produce:
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

   // prompts for total points earned in the following 3 categories:
   // Learning Practice, Long Homeworks, Exams
   // returns all points added together
   public static double calcGrade(Scanner console) {
      System.out.print("Learning Practice points? ");
      double practice = console.nextInt();
      System.out.print("Homework? ");
      double hw = console.nextInt();
      System.out.print("Exams? ");
      double exams = console.nextInt();

      return (practice + hw + exams);
   }

   // takes a points grade as a parameter
   // returns the calculated gpa, according to the following:
   //   >= 100 is a 4.0
   //   >= 95 is a 3.9
   //   else return 2.0 for now
   public static double calcGPA(double points) {
      if(points >= 100) {
         return 4.0;
      }
      else if(points >= 95) {
         return 3.9;
      }
      return 2.0;
   }
}
```
