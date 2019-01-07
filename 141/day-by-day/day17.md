## Day 17/20

+ Review Activity
  - Define an Employee class
    - students do this in partners
    - talk about ```this()``` in a constructor
    - review ```this.name```
    - review public vs private (helper method - ```printInfo()```)
  - class variable for ```nextID```
+ Lecture
  - Subclasses
    - ```public class Boss extends Employee```
      - show ```Boss b = new Boss()``` in main
      - Behavior described in file
      - ```super```
        - used in a constructor
        - used to call a super class's methods
        - no such thing as super.super
    - More Boss Behavior
      - ```promote(Employee)```
        - increasing the Employee's pay by 10%
        - increasing the Employee's vacation days by 2
    - simulation
      - show for-each loop
      - show in debug mode
      - the Employees in the array are only referenced as staff[0] etc
  - Vocabulary
    - class hierarchy
    - superclass, subclass
    - Polymorphism / is-a
      - Boss b object is passed to printInfo which takes an Employee (not a Boss)
    - Inheritance
      - gets everything that's in superclass but then also has it's own extra information
    - Overriding a method
      - both superclass and subclass have X(), which one gets called?
      - making an inheritance table
+ Learning Practice
  - Self-Check
    - All 4 Self-Check problems
  - Exercises
    - Exercise 9.1 - 9.4
  - Challenge
    - Exercises 9.9 and 9.10

## Programs for class

### Day17Inheritance.java
```java
import java.util.Random;

public class Day17Inheritance {

   public static void main(String[] args) {
      testEmployee();
      //testBoss();
      //simulation();
   }

   public static void testEmployee() {
      Employee em = new Employee();
      System.out.println("Default Employee = " + em);
      printInfo(em);

      // Employee ricco = new Employee("Ricco");
      // System.out.println("Employee ricco = " + ricco);
      // printInfo(ricco);
   }

   private static void printInfo(Employee person) {
      System.out.println("ID: " + person.getID());
      System.out.println("Name: " + person.getName());
      person.showHours();
      person.showSalary();
      person.showVacation();
      person.applyForVacation();
   }

   public static void testBoss() {
   }

   public static void simulation() {
      // Boss crystal = new Boss("Crystal");
      // Employee[] staff = new Employee[3];
      //
      // for(int i = 0; i < staff.length; i++) {
      //    staff[i] = new Employee();
      // }
      //
      // System.out.println(Arrays.toString(staff));
      //
      // Random rand = new Random();
      // int luckyDuck = rand.nextInt(staff.length);
      // crystal.promote(staff[luckyDuck]);
      //
      // System.out.println(Arrays.toString(staff));
   }
}
```

### Employee.java
```java
/*
   Implement (define) a class for an Employee at a LawFirm.

   Every employee's state should include:
      - an ID number (default 0)
      - a name (default "Employee 0")
      - a number of hours they work a week (default 40)
      - a base salary (default $40,000.00)
      - a number of vacation days (default 10)
      - a color of the form they need to complete to take vacay (default "yellow")

   You should be able to create an Employee with all deafult values OR with specific value
   passed to the constructor for name only.

   You should be able to access all fields, but only change hours worked, salary, and vacation days.

   You should be able to print an Employee object using System.out.println.
   e.g. System.out.println(new Employee()); should print an Employee in a logical way.
*/

public class Employee {

   //class variable
   private static int nextID = 0;

   //fields (collectively make up state) / instance variables
   private int ID;
   private String name;
   private int hoursWorked;
   private double salary;
   private int vacationDays;
   private String formColor;

   //constructors
   public Employee() {
      //all fields should be assigned defaults values
      ID = nextID++;
      name = "Employee " + ID;
      hoursWorked = 40;
      salary = 40000.00;
      vacationDays = 10;
      formColor = "yellow";
   }

   public Employee(String n) {
      this();
      name = n;
   }

   //accessors
   public int getID() { return ID; }
   public String getName() { return name; }
   public int getHours() { return hoursWorked; }
   public double getSalary() { return salary; }
   public int getVacationDays() { return vacationDays; }
   public String getVacationForm() { return formColor; }

   //mutators
   public void setHours(int hours) { hoursWorked = hours; }
   public void setSalary(double money) { salary = money; }
   public void setVacationDays(int days) { vacationDays = days; }

   //toString
   public String toString() {
      return name;
   }

   //other behavior
   public void showHours() {
      System.out.println("I work " + getHours() + " hours per week.");
   }

   public void showSalary() {
      System.out.println("My salary is $" + getSalary() + ".");
   }

   public void showVacation() {
      System.out.println("I receive " + (getVacationDays()/5) + " weeks vacation.");
   }  

   public void applyForVacation() {
      System.out.println("Use the " + getVacationForm() + " vacation form.");
   }
}
```

