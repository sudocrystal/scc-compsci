# Day 19/20

+ Introduction to ACM Graphics
  - If there's time, do an introduction to ACM Graphics
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
