

abstract public class Pegawai{

    public String SSID;
    public String Nama;
    public String Email;
    public double Attendance;

    public Pegawai(String Nama,String SSID, String Email,double Attendance){

        this.Nama = Nama;
        this.SSID = SSID;
        this.Email = Email;
        this.Attendance = Attendance;
    } 

    /* public void display(String Nama, String SSID, String Email){

        System.out.println("Nama: "+this.Nama);
        System.out.println("SSID: "+this.SSID);
        System.out.println("Email: "+this.Email);
    }*/

    abstract public double Attendance();

}