// Java 'throws' keyword

import java.io.*;

class Example4 {

    // Declaring the type of exception
    public static void findFile() throws IOException {

        // Code that may generate IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);

    }

    public static void main(String[] args) {

        try {
            findFile();
        }

        catch (IOException e) {
            System.out.println(e);
        }

    }

}
