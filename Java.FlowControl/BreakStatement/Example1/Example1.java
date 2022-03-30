// Java Break Statement 

import java.util.Scanner;

class Example1 {

    public static void main(String[] args) {

        Double number, sum = 0.0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            number = input.nextDouble();

            if (number < 0.0) {
                break;
            }

            sum += number;

        }

        System.out.println("Sum = " + sum);

    }

}
