// Using getEncoding() Method

import java.io.FileWriter;
import java.nio.charset.Charset;

class Example2 {

    public static void main(String[] args) {

        String file = "output.txt";

        try {

            FileWriter output1 = new FileWriter(file);
            FileWriter output2 = new FileWriter(file, Charset.forName("UTF8"));

            System.out.println("Charset encoding of output1: " + output1.getEncoding());
            System.out.println("Charset encoding of output2: " + output2.getEncoding());

            output1.close();
            output2.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
