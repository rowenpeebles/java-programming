// Throwing a 'checked' exception

import java.io.*;

class Example3 {

    public static void findFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {

        try {
            findFile();
            System.out.println("Rest of code in try block");
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
