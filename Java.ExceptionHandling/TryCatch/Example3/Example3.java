// Java try...catch...finally block

import java.io.*;

class ListOfNumbers {

    // Create an integer array
    private int[] list = {1, 6, 8, 9, 2};

    // Method to write data from array to a file
    public void writeList() {
        
        PrintWriter out = null;
        
        try {
            System.out.println("Entering try statement");

            // Creating a new file OutputFile.txt
            out = new PrintWriter(new FileWriter("OutputFile.txt"));

            // Writing values from list array to Output.txt
            for (int i = 0; i < 7; ++i) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        }

        catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }

        finally {
            // Checking if PrintWriter has been opened
            if (out != null) {
                // Close PrintWriter
                out.close();
            }

            else {
                System.out.println("PrintWriter not open.");
            }
        }
    }
}

class Example3 {

    public static void main(String[] args) {

        ListOfNumbers list = new ListOfNumbers();
        list.writeList();

    }

}
