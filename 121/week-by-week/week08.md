# Week 8

- Advice for Registration for CS courses
  - Gap ok between CS 121 and 141
  - ...and more
- Review Coding Bat: Strings
  - [count_hi]("CodingBat Python String-2 count_hi.pdf")
    ```python
    def count_hi(s):
      return s.count("hi")
    ```
    or
    ```python
    def count_hi(s):
      count = 0
      for i in range(len(s)-1):
      if s[i:i+2] == 'hi':
        count = count + 1
      return count
    ```
- Pair 2: Account Generator
