
package scc_it2c_cabusas;

import java.util.Scanner;


public class Salaries {
    int id,hrs;
    String name;
    double rate, deduc,gr,enp;
    
    public void addSalaries(int eid, String ename, double erate, int ehrs, double ededuc){
        this.id = eid;
        this.name = ename;
        this.rate = erate;
        this.hrs = ehrs;
        this.deduc = ededuc;
    }
    public void viewSalaries(){
        double gross = (rate*hrs);
        double np = (gross-deduc);
        this.gr = gross;
        this.enp = np;
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10.2f %-10.2f %-10.2f \n",
                           id, name, rate, hrs, gross, deduc, np );
    }
    public void editSalaries(Salaries[] sl, int size, int id,double td){
        Scanner in= new Scanner(System.in);
        for(int i = 0; i < size; i++){
            if(sl[i].id == id){
                td=0;
                System.out.print("New Rate(Hour): ");
                double rt = in.nextDouble();
                sl[i].rate = rt;
                System.out.print("New Hours Worked: ");
                int hrw = in.nextInt();
                sl[i].hrs = hrw;
                System.out.print("New Total Deduction:");
                double tds = in.nextDouble();   
                sl[i].deduc = tds;
            }
        }
    }
    
}