# Day 06/20

+ Exam \#1 reminders
+ Lecture
  - Common Algorithms
    - Cumulative Sum
      - Observe method call in an SOP --> means returns
    - findMax
      - must add Scanner declaration (should be in main)
      - show max = 0, but then use negative numbers
      - Integer.MAX_VALUE, Integer.MIN_VALUE
      - show Math.max vs if-statement
    - Replicate String
      - revists pattern from last class
      - using .length() to visit every character, combined with .charAt(i)
      - char + char vs char + "" + char
    - Reverse String
      - two approaches: backwards or put char in front
+ Learning Practice
  - Exercise 4.4 and 4.5
  - Exercise 4.12 and 4.13
  - Exercise 4.17 and 4.18

## Programs for class
```java
import java.util.Scanner;

public class Ch4bCommonAlgos {

   public static void main(String[] args) {

      System.out.println( "Cumulative Sum = " + sumTo(10) );
//       System.out.println( findMax(console) + " was the highest value entered");
//       System.out.println( replicateLetter("apple") );
//       System.out.println( reverse("apple") );
   }

   // This method should take a number as a paramenter
   // and return all the numbers from 1 to n added together
   // returns 1+2+3+...+n
   public static int sumTo(int n) {
      return 0;
   }

   // This method should prompt for 5 int values
   // The method should return the highest value entered
   public static double findMax(Scanner console) {
      return 0;
   }

   // This method should take a string as a parameter
   // and return the string with each letter repeated
   // replicateLetter("apple") --> "aappppllee"
   public static String replicateLetter(String s) {
      return "";
   }

   // This method should take a string as a parameter
   // and return the string reversed
   // reverse("apple") --> "elppa"
   public static String reverse(String s) {
      return "";
   }
}
```

## Solutions
```java
import java.util.Scanner;

public class Ch4bCommonAlgos {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);

      //System.out.println( "Cumulative Sum = " + sumTo(3) );
      //System.out.println( findMax(console) + " was the highest value entered");
      //System.out.println( replicateLetter("apple") );
      System.out.println( reverse("apple") );
   }

   // This method should take a number as a paramenter
   // and return all the numbers from 1 to n added together
   // returns 1+2+3+...+n
   public static int sumTo(int n) {
      int total = 0;
      for(int i = 1; i <= n; i++) {
         total += i;
      }
      return total;
   }

   // This method should prompt for 5 int values
   // The method should return the highest value entered
   public static int findMax(Scanner console) {
      int max = Integer.MIN_VALUE;
      for(int i = 1; i <= 5; i++) {
         System.out.print("Enter a value: ");
         int val = console.nextInt();
         /*if(val > max) {
            max = val;
         }*/
         max = Math.max(max,val);
      }
      return max;
   }

   // This method should take a string as a parameter
   // and return the string with each letter repeated
   // replicateLetter("apple") --> "aappppllee"
   public static String replicateLetter(String s) {
      String result = "";
      for(int i = 0; i < s.length(); i++) {
         result += s.charAt(i) + "" + s.charAt(i);
      }
      return result;
   }

   // This method should take a string as a parameter
   // and return the string reversed
   // reverse("apple") --> "elppa"
   public static String reverse(String s) {
      String result = "";
      /*for(int i = s.length()-1; i >= 0; i--) {
         result = result + s.charAt(i);
      }*/
      for(int i = 0; i < s.length(); i++) {
         result = s.charAt(i) + result;
      }
      return result;
   }
}
```
