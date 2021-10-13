public class BookApp {
    public static void main(String[] args) throws Exception{
        BookFileController bfc = new BookFileController("./filut/books.txt");

        for (Book b : bfc.books) {
            System.out.println(b.getName() + " " +b.getAuthor()+ " " + b.getPages());
        }


        bfc.books.add(new Book("Hyvä kirja", "Pekko", 25));

        bfc.SaveToFile("filut/books.txt");

    }
}
