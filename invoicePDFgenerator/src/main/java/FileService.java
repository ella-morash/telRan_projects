import java.io.FileNotFoundException;
import java.io.IOException;

public class FileService {
    public static void main(String[] args) throws IOException {
       FileWriter writer = new FileWriter();
       writer.generateNewDocxFile();

    }
}
