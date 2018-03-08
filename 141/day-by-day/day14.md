## Day 14/20

+ Lecture
  - pass by value vs pass by reference
    - swap with primitives
    - swap with an array
    - show arrays are references to each other
  - array mystery (mystery)
    - Show debugger on an array
    - Three Common Mistakes:
      - Array contents are dynamic not static
      - Checking/Understanding bounds on arrays
        - arr[i+1] means i < arr.length-1
        - arr[i-1] means int i = 1
      - Confusing i with arr[i]
  - parallel arrays
  - letterFrequency problem
    - s.charAt(i)-'a'
    - asciitable.com
    - Character.isLetter()
+ Learning Practice
  - Self-Check
    - Self-Check 7.17 - 7.26
  - Exercises
    - Exercise 7.4
    - Exercise 7.9 and 7.10
    - Exercise 7.13 and 7.15
  - Challenge
    - Exercise 7.14

# Programs for Class
```java
import java.util.*;

public class Day14MoreArrays {
   public static void main(String[] args) {
      int a = -64;
      int b = 42;
      System.out.printf("a = %d, b = %d \n", a, b);
      swap(a,b);
      System.out.printf("a = %d, b = %d \n\n", a, b);

//       int[] numbers = {1,-20,3,-4,10,7,3};
//       swap(numbers[0],numbers[1]);
//       System.out.println(Arrays.toString(numbers));

//       swap(numbers,0,1);
//       System.out.println(Arrays.toString(numbers));

//       arrayMystery(numbers);
//       System.out.println(Arrays.toString(numbers));

//       String[] words = {"hello","hi","hola","jambo"};
//       rotateLeft(words);
//       System.out.println(Arrays.toString(words));

//       int[] times = {2,3,1,2};
//       repeatTimes(words,times);
//       System.out.println(Arrays.toString(words));     

//       double[] stuff = {0.3, 0.4, 0.125};
//       reverse(stuff);
//       System.out.println(Arrays.toString(stuff));

//       letterFrequency("abcdefgaaa");
//       letterFrequency(" AB##xzZ45");
   }

   // this method will swap the values of x and y
   // in this method ONLY bc primitive types are passed by value
   public static void swap(int x, int y) {
      x = y;
      y = x;
      System.out.printf("x = %d, y = %d \n", x, y);
   }

   // this method will swap the values of arr[index1] and arr[index2]
   // permanently because arrays are passed by reference
   public static void swap(int[] arr, int index1, int index2) {
   }

   // trace through this, what is the result at the end?
   public static void arrayMystery(int[] a) {
      for (int i = 1; i < a.length - 1; i++) {
         if (a[i] > a[i + 1]) {
            a[i] = a[i + 1] + a[i - 1];
         }
         if(a[i] < 0) {
            a[i] *= 2;
         }
      }
   }

   // this method should rotate all values in an array left by one
   // the first value should rotate to the end of the array
   // {"a","b","c"}
   // should become
   // {"b","c","a"}
   public static void rotateLeft(String[] a) {
   }

   // this method should alter each element in the words array
   // to repeat the number of times that appears in the times array
   // if we pass {"a","b"},{2,4}
   // ==> words should become {"aa","bbbb"}
   public static void repeatTimes(String[] words, int[] times) {
   }

   // should reverse an array of double
   // {0.3, 0.4, 0.125} ==> {0.125, 0.4, 0.3}
   public static void reverse(double[] arr) {
   }

   // this method should count the frequency of each letter in phrase
   // output should be:
   // a occurs 4 times
   // b occurs 1 times ...
   public static void letterFrequency(String phrase) {
   }
}
```

# Solutions
```java
import java.util.*;

public class Day14MoreArrays {
   public static void main(String[] args) {
//       int a = -64;
//       int b = 42;
//       System.out.printf("a = %d, b = %d \n", a, b);
//       swap(a,b);
//       System.out.printf("a = %d, b = %d \n\n", a, b);

      int[] numbers = {1,-20,3,-4,10,7,3};
//       swap(numbers[0],numbers[1]);
//       System.out.println(Arrays.toString(numbers));

//       swap(numbers,0,1);
//       System.out.println(Arrays.toString(numbers));

//       arrayMystery(numbers);
//       System.out.println(Arrays.toString(numbers));

      String[] words = {"hello","hi","hola","jambo"};
//       rotateLeft(words);
//       System.out.println(Arrays.toString(words));

//       int[] times = {2,3,1,2};
//       repeatTimes(words,times);
//       System.out.println(Arrays.toString(words));     

//       double[] stuff = {0.3, 0.4, 0.125};
//       reverse(stuff);
//       System.out.println(Arrays.toString(stuff));

      letterFrequency("abzcdefgaaa");
      letterFrequency(" AB##xzZ!!45");
   }

   // this method will swap the values of x and y
   // in this method ONLY bc primitive types are passed by value
   public static void swap(int x, int y) {
      System.out.printf("x = %d, y = %d \n", x, y);
      int temp = x;
      x = y;
      y = temp;
      System.out.printf("x = %d, y = %d \n", x, y);
   }

   // this method will swap the values of arr[index1] and arr[index2]
   // permanently because arrays are passed by reference
   public static void swap(int[] arr, int index1, int index2) {
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
   }

   // trace through this, what is the result at the end?
   public static void arrayMystery(int[] a) {
      for (int i = 1; i < a.length - 1; i++) {
         if (a[i] > a[i + 1]) {
            a[i] = a[i + 1] + a[i - 1];
         }
         if(a[i] < 0) {
            a[i] *= 2;
         }
      }
   }

   // this method should rotate all values in an array left by one
   // the first value should rotate to the end of the array
   // {"a","b","c"}
   // should become
   // {"b","c","a"}
   public static void rotateLeft(String[] a) {
      String temp = a[0];
      for(int i = 0; i < a.length - 1; i++) {
         a[i] = a[i+1];
      }
      a[a.length-1] = temp;
   }

   // this method should alter each element in the words array
   // to repeat the number of times that appears in the times array
   // if we pass {"a","b"},{2,4}
   // ==> words should become {"aa","bbbb"}
   public static void repeatTimes(String[] words, int[] times) {
      for(int i = 0; i < words.length; i++) {
         String result = "";
         for(int j = 0; j < times[i]; j++) {
            result += words[i];
         }
         words[i] = result;
      }
   }

   // should reverse an array of double
   // {0.3, 0.4, 0.125} ==> {0.125, 0.4, 0.3}
   public static void reverse(double[] arr) {
   }

   // this method should count the frequency of each letter in phrase
   // output should be:
   // a occurs 4 times
   // b occurs 1 times ...
   public static void letterFrequency(String phrase) {
      phrase = phrase.toLowerCase();
      //counters[0] (count of As), counters[1] (counts of Bs)
      int[] counters = new int[26]; //0-25
      for(int i = 0; i < phrase.length(); i++) {
         //phrase.charAt(i)
         if(Character.isLetter(phrase.charAt(i))) {
            counters[phrase.charAt(i)-'a']++;
         }
      }
      //System.out.println(Arrays.toString(counters));
      for(int i = 0; i < counters.length; i++) {
         System.out.println((char)(i+97) + " occurs " + counters[i] + " times");
      }
   }
}
```
