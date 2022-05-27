// Access Data from ByteArrayOutputStream

import java.io.ByteArrayOutputStream;

class Example2 {

    public static void main(String[] args) {

        String data = "This is data.";

        try {

            // Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            // Writes data to the output stream

            byte[] byteData = out.toByteArray();
            System.out.print("Data using toByteArray(): ");

            for (int i = 0; i < byteData.length; i++) {
                System.out.print((char)byteData[i]);
            }

            // Returns a string
            String stringData = out.toString();
            System.out.println("\nData using toString(): " + stringData);

            out.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

} 
