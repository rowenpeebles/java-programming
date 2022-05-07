// Access HashMap Elements

import java.util.HashMap;

class Example3 {

    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();

        // Adding elements to hashmap
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");

        System.out.println("HasmMap: " + languages);

        // Using get() method
        String value = languages.get(1);
        System.out.println("Value at index 1: " + value);

    }

}
