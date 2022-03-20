import java.sql.Date;

public class test1 {

    public static void main(String[] args){

        Institut i1 = new Institut("ITB", "Bandung");
        
        i1.display();
        System.out.println("//////////");
        Research r1 = new Research("Alwan","222011999","alwanrahmana@gmail.com",20,4,"Kalkulus",i1);
        r1.display();


        Adm_Pers Dekan = new Adm_Pers("Alwin", "alwinrahmana@gmail.com", "212011290", 20,5);
        System.out.println("//////////");
        Dekan.display();
        System.out.println("//////////");
        Fakultas f1 = new Fakultas("FTMD",Dekan,i1);
        f1.display();

        System.out.println("//////////");
        Course c1 = new Course("1234", "Name", r1, 3);
        c1.display();

        System.out.println("//////////");

        Project p1 = new Project("Project Pop", 2, new Date(102,1,25), new Date(103,2,25), r1);
        p1.display();


    }
    
}
