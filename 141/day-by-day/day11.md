# Day 11/20

+ Lecture: Token-based File Processing
  - Grab starter files
  - Big Data = Why we need to be able to read files and make conclusions
  - Setting up to read from a file:
    - `import java.io.*`
    - `throws FileNotFoundException`
      - Talk about Exceptions and try/catch blocks at a high level
    - `new Scanner(new File("file.txt"))`
      - overview of relative vs absolute paths
      - when giving an absolute path, the slashes go the opposite way "/" not "\"
  - Token based Processing
    - Tokens are separated by one or more spaces
    - \n characters are separators as well
  - First Practice
    - Self-Check 6.1 - 6.4
    - Self-Check 6.8 - 6.10
  - LiveCode Problems
    - echo10 and echoAll
    - sumAll
      - What if there's a decimal value in the file?
      - try with mix.txt
    - echoWords
    - abcWords
    - gradeReport
      - What if the student has more than 3 grades?
+ Learning Practice
  - Self-Check
    - Self-Check 6.1 - 6.4
    - Self-Check 6.8 - 6.10
    - Self-Check 6.5 - 6.7
    - Self-Check 6.20 - 6.21
  - Exercises
    - Exercise 6.1 - 6.4

## Programs for class
[day11](livecode/day11/)

```java
import java.io.*;
import java.util.*;

public class Day11FileProcessing {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner numFile = new Scanner(new File("numbers.txt"));
      echo10(numFile);
      //echoAll(numFile);
      //sumAll(numFile);

      //Scanner wordsFile = new Scanner( /* fill this in */ );
      //echoWords(wordsFile);
      //abcWords(wordsFile);

      //Scanner checkFile = new Scanner( /* fill this in */ );
      //gradeReport(checkFile);
   }

   // echos the first 10 ints in a file
   public static void echo10(Scanner in) {
        for (int i = 1; i <= 10; i++) {
            int next = in.nextInt();
            System.out.println("number = " + next);
        }
   }

   // echos all the ints in a file
   public static void echoAll(Scanner in) {
        while(in.hasNextInt()) {
            int next = in.nextInt();
            System.out.println("number = " + next);
        }
   }

   // reads all int tokens from an input file, adding them up
   // prints total ints found, sum of all numbers, and the average
   public static void sumAll(Scanner in) {
   }

   // echos all the words in a file
   public static void echoWords(Scanner in) {
   }

   // prints the number of A, B, and C words in a file
   public static void abcWords(Scanner in) {
   }

   // Reads file containing a series of student grade summaries:
   //    each summary contains a name followed by GPA grades
   // Report each student's average in the following format:
   //    Nikita = 3.83 average for 3 grades
   public static void gradeReport(Scanner in) {
   }
 }
```

## Solutions
```java
import java.io.*;
import java.util.*;

public class Day11FileProcessing {
   public static void main(String[] args) throws FileNotFoundException {
      //Scanner numFile = new Scanner(new File("mix.txt"));
      //echo10(numFile);
      //System.out.println("===");
      //echoAll(numFile);
      //sumAll(numFile);

      //Scanner wordsFile = new Scanner(new File("words.txt"));
      //echoWords(wordsFile);
      //abcWords(wordsFile);

      Scanner checkFile = new Scanner(new File("grades.txt"));
      gradeReport(checkFile);
   }

   // echos the first 10 ints in a file
   public static void echo10(Scanner in) {
        for (int i = 1; i <= 10; i++) {
            int next = in.nextInt();
            System.out.println("number = " + next);
        }
   }

   // echos all the ints in a file
   public static void echoAll(Scanner in) {
        while(in.hasNextInt()) {
            int next = in.nextInt();
            System.out.println("number = " + next);
        }
   }

   // reads all int tokens from an input file, adding them up
   // prints total ints found, sum of all numbers, and the average
   public static void sumAll(Scanner in) {
      int count = 0;
      int sum = 0;
      
      while(in.hasNext()) {
         if(in.hasNextInt()) {
            int next = in.nextInt();
            //System.out.println("number = " + next);
            sum += next;
            count++;
         }
         else {
            String trash = in.next();
            System.out.println("Ignoring " + trash);
         }
      }
      
      System.out.println("Total ints = " + count);
      System.out.println("Sum = " + sum);
      double average = (double)sum / count;
      System.out.println("Average = " + average);
   }

   // echos all the words in a file
   public static void echoWords(Scanner in) {
      while(in.hasNext()) {
         String next = in.next();
         System.out.println(next);
      }
   }

   // prints the number of A, B, and C words in a file
   public static void abcWords(Scanner in) {
      int a = 0;
      int b = 0;
      int c = 0;
      while(in.hasNext()) {
         // toUpperCase() is one (of many) ways to make this case insensitive
         String next = in.next().toUpperCase();  
         if(next.charAt(0) == 'A') {
            a++;
         } 
         else if(next.charAt(0) == 'B') {
            b++;
         }
         else if(next.charAt(0) == 'C') {
            c++;
         }
      }
      System.out.println("A word count = " + a);
      System.out.println("B word count = " + b);
      System.out.println("C word count = " + c);
   }

   // Reads file containing a series of student grade summaries:
   //    each summary contains a name followed by GPA grades
   // Report each student's average in the following format:
   //    Nikita = 3.83 average for 3 grades
   public static void gradeReport(Scanner in) throws FileNotFoundException {
      PrintStream outFile = new PrintStream(new File("gradeReport.txt"));
      
      while(in.hasNext()) {
         String name = in.next();
         int num = 0;
         double total = 0;
         while(in.hasNextDouble()) {
            num++;
            double grade = in.nextDouble();
            total += grade;
         }
         //POINT CHECK
         double average = total / num;
         outFile.print(name + " = ");
         outFile.printf("%.2f",average);
         outFile.println(" average for " + num + " grades");
      }
   }
 }
```
