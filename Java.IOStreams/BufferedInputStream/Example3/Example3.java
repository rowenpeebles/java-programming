// Using skip() method

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Example3 {

    public static void main(String[] args) {

        try {

            FileInputStream file = new FileInputStream("input.txt");
            BufferedInputStream buffer = new BufferedInputStream(file);

            // Skips 5 bytes
            buffer.skip(5);
            System.out.println("Input stream after skipping 5 bytes: ");

            // Reads the first byte from input stream
            int i = buffer.read();

            while (i != -1) {
                System.out.print((char)i);
                i = buffer.read();
            }

            buffer.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
