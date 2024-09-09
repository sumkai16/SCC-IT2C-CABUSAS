
package scc_it2c_cabusas;
import java.util.*;


public class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c;
        do{
           System.out.print("Menu:\n1.Grading System\n2.Product\n3.NetPay\n4.Salary\n5.Account Registration\nEnter Choice: ");
        int choice = in.nextInt();
        switch(choice){
            case 1:
                Grade gr = new Grade();
                gr.inputGrade();
                break;
            case 2:
                Product pr = new Product();
                pr.inputProduct();
                break;
            case 3:
                netPay np = new netPay();
                np.getPay();
                break;
            case 4:
                Salary sr = new Salary();
                sr.inputSalary();
                break;
            case 5:
                Account ac = new Account();
                ac.inputAccounts();
                break;
            } 
            System.out.print("Do you want to use other system? (Y/N): ");
             c = in.next();
        }while(c.equals("Y") || c.equals("y"));
        System.out.println("THANK YOU FOR USING THIS SYSTEM!");
        
   
        
  }
}
