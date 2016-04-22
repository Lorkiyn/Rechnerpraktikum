import java.awt.print.PrinterException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class Print {

    public static void main(String[] args) throws PrinterException {
        try {
            FileInputStream textStream = new FileInputStream("C:/text.txt");
            DocFlavor formatSTREAM = DocFlavor.INPUT_STREAM.TEXT_PLAIN_UTF_8;
            PrintService service = PrintServiceLookup.lookupDefaultPrintService();
            DocPrintJob job = service.createPrintJob();
            Doc doc = new SimpleDoc(textStream, formatSTREAM, null);
            job.print(doc, null);

        } catch (PrintException e) {
            e.printStackTrace();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            
        }  

    }
}