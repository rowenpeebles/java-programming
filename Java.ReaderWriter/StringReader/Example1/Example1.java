// StringReader

import java.io.StringReader;

public class Example1 {

    public static void main(String[] args) {
        
        String data = "This is the text read from the StringReader.";

        char[] array = new char[100];

        try {
            StringReader input = new StringReader(data);
            input.read(array);
            System.out.println("Data read from the string:");
            System.out.println(array);
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
