public class PetLicense {

   //fields
   private String issueDate;
   private int licenseNumber;
   private String name;
   private String species;
   private String primaryBreed;
   private String secondaryBreed;
   private int zipCode;
   
   //constructors
   public PetLicense() {
   }
   
   public PetLicense(String issueDate, int licenseNumber, String name, String species, String primaryBreed, String secondaryBreed, int zipCode) {
      this.issueDate = issueDate;
      this.licenseNumber = licenseNumber;
      this.name = name;
      this.species = species;
      this.primaryBreed = primaryBreed;
      this.secondaryBreed = secondaryBreed;
      this.zipCode = zipCode;
   }
   
   //accessors
   
   //mutators
   
   //toString
   public String toString() {
      return name;
   }

}