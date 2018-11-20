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
      - ```toLowerCase()``` and stringing together of dot notation
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

### Day16MoreOOP.java
```java
/*
  This program uses real data from data.gov to populate a "database"
  of information about the registered Pets in Seattle!

  Original Data here:
  https://catalog.data.gov/dataset/seattle-pet-licenses
*/

import java.util.*;
import java.io.*;

public class Day16MoreOOP {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("Seattle_Pet_Licenses.csv"));
      PetLicense[] petDB = loadInput(input);
      System.out.println(Arrays.toString(petDB));

//       String lookupName = "Love";
//       int count = findByName(petDB, lookupName);
//       System.out.printf("%s was found %d times in the database.",lookupName,count);
   }

   public static int findByName(PetLicense[] db, String name) {
      return 0;
   }

   public static PetLicense[] loadInput(Scanner in) {
      String header = in.nextLine(); //dump header
      PetLicense[] data = new PetLicense[66043];
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
           data[i++] = new PetLicense(rowData[0],license,rowData[2],rowData[3],rowData[4],rowData[5],zip);
        }
        else {
            //System.out.println("bad data field(s): " + Arrays.toString(rowData));
        }
      }  
      return data;
   }
}
```

### PetLicense.java
```java
public class PetLicense {

   //fields
   private String issueDate;
   private int licenseNumber;
   private int zipCode;
   private Pet animal;

   //constructors
   public PetLicense() {
   }

   public PetLicense(String issueDate, int licenseNumber, String name, String species, String primaryBreed, String secondaryBreed, int zipCode) {
      this.issueDate = issueDate;
      this.licenseNumber = licenseNumber;
      this.zipCode = zipCode;
      animal = new Pet(name, species, primaryBreed, secondaryBreed);
   }

   //accessors

   //mutators

   //toString
   public String toString() {
      return "" + licenseNumber;
   }
}
```

### Seattle_Pet_Licenses.csv
[Seattle_Pet_Licenses.csv](livecode/day16/Seattle_Pet_Licenses.csv)

## Solutions

### Pet.java

```java
public class Pet {

   //fields (state)
   private String name;
   private String species;
   private String primaryBreed;
   private String secondaryBreed;
   //private String eyeColor;
   //private boolean longHaired;
   //private int cuteRating;
   //private double weight;

   //constructors
   public Pet() {
//       this.name = "unnamed pet";
//       this.species = "unknown";
//       this.primaryBreed = "";
//       this.secondaryBreed = "";
      this("unnamed pet","unknown","","");
   }

   public Pet(String name, String species, String primaryBreed, String secondaryBreed) {
      this.name = name;
      this.species = species;
      this.primaryBreed = primaryBreed;
      this.secondaryBreed = secondaryBreed;
   }

   //accessors
   public String getName() { return this.name; }
   public String getSpecies() { return this.species; }
   public String getPrimaryBreed() { return this.primaryBreed; }
   public String getSecondaryBreed() { return this.secondaryBreed; }

   //mutators
   public void setName(String n) { this.name = n; }

   //toString
   public String toString() {
      return "Pet: " + this.name;
   }
}
```

### PetTester.java

```java
import java.util.*;

public class PetTester {
   public static void main(String[] args) {      
//       Pet p = new Pet();
//       Pet rover = new Pet("Rover","dog","doodle","");
//       System.out.println(p.getName());
//       System.out.println(p.getSpecies());
//       
//       if(rover.getSpecies().equals("dog")) {
//          System.out.println("Woof!");
//       }
//       
//       if(p.getName().equals("unnamed pet")) {
//          p.setName("BOB");
//       }

//       Pet[] pets = new Pet[5];
//       pets[0] = new Pet("Molly", "cat", "", "");
//       for(int i = 1; i < pets.length; i++) {
//          pets[i] = new Pet();
//       }
//       System.out.println(Arrays.toString(pets));

      PetLicense license = new PetLicense();
      System.out.println(license);
   }
}
```

### PetLicense.java

```java
public class PetLicense {
   //fields
   private String issueDate;
   private int licenseNumber;
   private int zipCode;
   private Pet animal;

   //constructors
   public PetLicense() {
      this.issueDate = "not issued";
      this.licenseNumber = -1;
      this.zipCode = 98133;
      this.animal = new Pet();
   }

   public PetLicense(String issueDate, int licenseNumber, String name, String species, String primaryBreed, String secondaryBreed, int zipCode) {
      this.issueDate = issueDate;
      this.licenseNumber = licenseNumber;
      this.zipCode = zipCode;
      this.animal = new Pet(name, species, primaryBreed, secondaryBreed);
   }

   //accessors
   public String getPetName() { return this.animal.getName(); }

   //mutators

   //toString
   public String toString() {
      return this.animal.getName() + " (" + this.licenseNumber + ")";
   }
}
```

### Day16MoreOOP.java

```java
/*
  This program uses real data from data.gov to populate a "database"
  of information about the registered Pets in Seattle!

  Original Data here:
  https://catalog.data.gov/dataset/seattle-pet-licenses
*/

import java.util.*;
import java.io.*;

public class Day16MoreOOP {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("Seattle_Pet_Licenses.csv"));
      PetLicense[] petDB = loadInput(input);
      //System.out.println(Arrays.toString(petDB));

      String lookupName = "Love";
      int count = findByName(petDB, lookupName);
      System.out.printf("%s was found %d times in the database.",lookupName,count);
   }

   public static int findByName(PetLicense[] db, String name) {
      int count = 0;
      for(int i = 0; i < db.length; i++) {
         if(db[i] != null && db[i].getPetName().toLowerCase().contains(name.toLowerCase())) {
            count++;
            System.out.println(db[i]);
         }
      }
      return count;
   }

   public static PetLicense[] loadInput(Scanner in) {
      String header = in.nextLine(); //dump header
      PetLicense[] data = new PetLicense[66043];
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
            data[i++] = new PetLicense(rowData[0],license,rowData[2],rowData[3],rowData[4],rowData[5],zip);
         }
         else {
            //System.out.println("bad data field(s): " + Arrays.toString(rowData));
         }
      }
      return data;
   }
}
```
