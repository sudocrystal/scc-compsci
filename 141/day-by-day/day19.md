# Day 19/20

+ With a partner do PracticeIt -> CS1 -> Exams -> Finals -> Final 9
  - arrayMystery
  - referenceMystery
  - inheritanceMystery
+ Grocery List Partner Program

## Solutions

### Text Files
```
yogurt      apples
pears  cookies
milk
chocolate
```

```
yogurt 5
apples 10
pears 6
cookies 300
milk 2
```

### Procedural Approach
```java
import java.util.*;
import java.io.*;

public class GroceryListProcedural {
   
   public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(new File("food.txt"));
      Scanner console = new Scanner(System.in);
      
      ArrayList<String> gList = loadInput(in);
      
      int choice;
      do {
         printList(gList);
         choice = listChoices(console);
         if(choice == 1)       { search(gList, console); }
         else if (choice == 2) { add(gList, console); }
         else if (choice == 3) { remove(gList, console); }
         else if (choice == 4) { modify(gList, console); }
         else if (choice == 5) { count(gList); }
      } while(choice != 6);
      
      writeFile(gList);
   }
   
   public static ArrayList<String> loadInput(Scanner in) {
      ArrayList<String> list = new ArrayList<String>();
      //token based reading in loop
      while(in.hasNext()) {
         String name = in.next();
         list.add(name);
      }
      return list;
   }
   
   public static void printList(ArrayList<String> list) {
      System.out.println("\n========================");
      System.out.println("Contents of your list: ");
      for(String item : list) {
         System.out.println("- " + item);
      }
      System.out.println("========================");
   }
   
   public static int listChoices(Scanner in) {
      System.out.println("1. Search");
      System.out.println("2. Add");
      System.out.println("3. Remove");
      System.out.println("4. Modify");
      System.out.println("5. Item count");
      System.out.println("6. Quit");
      System.out.print("\nWhat would you like to do? > ");
      return in.nextInt();
   }
   
   public static void search(ArrayList<String> list, Scanner in) {
      System.out.print("What do you want to SEARCH for? > ");
      String lookfor = in.next();
      
      if(list.contains(lookfor)) {
         System.out.println(lookfor.toUpperCase() + " is on the list");
      }
      else {
         System.out.println("Your item is not in the list.");
      }
   }
   
   public static void add(ArrayList<String> list, Scanner in) {
      System.out.print("What would you like to ADD to the list? > ");
      String name = in.next();
      list.add(name);
      System.out.println(name + " has been added to your list.");
   }
   
   public static void remove(ArrayList<String> list, Scanner in) {
      System.out.print("What would you like to REMOVE from the list? > ");
      String name = in.next();
      
      for(int i = 0; i < list.size(); i++) {
         if(list.get(i).equals(name)) {
            System.out.println("Removing " + name.toUpperCase());
            list.remove(i);
            i--; // this is here so that if the item is in there twice
                 // then we would remove it twice; and not skip next
                 // element to look for it bc of reindexing
         }
      }
   }
   
   public static void modify(ArrayList<String> list, Scanner in) {
      System.out.print("What would you like to MODIFY on the list? > ");
      String name = in.next();
      
      if(!list.contains(name)) {
         System.out.println("The item was not on the list");
      }
      else {
         int index = list.indexOf(name);
         System.out.print("What would you like to change the name to? > ");
         String newName = in.next();
         list.set(index, newName);
      }
   }
   
   public static void writeFile(ArrayList<String> list) throws FileNotFoundException {
      PrintStream out = new PrintStream(new File("food.txt"));
      for(String item : list) {
         out.println(item);
      }
   }
   
   public static void count(ArrayList<String> list) {
      System.out.println("There are " + list.size() + " items.");
   }
}
```

