
package scc_it2c_cabusas;

import java.util.*;
public class Grade {
    public void inputGrade(){
        Grades[] gr = new Grades[100];
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter no. of Students: ");
        int students = in.nextInt();
        int id = 0;
        String name = null;
        double p = 0;
        double m = 0;
        double pf = 0;
        double f = 0 ;
        for (int i=0; i<students; i++){
                    System.out.println("Enter details of student "+(i+1)+"");
               
                    System.out.print("ID:");
                    id = in.nextInt();
                    System.out.print("Name:");
                    name=in.next();
                    System.out.print("Prelim: ");
                    p = in.nextFloat();
                    System.out.print("Midtern: ");
                    m = in.nextFloat();
                    System.out.print("Prefinal: ");
                    pf = in.nextFloat();
                    System.out.print("Finals: ");
                    f = in.nextFloat();
                    gr[i] = new Grades();
                    
    }
        for(int i=0; i<students; i++){
            System.out.println("\n\n");
            gr[i].addGrade(id, name, p, m, pf, f);
            gr[i].viewGrade();
        } 
    }
}
