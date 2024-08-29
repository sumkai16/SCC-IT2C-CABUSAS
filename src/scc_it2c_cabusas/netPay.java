
package scc_it2c_cabusas;
import java.text.DateFormat;
import java.util.*;

public class netPay {
    public void getPay(){
 
        Scanner in = new Scanner(System.in);

    
        System.out.print("Enter your Name: ");
        String name = in.nextLine();
        System.out.print("Enter your Age: ");
        int age = in.nextInt();
        System.out.print("Enter Rate per hour: ");
        int rate = in.nextInt();
        System.out.print("Enter total hours worked: ");
        int tHours = in.nextInt();
        System.out.print("Enter total deductions: ");
        int tDeduct = in.nextInt();
        
        Locale locale = new Locale("ph", "PH");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t\tPay Slip");
        System.out.println("-----------------------------------------------------------------");
        System.out.print(date);
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
        float gross;
        System.out.printf("\nTotal Gross: Php%.2f\n",gross=(float)rate*tHours);
        System.out.println("Total Deduction: "+tDeduct);
        
         System.out.println("----------------------------------");
        System.out.println("\t\tNET PAY");
        System.out.println("----------------------------------");
        System.out.printf("Net pay: Php%.2f",gross-tDeduct);
    }
            
}
