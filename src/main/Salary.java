
package main;

import java.util.*;
public class Salary {
    public void inputSalary(){
        Scanner in = new Scanner(System.in);
        Salaries[] sl = new Salaries[100];

        System.out.print("Enter no. of Employees: ");
        int emp = in.nextInt();
        
        for(int i=0; i<emp; i++){
            System.out.println("Details of EMP "+(i+1)+"");
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Rate(Hour): ");
            double rate = in.nextFloat();
            System.out.print("Hours Worked: ");
            int hrs = in.nextInt();
            System.out.print("Total Deduction:");
            double ded = in.nextFloat();
            
            sl[i] = new Salaries();
            sl[i].addSalaries(id,name,rate,hrs,ded);
            
          
        }
        for (int i = 0; i < emp; i++) {
            sl[i].viewSalaries();
            double tsr=(sl[i].gr+sl[i].gr);
            System.out.println("--------------------------------------");
            System.out.println("Total Salary for Request: "+tsr);
            double td=ded+ded;
            System.out.println("Total Deductions: ");
            
        }
    }
}
