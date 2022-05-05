// Insert elements into a deque

import java.util.ArrayDeque;

class Example1 {

    public static void main(String[] args) {

        ArrayDeque<String> animals = new ArrayDeque<>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");

        System.out.println("ArrayDeque: " + animals);

    }

}
