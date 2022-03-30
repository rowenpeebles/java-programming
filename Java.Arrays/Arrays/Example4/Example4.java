// Compute Sum and Average of Array Elements

class Example4 {

    public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        Double average;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        int arrayLength = numbers.length;

        average = ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }

}
