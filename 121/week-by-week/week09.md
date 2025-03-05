# Week 9

- Warmup: Lists
  - Making a list
  - Adding to a list
  - Accessing an element in a list
  - Strings vs Lists
- Code-along: Movie Theater

## Starter Files

### Theater.py
```py
def get_movies():
  return ["Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"]

def show_listing(showings, tix):
  return 1

def buy_ticket(movie, tix):
  tix[movie] -= 1
```

### Main.py
```py
from theater import *

#====main====
movies = get_movies()
tickets = [2, 2, 2, 2, 2]

selection = show_listing(movies, tickets)
buy_ticket(selection, tickets)
```

## Code-along Movie Theater Solution

### Theater.py
```py
def get_movies():
  return ["Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"]

def show_listing(showings, tix):
  print("\nHere are the movie showings:\n")
  
  for i in range(len(showings)):
    if tix[i] > 0:
      print(f"\t{i+1} - {showings[i]} has {tix[i]} tickets")
    else:
      print(f"\t{i+1} - {showings[i]} ** SOLD OUT **")

  print()
  choice = int(input("What do you want to see? > "))
  return choice - 1

def buy_ticket(movie, tix):
  if tix[movie] > 0:
    tix[movie] -= 1
  else:
    print("That movie is sold out. Choose again.")
```

### Main.py
```py
from theater import *

#====main====
movies = get_movies()
tickets = [0, 2, 0, 1, 0]

while max(tickets) > 0:
  selection = show_listing(movies, tickets)
  buy_ticket(selection, tickets)

print("\nTHE THEATER IS SOLD OUT!!")
```
