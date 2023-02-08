# Week 3

+ Review
  - Why do we use functions?
  - Can we define a function without calling it?
  - Can we call a function without defining it?
  - Vocabulary: control flow, function definition, function call
+ Warm up
  - Predicting the result Functions cont. with partner
  - Discussion post
+ Begin HW: Nursery Rhymes (part 1)


## Solutions for class

```python
import math

def approx_total(num1, num2, num3):
  #code to add params and store in new var
  total = num1 + num2 + num3
  #code to round result to whole number
  total = round(total)
  #code to print the statement
  print("The approximate total of", num1, ",", num2, ", and", num3, "is", total)

# main
#approx_total(3.1, 5.205, 2.9)
val1 = int(input("Value 1 > "))
val2 = int(input("Value 2 > "))
val3 = int(input("Value 3 > "))
approx_total(val1, val2, val3)
```
