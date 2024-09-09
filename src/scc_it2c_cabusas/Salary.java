
package scc_it2c_cabusas;

import java.util.*;
public class Salary {
    public void inputSalary(){
        Scanner in = new Scanner(System.in);
        Salaries[] sl = new Salaries[100];

        System.out.print("Enter no. of Employees: ");
        int emp = in.nextInt();
        double tsr=0;
        double td=0;
        double ts=0;
        double ded =0;
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
}
