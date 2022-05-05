// Change Elements of a LinkedList

import java.util.LinkedList;

class Example4 {

    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        // Add elements in the linked list
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);

        // Change elements at index 3
        languages.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languages);

    }

}
