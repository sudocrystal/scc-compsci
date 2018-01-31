# Day 08/20

+ Lecture
  - pseudorandom numbers
    - Self-Check 5.5
  - assertions
    - BJP3 Self-Check 5.27: assertions1
  - boolean zen and short circuit evaluation
    - isFactor (below)
    - isEven (below)
  - boolean methods
    - allSmallDigits (below)
    - reversed (below)
    - mention testing for the false case in the loop, true only if the loop executes entirely without returning false


## Programs for class
```java
import java.util.Random;

public class Day08RandomBooleansAssertions {

   public static void main(String[] args) {
      int x = random();
//       isFactor(3,x);
//       isFactor(0,x);
//       System.out.println( isEven(10) );
//       System.out.println( allSmallDigits(1234) );
//       System.out.println( isReverse("hello","olleh") );
   }

   // returns a random integer between 1 and 100
   public static int random() {
      return 0;
   }

   // returns true if x is a factor of y
   public static boolean isFactor(int x, int y) {
      return false;
   }

   // returns true is num is even, false if it's odd
   // e.g. isEven(10) --> true
   // e.g. isEven(-1) --> false
   public static boolean isEven(int num) {
      return false;
   }

   // returns true if all digits are smaller than 5
   // e.g. allSmallDigits(1233) --> true
   // e.g. allSmallDigits(99) --> false
   // e.g. allSmallDigits(1190) --> false
   public static boolean allSmallDigits(int x) {
      return false;
   }

   // returns true if the strings are reverse of each other
   // e.g. isReverse("hello","olleh") --> true
   // e.g. isReverse("time","fine") --> false
   public static boolean isReverse(String s1, String s2) {
      return false;
   }
}
```

## Solutions
```java
import java.util.*;

public class Day08RandomBooleansAssertions {

	public static void main(String[]	args)	{
//			int x	= random();
//			System.out.println("x =	" + x);
//			System.out.println(isFactor(0,x));
//			System.out.println( isEven(11) );
//		  System.out.println( allSmallDigits(233)	);
		 System.out.println(	isReverse("hellop","olleh") );
	}

	//	returns a random integer between	1 and	100
	public static int	random()	{
		Random randGen	= new	Random();
		//int	r = randGen.nextInt(3) + 1;		//	generates a	number 1-3
		//int	r = randGen.nextInt(11)	+ 20;		//	generates a	number 20-30
		//randGen.nextInt(high-low+1)	+ low;
		return randGen.nextInt(100) +	1;
	}

	//	returns true if x	is	a factor	of	y
	public static boolean isFactor(int x, int	y)	{
		return x	!=	0 && y %	x == 0;
//			if(y % x	==	0)	{
//				return true;
//			}
//			else {
//				return false;
//			}
	}

	//	returns true is num is even, false if it's odd
	//	e.g. isEven(10) --> true
	//	e.g. isEven(-1) --> false
	public static boolean isEven(int	num) {
		return num % 2	==	0;
	}

	//	returns true if all digits	are smaller	than 5
	//	e.g. allSmallDigits(1233) -->	true
	//	e.g. allSmallDigits(99)	--> false
	//	e.g. allSmallDigits(1190) -->	false
	public static boolean allSmallDigits(int x) {
		while(x > 0) {
			int last	= x %	10;
			if(last > 4) {
				return false;
			}
			x /= 10;
		}
		//POINT I'M	ASKING ABOUT: What is true	when we get	here?
		//A: no number	is	greater than 4; all digits	have been processed
		return true;
	}

	//	returns true if the strings are reverse of each	other
	//	e.g. isReverse("hello","olleh") -->	true
	//	e.g. isReverse("time","fine")	--> false
	public static boolean isReverse(String	s1, String s2)	{
		if(s1.length()	!=	s2.length()) {
			return false;
		}

		for(int i =	0;	i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(s2.length()-1-i)) {
				return false;
			}
		}
		//THIS POINT
		return true;
	}
}
```
