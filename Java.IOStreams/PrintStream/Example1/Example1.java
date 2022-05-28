// printf() method using PrintStream

import java.io.PrintStream;

class Example1 {
    
    public static void main(String[] args) {

        try {

            PrintStream output = new PrintStream("output.txt");

            int age = 25;

            output.printf("I am %d years old.", age);
            output.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
