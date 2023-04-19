import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        int c;

        byte[] bytes = "Farzad Afshar Zarandi".getBytes();

        InputStream inputStream = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
        while (true) {
            try {
                if (!((c = inputStream.read()) > 0)) break;
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print( (char) c);
        }

    }
}
