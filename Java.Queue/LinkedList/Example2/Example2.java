// Add Elements to a LinkedList

import java.util.LinkedList;

class Example2 {

    public static void main(String[] args) {

        // Create a linked list
        LinkedList<String> animals = new LinkedList<>();

        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        
        System.out.println("LinkedList: " + animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);

    }

}
