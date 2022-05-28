// Using the flush() method

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Example2 {

    public static void main(String[] args) {

        String data = "This is a demo of the flush method.";

        try {
            FileOutputStream file = new FileOutputStream("flush.txt");
            BufferedOutputStream buffer = new BufferedOutputStream(file);
            buffer.write(data.getBytes());

            // Flushes data to the destination
            buffer.flush();
            
            System.out.println("Data is flushed to the file");

            buffer.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
