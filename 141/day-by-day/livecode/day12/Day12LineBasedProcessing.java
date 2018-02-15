import java.io.*;
import java.util.*;

public class Day12LineBasedProcessing {
    
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      
      Scanner file = new Scanner(new File("../Day11/mix.txt"));
      echoFile(file);
      //cleanFile(file);
      //maxTokens(file);
   }
 
   // Should echo the contents of a file to the console
   // maintaining all spacing
   public static void echoFile(Scanner in) {
   }
 
   // Should echo the contents of a file
   // removing all non-Int value
   // preserve line breaks
   public static void cleanFile(Scanner in) {
   }
 
   // Should print to the console the largest token found on
   // each individual line of a file
   public static void maxTokens(Scanner in) {
   }
}