package store.controller;

import java.util.ArrayList;
import java.util.List;
import store.data.Customer;
import store.data.Product;


public class StoreController {
    private List<Product> products = new ArrayList<>();
    private List<Customer> customers =  new ArrayList<>();

    public void addCustomer(String name, String address){
        this.customers.add(new Customer(name, address));
    }

    public void addProduct(String name, Product.Category category){
        this.products.add(new Product(name, category));
    }

    public boolean addCustomerProduct(int productId, int customerId){

        Customer customer = findCustomer(customerId);
        Product product = findProduct(productId);

        if(customer != null && product != null){
            customer.addProduct(product);
            return true;
        }

        return false;
    }

    public Customer findCustomer(int customerId){
        for (Customer c : this.customers) {
            if(c.getId()== customerId){
                return c;
            }
        }
        return null;
    }

    public Product findProduct(int productId){
        for (Product p : this.products) {
            if(p.getId()== productId){
                return p;
            }
        }
        return null;
    }

    public List<Customer> getCustomers(){
        return new ArrayList<>(this.customers);
    }

    public List<Product> getProducts(){
        return new ArrayList<>(this.products);
    }

}
