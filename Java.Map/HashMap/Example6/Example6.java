// Iterate through a HashMap

import java.util.HashMap;
import java.util.Map.Entry;

class Example6 {

    public static void main(String[] args) {
        
        // Creating a HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");

        System.out.println("HashMap: " + languages);

        // Iterate through keys only
        System.out.println("Keys: ");
        for (Integer key : languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // Iterate through values only
        System.out.println("\nValues: " );
        for (String value : languages.values()) {
            System.out.print(value);
            System.out.print(", ");
        }

        // Iterate through key/value entries
        System.out.println("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

    }

}
