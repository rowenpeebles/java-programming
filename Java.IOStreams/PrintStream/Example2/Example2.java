// print() method with PrintStream class

import java.io.PrintStream;

class Example2 {

    public static void main(String[] args) {

        String data = "This is text inside the file.";

        try {

            PrintStream output = new PrintStream("output.txt");

            output.print(data);
            output.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
