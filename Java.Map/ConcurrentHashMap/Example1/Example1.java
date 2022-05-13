// Creating ConcurrentHashMap from Other Maps

import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

class Example1 {

    public static void main(String[] args) {

        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();

        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        System.out.println("HashMap: " + evenNumbers);

        // Creating a concurrent hashmap from evenNumbers
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNumbers);

        numbers.put("Three", 3);

        System.out.println("ConcurrentHashMap: " + numbers);

    }

}
