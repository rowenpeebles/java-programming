// first() and last() Methods

import java.util.TreeSet;

class Example4 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(6);

        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);

    }

}
