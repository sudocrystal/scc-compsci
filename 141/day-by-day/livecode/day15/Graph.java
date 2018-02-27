//import java.awt.Point;
import java.util.*;

public class Graph {
   //class constant for the size of graph
   public static final int SIZE = 4;
   
   //instance variables
   private char[][] grid;
   
   //constructor
   public Graph() {
      grid = new char[SIZE][SIZE];
      for (char[] row : grid)
         Arrays.fill(row, ' ');
   }
   
   //(unconventional) mutator
   public void addPoint(Point p) {
      if(p.x > grid.length || p.y > grid[0].length) {
         System.out.println("Could not plot: " + p);
      }
      else {
         System.out.println("Plotted: " + p);
         grid[p.x][p.y] = 'x';
      }
   }
   
   //toString
   public String toString() {
      //toString returns a String (does not print) so
      //this creates a variable to return at method end
      String toReturn = " ";
      
      // top row of x cords
      for(int col = 0; col < SIZE; col++)
         toReturn += col;
      toReturn += "\n";
      
      // grid of the graph, preceeded by the y cords
      for(int row = 0; row < grid.length; row++) {
         toReturn += row;
         for(int col = 0; col < grid[0].length; col++) {
            toReturn += grid[row][col];
         }
         toReturn += "\n";
      }
      
      // returns constructed String representation of Graph
      return toReturn;
   }
   
}