### Boss.java
```java
/*
   Create a Boss Employee who is a specialized version of an
   Employee who:

      - works double the regular Employee
      - makes four times a regular Employee
      - gets 0 vacation
      - vacation form is ""
      - applying for vacation prints "The big boss gets no vacay!"

   A boss can also promote an Employee:
      - increasing the Employee's pay by 10%
      - increasing the Employee's vacation days by 2
*/

public class Boss extends Employee {

   public Boss() {
      super("Boss");
   }

   public Boss(String n) {
      super("BOSS " + n);
   }

   public int getHours() {
      return super.getHours() * 2;
   }

   public double getSalary() {
      return super.getSalary() * 4;
   }

   public int getVacationDays() {
      return 0;
   }

   public String getVacationForm() {
      return "";
   }

   public void applyForVacation() {
      System.out.println("The big boss gets no vacay!");
   }

   public void promote(Employee e) {
      e.setSalary(e.getSalary() * 1.1);
      e.setVacationDays(e.getVacationDays() + 2);
   }
}
```
## Solutions

### Day17Inheritance.java
```java
import java.util.*;

public class Day17Inheritance {

   public static void main(String[] args) {
      //testEmployee();
      //testBoss();
      simulation();
   }

   public static void testEmployee() {
      Employee em = new Employee();
      System.out.println("Default Employee = " + em);
      printInfo(em);

      Employee ricco = new Employee("Ricco");
      System.out.println("Employee ricco = " + ricco);
      printInfo(ricco);

      Employee em2 = new Employee();
      System.out.println("Default Employee = " + em2);
      printInfo(em2);
   }

   private static void printInfo(Employee person) {
      System.out.println("ID: " + person.getID());
      System.out.println("Name: " + person.getName());
      person.showHours();
      person.showSalary();
      person.showVacation();
      person.applyForVacation();
   }

   public static void testBoss() {   
      Boss b = new Boss();
      printInfo(b);
   }

   public static void simulation() {
      Boss crystal = new Boss("Crystal");
      Employee[] staff = new Employee[3];

      for(int i = 0; i < staff.length; i++) {
        staff[i] = new Employee();
      }

      System.out.println(Arrays.toString(staff));

      Random rand = new Random();
      int luckyDuck = rand.nextInt(staff.length);
      crystal.promote(staff[luckyDuck]);

      //System.out.println(Arrays.toString(staff));
      for(Employee e : staff) {
         printInfo(e);
      }
   }
}
```

### Employee.java
```java
/*
   Implement (define) a class for an Employee at a LawFirm.

   Every employee's state should include:
      - an ID number (default 0)
      - a name (default "Employee 0")
      - a number of hours they work a week (default 40)
      - a base salary (default $40,000.00)
      - a number of vacation days (default 10)
      - a color of the form they need to complete to take vacay (default "yellow")

   You should be able to create an Employee with all deafult values OR with specific value
   passed to the constructor for name only.

   You should be able to access all fields, but only change hours worked, salary, and vacation days.

   You should be able to print an Employee object using System.out.println.
   e.g. System.out.println(new Employee()); should print an Employee in a logical way.
*/

public class Employee {

   //class variable
   private static int nextID = 0;

   //fields (collectively make up state) / instance variables
   private int ID;
   private String name;
   private int hoursWorked;
   private double salary;
   private int vacationDays;
   private String formColor;

   //constructors
   public Employee() {
      //all fields should be assigned defaults values
      ID = nextID++;
      name = "Employee " + ID;
      hoursWorked = 40;
      salary = 40000.00;
      vacationDays = 10;
      formColor = "yellow";
   }

   public Employee(String n) {
      this();
      name = n;
   }

   //accessors
   public int getID() { return ID; }
   public String getName() { return name; }
   public int getHours() { return hoursWorked; }
   public double getSalary() { return salary; }
   public int getVacationDays() { return vacationDays; }
   public String getVacationForm() { return formColor; }

   //mutators
   public void setHours(int hours) { hoursWorked = hours; }
   public void setSalary(double money) { salary = money; }
   public void setVacationDays(int days) { vacationDays = days; }

   //toString
   public String toString() {
      return name;
   }

   //other behavior
   public void showHours() {
      System.out.println("I work " + getHours() + " hours per week.");
   }

   public void showSalary() {
      System.out.println("My salary is $" + getSalary() + ".");
   }

   public void showVacation() {
      System.out.println("I receive " + (getVacationDays()/5) + " weeks vacation.");
   }  

   public void applyForVacation() {
      System.out.println("Use the " + getVacationForm() + " vacation form.");
   }
}
```

### Boss.java
```java
/*
   Create a Boss Employee who is a specialized version of an
   Employee who:

      - works double the regular Employee
      - makes four times a regular Employee
      - gets 0 vacation
      - vacation form is ""
      - applying for vacation prints "The big boss gets no vacay!"

   A boss can also promote an Employee:
      - increasing the Employee's pay by 10%
      - increasing the Employee's vacation days by 2
*/

public class Boss extends Employee {

   public Boss() {
      super("Boss");
   }

   public Boss(String n) {
      super("BOSS " + n);
   }

   public int getHours() {
      return super.getHours() * 2;
   }

   public double getSalary() {
      return super.getSalary() * 4;
   }

   public int getVacationDays() {
      return 0;
   }

   public String getVacationForm() {
      return "";
   }

   public void applyForVacation() {
      System.out.println("The big boss gets no vacay!");
   }

   public void promote(Employee e) {
      e.setSalary(e.getSalary() * 1.1);
      e.setVacationDays(e.getVacationDays() + 2);
   }
}
```
