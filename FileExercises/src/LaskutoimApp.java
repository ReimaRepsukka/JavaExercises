import java.io.File;
import java.io.FileWriter;
import java.text.NumberFormat.Style;
import java.util.Scanner;

import jdk.jfr.StackTrace;

public class LaskutoimApp {

    static Scanner sc = new Scanner(System.in);
    static FileWriter log;

    public static void main(String[] args) throws Exception {

        log = new FileWriter(new File("log.txt"), true);

        try{
            System.out.println("Anna luku 1");
            int luku1 = Integer.parseInt(sc.nextLine());
            System.out.println("Annal luku2");
            int luku2 = Integer.parseInt(sc.nextLine());    
        }catch(Exception e){
            StackTraceElement[] st = e.getStackTrace(); 
            String indent = "";
            log.write(e.getMessage() + System.lineSeparator());
            for (StackTraceElement el : st) {
                log.write(indent + el.toString() + System.lineSeparator());
                indent += "  ";
            }
        }

        sc.close();
        log.close();
       
    }
}
