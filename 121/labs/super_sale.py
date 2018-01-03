#TODO: import the math and random modules
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
    #percent = math.floor(sale_savings / original_total * 100)
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