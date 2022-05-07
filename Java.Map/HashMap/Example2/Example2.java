// Add elements to a HashMap

import java.util.HashMap;

class Example2 {

    public static void main(String[] args) {

        // Create a hashmap
        HashMap<String, Integer> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);

        // put() method to add elements
        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);

    }

}
