

public class Course{

    private String ID;
    private String Name;
    private int SKS;
    private Research LecturerName;

    public Course(String ID, String Name, Research LecturerName, int SKS){

        this.ID = ID;
        this.Name = Name;
        this.LecturerName = LecturerName;
        this.SKS = SKS;
    }

    public String getID(){
        return this.ID;
    }

    public String getCourseName(){
        return this.Name;
    }

    public int getSKS(){
        return this.SKS;
    }

    public String getLecturerName(){
        return this.LecturerName.getName();
    }
    
    public void display(){
        System.out.println("ID: "+ this.getID());
        System.out.println("Nama Course: "+ this.getCourseName());
        System.out.println("Nama Pengajar: "+this.getLecturerName());
        System.out.println("Jumlah SKS: "+ this.getSKS());
        
       
}
}