# Day 03/20

+ Song Lab should be turned in
+ Things we should already know
  + Review a nested for-loop  
    - nested
    - scope
    - class constants
+ Lab: for loops (~1 hour)
  - do 1, 2, 3, 5 together
  - 6, 11-17 on your own
+ Lecture
  - Parameters
    - Input: parameter vs argument
    - Ordering and Types
    - overloading
  - Return Types
    - void / something else
    - return statements
      - there can be many; only one executes
    - where the method is called, use info, but don't have to
  - Math
    - abs, ceil, floor, round
    - sqrt, pow
    - max, min
    - random
  - Casting
  - String Methods
    - length
    - substring(x), substring(x,y)
    - indexOf
    - toUpperCase, toLowerCase
  - User Input
    - nextInt
    - nextDouble
    - nextBoolean
    - next, nextLine
    - nextLine().charAt()
    - Scanner problems

## Programs for class

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
      for (int stars = 1; stars <= multiplier * line + shift; stars++) {
        for(int i=0; i<stars; i++) {
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

## Answers

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
