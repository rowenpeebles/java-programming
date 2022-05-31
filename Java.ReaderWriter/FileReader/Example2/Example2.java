// Using the getEncoding() Method

import java.io.FileReader;
import java.nio.charset.Charset;

class Example2 {

    public static void main(String[] args) {

        try {

            FileReader input1 = new FileReader("input.txt");
            FileReader input2 = new FileReader("input.txt", Charset.forName("UTF8"));
            
            // Returns the character encoding of the file reader
            System.out.println("Charset encoding of input1: " + input1.getEncoding());
            System.out.println("Charset encoding of input2: " + input2.getEncoding());

            input1.close();
            input2.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
