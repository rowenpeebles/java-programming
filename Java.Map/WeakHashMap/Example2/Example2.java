// Creating WeakHashMaps from other maps

import java.util.HashMap;
import java.util.WeakHashMap;

class Example2 {

    public static void main(String[] args) {

        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        evenNumbers.put(two, twoValue);
        
        System.out.println("HashMap: " + evenNumbers);

        // Creating a weak hash map from other hashmap
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>(evenNumbers);

        System.out.println("WeakHashMap: " + numbers);

    }

}
