
package main;


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
        double gross = (this.rate*this.hrs);
        double np = (gross-this.deduc);
        this.gr = gross;
        this.enp = np;
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10.2f %-10.2f %-10.2f \n",
                           this.id, this.name, this.rate, this.hrs, gross, this.deduc, np );
       
        
    }
}