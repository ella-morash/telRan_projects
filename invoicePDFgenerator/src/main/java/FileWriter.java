import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    String outPath = "C:/telRan_projects/invoicePDFgenerator/src/main/resources/invoice.docx";


    public void generateNewDocxFile() throws IOException {
        DocxReader docxReader = new DocxReader();

        ReplacingFactory.replacePlaceholders(new ParagraphReplacement(),docxReader,new POJO().getMap());
        ReplacingFactory.replacePlaceholders(new TableReplacement(),docxReader,new POJO().getMap());
        final FileOutputStream out = new FileOutputStream(outPath);
        docxReader.getXWPFDocument().write(out);
        out.close();
        docxReader.getXWPFDocument().close();
    }
}
