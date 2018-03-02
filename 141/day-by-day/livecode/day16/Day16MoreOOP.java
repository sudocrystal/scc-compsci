/*
  This program uses real data from data.gov to populate a "database"
  of information about the regitered Pets in Seattle!

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
         String row = in.nextLine();
         String[] rowData = row.split(",");
         if(rowData.length == 7 && rowData[6].length() == 5
            && !rowData[6].replace(" ","").equals("") && !Character.isLetter(rowData[1].charAt(0))) {
            //System.out.println(Arrays.toString(rowData));
            int license = Integer.parseInt(rowData[1]);
            int zip = Integer.parseInt(rowData[6]);
            data[i++] = new PetLicense(rowData[0],license,rowData[2],rowData[3],rowData[4],rowData[5],zip);
         }
         else {
            //System.out.println("bad data field(s): " + Arrays.toString(rowData));
         }
      }
      return data;
   }
}
