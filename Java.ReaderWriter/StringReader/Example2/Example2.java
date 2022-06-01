// Using skip() method

import java.io.StringReader;

public class Example2 {
    
    public static void main(String[] args) {

        String data = "This is the text rea from StringReader";
        System.out.println("Original data: " + data);

        char[] array = new char[100];

        try {
            StringReader input = new StringReader(data);
            input.skip(5);
            input.read(array);
            System.out.println("Data after skipping 5 chars: ");
            System.out.println(array);
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
