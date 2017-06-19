Python Notes
---------------------------------------------------
 
COMMENTS
"""block comment"""
# single line comment
 
OPERATIONS
10 ** 2 = power
not, and, or
 
ARRAYS
"cat"[1]
"string"[1:4]  #slice from 1-4
 
DATE TIME
from datetime import datetime
now = datetime.now()
now.year (month, day, hour, minute, second)
 
PRINTING
print "%s-%s-%s" % (now.year, now.month, now.day)
print "%d" % list
print char, #, denotes continue on same line with next print
 
STRINGS
== for Strings
"Cat".lower() (upper)
str(3.14)
len("string")
"cat".isalpha()
 
IF
if / elif
 
METHODS
def name(param):
can return different types
*args
 
MATH
import math
math.sqrt(30) # max, min, abs
from math import sqrt
from math import *
dir(math)
 
LISTS 
list = ["a","b","c"]
len(list)
list[0]
.append()
.sort()
.remove(element) 
del(list[index]) #doesn't return element
.pop(index) #returns element
list[1:2] #return only ["a"]
list[:3] #can leave beginning or end empty, end is exclusive
list[::2] #strides revery other element, can be negative going backwards
list.insert(index,element) #adds element at index, shifting the rest
 
QUICK LISTS
evens_to_50 = [i for i in range(51) if i % 2 == 0]
print evens_to_50
 
LOOPS
for number in list:
    print number
for i in range(0, len(n)):
 
DICTIONARIES (MAPS)
residents = {'Puffin' : 104, 'Sloth' : 105, 'Burmese Python' : 106}
del dic['key']
.items() #prints pairings
.keys()
.values()
 
RANGE
range(3) #[0,1,2]
range(1,3) #[1,2]
range(1,5,2) #[1,3]
 
WHILE ELSE
while x < 3:
    something
else:
    something else
#while loops can have an else:
 
FOR ELSE
#the else statement is executed after the for, but only if the for ends normally
 
RANDOM
random.randint(1,6) #1-6 (inclusive)
from random import randint
 
ZIP
list_a = [3, 9, 17, 15, 19]
list_b = [2, 4, 8, 10, 30, 40, 50, 60, 70, 80, 90]
for a, b in zip(list_a, list_b):
 
LAMBDA
my_list = range(16)
print filter(lambda x: x % 3 == 0, my_list)
 
BINARY
0b10 #numbers in binary start with 0b
bin(10)
oct(10)
hex(10)
int("0b100",2) #converts string to base 2
<< and >> #floor dividing and multiplying by 2 
& AND #returns both bits on?
| or
^ XOR
~ NOT #adding one to the number and then making it negative.
bin(0b111 ^ 0b101)
 
CLASSES
class Animal(object):
__init__(self):
self
 
SUPER
return super(Derived,self).calculate_wage(hours)
 
TOSTRING Equivalent
def __repr__(self):
        
    return "(%d, %d, %d)" % (self.x, self.y, self.z)
 
FILES
f = open("output.txt", "w") #r+ allows read and write
f.write(str(item) + "\n")
f.close()
print my_file.read()
with open("text.txt", "w") as textfile:
        textfile.write("Success!")
 
PRINTING
def print_board(board):
    
    for row in board:
        
        print " ".join(row)
 
int(raw_input("?? "))
guess_row not in range(5)
 
 

