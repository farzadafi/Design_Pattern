import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        new NumberExtractorReport().prepareAndSendReport("data.txt");
    }
}
