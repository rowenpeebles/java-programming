// printf() method using PrintWriter

import java.io.PrintWriter;

class Example {

    public static void main(String[] args) {

        try {
            PrintWriter output = new PrintWriter("output.txt");
            int age = 25;
            output.printf("I am %d years old", age);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
