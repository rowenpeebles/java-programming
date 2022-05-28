// Using the read() method with BufferedInputStream

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Example1 {

    public static void main(String[] args) {

        try {

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("input.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Reads first byte from the file
            int i = input.read();

            while (i != -1) {
                System.out.print((char)i);
                i = input.read();
            }

            input.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
