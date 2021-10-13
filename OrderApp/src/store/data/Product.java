package store.data;

public class Product {

    public enum Category{
        COMPUTER,
        CABLE,
        SOFTWARE,
        AUDIO
    }

    private static int idCounter;
    private int id;
    private String name;
    private Category category;

    public Product(){
        this("", Category.SOFTWARE);
    }

    public Product(String name, Category category) {
        this.id = idCounter++;
        this.name = name;
        this.category = category;
    }

    public int getId(){return this.id;}

    public String getName() {return this.name;}
    
    public Category getCategory() {return this.category;}
    
    public void setId(int id) {this.id = id;}
    
    public void setName(String name) {this.name = name;}

    public void setCategory(Category category) {this.category = category;}

    @Override
    public String toString() {
        return "Name:" +this.name + " Category: " +  this.category;
    }
}
