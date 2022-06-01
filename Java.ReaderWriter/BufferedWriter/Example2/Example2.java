// Using the flush() method

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Example2 {

    public static void main(String[] args) {

        String data = "This is a demo of the flush method";

        try {
            FileWriter file = new FileWriter("flush.txt");
            BufferedWriter output = new BufferedWriter(file);

            output.write(data);

            // Flushes data to the destination
            output.flush();

            System.out.println("Data is flushed to the file.");

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
