// Compute the sum of 5 positive numbers 

import java.util.Scanner;

class Example2 {

    public static void main(String[] args) {

        Double number, sum = 0.0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.println("Enter number " + i + " : ");
            number = input.nextDouble();

            if (number <= 0.0) {
                continue;
            }

            sum += number;

        }

        System.out.println("Sum = " + sum);

        input.close();

    }

}
