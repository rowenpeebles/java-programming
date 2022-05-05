// Implementation of Deque in ArrayDeque Class

import java.util.Deque;
import java.util.ArrayDeque;

class Example {

    public static void main(String[] args) {

        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // Add elements to the deque
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removeNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removeNumber1);

        int removeNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removeNumber2);

        System.out.println("Updated Deque: " + numbers);

    }

} 
