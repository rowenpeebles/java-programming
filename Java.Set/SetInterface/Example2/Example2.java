// implementing TreeSet Class

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class Example2 {

    public static void main(String[] args) {

        // Creating a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        System.out.println("Set using TreeSet: " + numbers);

        // Access elements using iterator()
        System.out.println("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();

        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }

}
