// Writer Using FileWriter

import java.io.Writer;
import java.io.FileWriter;

public class Example {

    public static void main(String[] args) {

        String data = "This is the data in the output file";

        try {

            Writer output = new FileWriter("output.txt");

            output.write(data);

            output.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
