// Sum of Positive Numbers 

import java.util.Scanner;

class Example2 {

    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);

        do {
            sum += number;
            System.out.println("Enter a number");
            number = input.nextInt();
        }

        while (number >= 0);

        System.out.println("Sum = " + sum);
        input.close();

    }

}
