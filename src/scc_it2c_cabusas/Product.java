package scc_it2c_cabusas;
import java.util.*;
public class Product {
    public void inputProduct(){
        Products[] pr = new Products[100];
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many Products do you want to add?:");
        int nprod = in.nextInt();
        for(int i=0; i<nprod; i++){
            System.out.println("Product no "+(i+1));
            System.out.print("Enter Product ID: ");
            int id = in.nextInt();
            System.out.print("Product Name: ");
            String name = in.next();
            System.out.print("Product Price: ");
            double price = in.nextFloat();
            System.out.print("Product Sold: ");
            int sold = in.nextInt();
            System.out.print("Stocks: ");
            int stocks = in.nextInt();
            System.out.println("\n");
            pr[i] = new Products();
            pr[i].addProduct(id,name, (float) price,sold,stocks);
            
        }
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Product ID ","Name ","Price ","Sold ","Stock ","Profit ","Status ","Total Expected Profit ");
        for(int i = 0; i<nprod; i++){
            pr[i].viewProduct();
        }
        
        
        
        
        
        
        
    }
   
       
}
