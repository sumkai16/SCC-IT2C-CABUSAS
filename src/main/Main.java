
package main;



public class Main {

    
    public static void main(String[] args) {
        Grades gr = new Grades();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
                ,"Student ID", "Name","Prelim","Midterm","Prefinal","Finals","Average","Remarks");
       
        gr.addGrade(1001, "Mike", 1.0, 1.0, 1.0, 1.0);
        gr.viewGrade(1001);
        
        Grades gr1 = new Grades();
        gr.addGrade(1002, "John", 2.0, 1.0, 1.0, 1.0);
        gr.viewGrade(1002);
        //this is the end of the grades.java
        
        

    }
    
}
