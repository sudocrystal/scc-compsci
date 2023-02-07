# Day 05/10

+ Review Sudoku Solutions
  - comments to explain code
  - combining row/col/mini square checks
  - reviewing issue with only checking values in isSolved without considering keys
  - remind that sometimes I'll ask questions, where the answer might be "yeah, my solution works!"

+ Writing Recusrsive methods
  - Quick review of vocab: base case, recursive case, "the call stack"/bubbles
  - Look at provided files
    - main is at bottom
    - there are calls and the expected result as a comments

  - digitProduct
    - show examples
    - reminder of going right to left because % 10
    - What are the cases that we know right away?
      - dP(0) = 1
    - Pick a random example to parse through
      - dP(62) = 2 * dP(6)
      - dP(6) = 6 * dP(0)
    - Goal is to have the method call itself
      - dP(n) = n % 10 * dP(n / 10)
    - Account for a negative values
      - dP(n) = n % 10 * dP(Math.abs(n / 10))

  - Pattern
    - What's the base case?
      - n = 0, m = 0 is a ""
    - What's the recursive case?
      - n > 0
      - m > 0

  - commonChars
    - What's the base case?
      - usually with strings it's ""
      - assume strings are the same length?
    - What's the recursive case?
      - if first character is the same, s.charAt(0)
      - if first character is not the same, "."
      - (optional/skip) if lengths aren't the same
  - countToBy
    - counts backwards, doesn't always start at 1
    - What's the base case?
      - when first number is smaller than second
    - Recursive case?
      - take out the second number, making the first number smaller

+ REMEMBER: In recursion you've got to create a case where the problem gets smaller (and closer to the base case)
  - Seeing more problems will help
  - I think the number problems are easier, but you may feel differently

+ Queens
  - Recursive backtracking; maze, queens, Sudoku
  - Trying to place 8 queens on a board so that none of the queens seeing each other
  - Brute Force / Exhaustive / Recursive Backtracking solution
  - QueensGame.java
    - line 3 is the size of the board, make 8
    - `solve()` attempts to solve the board
    - may be other solutions, we're just looking for one way to make it work
  - QueensBoard.java
    - line 13 should say, size can't be 2 or 3 (FIX TYPO IN CODE)
    - go through methods
    - `solve()`
      - Base case: if all queens are on the board
      - r/c loops set to try to put the queens across cols first (doesn't matter tho)
      - can't use boolean zen in the inner if, because we'd need to backtrack
    - Uncomment SOP and run, end, look at the output
    - QueensGUI.java
      - extends QueensBoard
      - adds a graphical element
      - show with a board of size=4


  ## Solutions for class
  ```java
  public class WritingRecursiveMethods {

   /*
      Write a recursive method called digitProduct, that takes an
      integer n as a parameter and returns the product of all non-zero
      digits of n. If passed a negative number, the method should return
      the negative product of the digits.
   */
   // digitProduct(0) = 1
   // digitProduct(62) = 2 * digitProduct(6)
   // digitProduct(6) = 6 * digitProduct(0)
   // digitProduct(-151) = -1 * digitProduct(15)
   // digitProduct(n) = n % 10 * digitProduct(Math.abs(n / 10))
   public static int digitProduct(int n) {
      if(n == 0)
         return 1;
      else
         return n % 10 * digitProduct(Math.abs(n / 10));
   }

   /*
      Write a recursive method called pattern that takes as parameters
      an int n and an int m and that returns a string containing m dots
      surrounded by n pairs of square brackets (one pair is "[]").
   */
   // pattern(0,0) = ""
   // pattern(n, m) where n > 0, return "[" + pattern(n-1,m) + "]"
   // pattern(n, m) where m > 0, return "." + pattern(n, m-1)
   public static String pattern(int n, int m) {
      if(n == 0 && m == 0)
         return "";
      else if(n > 0)
         return "[" + pattern(n - 1, m) + "]";
      else
         return "." + pattern(n, m - 1);
   }
   /*
      Write a method commonChars that takes two strings as parameters
      and that returns a string representing the characters they have
      in common. The characters that are different between the two
      strings should be represented by a ".” in the returned string.
      You can assume the two strings passed in to the method contain
      no ".” characters.
   */
   // commonChars("","") = ""
   // comonChars(s1, s2) = compares first chars + commonChars(one less letter)
   public static String commonChars(String s1, String s2) {
      if(s1.length() == 0 && s2.length() == 0)
         return "";
  /*   else if(s1.length() == 0)
         return "." + commonChars("", s2.substring(1));
       else if(s2.length() == 0)
              return "." + commonChars(s1.substring(1), "");
  */
      else if(s1.charAt(0) != s2.charAt(0))
         return "." + commonChars(s1.substring(1), s2.substring(1));
      else
         return s1.charAt(0) + commonChars(s1.substring(1), s2.substring(1));
   }

   /*
      Write a method countToBy that takes integer parameters n and m
      and that produces output indicating how to count to n in
      increments of m.
   */
   // countToBy(n, m) if n <= m, print n
   // countToBy(n, m) otherwise = countToBy(n-m,m) + print n
   public static void countToBy(int n, int m) {
      if(n <= m) {
         System.out.print(n);
      }
      else {
         countToBy(n-m, m);
         System.out.print(", " + n);
      }
   }

   public static void main(String[] args) {
      System.out.println("digitProduct(62) = " + digitProduct(62));       // 12
      System.out.println("digitProduct(-151) = " + digitProduct(-151));   // -5
      System.out.println("digitProduct(12345) = " + digitProduct(12345)); // 120
      System.out.println();

      System.out.println("pattern(0, 1) = " + pattern(0, 1));     // "."
      System.out.println("pattern(1, 2) = " + pattern(1, 2));     // "[..]"
      System.out.println("pattern(3, 0) = " + pattern(3, 0));     // "[[[]]]"
      System.out.println("pattern(3, 2) = " + pattern(3, 2));     // "[[[..]]]"
      System.out.println();

      System.out.print("\ncommonChars(\"foo\", \"oof\") = " + commonChars("foo", "oof"));                // ".o."
      System.out.print("\ncommonChars(\"dog person\", \"cat perSon\") = " + commonChars("dog person", "cat perSon"));  // "... per.on"
      System.out.print("\ncommonChars(\"hello\", \"jello\") = " + commonChars("hello", "jello"));            // ".ello"
      System.out.println();

      System.out.print("\ncountToBy(34, 5) = ");
      countToBy(34, 5);     // 4, 9, 14, 19, 24, 29, 34
      System.out.print("\ncountToBy(3, 6) = ");
      countToBy(3, 6);      // 3
      System.out.print("\ncountToBy(17, 3) = ");
      countToBy(17, 3);     // 2, 5, 8, 11, 14, 17
      System.out.println("\n");
   }

}
  ```
