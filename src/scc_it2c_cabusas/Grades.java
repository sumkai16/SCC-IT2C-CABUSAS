
package scc_it2c_cabusas;


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
        double ave = (prelim + midterm + prefi + finals)/4;
        String rem = (ave>3.0) ? "Failed": "Passed";
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                           "ID", "Name", "Prelim", "Midterm", "Prefinal", "Finals", "Average", "Remarks");
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                           id, name, prelim, midterm, prefi, finals, ave, rem);
    }
}
