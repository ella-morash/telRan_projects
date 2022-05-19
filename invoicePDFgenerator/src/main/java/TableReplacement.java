import org.apache.poi.xwpf.usermodel.*;

import java.io.FileNotFoundException;
import java.util.Map;

public class TableReplacement implements PlaceHolderReplacer{
    POJO pojo;

    @Override
    public void replacePlaceholders(Map<String, String> map, DocxReader docxReader) throws FileNotFoundException {
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            for (XWPFTable xwpfTable : docxReader.getXWPFDocument().getTables())
            {
                for (XWPFTableRow xwpfTableRow : xwpfTable.getRows())
                {
                    for (XWPFTableCell xwpfTableCell : xwpfTableRow.getTableCells())
                    {
                        for (XWPFParagraph xwpfParagraph : xwpfTableCell.getParagraphs())
                        {
                            for (XWPFRun xwpfRun : xwpfParagraph.getRuns())
                            {
                                String text = xwpfRun.text();
                                if (
                                        text != null
                                                && text.contains(entry.getKey())
                                                && entry.getValue() != null
                                                && !entry.getValue().isEmpty()
                                )
                                {
                                    text = text.replace(entry.getKey(), entry.getValue());
                                    xwpfRun.setText(text, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

