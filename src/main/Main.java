
package main;



public class Main {

    
    public static void main(String[] args) {
        //start of Grades.java
        
//        Grades gr = new Grades();
//        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
//                ,"Student ID", "Name","Prelim","Midterm","Prefinal","Finals","Average","Remarks");
//       
//        gr.addGrade(1001, "Mike", 1.0, 1.0, 1.0, 1.0);
//        gr.viewGrade(1001);
//        
//        Grades gr1 = new Grades();
//        gr.addGrade(1002, "John", 2.0, 1.0, 1.0, 1.0);
//        gr.viewGrade(1002);
        //end of Grades.java
        
        //start of Product.java
        Product pr = new Product();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Product ID ","Name ","Price ","Sold ","Stock ","Profit ","Status ","Total Expected Profit ");
        
        pr.addProduct(1001, "Soap", (float) 20.00, 30, 30);
        pr.viewProduct(1001);
        pr.addProduct(1002, "Cards", (float) 50.00, 60, 0);
        pr.viewProduct(1002);
    }
    
}
