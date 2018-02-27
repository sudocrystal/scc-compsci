//import java.awt.Point;
import java.util.*;

public class Day15OOP {

   public static void main(String[] args) {
      Point one = new Point(0,0);
      Point two = new Point(2,300);
      
      System.out.println("one = " + one + ", two = " + two);
      pointsAreObjects(one,two);
      
      System.out.println("one = " + one + ", two = " + two);
   
//       usingGraphClass(one,two);
   }
   
   public static void pointsAreObjects(Point first, Point second) {
      System.out.println("\tfirst = " + first + ", second = " + second);

      System.out.println("\tfirst = " + first + ", second = " + second);
   }
   
   public static void usingGraphClass(Point p1, Point p2) {
      System.out.println("\n\n===GRAPH OF POINTS===");
      Graph g = new Graph();
      g.addPoint(p1);
      g.addPoint(p2);
      System.out.println();
      System.out.println(g);
   }
}