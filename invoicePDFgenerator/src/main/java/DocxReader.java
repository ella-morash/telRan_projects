import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class DocxReader {
    private final String filePath = "src/main/resources/invoice_telran.docx";

    public String getFilePath() {
        return filePath;
    }

    public void readDocxFile() throws FileNotFoundException {
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);
            var p =document.getParagraphs();
            p.forEach(par-> System.out.println(par.getRuns()));
            var t = document.getTables();
            for (XWPFTable table: t) {

                System.out.println(table.getText());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
