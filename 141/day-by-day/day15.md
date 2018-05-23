## Day 15/20

+ Lecture
  - OOP vs Procedural Programming
    - PracticeIt Self-Check 8.1: Procedural programming treats a program as a sequence of actions or commands, while object-oriented programming looks at a program as a group of interacting entities named objects with related data and behavior.
  - java.awt.Point
    - groups data together (here: x and y)
    - using an object
    - Objects are pass by reference
  - Make our own Point Class
    - fields
    - toString
    - constructors
    - accessors and mutators
    - state, behavior
  - Adding behavior to our point class
    - move
    - translate
    - other?
  - Graph example
  - Object vs Class
    - PracticeIt Self-Check 8.2: An object is an entity that encapsulates related data and behavior, while a class is the blueprint for a type of objects.
+ Learning Practice
  - Self-Check
    - Self-Check 8.1 - 8.6
    - Self-Check 8.8 and 8.10
    - Self-Check 8.12 - 8.14
    - Self-Check 8.16 - 8.18
  - Exercises
    - Exercise 8.1 - 8.4

## Programs for Class

### Day15OOP.java
```java
import java.awt.Point;
import java.util.*;

public class Day15OOP {

   public static void main(String[] args) {
      Point one = new Point(1,0);
      Point two = new Point(2,300);

      System.out.println("one = " + one + ", two = " + two);
      pointsAreObjects(one,two);

//       one.move(1,1);
//       one.translate(1,1);

//       usingGraph(one,two);

      System.out.println("one = " + one + ", two = " + two);
   }

   public static void pointsAreObjects(Point first, Point second) {
      System.out.println("\tfirst = " + first + ", second = " + second);

      System.out.println("\tfirst = " + first + ", second = " + second);
   }

   public static void usingGraph(Point p1, Point p2) {
      System.out.println("\n\n===GRAPH OF POINTS===");
      Graph g = new Graph();
      g.addPoint(p1);
      g.addPoint(p2);
      System.out.println();
      System.out.println(g);
   }
}
```

### Point.java
```java
/*
   This is an example of what happens inside java.awt.Point
   https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/Point.html
*/

// procedural programming: a program as a sequence of commands
// object oriented programming: a group of interacting Objects

// class: a blueprint for creating an object; defines an object's state and behavior
//    state: things the Object remembers (fields)
//    behavior: things the Object can do (methods)
// object: a particular instance of a class with it's own unique state
public class Point {

   // fields/instance variables: (combined make up the object's state)
   // should be private and declared (but not initialized)
   int x;
   int y;

   // constructors: allow you to create an Object from this class
   // no return type, same name as the class, initalize all fields
   public Point() {
   }

   public Point(int startX, int startY) {
   }

   // accessors: allow you to access a field of an Object's state
   // use "get", return a field's value, no params
   public int getX() {
      return 0;
   }

   public int getY() {
      return 0;
   }

   // mutators: allow you to change a field of an Object's state
   // use "set", take a parameter for new value, changes field variable
   public void setX(int newX) {
   }

   // OTHER BEHAVIOR: other methods that don't follow the structure
   // of accessors and mutators

   // Moves this point to the specified location in the (x,y) coordinate plane.
   public void move(int x, int y) {
   }

   // Translates this point, at location (x,y), by dx along the x axis
   // and dy along the y axis so that it now represents the point (x+dx,y+dy).
   public void translate(int dx, int dy) {
   }

   // toString: allows you to print out the state of an Object
   // must return a string, should NOT have System.out.println here
   public String toString() {
      return "";
   }
}
```

### Graph.java
```java
import java.awt.Point;
import java.util.*;

public class Graph {
   //class constant for the size of graph
   public static final int SIZE = 10;

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
         grid[p.y][p.x] = 'x';
      }
   }

   //toString
   public String toString() {
      //toString returns a String (does not print) so
      //this creates a variable to return at method end
      String toReturn = " ";

      // top row of x cords
      for(int col = 0; col < SIZE; col++)
         toReturn += col % 10; // ensures that larger grids don't offset char plot
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
```
