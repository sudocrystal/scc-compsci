## Day 17/20

+ Review Activity
- Define an Employee class
  - students do this in partners
  - talk about this() in a constructor
  - review this.name
  - review public vs private (helper method - printInfo())
+ Lecture
  - Subclasses
    - public class Boss extends Employee
      - Behavior
        - works double the regular Employee
        - makes four times a regular Employee
        - gets 0 vacation
        - vacation form is ""
        - applying for vacation prints "The big boss gets no vacay!"
      - super
        - used in a constructor
        - used to call a super class's methods
        - no such thing as super.super
    - More Boss Behavior
      - promote(Employee)
        - increasing the Employee's pay by 10%
        - increasing the Employee's vacation days by 2
    - public class BigBoss extends Boss
      - ??
  - Instantiate
    - as superclass = new superclass
    - as subclass = new subclass
    - as superclass = new subclass
  - Inheritance
    - gets everything that's in superclass but then also has it's own extra information
  - Overriding a method
    - both superclass and subclass have X(), which one gets called?
    - making an inheritance table
