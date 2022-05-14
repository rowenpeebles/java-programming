// Remove Elements

import java.util.HashSet;

class Example3 {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(6);

        System.out.println("HashSet: " + numbers);

        // Using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean result2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + result2);

    }

}
