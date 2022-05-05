// ArrayDeque as a Stack

import java.util.ArrayDeque;

class Example9 {

    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        // Add elemets to stack
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Horse");

        System.out.println("Stack: " + stack);

        // Access element from the top of stack
        String element = stack.peek();
        System.out.println("Accessed Element: " + element);

        // Remove elements from the top of stack
        String remElement = stack.pop();
        System.out.println("Removed Element: " + remElement);

    }

}
