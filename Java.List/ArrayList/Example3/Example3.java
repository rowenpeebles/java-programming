// Change ArrayList Elements

import java.util.ArrayList;

class Example3 {
    
    public static void main(String[] args) {
        
        ArrayList<String> languages = new ArrayList<>();

        // Add elements in the array list
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("C++");

        System.out.println("ArrayList: " + languages);

        // Change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);
    }
}

