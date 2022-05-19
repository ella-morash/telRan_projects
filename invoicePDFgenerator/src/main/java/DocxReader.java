import lombok.Getter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Getter

public class DocxReader {
    private final String filePath = "src/main/resources/invoice_telran.docx";
    private XWPFDocument docx;

    public DocxReader() throws FileNotFoundException {
        docx = getXWPFDocument();
    }


    public XWPFDocument getXWPFDocument() throws FileNotFoundException {
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            docx = new XWPFDocument(fis);
            return docx;
//            var p =document.getParagraphs();
//            p.forEach(par-> System.out.println(par.getRuns()));
//            var t = document.getTables();
//            for (XWPFTable table: t) {
//
//                System.out.println(table.getText());
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
