// Remove Element using the clear() method

import java.util.ArrayDeque;

class Example7 {

    public static void main(String[] args) {

        ArrayDeque<String> animals = new ArrayDeque<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayDeque: " + animals);

        // using clear()
        animals.clear();

        System.out.println("New ArrayDeque: " + animals);

    }

}
