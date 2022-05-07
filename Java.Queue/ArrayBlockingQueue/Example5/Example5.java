// Using take() method

import java.util.concurrent.ArrayBlockingQueue;

class Example5 {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        try {
            // Add elements to animals
            animals.put("Dog");
            animals.put("Cat");
            System.out.println("ArrayBlockingQueue: " + animals);

            // Remove an element
            String element = animals.take();
            System.out.println("Removed Elemennt: " + element);
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }

}
