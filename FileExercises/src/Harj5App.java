import java.io.File;
import java.util.Scanner;

public class Harj5App {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Anna polku");
        String path = sc.nextLine();

        sc.close();
        sc = new Scanner(new File(path));

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