### Object-oriented Approach
```java
import java.util.*;
import java.io.*;

public class GroceryListOOP {
   
   public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(new File("list.txt"));
      Scanner console = new Scanner(System.in);
      
      ArrayList<Item> gList = loadInput(in);
      
      int choice;
      do {
         printList(gList);
         choice = listChoices(console);
         if(choice == 1)       { search(gList, console); }
         else if (choice == 2) { add(gList, console); }
         else if (choice == 3) { remove(gList, console); }
         else if (choice == 4) { modify(gList, console); }
         else if (choice == 5) { count(gList); }
      } while(choice != 6);
      
      writeFile(gList);
   }
   
   public static ArrayList<Item> loadInput(Scanner in) {
      ArrayList<Item> list = new ArrayList<Item>();
      //token based reading in loop
      while(in.hasNext()) {
         String name = in.next();
         int quantity = in.nextInt();
         list.add(new Item(name, quantity));
      }
      return list;
   }
   
   public static void printList(ArrayList<Item> list) {
      System.out.println("\n========================");
      System.out.println("Contents of your list: ");
      for(Item i : list) {
         System.out.println("- " + i);
      }
      System.out.println("========================");
   }
   
   public static int listChoices(Scanner in) {
      System.out.println("1. Search");
      System.out.println("2. Add");
      System.out.println("3. Remove");
      System.out.println("4. Modify");
      System.out.println("5. Item count");
      System.out.println("6. Quit");
      System.out.print("\nWhat would you like to do? > ");
      return in.nextInt();
   }
   
   public static void search(ArrayList<Item> list, Scanner in) {
      System.out.print("What do you want to SEARCH for? > ");
      String lookfor = in.next();
      
      boolean found = false;
      for(int i = 0; i < list.size(); i++) {
         if(list.get(i).getName().equals(lookfor)) {
            System.out.println("Your item was found in the list.");
            System.out.println(list.get(i));
            found = true;
         }
      }
      if(!found) {
         System.out.println("Your item is not in the list.");
      }
   }
   
   public static void add(ArrayList<Item> list, Scanner in) {
      System.out.print("What would you like to ADD to the list? > ");
      String name = in.next();
      System.out.print("How many? > ");
      int quantity = in.nextInt();
      list.add(new Item(name,quantity));
      System.out.println(name + " has been added to your list.");
   }
   
   public static void remove(ArrayList<Item> list, Scanner in) {
      System.out.print("What would you like to REMOVE from the list? > ");
      String name = in.next();
      
      for(int i = 0; i < list.size(); i++) {
         if(list.get(i).getName().equals(name)) {
            System.out.println("Removing " + name);
            list.remove(i);
            i--; // this is here so that if the item is in there twice
                 // then we would remove it twice; and not skip next
                 // element to look for it bc of reindexing
         }
      }
   }
   
   public static void modify(ArrayList<Item> list, Scanner in) {
      System.out.print("What would you like to MODIFY on the list? > ");
      String name = in.next();
      
      Item it = null;
      for(int i = 0; i < list.size(); i++) {
         if(list.get(i).getName().equals(name)) {
            it = list.get(i);
         }
      }
      if(it != null) {
         System.out.print("What would you like to change the name to? > ");
         String newName = in.next();
         it.setName(newName);
      }
      else {
         System.out.println("The item was not on the list");
      }
   }
   
   public static void writeFile(ArrayList<Item> list) throws FileNotFoundException {
      PrintStream out = new PrintStream(new File("list.txt"));
      for(Item it : list) {
         out.println(it.getName() + " " + it.getQuantity());
      }
   }
   
   public static void count(ArrayList<Item> list) {
      int total = 0;
      for(Item i : list) {
         total += i.getQuantity();
      }
      System.out.println("There are " + list.size() + " groups of items for a total of " + total + " individual items.");
   }
}
```

### Item.java
```java
public class Item {

   //fields
   private String name;
   private int quantity;
   
   //constructors
   public Item() {
      name = "";
      quantity = 0;
   }
   
   public Item(String n, int q) {
      name = n;
      quantity = q;
   }
   
   //accessors
   public String getName() { return name; }
   public int getQuantity() { return quantity; }
   
   //mutators
   public void setName(String n) { name = n; }
   public void setQuantity(int q) { quantity = q; }
   
   //toString
   public String toString() {
      return name + " (" + quantity + ")";
   }
}
```
