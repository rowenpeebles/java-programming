// Using read() method

import java.io.InputStreamReader;
import java.io.FileInputStream;

class Example1 {

    public static void main(String[] args) {

        // Creates an array of character
        char[] array = new char[100];

        try {

            FileInputStream file = new FileInputStream("input.txt");
            InputStreamReader input = new InputStreamReader(file);

            // Reads characters from the file
            input.read(array);
            System.out.println("Data in the stream: ");
            System.out.println(array);

            // Closes the reader
            input.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
