# Day 04/20

+ Work through creation of the following:
  - put solution in a method!
  - First without the second set of dots
  - Then allow scaling
  - Then add second set of dots
  ```
  ....1
  ...2.
  ..3..
  .4...
  5....
  ```
+ With the person next to you, work out:
  - PracticeIt - Exercise 2.22 DollarFigure
  - PracticeIt - Exercise 2.23 DollarFigure2
+ Explain Homework #2: Rocket Ship
  - Creative Part
  - Rocket Ship Part
    - Reduce Redundancy in a single line by using nested loops
    - Reduce Redundancy in structure with methods
    - Class constant for size
+ Lab 4: Parameters and Objects

## Programs for class
```java
public class DotBox {
  public static void main(String[] args) {
    box();
  }
  public static void box() {
  }
}
```

## Solutions
```java
public class DotBox {
  public static final int SIZE = 5;
  public static void main(String[] args) {
    dotsNums();
  }
  public static void box() {
    for (int line = 1; line <= SIZE; line++) {
      for (int dots = 1; dots <= -1 * line + SIZE; dots++) {
        System.out.print(".");
      }
      System.out.print(line);
      for (int dots = 1; dots <= 1 * line - 1; dots++) {
        System.out.print(".");
      }
      System.out.println();
    }
  }
}
```
