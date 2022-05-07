// Remove HashMap Elements

import java.util.HashMap;

class Example5 {

    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Pythin");
        languages.put(3, "JavaScript");

        System.out.println("HasMap: " + languages);

        // Remove element associated with key 2
        String value = languages.remove(2);
        System.out.println("Removed Value: " + value);

        System.out.println("Updated HashMap: " + languages);

    }

}
