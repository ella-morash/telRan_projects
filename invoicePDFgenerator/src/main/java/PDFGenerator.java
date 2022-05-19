import com.aspose.pdf.Document;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PDFGenerator {
    FileWriter fileWriter;
    DocxReader docxReader;
    public void getPDF () throws IOException {
        fileWriter = new FileWriter();
        fileWriter.generateNewDocxFile();
        PdfOptions options = PdfOptions.create();
        OutputStream out = new FileOutputStream(new File("C:/telRan_projects/invoicePDFgenerator/src/main/resources/invoice.pdf)"));
        PdfConverter.getInstance().convert(docxReader.getDocx(),out, options);
    }
}
