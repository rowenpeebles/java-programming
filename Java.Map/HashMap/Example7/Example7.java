// Creating HashMap from other Maps

import java.util.HashMap;
import java.util.TreeMap;

class Example7 {

    public static void main(String[] args) {

        // Create a treemaop
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        // Create hashmap from the treemap
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

    }

}
