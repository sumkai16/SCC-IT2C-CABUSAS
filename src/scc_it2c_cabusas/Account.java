
package scc_it2c_cabusas;
import java.util.*;

public class Account {
    public void inputAccounts(){
        Accounts[] ac = new Accounts[100];
        Scanner in = new Scanner(System.in);
        String op = null;
        int acc = 0;
        do{
            System.out.println("----------------------------------------------");
            System.out.println("Welcome to Account Registration");
            System.out.println("----------------------------------------------");
            System.out.println(""
                + "1. ADD\n"
                + "2. VIEW\n"
                + "3. UPDATE\n"
                + "4. DELETE\n"
                + "5. EXIT");
            System.out.println("----------------------------------------------");
            System.out.print("Enter Action: ");
            int act = in.nextInt();
            while(act>5){
                System.out.println("Invalid Action, Please Try again: ");
                act = in.nextInt();        
            }
        switch(act){
            case 1: 
                
                System.out.print("Enter no. of accounts: ");
                acc = in.nextInt();
                System.out.println("\n");
                
            for(int i=0; i<acc; i++){
                int id;

                System.out.println("Details of Account "+(i+1)+"");
                do{
                    System.out.print("ID: ");
                    id = in.nextInt();
                }while(!Accounts.checkID(id));
                System.out.print("First Name: ");
                String fname = in.next();
                System.out.print("Last Name: ");
                String lname= in.next();
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
                ac[i] = new Accounts();
                ac[i].addAccounts(id, fname, lname, email, uname, pword);
            }
            break;
            
            case 2:
                System.out.printf("\n%-15s %-15s %-15s %-20s %-20s %-20s\n",
                    "Account ID ","First Name ","Last Name ","Email ","Username ","Password ");
                for(int i=0; i<Accounts.currentCount; i++){
                    Accounts.ac[i].viewAccounts();
                }
            break;
            
            case 3:
                System.out.println("UPDATING...");
                System.out.print("Enter the ID to update: ");
                int ids = in.nextInt();
                System.out.println("Editing ID: "+ids);
                Accounts ac2 = new Accounts();
                ac2.editAccounts(ac,acc,ids);
        }
            
            System.out.print("Do you want to continue?(Y/N):");
            op = in.next();
        }while(op.equals("y")|| op.equals("Y"));
        
         
    }
}
