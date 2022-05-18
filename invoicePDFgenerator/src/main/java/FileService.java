import java.io.FileNotFoundException;

public class FileService {
    public static void main(String[] args) throws FileNotFoundException {
        DocxReader reader = new DocxReader();
        reader.readDocxFile();
    }
}
