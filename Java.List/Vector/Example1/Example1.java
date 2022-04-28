// Add Elements to Vector

import java.util.Vector;

class Example1 {

    public static void main(String[] args) {

        // Creating a vector
        Vector<String> mammals = new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Cat");

        // Using index number
        mammals.add(2, "Horse");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");
        animals.addAll(mammals);

        System.out.println("New Vector: " + animals);

    }

}
