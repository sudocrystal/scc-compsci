## Day 15/20

+ Lecture
  - OOP vs Procedural Programming
    - Self-Check 8.1: Procedural programming treats a program as a sequence of actions or commands, while object-oriented programming looks at a program as a group of interacting entities named objects with related data and behavior.
  - java.awt.Point
    - groups data together (here: x and y)
    - using an object
    - Objects are pass by reference like arrays
  - Make our own Point Class
    - fields
      - Show the difference between _class_/_object_ and explain _state_ using the debugger
    - run the program and show that `toString` is needed
    - note that currently the data passed to the object at creation isn't saved, so we need to modify `constructors`
    - accessors and mutators
    - state, behavior
  - Adding behavior to our point class
    - move
    - translate
  - Object vs Class
    - Self-Check 8.2: An object is an entity that encapsulates related data and behavior, while a class is the blueprint for a type of objects.
+ Learning Practice
  - Self-Check
    - Self-Check 8.1 - 8.6
    - Self-Check 8.8 and 8.10
    - Self-Check 8.12 - 8.14
    - Self-Check 8.16 - 8.18
  - Exercises
    - Exercise 8.1 - 8.4

## Programs for Class
[Ch8a](https://github.com/sudocrystal/CS141-InteractiveLectures/tree/main/Ch8a)

## Solutions

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
   private int x;
   private int y;

   // constructors: allow you to create an Object from this class
   // no return type, same name as the class, initalize all fields
   public Point() {
      this.x = 0;
      this.y = 0;
   }

   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   // accessors: allow you to access a field of an Object's state
   // use "get", return a field's value, no params
   public int getX() { return x; }
   public int getY() { return y; }

   // mutators: allow you to change a field of an Object's state
   // use "set", take a parameter for new value, changes field variable
   public void setX(int x) {
      this.x = x;
   }

   public void setY(int newY) {
      y = newY;
   }

   // OTHER BEHAVIOR: other methods that don't follow the structure
   // of accessors and mutators

   // Moves this point to the specified location in the (x,y) coordinate plane.
   public void move(int x, int y) {
      this.x = x;
      this.y = y;
   }

   // Translates this point, at location (x,y), by dx along the x axis
   // and dy along the y axis so that it now represents the point (x+dx,y+dy).
   public void translate(int dx, int dy) {
      this.x += dx;
      this.y += dy;
   }

   // toString: allows you to print out the state of an Object
   // must return a string, should NOT have System.out.println here
   public String toString() {
      return "POINT(" + x + ", " + y + ")";
   }
}
```
