// Java Scanner nextInt()

import java.util.Scanner;

class Example2 {

    public static void main(String[] args) {

        // Creates a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        // Reads an int value
        int age = input.nextInt();

        System.out.println("Your age is: " + age);

        input.close();

    }

}
