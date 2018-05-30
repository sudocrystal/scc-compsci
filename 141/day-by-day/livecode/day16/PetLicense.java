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
      this.animal = new Pet(name, species, primaryBreed, secondaryBreed);
   }
   
   //accessors
   
   //mutators
   
   //toString
   public String toString() {
      return "" + licenseNumber;
   }

}