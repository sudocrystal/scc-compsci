# Week 9

- Warmup: Lists
  - Making a list
  - Adding to a list
  - Accessing an element in a list
  - Strings vs Lists
- Code-along: Movie Theater
  - Completed in REPL for experience of different IDE
 
## Movie Theater - Functionality To Add

1. Modify show_listings to print out the movies that are showing at this theater. Include a number in front of each option
1. In show_listings, allow the user to select one of the movies and return their choice
1. Add a loop to the main that makes it so that the program repeats infinitely asking the user to select a movie and then purchasing that ticket
1. Modify show_listings to print the total number of tickets remaining for each movie in addition to the movie name
1. Modify buy_ticket so that the user cannot purchase a ticket for a movie that is sold out
1. Modify the loop in the main so that the program ends when all tickets are sold
1. Modify the show_listings function to print out that a movie is sold out (instead of how many tickets are left) if it has not tickets


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
