// Access Data from StringWriter

import java.io.StringWriter;

public class Example2 {

    public static void main(String[] args) {

        String data = "This is the original data.";

        try {
            StringWriter output = new StringWriter();
            // Writed data to the string buffer
            output.write(data);
            // Returns the string buffer
            StringBuffer stringBuffer = output.getBuffer();
            System.out.println("StringBuffer: " + stringBuffer);
            // Returns the string buffer in string form
            String string = output.toString();
            System.out.println("String: " + string);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
