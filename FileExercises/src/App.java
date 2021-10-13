import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class App {
    public static void main(String[] args) throws Exception {

        final String PATH = "c:/Temp/oma";

        File f = new File(PATH);

        f.mkdir();

        File doc = new File(PATH+"/documentti.txt");
        doc.createNewFile();


        FileWriter fw = new FileWriter(doc, true);

        BufferedWriter bw = new BufferedWriter(fw);

        fw.write("Reiska" + System.lineSeparator());
        fw.write("Tiina" + System.lineSeparator());
        fw.write("Lasse" + System.lineSeparator());

        fw.close();

        Files.copy(Path.of(PATH+"/documentti.txt"),
            Path.of(PATH+"/backup.txt"), StandardCopyOption.REPLACE_EXISTING);


    }
}
