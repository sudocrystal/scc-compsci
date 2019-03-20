import java.io.*;
import java.util.*;

public class ConvertForCanvas {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(new File("InheritanceMystery.java"));
      while(in.hasNextLine()) {
         String line = in.nextLine();
         //line = line.replaceAll("private static", "public");
         for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '[')
               System.out.print("&#91;");
            else if(line.charAt(i) == ']')
               System.out.print("&#93;");
            else if(line.charAt(i) == '<')
               System.out.print("&lt;");
            else if(line.charAt(i) == '>')
               System.out.print("&gt;");
            else
               System.out.print(line.charAt(i));
         }
         System.out.println();
      }
   }

}