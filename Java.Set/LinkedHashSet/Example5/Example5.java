// Union of Sets

import java.util.LinkedHashSet;

class Example5 {

    public static void main(String[] args) {

        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("LinkedHashSet1: " + evenNumbers);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("LinkedHashSet2: " + numbers);

        // Union of sets
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

    }

}
