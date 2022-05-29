// Using write() method

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Example1 {

    public static void main(String[] args) {

        String data = "This is a line of text inside of the file.";

        try {

            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // Creates an OutputStreamWriter
            OutputStreamWriter output = new OutputStreamWriter(file);

            // Writes string to the file
            output.write(data);

            // Closes the writer
            output.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
