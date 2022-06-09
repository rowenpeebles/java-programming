// Read a Line of Text Using Scanner

import java.util.Scanner;

class Example1 {

    public static void main(String[] args) {

        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");

        // Takes input from the user
        String name = input.nextLine();

        // Prints the name
        System.out.println("Your name is: " + name);

        // Closes the scanner
        input.close();

    }

}
