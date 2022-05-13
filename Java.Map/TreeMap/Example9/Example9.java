// Using headMap(), tailMap() and subMap() Methods

import java.util.TreeMap;

class Example9 {

    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);

        System.out.println("TreeMap: " + numbers);

        System.out.println("\nUsing headMap():");
        
        // Using headMap() with default boolean value
        System.out.println("Without boolean value: " + numbers.headMap("Fourth"));

        // Using headMap() with specified boolean value
        System.out.println("With boolean value: " + numbers.headMap("Fourth", true));

        System.out.println("\nUsing tailMap():");

        // Using tailMap() with default boolean value
        System.out.println("Without boolean value: " + numbers.tailMap("Second"));
        
        // Using tailMap() with specified boolean value
        System.out.println("With boolean value: " + numbers.tailMap("Second", false));

        System.out.println("\nUsing subMap():");

        // using subMap() with default boolean value
        System.out.println("Without boolean value: " + numbers.subMap("Fourth", "Third"));

        // Using subMap() with specified boolean value
        System.out.println("With boolean value: " + numbers.subMap("Fourth", false, "Third", true));

    }

}
