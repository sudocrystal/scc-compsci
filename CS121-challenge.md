# Code Challenge to skip CS121

**CS 121** covers the following concepts in **Python**:
  - Variables
  - Functions
  - Conditionals (if/elif/else)
  - Loops (while/for)
  - Strings
  - Lists
  - Classes and Objects
  - Debugging
  - Testing

If you believe that you have experience with the topics above and are confident in those skills, you may _request_ to bypass CS 121 by completing the challenge below.

## Instructions
1. You may complete the challenge in any language you know (preference to Python or Java) that is also supported by [repl.it](https://repl.it)
1. Your code should be written from beginning to end on [repl.it](https://repl.it/languages/), a cloud-based coding IDE.
1. You should submit your code to me by using the "share" button above the code to "Share Link" in an email to me

## Challenge Problem
Write a program that produces a report on the final GPA grades for 5 students.

Input:
  - The final GPA grades for 10 students in decimal format (e.g. 3.2)

Process the data:
  - If no student earned a 4.0, curve the highest GPA to 4.0, and curve all other grades by that amount. (e.g. Given the grades [2.8, 3.7, 2.5, 2.0, 3.6], 3.7 would be curved to 4.0 by 0.3 points. All grades would increase by this 0.3, so final grades would be [3.1, 4.0, 2.8, 2.3, 3.9])

Output (after curving, if necessary):
  - Students curved and original grade
  - Amount of the curve
  - Student with the highest GPA

## Example Output
```
GPA REPORTING SYSTEM

Please enter in 5 student grades:
Student 1 > 2.8
Student 2 > 3.7
Student 3 > 2.5
Student 4 > 2.0
Student 5 > 3.6

===== SUMMARY REPORT =====
Final Student Grades:
Student 1 - 3.1 (before curve 2.8)
Student 2 - 4 (before curve 3.7)
Student 3 - 2.8 (before curve 2.5)
Student 4 - 2.3 (before curve 2)
Student 5 - 3.9 (before curve 3.6)

The curve was 0.3 GPA points
Student 2 had the highest GPA
```

## Notes
- Do not worry about the formatting of whole numbers (e.g. GPAs of `3.0` may print as `3`)
