
package main;
import java.util.*;

public class Grades {
    int id;
    String name;
    float prelim,midterm,prefi,finals;
    public void addGrade(){
        Scanner in = new Scanner(System.in);
        Grades gr = new Grades();
        gr.id = 112233;
        System.out.print("Enter Name: ");
        gr.name = in.nextLine();
        System.out.print("Enter Prelim Grade: ");
        gr.prelim = in.nextFloat();
        System.out.print("Enter Midterm Grade: ");
        gr.midterm = in.nextFloat();
        System.out.print("Enter Prefinal Grade: ");
        gr.prefi = in.nextFloat();
        System.out.print("Enter Finals Grade: ");
        gr.finals = in.nextFloat(); 
        gr.viewGrade(gr.id);
    }
    
    public void viewGrade(int id){
        Grades vg = new Grades();
        
        System.out.println("---------------------------------------------------");
        System.out.println("Student ID: "+id);
        System.out.println("Student's Name: "+name);
        System.out.println("Prelim Grade: "+prelim);
        System.out.println("Midterm Grade: "+midterm);
        System.out.println("Prefinal Grade: "+prefi);
        System.out.println("Finals Grade: "+finals);
        float ave = (prelim+midterm+prefi+finals)/4;
        System.out.println("Average: "+ave);
            if(ave>3.0){
                System.out.println("Remarks: Failed!");
            }
            else{
                System.out.println("Remarks: Passed!");
            }
    }
}
