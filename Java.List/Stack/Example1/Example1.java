// push() method

import java.util.Stack;

class Example1 {

    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

    }

}
