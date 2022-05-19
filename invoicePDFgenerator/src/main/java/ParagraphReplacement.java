import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileNotFoundException;
import java.util.Map;

public class ParagraphReplacement implements PlaceHolderReplacer{
    POJO pojo;

    @Override
    public void replacePlaceholders(Map<String, String> map, DocxReader docxReader) throws FileNotFoundException {
        outerForLoop:
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            for (XWPFParagraph paragraph : docxReader.getDocx().getParagraphs())
            {
                for (XWPFRun run : paragraph.getRuns())
                {
                    String text = run.text();
                    if (
                            text != null
                                    && text.contains(entry.getKey())
                                    && entry.getValue() != null
                                    && !entry.getValue().isEmpty()
                    )
                    {
                        text = text.replace(entry.getKey(), entry.getValue());

                        run.setText(text, 0);
                        continue outerForLoop;

                    }
                }
            }
        }

    }
}
