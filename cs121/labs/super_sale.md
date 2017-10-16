# Lab: Super Sale

## Topics
This program will focus on utilizing functions, parameters, Python's math module, and if-statements!

## Instructions
Did you know that receipts print from programs? Your task is to complete the program provided so that it will print a customer discount summary for a store that is running a super sale.

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

## Starter Code
[Fork the REPL here](https://repl.it/MgBr)

```python
import math
import random

def purchase():
  spent = 0 #TODO: generate a random number between 100 and 2000
  print("You just spent $", spent, " in the store!", sep="")
  print()
  return spent

def earned(purchase_amount):
  discount = 0
  #TODO: write if-statements that will return the appropriate percentage discount
  return discount

def loyalty(purchase_amount):
  discount = 0.0
  #TODO: write an if-statement to set the loyalty discount percentage
  return discount

def print_summary(original_total, sale_savings, loyalty_savings):
  percent = 0 #TODO: delete this line and uncomment the next once you start fixing this function
  #percent = math.floor(first_discount / original_total * 100)
  saved = original_total - sale_savings - loyalty_savings
  new_total = original_total - saved

  #TODO: Fix the formatting of the summary below to print exactly 2 decimal places for each number
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
#TODO: call the print_summary function with the appropriate arguments
```

## Instructions


## Example Output


## TOTALLY OPTIONAL Added Fun
- Explore Python's other built in methods for [String](https://docs.python.org/3.1/library/stdtypes.html?highlight=upper#string-methods) like `title`, `capitalize`, `swapcase`, and utilize them accordingly
- Ask for at least 1 number and repeat the phrase that many times
