// Implementation of BlockingQueue in ArrayBlockingQueue

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class Example {


    public static void main(String[] args) {

        // Creat a blocking queue using the ArrayBlockingQueue
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

        try {
            // Insert element to blocking queue
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            System.out.println("BlockingQueue: " + numbers);

            // Remove elements to blocking queue
            int removedNumber = numbers.take();
            System.out.println("Removed Number: " + removedNumber);
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
