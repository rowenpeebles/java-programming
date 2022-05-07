// Insert Elements

import java.util.concurrent.ArrayBlockingQueue;

class Example1 {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        // Using add()
        animals.add("Dog");
        animals.add("Cat");

        // Using offer()
        animals.offer("Horse");
        System.out.println("ArrayBlockingQueue: " + animals);

    }

}
