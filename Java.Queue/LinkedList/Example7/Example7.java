// LinkedList as Deque

import java.util.LinkedList;
import java.util.Deque;

class Example7 {

    public static void main(String[] args) {

        Deque<String> animals = new LinkedList<>();

        // Add element at the beginning 
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);

        // Add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        // Remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        // remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(); " + animals);

    }

}
