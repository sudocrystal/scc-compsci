# Day 20/20

+ Final Practice
  - Work on a Practice Final on Practice It (Exams 9 through 13)
  - Make a study sheet to record the types of things you need to remember about each type of problem

## Instructor Notes Sheet

1. Array Mystery
 - Pay attention to starting index (`0`? `1`? something else?)
 - Pay attention to ending index (`< a.length`? `< a.length -1`?)
 - What's happening with the incrementing? Counting up (`i++`)? Counting Down (`i--`)? Something else?
 - The array is dynamic!
  - Track the changes that are happening in the array!
  - Don't use old/initial values when processing.

2. Reference Mystery
 - Arrays, ArrayLists, and Objects are passed by reference. This means that they change permanently when changed in a method.
 - Primitive Data Types (int, double, char) do NOT change permanently when changed in a method (their changes only appear in the method in which they are changed)

3. Inheritance Mystery
  - When you extend a class, you inherit all the fields and methods from the class that is extended
  - To access methods in a parent class, use `super.`
  - To access methods in the class you are in, use `this.`
  - If neither `this.` nor `super.` is specified, the program will try to find the method in the original class type (not necessarily the one it's being called from). If it doesn't exist, it will move up the inheritance hierarchy the way it usually does until that method is found.

4. Token-based processing
  - THERE IS NO SUCH THING AS nextString()
  - Do not use `nextLine()`
  - Do read in individual tokens using `nextInt()`, `nextDouble()`, `next()`
  - To prevent bad reads, use `hasNext()`, `hasNextInt()`, `hasNextDouble` to make sure that it is possible to read in the expected information
  - It is good practice to read in information to a variable so that you don't accidentally read in information in an if-statement, which often causes logic errors

5. Line-based Processing
  - THERE IS NO SUCH THING AS nextString()
  - When there is a line of text to be read in (`while(in.hasNextLine())`), read in a line of text using `in.nextLine()` (save in a variable, like `String line = in.nextLine();`)
  - Then pass that information to a new Scanner Object (`Scanner lineScan = new Scanner(line);`) and use token-based reading methods on that scanner to analyze the data (`lineScan.next()`, etc)
  - It is good practice to read in information to a variable so that you don't accidentally read in information in an if-statement, which often causes logic errors

6. Array Problem
  - `a[i]` accesses a single element in the Array
  - if you are comparing two elements in an array, pay special attention to your loop bounds.
    - e.g. if doing `a[i]` compared to `a[i-1]`, you can't start `i = 0` (would cause out of bounds with a -1); instead should start `i = 1`
    - e.g. if doing `a[i]` compared to `a[i+1]`, you can't loop until `i < a.length` (would cause out of bounds with a.length); instead should loop until `i < a.length - 1`
  - if you are comparing elements in two different arrays (`a[i]` compared to `b[i]`), make sure that you don't try to access non-existent elements.
    - i.e. loop through the length of the shorter array

7. ArrayList Problem
  - `list.get(i)` accesses a single element in the ArrayList
  - ArrayLists use the notation `ArrayList<Integer>` for declaration and must contain reference data types (`String`, `Double`, `Integer`, `Boolean`, or an Object - on the exam you will only see either `ArrayList<String>` or `ArrayList<Integer>`)
  - ArrayLists auto-reindex!
    - if you remove from an ArrayList inside of a for-loop, you need to account for this
      - One way to do this is always `i--;` after `list.remove(i);` (make sure you use {}s to group these statements together
    - if you add to the end of an ArrayList while you are processing it, you want to make sure that your loop does not run `i < list.size()` because the size is constantly changing; instead save the original size of the list first and `i < size` so you don't process new elements too

8. Classes Problem
- if you are placing a method inside of a class, you have access to all the fields (state information) of that class
- to access data inside of a class, you can refer to state information as `this.day` or `getDay()`
