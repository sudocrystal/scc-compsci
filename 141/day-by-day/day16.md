# Day 16/20

+ HW Reflection
+ Lecture - Part 1
  - Go over the parts of creating a class
  - Pet.java
    - name, species, primary and secondary breed
    - fields, constructor, toString, accessors, mutators
  - PetTester.java
    - ```Pet p```
    - ```Pet[] pets```
+ Lecture - Part 2
  - What is a CSV file?
  - How does loadInput work?
    - ```split(",")```
    - ```Integer.parseInt()```
    - ```new PetLicense```
    - ```data[i++]``` / post-fix notation
  - What's in PetLicense.java
    - Write these:
      - ```getName```
      - ```toString```
      - ```getZip, setZip```
  - Day16MoreOOP.java
    - Write ```findByName```
      - ```contains```
      - ```NullPointerException``` in the array
+ Partnered Exercise
  - Do something else interesting with the program!
+ Learning Practice
  - Self-Check
    - Self-Check 8.7
    - Self-Check 8.11
    - Self-Check 8.15
    - Self-Check 8.19 and 8.20
    - Self-Check 8.26 and 8.27
  - Exercises
    - Exercise 8.7 - 8.9

## Programs for class

[Ch8bMoreOOP.java](https://github.com/sudocrystal/CS141-InteractiveLectures/tree/main/Ch8b)

## Solutions

### Pet.java

```java
public class Pet {
   // fields
   private String name;
   private String species;
   private String breed;
   private PetLicense license;

   // constructor(s)
   public Pet() {
      this("unnamed", "unknown", "unknown");
   }
   
   public Pet(String name, String species, String breed) {
      this.name = name;
      this.species = species;
      this.breed = breed;
   }
   
   public Pet(String name, String species, String breed, String issueDate, int licenseNumber, int zipCode) {
      this(name, species, breed);
      license = new PetLicense(issueDate, licenseNumber, zipCode);
   }

   // accessors
   public String getName() { return this.name; }
   public String getSpecies() { return this.species; }
   public String getBreed() { return this.breed; }
   public String getLicense() { return this.license.toString(); }

   // mutators
   public void setName(String name) { this.name = name; }

   // toString
   public String toString() {
      return this.name + " (" + this.species + ") " + this.getLicense();
   }
}
```

### PetTester.java

```java
import java.util.*;

public class PetTester {
   public static void main(String[] args) { 
      Pet p = new Pet("Red", "Bird", "Parrot");
      System.out.println("AT CREATION = " + p);
      System.out.println("Change name");
      p.setName("Fire");
      System.out.println("Access name only = " + p.getName());
      
      System.out.println("AFTER CHANGES = " + p);
      
      Pet[] pets = new Pet[3];
      for(int i = 0; i < pets.length; i++) {
         pets[i] = new Pet();
      }
      pets[0] = new Pet("Rover", "Fish", "Puffer");
      pets[1] = new Pet("Fred", "Frog", "Bullfrog");
      pets[2] = new Pet("Daisy", "Duck", "Mallard");
      
      System.out.println(Arrays.toString(pets));
      
      for(Pet animal : pets) {
         System.out.println(animal);
      }
   }
}
```

### PetLicense.java
This file is not altered during lesson.
```java
public class PetLicense {
   // fields
   private String issueDate;
   private int licenseNumber;
   private int zipCode;
   
   // constructor(s)
   public PetLicense(String date, int num, int zip) {
      this.issueDate = date;
      this.licenseNumber = num;
      this.zipCode = zip;
   }
   
   // accessors
   public String getIssueDate() { return this.issueDate; }
   public int getLicenseNumber() { return this.licenseNumber; }
   public int getZipCode() { return this.zipCode; }
   
   // mutators
   public void setZipCode(int zip) { this.zipCode = zip; }
   
   // toString
   public String toString() {
      return "" + licenseNumber;
   }
}
```

### Ch8bMoreOOP.java

```java
/*
  This program uses real data from data.gov to populate a "database"
  of information about the regitered Pets in Seattle!

  Original Data here:
  https://catalog.data.gov/dataset/seattle-pet-licenses
*/

import java.util.*;
import java.io.*;

public class Ch8bMoreOOP {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("Seattle_Pet_Licenses.csv"));
      Pet[] petDB = loadInput(input);
      System.out.println(Arrays.toString(petDB));
      System.out.printf("%d (out of %d) null entries found.\n\n", countNull(petDB), petDB.length);

      String lookupName = "Love";
      int count = findByName(petDB, lookupName.toLowerCase());
      System.out.printf("%s was found %d times in the database.", lookupName, count);
   }

   public static int findByName(Pet[] db, String name) {
      int count = 0;
      for(int i = 0; i < db.length; i++) {
         if(db[i] != null && db[i].getName().toLowerCase().contains(name)) {
            count++;
            System.out.println(db[i]);
         }
      }
      return count;
   }
   
   public static int countNull(Pet[] db) {
      int count = 0;
      for(Pet p : db) {
         if(p == null) {
            count++;
         }
      }
      return count;
   }

   // This methods loads all the data from Seattle_Pet_licenses.csv
   // All dirty data is dumped rather than cleaned
   public static Pet[] loadInput(Scanner in) {
      String header = in.nextLine(); // dump header -- not used
      Pet[] data = new Pet[66100];
      int i = 0;

      while(in.hasNextLine()) {
         // get one row of input from the data file
         String row = in.nextLine();

         // use String.split() to separate out the data by commas
         String[] rowData = row.split(",");

         // make sure that the data is "clean" for processing
         if(rowData.length == 7 && rowData[6].length() == 5
            && !rowData[6].replace(" ","").equals("") && !Character.isLetter(rowData[1].charAt(0))) {
            //System.out.println(Arrays.toString(rowData));

            // turn the ID and zip from string to int
            int license = Integer.parseInt(rowData[1]);
            int zip = Integer.parseInt(rowData[6]);

            // create a new PetLicense object with all the data provided
            // name, species, primaryBreed, issueDate, licenseNumber, zipCode
            data[i++] = new Pet(rowData[2], rowData[3], rowData[4], rowData[0], license, zip);
         }
         else {
            //System.out.println("bad data field(s): " + Arrays.toString(rowData));
         }
      }
      return data;
   }
}
```
