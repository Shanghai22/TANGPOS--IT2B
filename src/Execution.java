
package tangpos.it2b;
import java.util.Scanner;
public class Scholarship {
   
    Scanner sc = new Scanner(Sytem.in);
   
    public void inputScholarship(){   
                   
        System.out.print("Enter Number of Scholarship\n");
        int nums = scan.nextInt();
        
        Scholarship[]app = new Scholarship[ns];
        for(int i = 0; i< ns;i++){
      
        System.out.println("Enter detail of Scholarship %d: \n"+i++);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("GPA Name: ");
        String gname = sc.next();
        System.out.println("Annual Family Income: ");
        int income = sc.nextInt();
        System.out.println("Community Service Hours: ");
        int hours = sc.nextInt();
        
        Sc[i] = new Scholarship(id, name, income , hours);
       
}
        System.out.println("%-10d %-20s %-10d %-10d %-10s");
}
}
