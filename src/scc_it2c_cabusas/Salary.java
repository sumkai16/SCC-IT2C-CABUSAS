
package scc_it2c_cabusas;

import java.util.*;
public class Salary {
    public void inputSalary(){
        Scanner in = new Scanner(System.in);
        Salaries[] sl = new Salaries[100];
        String op = "";
        double tsr=0,td=0,ts=0,ded =0;
        int emp=0;
        do{
            System.out.println("----------------------------------------------");
            System.out.println("Welcome to Salary ");
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
                case 1 ->  {
                    System.out.println("ADDING...");
                    System.out.print("Enter no. of Employees: ");
                    emp = in.nextInt();
                    
                    for(int i=0; i<emp; i++){
                        System.out.println("Details of Employee no. "+(i+1)+"");
                        System.out.print("ID: ");
                        int id = in.nextInt();
                        System.out.print("Name: ");
                        String name = in.next();
                        System.out.print("Rate(Hour): ");
                        double rate = in.nextDouble();
                        System.out.print("Hours Worked: ");
                        int hrs = in.nextInt();
                        System.out.print("Total Deduction:");
                        ded = in.nextDouble();   
                        System.out.println("\n");
                        sl[i] = new Salaries();
                        sl[i].addSalaries(id,name,rate,hrs,ded);
                          td+=ded;
                    }
                    
                }
                case 2 -> {
                    System.out.println("VIEWING...");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
                            ,"EMP ID", "Name","Rate","Hours","Gross","Deductions","Netpay");
                    System.out.println("--------------------------------------------------------------------------");
                    for (int i = 0; i < emp; i++) {
                        sl[i].viewSalaries();   
                        tsr+=(sl[i].gr);
                        ts+=(sl[i].enp);
                    }
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Total Salary for Request: "+tsr);
                    System.out.println("Total Deductions: "+td);
                    System.out.println("Total Salary to Release: "+ts);
                }
                case 3 -> {
                    tsr = 0;  ts = 0;
                    Salaries sl2 = new Salaries();
                    System.out.println("UPDATING...");
                    System.out.print("Enter the ID to update: ");
                    int ids = in.nextInt();
                    System.out.println("Editing ID "+ids);
                    sl2.editSalaries(sl,emp,ids,td);             
                } 
            }
            System.out.print("Do you want to continue?(Y/N):");
            op = in.next();
        }while(op.equals("y") || op.equals("Y"));   
    }
}
