```
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

RANDOM
import random
random.randint(1,6)   #1-6 (inclusive)
random.randrange(4)   #0-3 (exclusive)

LISTS
list = ["a","b","c"]
len(list)
list[0]
list[1:2]     #return only ["a"]
list[:3]      #can leave beginning or end empty, end is exclusive
list[::2]     #strides revery other element, can be negative going backwards
.append()
.sort()
.remove(element)
del(list[index]) #doesn't return element
.pop(index)   #returns element
list.insert(index,element)    #adds element at index, shifting the rest

QUICK LISTS
evens_to_50 = [i for i in range(51) if i % 2 == 0]
print evens_to_50

RANGE
range(3) #[0,1,2]
range(1,3) #[1,2]
range(1,5,2) #[1,3]

LOOPS
for number in list:
    print number
for i in range(len(n)):
    print n[i]

# ================ EXTRA STUFF =================

WHILE ELSE
while x < 3:
    something
else:
    something else
# while loops can have an else:

FOR ELSE
# the else statement is executed after the for, but only if the for ends normally

ZIP
list_a = [3, 9, 17, 15, 19]
list_b = [2, 4, 8, 10, 30, 40, 50, 60, 70, 80, 90]
for a, b in zip(list_a, list_b):

CLASSES
class Animal(object):
  __init__(self):
    self.x = 10

FILES
f = open("output.txt", "w")     #r+ allows read and write
f.write(str(item) + "\n")
f.close()
print my_file.read()
with open("text.txt", "w") as textfile:
        textfile.write("Success!")

```
