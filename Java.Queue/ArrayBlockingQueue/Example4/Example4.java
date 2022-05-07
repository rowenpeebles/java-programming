// Using put() method
    
import java.util.concurrent.ArrayBlockingQueue;

class Example4 {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        try {
            // Add elements to animals
            animals.put("Dog");
            animals.put("Cat");
            System.out.println("ArrayBlockingQueue: " + animals);
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }

}


