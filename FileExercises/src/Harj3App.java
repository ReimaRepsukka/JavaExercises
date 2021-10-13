import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Harj3App {
    public static void main(String[] args) throws Exception {
        String path = "./filut/info.txt";

        Scanner sc = new Scanner(new File(path));

        int i = path.lastIndexOf("/");

        String dirpath = path.substring(0, i+1);
        String modifiedFile = dirpath + "modified.txt";

        FileWriter fw =  new FileWriter(new File(modifiedFile));

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            line = line.replace("dollar", "euro").replace("Dollar", "Euro");
            fw.write(line + System.lineSeparator());
        }

        sc.close();
        fw.close();
    }
}
