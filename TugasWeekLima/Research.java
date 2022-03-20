

//import javax.sound.midi.Instrument;
//import TugasWeekLima.Pegawai;

public class Research extends Pegawai{

    private double teachHours;
    private String fieldStudy;
    private Institut Institut;


public Research(String Nama, String SSID, String Email,double Attendance, double teachHours, String fieldStudy, Institut Institut){
    
    //Pegawai();
    super(Nama, SSID, Email,Attendance);
    this.teachHours = teachHours;
    this.fieldStudy = fieldStudy;
    this.Institut = Institut;
}

public double getAttendance(){

    return this.teachHours/5;


}

public String getName(){
    return this.Nama;
}

public void display(){

    System.out.println("Nama: "+ this.Nama);
    System.out.println("SSID: "+ this.SSID);
    System.out.println("Email: "+this.Email);
    System.out.println("Attendance: "+this.getAttendance()); 
    System.out.println("Jam Ajar: "+ this.teachHours);
    System.out.println("Lapangan studi: "+this.fieldStudy);
    System.out.println("Institut: "+ this.Institut.getInstituteName());


}





}