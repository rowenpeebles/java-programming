// Union of Sets

import java.util.HashSet;

class Example4 {

    public static void main(String[] args) {

        HashSet<Integer> evenNumbers = new HashSet<>();

        evenNumbers.add(2);
        evenNumbers.add(4);

        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(3);

        System.out.println("HashSet2: " + numbers);

        // Union of Sets
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

    }

}
