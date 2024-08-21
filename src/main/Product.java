package main;

public class Product {
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
        
    }
}
