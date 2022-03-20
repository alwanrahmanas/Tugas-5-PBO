

//import TugasWeekLima.Pegawai;

public class Adm_Pers extends Pegawai{

    private int WorkDays;
    

    public Adm_Pers(String Nama, String Email, String SSID, double Attendance,int WorkDays){

        super(Nama, SSID, Email, Attendance);
        this.WorkDays = WorkDays;

    }
     
    public double getAttendance(){

       return this.Attendance= this.WorkDays;
    }

    public int getWorkDays(){
        return this.WorkDays;
    }

    public String getNama(){
        return this.Nama;
    }

    public void display(){

        System.out.println("Nama: "+ this.Nama);
        System.out.println("SSID: "+ this.SSID);
        System.out.println("Email: "+this.Email);
        System.out.println("Attendance: "+this.getAttendance()); 
        System.out.println("Hari kerja: "+this.getWorkDays()); 
    
    
    }
    



}