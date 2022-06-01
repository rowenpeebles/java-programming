// BufferedWriter to write data to a file

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Example1 {

    public static void main(String[] args) {

        String data = "This is the data in the output file";

        try {
            FileWriter file = new FileWriter("output.txt");
            BufferedWriter output = new BufferedWriter(file);

            output.write(data);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}

