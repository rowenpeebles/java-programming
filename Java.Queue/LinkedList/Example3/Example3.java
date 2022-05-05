// Access LinkedList Elements

import java.util.LinkedList;

class Example3 {

    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        // Add elements in the linked list
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");

        System.out.println("LinkedList: " + languages);

        // get the element from the linked list
        String str = languages.get(1);
        System.out.println("Element at index 1: " + str);

    }

}
