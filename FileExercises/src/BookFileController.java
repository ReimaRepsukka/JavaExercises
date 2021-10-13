import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFileController {
    public List<Book> books = new ArrayList<>();

    public BookFileController(String filePath) throws Exception{
        File f = new File(filePath);
        Scanner sc = new Scanner(f);

        while(sc.hasNextLine()){
            String[] bookInfo = sc.nextLine().split("---");
            Book b = new Book(bookInfo[0], 
                bookInfo[1], Integer.parseInt(bookInfo[2]));
            
            books.add(b);
        }
        sc.close();
    }

    public void SaveToFile(String filePath) throws Exception{
        FileWriter fw = new FileWriter(new File(filePath));

        for (Book book : books) {
            fw.write(book.getName()+"---");
            fw.write(book.getAuthor()+"---");
            fw.write(book.getPages() + System.lineSeparator());
        }

        fw.close();
    }
}
