// Using the flush() Method

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        String data = "This demo of flush method";

        try {
            out = new FileOutputStream(" flush.txt");
            // Using write() method
            out.write(data.getBytes());
            // Using the flush() method
            out.flush();
            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
