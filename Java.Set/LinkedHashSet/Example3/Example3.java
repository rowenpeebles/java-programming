// Access LinkedHashSet Elements

import java.util.LinkedHashSet;
import java.util.Iterator;

class Example3 {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet: " + numbers);

        // Calling the iterator() method
        Iterator<Integer> iterate = numbers.iterator();

        System.out.println("LinkedHashSet using Iterator: ");

        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }

}
