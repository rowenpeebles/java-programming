// Iterating the ArrayDeque

import java.util.ArrayDeque;
import java.util.Iterator;

class Example8 {

    public static void main(String[] args) {

        ArrayDeque<String> animals = new ArrayDeque<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayDeque: ");

        // Using iterator()
        Iterator<String> iterate = animals.iterator();

        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");

        // Using descendingIterator()
        Iterator<String> desIterate = animals.descendingIterator();

        while (desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }

    }

}
