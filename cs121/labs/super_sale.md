# Lab: Super Sale

## Topics
This program will focus on utilizing functions, parameters, Python's math and random modules, and if-statements!

## Instructions
Did you know that receipts print from programs? Your task is to complete the program provided so that it will print a customer discount summary for a store that is running a super sale.

## Starter Code
[Fork the REPL here](https://repl.it/MgBr)

```python
import math
import random

def purchase():
  spent = 0 #TODO 1: generate a random number between 100 and 2000
  print("You just spent $", spent, " in the store!", sep="")
  print()
  return spent

def earned(purchase_amount):
  discount = 0
  #TODO 3: write if-statements that will return the appropriate percentage discount
  return discount

def loyalty(purchase_amount):
  discount = 0.0
  #TODO 5: write an if-statement to set the loyalty discount percentage
  return discount

def print_summary(original_total, sale_savings, loyalty_savings):
  percent = 0 #TODO 4: delete this line and uncomment the next
  #percent = math.floor(sale_savings / original_total * 100)
  saved = original_total - sale_savings - loyalty_savings
  new_total = original_total - saved

  #TODO 6: Fix the formatting of the summary below to print exactly 2 decimal places for each number
  print("****** CUSTOMER DISCOUNT SUMMARY ******")
  print("---------------------------------------")
  print("Total purchase amount:\t    $",original_total)
  print(percent,"% Discount:\t\t\t -$",sale_savings)
  print("Loyalty Discount:\t\t\t -$",loyalty_savings)
  print("---------------------------------------")
  print("TOTAL AFTER DISCOUNT\t\t\t  $",new_total)
  print("---------------------------------------")
  print("You Saved\t\t\t  $",saved)
  print("---------------------------------------")


#-----main------
total = purchase()
sale_discount = earned(total)
loyalty_discount = loyalty(total)
first_discount = total * sale_discount
second_discount = total * loyalty_discount
#TODO 2: call the print_summary function with the appropriate arguments
```

## Instructions
**To Start**: You should copy the starter code (or fork the provided REPL), run the program and observe the output, and then take a look through the code. You may not 100% understand the code, but taking a quick look through what's there will be helpful in the future.

You are going to systematically replace the TODO comments with code so that the program will work as intended.

1. TODO 1 is inside the `purchase()` function. You should set the variable `spent` to a random number from 100 to 2000 (inclusive) to simulate the amount spent at the store. This is **not** user input. This is a computer-generated pseudorandom number using [Python's `random` module](https://docs.python.org/3/library/random.html).
1. TODO 2 is at the very bottom of the program. Invoke the `print_summary()` function, passing the arguments `total`, `first_discount`, and `second_discount`. This will cause the summary to print to the screen, though parts of it will be incomplete at this point since we have not yet defined how the discounts are calculated. _Do not uncomment the TODO inside_
1. TODO 3 is in the `earned()` function. You need to write a series of if statements that will calculate the earned discount according to the following. **Note that this function should return a decimal number for the discount. 10% = 0.10 discount**
  - Spending less than $250 earns a discount of 5%.
  - Spending $250-499 earns a discount of 10%
  - Spending $500-999 earns a discount of 15%
  - Spending $1000 or more earns a discount of 20%
1. TODO 4 is in the `print_summary()` function. Calculating the percent of the discount doesn't work if you haven't yet calculated the discount, so I had that part commented out until you did TODO 3. When you do this TODO, you will then see the correct percent printed on the summary (if you did TODO 3 correctly).
1. TODO 5 is in the `loyalty()` function. You should calculate the loyalty discount as the square root of the total amount purchased. You will need to use Python's `math` module to make this calculation.
1. TODO 6 is in the `print_summary()` function. You should now google how to make only 2 decimal places show when printing a number to the screen. So instead of `120.0` printing, we want `120.00`, instead of something like `23.45666666667` printing, we want `23.45`. Essentially, we want all references to money to print the way we expect.

## Example Output
Here are a couple sample runs of the program:
```
You just spent $107 in the store!

****** CUSTOMER DISCOUNT SUMMARY ******
---------------------------------------
Total purchase amount:	    $ 107.00
5 % Discount:			         -$ 5.35
Loyalty Discount:			     -$ 11.07
---------------------------------------
TOTAL AFTER DISCOUNT			  $ 16.41
---------------------------------------
You Saved			              $ 90.58
---------------------------------------
```

```
You just spent $1875 in the store!

****** CUSTOMER DISCOUNT SUMMARY ******
---------------------------------------
Total purchase amount:	    $ 1875.00
20 % Discount:			       -$ 375.00
Loyalty Discount:			     -$ 811.89
---------------------------------------
TOTAL AFTER DISCOUNT			  $ 1186.89
---------------------------------------
You Saved			              $ 688.10
---------------------------------------
```

## TOTALLY OPTIONAL Added Fun
- Ask the user if they brought any coupons to the store. If they did, read in the amount of the coupon and apply this additional discount to the summary. You should create a new function for this task as well as modify the main and the print_summary function to accommodate this third discount.
