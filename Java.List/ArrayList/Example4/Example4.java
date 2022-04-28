// Remove ArrayList Elements

import java.util.ArrayList;

class Example4 {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        // Add elements in the array list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // Display array list
        System.out.println("ArrayList: " + animals);

        // Remove element from index 2
        String str = animals.remove(2);

        System.out.println("Updated ArrayList: " + animals);
        System.out.println("Removed Element: " + str);

    }

}
