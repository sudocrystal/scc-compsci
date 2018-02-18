import java.io.*;
import java.util.*;

public class Day12LineBasedProcessing {
    
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      
      Scanner file = new Scanner(new File("more_numbers.txt"));
      //echoFile(file);
      //cleanFile(file);
      //createCleanFile(file);
      //countSpaces(file);
      //countTokens(file);
      //mostTokens(file);
      //maxTokens(file);
   }
 
   // Should echo the contents of a file to the console
   // maintaining all spacing
   // pattern: processes a file line by line
   public static void echoFile(Scanner in) {
      while(in.hasNextLine()) {
         String line = in.nextLine();
         System.out.println(line);
      }
   }
 
   // Should echo the contents of a file to the console
   // preserve line breaks, but removing all extra spaces
   // pattern: processes a file line by line, evaluating each token
   public static void cleanFile(Scanner in) {
      while(in.hasNextLine()) {
         String line = in.nextLine();
         
         Scanner lineScan = new Scanner(line);
         while(lineScan.hasNextInt()) {
            int token = lineScan.nextInt();
            System.out.print(token + " ");
         }
         System.out.println();
      }
   }
   
   // Should echo the contents of a file to A NEW FILE
   // preserve line breaks, but removing all extra spaces
   public static void createCleanFile(Scanner in) throws FileNotFoundException {
      PrintStream outFile = new PrintStream(new File("clean_numbers.txt"));
      while(in.hasNextLine()) {
         String line = in.nextLine();
         
         Scanner lineScan = new Scanner(line);
         while(lineScan.hasNextInt()) {
            int token = lineScan.nextInt();
            outFile.print(token + " ");
         }
         outFile.println();
      }
   }
   
   // Should print the number of spaces found on each line of a file
   // pattern: processes a file line by line, processing the line as a whole
   public static void countSpaces(Scanner in) {
      while(in.hasNextLine()) {
         String line = in.nextLine();
         int count = 0;
         for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ' ') {
               count++;
            }
         }
         System.out.println(count + "  \t spaces ==> \t" + line);
      }
   }
 
   // Should print the number of tokens found on each line of a file
   // pattern: processes a file line by line, visiting all tokens on one line
   public static void countTokens(Scanner in) {
      while(in.hasNextLine()) {
         String line = in.nextLine();
         Scanner lineScan = new Scanner(line);
         int count = 0;
         while(lineScan.hasNext()) {
            String token = lineScan.next();
            //int tokenAsInt = lineScan.nextInt();
            count++;
         }
         System.out.println(count + "  \t token ==> \t" + line);
      }
   }
   
   // Should print the line in the file with the most tokens
   // pattern: processes a file line by line, comparing one line to another
   public static void mostTokens(Scanner in) {
      String mostLine = "";
      int mostTokens = 0;
      while(in.hasNextLine()) {
         String line = in.nextLine();
         System.out.println(line);
         Scanner lineScan = new Scanner(line);
         int count = 0;
         while(lineScan.hasNext()) {
            String token = lineScan.next();
            count++;
         }
         if(count > mostTokens) {
            mostLine = line;
            mostTokens = count;
         }
      }
      System.out.println("\n\n===============================");
      System.out.println(mostLine);
      System.out.println("with " + mostTokens + " tokens");
   }
   
   // Should print the largest token found on each line of a file
   // pattern: processes a file line by line, comparing all tokens on one line
   public static void maxTokens(Scanner in) {
      while(in.hasNextLine()) {
         String line = in.nextLine();
         Scanner lineScan = new Scanner(line);
         int max = Integer.MIN_VALUE;
         while(lineScan.hasNext()) {
            int token = lineScan.nextInt();
            max = Math.max(max,token);
         }
         System.out.println(max + " \t max from ==> \t" + line);
      }
   }
}