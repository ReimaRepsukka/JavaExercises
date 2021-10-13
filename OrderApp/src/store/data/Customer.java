package store.data;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int idCounter;
    private int id;
    private String name;
    private String address;

    private List<Product> orderProducts = new ArrayList<>();

    public Customer(){
        this("", "");
    }

    public Customer(String name, String address) {
        this.id = idCounter++;
        this.name = name;
        this.address = address;
    }

    public void addProduct(Product product){
        orderProducts.add(product);
    }
    
    public List<Product> getOrderProducts() {
        return new ArrayList<>(this.orderProducts);
    }

    public int getId(){return this.id;}

    public String getName() {return this.name;}

    public String getAddress() {return this.address;}

    public void setId(int id) {this.id = id;}
    
    public void setName(String name) {this.name = name;}
    
    public void setAddress(String address) {this.address = address;}

    
    @Override
    public String toString() {
        return "Name:" + this.name + " Address:" + this.address;
    }
}
