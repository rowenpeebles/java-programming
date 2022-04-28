// Access ArrayList Elements

import java.util.ArrayList;

class Example2 {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        // Add elements in the array list
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");

        System.out.println("ArrayList: " + animals);

        // get the element from the array list
        String str = animals.get(1);
        System.out.println("Element at inded 1: " + str);

    }

}
