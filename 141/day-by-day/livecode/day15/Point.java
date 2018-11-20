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
   private int x;
   private int y;

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
  //  public String toString() {
  //     return "";
  //  }
}
