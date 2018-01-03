# Day 05/20

+ Review Scanner
  - number followed by String/char
  - in.nextLine not in.nextString
+ Lecture
  - if-statements
  - relational operators
  - = vs ==
  - == vs .equals
  - &&, ||, Short Circuit Evaluation
+ Lab: Conditionals
  - 8 independent problems
  - candy machine

## Programs for Class
```java
/*
Write a program that reads in a phrase and a number from the user and then repeats the phrase the number of times input.
e.g.
Enter a phrase > Hello
Enter a number > 3
Hello
Hello
Hello
*/
```

```java
import java.util.*;

public class IfStatements {
  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args){
    System.out.print("Enter a name > ");
    String name = in.nextLine();
  }
}
```

## Solutions
```java
import java.util.*;

public class UserInput {
  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args){
    System.out.print("Enter a phrase > ");
    String phrase = in.nextLine();
    System.out.print("Enter a number > ");
    int num = in.nextInt();

    for(int i=0; i<num; i++)
      System.out.println(phrase);
  }
}
```

```java
import java.util.*;

public class IfStatements {
  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args){
    System.out.print("Enter a name > ");
    String name = in.nextLine();

    if( name.equalsIgnoreCase("crystal") ) {
      System.out.println("Hey, that's my name too!");
    }
    else if( name.equalsIgnoreCase("Emerson") || name.equalsIgnoreCase("Oren")) {
      System.out.println("I have a son named " + name + "!");
    }
    else {
      System.out.println("I like that name.");
    }
  }
}
```
