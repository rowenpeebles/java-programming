// Implementation of SortedMap in TreeMap Class

import java.util.SortedMap;
import java.util.TreeMap;

class Example {

    public static void main(String[] args) {

        // Creating a SortedMap using TreeMap
        SortedMap<String, Integer> numbers = new TreeMap<>();

        // insert elements to map
        numbers.put("One", 2);
        numbers.put("Two", 1);
        System.out.println("SortedMap: " + numbers);

        // Access the first key of the map
        System.out.println("First Key: " + numbers.firstKey());

        // Access the last key
        System.out.println("Last Key: " + numbers.lastKey());

        // Remove elements from the map
        int value = numbers.remove("One");
        System.out.println("Removed Value: " + value);

    }

}
