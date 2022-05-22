// Union, Intersection, Difference and Subset of Sets

import java.util.TreeSet;

class Example8 {

    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet1: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("TreeSet2: " + numbers);

        // Union of two sets
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

        // Intersection of sets
        numbers.retainALL(evenNumbers);
        System.out.println("Intersection is: " + numbers);

        // Difference of sets
        numbers.removeAll(evenNumbers);
        System.out.println("Difference is: " + numbers);

        // Subset of a set
        boolean result = numbers.containsAll(evenNumbers);
        System.out.println("Is TreeSet2 a subset of TreeSet1? " + result);

    }

}
