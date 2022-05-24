// Implementation of Iterator

import java.util.ArrayList;
import java.util.Iterator;

class Example {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.println("Updated ArrayList: ");

        // Using the hasNext() method
        while (iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }

    }

}
