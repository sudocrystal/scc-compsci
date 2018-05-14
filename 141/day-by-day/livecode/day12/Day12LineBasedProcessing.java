import java.io.*;
import java.util.*;

public class Day12LineBasedProcessing {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);

      Scanner file = new Scanner(new File("more_numbers.txt"));
      echoContents(file);
      //echoFile(file);
      //cleanFile(file);
      //createCleanFile(file);
      //countSpaces(file);
      //countTokens(file);
      //mostTokens(file);
      //maxTokens(file);
   }

   // Should echo the contents of a file, removing all spacing and new lines
   // pattern: token-based processing: process a file token by token
   public static void echoContents(Scanner in) {
   }

   // Should echo the contents of a file, maintaining all spacing
   // pattern: line-based processing: processes a file line by line
   public static void echoFile(Scanner in) {
   }

   // Should echo the contents of a file to the console
   // preserve line breaks, but removing extra spaces between tokens
   // pattern: processes a file line by line, evaluating each token on a line
   public static void cleanFile(Scanner in) {
   }

   // Should echo the contents of a file to A NEW FILE
   // preserve line breaks, but removing extra spaces between tokens
   public static void createCleanFile(Scanner in) {
   }

   // Should print the number of spaces found on each line of a file
   // pattern: processes a file line by line, processing the line as a whole
   public static void countSpaces(Scanner in) {
   }

   // Should print the number of tokens found on each line of a file
   // pattern: processes a file line by line, visiting all tokens on one line
   public static void countTokens(Scanner in) {
   }

   // Should print the line in the file with the most tokens
   // pattern: processes a file line by line, comparing one line to another
   public static void mostTokens(Scanner in) {
   }

   // Should print the largest token found on each line of a file
   // pattern: processes a file line by line, comparing all tokens on one line
   public static void maxTokens(Scanner in) {
   }
}
