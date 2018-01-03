import java.io.*;
import java.util.*;

public class Day11FileProcessing {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner numFile = new Scanner(new File("numbers.txt"));
      echo10(numFile);
      //echoAll(numFile);
      //sum10(numFile);
      //sumAll(numFile);
      //Scanner wordsFile = new Scanner( /* fill this in */ );
      //echoWords(wordsFile);
      //abcWords(wordsFile);
      //Scanner checkFile = new Scanner( /* fill this in */ );
      //errorCheck(checkFile);
   }

   //echos the first 10 ints in a file
   public static void echo10(Scanner in) {
        for (int i = 1; i <= 10; i++) {
            int next = in.nextInt();
            System.out.println("number = " + next);
        }
   }

   //echos all the ints in a file
   public static void echoAll(Scanner in) {
        while(in.hasNextInt()) {
            int next = in.nextInt();
            System.out.println("number = " + next);
        }
   }

   //reads ten tokens from an input file, adding them up
   public static void sum10(Scanner in) {
   }

   //reads all tokens from an input file, adding them up
   public static void sumAll(Scanner in) {
   }

   //echos all the words in a file
   public static void echoWords(Scanner in) {
   }

   //prints the number of A, B, and C words in a file
   public static void abcWords(Scanner in) {
   }

   //counts all the numbers in a file,
   //and reports (and counts) bad tokens (any values that not in not numbers)
   public static void errorCheck(Scanner in) {
   }
 }
