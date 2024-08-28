
package main;


public class Grades {
    int id;
    String name;
    double prelim,midterm,prefi,finals;
    
    public void addGrade(int sid, String sname, double p, double m, double pf, double f){
       
        this.id = sid;
        this.name = sname;
        this.prelim = p;
        this.midterm = m;
        this.prefi = pf;
        this.finals  = f;   
    }
    
    public void viewGrade(){
        double ave = (this.prelim + this.midterm + this.prefi + this.finals)/4;
        String rem = (ave>3.0) ? "Failed": "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                           this.id, this.name, this.prelim, this.midterm, this.prefi, this.finals, ave, rem);
    }
}
