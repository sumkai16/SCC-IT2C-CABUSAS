
package scc_it2c_cabusas;


public class Products {
    int id;
    String name;
    float price;
    int sold, stock;
    
    public void addProduct(int pid, String pname, float pprice, int psold, int pstock){
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.sold = psold;
        this.stock = pstock;
    }
    public void viewProduct(){
        
        double profit = this.sold*this.price;
        String status = (this.sold<1) ? "Out-of-Stock": "Available";
        double tep = this.stock*this.price;
        
       
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10s    %-10.2f\n",
                           this.id, this.name, this.price, this.sold,this.stock, profit, status, tep);
    }
}
