// Remove elements using the poll(), pollFirst() and pollLast() method

import java.util.ArrayDeque;

class Example6 {

    public static void main(String[] args) {

        ArrayDeque<String> animals = new ArrayDeque<>();
        
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");

        System.out.println("ArrayDeque: " + animals);

        // Using poll()
        String element = animals.poll();
        System.out.println("Removed Element: " + element);
        System.out.println("New ArrayDeque: " + animals);

        // using pollFirst()
        String firstElement = animals.pollFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Using pollLast()
        String lastElement = animals.pollLast();
        System.out.println("Removed Last Element: " + lastElement);

        System.out.println("Final ArrayDeque: " + animals);

    }

}
