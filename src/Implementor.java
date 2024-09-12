Package tangpos.java;
import java.util.Scanner;

public class Application {
    int Aid ,Aname,AGPA,Aincome,Ahours;
    int income, hours;
    public Application(int id, String name, int gpa, int income, int hours){
        this.Aid = id;
        this.Aidname = name;
        this.AGPA=gpa;
        this.Aincome = income;
        this.Ahours = hours;    
    }
    public void viewApplication(){
         System.out.println("%-10d %-20s %-10d %-10d %-10s");
         
    }
}


