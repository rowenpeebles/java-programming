// Using skip() Method

import java.io.FileInputStream;

public class Example3 {

    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("input.txt");
            // Skips the 5 bytes
            input.skip(5);
            System.out.println("Input stream after skipping 5 bytes: ");
            // Reads the first byte
            int i = input.read();
            while (i != -1) {
                System.out.print((char)i);
                // Reads next byte from the file
                i = input.read();
            }   
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
