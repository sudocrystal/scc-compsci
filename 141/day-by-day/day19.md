# Day 19/20

+ General talk about Final
  - Confirm day/time
  - Makeup options
+ Review Inheritance
  - Ask about Online Lecture - clarifications needed?
  - Instantiating Objects
    - as superclass = new superclass
    - as subclass = new subclass
    - as superclass = new subclass
  - Inheritance problems from Problem Set 9a
      - InheritanceMystery4
      - InheritanceMystery2
+ Pair 4: Grocery List

## Solutions


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
