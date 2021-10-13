import store.controller.StoreController;
import store.data.Customer;
import store.data.Product;

public class App {

    StoreController storeController = new StoreController();
    public static void main(String[] args) throws Exception {
       App app = new App();
       app.addTestData();

        app.printAllCustomers();
        app.printAllProducts();
    }


    void printAllCustomers(){
        for (Customer c  : storeController.getCustomers()) {
            System.out.println("--------------------------");
            System.out.println(c);
        }
    }

    void printAllProducts(){
        for (Product p  : storeController.getProducts()) {
            System.out.println("--------------------------");
            System.out.println(p);
        }
    }
    void addTestData(){

        storeController.addCustomer("Repe Ruipelo", "Kotkatie 2C");
        storeController.addCustomer("Samuli Silmu", "Simpputie 4 A 5");
        storeController.addCustomer("Liisa Laulaja", "Cooltie 5");
        storeController.addCustomer("Siiri Simppu", "Perustie 34 A 5");
        
        storeController.addProduct("Apple Macbook Air 13", Product.Category.COMPUTER);
        storeController.addProduct("Adobe CS", Product.Category.SOFTWARE);
        storeController.addProduct("Sennheiser PC 8", Product.Category.AUDIO);
        storeController.addProduct("Genelec G one B", Product.Category.AUDIO);
        storeController.addProduct("Jabra Speak 410", Product.Category.AUDIO);
        storeController.addProduct("F-secure total", Product.Category.SOFTWARE);
        storeController.addProduct("Windows 10 Home", Product.Category.SOFTWARE);
        storeController.addProduct("Hama RCA", Product.Category.CABLE);
        storeController.addProduct("Jabra Speak 410", Product.Category.AUDIO);
        storeController.addProduct("Lenovo Legion 5", Product.Category.COMPUTER);
        storeController.addProduct("HP 250 G8", Product.Category.COMPUTER);

    }
}
