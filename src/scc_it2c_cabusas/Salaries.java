
package scc_it2c_cabusas;


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
}