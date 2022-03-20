

public class Fakultas{

private String Nama;
private Adm_Pers Dekan;
private Institut Institut;


public Fakultas(String Nama, Adm_Pers Dekan, Institut Institut){

    this.Nama = Nama;
    this.Dekan = Dekan;
    this.Institut = Institut;
}

public String getNama(){
    return this.Nama;
}

public void display(){
        System.out.println("Nama Fakultas: "+ this.Nama);
        System.out.println("Nama: "+ this.Dekan.getNama());
        System.out.println("Institut: "+this.Institut.getInstituteName());
        
       
}

}