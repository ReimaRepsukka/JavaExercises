public class BookItem extends Item {
    private String author;
    private int pages;

    public BookItem(String name, String author, int pages){
        super(name);
        this.author = author;
        this.pages = pages;
    }
}
