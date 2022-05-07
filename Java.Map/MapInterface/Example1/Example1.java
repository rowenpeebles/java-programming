// Implementation of the Map Interface

import java.util.Map;
import java.util.HashMap;

class Example1 {

    public static void main(String[] args) {

        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Acces keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);

    }

}
