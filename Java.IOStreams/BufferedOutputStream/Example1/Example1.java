// BufferedOutputStream to write data to a file

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Example1 {

    public static void main(String[] args) {

        String data = "This is a line of text inside the file";

        try {

            FileOutputStream file = new FileOutputStream("output.txt");
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the outputstream
            output.write(array);
            output.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

} 
