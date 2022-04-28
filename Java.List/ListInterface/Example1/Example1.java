// Implementing the ArrayList Class

import java.util.List;
import java.util.ArrayList;

class Example1 {

    public static void main(String[] args) {

        // Creating list using ArrayList class
        List<Integer> numbers = new ArrayList<>();
    
        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        // Display list
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Remove element from list
        int removedNumber = numbers.remove(3);
        System.out.println("Removed Element: " + removedNumber);

    }

}
