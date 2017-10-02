# HW 2: Rocket Ship

## Topics
This assignment will give you practice with for loops, static methods, print/println statements and a class constant.  This assignment is worth 16 points instead of the normal 20 points.

## Instructions

### Part A: ASCII Art (2 points)

The first part of your assignment is to write a program that produces any text art (sometimes called "ASCII art") picture you like.

Write a Java class called `AsciiArt` in a file called `AsciiArt.java`. Your program can produce any text picture you like, with the following restrictions and details:
+ The picture should be your own creation, not an ASCII image you found on the Internet or elsewhere.
+ The number of lines of output should be between 3 and 200 with no more than 100 characters per line.
+ The picture should not include hateful, offensive, or otherwise inappropriate images.
+ The code should use at least one for loop or static method, but should not contain infinite loops.
+ The picture must not be identical to your solution for Part B or consist entirely of reused Part B code.
+ Your code should not use material we have not covered in class yet.

If your Part A program compiles and runs successfully and meets the above constraints, it will receive the full 2 points. Part A will not be graded on style ("internal correctness").

### Part B: Rocket Ship (14 points)

In the second part of  the assignment, you are going to generate output that looks like the following:

```
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
```

You are to exactly reproduce this output.  The various subfigures in the middle of this specific output have a height of 3.

These subfigures have the property that their height determines their width, so there is only one size variable.

This assignment will require you to create nested for-loops with print and println statements that use the class constant.  
+ **You are to use a class constant to make it possible to change a single number in one place in the program to have it produce a corresponding figure of a different size.**
+ You should continue to use static methods to structure your solution.  
+ You should try to avoid significant redundancy and you should structure your program in such a way that the methods match the structure of the output itself.  
+ You are required to properly indent your code and will lose points if you make indentation mistakes.  
+ You should localize variables whenever possible.
+ You should once again include a comment at the beginning of your class file with basic information and a description of what the program does.  
+ You should also include a comment on each individual method describing what it does.  

On any given execution your program will produce just one version of this figure, but it should be possible to change the value of the program constant to have your program produce a figure of a different size.  For example, with subfigures of height 5, the output should look like this:

```
         /**\
        //**\\
       ///**\\\
      ////**\\\\
     /////**\\\\\
    //////**\\\\\\
   ///////**\\\\\\\
  ////////**\\\\\\\\
 /////////**\\\\\\\\\
+=*=*=*=*=*=*=*=*=*=*+
|..../\......../\....|
|.../\/\....../\/\...|
|../\/\/\..../\/\/\..|
|./\/\/\/\../\/\/\/\.|
|/\/\/\/\/\/\/\/\/\/\|
|\/\/\/\/\/\/\/\/\/\/|
|.\/\/\/\/..\/\/\/\/.|
|..\/\/\/....\/\/\/..|
|...\/\/......\/\/...|
|....\/........\/....|
+=*=*=*=*=*=*=*=*=*=*+
|\/\/\/\/\/\/\/\/\/\/|
|.\/\/\/\/..\/\/\/\/.|
|..\/\/\/....\/\/\/..|
|...\/\/......\/\/...|
|....\/........\/....|
|..../\......../\....|
|.../\/\....../\/\...|
|../\/\/\..../\/\/\..|
|./\/\/\/\../\/\/\/\.|
|/\/\/\/\/\/\/\/\/\/\|
+=*=*=*=*=*=*=*=*=*=*+
         /**\
        //**\\
       ///**\\\
      ////**\\\\
     /////**\\\\\
    //////**\\\\\\
   ///////**\\\\\\\
  ////////**\\\\\\\\
 /////////**\\\\\\\\\
 ```

Turn in `AsciiArt.java` and `DrawRocket.java`  electronically through canvas.
