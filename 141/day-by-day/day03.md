# Day 03/20

+ Things we should already know
  + Review a nested for-loop  
    - nested
    - scope
+ Lecture: Loops with Constants and scaling

+ Lab: for loops (~1 hour)
  - do 1, 2, 3, 5 together
  - 6, 11-17 on your own

Self-Check 2.35 - 2.37


+ Work through creation of the following:
  - put solution in a method!
  - First without the second set of dots
  - Then add second set of dots
  - Then allow scaling
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
    box();
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


```java
/*
1   2   3   4
2   4   6   8
*/
public class Loops {
  public static void main(String[] args) {
    for(int i=0;)
  }
}
```

```java
public class Table {
    public static void main(String[] arg) {
      for(int line = 0; line < 5; line++) {
        for (int stars = 1; stars <= multiplier * line + shift; stars++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
}
```

```java
public class Bottles {
  public static void main(String[] args) {

    System.out.println("10 bottles of beer on the wall, 10 bottles of beer");
    System.out.println("Take one down, pass it around, 9 bottles of beer on the wall");

  }
}
```

```java
public class Count2 {
    public static void main(String[] args) {
        for (  ) {
            System.out.println(  );
        }
    }
}
```

```java
public class Stars {
  public static void main(String[] args) {
    for( ) {

    }
  }
}
```

## Solutions

```java
/*
1   2   3   4
2   4   6   8
*/
public class Loops {
  public static void main(String[] args) {
    for(int row=1; row<=10; row++) {
      for(int col=1; col<=4; col++) {
        System.out.print(row*col + "\t");
      }
      System.out.println();
    }
  }
}
```

```java
public class Stars {
  public static void main(String[] args) {
      for(int i=0; i<6;i++) {
        System.out.println(3*i+8);
      }
  }
}
```
