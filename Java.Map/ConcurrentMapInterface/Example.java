// Implementation of ConcurrentMap in ConcurrentHashMap

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;

class Example {

    public static void main(String[] args) {

        // Creating ConcurrentMap using ConcurrentHashMap
        ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);

        System.out.println("ConcurrentMap: " + numbers);

        // Access the value of a specified key
        int value = numbers.get("One");
        System.out.println("Accessed Value: " + value);

        // Remove the value of a specified key
        int removedValue = numbers.remove("Two");
        System.out.println("Removed Value: " + removedValue);

    }

}
