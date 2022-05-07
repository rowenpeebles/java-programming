// Change a HashMap value

import java.util.HashMap;

class Example4 {

    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");

        System.out.println("Original HashMap: " + languages);

        // Change element with key 2
        languages.replace(2, "C++");
        System.out.println("HashMap using replace(): " + languages);

    }

}
