// ByteArrayInputStream to read data

import java.io.ByteArrayInputStream;

public class Example1 {

    public static void main(String[] args) {

        // Creates an array of byte
        byte[] array = {1, 2, 3, 4};

        try {
            
            ByteArrayInputStream input = new ByteArrayInputStream(array);
            System.out.print("The bytes read from the input stream: ");
 
            for (int i = 0; i < array.length; i++) {
                // Reads the bytes
                int data = input.read();
                System.out.print(data + ", ");
            }
            
            input.close();
        
        }
 
 catch (Exception e) {
            e.getStackTrace();
        }

    }

}
