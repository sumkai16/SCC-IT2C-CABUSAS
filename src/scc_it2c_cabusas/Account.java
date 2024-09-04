
package scc_it2c_cabusas;
import java.util.*;

public class Account {
    public void inputAccounts(){
        Accounts[] ac = new Accounts[100];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of accounts: ");
        int acc = in.nextInt();
        System.out.println("\n");
        for(int i=0; i<acc; i++){
            int id;
            
            System.out.println("Details of Account "+(i+1)+"");
            do{
                System.out.print("ID: ");
                id = in.nextInt();

            }while(!Accounts.checkID(id));
            
            
            System.out.print("First Name: ");
            String fname = in.nextLine();
           
            System.out.print("Last Name: ");
             String lname= in.nextLine();
            
            String email;
            do{
                System.out.print("Email: ");
                email = in.next();
            }while(!Accounts.checkEmail(email));
            
                String uname;
            do{
                System.out.print("Username: ");
                uname = in.next();
            }while(!Accounts.checkUser(uname));
            System.out.println("\nPassword criteria:"
                        + "\n1. Must be above 8 characters"
                        + "\n2. Must have at least 1 upper & 1 lower case letters"
                        + "\n3. Must have at least 1 number"
                        + "\n4. Must have at least 1 special character"
                        + "\n5. Must not have common password names like 'admin', 'password', or '1234'");
             String pword;
            do {
                
                System.out.print("Password: ");
                pword = in.next();
            } while (!Accounts.passwordValidator(pword));
            
            new Accounts(id, fname, lname, email, uname, pword);

        }
        System.out.printf("%-10s %-10s %-10s %-15s %-15s %-15s\n",
                "Account ID ","First Name ","Last Name ","Email ","Username ","Password ");
        for(int i=0; i<Accounts.currentCount; i++){
                Accounts.ac[i].viewAccounts();

        }
         
    }
}
