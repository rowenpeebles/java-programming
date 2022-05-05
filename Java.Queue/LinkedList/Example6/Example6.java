// Java LinkedList as Queue

import java.util.LinkedList;
import java.util.Queue;

class Example6 {

    public static void main(String[] args) {

        Queue<String> languages = new LinkedList<>();

        // Add elements
        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        System.out.println("LinkedList: " + languages);

        // Access the first element 
        String str1 = languages.peek();
        System.out.println("Accessed Element: " + str1); 

        // Access and remove the first element 
        String str2 = languages.poll();
        System.out.println("Removed Element: " + str2);
        System.out.println("LinkedList after poll(): " + languages);

        // Add element at the end
        languages.add("Swift");
        System.out.println("LinkedList after offer(): " + languages);

    }

}
