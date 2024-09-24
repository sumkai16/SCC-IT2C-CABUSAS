
package scc_it2c_cabusas;

import java.util.*;
public class Grade {
    public void inputGrade(){
        Grades[] gr = new Grades[100];
        Scanner in = new Scanner(System.in);
        int id = 0, students=0;
        String name = null;
        double p = 0,m = 0,pf = 0,f = 0; 
        String op = null;
        do{
            System.out.println("Welcome to Grading App");
            System.out.println("----------------------------------------------");
            System.out.println(""
                + "1. ADD\n"
                + "2. VIEW\n"
                + "3. UPDATE\n"
                + "4. DELETE\n"
                + "5. EXIT");
            System.out.println("----------------------------------------------");
            System.out.print("Enter Action: ");
            int act = in.nextInt();
        
            while(act>5){
                System.out.println("Invalid Action, Please Try again: ");
                act = in.nextInt();        
            }
        
        switch(act){
            case 1:
                System.out.println("ADDING...");
                System.out.print("Enter no. of Students: ");
                students = in.nextInt();
       
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
                    gr[i].addGrade(id, name, p, m, pf, f);

            }
                break;
            case 2:
                System.out.println("VIEWING...");
                for(int i=0; i<students; i++){
                    System.out.println("\n");
                    gr[i].viewGrade();
                 } 
                break;
            case 3:
                Grades gr2 = new Grades();
                System.out.println("UPDATE");
                System.out.print("Enter the ID to update: ");
                int ids = in.nextInt();
                System.out.println("Editing ID: "+ids);
                gr2.editGrades(gr, students, ids);
            break;
            case 4:
                System.out.println("Thank you for using the system!");
                break;  
         }
            System.out.print("Do you want to continue?(Y/N):");
            op = in.next();
        }while(op.equals("y")|| op.equals("Y"));
       
        
        
    }
}
