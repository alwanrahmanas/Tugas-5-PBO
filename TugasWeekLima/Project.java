
import java.sql.Date;


//import TugasWeekLima.Research;

public class Project{

    private String nama;
    private int duration;
    private Date startingDate;
    private Date endDate;
    public Research Pengelola;

    public Project(String nama, int i, java.sql.Date startingDate, java.sql.Date endDate,
            Research pengelola) {
        this.nama = nama;
        this.duration = i;
        this.startingDate = startingDate;
        this.endDate = endDate;
        this.Pengelola = pengelola;
    }
    
    public Date getStartingDate() {
        return startingDate;
    }
    
    public Date getEndDate() {
        return endDate;
    }
    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
    
    public void display(){
        System.out.println("Nama Course: "+ this.nama);
        System.out.println("Durasi: "+ this.duration+" Jam");
        System.out.println("Tanggal mulai: "+this.getStartingDate());
        System.out.println("Tanggal berakhir: "+ this.getEndDate());
        System.out.println("Pengelola (dekan): "+this.Pengelola.getName());
        
       
}
    
}
