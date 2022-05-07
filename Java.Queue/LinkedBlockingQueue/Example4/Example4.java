// Using put() method

import java.util.concurrent.LinkedBlockingQueue;

class Example4 {

    public static void main(String[] args) {

        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        try {
            // Add elements to animals
            animals.put("Dog");
            animals.put("Cat");
            System.out.println("LinkedBlockingQueue: " + animals);
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }

}
