public class Institut{

   private String Nama;
   private String Alamat;

   public Institut(String Nama, String Alamat){

     this.Nama = Nama;
     this.Alamat =Alamat;

   }

   public String getInstituteName(){
       return this.Nama;
   }

   public String getInstituteAddress(){
       return this.Alamat;
   }

   public void display(){
    System.out.println("Nama Insitut: "+ this.Nama);
    System.out.println("Alamat: "+this.getInstituteAddress());
    
   
}

}