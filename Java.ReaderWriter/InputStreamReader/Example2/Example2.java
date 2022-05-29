// Using getEncoding() method

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.FileInputStream;

class Example2 {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("input.txt");
            InputStreamReader input1 = new InputStreamReader(file);

            // Creates an InputStreamReader specifying the encoding 
            InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));

            // Returns the character encoding of the input stream
            System.out.println("Character encoding of input1: " + input1.getEncoding());
            System.out.println("Character encoding of input2: " + input2.getEncoding());

            input1.close();
            input2.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

} 
