// Implementation of the Queue Interface

import java.util.Queue;
import java.util.LinkedList;

class Example1 {

    public static void main(String[] args) {

        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // Offer elements to the queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        System.out.println("Queue: " + numbers);

        // Access elements of the queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);

    }

}
