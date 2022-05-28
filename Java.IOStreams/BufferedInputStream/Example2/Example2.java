// Using the available() method

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Example2 {
    
    public static void main(String[] args) {

        try {

            FileInputStream file = new FileInputStream("input.txt");
            BufferedInputStream buffer = new BufferedInputStream(file);
            
            System.out.println("Available bytes at the beginning: " + buffer.available());
            
            // Reads from the file
            buffer.read();
            buffer.read();
            buffer.read();

            // Returns the available number of bytes
            System.out.println("Available bytes at the end: " + buffer.available());

            buffer.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
