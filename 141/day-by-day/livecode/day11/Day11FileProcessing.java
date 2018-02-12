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
