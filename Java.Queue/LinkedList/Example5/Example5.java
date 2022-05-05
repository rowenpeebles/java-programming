// Remove element from a LinkedList

import java.util.LinkedList;

class Example5 {

    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        // Add elements in LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("LinkedList: " + languages);

        // Remove elements from index 1
        String str = languages.remove(1);
        System.out.println("Removed Element: " + str);
        System.out.println("Updated LinkedList: " + languages);

    }

}  
