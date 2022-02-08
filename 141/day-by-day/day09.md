# Day 09/20

+ Lecture
  - makeRandNum
    - `import java.util.Random;`
    - `Random r = new Random();`
    - method parameter `r` vs `randGen` - just a choice
    - r.nextInt(high - low + 1)	+ low;
  - pseudorandom numbers
    - Self-Check 5.5
  - boolean zen and short circuit evaluation
    - isEven
      - show with if/else statement
      - return false without else
      - show with single return
    - isFactor
      - test with x = 0 and show short circuit eval
  - boolean methods
    - allSmallDigits (below)
      - assertion before return
    - reversed (below)
    - mention testing for the false case in the loop, true only if the loop executes entirely without returning false
+ Learning Practice
  - Self-Check
    - Self-Check 5.6 and 5.7
    - Self-Check 5.11
    - Self-Check 5.14 - 5.17
    - Self-Check 5.28 and 5.29
  - Exercises
    - Exercise 5.6 and 5.7
    - Exercise 5.11
    - Exercise 5.13 and 5.14
    - Exercise 5.22

## Programs for class
```java
import java.util.Random;

public class Ch5bRandomBooleans {

   public static void main(String[] args) {
      Random r = new Random();
      int x = makeRandNum(r);
      System.out.println("The number generated was " + x);

//       System.out.println("isEven? " + isEven(x) );

//       boolean factor = isFactor(5, x);
//       System.out.println("is 5 a factor of x? " + factor);

//       System.out.println("allSmallDigits? " + allSmallDigits(x) );

//       System.out.println("isReverse? " + isReverse("hello", "olleh") );
   }

   // returns a random integer between 1 and 100
   // What if we want a random 4 digit number?
   public static int makeRandNum(Random randGen) {
      return 0;
   }

   // returns true is num is even, false if it's odd
   // e.g. isEven(10) --> true
   // e.g. isEven(-1) --> false
   public static boolean isEven(int num) {
      return false;
   }

   // returns true if x is a factor of y (x divides evenly int y)
   // e.g. 3 is a factor of 9
   //      5 is NOT a factor of 9
   // Question: is x here the same as the x in the main?
   // Question: what if x is zero?
   public static boolean isFactor(int x, int y) {
      return false;
   }

   // returns true if all digits are smaller than 5
   // e.g. allSmallDigits(1233) --> true
   // e.g. allSmallDigits(4107) --> false
   // e.g. allSmallDigits(8110) --> false
   public static boolean allSmallDigits(int x) {
      return false;
   }

   // returns true if the strings are reverse of each other
   // e.g. isReverse("hello", "olleh") --> true
   // e.g. isReverse("time", "fine") --> false
   public static boolean isReverse(String s1, String s2) {
      return false;
   }
}
```

## Solutions
```java
import java.util.*;

public class Ch5bRandomBooleans {
   public static void main(String[] args) {
     Random r = new Random();
     int x = makeRandNum(r);
     System.out.println("The number generated was " + x);

     //System.out.println("isEven? " + isEven(x) );

     //boolean factor = isFactor(5, x);
     //System.out.println("is 5 a factor of x? " + factor);

     System.out.println("allSmallDigits? " + allSmallDigits(x) );

//       System.out.println("isReverse? " + isReverse("hello", "olleh") );
	}

	// returns a random integer between 1 and 100
	public static int makeRandNum(Random randGen) {
	    //int r = randGen.nextInt(100) + 1;		        // generates a number 1-100
	    //int r = randGen.nextInt(9000)	+ 1000;		// generates a number 1000-9999
	    //randGen.nextInt(high-low+1)	+ low;
	    return randGen.nextInt(9000) + 1000;
	}

	// returns true is num is even, false if it's odd
	// e.g. isEven(10) --> true
	// e.g. isEven(-1) --> false
	public static boolean isEven(int num) {
	    //if(num % 2 == 0)	{
	    //   return true;
	    //}
	    //else {
	    //   return false;
	    //}
    	    //return false;
	    return num % 2 == 0;
	}

	// returns true if x is a factor of y
	public static boolean isFactor(int x, int y) {
	    return x != 0 && y % x == 0;
	}

	// returns true if all digits are smaller than 5
	// e.g. allSmallDigits(1233) --> true
	// e.g. allSmallDigits(4107) --> false
	// e.g. allSmallDigits(8110) --> false
	public static boolean allSmallDigits(int x) {
	    while (x > 0) {
	        int last = x % 10;
	        if (last > 4) {
		    return false;
	        }
	        x /= 10;
	    }
	    //POINT I'M ASKING ABOUT: What is true when we get here?
	    //A: no number is greater than 4; all digits have been processed
	    return true;
	}

	// returns true if the strings are reverse of each other
	// e.g. isReverse("hello", "olleh") --> true
	// e.g. isReverse("time", "fine") --> false
	public static boolean isReverse(String s1, String s2) {
	    if (s1.length() != s2.length()) {
	      return false;
	    }

	    for (int i = 0; i < s1.length(); i++) {
	      if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
		return false;
	      }
	    }
	    //THIS POINT
	    return true;
	}
}
```
