// Using getEncoding() method

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

class Example2 {

    public static void main(String[] args) {
        
        try {

            // Creates an output stream
            FileOutputStream file = new FileOutputStream("output.txt");

            // Creates an output stream reader with default encoding
            OutputStreamWriter output1 = new OutputStreamWriter(file);

            // Creates an output stream reader with specified encoding
            OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));

            // Returns the character encoding of the output streams
            System.out.println("Character encoding of output1: " + output1.getEncoding());
            System.out.println("Character encoding of output2: " + output2.getEncoding());

            // Closes the readers
            output1.close();
            output2.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
